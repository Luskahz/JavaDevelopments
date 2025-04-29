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
public class Assistente extends Funcionario{
    protected String Matricula;

    /**
     *
     * @param nome nome do funcionario
     * @param salario salario do funcionario 
     * @param Matricula matricula do assistente
     */
    protected Assistente(String nome, double salario, String Matricula) {
        super(nome, salario);
        this.Matricula = Matricula;
    }
    public Assistente(){
        JOptionPane.showMessageDialog(null, "Voce só pode criar um assistente caso defina a categoria");
    }

    @Override
    public String exibeDados(){
        return super.exibeDados()+ "\nMatricula: " + Matricula;
               
    }
    
    
    
    
    //Getters e Setters 
    private void setMatricula(String Matricula){ this.Matricula = Matricula; }
    public String getMatricula(){ return Matricula; }
    
    
    @Override
    public double calculaGanhoAnual(){
        return super.calculaGanhoAnual();
    }
    

}
