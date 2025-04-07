/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DepartamentoPessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class consultaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd = 2; //quantidade de funcionarios
        
        Funcionario[] func = new Funcionario[qtd];
        for(int i = 0; i<func.length ;i++){
            func[i] = new Funcionario();
        }
        for(int i = 0; i<func.length;i++){
            JOptionPane.showMessageDialog(null, "Construindo Funcionarios, funcionario " +(i+1));
            func[i].nome = JOptionPane.showInputDialog("Qual o nome do funcionario "+(i+1)+"?:");
            func[i].departamento = JOptionPane.showInputDialog("Qual o departamento do funcionário"+ (i+1) +"?:" );
            func[i].salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base do funcionário "+(i+1)+"?:"));
            func[i].dtEntrada = JOptionPane.showInputDialog("Qual a data de admissão do funcionário "+(i+1)+"?:");
            func[i].RG = JOptionPane.showInputDialog("Qual o RG do funcionário "+(i+1)+"?:");
        }
        boolean select = true;
        while(select){
            int i = (Integer.parseInt(JOptionPane.showInputDialog("escolha o funcionario para manipulação(disponível de 1 a " + (func.length)+"):"))) - 1;
            if(i == -1){
                JOptionPane.showMessageDialog(null, "Fim da manipulação");
                select = false;
            }
            JOptionPane.showMessageDialog(null, func[i].dados());
            int aumento = JOptionPane.showConfirmDialog(null, "Realizar aumento?", "Aumento Salarial", JOptionPane.YES_NO_OPTION);
                if (aumento == JOptionPane.YES_OPTION){
                    float valorAumento = Float.parseFloat(JOptionPane.showInputDialog("Qual o percential de aumento no salario? (salario atual"+ func[i].salario+")"));
                    func[i].recebeAumento(valorAumento);
                }
            JOptionPane.showMessageDialog(null, func[i].calculaGanhoAnual());
        }
        
        
        
    }
    
}
