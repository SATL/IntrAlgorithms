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
public class MergeSort implements ISort {

    @Override
    public int[] sort(int[] arr) {
         this.mergeSort(arr, 0, arr.length-1);
         return arr;
    }
    
    //0, 3
    private void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int half = low + (high -low) /2; //1
            mergeSort(arr, low, half);
            mergeSort(arr, half+1, high);
            merge(arr, low, half, high);
        }
    }
    
    //0, 1, 3
    private void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low +1 ;
        int n2 = high - mid;
        
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        
        for(int i=0; i<n1; i++)
            L[i] = arr[low+i];
        
        for(int i=0; i<n2; i++)
            R[i] = arr[mid+1+i];
        
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        
        int i =0, j=0, k = low;
        
        while(k<=high){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
    }
}
