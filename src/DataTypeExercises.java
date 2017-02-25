/**
 * Created by DJP4830 on 2/24/2017.
 */

import java.text.SimpleDateFormat;

public class DataTypeExercises {


    public static void exercise1() {
        //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        //Test Data
        //Input a degree in Fahrenheit: 212
        //Expected Output :
        //212.0 degree Fahrenheit is equal to 100.0 in Celsius

        //Deduct 32, then multiply by 5, then divide by 9

        double number1 = UtilityClasses.input();
        double celcius = ((number1 - 32) * 5) / 9;

        System.out.println(number1 + "\u2109" + " = " + String.format("%.1f", celcius) + "\u2103");
    }

    public static void exercise2() {
        //2. Write a Java program that reads a number in inches, converts it to meters

        double number1 = UtilityClasses.input();
        double meters = number1*0.0254;

        System.out.println(number1 + "\"" + " = " + String.format("%.1f", meters) + "m");

    }

    public static void exercise3() {
        //3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        int number1 = -1;
        int sum = 0;

        while (number1 < 0 || number1 > 1000){
            System.out.println("Please enter a number between 0 and 1000");
            number1 = UtilityClasses.integerInput();
        }

        for ( int i = 0; i<number1; i++){
            sum = i + sum;
        }

        System.out.println("the sum of all digits from 0 - " + number1 + " is: " + sum);
    }

    public static void exercise4() {
        //4. Write a Java program to convert minutes into a number of years and days.
        long minutes = UtilityClasses.longInput();
        long days = (minutes / 60) / 24;
        long years = days/365;

        System.out.println(minutes + " minutes \n" + days + " days \n" + years + " years \n");
    }

    public static void exercise5() {
        //5. Write a Java program that prints the current time in GMT.
        //SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzz");


    }

    public static void exercise6() {
        //6. Write a Java program to compute body mass index (BMI).
        //BMI = weight/(height" x height") x 703
        System.out.println("Please enter your weight");
        double weight = UtilityClasses.input();

        System.out.println("please enter your height, in inches");
        double height = UtilityClasses.input();

        double bmi = (weight/(height * height)) * 703;

        System.out.println("Your BMI is: " + bmi);
    }

    public static void exercise7() {
        //7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers:
        // hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour
        // (hint: 1 mile = 1609 meters).
    }

    public static void exercise8() {
        //8. Write a Java program that reads a number and display the square, cube, and fourth power.

        double number1 = UtilityClasses.input();
        double square = number1 * number1;
        double cube = square * number1;
        double fourth = cube * number1;

        System.out.println("Your number: " + number1);
        System.out.println("Your number squared: " + square);
        System.out.println("Your number cubed: " + cube);
        System.out.println("Your number to the fourth power: " + fourth);

    }

    public static void exercise9() {
        //9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product,
        // the average, the distance (the difference between integer), the maximum (the larger of the two integers),
        // the minimum (smaller of the two integers).

        double number1 = UtilityClasses.input();
        double number2 = UtilityClasses.input();

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + (number1+number2));
        System.out.println("The difference between " + number1 + " and " + number2 + " is: " + (number1-number2));
        System.out.println("The product of " + number1 + " and " + number2 + " is: " + (number1*number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is: " + (number1+number2)/2);
        System.out.println("The distance between " + number1 + " and " + number2 + " is: " + Math.abs(number1-number2));
        System.out.println("The largest between " + number1 + " and " + number2 + " is: " + Math.max(number1,number2));
        System.out.println("The smallest between " + number1 + " and " + number2 + " is: " +
                Math.min(number1,number2));
    }

    public static void exercise10() {
        //10. Write a Java program to break an integer into a sequence of individual digits.
        int number1 = UtilityClasses.integerInput();
        String newString = "";

        String string = Integer.toString(number1);

        for(int i = 0; i < string.length(); i++){
            newString = newString + (string.charAt(i))+ " ";
        }
        System.out.println(newString);
    }
}
