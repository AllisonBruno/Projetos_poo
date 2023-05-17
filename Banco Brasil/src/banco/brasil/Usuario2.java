
package banco.brasil;

import java.util.Date;


public class Usuario2 {
    
    //Imprimir infomracoes dos usuarios
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date(); 
    
    String imprimirInfo(){
        return String.format("Nome : %s\n sobrenome: %s\n, Telefone: %s, Data Registro %s", this.nome, this.sobrenome, this.telefone, this.dataRegistro);
    
    }
}