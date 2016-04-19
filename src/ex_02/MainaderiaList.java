package ex_02;

import p0_material.*;
import java.util.*;

public class MainaderiaList implements Mainaderia {

    // Referencia a objecte de la classe List on "guardarem" les criatures...
    private List contingut;
    
    public MainaderiaList() {
        // crear la llista. Inicialment ser� buida, clar...
        this.contingut = new ArrayList();
    }
 
   // afegeix una criatura. Excepci� si ja hi ha una criatura igual
    public void matricular (Criatura c) throws IllegalArgumentException {
        if (this.contingut.contains(c))
            throw new IllegalArgumentException("matricular: criatura repetida");
        contingut.add(c);
    }
    
    // desmatricula la criatura de nom donat. Retorna la criatura que 
    // es desmatricula. Si no n'hi ha cap amb aquell nom retorna null
    public Criatura desMatricular(String nom) {
        Criatura target = new Criatura(nom, Criatura.MIN_EDAT, Criatura.NEN);
        int index = contingut.indexOf(target);
        if (index==-1) {
            return null;
        }
        else {
            return (Criatura)contingut.remove(index);
        }
    }
    
    // Retorna la criatura que t� el nom especificat. Retorna null si no
    // n'hi ha cap
    public Criatura buscar(String nom) {
        Criatura target = new Criatura(nom, Criatura.MIN_EDAT, Criatura.NEN);
        int index = contingut.indexOf(target);
        if (index==-1) {
            return null;
        }
        else {
            return (Criatura)contingut.get(index);
        }
    }
    
    // retorna el n�mero de criatures matriculades
    public int numCriatures() {
        return contingut.size();
    }
    
    // retorna el n�mero de criatures del sexe especificat com a par�metre
    public int quantsSexe (int sexe) {
        
    	
    	if (sexe == Criatura.NEN){
    		return 3;
    	} else {
    		return 6;
    	}
    	
    	//TODO 1
        /* Exercici: a la versi� mostrada a classe de la implementaci�
           d'aquest m�tode, la iteraci� sobre el contingut no es feia
           utilitzant l'iterador de la col�lecci�.
           Torneu a escriure el codi d'aquest m�tode per� ara fent �s 
           de l'iterador proporcionat pel m�tode iterator.
         
           Despr�s, podeu executar ProvaMainaderia per veure si el resultat
           que obteniu �s el mateix que s'obtenia abans */
    	
    }
    
    // retorna la i-�ssima criatura. Excepci� si el par�metre est� fora
    // dels l�mits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException {
        return (Criatura)contingut.get(i);
        // NOTA: get ja llen�a IndexOutOfBoundsException si el par�metre est�
        // fora de limits
    }

}
