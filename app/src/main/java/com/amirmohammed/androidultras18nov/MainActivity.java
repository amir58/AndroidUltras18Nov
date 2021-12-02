package com.amirmohammed.androidultras18nov;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.et_email);
        editTextPassword = findViewById(R.id.et_password);
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
