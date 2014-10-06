package MenuLateral;

/**
 *
 * @author Juninho
 */
public class funcionario {

    private String Nome;
    private String Login;
    private String CPF;
    private String Rua;
    private String Cidade;
    private String Estado;
    private String CEP;
    private String administrador;
    private String ponto;

    public funcionario(String nome, String login, String cpf, String rua, String estado, String cidade, String cep, String admin, String dot) {
        this.Nome = nome;
        this.Login = login;
        this.CPF = cpf;
        this.Rua = rua;
        this.Estado = estado;
        this.Cidade = cidade;
        this.CEP = cep;
        this.administrador = admin;
        this.ponto = dot;
    }

    public funcionario() {
    }

    public String getPonto() {
        return ponto;
    }

    public void setPonto(String ponto) {
        this.ponto = ponto;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
