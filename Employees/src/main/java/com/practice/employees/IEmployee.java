package com.practice.employees;

public interface IEmployee extends Comparable<IEmployee> {
    // All methods in an interface are considered to be public
    // Classes can only extend one class, but implement multiple interfaces
    int getSalary();
}

// If you have several classes that implement the same method, but internally do something different with that method
// And if those classes don't have anything else in common --> use an interface

// If you have several classes that share same data/fields and/or implement same code
// This is where a super class will be the better choice

// If you don't want to permit anyone to instantiate a class, but subclasses must implement a certain method no matter what
// Declare an abstract class and even abstract methods

// Interfaces that define more than one method, lambda expressions cannot be utilized