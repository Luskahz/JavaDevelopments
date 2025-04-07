/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package NotaDisciplina;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class ConsultaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        JOptionPane.showMessageDialog(null, "Criando um aluno: ");
        aluno.matricula = Integer.parseInt(JOptionPane.showInputDialog("matricula do aluno: "));
        aluno.nome = JOptionPane.showInputDialog("nome do aluno: ");
        aluno.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota da primeira prova: "));
        aluno.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota da segunda prova: "));
        aluno.notaTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Nota do trabalho: "));
        JOptionPane.showMessageDialog(null, aluno.dados());
        
    }
    
}
