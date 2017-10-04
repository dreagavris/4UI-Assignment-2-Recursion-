/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4u.assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author andreeagavris
 */
public class A2Q1To7 {
    // create a method that includes a integer of n for the users input

    public int digitalSum(int n) {
        // if the users input is larger than zero and smaller then 9 do the following
        if (n >= 0 && n <= 9) {
            // then you just return 
            return n;

        }
        // Create integers that excute the equations in order to get the result of the users input
        int mod = n % 10;
        int div = n / 10;
        int sum = mod + digitalSum(div);
        return (sum);

    }
    // Create a method called digitalRoot and put the input for the users

    public int digitalRoot(int n) {
        // n will become the digitalsum or also known as the result.  
        n = digitalSum(n);
        // if the users input is larger than zero and smaller then 9 then return user input
        if (n >= 0 && n <= 9) {
            return n;
            // Create integers that excute the equations in order to get the result of the users input
        }
        int mod = n % 10;
        int divide = n / 10;
        // create an int take the mod + method and take the result of the divided number. 
        int ans = mod + digitalRoot(divide);
        // return the answer
        return ans;
    }
    // create a method called triangle with the users input n

    public int triangle(int n) {
        // if n equals 0 the return users input. 
        if (n == 0) {
            return n;

        }
        // cretae a int called result that will take the number and go through the triganlge and subtract 1
        int result = n + triangle(n - 1);
        // return the result
        return result;

    }
    //create a method called hailstone that has an int n

    public int hailstone(int n) {
        // print out the users input
        System.out.println(n);
        // if n equals 1 then return the input back
        if (n == 1) {
            return n;
        }
        //If the remainder equals 0 then keep dividing the result by 2
        if (n % 2 == 0) {
            hailstone(n / 2);
        } else {
            // if the number cant be divided evenly by 2 then do the go through the method 
            hailstone(3 * n + 1);
        }
        // return n 
        return n;
    }
    // create a method call binaryConvert that includes a int where the user can input 

    public String binaryConvert(int n) {
        // Create a String that stores the numbers
        String binary = new String();
        // if the number can be divided by two do the following
        if (n % 2 == 0) {
            //make the String start at 0
            binary = ("0");
            // but if n is odd then add 1            
            //if it cant be divided evenly by 2 then print out 1
        } else if (n % 2 == 1) {
            binary = ("1");
        }
        // if n equals 1
        if (n == 1) {
            // return the answer
            return binary;
        }
        // Adding the binary to the result of the calculations
        String answer = binaryConvert(n / 2) + binary;
        return answer;
    }
    // create a method that includes int n and int x

    public String convert(int n, int x) {
        // string created to store the numbers 
        String numb = new String();
        //letters a to f are put into a string 
        String[] letters = {"A", "B", "C", "D", "E", "F"};
        //if n is able to convert into a number  
        if (n % x >= 10) {
            // letters added from the string 
            numb = numb + letters[n % x - 10];
            //else if the number doesnt convert into a letter then add the convereted number
        } else if (n % x >= 2 || n % x < 10) {
            numb = numb + n % x;
        }
        //number is returned when it is 0 
        if (n / x == 0) {
            return numb;
        }
        //number is divided and base int 
        String answer = convert(n / x, x) + numb;
        //return the answer 
        return answer;
    }
    // Create a boolean Palindrome that includes the String

    public boolean Palindrome(String s) {
        //create an int called length and that looks at the length of the user input.
        int length = s.length();
        // if the length of the input is smaller then 1 then return true.
        if (length <= 1) {
            return true;

        }
        // create a strings that looks at the first postion and the last positon.
        String firstPosition = s.substring(0, 1);
        // the last postion is the length - 1
        String lastPostion = s.substring(s.length() - 1, s.length());
        // if the first postion equals the last postion then move inwards to the other potions and repeat the process
        if (firstPosition.equals(lastPostion)) {
            return Palindrome(s.substring(1, length - 1));

        } else {
            // that cant be done then return false.
            return false;

        }

    }

    public static void main(String[] args) {
        // Test out all of the methods to insure that they are working properly 
        A2Q1To7 test = new A2Q1To7();
        // test DigitalSum and print out the answers
        int answer = test.digitalSum(2019);
        System.out.println("The sum of the intergers is " + answer);
        // test DigitalRoot and print out the answers
        int answer2 = test.digitalRoot(2019);
        System.out.println("The root of the intergers is " + answer2);
        // test the triangle method and print out the answers
        int answer3 = test.triangle(3);
        int sample1 = test.triangle(0);
        System.out.println("Trangle(0): " + sample1);
        int sample2 = test.triangle(1);
        System.out.println("Trangle(1): " + sample2);
        int sample3 = test.triangle(2);
        System.out.println("Trangle(2): " + sample3);
        int sample4 = test.triangle(3);
        System.out.println("Trangle(3): " + sample4);
        // test Hailstone and print out the answers
        System.out.println("Hailstone(5): ");
        test.hailstone(5);
        System.out.println("Hailstone(12): ");
        test.hailstone(12);
        // test the method binaryConvert and print out the results
        String result1 = test.binaryConvert(18);
        System.out.println("Binary converet 18: " + result1);
        String result2 = test.binaryConvert(35);
        System.out.println("Binary converet 35: " + result2);
        String result3 = test.binaryConvert(65);
        System.out.println("Binary converet 65: " + result3);
        // test Convert and print out the answers
        String return1 = test.convert(1000, 8);
        System.out.println("Convert(1000,8):" + return1);
        String return2 = test.convert(1000, 16);
        System.out.println("Convert(1008,16):" + return2);
        String return3 = test.convert(1000, 2);
        System.out.println("Convert(1008,20):" + return3);
        boolean test1 = test.Palindrome("321123");
        System.out.println("Palindrome(racecar,7):" + test1);

    }

}
