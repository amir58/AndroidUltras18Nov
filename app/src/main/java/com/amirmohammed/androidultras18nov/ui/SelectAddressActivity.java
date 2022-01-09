package com.amirmohammed.androidultras18nov.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.google.android.material.button.MaterialButton;

public class SelectAddressActivity extends AppCompatActivity {

    EditText editText;
    MaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_address);

        editText = findViewById(R.id.et_address);
        materialButton = findViewById(R.id.btn_confirm_address);

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address = editText.getText().toString();

                if (address.isEmpty()){
                    Toast.makeText(SelectAddressActivity.this, "Address required", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent();
                intent.putExtra("address", address);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }
}