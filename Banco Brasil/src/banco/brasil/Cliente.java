
package banco.brasil;

import java.util.Date;


public class Cliente extends Usuario{
    
    private Date dataRegistro = new Date();

    public Cliente(){
        
    }
    public Cliente(String nome, String sobrenome, String telefone) {
        this.setSobenome(sobrenome);
        this.setNome(nome);
        this.setTelefone(telefone);
        
    }

    
     public Date getDataRegistro() {
        return this.dataRegistro;
    }
     
     public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
     @Override
     public String imprimirInfo(){
       return String.format("Nome:%s\nsobrenome: %s\nTelefone: %s \nData Registro: %s", super.getNome(), super.getSobrenome(), super.getTelefone(), this.dataRegistro);  
     }
}

