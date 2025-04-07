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
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Faça um programa na linguagem Java que leia a idade de uma pessoa expressa em anos, 
        meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e 
        o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
        */
    int a, m, d, tot;
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos anos inteiros voce tem?: ");
    a = sc.nextInt();
    System.out.print("Quantos meses inteiros voce tem?: ");
    m = sc.nextInt();
    System.out.print("Quantos dias inteiros voce tem?: ");
    d = sc.nextInt();
    tot = ((a * 365) + (m * 30) + d);
    System.out.println("Sua idade em dias e' de: " + tot);
    }
    
}
