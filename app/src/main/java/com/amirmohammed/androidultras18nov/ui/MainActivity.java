package com.amirmohammed.androidultras18nov.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.Book;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Main";
    MaterialButton materialButtonCall, materialButtonShare, materialButtonPickImage,
            materialButtonAddress, materialButtonMenus;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialButtonCall = findViewById(R.id.btn_call);
        materialButtonShare = findViewById(R.id.btn_share);
        materialButtonPickImage = findViewById(R.id.btn_pick_image);
        materialButtonAddress = findViewById(R.id.btn_address);
        materialButtonMenus = findViewById(R.id.btn_menus);
        imageView = findViewById(R.id.iv_main);

        materialButtonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call();
            }
        });

        materialButtonAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectAddress();
            }
        });

        materialButtonMenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenusActivity.class);
                startActivity(intent);
            }
        });

        materialButtonShare.setOnClickListener(v -> share());

        materialButtonPickImage.setOnClickListener(v -> pickImage());

        getIntentData();
    }

    private void selectAddress() {
        Intent intent = new Intent(MainActivity.this, SelectAddressActivity.class);
        startActivityForResult(intent, 2);
    }

    private void pickImage() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_PICK);
        intent.setType("image/*");

        startActivityForResult(intent, 1);
    }

    void shareImage(Uri uriToImage) {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_STREAM, uriToImage);
        shareIntent.setType("image/*");
        startActivity(Intent.createChooser(shareIntent, null));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            Uri uri = data.getData();
            Log.i(TAG, "onActivityResult: " + uri);
            imageView.setImageURI(uri);
            shareImage(uri);
        } else if (requestCode == 1 && resultCode == RESULT_CANCELED) {
            Toast.makeText(MainActivity.this, "No image selected!", Toast.LENGTH_SHORT).show();
        }
        else if(requestCode == 2 && resultCode == RESULT_OK&& data != null){
            String address = data.getStringExtra("address");
            Log.i(TAG, "onActivityResult: " + address);
            materialButtonAddress.setText(address);
        }
    }

    private void getIntentData() {
        String email = getIntent().getStringExtra("email");

        Log.i(TAG, "onCreate: " + email);
        Log.e(TAG, "onCreate: " + email);

        Book book = (Book) getIntent().getSerializableExtra("book");
        book.printBookData();

        Log.i(TAG, "onCreate: " + book.toString());
    }

    private void call() {
        String number = "01116036522";
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);
    }

    private void share() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }

}
