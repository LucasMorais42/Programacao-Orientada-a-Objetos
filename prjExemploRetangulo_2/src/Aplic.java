/**
 *
 * @author Nicolas Ap
 */

import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        
        double medAlt, medBase;
        int opcao;
        Retangulo objRet;
        Scanner entrada;
        
        //Instanciação de um objeto da classe Scanner
        entrada = new Scanner(System.in);
        
        System.out.print("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble(); //scanf("%lf", &medAlt)
        
        System.out.print("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble(); //scanf("%lf", &medBase)
        
        //Instanciação de um objeto da classe Retângulo
        objRet = new Retangulo();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1. Consultar medida da área");
            System.out.println("2. Consultar medida do perímetro");
            System.out.println("3. Consultar medida da diagonal");
            System.out.println("4. Encerrar o sistema");
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt(); //scanf("%d", &opcao)
            
            if(opcao==1){
                System.out.println("\nA medida da área do retângulo é de: " + objRet.calcArea());
            }
            else if (opcao==2){
                System.out.println("\nA medida do perímetro do retângulo é de: " + objRet.calcPerimetro());
            }
            else if (opcao==3){
                System.out.println("\nA medida da diagonal do retângulo é de: " + objRet.calcDiagonal());
            }
            else{
                System.out.println("\nEncerrando o sistema!!!");
            }
            
        }while(opcao<4);
        
        
        entrada.close();
    }
    
}
