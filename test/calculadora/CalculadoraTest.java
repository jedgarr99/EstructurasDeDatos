/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class CalculadoraTest {
    public CalculadoraTest() {
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
     * Test of revisaTodo method, of class Calculadora.
     */
    @Test
    public void testRevisaTodo() {
        System.out.println("revisaTodo");
        String infijo = "6+3*9+(4-3)";
        boolean expResult = true;
        boolean result = Calculadora.revisaTodo(infijo);
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminarExcesos method, of class Calculadora.
     */
    @Test
    public void testEliminarExcesos() {
        System.out.println("eliminarExcesos");
        String oper = "5++++3----4---3";
        String expResult = "5+3+4-3";
        String result = Calculadora.eliminarExcesos(oper);
        assertEquals(expResult, result);

    }

    /**
     * Test of convertirPostfijo method, of class Calculadora.
     */
    @Test
    public void testConvertirPostfijo() {
        System.out.println("convertirPostfijo");
        String exp = "5+3-4+(9*3)+6";
        String expResult = "5 3 + 4 - 9 3 * + 6 + ";
        String result = Calculadora.convertirPostfijo(exp);
        assertEquals(expResult, result);
    
      
    }

    /**
     * Test of evaluarPostfijo method, of class Calculadora.
     */
    @Test
    public void testEvaluarPostfijo() {
        System.out.println("evaluarPostfijo");
        String postfijo = "5 3 + 4 - 9 3 * + 6 + ";
        double expResult = 37.0;
        double result = Calculadora.evaluarPostfijo(postfijo);
        assertEquals(expResult, result, 0.0);

    }

   
    
}
