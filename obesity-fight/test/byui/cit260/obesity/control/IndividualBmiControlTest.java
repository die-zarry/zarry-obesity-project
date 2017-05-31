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
public class IndividualBmiControlTest {
    
    public IndividualBmiControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBmiOfIndividual method, of class IndividualBmiControl.
     */
    @Test
    public void testCalcBmiOfIndividual() {
        System.out.println("calcBmiOfIndividual");
        
        /*****************
         * Test case #1
         * ***********/
        System.out.println("\test case #1");
        // input values for test case 1
        double weight = 91.0;
        double height = 58.0;
        // create instance of IndividualBmiControl class
        IndividualBmiControl instance = new IndividualBmiControl();
        double expResult = 19.0; // expected output retunred value
        // call the function 
        double result = instance.calcBmiOfIndividual(weight, height);
        // comapare expected return value with actual value returned
        assertEquals(expResult, result, 0.05);
        
    }
    
    {
        System.out.println("calcBmiOfIndividual");
        
        /*****************
         * Test case #2
         * ***********/
        System.out.println("\test case #2");
        // input values for test case 1
        double weight = 133.0;
        double height = 60.0;
        // create instance of IndividualBmiControl class
        IndividualBmiControl instance = new IndividualBmiControl();
        double expResult = 26; // expected output retunred value
        // call the function 
        double result = instance.calcBmiOfIndividual(weight, height);
        // comapare expected return value with actual value returned
        assertEquals(expResult, result, 0.05);
        
    }
    
    {
        System.out.println("calcBmiOfIndividual");
        
        /*****************
         * Test case # 3
         * ***********/
        System.out.println("\test case # 3");
        // input values for test case 3
        double weight = 197.0;
        double height = 76.0;
        // create instance of IndividualBmiControl class
        IndividualBmiControl instance = new IndividualBmiControl();
        double expResult = 24.0; // expected output retunred value
        // call the function 
        double result = instance.calcBmiOfIndividual(weight, height);
        // comapare expected return value with actual value returned
        assertEquals(expResult, result, 0.05);
        
    }
    {
        System.out.println("calcBmiOfIndividual");
        
        /*****************
         * Test case #4
         * ***********/
        System.out.println("\test case #4");
        // input values for test case 4
        double weight = 246.0;
        double height = 76.0;
        // create instance of IndividualBmiControl class
        IndividualBmiControl instance = new IndividualBmiControl();
        double expResult = 30.0; // expected output retunred value
        // call the function 
        double result = instance.calcBmiOfIndividual(weight, height);
        // comapare expected return value with actual value returned
        assertEquals(expResult, result, 0.5);
        
    }
    {
        System.out.println("calcBmiOfIndividual");
        
        /*****************
         * Test case #5
         * ***********/
        System.out.println("\test case #5");
        // input values for test case 5
        double weight = 203.0;
        double height = 63.0;
        // create instance of IndividualBmiControl class
        IndividualBmiControl instance = new IndividualBmiControl();
        double expResult = 36.0; // expected output retunred value
        // call the function 
        double result = instance.calcBmiOfIndividual(weight, height);
        // comapare expected return value with actual value returned
        assertEquals(expResult, result, 0.5);
        
    }
    {
        System.out.println("calcBmiOfIndividual");
        
        /*****************
         * Test case #6
         * ***********/
        System.out.println("\test case #6");
        // input values for test case 6
        double weight = 311.0;
        double height = 75.0;
        // create instance of IndividualBmiControl class
        IndividualBmiControl instance = new IndividualBmiControl();
        double expResult = 39.0; // expected output retunred value
        // call the function 
        double result = instance.calcBmiOfIndividual(weight, height);
        // comapare expected return value with actual value returned
        assertEquals(expResult, result, 0.8);
        
    }
    
}
