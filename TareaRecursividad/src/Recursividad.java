/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Recursividad {
       
    public void recorrerEntrada(String entrada, char[]consonantes, int n_cons
    , String cons){
        for(int i=0; i>entrada.length(); i++){
            for(int a=0; a<consonantes.length; a++){
                if(entrada.charAt(i)==consonantes[a]){
                n_cons++;
                cons+=entrada.charAt(i);
                }
            }
        }
        System.out.println("Cadena Oringinal "+entrada);
        System.out.println("Consonantes ("+n_cons+") "+cons);      
    }
    
    public int sumaRecursiva(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumaRecursiva(n-1);
        }
    }
    
    public boolean Binario(int n){
        if(n>9){
            if(n%10==0 || n%10==1){
                return Binario(n/10);
            }else{
                return false;
            }
        }else if(n==0 || n==1){
            return true;
        }else{
            return false;
        }
    }
    
    public int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
    }
    
    
}
