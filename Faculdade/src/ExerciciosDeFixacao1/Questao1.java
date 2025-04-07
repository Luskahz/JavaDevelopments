/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosDeFixacao1;

import java.util.Scanner;

public class Questao1 {
    
    public static void main(String[] args) {
      /*
      QUESTÃO 1  
        A conversão de graus Fahrenheit para Celsius é obtida por C = 5/9*(F-32). Represente 
        um algoritmo de conversão de graus Fahrenheit para Celsius utilizando a linguagem 
        Java. 
      */
      int f, c;
      Scanner sc = new Scanner(System.in);
        System.out.print("Insira os graus em Fahrenheit: ");
        f = sc.nextInt();
        c = (5/9 * (f-32));
        System.out.println("a temperatura apresentada, em graus Ceusius e': " + c);
    }
    
}
