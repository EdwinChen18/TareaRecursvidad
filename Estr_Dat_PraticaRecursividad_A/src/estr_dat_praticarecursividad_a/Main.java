/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estr_dat_praticarecursividad_a;

/**
 *
 * @author stevenaraya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EliminaVocales consonantes = new EliminaVocales();
                
        String oracion = consonantes.ora("Viva Saprissa","");
        
        System.out.println("La oracion sin vocales es: " + oracion);
       
    }
    
}
