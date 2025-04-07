/*
    Faça um algoritmo na linguagem Java que coloque em ordem crescente um vetor de 
    números inteiros.

 */
package ExerciciosDeFixacao2;
import javax.swing.JOptionPane;
public class Questao8 {
    public static int[] ordenacao(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length -1 - i; j++){
                int sup;
                if(arr[j]>arr[j+1]){
                    sup = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = sup;  
            }
            
            
            }
        }
        return arr;
    }

    public static void main(String[] args) {
      boolean loop = true;
      int[] arr = new int[5];
      String str = "", str1 = "";
      while(loop){
          JOptionPane.showMessageDialog(null, "ORGANIZADOR DE ARRAY");
          for(int i = 0; i<5; i++){
              int value = i+1;
              arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o valor " + value + " do array"));
              str += " " + arr[i];
          }
          
          JOptionPane.showMessageDialog(null, "ARRAY DESORGANIZADO: " + str);
          arr = ordenacao(arr);
          for(int i = 0; i< arr.length; i++){
              str1 += arr[i] + " ";
          }
        JOptionPane.showMessageDialog(null, "ARRAY ORGANIZADO: " + str1);
        str1 = "";
        str = "";
      }
              
}    
}
