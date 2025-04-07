/*
    Fazer um programa na linguagem Java que leia dois arrays v1 e v2. Depois da leitura o 
    programa deverá incluir em v1 os elementos de v2 que não são iguais aos elementos 
    que já pertencem a v1. 
*/
package ExerciciosDeFixacao2;
import javax.swing.JOptionPane;

public class Questao7 {
    public static int[] Validacao(int[] v1, int[] v2){
        
        int contDiferentes=0;
        for(int i = 0;i < v2.length; i++){
            int cont = 0;
            for(int j = 0;j <  v1.length; j++){
                if(v2[i] != v1[j]){
                    
                } else{
                    cont++;
                    break;
                }
            }
            if(cont == 0){
                contDiferentes++;
                v1[(5 - 1)+contDiferentes]=v2[i];
            }
        }
        
    return v1;
    }
    public static void main(String[] args) {
    int[] vet1 = new int[10];
    int[] vet2 = new int[5];
    boolean loop = true;
    
     while(loop){
        JOptionPane.showMessageDialog(null,"Validador de vetores ");
        for(int i = 0; i < 5; i++ ){
        vet1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, " insira o" + i + "° valor do vet1"));
        }
        for(int i = 0; i < vet2.length; i++ ){
        vet2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, " insira o" + i + "° valor do vet2"));
        }
        vet1 = Validacao(vet1, vet2);
        JOptionPane.showMessageDialog(null, "o vetor obtido é:");
        String str = "";
        for(int i = 0; i< vet1.length; i++){
            str += vet1[i] + " ";
        }
        JOptionPane.showMessageDialog(null, str);
     }
     
    }
    
}
