package com.company;

public class Main {

    public static void main(String[] args) {
        String firstName = "Shannon";
        String lastName = "Foster";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + ".");
        int lettersInName = firstName.length() + lastName.length();
        System.out.println("There are " + lettersInName + " letters in my name.");
    }
}
