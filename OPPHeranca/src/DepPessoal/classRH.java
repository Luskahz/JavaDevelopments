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
        Object[] Categorias = new Object[]{"Administrativo", "Técnico"};
        
        
        
        boolean loopMenu = true;
        menuLoop:
        while(loopMenu){
            Object[] options = (contFunc == 0) ? new Object[]{"Sair", "Novo Funcionário"} : new Object[]{"Sair", "Novo Funcionário", "Gerenciar Funcionários"};
            int menu = JOptionPane.showOptionDialog(null,
                    "Oque deseja fazer?\n\nFuncionarios cadastradas: "+contFunc,
                    "Pagina Inicial",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            
            switch (menu){
                case 0 -> { JOptionPane.showMessageDialog(null, "Obrigado por participar..."); loopMenu = false; } // caso o user saia
                case 1 ->{ boolean loopCriar=true;
                    String nome;
                        while (true) {
                        nome = JOptionPane.showInputDialog(null, "Insira o nome do Novo Funcionário:");
                        if (nome == null) {
                            continue menuLoop;   // cancelou → volta ao menu
                        }
                        if (nome.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nome não pode ficar em branco.");
                        } else {
                            break;
                        }
                    }// validação do nome
                    Double salario;
                        while (true) {
                        String salarioStr = JOptionPane.showInputDialog(null, "Insira o salário base do Novo Funcionário:");
                        if (salarioStr == null) {
                            continue menuLoop; // cancelou → volta ao menu
                        }
                        try {
                            salario = Double.parseDouble(salarioStr);
                            if (salario < 0) {
                                JOptionPane.showMessageDialog(null, "O salário não pode ser negativo.");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Valor inválido para salário. Insira um número válido.");
                            
                        }
                    }// validação do salario
                    String matricula;
                        while (true) {
                            matricula = JOptionPane.showInputDialog(null, "Insira a matrícula do Novo Funcionário:");
                                if (matricula == null) {
                                    continue menuLoop; // cancelou → volta ao menu
                                }
                                if (matricula.trim().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Matrícula não pode ficar em branco.");
                                } else {
                                    break;
                                }
                            } // validação da matricula
                        
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
                                } //caso o assistente seja administrativo
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
                                } // caso o assistente seja tecnico
                        default -> {
                            continue;
                        }
                    }
                } // caso o user escolha criar um novo funcionario
                case 2 ->{
                    categoria:
                    while(true){
                        int categ = JOptionPane.showOptionDialog(null,
                                "Qual Categoria deseja gerenciar?",
                                "Gerenciamento",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                Categorias,
                                Categorias[0]);
                        switch (categ) {
                            default ->{
                                continue menuLoop;
                            }
                            case 0 -> {
                                Object[] AdmStr = new Object[contAdm];
                                for (int i = 0; i < contAdm; i++) {
                                    AdmStr[i] = administrativo[i].nomeToString();
                                }
                                int func = JOptionPane.showOptionDialog(null,
                                        "Qual Assistente Administrativo deseja gerenciar?",
                                        "Assistentes Administrativos",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        AdmStr,
                                        AdmStr[0]);
                                if (func == JOptionPane.CLOSED_OPTION) {
                                       continue categoria;
                                    } else{
                                        JOptionPane.showMessageDialog(null, administrativo[func].exibeDados());
                                }
                            }
                            case 2 -> {
                                voltar:
                                while (true) {
                                    Object[] TecStr = new Object[contTec];
                                    for (int i = 0; i < contAdm; i++) {
                                        TecStr[i] = tecnico[i].nomeToString();
                                    }
                                    int func = JOptionPane.showOptionDialog(null,
                                            "Qual Assistente Tecnico deseja gerenciar?",
                                            "Assistentes Tecnicos",
                                            JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE,
                                            null,
                                            TecStr,
                                            TecStr[0]);
                                    if (func == JOptionPane.CLOSED_OPTION) {
                                       continue categoria;
                                    } else{
                                        JOptionPane.showMessageDialog(null, tecnico[func].exibeDados());
                                    }
                                }

                            }
                        }
                    }
                        
                    } // caso o user escolha gerenciar os funcionarios existentes
                default -> { 
                    return;
                }    // caso o user saia pelo X
        } //loopmenu
}
}
}

