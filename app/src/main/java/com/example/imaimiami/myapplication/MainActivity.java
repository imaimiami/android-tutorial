package com.example.imaimiami.myapplication;

import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import com.example.imaimiami.myapplication.model.Image;
import com.example.imaimiami.myapplication.model.Images;
import android.content.Intent;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;

import com.example.imaimiami.myapplication.api.ServiceProvider;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

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

//        ServiceProvider.getApiService().fetchImages(new Callback<Images>() {
//            @Override
//            public void success(Images images, Response response) {
//                adapter.addAll(images.getImages());
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Toast.makeText(getApplicationContext(), "Failed to fetch images",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Image image = adapter.getItem(position);
                Intent intent = ImageActivity.createIntent(MainActivity.this, image.getId());
                startActivity(intent);
            }
        });

        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show();

//        Intent intent = ImageActivity.createIntent(this, 1);
//        startActivity(intent);
    }
}