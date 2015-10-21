package com.example.imaimiami.myapplication;

import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.imaimiami.myapplication.model.Image;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<Image> {

    private LayoutInflater layoutInflater;

    public ImageAdapter(Context context) {
        super(context, 0);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.listitem_image, parent, false);
        TextView titleText = (TextView)view.findViewById(R.id.title_text);
        TextView descriptionText = (TextView)view.findViewById(R.id.description_text);
        ImageView imageView = (ImageView)view.findViewById(R.id.thumbnail_image);

        Image image = getItem(position);

        titleText.setText(image.getTitle());
        descriptionText.setText(image.getUrl());
        imageView.setImageResource(R.drawable.tvos_comment);

        return view;
    }

}
