/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr_dat_practivarecursividad;

/**
 *
 * @author stevenaraya
 */
public class Calculos {

    
    public double calcExpo(int i, int n, int x, double result){
        
         if(i < n){
            result = result + (Math.pow(x,i) / factorial(i));
            calcExpo(i+1, n, x, result);
        }  
         return result;
    }
            
    public double factorial (int i){
        
        if (i == 0){
            return 1;          
        } else {
        return i * factorial(i-1);
        }
    
    }
    
}
