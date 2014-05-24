/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operation;

import java.util.*;
/**
 *
 * @author ana
 */
public class Dado {
    public int num1;
    public int num2;
    
    public static int aleatorio(int num1, int num2){
        
        int valor = (int) Math.floor(Math.random()*(num1-num2+1)+num2);
        
        return valor;
    }
}
