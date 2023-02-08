/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr_dat_praticarecursividad_a;

/**
 *
 * @author stevenaraya
 */
public class EliminaVocales {
    
    
    
    public String ora (String oracion, String oracionCons){
        
            System.out.println("La oracion completa es: " + oracion);
            return oraCons(oracion, oracionCons);
    }
        
        
    public String oraCons (String oracion, String oracionCons){
        
        oracionCons = oracion.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");  
        return oracionCons; 
    
    }
}
    

