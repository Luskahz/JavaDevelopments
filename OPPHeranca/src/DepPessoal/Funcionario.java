/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepPessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Funcionario {
    private String nome; 
    private double salario;
    
    /**
     *
     * @param nome insira o nome do funcionario
     * @param salario passe o valor do salario do mesmo
     */
    protected Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario() {
       JOptionPane.showMessageDialog(null, "Voce só pode criar um funcionario caso defina o cargo");
    }
    
    /**
     *
     * @param percentilAumento refere-se ao valor em porcentagem cujo necessario para aumentar o salario do funcionario ex entrada: 30 (de 30%)
     */
    public void recebeAumento(float percentilAumento){
        percentilAumento = percentilAumento/100;
        this.salario = this.salario * (1.00f+percentilAumento);
        JOptionPane.showMessageDialog(null,"Salario aumentado em " + (percentilAumento*100)+"% novo salário: "+ this.salario);
    }
    
    /**
     *
     * @return retorna um valor double com o valor do ganho anual do funcionario, baseado no salario cadastrado
     */
    protected double calculaGanhoAnual(){
        return (12 * this.salario);
    }
    
    public String exibeDados(){
        return "Dados funcionario:\nNome: " + nome         +   
                "\nSalario: "                + salario;
    }

    
    //getters e setters 

    public String getNome(){ return nome; }
    public double getSalario(){ return salario; }
    private void setNome(String nome){ this.nome = nome; }
    private void setSalario(double salario){ this.salario = salario; }
   
    
    
    
    
    
    
}
