/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estr_dat_practicarecursividad_c;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        NumeroBinario bin = new NumeroBinario();
        
        int n = 30;        
  
        bin.calcBinario(n);
        
        if (bin.calcBinario(n)){
           System.out.println("El numero es binario"); 
        } else{
            System.out.println("El numero NO es binario");
        }
    }
}
