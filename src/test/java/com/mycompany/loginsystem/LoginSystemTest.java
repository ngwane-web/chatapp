/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginSystemTest {
    
    public LoginSystemTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    {
    }

    /**
     * Test of validateUser method, of class LoginSystem.
     */
    @org.junit.jupiter.api.Test
    public void testValidateUser() {
        System.out.println("validateUser");
        String uName = "kyl_1";
        boolean expResult = true;
        boolean result = LoginSystem.validateUser(uName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkPass method, of class LoginSystem.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPass() {
        System.out.println("checkPass");
        String pword = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = LoginSystem.checkPass(pword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isPhoneValid method, of class LoginSystem.
     */
    @org.junit.jupiter.api.Test
    public void testIsPhoneValid() {
        System.out.println("isPhoneValid");
        String cell = "+27838968976";
        boolean expResult = true;
        boolean result = LoginSystem.isPhoneValid(cell);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doRegistration method, of class LoginSystem.
     */
    @org.junit.jupiter.api.Test
    public void testDoRegistration() {
        System.out.println("doRegistration");
        String uName = "kyl_1";
        String pword = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = LoginSystem.doRegistration(uName, pword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class LoginSystem.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
