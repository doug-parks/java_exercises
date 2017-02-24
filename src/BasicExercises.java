/**
 * Created by arbybaconator on 2/20/17.
 */

import com.sun.tools.classfile.CharacterRangeTable_attribute;
import com.sun.tools.javac.main.JavaCompiler;
import sun.plugin.JavaRunTime;

import java.util.Scanner;


public class BasicExercises {

    public static void exercise1() {
        //1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Doug.");
    }

    public static void exercise2() {
        //2. Write a Java program to print the sum of two numbers.
        System.out.println("74 + 36 = " + (74 + 36));
    }

    public static void exercise3() {
        //3. Write a Java program to divide two numbers and print on the screen.
        System.out.println("50 / 3 = " + (50 / 3));
    }

    public static void exercise4() {
        //4. Write a Java program to print the result of the following operations.
        //Test Data:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3

        System.out.println("-5 + 8 * 6 = " + (-5 + (8 * 6)));
        System.out.println("(55+9) % 9 = " + ((55 + 9) % 9));
        System.out.println("20 + -3*5 / 8 = " + (20 + (-3 * 5) / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + ((15 / 3) * 2) - (8 % 3)));
    }

    public static void exercise5() {
        //Write a Java program that takes two numbers as input and display the product of two numbers.
        double number1 = input();
        double number2 = input();

        System.out.println("\nnumber 1: " + number1 + "\nnumber 2: " + number2 + "\nThe sum is: " +
                (number1 + number2));

    }

