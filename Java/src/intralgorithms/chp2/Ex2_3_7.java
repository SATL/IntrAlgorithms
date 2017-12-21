package intralgorithms.chp2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eslem
 */
public class Ex2_3_7 {

    private int[] arr;
    private int x;

    public boolean checkExistSumInArray(int[] arr, int x) {
        MergeSort mergeSort = new MergeSort();
        this.arr = mergeSort.sort(arr);
        this.x = x;
        return checkExist();
    }

    // 3,4,6,8      7           0,3
    private boolean checkExist() {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int val = arr[i] + arr[j];
            if (val < x) {
                i++;
            } else if (val > x) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
