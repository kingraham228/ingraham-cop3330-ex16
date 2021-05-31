package oop.example;

import java.util.Scanner;

public class Age {

    public double getAge(){
        Scanner input = new Scanner(System.in);
        double age;
        do {
            System.out.println("Enter your age: ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid age.");
                System.out.println("Enter your age: ");
            }
            age = input.nextDouble();
            if (age < 0) {
                System.out.println("Age cannot be a negative value.");
            }
        } while (age < 0);
        return age;
    }


}
