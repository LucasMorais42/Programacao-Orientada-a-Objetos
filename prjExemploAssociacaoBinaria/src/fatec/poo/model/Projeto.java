/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author LucasMorais
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numFunc;
    
    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.funcionarios = new Funcionario[5];
        this.numFunc = 0;
    }
    
    public void setDtInicio(String dtInicio){
        this.dtInicio = dtInicio;
    }
    
    public void setDtTermino(String dtTermino){
        this.dtTermino = dtTermino;
    }
    
    public String getDtInicio(){
        return dtInicio;
    }
    
    public String getDtTermino(){
        return dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public int getNumFunc(){
        return numFunc;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios[numFunc]= funcionario;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        for(int i=0; i<numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t" + funcionarios[i].getNome() + "\t" + funcionarios[i].getCargo() + "\t" + funcionarios[i].getDepartamento().getNome());
        }
    }
    
   
    
    
    
}
