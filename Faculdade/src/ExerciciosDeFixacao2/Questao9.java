/*
    Em teoria de sistemas, define-se como elemento MINIMAX de uma matriz, o menor 
    elemento da linha que se encontra o maior elemento (o maior número contido na 
    matriz) da matriz. Observe o exemplo abaixo e fazer um programa na linguagem Java 
    para entrar com uma matriz quadrada de ordem n e dizer qual o MINIMAX. 
 */
package ExerciciosDeFixacao2;
import java.util.Scanner;

public class Questao9 {
    public static int max(int[][] matriz){
        int max = 0;
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j< matriz[i].length;j++){
                if(matriz[i][j] > max){
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }
    public static int minimax(int[][] matriz, int max){
        int linha = 0, minimax = Integer.MAX_VALUE;
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j< matriz[i].length;j++){
                if(matriz[i][j] == max){
                    linha = i;
                    break;
                }
            }
        }
        for(var i = 0; i<matriz.length;i++){
            if(matriz[linha][i]< minimax){
                minimax = matriz[linha][i];
                    }
                }
            return minimax;
        }


    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        String str = "";
        System.out.println("INSIRA OS VALORES DA MATRIZ 3X3");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = sc.nextInt();
                str += " " + matriz[i][j];
                if(j == matriz[i].length-1)
                str += "\n";
            }
        }
        System.out.println("Matriz inserida:");
        System.out.println(str);
        int max = max(matriz);
        int minimax = minimax(matriz, max);
        System.out.println("O MINIMAX da matriz é: " + minimax);
    }
    
}