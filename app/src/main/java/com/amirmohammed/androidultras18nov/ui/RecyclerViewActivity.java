package com.amirmohammed.androidultras18nov.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.adapters.OurNamesAdapter;

import java.util.ArrayList;

// RecyclerView => 3
// 1 : Design ( custom_layout )
// 2 : ArrayList<Data>
// 3 : Adapter (5) => constructor, holder, itemCount, onCreateViewHolder, onBindViewHolder
public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<String> ourNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        insertNames();
        insertNames();
        insertNames();
        insertNames();
        insertNames();
        insertNames();

        OurNamesAdapter adapter = new OurNamesAdapter(ourNames);
        RecyclerView recyclerView = findViewById(R.id.rv_our_names);
        recyclerView.setAdapter(adapter);
    }

    private void insertNames(){
        ourNames.add("Amir");
        ourNames.add("Mostafa");
        ourNames.add("Aya");
        ourNames.add("Omar A");
        ourNames.add("Muhamed");
        ourNames.add("Omar M");
    }
}