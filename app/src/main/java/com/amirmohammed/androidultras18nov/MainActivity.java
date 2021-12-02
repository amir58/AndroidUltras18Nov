package com.amirmohammed.androidultras18nov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // Class => Variables , Functions
    // Function ? functionName(){}

    // DataTypes => String , int , double , boolean
    // Variable => dataType variableName = value ;
    // name , phone , city , age , grade , isWorking

    String name = "ahmed mohamed";
    String phone = "+201116036522";
    String city = "Cairo";
    int age = 20;
    double grade = 1.5;
    boolean isWorking = false;

    // Naming
    // Class => MainActivity , LoginActivity , RegisterActivity , ForgetPasswordActivity
    // function ,  methods => onCreate , sum , sumAndPrint , loginWithEmailAndPassword
    // variables => name , phone , personalInformation
    // res => first_name , second_name , small_letters_with_underscores
    // Rules
//    int 1number; => wrong numbers
    // int @number; => wrong characters
    int _number;
    int $number;
    //int number one; => wrong spaces
    String ahmedMohamedAli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strings();

    }

    void strings(){
        // charAt , indexOf , contains , split , replace, replaceFirst, replaceAll
        // equal , startWith, endWith, concat, copyValue, toCharArray, length
        // trim, toLowerCase, toUpperCase

        String welcome = "Welcome to Android course.";

        boolean contains = welcome.contains("to");
        System.out.println(contains);

        System.out.println(welcome.charAt(8));

        System.out.println(welcome.indexOf("t"));

        String dateTime = "28/11/2021-8:30 PM";
        String dateTimeArray[] = dateTime.split("-");
        System.out.println(dateTime);
        System.out.println("dateTimeArray length => " + dateTimeArray.length);
        System.out.println("Date : " + dateTimeArray[0]);
        System.out.println("Time : " + dateTimeArray[1]);

        String myName = "Ahmed Mohammed";
        System.out.println(myName);
        myName =  myName.replace("Ahmed","Amir");
        System.out.println(myName);

        String phoneNumber = "+20111-6036-522";
        System.out.println(phoneNumber.length());
        System.out.println(phoneNumber);
        phoneNumber = phoneNumber.replaceFirst("\\+2", "");
        System.out.println(phoneNumber);
        phoneNumber = phoneNumber.replaceAll("-", "");
        System.out.println(phoneNumber.length());
        System.out.println(phoneNumber);

        System.out.println(phoneNumber.startsWith("+2"));
        System.out.println(phoneNumber.startsWith("0"));
        System.out.println(phoneNumber.endsWith("2"));

        String firstName = "Amir";
        firstName = firstName.concat("Mohammed");
        System.out.println(firstName);
        System.out.println(firstName + "Mohammed");

        char firstNameArray[] = firstName.toCharArray();
        for (int i = 0; i < firstNameArray.length; i++) {
            System.out.println(firstNameArray[i]);
        }

        System.out.println(String.copyValueOf(firstNameArray));

        System.out.println(welcome.toUpperCase());
        System.out.println(welcome.toLowerCase());

        String email = "   amir@gmail.com      ";
        String databaseEmail = "amir@gmail.com";

        System.out.println(email.equals(databaseEmail));

        email = email.trim();

        System.out.println(email.equals(databaseEmail));

    }

    void arrays(){
        String name1 = "Amir";
        String name2 = "Amir";
        String name3 = "Amir";
        String name4 = "Amir";
        String name5 = "Amir";
        String name6 = "Amir";
        String name7 = "Amir";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);
        System.out.println(name7);

        String names[] = {"Amir", "Ahmed", "Mohamed", "Abelrahman", "Omar", "Mostafa", "Ali"};
        // names[0] => Amir
        // names[1] => Ahmed
        // names[2] => Mohamed
        // names[3] => Abdlerahman
        // names[4] => Omar
        // names[5] => Mostafa
        // names[6] => Ali
        System.out.println(names[4]);
        for (int i = 0; i < 7; i++) {
            System.out.println(names[i]);
        }

        System.out.println("- - - - - - - - - - - - - - - -");

        String os[] = new String[10];
        os[0] = "Android";
        os[1] = "iOS";
        os[2] = "Windows";
        os[3] = "Mac";
        os[4] = "Linux";

        for (int i = 0; i < os.length; i++) {
            System.out.println("break");
            if (os[i] == null){
                break;
            }
            System.out.println(os[i]);
        }

        System.out.println("- - - - - - - - - - - - - - - -");

        for (String osName : os){
            System.out.println("continue");
            if (osName == null){
                continue;
            }
            System.out.println(osName);
        }

        System.out.println("- - - - - - - - - - - - - - - -");

        int salaries[] = new int[3];
        salaries[0] = 10000;
        salaries[1] = 4000;

        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }

    }

    void loops() {
        // Loops => for , while , do while
        // Loops controllers => break , continue

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("For loop => " + i);

        }

        System.out.println("End loops");
    }

    void conditions() {
        // Conditions => if , switch
        // if => if , if else , if else if else if else if else

        if (10 < 11) {
            System.out.println("Great");
        }

        if (5 > 4) {
            // run if true
            System.out.println("if condition run");
        } else {
            // run if false
            System.out.println("else condition run");
        }


        String orderState = "pending"; // pending , onWay , finished

        if (orderState.equals("pending")) {
            // run some code
            System.out.println("turn first circle light");

        } else if (orderState.equals("onWay")) {
            // run some code
            System.out.println("turn second circle light");

        } else if (orderState.equals("finished")) {
            // run some code
            System.out.println("turn third circle light");

        } else {
            // run some code
            System.out.println("order state unknown");
        }

        switch (orderState) {
            case "pending":
                System.out.println("Turn first circle light");
                break;

            case "onWay":
                System.out.println("Turn second circle light");
                break;

            case "finished":
                System.out.println("Turn third circle light");
                break;

            default:
                System.out.println("Turn circles light off");
                System.out.println("Order state unknown");
                break;
        }

        switch ("day") {
            case "friday":
            case "saturday":
                System.out.println("It's holiday");
                break;

            default:
                System.out.println("It's work day");
                break;
        }

    }

    void print() {
        // toPrint => sout
        System.out.println(name);
        System.out.println(phone);
        System.out.println(city);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(isWorking);

        System.out.println("- - - - - - - - - -");
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println();
    }

    void printMyName() {
        System.out.println("Amir Mohammed");
    }

    void sumTwoNumbersAndPrint(int numberOne, int numberTwo) {
        //int numberOne = 10;
        //int numberTwo = 15;
        int result = numberOne + numberTwo;
        System.out.println(result);
    }

    // returnType functionName ( parameters = variables ){
    //    body => write your code here
    // }

    // Operators
    // Arithmetic operator : = , + , - , * , / , % , ++ , --
    // increment ++ , decrement --
    // Comparison operators : > , < , >= , <= , == , !=
    // Logical operators : and && , or || , not !
    // Assignment operator : = , += , -= , *= , /= , %=

    void myOperators() {
        int number = 1;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        boolean graterThan = number > 10;
        boolean smallerThan = number < 5;
        boolean graterThanOrEqual = number >= 1;
        boolean smallerThanOrEqual = number <= 2;

        boolean equal = number == 1;
        boolean notEqual = number != 0;

        System.out.println(graterThan);
        System.out.println(smallerThan);
        System.out.println(graterThanOrEqual);
        System.out.println(smallerThanOrEqual);
        System.out.println(equal);
        System.out.println(notEqual);

        System.out.println("Logical operators : ");
        boolean working = true;
        // not true => false , not false => true
        System.out.println(!working);

        boolean andOne = (10 > 5 && 5 < 4);
        System.out.println(andOne);

        boolean andTwo = (1 > 2 && 2 < 3);
        System.out.println(andTwo);

        // email not empty && password not empty => true => send to server
        // email isEmpty || password isEmpty

        boolean orOne = (10 == 5 || 5 > 4);
        System.out.println(orOne);

        boolean orTwo = (10 > 20 || 20 > 30);
        System.out.println(orTwo);

        System.out.println("Assignment operators");
        // = , += , -= , *= , /= , %=
        int numberTwo = 1;

//        numberTwo = numberTwo + 4;
        numberTwo += 4;
        numberTwo *= 5;

        System.out.println(numberTwo);

        // Conditional operator , Instance Of
        String courseName = "android";
        boolean instanceOf = courseName instanceof String;
        System.out.println(instanceOf);

        // variable =  ( condition ) ? if true return this : if false return this
        String message = (4 > 5) ? "Number one grater than number two" : "Number one smaller than number two";
        System.out.println(message);

        Log.i("Main", "myOperators: " + message);
    }

}
