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
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Faça um programa que leia um número inteiro positivo de três dígitos (de 100 até 999). 
        Gere outro número formado pelos dígitos invertidos do número lido.
        */
       
       int n, u, d, c; 
       Scanner sc = new Scanner(System.in);
       System.out.print("Insira um numero de 3 digitos: ");
       n = sc.nextInt();
       u = n % 10; //3 
       d = ((n % 100) - u)/10;//2
       c = (n - (u + d))/100; //1 
        
        System.out.println("o numero invertido é: " + u + d + c);
    }
    
}
