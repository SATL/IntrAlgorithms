/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intralgorithms.chp2;

/**
 *
 * @author eslem
 */
public class BinaryAdd {

    public int[] add(int[] a, int[] b) {
        int[] c = new int[a.length + 1];
        int carry = 0;
        
        
        //1011
        //0011
        //00000
        for(int i = a.length-1; i>=0; i--){
            int sum = a[i] + b[i] + c[i+1];
            c[i+1] = sum %2;
            c[i]= sum /2;
        }
        return c;
    }
}
