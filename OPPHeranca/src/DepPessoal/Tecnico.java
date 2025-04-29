/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepPessoal;

/**
 *
 * @author lucas
 */
public class Tecnico extends Assistente {
    double Bonus;

    /**
     *
     * @param nome nome do funcionario
     * @param salario salario do funcionario
     * @param Matricula matricula do assistente
     * @param Bonus bonus salarial do Tecnico
     */
    public Tecnico(String nome, double salario, String Matricula, double Bonus) {
        super(nome, salario, Matricula);
        this.Bonus = Bonus;
        
    }

    

    @Override
    public String exibeDados() {
        return super.exibeDados() + "\nBonus: " + Bonus + "%";
    }
    
    
    @Override
    public double calculaGanhoAnual(){
       double ganho = super.calculaGanhoAnual();
           return ganho + (ganho*((Bonus/100)+1)); 
       }
    

    public String nomeToString(){
       return super.getNome();
    }

}
