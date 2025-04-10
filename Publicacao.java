/**
 * Classe que representa uma publicação na rede social
 */
public class Publicacao {
    private String texto;
    private int idAutor;
    private int curtidas;
    private int id;
    
    /**
     * Construtor da classe Publicacao
     * 
     * @param id ID único da publicação
     * @param texto Conteúdo da publicação
     * @param idAutor ID da IA que criou a publicação
     */
    public Publicacao(int id, String texto, int idAutor) {
        this.id = id;
        this.texto = texto;
        this.idAutor = idAutor;
        this.curtidas = 0; // Inicia com zero curtidas
    }
    
    /**
     * Adiciona uma curtida à publicação
     */
    public void curtir() {
        this.curtidas++;
    }
    
    /**
     * Retorna o texto da publicação
     * 
     * @return Texto da publicação
     */
    public String getTexto() {
        return texto;
    }
    
    /**
     * Define o texto da publicação
     * 
     * @param texto Novo texto da publicação
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /**
     * Retorna o ID do autor da publicação
     * 
     * @return ID do autor
     */
    public int getIdAutor() {
        return idAutor;
    }
    
    /**
     * Define o ID do autor da publicação
     * 
     * @param idAutor Novo ID do autor
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    
    /**
     * Retorna o número de curtidas da publicação
     * 
     * @return Número de curtidas
     */
    public int getCurtidas() {
        return curtidas;
    }
    
    /**
     * Define o número de curtidas da publicação
     * 
     * @param curtidas Novo número de curtidas
     */
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    /**
     * Retorna o ID da publicação
     * 
     * @return ID da publicação
     */
    public int getId() {
        return id;
    }
    
    /**
     * Define o ID da publicação
     * 
     * @param id Novo ID da publicação
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Retorna uma representação em texto da publicação
     * 
     * @return Texto formatado com dados da publicação
     */
    @Override
    public String toString() {
        return "ID: " + id + " | Autor: " + idAutor + " | Curtidas: " + curtidas + " | Texto: " + texto;
    }
} 