    public static void exercise6() {
        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        double number1 = input();
        double number2 = input();

        System.out.println("\nnumber 1: " + number1 + "\nnumber 2: " + number2);
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));

    }

    public static void exercise7() {
        //7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        double number1 = input();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number1 + " * " + i + " = " + (number1 * i));
        }
    }

    public static void exercise8() {
        //8. Write a Java program to display the following pattern.
        //   J    a   v     v  a
        //   J   a a   v   v  a a
        //J  J  aaaaa   V V  aaaaa
        // JJ  a     a   V  a     a

        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  j  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void exercise9() {
        //9. Write a Java program to compute the specified expressions and print the output.
        //Test Data:
        //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

        System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " +
                ((25.5 * 3.5) - (3.5 * 3.5)) / (40.5 - 4.5));
    }

    public static void exercise10() {
        //10. Write a Java program to compute a specified formula.
        //Specified Formula :
        //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

        System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = " +
                (4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11))));

    }

    public static void exercise11() {
        //11. Write a Java program to print the area and perimeter of a circle.
        double number1 = input();

        System.out.println("Your radius is: " + number1);
        System.out.println("The perimeter is: " + 2 * number1 * Math.PI);
        System.out.println("The area is: " + Math.PI * (number1 * number1));

    }

    public static void exercise12() {
        //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        double number1 = input();
        double number2 = input();
        double number3 = input();

        System.out.println("The average of " + number1 + ", " + number2 + ", " + number3 + " is: " +
                (number1 + number2 + number3) / 3);

    }

    public static void exercise13() {
        //13. Write a Java program to print the area and perimeter of a rectangle.
        double number1 = input();
        double number2 = input();

        System.out.println("Your width is: " + number1);
        System.out.println("Your height is: " + number2);
        System.out.println("The perimeter is: " + ((number1 * 2) + (number2 * 2)));
        System.out.println("The area is: " + number1 * number2);
    }

    public static void exercise14() {
        //14. Write a Java program to print an American flag on the screen.
        //Expected Output:
        //* * * * * * ==================================
        // * * * * *  ==================================
        //* * * * * * ==================================
        // * * * * *  ==================================
        //* * * * * * ==================================
        // * * * * *  ==================================
        //* * * * * * ==================================
        // * * * * *  ==================================
        //* * * * * * ==================================
        //==============================================
        //==============================================
        //==============================================
        //==============================================
        //==============================================
        //==============================================

        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 1; i <= 6; i++) {
            System.out.println("==============================================");
        }
    }

    public static void exercise15() {
        //15. Write a Java program to swap two variables.
        double number1 = input();
        double number2 = input();

        System.out.println("number1 is " + number1);
        System.out.println("number2 is " + number2);
        System.out.println("\n:::magic happens:::\n");

        double number3 = number1;
        number1 = number2;
        number2 = number3;

        System.out.println("number1 is " + number1);
        System.out.println("number2 is " + number2);
    }

    public static void exercise16() {
        //16. Write a Java program to print a face.
        /*
         +"""""+
        [| o o |]
         |  ^  |
         | '-' |
         +-----+
         */

        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }

    public static void exercise17() {
        //Write a Java program to add two binary numbers.
        int number1 = integerInput();
        int number2 = integerInput();
        int number3 = number1 + number2;

        System.out.println(Integer.toBinaryString(number1) + " + " + Integer.toBinaryString(number2) + " = " +
                Integer.toBinaryString(number3));
    }

    public static void exercise18() {
        //18. Write a Java program to multiply two binary numbers.
        int number1 = integerInput();
        int number2 = integerInput();
        int number3 = number1 * number2;

        System.out.println(Integer.toBinaryString(number1) + " * " + Integer.toBinaryString(number2) + " = " +
                Integer.toBinaryString(number3));
    }

    public static void exercise19() {
        //19. Write a Java program to convert a decimal number to binary number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int number = scanner.nextInt();

        while (number < 0 || number >= 20) {
            System.out.println("Number must be between 0-9");
            System.out.println("Please enter a decimal number: ");
            number = scanner.nextInt();
        }

        System.out.println("Your number is: " + number +
                " \nIn binary format it is: " + Integer.toBinaryString(number));

    }

    public static void exercise20() {
        //20. Write a Java program to convert a decimal number to hexadecimal number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int number = scanner.nextInt();

        while (number < 0 || number >= 20) {
            System.out.println("Number must be between 0-20");
            System.out.println("Please enter a decimal number: ");
            number = scanner.nextInt();
        }

        System.out.println("Your number is: " + number +
                " \nIn hexadecimal format it is: " + Integer.toHexString(number));
    }

    public static void exercise21() {
        //21. Write a Java program to convert a decimal number to octal number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int number = scanner.nextInt();

        while (number < 0 || number >= 20) {
            System.out.println("Number must be between 0-20");
            System.out.println("Please enter a decimal number: ");
            number = scanner.nextInt();
        }

        System.out.println("Your number is: " + number +
                " \nIn Octal format it is: " + Integer.toOctalString(number));
    }

    public static void exercise22() {
        //22. Write a Java program to convert a binary number to decimal number.

        //skip

    }

    public static void exercise31() {
        System.out.println("| Java Version:           " + JavaCompiler.version());
        System.out.println("| Java Runtime Version:   " + System.getProperty("java.runtime.version"));
        System.out.println("| Java Home:              " + System.getProperty("java.home"));
        System.out.println("| Java Vendor:            " + System.getProperty("java.vendor"));
        System.out.println("| Java Vendor URL:        " + System.getProperty("java.vendor.url"));
        System.out.println("| Java Class Path:        " + System.getProperty("java.class.path"));

    }

    public static void exercise32() {
        //32. Write a Java program to compare two numbers.
        //expected output:
        //25 != 39
        //25 < 39
        //25 <= 39

        int number1 = integerInput();
        int number2 = integerInput();

        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " != " + number2);
        }

        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else {
            System.out.println(number1 + " > " + number2);
        }

        if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        } else {
            System.out.println(number1 + " >= " + number2);
        }


    }

    public static void exercise33() {
        //33. Write a Java program and compute the sum of the digits of an integer.
        int number1 = integerInput();
        int length = String.valueOf(number1).length();
        char currentNumber = 0;
        int sum = 0;

        char[] array = String.valueOf(number1).toCharArray();

        for (int i = 0; i < length; i++) {
            currentNumber = array[i];
            sum = currentNumber + sum - 48; //subtract 48 to switch from ASCII value to actual value.
        }
        System.out.println("\nThe sum of the digits is: " + sum);
    }

    public static void exercise34() {
        //34. Write a Java program to compute the area of a hexagon.
        //Area of a hexagon = (6 * s^2)/(4*tan(π/6))
        //where s is the length of a side

        int number1 = integerInput();
        double area = ((6 * (number1 * number1)) / (4 * Math.tan(Math.PI / 6)));

        System.out.println("The area of a hexagon where each side has a length of " + number1 + " = " + area);
    }

    public static void exercise35() {
        //35. Write a Java program to compute the area of a polygon.
        //Area of a polygon = (n*s^2)/(4*tan(π/n))
        //where n is n-sided polygon and s is the length of a side

        int number1 = integerInput();
        int sides = integerInput();

        double area = (sides * (number1 * number1)) / (4.0 * Math.tan((Math.PI / sides)));

        System.out.println("The area of a polygon with " + sides + " sides of length " + number1 + " = " + area);
    }

    public static void exercise36() {
        //36. Write a Java program to compute the distance between two points on the surface of earth.
        //Distance between the two points [ (x1,y1) & (x2,y2)]
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        //Radius of the earth r = 6371.01 Kilometers
        //Input Data:
        //Input the lat of coordinate 1: 25
        //Input the lon of coordinate 1: 35
        //Input the lat of coordinate 2: 35.5
        //Input the lon of coordinate 2: 25.5
        //Expected Output

        //The distance between those points is: 1480.0848451069087 km

        System.out.println("We are going to compute the distance between two points on the surface of the earth. \n");
        System.out.println("What is the lat of coordinate 1?");
        double lat1 = input();

        System.out.println("What is the lon of coordinate 1?");
        double lon1 = input();

        System.out.println("What is the lat of coordinate 2?");
        double lat2 = input();

        System.out.println("What is the lon of coordinate 2?");
        double lon2 = input();

        //convert all points to radians

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        System.out.println("Here are your 2 locations: \n");
        System.out.println("Location 1: " + lat1 + ", " + lon1);
        System.out.println("Location 2: " + lat2 + ", " + lon2);



        double distance = (6371.01 * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2)));
        System.out.println("the distance between those two points is: " + distance);
    }

    public static void exercise37(){
        //Write a Java program to reverse a string.
        String string = stringInput(); //get a string from the console

        char[] charArray = string.toCharArray(); //convert the string to a char array
        char[] charArray2 = new char[string.length()]; //create a second char array of the same length

        for (int i = 0; i<string.length(); i++){
                charArray2[i] = charArray[string.length()-i-1]; //increment through charArray in reverse and assign
            }
        String newString = new String(charArray2); //create new string from charArray2
        System.out.println(newString); //print values
    }

    public static void exercise38(){
        //38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
        //Expected Output

        //letter: 23
        //space: 9
        //number: 10
        //other: 6

        int countLetter = 0;
        int countSpace = 0;
        int countNumber = 0;
        int countOther = 0;

        String string = stringInput();

        for (int i = 0; i < string.length(); i++){
            if (Character.isDigit(string.charAt(i))){
                countNumber++;
            }
            else if (Character.isAlphabetic(string.charAt(i))){
                countLetter++;
            }
            else if (Character.isSpace(string.charAt(i))){
                countSpace++;
            }
            else {
                countOther++;
            }
        }
        System.out.println("Letters: " + countLetter);
        System.out.println("Numbers: " + countNumber);
        System.out.println("Spaces: " + countSpace);
        System.out.println("Others: " + countOther);
    }

    public static void exercise39(){
        //39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
        //Also count how many three-digit numbers are there.

        int amount = 0;
        for(int i = 0; i< 4; i++){
            for (int j = 0; j < 4; j++){
                for (int k = 0; k < 4; k++){
                    if (k != i && k != j && i != j){
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("The total amount of unique 3 digit numbers is: " + amount);
    }

    public static double input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double number = scanner.nextDouble();
        return number;
    }

    public static int integerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static String stringInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }


}

