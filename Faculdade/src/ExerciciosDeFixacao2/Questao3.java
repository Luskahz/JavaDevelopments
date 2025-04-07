/*
    Jokenpô é um jogo de sorte simples onde o jogador deve escolher entre pedra, tesoura 
    e papel. As regras são: Pedra ganha da tesoura (amassando-a ou quebrando-a). Tesoura 
    ganha do papel (cortando-o). Papel ganha da pedra (embrulhando-a). Crie um algoritmo 
    que simule esse jogo entre usuário e computador. OBS: Utilizar a classe 
    java.util.Random para geração de números aleatórios em Java. 
*/
package ExerciciosDeFixacao2;
import java.util.Random;
import javax.swing.JOptionPane;

public class Questao3 {
// pedra = 0, papel = 1, tesoura = 2;
    public static String Jogada(int jogador){
        String jogada;
        jogada = switch (jogador) {
            case 0 -> "Pedra";
            case 1 -> "Papel";
            default -> "Tesoura";
        };
        return jogada;
    }
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "JOKENPÔ...");
       int user, maquina, contlose = 0, contwin = 0, contEmp = 0, r;
       Random rand = new Random();
       boolean Loop = true;
       r = JOptionPane.showConfirmDialog(null, "Deseja começar o jogo?");
       if(r == JOptionPane.YES_OPTION){
           while(Loop){
           JOptionPane.showMessageDialog(null,"Escolha entre pedra papel ou tesoura...");
           user = JOptionPane.showOptionDialog(null, "Sua escolha: ", "jokenpô", 
                   JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
                   new Object[]{"Pedra", "Papel", "Tesoura"}, "Pedra");
           maquina = rand.nextInt(3);
           JOptionPane.showMessageDialog(null, "você escolheu: " + Jogada(user));
           JOptionPane.showMessageDialog(null,"JOOOO...KENNNN....PÔ!!");
           if(user == maquina){
               JOptionPane.showMessageDialog(null, "Houve um Empate a maquina escolheu "+Jogada(maquina));
               contEmp++; 
           } else if (((user == 0)&&(maquina == 2))||((user == 1)&&(maquina == 0))||((user == 2)&&(maquina == 1))){
               JOptionPane.showMessageDialog(null, "Você venceu! a maquina escolheu "+ Jogada(maquina));
               contwin++;
           } else {
               JOptionPane.showMessageDialog(null, "Você perdeu... a maquina escolheu "+Jogada(maquina));
               contlose++;
           }
           JOptionPane.showMessageDialog(null,"Você ganhou "+ contwin +"x, perdeu " + contlose +"x, e houveram "+ contEmp +" Empates");
           r = JOptionPane.showOptionDialog(null, "Deseja continuar o jogo?", "Decisão", 
           JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
           new Object[]{"Sim", "Não"}, "Pedra");      
           
           Loop = r == JOptionPane.YES_OPTION;
           
       }
       } else {
           JOptionPane.showMessageDialog(null,"OBRIGADO POR JOGAR.");
       }
       
       JOptionPane.showMessageDialog(null,"OBRIGADO POR JOGAR.");
    }
    
}
