package com.practice.employees;

import java.time.LocalDate;

public record RandomPerson(String lastName, String firstName, LocalDate dob) {
    public RandomPerson(String lastName, String firstName){
        this(lastName, firstName, null); // Will need to be passed three attributes
    }

    public String sayHello(){
        return "Hello";
    }
}
