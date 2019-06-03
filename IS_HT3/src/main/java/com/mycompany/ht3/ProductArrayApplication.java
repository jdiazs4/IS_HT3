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
