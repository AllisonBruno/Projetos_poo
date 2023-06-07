package banco.brasil;

import java.util.Date;

public abstract class Usuario {

    //Imprimir infomracoes dos usuarios
    private String nome;
    private String sobrenome;
    private String telefone;
    

    //Metodos gets
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    //Metodos sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    public abstract String imprimirInfo();

    
}
