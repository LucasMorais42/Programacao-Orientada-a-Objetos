
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
          
        Departamento dep1 = new Departamento ("CP", "Compras");
        Departamento dep2 = new Departamento ("RH", "Recursos Humanos");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Administrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionario horista: " + funcHor.getNome() + " trabalha no departamento de: " + funcHor.getDepartamento().getNome());
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionário mensalista: " + funcMen.getNome() + " trabalha no departamento de: " + funcMen.getDepartamento().getNome());
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionário comissionado: " + funcCom.getNome() + " trabalha no departamento de: " + funcCom.getDepartamento().getNome());
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        
        dep1.addFuncionario(funcMen);
        
        dep1.listarFuncionario();
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);
        
        dep2.listarFuncionario();
        
        
        //---------CÓDIGO DO EXERCICIO PROJETO
        Projeto proj1 = new Projeto(9999, "Desenvolvimento Agenda Fatec");
        proj1.setDtInicio("21/01/2024");
        proj1.setDtTermino("23/12/2025");
        System.out.println("Código: " + proj1.getCodigo());
        System.out.println("Descrição: " + proj1.getDescricao());
        System.out.println("Data Ínicio: " + proj1.getDtInicio());
        System.out.println("Data Término: " + proj1.getDtTermino());
        
        funcHor.setProjeto(proj1);
        proj1.addFuncionario(funcHor);
        
        funcMen.setProjeto(proj1);
        proj1.addFuncionario(funcMen);
        
        funcCom.setProjeto(proj1);
        proj1.addFuncionario(funcCom);
        
        System.out.println("Qtde. de Funcionários: "+ proj1.getNumFunc());
        
        System.out.println("Registro\tNome\tCargo\tDepartamento");
        proj1.listarFuncionarios();
    }    
}
