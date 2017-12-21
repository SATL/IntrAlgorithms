/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import intralgorithms.chp2.MergeSort;
import intralgorithms.chp2.BinarySearch;
import intralgorithms.Interfaces.ISearch;
import intralgorithms.Interfaces.ISort;
import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eslem
 */
public class BinarySearchTest {

    protected int[] numbers;
    protected final static int SIZE = 7;
    protected final static int MAX = 20;

    protected ISearch searcher;

    public BinarySearchTest() {
    }

    @Before
    public void setUp() {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
        searcher = new BinarySearch();
    }

    @Test
    public void testSearch() {

        long startTime = System.currentTimeMillis();
        ISort sorter = (ISort) new MergeSort();
        sorter.sort(numbers);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Sorter " + elapsedTime);

        int i = 3;
        int isearched = searcher.search(numbers, numbers[i]);
        assertTrue(isearched == i);

    }

}
