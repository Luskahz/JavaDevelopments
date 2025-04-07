/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaBancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ConsultaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loop = true;
        int contas = 0, qtd = 5, numContas = 0;
        ContaCorrente[] conta = new ContaCorrente[qtd];
        while(loop){
            Object[] atendimento = {"Nova Conta", "Acessar conta", "sair"};
            int acesso = JOptionPane.showOptionDialog(null, 
                    (numContas)+ " contas disponíveis...",
                    "acesso a conta corrente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    atendimento,
                    atendimento[0]
            );

                switch (acesso) {
                    case 0 -> {
                        for(int i = 0; i < conta.length; i++){
                               if(conta[i] == null){
                                   contas = i;
                                   break;
                            }
                            
                        }
                        String saldoValue = JOptionPane.showInputDialog("insira o saldo inicial da conta");
                        if(saldoValue != null){
                            if("".equals(saldoValue)){
                                saldoValue = "0";
                            }
                            conta[contas] = new ContaCorrente();
                            numContas++;
                            conta[contas].numeroConta = contas;
                            JOptionPane.showMessageDialog(null, "O numero de acesso da sua nova conta é "+ conta[contas].numeroConta);
                            conta[contas].saldo = Integer.parseInt(saldoValue);
                        } else {
                            continue;
                        }
                        
                        boolean loop2 = true;
                        OUTER:
                        while (loop2) {
                    Object[] inicialPage ={"Voltar", "sacar", "depositar"};
                    int manipulacao = JOptionPane.showOptionDialog(null,
                            "Extrato: R$"+ conta[contas].saldo,
                            "conta numero "+ conta[contas].numeroConta,
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            inicialPage,
                            inicialPage[2]
                    );  switch (manipulacao) {
                        case 0 -> {
                            break OUTER;
                    }
                        case 1 -> {
                            String saqueValue = JOptionPane.showInputDialog("Quanto deseja sacar?");
                            if(saqueValue != null){
                                if("".equals(saqueValue)){
                                    saqueValue = "0";
                                }
                                float saque = Float.parseFloat(saqueValue);
                                conta[contas].saque(saque);
                            } else {
                                continue;
                            }
                            
                    }
                        case 2 -> {
                            String depositoValue = JOptionPane.showInputDialog("Quanto deseja depositar?");
                            if(depositoValue != null){
                                if("".equals(depositoValue)){
                                    depositoValue = "0";
                                }
                                float deposito = Float.parseFloat(depositoValue);
                                conta[contas].deposito(deposito);
                            } else {
                                continue;
                            }
                    }  
                        default -> {
                            break OUTER;
                        }
                    }
                }
                        
                    }
                    case 1 -> {
                        String contasValue = JOptionPane.showInputDialog("insira o codigo da conta: ");
                        if("".equals(contasValue)){
                            continue;
                        }
                        else if(contasValue != null){
                            contas = Integer.parseInt(contasValue);
                        } else {
                            continue;
                        }
                        boolean loop2 = true;
                        OUTER:
                        while (loop2) {
                    Object[] inicialPage ={"Voltar", "sacar", "depositar"};
                    int manipulacao = JOptionPane.showOptionDialog(null,
                            "Extrato: R$"+ conta[contas].saldo,
                            "conta numero "+ conta[contas].numeroConta,
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            inicialPage,
                            inicialPage[2]
                    );  switch (manipulacao) {
                        case 0 -> {
                            break OUTER;
                    }
                        case 1 -> {
                            String saqueValue = JOptionPane.showInputDialog("Quanto deseja sacar?");
                            if(saqueValue != null){
                                if("".equals(saqueValue)){
                                    saqueValue = "0";
                                }
                                float saque = Float.parseFloat(saqueValue);
                                conta[contas].saque(saque);
                            } else {
                                continue;
                            }
                            
                    }
                        case 2 -> {
                            String depositoValue = JOptionPane.showInputDialog("Quanto deseja depositar?");
                            if(depositoValue != null){
                                if("".equals(depositoValue)){
                                    depositoValue = "0";
                                }
                                float deposito = Float.parseFloat(depositoValue);
                                conta[contas].deposito(deposito);
                            } else {
                                continue;
                            }
                    }  
                        default -> {
                            break OUTER;
                        }
                    }
                }
                    }
                    default -> {    
                        JOptionPane.showMessageDialog(null, "Obrigado pelo acesso...");
                        loop = false;                        
                    }
                }



        }   
    }
    
}
