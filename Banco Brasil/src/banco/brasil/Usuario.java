package banco.brasil;

import java.util.Date;

public class Usuario {

    //Imprimir infomracoes dos usuarios
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();

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

    public Date getDataRegistro() {
        return this.dataRegistro;
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

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    String imprimirInfo() {
        return String.format("Nome:%s\nsobrenome: %s\nTelefone: %s \nData Registro: %s", this.nome, this.sobrenome, this.telefone, this.dataRegistro);

    }
}
