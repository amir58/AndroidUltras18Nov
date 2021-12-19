package com.amirmohammed.androidultras18nov.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.Book;
import com.amirmohammed.androidultras18nov.models.User;
import com.amirmohammed.androidultras18nov.screens.BaseScreen;
import com.amirmohammed.androidultras18nov.screens.CashScreen;
import com.amirmohammed.androidultras18nov.screens.HomeScreen;
import com.amirmohammed.androidultras18nov.screens.ITest;

// OOP => Class, Object
// OOP => Encapsulation, Inheritance, Polymorphism, Abstraction
public class MainActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    Button buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextEmail = findViewById(R.id.et_email);
        editTextPassword = findViewById(R.id.et_password);

        buttonTest = findViewById(R.id.btn_test);

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Test Button", Toast.LENGTH_SHORT).show();
            }
        });

        // Object
        // ClassName objectName = new ClassName();


        Book bookOne = new Book(
                "Android",
                100,
                "Google Developers",
                "350",
                "Programming"
        );
        System.out.println(bookOne.getBookPrice());
        System.out.println(bookOne.getBookPriceDollar());

        bookOne.setBookPrice(1);


        Book bookTwo = new Book(
                "iOS",
                250,
                "Apple Developers",
                "500",
                "Programming"
        );

        User.carer = "Programmers";

        User user = new User("Amir");
        System.out.println(user.name);
        System.out.println(User.carer);

        User user2 = new User("Ahmed");
        System.out.println(user2.name);
        System.out.println(User.carer);

        String inputNumber = "30";
        int numberOne = Integer.parseInt(inputNumber);

        String textNumber = String.valueOf(numberOne);

//        BaseScreen baseScreen = new BaseScreen() {
//            @Override
//            protected void startLoadingAnimation() {
//
//            }
//        };

        // LoginScreen loginScreen = new BaseScreen();

        ITest iTest = new ITest() {
            @Override
            public void sum() {

            }
        };

        iTest.sum();
        iTest.multi();

        String orderState = "onWay";

        if (orderState.equals("pending")) {

        } else if (orderState.equals(OrderStates.ON_WAY.state)) {

        } else if (orderState.equals(OrderStates.COMPLETE.state)) {

        }
        else{

        }

        String userType = UserTypes.PHARMACY.value;

        if (userType.equals(UserTypes.VISITOR.value)){
            // hide pharmacy and stock offers
        }



    }

    public void login(View view) {
        System.out.println("Login");

        String email = editTextEmail.getText().toString();

        if (email.isEmpty()) {
            editTextEmail.setError("Email required");
            return;
        }

        String password = editTextPassword.getText().toString();

        if (password.isEmpty()) {
            editTextPassword.setError("Password required");
            return;
        }

        System.out.println(email);
        System.out.println(password);

        if (email.equals("amir@gmail.com") && password.equals("123")) {
            System.out.println("Success");
            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_LONG).show();

        } else {
            System.out.println("Email or password wrong");
            Toast.makeText(MainActivity.this, "Email or password wrong", Toast.LENGTH_LONG).show();
        }

    }

    public void openRegister(View view) {
        System.out.println("Register");
        Toast.makeText(MainActivity.this, "Soon", Toast.LENGTH_SHORT).show();
    }

}
