/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ContaCorrente {
    int numeroConta;
    float saldo;
    
    public void extrato(){
        JOptionPane.showMessageDialog(null, "O saldo disponível na conta "+this.numeroConta+" é de\n\n\t Valor: R$"+this.saldo);
    }
    
    public void saque(float valor){
        this.saldo = this.saldo - valor;
        JOptionPane.showMessageDialog(null, "O saldo atual da conta: R$ "+ this.saldo);
    }
    
    public void deposito(float valor){
        this.saldo = this.saldo + valor;
        JOptionPane.showMessageDialog(null, "O saldo atual da conta: R$ "+ this.saldo);
    }
}
