
package banco.brasil;

import java.util.Date;


public class Usuario {
    
    //Imprimir infomracoes dos usuarios
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date(); 
    
    String imprimirInfo(){
        return String.format("Nome:%s\nsobrenome: %s\nTelefone: %s \nData Registro: %s", this.nome, this.sobrenome, this.telefone, this.dataRegistro);
    
    }
}