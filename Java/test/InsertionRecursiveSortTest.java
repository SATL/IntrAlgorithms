/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import intralgorithms.chp2.InsertionSort;
import intralgorithms.chp2.InsertionSortRecursive;
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
public class InsertionRecursiveSortTest extends SortTest {


    public InsertionRecursiveSortTest() {
        sorter = new InsertionSortRecursive();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }


    @After
    public void tearDown() {
    }
}
