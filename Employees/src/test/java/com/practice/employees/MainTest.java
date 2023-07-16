package com.practice.employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testNameToSalary() {
        Main main = new Main();
        main.main(new String[0]);
        int salary = main.getSalary("Jerry4");
        assertEquals(7500, salary);
    }

    @Test
    public void testBadNameToSalary() {
        Main main = new Main();
        main.main(new String[0]);
        int salary = main.getSalary("xxxxx");
        assertEquals(-1, salary);
    }



}