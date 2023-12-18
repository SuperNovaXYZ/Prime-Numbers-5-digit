/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.primesum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rapto
 */
public class PrimeSumTest {
    
    public PrimeSumTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumOfPrimesWithDigit5 method, of class PrimeSum.
     */
     @Test
    public void testSumOfPrimesWithDigit5_BasicInput() {
        int n = 100;
        int expResult = 117; // The sum of primes with the digit 5 up to 100
        int result = PrimeSum.sumOfPrimesWithDigit5(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumOfPrimesWithDigit5_LowerBound() {
        int n = 0;
        int expResult = 0; // No primes with the digit 5 in the range [0, 0]
        int result = PrimeSum.sumOfPrimesWithDigit5(n);
        assertEquals(expResult, result);
    }

@Test
public void testSumOfPrimesWithDigit5_PrimesWithDigit5() {
    int n = 30;
    int expResult = 5;
    int result = PrimeSum.sumOfPrimesWithDigit5(n);
    assertEquals(expResult, result, "The sum of primes with the digit 5 in the range [0, 30]");
}

    @Test
    public void testSumOfPrimesWithDigit5_EmptyRange() {
        int n = 1;
        int expResult = 0; // No primes with the digit 5 in the range [0, 1]
        int result = PrimeSum.sumOfPrimesWithDigit5(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testMain() {
        // Since the main method doesn't return anything or have a side effect,
        // you may just want to check that it doesn't throw an exception.
        assertDoesNotThrow(() -> PrimeSum.main(new String[]{}));
    }
}
