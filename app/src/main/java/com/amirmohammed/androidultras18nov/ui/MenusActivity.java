package com.amirmohammed.androidultras18nov.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.google.android.material.button.MaterialButton;

public class MenusActivity extends AppCompatActivity {

    MaterialButton materialButtonContextMenu, materialButtonPopUpMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        materialButtonContextMenu = findViewById(R.id.btn_context_menu);
        materialButtonPopUpMenu = findViewById(R.id.btn_pop_up_menu);

        registerForContextMenu(materialButtonContextMenu);
        registerForContextMenu(materialButtonPopUpMenu);

        materialButtonPopUpMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MenusActivity.this, materialButtonPopUpMenu);
                popupMenu.getMenuInflater().inflate(R.menu.pop_up_menu, popupMenu.getMenu());
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.item_edit) {
                            Toast.makeText(MenusActivity.this, "Edit click", Toast.LENGTH_SHORT).show();
                        } else if (item.getItemId() == R.id.item_delete) {
                            Toast.makeText(MenusActivity.this, "Delete click", Toast.LENGTH_SHORT).show();
                        } else if (item.getItemId() == R.id.item_report) {
                            Toast.makeText(MenusActivity.this, "Report click", Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optional_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_mail) {
            Toast.makeText(MenusActivity.this, "Mail", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.item_logout) {
            Toast.makeText(MenusActivity.this, "Logout", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        if (view.getId() == R.id.btn_context_menu) {
            getMenuInflater().inflate(R.menu.context_menu, menu);

        } else if (view.getId() == R.id.btn_pop_up_menu) {
            getMenuInflater().inflate(R.menu.optional_menu, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_copy_text) {
            Toast.makeText(MenusActivity.this, "Text copied", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}