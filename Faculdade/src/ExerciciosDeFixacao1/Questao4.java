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
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crie um programa na linguagem Java para calcular o valor da prestação de um imóvel 
        financiado (utilize juros simples, Fórmula: J = C × i × t, onde: J = juros simples; C = capital 
        inicial; i = taxa de juros; t = tempo da aplicação). 
        */
        int anos;
        float C, i, t, parcela;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor do imovel: ");
        C = sc.nextFloat();
        System.out.print("Insira o tempo que vai financiar o imovel em anos: ");
        anos = sc.nextInt();
        t = anos * 12;
        System.out.print("Insira a taxa de juros do financiamento em decimal: ");
        i = sc.nextFloat();
        
        parcela = (C + (C * i * t))/t;
        System.out.println("voce pagara: " + t + " parcelas de R$" + parcela);
        
        
    }
    
}
