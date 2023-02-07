
package tarearecursivo;

import javax.swing.JOptionPane;
public class TareaRecursivo {

    public static void main(String[] args) {
        
//Eliminar Vocales        
        /*Recursividad voc=new Recursividad();
        String str= JOptionPane.showInputDialog(null, "Digite una oracion: ");
        //LA funcion toma el string como un argumento 
        String oracion=voc.eliminVocales(str);//La guardamos  
        JOptionPane.showMessageDialog(null, "Su oracion sin vocales es: "+oracion);
        voc.eliminVocales(str);
        
//Suma numeros naturales 
        Recursividad sum=new Recursividad();
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: ")); 
        //guardamos el resultado en una variable
        int resultado=sum.sumaRecursiva(n);//guardamos el resultado en una variable
        JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+resultado);
        //Mostramos el resultado 

//Verificar si es binario        
        Recursividad num=new Recursividad();
        int binario=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: "));
        boolean esNumBinario=num.numBinarioR(binario);
        if (esNumBinario==true){
            JOptionPane.showMessageDialog(null, "El numero "+binario+" es binario");
        }else{
            JOptionPane.showMessageDialog(null, "El numero: "+binario+" no es binario");
        }
        num.numBinarioR(binario);*/
        
//Exponecial y Factorial
        Recursividad numE=new Recursividad();
        int i=4;
        int x=3;
        double result=numE.calcExponencial(i, x);
        JOptionPane.showMessageDialog(null,"Resultado de "+i+""
                + "elevado al "+x+" es: "+result);
        
        Recursividad numF=new Recursividad();
        int t=4;
        int y=3;
        double resultR=numF.calcExponencialR(t, y);
        JOptionPane.showMessageDialog(null, "Resultado de "+t+""
                + "elevado al "+y+" es: "+resultR);
        
    }
    
}
