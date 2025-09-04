
import java.util.Scanner;

public class Aplic {

	public static void main(String[] args) {
		
		int option;
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o RA do aluno: ");
		aluno.setRA(sc.nextInt());
		
		System.out.println("Informe a primeira nota de trabalho do aluno: ");
		aluno.setNtTrab1(sc.nextDouble());
		
		System.out.println("Informe a segunda nota de trabalho do aluno: ");
		aluno.setNtTrab2(sc.nextDouble());
		
		System.out.println("Informe a nota da primeira prova: ");
		aluno.setNtPrv1(sc.nextDouble());

		System.out.println("Informe a nota da segunda prova: ");
		aluno.setNtPrv2(sc.nextDouble());
		
		do {
			System.out.println();
			System.out.println("1 - Exibir nota das Provas/Trabalhos");
			System.out.println("2 - Exibir Média dos Trabalhos/Provas");
			System.out.println("3 - Exibir Média Final");
			System.out.println("4 - Sair");
			System.out.print("\n\t\tDigite a opcao: ");
			option = sc.nextInt();
			
                        if(option==1){
                            System.out.println("RA do aluno: " + aluno.getRA());
                            System.out.println("Prova 1: " + aluno.getNtPrv1() + "\nProva 2: " + aluno.getNtPrv2()
                            + "\nTrabalho 1: " + aluno.getNtTrab1() + "\nTrabalho 2: " + aluno.getNtTrab2());
                        }
                        else if(option==2){
                            System.out.println("RA do aluno: " + aluno.getRA());
                            System.out.println("Média dos trabalhos: " + aluno.calcMediaTrab());
                            System.out.println("Média das provas: " + aluno.calcMediaProva());
                        }
                        else if(option==3){
                            System.out.println("RA do aluno: " + aluno.getRA());
                            System.out.println("Média final: " + aluno.calcMediaFinal());
                        }
                        else if(option==4){
                            System.out.println("Encerrando...");
                        }
                        else{
                            System.out.println("Opção inválida. Digite uma opção de 1 a 4");
                        }
                       
	}while(option!=4);

}
}
