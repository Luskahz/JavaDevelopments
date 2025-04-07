/*
    Desenvolva um programa que peça ao usuário para criar uma senha. Em seguida, 
    verifique se a senha atende aos critérios de segurança, como ter pelo menos 8 
    caracteres, conter pelo menos uma letra maiúscula, uma letra minúscula, um número e 
    um caractere especial. 
*/
package ExerciciosDeFixacao2;
import javax.swing.JOptionPane;

public class Questao5 {
    public static String BoolToStr(boolean valor){
       if (valor){
           return "OK!";
       }
       return "NOK";
    }

    public static boolean[] Validacao (String senha){
        char[] array = senha.toCharArray();
        boolean maiuscula = false, minuscula = false, num = false, especial = false, tamanho = false;
        if(senha.length() >= 8){
            tamanho = true;
        }
        for(int i = 0; i < array.length; i++){
            if(Character.isUpperCase(array[i])){
                maiuscula = true;
            }
            if(Character.isDigit(array[i])){
                num = true;
            }
            if(!(Character.isLetter(array[i]))&&!(Character.isDigit(array[i]))){
                especial = true;
            }
            if(Character.isLowerCase(array[i])){
                minuscula = true;
            }
        }
         boolean[] result = {tamanho, maiuscula, minuscula, num, especial};
        return result;
        // retorna o conjunto de verdadeiros e falsos das validações.
    }
    
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(null,"INSIRA UMA SENHA FORTE:", "Senha123!");
        boolean[] NivelSeguranca = Validacao(senha);
        JOptionPane.showMessageDialog(null, "A senha que vc inseriu peca nos seguintes requisitos minimos:");
            JOptionPane.showMessageDialog(null, "MAIOR QUE 8 CARACTERES? "+ BoolToStr(NivelSeguranca[0]));
            JOptionPane.showMessageDialog(null, "POSSUI AO MENOS 1 LETRA MAIUSCULA? "+ BoolToStr(NivelSeguranca[1]));
            JOptionPane.showMessageDialog(null, "POSSUI PELO MENOS 1 LETRA MINUSCULA? "+ BoolToStr(NivelSeguranca[2]));
            JOptionPane.showMessageDialog(null, "POSSUI PELOMENOS 1 NUMERO? "+ BoolToStr(NivelSeguranca[3]));
            JOptionPane.showMessageDialog(null, "POSSUI PELOMENOS 1 CARACTER ESPECIA? " + BoolToStr(NivelSeguranca[4]));


        
    }
    
}
