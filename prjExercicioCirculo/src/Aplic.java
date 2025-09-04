/**
 *
 * @author Nicolas Ap
 */

import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        
        double medRaio;
        int opcao;
        Circulo objCirc = new Circulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a medida do raio do círculo: ");
        medRaio = entrada.nextDouble();
        objCirc.setRaio(medRaio);
        
        do{
            System.out.println("1. Consultar medida da área");
            System.out.println("2. Consultar medida do perímetro");
            System.out.println("3. Consultar medida do diâmetro");
            System.out.println("4. Encerrar");
            
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();
            
            if(opcao==1){
                System.out.println("A medida da área do círculo é de: " + objCirc.calcArea());
            }
            else if (opcao==2){
                System.out.println("A medida do perímetro do círculo é de: " + objCirc.calcPerimetro());
            }
            else if (opcao==3){
                System.out.println("A medida do do diâmetro do círculo é de: " + objCirc.calcDiametro());
            }
            else{
                System.out.println("Encerrando o sistema!!!");
            }
            
        }while(opcao<4);
        
        
        entrada.close();
        
    }
    
}
