package fatec.poo.model;

/**
 *
 * @author Lucas Morais
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    
    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
}
