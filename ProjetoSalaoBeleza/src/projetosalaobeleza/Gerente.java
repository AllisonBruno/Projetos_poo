
package projetosalaobeleza;


public class Gerente extends Usuario{
    private String admin;

    public Gerente(){
        
    }

    public Gerente(String admin) {
        this.admin = admin;
    }

    public Gerente(String admin, String codUsuario, String nome, String cpf, String email, String login) {
        super(codUsuario, nome, cpf, email, login);
        this.admin = admin;
    }
    

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
    

    @Override
    public void login() {
    }

    @Override
    public void fazerCadastro() {
        
    }
    public String acessarRelatorio(){
        
    }
     public double calcularPagFunc(){
        
    }
     public void alterarDadosCadastrais(){
        
    }
    
}
