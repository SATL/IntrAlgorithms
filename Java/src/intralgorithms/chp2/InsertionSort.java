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
public class InsertionSort implements ISort {

    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && val < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;

        }
        return arr;
    }

    public void sortRec(int[] arr) {

    }

    public void sortRecursive(int[] arr, int n) {
        if(n<=1)
            return;
        
        sortRecursive(arr, n-1);
        
        int last = arr[n-1];
        int j = n-2;
        
        while(j>=0 && arr[j] > arr[last]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public int[] sort(int[] arr, boolean isAsc) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && ((isAsc && val < arr[j]) || (!isAsc && val > arr[j]))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
        return arr;
    }

    public int[] descSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && val > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
        return arr;
    }

}
