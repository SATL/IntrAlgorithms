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
public class InsertionSortRecursive implements ISort {

    @Override
    public int[] sort(int[] arr) {
        recursiveSort(arr, arr.length-1);
        return arr;
    }

    private void recursiveSort2(int[] arr, int i) {
        if (i < arr.length) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = val;
            recursiveSort2(arr, i + 1);
        }
    }

    private void recursiveSort(int[] arr, int n) {
        if (n < 1) {
            return;
        }

        recursiveSort(arr, n - 1);
        int last = arr[n];
        int j = n - 1;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

    }

}
