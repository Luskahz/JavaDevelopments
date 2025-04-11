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
        int dataQuant = 0;
        boolean loop = true;
        Data[] datas = new Data[10];
        while(loop){
            Object[] options;
            if(dataQuant < 2){
               options = new Object[]{"Sair", "Nova Data"};
            } else{
               options = new Object[]{"Sair", "Nova Data", "Comparar datas"}; 
            }
            int menu = JOptionPane.showOptionDialog(null,
                    "Oque deseja fazer?\n\nDatas cadastradas: "+dataQuant,
                    "Pagina Inicial",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            switch (menu) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Obrigado por participar...");
                    loop = false;
                }
                
                case 1 -> {
                    boolean loop3 = true, loop4 = true, loop5 = true;
                    String a = null, m = null, d= null;
                    
                    while(loop3){
                        a = JOptionPane.showInputDialog(null, "Insira o valor do ANO(xxxx):", "Criando uma nova Data", JOptionPane.QUESTION_MESSAGE);
                        if(a == null){
                            loop3 = false;
                            break;
                        }
                    }
                        
                    while(loop3 && loop4){
                        m = JOptionPane.showInputDialog(null, "Insira o valor do MÊS(xx):", "Criando uma nova Data", JOptionPane.QUESTION_MESSAGE);
                        if(m == null){
                            loop4 = false;
                            break;
                        }
                    }
                    while(loop3 && loop4 && loop5){
                        d = JOptionPane.showInputDialog(null, "Insira o valor do DIA(xx):", "Criando uma nova Data", JOptionPane.QUESTION_MESSAGE);
                        if(d == null){
                            loop5 = false;
                            break;
                        }
                    }
                        if(a != null && m != null && d != null) {
                            try{
                                int A = Integer.parseInt(a);
                                int M = Integer.parseInt(m);
                                int D = Integer.parseInt(d);
                                Data novaData = new Data(D, M, A);
                                if(novaData.validaData()){
                                    JOptionPane.showMessageDialog(null, "Entrada valida, data cadastrada..");
                                    datas[dataQuant] = novaData;
                                    dataQuant++;
                                    loop3 = false;
                        } else{
                            
                        }
                            } catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "Insira apenas números válidos para o ano, mês e dia.");
                            }
                        } else {
                            
                        }
                        
                    }
                case 2 -> {
                    boolean loop2 = true;
                    int par1, par2;
                    while(loop2){
                        Object[] datasStr;
                        datasStr = new Object[dataQuant];
                        
                        for(int i = 0; i<dataQuant;i++){
                            if(datas[i] == null){
                                datasStr[i] = "---";
                            }else{
                                datasStr[i] = datas[i].DtString();
                            }
                        }
                        int selection1 = JOptionPane.showOptionDialog(null,
                                "Selecione a primeira data",
                                "Primeiro parametro da comparação",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                datasStr,
                                datasStr[0]);
                        
                            if(selection1 == JOptionPane.CLOSED_OPTION){
                                loop2 = false;
                            } else{
                                int selection2 = JOptionPane.showOptionDialog(null,
                                "Selecione a segunda data",
                                "Segundo parametro da comparação",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                datasStr,
                                datasStr[0]);    
                                if(selection2 == JOptionPane.CLOSED_OPTION){
                                }
                            par2 = selection2;
                                
                            }
                            par1 = selection1;
        }
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Obrigado por participar...");
                    loop = false;
                }
            }
        }
    }
}
