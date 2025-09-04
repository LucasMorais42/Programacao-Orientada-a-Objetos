import fatec.poo.model.*;
/**
 *
 * @author aluno
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno objAlu = new Aluno(101, "Lucas Morais", "26-03-2004");
        objAlu.setMensalidade(1500);
        
        System.out.println("Registro Escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
        //Professor.fazerTesteDeMesa();
        
        
        Professor objPro = new Professor(102, "Dimas", "21-01-1980");
        objPro.setSalario(1200.50);
        System.out.println("Registro Funcionário: " + objPro.getRegFuncional());
        System.out.println("Nome: " + objPro.getNome());
        System.out.println("Data de Nascimento: " + objPro.getDataNascimento());
        System.out.println("Salário: " + objPro.getSalario());
    }
    
}
