/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wdc
 */
public class WeightLossControlTest {
    
    public WeightLossControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcweightLossPercentage method, of class WeightLossControl.
     */
    @Test
    public void testCalcweightLossPercentage() {
        System.out.println("calcweightLossPercentage");
        /************
         * Test #1
         * ************/
        System.out.println("test case # 1");
        // input values for test case # 1
        double startWeight = 150.0;
        double currentWeight = 140.0;
        long age = 16L;
        // create instance of WeightLossControl class
        WeightLossControl instance = new WeightLossControl();
        // expected output returned value
        double expResult = 6.67 ;
        // call function to run test
        double result = instance.calcweightLossPercentage(startWeight, currentWeight, age);
        assertEquals(expResult, result, 1.5);
        
    }
    {
        System.out.println("calcweightLossPercentage");
        /************
         * Test #2
         * ************/
        System.out.println("test case # 2");
        // input values for test case # 2
        double startWeight = 250.0;
        double currentWeight = 230.0;
        long age = 25L;
        // create instance of WeightLossControl class
        WeightLossControl instance = new WeightLossControl();
        // expected output returned value
        double expResult = 8.00 ;
        // call function to run test
        double result = instance.calcweightLossPercentage(startWeight, currentWeight, age);
        assertEquals(expResult, result, 0.8);
        
    }
    
    
    {
        System.out.println("calcweightLossPercentage");
        /************
         * Test #3
         * ************/
        System.out.println("test case # 3");
        // input values for test case # 3
        double startWeight = 300.0;
        double currentWeight = 250.0;
        long age = 28L;
        // create instance of WeightLossControl class
        WeightLossControl instance = new WeightLossControl();
        // expected output returned value
        double expResult = 16.67 ;
        // call function to run test
        double result = instance.calcweightLossPercentage(startWeight, currentWeight, age);
        assertEquals(expResult, result, 4);
        
    }
    
    {
        System.out.println("calcweightLossPercentage");
        /************
         * Test #4
         * ************/
        System.out.println("test case # 4");
        // input values for test case # 4
        double startWeight = 180.0;
        double currentWeight = 170.0;
        long age = 26L;
        // create instance of WeightLossControl class
        WeightLossControl instance = new WeightLossControl();
        // expected output returned value
        double expResult = 5.56 ;
        // call function to run test
        double result = instance.calcweightLossPercentage(startWeight, currentWeight, age);
        assertEquals(expResult, result, 4);
        
    }
    {
        System.out.println("calcweightLossPercentage");
        /************
         * Test #5
         * ************/
        System.out.println("test case # 5");
        // input values for test case # 5
        double startWeight = 200.0;
        double currentWeight = 175.0;
        long age = 29L;
        // create instance of WeightLossControl class
        WeightLossControl instance = new WeightLossControl();
        // expected output returned value
        double expResult = 12.25 ;
        // call function to run test
        double result = instance.calcweightLossPercentage(startWeight, currentWeight, age);
        assertEquals(expResult, result, 5);
        
    }
    
    
}

