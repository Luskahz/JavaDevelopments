/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaContatos;

/**
 *
 * @author lucas
 */

//CPF, data de nascimento, estado civil, e outros 
public class pessoaFisica extends Contatos{
    private String cpf;
    private String dataNasc;
    private String estadoCivil;
    private String sexo;

    /**
 * Cria uma instância de pessoa física com todos os dados necessários.
 *
 * Ordem dos parâmetros:
 * cpf, dataNasc, estadoCivil, sexo, nome, endereco, email, tel
 *
 * @param cpf CPF da pessoa
 * @param dataNasc Data de nascimento
 * @param estadoCivil Estado civil
 * @param sexo Sexo
 * @param nome Nome completo
 * @param endereco Endereço residencial
 * @param email Endereço de e-mail
 * @param tel Número de telefone
 */
public pessoaFisica(String cpf, String dataNasc, String estadoCivil, String sexo, String nome, String endereco, String email, String tel) {
    super(nome, endereco, email, tel);
    this.cpf = cpf;
    this.dataNasc = dataNasc;
    this.estadoCivil = estadoCivil;
    this.sexo = sexo;
}

    public pessoaFisica() {
    }



    public String getCpf() {
        return cpf;
    }
    
   public String[] arrayFisica(pessoaFisica[] fisica) {
    int count = 0;
    for (pessoaFisica pf : fisica) {
        if (pf != null) count++;
    }

    String[] arr = new String[count];
    int index = 0;
    for (pessoaFisica pf : fisica) {
        if (pf != null) {
            arr[index++] = pf.getCpf();
        }
    }

    listarCpfs(arr);
    return arr;
} //cria um array de strings apartir dos cpfs adcionados na agenda.

    public String DadosContato(){
        return "Nome:" + this.nome+ "\n"+
                "Cpf:" + this.cpf + "\n"+
                "Telefone:" + this.tel+ "\n"+
                "Estado Civil" + this.estadoCivil+ "\n"+
                "Email:" + this.email+ "\n"+
                "Sexo:" + this.sexo+ "\n"+
                "Endereço:" + this.endereco+ "\n"+
                "data de Nascimento" + this.dataNasc+ "\n";
    }
    
    
    public boolean isEmpty() {
            return (nome == null || nome.isEmpty()) &&
                   (endereco == null || endereco.isEmpty()) &&
                   (email == null || email.isEmpty()) &&
                   (tel == null || tel.isEmpty()) &&
                   (cpf == null || cpf.isEmpty()) &&
                   (dataNasc == null || dataNasc.isEmpty()) &&
                   (estadoCivil == null || estadoCivil.isEmpty()) &&
                   (sexo == null || sexo.isEmpty());
        }
}
