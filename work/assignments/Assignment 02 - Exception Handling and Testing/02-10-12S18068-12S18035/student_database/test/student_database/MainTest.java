/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_database;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulus
 */
public class MainTest {
    
    public MainTest() {
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
     * Test of add method, of class Main.
     */
    @Test
    public void testAdd() {
        Main.reset();
        
        Main.add("12S17067", "Fradina");
        assertEquals(1, Main.count());
        Main.add("12S18001", "Cindy");
        assertEquals(2, Main.count());
        Main.add("12S18002", "Wiranda");
        assertEquals(3, Main.count());
        Main.add("12S18003", "Citra");
        assertEquals(4, Main.count());
        Main.add("12S18004", "Rosalia");
        assertEquals(5, Main.count());

    }

    /**
     * Test of find method, of class Main.
     */
    @Test
    public void testFind() {
        String result;
        Main.reset();
        
        Main.add("12S17067", "Fradina");
        Main.add("12S18001", "Cindy");
        Main.add("12S18002", "Wiranda");
        Main.add("12S18003", "Citra");
        Main.add("12S18004", "Rosalia");
        
        result = Main.find("12S17067");
        assertEquals("12S17067 Fradina", result);
        
        result = Main.find("12S18003");
        assertEquals("12S18003 Citra", result);
        
        result = Main.find("12S18006");
        assertEquals("", result);

    }

    /**
     * Test of count method, of class Main.
     */
    @Test
    public void testCountNoData() {
        Main.reset();
 
        assertEquals(0, Main.count());
    }
 
    /**
    * Test of count method, of class Main.
    */
 
    @Test
    public void testCountSomeData() {
 
        Main.reset();
 
        Main.add("12S17067", "Fradina");
        Main.add("12S18001", "Cindy");
        Main.add("12S18002", "Wiranda");
        Main.add("12S18003", "Citra");
        Main.add("12S18004", "Rosalia");
 
        assertEquals(5, Main.count());
    }

    /**
     * Test of reset method, of class Main.
     */
    @Test
    public void testReset() {
        Main.reset();
        assertEquals(0, Main.count());
 
        Main.add("12S17067", "Fradina");
        Main.add("12S18001", "Cindy");
        Main.reset();
        assertEquals(0, Main.count());
        
        Main.add("12S18002", "Wiranda");
        Main.add("12S18003", "Citra");
        Main.add("12S18004", "Rosalia");
        Main.reset();
        assertEquals(0, Main.count());

    }
    
}
