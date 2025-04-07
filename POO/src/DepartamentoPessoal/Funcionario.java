/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoPessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dtEntrada;
    String RG;
    
    
    
    public void recebeAumento(float percentilAumento){
        percentilAumento = percentilAumento/100;
        this.salario = this.salario * (1.00f+percentilAumento);
        JOptionPane.showMessageDialog(null,"Salario aumentado em " + (percentilAumento*100)+"% novo salário: "+ this.salario);
    }
    
    public String calculaGanhoAnual(){
        return "O ganho anual do funcionario é R$" + (12 * this.salario);
    }
    
    public String dados(){
        return "Dados funcionario:\nNome: " + nome         +   
                "\nDepartamento: "           + departamento +
                "\nSalario: "                + salario      +
                "\nData de contratação: "    + dtEntrada    +
                "\nRG: "                     + RG;
    }
}
