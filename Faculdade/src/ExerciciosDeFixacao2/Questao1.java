/*
    O dia da semana para uma data qualquer pode ser calculado pela seguinte fórmula:  
    DIA DA SEMANA = RESTO ((TRUNCA(2,6 * M – 0,1) + D + A + QUOCIENTE(A, 4) + 
    QUOCIENTE(S, 4) – 2 * S), 7)  
    Onde:  
    M – representa o número do mês. Janeiro e fevereiro são os meses 11 e 12 do ano 
    precedente, março é o mês 1 e dezembro é o mês 10; 
    D – representa o dia do mês; 
    A – representa o número formado pelos dois últimos algarismos do ano; 
    S – representa o número formado pelos dois primeiros algarismos do ano.  
    Os dias da semana são numerados de zero a seis (domingo corresponde a 0, segunda a 
    1, e assim por diante).  
    Fazer um programa na Linguagem Java que: determine o dia da semana correspondente 
    a data lida, segundo o método especificado, onde: RESTO, TRUNCA e QUOCIENTE são 
    funções a serem programadas. Ao final o programa deverá escrever a data lida e o dia 
    da semana calculado.
*/
package ExerciciosDeFixacao2;
import java.time.Month;
import javax.swing.JOptionPane;
public class Questao1 {
   public static float Rst (float num){
        return num % 7;
    }
   public static float Trnk (int mes){
       return 2.6f * (mes+2) - 0.1f;
    }
   public static int Quo (int num, int fator){
        return num/fator;
    }
   public static String DiaSemana (int Value){
       String DSemana;
       DSemana = switch (Value) {
           case 1 -> "Segunda-Feira";
           case 2 -> "Terça-Feira";
           case 3 -> "Quarta-Feira";
           case 4 -> "Quinta-Feira";
           case 5 -> "Sexta-Feira";
           case 6 -> "Sábado";
           default -> "Domingo";
       };
       return DSemana;
   }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "CALCULADOR DE DIA DA SEMANA");
        String data = JOptionPane.showInputDialog(null, "Insira uma data valida (dd/mm/aaaa): ");
        String Dstr = data.substring(0, 2);
        String Mstr = data.substring(3, 5);
        String Astr = data.substring(6, 8);
        String Sstr = data.substring(8, 10);
        int D = Integer.parseInt(Dstr);
        int M = Integer.parseInt(Mstr);
        int A = Integer.parseInt(Astr);
        int S = Integer.parseInt(Sstr);
        float result = Rst(Trnk(M)+D+A+Quo(A, 4)+ Quo(S,4)-2 * S);
        int intResult = (int) result;
        JOptionPane.showMessageDialog(null,DiaSemana(intResult) + ", dia " + D + " de " + Month.of(M).name() + " de " + (A*100 + S));
    }
    
}
