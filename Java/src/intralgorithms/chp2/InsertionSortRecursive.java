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
public class InsertionSortRecursive implements ISort {

    @Override
    public int[] sort(int[] arr) {
        recursiveSort(arr, arr.length);
        return arr;
    }

    private void recursiveSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        
        recursiveSort(arr, n-1);
        
        int last = arr[n-1];
        int j = n-2;
        
        while(j>=0 && arr[j]> last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;

    }

}
