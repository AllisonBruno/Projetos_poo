package banco.brasil;

import java.util.Date;

public class Usuario {

    //Imprimir infomracoes dos usuarios
    private String nome;
    private String sobrenome;
    private String telefone;
    

    //Metodo construtor
    public Usuario() {

    }

    public Usuario(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

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

    

    public String imprimirInfo() {
        return String.format("Nome:%s\nsobrenome: %s\nTelefone: %s \nData Registro: %s", this.nome, this.sobrenome, this.telefone);

    }
}
