/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intralgorithms.chp2;
import intralgorithms.Interfaces.ISort;

/**
 *
 * @author eslem
 */
public class BubbleSort implements ISort{
    @Override
    public int[] sort(int[] arr) {
        bubbleSort(arr);
        return arr;
    }
    
    
    private void printArr(int[] arr){
        for(int i : arr)
            System.out.println(i);
    }
    
    
    public void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for ( int j =arr.length-1; j>i; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
