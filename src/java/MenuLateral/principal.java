package MenuLateral;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Juninho
 */
@ManagedBean
@SessionScoped
public class principal {

    List<funcionario> ListaFuncionario = new ArrayList<funcionario>();
    List<funcionario> ListaFuncionariosativos = new ArrayList<funcionario>();
    private funcionario fun = new funcionario();
    private String nome;
    private String senha;
    private String nome2;
    private String cpf;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private String admin;
    private String login;
    private funcionario funcdescricao = new funcionario();
    private funcionario funcentrada = new funcionario();

    public void IniciarLista() {
        if (ListaFuncionario.isEmpty()) {
            funcionario valdir = new funcionario("Valdir Júnior Cordeiro Rocha", "valdir", "09530342675", "Beco Antônio Pedro nº:428", "Minas Gerais", "Diamantina", "39100-000", "Administrador", "nao");
            funcionario luiz = new funcionario("Luiz Felipe Cordeiro Lopes", "Lfelipe", "10043770614", "Rua Antônio Edílio Duarte nº 77", "Minas Gerais", "Diamantina", "39100-000", "Administrador", "nao");
            funcionario ian = new funcionario("Ian Carlos Cruz", "ian.bomi", "11201418690", "Rua João César de Oliveira nº: 31", "Minas Gerais", "Diamantina", "39100-000", "Administrador", "nao");
            funcionario vitor = new funcionario("Vitor Matos Abreu", "vitim", "09643076695", "Rua Paula Vieira n°: 806 A", "Minas Gerais", "Diamantina", "39100-000", "Administrador", "nao");
            funcionario prof = new funcionario("Marcus Vinícius Carvalho Guelpeli", "marcus", "123456", "Desconhecido", "Rio de Janeiro", "Rio de Janeiro", "0000-000", "Administrador", "nao");

            ListaFuncionario.add(valdir);
            ListaFuncionario.add(luiz);
            ListaFuncionario.add(ian);
            ListaFuncionario.add(vitor);
            ListaFuncionario.add(prof);
        }
    }

    public void IniciarListaAtivos() {
        funcionario teste;

        ListaFuncionariosativos.removeAll(ListaFuncionario);
        for (int i = 0; i < ListaFuncionario.size(); i++) {
            teste = ListaFuncionario.get(i);
            if ((teste.getPonto().equals("sim"))) {
                ListaFuncionariosativos.add(teste);
            }
        }
    }

    public String Descricao(funcionario esse) {
        funcdescricao = esse;

        return "/MenuLateral/DescricaoUsuario.xhtml?faces-redirect=true";
    }

    public String CadastrarFuncionario() {

        ListaFuncionario.add(new funcionario(nome2, login, cpf, rua, estado, cidade, cep, admin, "nao"));

        return TelaCadastradoComSucesso();
    }

    public String BaterPonto() {
        funcionario teste;
        IniciarLista();
        for (int i = 0; i < ListaFuncionario.size(); i++) {
            teste = ListaFuncionario.get(i);
            if (teste.getLogin().equals(nome) && teste.getCPF().equals(senha)) {
                if ((teste.getPonto().equals("nao"))) {
                    teste.setPonto("sim");
                    ListaFuncionario.set(i, teste);
                    funcentrada = teste;
                    IniciarListaAtivos();
                    return TelaPontoBatido();
                } else {
                    teste.setPonto("nao");
                    ListaFuncionario.set(i, teste);
                    funcentrada = teste;
                    IniciarListaAtivos();
                    return TelaPontoBatido();
                }
            }
        }
        return "/MenuLateral/LoginIncorreto.xhtml?faces-redirect=true";
    }

    public String VerificarLogin() {
        funcionario teste;
        IniciarLista();
        for (int i = 0; i < ListaFuncionario.size(); i++) {
            teste = ListaFuncionario.get(i);
            if ((teste.getLogin().equals(nome)) && (teste.getCPF().equals(senha))) {
                if (teste.getAdministrador().equals("Administrador")) {
                    return TelaCadastroUsuario();
                }

            }
        }
        return "/MenuLateral/LoginIncorreto.xhtml?faces-redirect=true";
    }

    public String VerificarLogin2() {
        funcionario teste;
        IniciarLista();
        for (int i = 0; i < ListaFuncionario.size(); i++) {
            teste = ListaFuncionario.get(i);
            if ((teste.getLogin().equals(nome)) && (teste.getCPF().equals(senha))) {
                if (teste.getAdministrador().equals("Administrador")) {
                    return TelaVisualizarTempo();
                }
            }
        }
        return "/MenuLateral/LoginIncorreto.xhtml?faces-redirect=true";
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public funcionario getFuncentrada() {
        return funcentrada;
    }

    public void setFuncentrada(funcionario funcentrada) {
        this.funcentrada = funcentrada;
    }

    public List<funcionario> getListaFuncionariosativos() {
        return ListaFuncionariosativos;
    }

    public void setListaFuncionariosativos(List<funcionario> ListaFuncionariosativos) {
        this.ListaFuncionariosativos = ListaFuncionariosativos;
    }

    public funcionario getFuncdescricao() {
        return funcdescricao;
    }

    public void setFuncdescricao(funcionario funcdescricao) {
        this.funcdescricao = funcdescricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<funcionario> getListaFuncionario() {
        return ListaFuncionario;
    }

    public void setListaFuncionario(List<funcionario> ListaFuncionario) {
        this.ListaFuncionario = ListaFuncionario;
    }

    public funcionario getFun() {
        return fun;
    }

    public void setFun(funcionario fun) {
        this.fun = fun;
    }

    public String TelaPrincipal() {
        return "/index.xhtml?faces-redirect=true";
    }

    public String TelaBaterPonto() {
        return "/MenuLateral/BaterPonto.xhtml?faces-redirect=true";
    }

    public String TelaCadastroUsuario() {
        return "/MenuLateral/CadastrarUsuario.xhtml?faces-redirect=true";
    }

    public String TelaVisualizarTempo() {
        return "/MenuLateral/VisualizarTempo.xhtml?faces-redirect=true";
    }

    public String TelaQuemSomos() {
        return "/MenuLateral/QuemSomos.xhtml?faces-redirect=true";
    }

    public String TelaPlanoDeMarketing() {
        return "/MenuLateral/PlanoDeMarketing.xhtml?faces-redirect=true";
    }

    public String TelaVerificarUsuario() {
        return "/MenuLateral/VerificarUsuario.xhtml?faces-redirect=true";
    }

    public String TelaVerificarUsuario2() {
        return "/MenuLateral/Verificarusuario2.xhtml?faces-redirect=true";
    }

    public String TelaFolhaDePonto() {
        return "/MenuLateral/FolhaDePonto.xhtml?faces-redirect=true";
    }

    public String TelaListaAtivos() {
        return "/MenuLateral/ListaAtivos.xhtml?faces-redirect=true";
    }

    public String TelaPontoBatido() {
        return "/MenuLateral/PontoBatido.xhtml?faces-redirect=true";
    }

    public String TelaCadastradoComSucesso() {
        return "/MenuLateral/CadastradoComSucesso.xhtml?faces-redirect=true";
    }
}
