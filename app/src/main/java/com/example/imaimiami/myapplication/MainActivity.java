package com.example.imaimiami.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import com.example.imaimiami.myapplication.model.Image;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private ListView listView;

    private ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.image_list);
        adapter = new ImageAdapter(this);
        adapter.add(new Image(0, "title0", "http://www.xyz..."));
        adapter.add(new Image(1, "title1", "http://www.xyz..."));
        adapter.add(new Image(2, "title2", "http://www.xyz..."));
        listView.setAdapter(adapter);

        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show();

//        Intent intent = ImageActivity.createIntent(this, 1);
//        startActivity(intent);
    }
}