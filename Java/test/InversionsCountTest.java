/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import intralgorithms.chp2.InversionsMergeSort;
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
public class InversionsCountTest {

    protected int[] numbers = {2,3,8,6,1};
    protected final static int SIZE = 7;
    protected final static int MAX = 20;

    private InversionsMergeSort counter;

    @Before
    public void setUp() {
        counter = new InversionsMergeSort();
    }

    @After
    public void tearDown() {
    }
    @Test
    public void searchSumCorrect() {
        assert (counter.count(numbers) == 5);
    }
}
