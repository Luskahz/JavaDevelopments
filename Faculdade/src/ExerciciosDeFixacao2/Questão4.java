/*
    Faça um algoritmo que pegue um número de 1 a 99 do teclado (ele deve impedir 
    entradas com valores fora da faixa). Depois o programa tenta "adivinhar" esse número, 
    sorteando valores quaisquer nessa faixa (entre 1 e 99 positivos) até que acerte, por 
    acaso, aquele dado pelo usuário; então imprima o número de chutes até acertar. OBS: 
    Utilizar a classe java.util.Random para geração de números aleatórios em Java.
*/
package ExerciciosDeFixacao2;
import java.util.Scanner;
import java.util.Random;

public class Questão4 {

    public static void main(String[] args) {
        int num, chute = 0, contChutes = 1;
        Scanner Sc = new Scanner(System.in);
        Random rand = new Random();
        boolean loop = true;
        while(loop){
            System.out.println("insira um valor entre 1 e 99");
            num = Sc.nextInt();
            if(num>0&&num<100){
                while (!(num == chute)){
                    chute = rand.nextInt(99)+1;
                    System.out.println(contChutes+"° tentativa, numero escolhido: "+ chute);
                    contChutes++;
                }
                System.out.println("O valor escolhido foi adivinhado no "+(contChutes-1)+"° chute da maquina...");
            }
            System.out.println("Valor invalido, insira um novo valor");
        }
 
    }
    
}
