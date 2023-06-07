
package projetosalaobeleza;


public abstract class Usuario {
    private String codUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String login;
    
    
    public Usuario(){
        
    }
    public Usuario(String codUsuario, String nome, String cpf, String email, String login) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public abstract void login();
    
    public abstract void fazerCadastro();
    
    
}
