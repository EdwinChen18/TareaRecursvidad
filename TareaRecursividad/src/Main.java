/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursividad recu = new Recursividad();
        
        char[] consonantes ={'b','c','d','f','g','h','j','k','l','m','n','ñ','p',
        +'q','r','s','t','v','w','x','y','z'};
        
        String cons="";
        int n_cons=0;
        //Primer ejercicio
        String entrada= "Bienvenido al curso";
        recu.recorrerEntrada(entrada, consonantes, n_cons, cons);
        
        //Segundo ejercicio
        System.out.println(recu.sumaRecursiva(6));
        
        //Tercer ejercicio
        int num=1111011;
        if(recu.Binario(num)){
            System.out.println("El numero esta en binario");
        }else{
            System.out.println("El numero no esta en binario");
        }
        
        //Cuarto ejercicio
        int n=4;
        System.out.println(n+"! = "+recu.factorial(n));
    }
    
}
