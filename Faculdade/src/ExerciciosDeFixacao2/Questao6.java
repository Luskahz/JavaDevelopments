/*
    Crie um programa na linguagem Java que some cada uma das posições de dois vetores, 
    conforme o exemplo abaixo, e armazene o resultado em um terceiro vetor. 
*/
package ExerciciosDeFixacao2;
import java.util.Scanner;
public class Questao6 {
    public static int[] Calc (int[][] vet){
        int [] vetR = new int[10];
        int [] sup = new int[5];
        for(int soma = 0; soma < 5; soma++){
            sup[soma] = vet[0][soma] + vet[1][soma];
        }
        
        for(int i = 4; i>=0; i--){
            vetR[i+5] = sup[i];
           }
        for(int i = 9; i>=0; i--){
            if(vetR[i]>9){
            vetR[i-1] = vetR[i-1] + vetR[i]/10;
            vetR[i] = vetR[i]%10;
           }
       }

        return vetR;
    }
    public static void main(String[] args) {
        int [][] vet = new int[2][5];

        Scanner sc = new Scanner(System.in);
        System.out.println("INSIRA A MATRIZ:");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5;j++){
                vet[i][j] = sc.nextInt();
            }
        }
        System.out.println("A matriz inserida foi: ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
                System.out.print(vet[i][j]);
                if(j == 4){
                    System.out.print("\n");
                }
            }
        }
        int[] R = Calc(vet);
        for(int i = 0; i<10;i++){
            System.out.print(R[i]+" ");
        }
    }
 
    
}
