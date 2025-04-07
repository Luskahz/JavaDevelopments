package ExerciciosDeFixacao1;
import java.util.Scanner;
public class Questao6 {
    


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        float n1, n2;
        
        System.out.print("Insira o Primeiro numero: ");
        n1 = sc.nextFloat();
        System.out.print("Insira o Segundo numero: ");
        n2 = sc.nextFloat();
        
        System.out.println("OutPut:");
        System.out.println("");
        System.out.print("Adicao: ");
        System.out.println(n1 +  " + " + n2 + " = " + String.format("%.1f", adicao(n1, n2)));
        System.out.print("Subtracao: ");
        System.out.println(n1 +  " - " + n2 + " = " + String.format("%.1f", subtracao(n1, n2)));;
        System.out.print("Multiplicacao: ");
        System.out.println(n1 +  " * " + n2 + " = " + String.format("%.1f", multiplicacao(n1, n2)));;
        System.out.print("Divisao: ");
        System.out.println(n1 +  " / " + n2 + " = " + String.format("%.1f", divisao(n1, n2)));;
        
    }
    
    public static float adicao(float n1, float n2){
        return n1 + n2;
    }
    
    public static float subtracao(float n1, float n2){
        return n1 - n2;
    }
    
    public static float multiplicacao(float n1, float n2){
        return n1 * n2;
    }
    
    public static float divisao(float n1, float n2){
        return n1 / n2;
    }
    
}
