/*
    4. Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe
    deverá:
        a) Representar uma data usando três atributos: o dia, o mês, e o ano.

        b) Ter um construtor que inicializa os três atributos e verifica a validade dos
        valores fornecidos.

        c) Fornecer um construtor sem parâmetros que inicializa a data com a data
        atual fornecida pelo sistema operacional.

        d) Fornecer um método set e um get para cada atributo.

        e) Fornecer o método toString para retornar uma representação da data como
        String. Considere que a data deve ser formatada mostrando o dia, o mês e o
        ano separados por barra (/).

        f) Fornecer uma operação para avançar uma data para o dia seguinte.

        g) Fornecer um método para comparar duas datas e retorne: 0, se as datas
        forem iguais; 1, se o primeiro parâmetro for maior que o segundo; -1, se o
        segundo parâmetro for maior que o primeiro.

        h) Fornecer uma operação para verificar se um ano é ou não bissexto.
        Escreva um aplicativo de teste que demonstra as capacidades da classe
        package Data;
*/
package Data;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ConsultaData {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        boolean loop = true;
        Data[] datas = new Data[10];
        while(loop){
            JOptionPane.showMessageDialog(null, "Comparador de datas...");
            Object[] options = {"Nova Data", "Comparar Datas", "Sair"}; 
            int menu = JOptionPane.showOptionDialog(null,
                    "Oque deseja fazer?",
                    "Pagina Inicial",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            if(menu == 2){
                JOptionPane.showMessageDialog(null, "Obrigado por participar...");
                loop = false;
            } else if(menu == 1) {
                JOptionPane.showMessageDialog(null, "a seguir escolha uma das datas para o primeiro parametro....");
                boolean loop2 = true;
                while(loop2){
                    Object[] datasDisp = datas;
                    
                    
                    
                    
                    
                    
                    
                }
            }
            
            
            
            
            
            
            
            
        }
        
    }
    
}
