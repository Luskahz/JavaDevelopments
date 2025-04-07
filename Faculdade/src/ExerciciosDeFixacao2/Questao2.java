/*
    Grande parte dos programas de computador trabalham com data, que deve ser validada 
    para que o usuário não coloque datas que não existam como 31/04/2008, 12/14/2009 
    ou 43/05/2000. Faça um programa em Java para imprimir se a data é válida ou não. 
    Considerar também a ocorrência de anos bissextos, sabendo que: um ano é bissexto se 
    for divisível por 400, ou por 4 e não o for por 100. 
*/
package ExerciciosDeFixacao2;
import javax.swing.JOptionPane;

public class Questao2 {
    public static int[] Destr(String data){
        String Dstr = data.substring(0, 2);
        String Mstr = data.substring(3, 5);
        String Astr = data.substring(6, 10);
        int D = Integer.parseInt(Dstr);
        int M = Integer.parseInt(Mstr);
        int A = Integer.parseInt(Astr);
        int[] Data = {D,  M, A};
        return Data;
    }
    
    public static boolean ValidarData(int[] data){

        //inicialização
        int dia = data[0];
        int mes = data[1];
        int ano = data[2];
        if((dia < 1 || mes < 1 || ano < 1 || mes > 12)){
            return false;
        }
        boolean trinta = (mes == 4|| mes == 6 || mes == 9 || mes == 11);
        boolean bissexto = (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
        boolean fevereiro = (mes == 2);
        
        //validação
        if ((trinta && dia > 30) || (dia > 31)){
            return false;
        } else if (fevereiro){
            if ((bissexto) && (dia > 29)){
                return false;
            } else if ((!bissexto) && (dia > 28)){
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null, "VALIDADOR DE DATAS...");
         boolean Loop = true; 
         String date;
         while(Loop){
            date = JOptionPane.showInputDialog(null, "Insira uma data valida (dd/mm/aaaa): ");
                if(date == null){
                    Loop = false;
                }
            int[] Data = Destr(date);
            boolean result = ValidarData(Data);
            String ValidacaoData;
            if (result){
                ValidacaoData = "valida!";
            } else{
                ValidacaoData = "Invalida";
            }   
            JOptionPane.showMessageDialog(null, "a data inserida é...." + ValidacaoData);
            int Continuacao = JOptionPane.showConfirmDialog(null, "Gostaria de validar uma nova data?");
            Loop = switch (Continuacao) {
                 case JOptionPane.NO_OPTION -> false;
                 case JOptionPane.CANCEL_OPTION -> false;
                 default -> true;
             };
            }
    }
    
}
