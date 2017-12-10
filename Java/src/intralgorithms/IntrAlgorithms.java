/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intralgorithms;

import intralgorithms.sort.ISort;
import intralgorithms.sort.InsertionSort;

/**
 *
 * @author eslem
 */
public class IntrAlgorithms {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InsertionSort sorter = new InsertionSort();

        int[] arr = {3, 1, 4, 5, 7};
        printArr(arr);
        System.out.println("______");
        printArr(sorter.sort(arr, true));
        System.out.println("______");
        printArr(sorter.sort(arr, false));
    }

}
