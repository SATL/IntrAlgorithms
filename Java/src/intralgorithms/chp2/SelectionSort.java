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
public class SelectionSort implements ISort {

    @Override
    public int[] sort(int[] arr) {

        //32,12,34,1,12
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;//0
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        return arr;
    }

    @Override
    public int[] descSort(int[] arr) {
        return arr;
    }

}
