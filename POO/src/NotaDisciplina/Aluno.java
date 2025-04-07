/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NotaDisciplina;

/**
 *
 * @author lucas
 */
public class Aluno {
    int matricula;
    String nome;
    float nota1;
    float nota2;
    float notaTrabalho;
    

    public float media(){
        float MF;
        MF = ((2.5f*nota1) + (2.5f*nota2) + (2.0f*notaTrabalho))/7;
        return MF;
    }
    public float rec(){
        float rec = (6*2)-media();
        return rec;
    }
     public String dados(){
         String result;
         String padrao = "dados do aluno:\n\nnome: "+nome+"\nid: " +matricula+ "\nnota 1: "+nota1+ "\nnota 2: " +nota2+ "\nnotaTrabalho: " +notaTrabalho+ "\n Media Final: "+media();
         String recuperacao = "\nNecssária recuperação?: SIM\nNota necessaria na recuperação: " + rec();
         
        if(media()<6.0f){
            result = padrao + recuperacao;
        } else {
            result = padrao;
        }
        
         return result;
        
     }
        
}
