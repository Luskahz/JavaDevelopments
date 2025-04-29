/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepPessoal;

/**
 *
 * @author lucas
 */
public class Administrativo extends Assistente{
    private String Turno;

    /**
     *
     * @param nome nome do funcionario
     * @param salario salario do funcionario
     * @param Matricula matricula do assistente
     * @param Turno turno administrativo (Turno noturno tem adicional noturno de 20% no salario)
     */
   public Administrativo(String nome, double salario, String Matricula, String Turno) {
        super(nome, salario, Matricula);
        this.Turno = Turno;
    }
    
   @Override
   public double calculaGanhoAnual(){
       double ganho = super.calculaGanhoAnual();
       if("noturno".equals(Turno)){
         return (ganho + (ganho)*0.2); 
       } else {
           return ganho; 
       }
    }
    
    @Override
    public String exibeDados() {
        return super.exibeDados() + "\nTurno: " + Turno + "%";
    }
    
    
    public String nomeToString(){
       return super.getNome();
    }
}
