package fatec.poo.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Morais
 */
public class Professor extends Pessoa {
    
    private int regFuncional;
    private double salario;

    public Professor(int regFuncional, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.regFuncional = regFuncional;
    }
        
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public int getRegFuncional(){
        return regFuncional;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public static void fazerTesteDeMesa(){
        int i =0;
        int j=0;
        while(i<10){
            while(j<30000){
                 JOptionPane.showMessageDialog(null, "Faça o TESTE DE MESA");
                 j++;
            }
           
            i++;
        }
    }
    
}
