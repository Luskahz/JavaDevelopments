/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaContatos;

/**
 *
 * @author lucas
 */

// CNPJ, inscrição estadual, razão social, e outros 
public class pessoaJuridica extends Contatos {
    private String cnpj;    
    private String IE;
    private String razaoSocial;
    private String dataAbertura;

    /**
 * Cria uma instância de pessoa jurídica com os dados informados.
 *
 * Ordem dos parâmetros:
 * cnpj, IE, razaoSocial, dataAbertura, nome, endereco, email, tel
 * @param cnpj CNPJ da empresa
 * @param IE Inscrição Estadual
 * @param razaoSocial Razão social da empresa
 * @param dataAbertura Data de abertura da empresa
 * @param nome Nome fantasia
 * @param endereco Endereço comercial
 * @param email E-mail para contato
 * @param tel Telefone comercial
 */
    public pessoaJuridica(String cnpj, String IE, String razaoSocial, String dataAbertura, String nome, String endereco, String email, String tel) {
        super(nome, endereco, email, tel);
        this.cnpj = cnpj;
        this.IE = IE;
        this.razaoSocial = razaoSocial;
        this.dataAbertura = dataAbertura;
    }

    public pessoaJuridica() {
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    
     public String[] arrayJuridica(pessoaJuridica[] juridica) {
    int count = 0;
    for (pessoaJuridica pj : juridica) {
        if (pj != null) count++;
    }

    String[] arr = new String[count];
    int index = 0;
    for (pessoaJuridica pj : juridica) {
        if (pj != null) {
            arr[index++] = pj.getCnpj();
        }
    }

    listarCpfs(arr);
    return arr;
}    
    public String DadosContato(){
        return "Nome:" + this.nome+ "\n"+
                "Cnpj:" + this.cnpj+ "\n"+
                "Telefone:" + this.tel+ "\n"+
                "Razão social:" + this.razaoSocial+ "\n"+
                "Email:" + this.email+ "\n"+
                "IE:" + this.IE+ "\n"+
                "Endereço:" + this.endereco+ "\n"+
                "data de abertura" + this.dataAbertura+ "\n";
    }
    
    
    public boolean isEmpty() {
        return (nome == null || nome.isEmpty()) &&
               (endereco == null || endereco.isEmpty()) &&
               (email == null || email.isEmpty()) &&
               (tel == null || tel.isEmpty()) &&
               (cnpj == null || cnpj.isEmpty()) &&
               (IE == null || IE.isEmpty()) &&
               (razaoSocial == null || razaoSocial.isEmpty()) &&
               (dataAbertura == null || dataAbertura.isEmpty());
    }
}


