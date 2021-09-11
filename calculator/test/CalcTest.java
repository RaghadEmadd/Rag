/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author allae
 */
public class CalcTest {
    private Calculator objCalcUnderTest;
    public CalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         objCalcUnderTest = new Calculator();
    }
    
    @After
    public void tearDown() {
    }
 @Test  
    public void testAdd() { 
    int a = 15; int b = 20; 
    int expectedResult = 35;
    long result = Calculator.Add(a, b);
    Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
    int a = 25; int b = 20; 
    int expectedResult = 5; 
    long result = (long) Calculator.Subtract(a, b);
    Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
    int a = 10; int b = 25;
    long expectedResult = 250;
    long result = (long) Calculator.Multiply(a, b);
    Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
    int a = 56; int b = 10; 
    double expectedResult = 5.6; 
    double result = Calculator.Divide(a, b);
    Assert.assertEquals(expectedResult, result,0.00005); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() { 
    int a = 15; int b = 0;
    objCalcUnderTest.Divide(a, b);
    } 

}
