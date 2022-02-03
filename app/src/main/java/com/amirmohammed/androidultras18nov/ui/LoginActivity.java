package com.amirmohammed.androidultras18nov.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.Book;
import com.amirmohammed.androidultras18nov.models.Product;

import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "Login";

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

        arrayList();
    }

    private void arrayList() {
        String names[] = new String[6];

        names[0] = "Amir";
        System.out.println(names[0]);

        ArrayList<String> ourNames = new ArrayList<>();

        ourNames.add("Amir"); // 0 => Amir
        ourNames.add("Ahmed"); // 1 => Ahmed
        ourNames.add("Mohamed"); // 2 => Mohamed
        ourNames.add("Ali"); // 3 => Ali
        ourNames.add("Ashraf"); // 4 => Ashraf
        ourNames.add("Sayed"); // 5 => Sayed

        System.out.println(ourNames.get(0));

        System.out.println(ourNames.isEmpty());

        System.out.println(ourNames.size());

        System.out.println(ourNames.contains("Amir"));

        System.out.println(ourNames.indexOf("Ali"));

        System.out.println(ourNames.remove("Amir"));

        System.out.println(ourNames.remove(0));

        ourNames.clear();

        // CRUD => Create , Read , Update , Delete
        // Facebook
        // posts => size = 20
        // using addAll

        // - - - - - - - - - - - - - - -
        // 0 => {productId, merchantId, price, name, description, image}
        // 1 => {productId, merchantId, price, name, description, image}
        // 2 => {productId, merchantId, price, name, description, image}
        // - - - - - - - - - - - - - - -

        // Product => productId, merchantId, price, name, description, image
        ArrayList<Product> products = new ArrayList<>();

        Product product = new Product(1,1,4.5,"Salt","image");

        products.add(product);

        Product productTwo = new Product(2,1,5,"Pepsi","image");

        products.add(productTwo);

        products.get(0).setPrice(1); // update

        for (Product ourProduct : products) {
            ourProduct.printProductData();
        }

        System.out.println("- - - - - - - - - - - - - - -");

        for (int i = 0; i < products.size(); i++) {
//            System.out.println(products.get(i).toString());
            products.get(i).printProductData();
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

    @Override
    protected void onStart() {
        super.onStart();
        // start timer
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
}