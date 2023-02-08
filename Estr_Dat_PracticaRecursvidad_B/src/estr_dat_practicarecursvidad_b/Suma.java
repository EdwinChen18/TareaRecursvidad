/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr_dat_practicarecursvidad_b;

/**
 *
 * @author stevenaraya
 */
public class Suma {
    
    public int sumaNatural(int n){
        
        if (n == 1){
            return 1;
        } else {
            return n + sumaNatural(n-1);
        }
    }    
    
}
