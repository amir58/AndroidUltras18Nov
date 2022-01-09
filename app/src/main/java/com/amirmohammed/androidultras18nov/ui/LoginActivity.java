package com.amirmohammed.androidultras18nov.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.Book;

public class LoginActivity extends AppCompatActivity {


    EditText editTextEmail;
    EditText editTextPassword;

    Button buttonTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.et_email);
        editTextPassword = findViewById(R.id.et_password);

        buttonTest = findViewById(R.id.btn_test);

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Test Button", Toast.LENGTH_SHORT).show();
            }
        });

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
            Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("email", email); // key , value

            Book book = new Book("Android", 200, "Google", "450", "Development");
            intent.putExtra("book", book);

            startActivity(intent);
            finish();

        } else {
            System.out.println("Email or password wrong");
            Toast.makeText(LoginActivity.this, "Email or password wrong", Toast.LENGTH_LONG).show();
        }

    }


    public void openRegister(View view) {
//        Toast.makeText(LoginActivity.this, "Soon", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }


}