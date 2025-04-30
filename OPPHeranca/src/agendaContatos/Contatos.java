/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaContatos;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class Contatos {
    protected String nome;
    protected String endereco;
    protected String email;
    protected String tel;

    public Contatos(String nome, String endereco, String email, String tel) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.tel = tel;
    }

    public Contatos() {
    }
    
    
    
    
    
    
    public String[] ordenar(String[] arr){
        Arrays.sort(arr);
        return arr;
    }
    
    public String[] listarCnpjs(String[] cnpjs){
        return ordenar(cnpjs);
    }
    public String[] listarCpfs(String[] cpfs){
        return ordenar(cpfs);
    }
    
    
   
    
    
    
    public String[] listarContatos(String[] cpfs, String[] cnpjs){// entende-se que o metodo tem que receber um array com os cpfs e os cnpjs para que possa lista-los        
        ordenar(cpfs);
        ordenar(cnpjs);
        String[] list = new String[((cpfs.length)+(cnpjs.length))];
        int i = 0;
            
        for (String cpf : cpfs) {
            list[i] = cpf;
            i++;
        }
        for (String cnpj : cnpjs) {
            list[i] = cnpj;
            i++;
        }
        
        return list;
          
    }
    
    
    
}
