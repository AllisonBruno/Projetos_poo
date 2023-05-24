
package banco.brasil;

import java.util.ArrayList;


public class GerenteRepositorio {
  ArrayList<Gerente> gerente = new ArrayList<>();
  
  
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("allisons", "12345", "allison", "ferreira", ""));
        gerente.add(new Gerente("teste", "teste", "", "", ""));
        
        return gerente;
    }
}
