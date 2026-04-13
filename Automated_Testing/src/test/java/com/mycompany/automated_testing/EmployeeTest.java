/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of calculateSalary method, of class Employee.
     */
    @Test
    public void testCalculateSalary() {
//        System.out.println("calculateSalary");
//        double bonus = 0.0;
//        double taxRate = 0.0;
//        Employee instance = null;
//        double expResult = 0.0;
//        double result = instance.calculateSalary(bonus, taxRate);
//        assertEquals(expResult, result, 0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
        // Manual
        
        // Declarations
        double salary = 5000;
        double bonusTwo = 1000;
        double taxRateTwo = 0.15;
        
        // Create an Instance of Employee
        Employee e = new Employee(salary);
        
        // EXPECTED | ACTUAL
        double expected = 5100;
        double actual = e.calculateSalary(bonusTwo, taxRateTwo) ;
        
        // Implemented Test
        Assertions.assertEquals(expected, actual, 0.01);
    }
    
}
