/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr_dat_practicarecursividad_c;

/**
 *
 * @author stevenaraya
 */
public class NumeroBinario {
    
    public static boolean calcBinario (int num){
        
        
        if (num == 0 || num == 1
            || num < 0) {
            return false;
        }

        while (num != 0) {

            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}