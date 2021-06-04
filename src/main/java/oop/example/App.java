package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App 
{
    public static void main( String[] args )
    {
        Age userAge = new Age();
        System.out.println(userAge.getAge() < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.");
    }
}
