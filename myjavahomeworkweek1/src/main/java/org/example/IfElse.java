package org.example;

public class IfElse {
    public static void main(String[] args) {
        int X = 18;
        int Y = 27;

        if (X > Y) {
            System.out.println(X + " is greater than " + Y);
        } else {
            System.out.println(X + " is less than " + Y);
        }

        int age = 18;

        if (age < 15) {
            System.out.println(age + "year old is not  eligible. ");
        } else {
            System.out.println(age + " year is eligible ");
        }
        int ageisNotEligible = 15;
        if (ageisNotEligible < 18) {
            System.out.println(ageisNotEligible + "year old is not eligible. ");
        }
        // Positive ,negative and zero
        int number = 0;
        if (number > 0) {
            System.out.println(number + " is positive  number");
        } else if (number < 0) {
            System.out.println(number + "is negative number");
        } else {
            System.out.println("number is  + number");
        }

      int even = 4;
        if (even%2 == 0){
            System.out.println(even + " is even number" );
        }
        int odd = 7;
        if (odd%2==1){
            System.out.println(odd + " is odd number" );

        }
    }









}













