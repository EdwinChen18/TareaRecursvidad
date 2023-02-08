
package tarearecursivo;

import javax.swing.JOptionPane;

public class Recursividad {
    
    public String eliminVocales(String str) {
    if (str.length() == 0) {
        return str;//revisa si esta vacio y si esta vacio returnea el string vacio
    }
    char first = str.charAt(0);
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' ||
        first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
        return eliminVocales(str.substring(1));//Si no esta vacio se llama a 
        //ella misma con el substring del original(que empiza en el segundo caracter o 1)  
    }
    return first + eliminVocales(str.substring(1));/*Si el primer caracter(0) no 
    es una vocal la funcion returnea ese caracter concatenado con el resultado 
    del substring recursivo
    }*/
    }   
    
    public int sumaRecursiva(int n){

    if (n == 0) {
        return 0;
    } else {
        return n + sumaRecursiva(n - 1);
        }
    }
    public boolean numBinarioR(int binario){
        if (binario== 0|| binario==1){
            return true;//Si es binario returnea true
        } else if (binario < 0){
          return false;//Un numero binario no puede ser negativo
    } else{//Extrae el ultimo digito y divide entre 10 para ver si es 1 o 0
            int num= binario % 10;
            if (num != 0 && num !=1){
                return false;//Si es diferente return false
            }else{
                return numBinarioR(binario / 10);
            }//Si es 1 o 0 se llama con el resultado y divide otra vez 
        }// Repite el proceso hasta que sea 1 o 0 o que de diferente
    }
    public double calcExponencial(int n, int x){
        double result=0;
        for(int i=0;i<n;i++){
            result=result+(Math.pow(x, i)/ factorial(i));
        }
        return result;
    }
    public double factorial(int num){
        double result=1;
        for(int i=1;i<num;i++){
            result= result*i;
        }
        return result;
    }
    
    public double calcExponencialR(int n, int x){
        if (n<x){//
            return 0;
        }
        double result =(Math.pow(x, n)/factorial(n));
        //Calcula result dividiendo el resultado del exponente con el factorial
        double result2= calcExponencialR(n-1, x);//se llama asimismo como argumento 
        //Se corre otra vez con el valor de n menos 1 y se guarda en result2
        return result + result2;//Se suma los resultados 
    }
    /*public double factorialR(int num){
        if (num<0){
            return 1;
        }else{
            return num*factorialR(num-1);
        }
    }*/
}
