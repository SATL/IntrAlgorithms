/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import intralgorithms.chp2.Ex2_3_7;
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
public class Ex2_3_7Test {

    protected int[] numbers;
    protected final static int SIZE = 7;
    protected final static int MAX = 20;

    private Ex2_3_7 searcher;

    @Before
    public void setUp() {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
        searcher = new Ex2_3_7();
    }

    @After
    public void tearDown() {
    }
    @Test
    public void searchSumCorrect() {
        assert (searcher.checkExistSumInArray(numbers, numbers[2] + numbers[5]));
    }
    @Test
    public void workAgain() {
        assert (searcher.checkExistSumInArray(numbers, numbers[2] + numbers[5]));
    }
    
    @Test
    public void searchSumInCorrect() {
        assert(!searcher.checkExistSumInArray(numbers, Integer.MAX_VALUE-1));
    }
}
