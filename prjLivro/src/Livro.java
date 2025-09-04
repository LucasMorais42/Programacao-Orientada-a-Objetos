/**
 *
 * @author Suporte
 */
public class Livro {
    
   private int identificacao;
   private String titulo;
   private boolean situacao;
   private double valMultaDiaria;

    public Livro(int identificacao, String titulo) {
        this.identificacao = identificacao;
        this.titulo = titulo;
    }
    
    public void setValMultaDiaria(double valMultaDiaria){
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){
        if(getSituacao())
            System.out.println("O livro está emprestado");
        else 
            situacao=true;
        
    }
    
    public double devolver(int dias_atraso){
        if(!getSituacao()){ //situação = false
            System.out.println("O livro já está disponivel");
            return 0.0;
        }
     
        System.out.println("Operação de devolução realizada com sucesso");
        situacao = false;
        return dias_atraso * valMultaDiaria;
    }
    
    
    
   
   
}
