package com.example.imaimiami.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ImageActivity extends ActionBarActivity {

    private int imageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();
        imageId = intent.getIntExtra(EXTRA_IMAGE_ID, -1);

        Button button = (Button) findViewById(R.id.submit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageActivity.this, "button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static final String EXTRA_IMAGE_ID = "image_id";

    public static Intent createIntent(Activity from, int imageId) {
        Intent intent = new Intent(from, ImageActivity.class);
        intent.putExtra(EXTRA_IMAGE_ID, imageId);
        return intent;
    }

}
