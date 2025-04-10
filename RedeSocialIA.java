import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal que gerencia a Rede Social de IAs
 */
public class RedeSocialIA {
    
    private static ArrayList<IA> ias = new ArrayList<>();
    private static ArrayList<Publicacao> publicacoes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int proximoIdPublicacao = 1;
    
    public static void main(String[] args) {
        int opcao = 0;
        
        System.out.println("Bem-vindo à Rede Social de IAs!");
        
        do {
            exibirMenu();
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                
                switch (opcao) {
                    case 1:
                        cadastrarIA();
                        break;
                    case 2:
                        cadastrarPublicacao();
                        break;
                    case 3:
                        curtirPublicacao();
                        break;
                    case 4:
                        listarIAs();
                        break;
                    case 5:
                        listarPublicacoes();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
            
            System.out.println(); // Linha em branco para melhor visualização
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    /**
     * Exibe o menu de opções do sistema
     */
    private static void exibirMenu() {
        System.out.println("\n==== MENU ====");
        System.out.println("1 - Cadastrar IA");
        System.out.println("2 - Fazer Publicação");
        System.out.println("3 - Curtir Publicação");
        System.out.println("4 - Listar IAs Cadastradas");
        System.out.println("5 - Listar Publicações");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    /**
     * Cadastra uma nova IA no sistema
     */
    private static void cadastrarIA() {
        System.out.println("\n==== CADASTRO DE IA ====");
        
        System.out.print("Digite o ID da IA: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        // Verificar se o ID já existe
        for (IA ia : ias) {
            if (ia.getId() == id) {
                System.out.println("Erro: ID já existe no sistema.");
                return;
            }
        }
        
        System.out.print("Digite o nome da IA: ");
        String nome = scanner.nextLine();
        
        IA novaIA = new IA(nome, id);
        ias.add(novaIA);
        
        System.out.println("IA cadastrada com sucesso!");
    }
    
    /**
     * Cadastra uma nova publicação no sistema
     */
    private static void cadastrarPublicacao() {
        System.out.println("\n==== NOVA PUBLICAÇÃO ====");
        
        if (ias.isEmpty()) {
            System.out.println("Erro: Não existem IAs cadastradas no sistema.");
            return;
        }
        
        System.out.print("Digite o ID da IA autora: ");
        int idAutor = Integer.parseInt(scanner.nextLine());
        
        // Verificar se a IA existe
        boolean iaExiste = false;
        for (IA ia : ias) {
            if (ia.getId() == idAutor) {
                iaExiste = true;
                break;
            }
        }
        
        if (!iaExiste) {
            System.out.println("Erro: IA não encontrada.");
            return;
        }
        
        System.out.print("Digite o texto da publicação: ");
        String texto = scanner.nextLine();
        
        Publicacao novaPublicacao = new Publicacao(proximoIdPublicacao, texto, idAutor);
        publicacoes.add(novaPublicacao);
        proximoIdPublicacao++;
        
        System.out.println("Publicação realizada com sucesso! ID da publicação: " + (proximoIdPublicacao - 1));
    }
    
    /**
     * Adiciona uma curtida a uma publicação existente
     */
    private static void curtirPublicacao() {
        System.out.println("\n==== CURTIR PUBLICAÇÃO ====");
        
        if (publicacoes.isEmpty()) {
            System.out.println("Erro: Não existem publicações no sistema.");
            return;
        }
        
        System.out.print("Digite o ID da publicação que deseja curtir: ");
        int idPublicacao = Integer.parseInt(scanner.nextLine());
        
        // Procurar a publicação
        boolean encontrou = false;
        for (Publicacao publicacao : publicacoes) {
            if (publicacao.getId() == idPublicacao) {
                publicacao.curtir();
                System.out.println("Publicação curtida com sucesso!");
                encontrou = true;
                break;
            }
        }
        
        if (!encontrou) {
            System.out.println("Erro: Publicação não encontrada.");
        }
    }
    
    /**
     * Lista todas as IAs cadastradas no sistema
     */
    private static void listarIAs() {
        System.out.println("\n==== LISTA DE IAs CADASTRADAS ====");
        
        if (ias.isEmpty()) {
            System.out.println("Não existem IAs cadastradas no sistema.");
            return;
        }
        
        for (IA ia : ias) {
            System.out.println(ia);
        }
    }
    
    /**
     * Lista todas as publicações no sistema com informações detalhadas
     */
    private static void listarPublicacoes() {
        System.out.println("\n==== LISTA DE PUBLICAÇÕES ====");
        
        if (publicacoes.isEmpty()) {
            System.out.println("Não existem publicações no sistema.");
            return;
        }
        
        for (Publicacao publicacao : publicacoes) {
            // Buscar o nome da IA autora
            String nomeAutor = "Desconhecido";
            for (IA ia : ias) {
                if (ia.getId() == publicacao.getIdAutor()) {
                    nomeAutor = ia.getNome();
                    break;
                }
            }
            
            System.out.println("ID: " + publicacao.getId() + 
                    " | Autor: " + nomeAutor + 
                    " | Curtidas: " + publicacao.getCurtidas() + 
                    " | Texto: " + publicacao.getTexto());
        }
    }
} 