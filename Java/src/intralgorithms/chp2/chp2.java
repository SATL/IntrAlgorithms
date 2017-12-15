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
public class chp2 {

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

        /*InsertionSort sorter = new InsertionSort();

        int[] arr = {31, 41, 59, 26, 41, 58};
        printArr(arr);
        System.out.println("______");
        printArr(sorter.sort(arr, true));
        System.out.println("______");
        printArr(sorter.sort(arr, false));

        System.out.println("Binary add");
        BinaryAdd badd = new BinaryAdd();
        int[] a = {1, 0, 1, 1}, b = {0, 0, 1, 1};
        printArr(a);
        System.out.println("___");
        printArr(b);
        System.out.println("___");
        printArr(badd.add(a, b));

        System.out.println("Selection Sort");
        SelectionSort selectionSort = new SelectionSort();
        int[] arrB = {32, 12, 34, 1, 12};
        printArr(selectionSort.sort(arrB));*/
        
        System.out.println("Merge Sort");
        MergeSort mergeSort = new MergeSort();
        int[] arrC = {32, 12, 34, 1, 12};
        printArr(mergeSort.sort(arrC));
    }
}
