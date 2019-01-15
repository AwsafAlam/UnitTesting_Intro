package calc;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;


public class CalculatorTest { // Initialized with ctrl + Shift + T

    private Calculator testObj;

    @Before
    public void setUp() throws Exception {
    }

    public CalculatorTest() {
        this.testObj = new Calculator(10,20);
    }

    @Test
    public void tearDown() throws Exception {
    }

    @Test
    public void test1() {
        assertEquals(20,testObj.Add());
    }

    @Test
    public void testgetA() {
        System.out.println("Testings getA");

    }

    @Test
    public void testsetA() {
        System.out.println("Testing set A");
    }

    @Test
    public void testgetB() {
        System.out.println("testing setB");
    }

    @Test
    public void testsetB() {
        System.out.println("Testsing setB");
    }

    @Test
    public void testadd() {
        System.out.println("Testing add..");

    }



}