/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intralgorithms.sort;

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
                arr[j] = val;
                j--;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr, boolean isAsc) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && ( (isAsc && val < arr[j]) || (!isAsc && val > arr[j])  )  ) {
                arr[j + 1] = arr[j];
                arr[j] = val;
                j--;
            }
        }
        return arr;
    }

    @Override
    public int[] descSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && val > arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = val;
                j--;
            }
        }
        return arr;
    }

}
