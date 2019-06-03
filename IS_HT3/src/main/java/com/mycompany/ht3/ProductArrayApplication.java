/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ht3;

import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Joan Diaz
 */
public class ProductArrayApplication {
    public static void main(String args[]){
        long[] probando= null;
        long[] resultado = null;
        
        //EJEMPLO 1 - PRUEBA UNITARIA 1
        probando = new long[]{1, 2, 3, 4, 5};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 2 - PRUEBA UNITARIA 2
        probando = new long[]{};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 3 - PRUEBA UNITARIA 3
        probando = new long[]{0};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 4 - PRUEBA UNITARIA 4
        probando = new long[]{1};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 5 - PRUEBA UNITARIA 5
        probando = new long[]{1, 2};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 6 - PRUEBA UNITARIA 6
        probando = null;
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 7 - PRUEBA UNITARIA 7
        probando = new long[0];
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 8 - PRUEBA UNITARIA 8
        probando = new long[]{1, 0, 3, 0, 5};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 9 - PRUEBA UNITARIA 9
        probando = new long[]{1, 2, 3, 0, 5};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
        //EJEMPLO 10 - PROPIA
        probando = new long[]{1, 2, 3, 4, 5,6,7,8,9,10};
        resultado = calculateProductArrayBasic(probando);
        System.out.println("Probando: " + Arrays.toString(probando) + " - Resultado: " + Arrays.toString(resultado));
        
    }
    
    public static long[] calculateProductArrayBasic(long[] input){
        if (input == null)
            return null;
        
        long[] resultado = new long[input.length];
        long[] tempInicio = new long[input.length];
        long[] tempFinal = new long[input.length];
        long[] temp = null;
        
        for (int x=0; x< input.length;x++){
            tempInicio = Arrays.copyOfRange(input, 0, x);
            tempFinal = Arrays.copyOfRange(input, x+1, input.length);

            temp = ArrayUtils.addAll(tempInicio,tempFinal);

            long sum = Arrays.stream(temp).reduce((a, b) -> a * b).orElse(1);
            resultado[x]=sum;
        }
            
        return resultado ;
    }
}
