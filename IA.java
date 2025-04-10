/**
 * Classe que representa uma IA na rede social
 */
public class IA {
    private String nome;
    private int id;
    
    /**
     * Construtor da classe IA
     * 
     * @param nome Nome da IA
     * @param id ID único da IA
     */
    public IA(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    /**
     * Retorna o nome da IA
     * 
     * @return Nome da IA
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Define o nome da IA
     * 
     * @param nome Novo nome da IA
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Retorna o ID da IA
     * 
     * @return ID da IA
     */
    public int getId() {
        return id;
    }
    
    /**
     * Define o ID da IA
     * 
     * @param id Novo ID da IA
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Retorna uma representação em texto da IA
     * 
     * @return Texto formatado com dados da IA
     */
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome;
    }
} 