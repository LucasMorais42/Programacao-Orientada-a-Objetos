
import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int identificacao;
        int opcao;
        String titulo;
        
        System.out.println("Informe a identificação do livro");
        identificacao = entrada.nextInt();
        
        System.out.println("Informe o titulo do livro");
        titulo = entrada.next();
        
        Livro livro_1 = new Livro(identificacao, titulo);
        
        System.out.println("Informe o valor da multa diaria");
        livro_1.setValMultaDiaria(entrada.nextDouble());
        
        do{
            System.out.println();
            System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opcao: ");
            opcao = entrada.nextInt();
            
            if (opcao==1){
                System.out.print("\nIdentificacação: " + livro_1.getIdentificacao() + "\nTítulo: " + 
                        livro_1.getTitulo() + "\nSituação: ");
                if(livro_1.getSituacao())
                    System.out.print("Emprestado");
                else  
                    System.out.print("Disponível");
                }
            
            else if(opcao==2) 
               livro_1.emprestar();
           
            else if(opcao==3){
                System.out.println("Informe a quantidade de dias atrasado: ");
                int dias_de_atraso = entrada.nextInt();
                double valor_a_pagar = livro_1.devolver(dias_de_atraso);
                if(valor_a_pagar>0.0)
                    System.out.println("Valor a pagar é de: " + valor_a_pagar);
                else
                    System.out.println("Não há necessidade de pagar nenhum valor");
            }
            
            else if(opcao==4)
                System.out.println("Saindo do sistema....");
            
            else
                System.out.println("Digite um valor válido (1 a 4)");
                
            
        }while(opcao!=4);
        
    }
}
