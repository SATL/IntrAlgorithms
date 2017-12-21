/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intralgorithms.chp2;

import intralgorithms.Interfaces.ISearch;

/**
 *
 * @author eslem
 */
public class BinarySearch implements ISearch {

    @Override
    public int search(int[] arr, int val) {
        return searchBinary(arr, 0, arr.length - 1, val);
    }

    public int searchBinary(int[] arr, int left, int right, int val) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            int item = arr[middle];

            if (item < val) {
                return searchBinary(arr, left, middle, val);
            } else if (item > val) {
                return searchBinary(arr, middle, right, val);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
