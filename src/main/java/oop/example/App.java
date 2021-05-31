package oop.example;


public class App 
{
    public static void main( String[] args )
    {
        Age userAge = new Age();
        System.out.println(userAge.getAge() < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.");
    }
}
