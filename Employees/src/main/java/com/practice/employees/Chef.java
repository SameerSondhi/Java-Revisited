package com.practice.employees;

public interface Chef {
    String favoriteFood = "hamburger"; // This is made final by Java
    default void cook(String food){
        System.out.println("I am now cooking " + food);
    }

    default String cleanUp(){
        return "I'm done cleaning up";
    }

    default  String getFavoriteFood(){
        return favoriteFood;
    }
}
