/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8y9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edi
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculaArea method, of class Circulo.
     */
    @Test
    public void testCalculaArea() {
        System.out.println("calculaArea");
        Circulo instance = new Circulo(5);
        double expResult = 78.5;
        double result = instance.calculaArea();
        assertEquals(expResult, result, .1);

    }

    /**
     * Test of calculaPeri method, of class Circulo.
     */
    @Test
    public void testCalculaPeri() {
        System.out.println("calculaPeri");
        Circulo instance = null;
        double expResult = 0.0;
        double result = instance.calculaPeri();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRadio method, of class Circulo.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulo instance = null;
        double expResult = 0.0;
        double result = instance.getRadio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Circulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circulo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
