/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosDeFixacao1;

 import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        O prêmio da loteria é dividido em três fatias: sena fica com 60%, quina fica com 30% e 
        quadra fica com 10%. Crie um programa na linguagem Java para calcular quanto cada 
        apostador ganhará.
        */
        
        float premio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor total do premio: ");
        premio = sc.nextFloat();
        System.out.println("o premio da sena fica com 60% do premio: " + (premio * 0.6));
        System.out.println("o premio da quina fica com 30% do premio: " + (premio * 0.3));
        System.out.println("o premio da quadra fica com 10% do premio: " + (premio * 0.1));
    }
    
}
