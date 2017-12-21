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
public class InsertionBinarySort implements ISort {

    @Override
    public int[] sort(int[] arr) {
        sortRec(arr, 1);
        return arr;
    }

    private void sortRec(int[] arr, int i) {
        if(i<arr.length){
            int j = i-1;
            int k = toInsert(arr, i, 0, j);
            int val = arr[i]; 
            
            while(j>k){
                arr[j] = arr[j+1];
                j--;
            }
            arr[k] = val;
            sortRec(arr, i+1);
        }
    }

    private int toInsert(int[] arr, int i, int left, int right) {
        int val = arr[i];

        if (left >= right) {
            return (val > arr[left]) ? (left + 1) : left;
        }
        int middle = left + (right - left) / 2;
        if (arr[middle] > val) {
            return toInsert(arr, i, left, middle);
        } else if (arr[middle] < val) {
            return toInsert(arr, i, middle + 1, right);
        } else {
            return middle + 1;
        }
    }


}
