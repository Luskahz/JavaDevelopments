/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DepPessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class classRH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd = 10, contAdm=0, contTec=0, contFunc = 0;
        Administrativo[] administrativo = new Administrativo[qtd];
        Tecnico[] tecnico = new Tecnico[qtd];
        boolean loop = true;

        while(loop){
            Object[] options;
            if(contFunc == 0){
               options = new Object[]{"Sair", "Novo Funcionário"}; 
            } else {
               options = new Object[]{"Sair", "Novo Funcionário" ,"Gerenciar Funcionários"}; 
            }
            int menu = JOptionPane.showOptionDialog(null,
                    "Oque deseja fazer?\n\nFuncionarios cadastradas: "+contFunc,
                    "Pagina Inicial",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            
            switch (menu){
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Obrigado por participar...");
                    loop = false;
                }
                case 1 ->{
                    boolean loop2=true;
                    while(loop2){
                        boolean loop3=true;
                        Object[] Categorias = new Object[]{"Administrativo", "Técnico"};
                        Integer.parseInt("1");
                          String nome = null;
                            while (nome == null || nome.trim().isEmpty()) {
                                nome = JOptionPane.showInputDialog(null, "Insira o nome do Novo Funcionário:");
                                if (nome == null) return; // Se cancelar, sai do case
                            }
                          Double salario = null;
                            while (salario == null) {
                                try {
                                    String salarioStr = JOptionPane.showInputDialog(null, "Insira o salário base do Novo Funcionário:");
                                    if (salarioStr == null) return; // Se cancelar, sai do case
                                    salario = Double.parseDouble(salarioStr);
                                    if (salario < 0) {
                                        JOptionPane.showMessageDialog(null, "O salário não pode ser negativo.");
                                        salario = 1.00;
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido para salário. Insira um número válido.");
                                }
                            }
                            String matricula = null;
                                while (matricula == null || matricula.trim().isEmpty()) {
                                    matricula = JOptionPane.showInputDialog(null, "Insira a matrícula do Novo Assistente:");
                                    if (matricula == null) return; // Se cancelar, sai do case
                                }

                        while(loop3){
                            int categ = JOptionPane.showOptionDialog(null,
                                    "Qual a categoria do assistente?",
                                    "Categoria", 
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    Categorias,
                                    Categorias[0]);
                            switch (categ){
                                case 0 -> {
                                    // Administrativo: precisa de Turno
                                    String turno = null;
                                    while (turno == null || turno.trim().isEmpty()) {
                                        turno = JOptionPane.showInputDialog(null, "Insira o turno do novo Assistente Administrativo:");
                                        if (turno == null) return; // Se cancelar, sai do case
                                        administrativo[contAdm] = new Administrativo(nome, salario, matricula, turno);
                                        contAdm++;
                                        contFunc++;
                                    }
                                    loop3 = false; // Sai do loop da categoria
                                }
                                case 1 -> {

                                    Double bonus = null;
                                    while (bonus == null) {
                                        try {
                                            String bonusStr = JOptionPane.showInputDialog(null, "Insira o primeiro bônus anual do Novo Assistente Técnico:");
                                            if (bonusStr == null) return; // Se cancelar, sai do case
                                            bonus = Double.parseDouble(bonusStr);
                                            tecnico[contTec] = new Tecnico(nome, salario, matricula, bonus);
                                            contTec++;
                                            contFunc++;
                                            if (bonus < 0) {
                                                JOptionPane.showMessageDialog(null, "O bônus não pode ser negativo.");
                                                bonus = null;
                                            }
                                        } catch (NumberFormatException e) {
                                            JOptionPane.showMessageDialog(null, "Valor inválido para bônus. Insira um número válido.");
                                        }
                                    }
                                    loop3 = false; // Sai do loop da categoria
                                }
                                default -> {
                                    JOptionPane.showMessageDialog(null, "Selecione uma categoria válida.");
                                }
                            }   
                        }
                        loop2 = false;
                    }
                }
                default ->{
                    JOptionPane.showMessageDialog(null, "Obrigado por participar...");
                    loop = false;
                }
            }
        }
        
    }
    
}
