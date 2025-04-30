/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaContatos;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class agendaContatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String saida = "Obrigado por utilizar";
        Object[] options = {"sair", "Adicionar Contatos", "Contatos"};
        Object[] contatoType = {"Pessoa juridica", "Pessoa Fisica"};
        Object[] caminho = {"Buscar", "Listar"};

        pessoaFisica listFisica = new pessoaFisica();
        pessoaJuridica listJuridica = new pessoaJuridica();

        pessoaFisica[] fisica = new pessoaFisica[10];

        pessoaJuridica[] juridica = new pessoaJuridica[10];
        int contContatos = 0, contFisica = 0, contJuridica = 0;
        menu: while(true){
            int menu = JOptionPane.showOptionDialog(null,
                    "Munu principal",
                    "Agenda de contatos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
                    switch (menu){
                        case 0 ->{
                            JOptionPane.showMessageDialog(null, saida);
                            break menu;
                        }//saida do user
                        default ->{
                            break menu;
                        }//saida do user
                        case 1 ->{
                            contatoType: while(true){
                                int type = JOptionPane.showOptionDialog(null,
                                        "Pessoa juridica ou fisica?",
                                        "Novo Contato",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        contatoType,
                                        contatoType[0]);
                                switch (type){
                                    default ->{
                                      continue menu;  
                                    } case 0 -> { // juridica
                                        atributes: while (true) {
                                        String nome = JOptionPane.showInputDialog("Nome:"); if(nome == null) break;
                                        String tel = JOptionPane.showInputDialog("Telefone:"); if (tel == null) break;
                                        String endereco = JOptionPane.showInputDialog("endereço:"); if (endereco == null) break;
                                        String cnpj=JOptionPane.showInputDialog("CNPJ:"); if (cnpj == null) break;
                                        String IE= JOptionPane.showInputDialog("Inscrição estadual:"); if (IE == null) break;
                                        String razaoSocial = JOptionPane.showInputDialog("Razão Social:"); if (razaoSocial == null) break;
                                        String dtAbertura = JOptionPane.showInputDialog("Data de Abertura:"); if (dtAbertura == null) break;
                                        String email = JOptionPane.showInputDialog("Email:"); if (email == null) break;
                                        
                                        
                                        //middleware
                                        
                                        
                                        //
                                        
                                        juridica[contJuridica] = new pessoaJuridica(cnpj, IE, razaoSocial, dtAbertura, nome, endereco, email, tel);
                                        JOptionPane.showMessageDialog(null, "contato criado com sucesso, visualizar em 'contatos' disponivel no menu inicial");
                                        contJuridica++;
                                        contContatos++;
                                        continue menu;
                                        
                                        }
                                    }
                                    case 1 ->{
                                       atributes: while (true) {
                                        String nome = JOptionPane.showInputDialog("Nome:"); if(nome == null) break;
                                        String tel = JOptionPane.showInputDialog("Telefone:"); if (tel == null) break;
                                        String endereco = JOptionPane.showInputDialog("endereço:"); if (endereco == null) break;
                                        String cpf=JOptionPane.showInputDialog("CPF:"); if (cpf == null) break;
                                        String dtNascimento= JOptionPane.showInputDialog("Data de nascimento:"); if (dtNascimento == null) break;
                                        String estadoCivil = JOptionPane.showInputDialog("Estado civil:"); if (estadoCivil == null) break;
                                        String sexo = JOptionPane.showInputDialog("Sexo:"); if (sexo == null) break;
                                        String email = JOptionPane.showInputDialog("Email:"); if (email == null) break ;
                                        //middleware
                                        
                                        
                                        //
                                        
                                        fisica[contFisica] = new pessoaFisica(cpf, dtNascimento, estadoCivil, sexo, nome, endereco, email, tel);
                                        JOptionPane.showMessageDialog(null, "contato criado com sucesso, visualizar em 'contatos' disponivel no menu inicial");
                                        contFisica++;
                                        contContatos++;
                                        continue menu;
                                       }
                                    }
                                }
                            }
                        } // adicionar contato
                        case 2 ->{
                            consultaContatos: while(true){
                                int menuContatos = JOptionPane.showOptionDialog(null,
                                        "Consultando contatos", "Agenda",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        caminho,
                                        caminho);
                                
                                String[] listaFisicas = listFisica.arrayFisica(fisica);
                                String[] listaJuridicas = listJuridica.arrayJuridica(juridica);
                                
                                
                                switch (menuContatos){
                                    default ->{
                                        continue menu;
                                    } //retorno do user
                                    case 0 -> { // BUSCAR O CONTATO PELO CNPJ/CPF
                                        busca:
                                        while (true) {
                                            // Solicitar CPF ou CNPJ
                                            String buscaUser = JOptionPane.showInputDialog("Insira o CPF ou CNPJ:");

                                            // Se o usuário cancelar a operação, interrompe o loop de busca
                                            if (buscaUser == null || buscaUser.trim().isEmpty()) {
                                                JOptionPane.showMessageDialog(null, "Nenhum CPF ou CNPJ inserido. Cancelando a busca.");
                                                continue menu;
                                            }

                                            int indexBusca = -1;
                                            int typeBusca = 0;

                                            // Buscar na lista de pessoas físicas
                                            for (int i = 0; i < contFisica; i++) {
                                                if (fisica[i] != null && fisica[i].getCpf().equals(buscaUser)) {
                                                    indexBusca = i;
                                                    typeBusca = 1;
                                                    break;
                                                }
                                            }

                                            // Buscar na lista de pessoas jurídicas
                                            for (int i = 0; i < contJuridica; i++) {
                                                if (juridica[i] != null && juridica[i].getCnpj().equals(buscaUser)) {
                                                    indexBusca = i;
                                                    typeBusca = 2;
                                                    break;
                                                }
                                            }

                                            // Exibir os dados do contato encontrado ou mensagem de erro
                                            switch (typeBusca) {
                                                case 1 ->
                                                    JOptionPane.showMessageDialog(null, "Dados do contato (Pessoa Física):\n\n" + fisica[indexBusca].DadosContato());
                                                case 2 ->
                                                    JOptionPane.showMessageDialog(null, "Dados do contato (Pessoa Jurídica):\n\n" + juridica[indexBusca].DadosContato());
                                                default ->
                                                    JOptionPane.showMessageDialog(null, "Contato não encontrado. Verifique CPF ou CNPJ.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
        }
    }
}
