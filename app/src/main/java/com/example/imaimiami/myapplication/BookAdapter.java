package com.example.imaimiami.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import com.example.imaimiami.myapplication.model.Book;

public class BookAdapter extends ArrayAdapter<Book> {

    private LayoutInflater layoutInflater;
    Context context;

    public BookAdapter(Context context) {
        super(context, 0);
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.carditem_image, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        Book book = getItem(position);
        viewHolder.titleText.setText(book.getFirstComment());
//        viewHolder.descriptionText.setText(book.getUrl());
//        viewHolder.thumbnailImage.setImage(book.getImageUrl());
        Picasso.with(this.context).load(book.getImageUrl()).into(viewHolder.thumbnailImage);
//        Picasso.with(this.context).load(book.getFirstCommentAvatar()).into(viewHolder.iconImage);
        return view;
    }

    private static class ViewHolder {

        private ImageView thumbnailImage;
        private ImageView iconImage;

        private TextView titleText;

//        private TextView descriptionText;

        public ViewHolder(View rootView) {
            this.thumbnailImage = (ImageView) rootView.findViewById(R.id.thumbnail_image);
//            this.iconImage = (ImageView) rootView.findViewById(R.id.icon_image);
            this.titleText = (TextView) rootView.findViewById(R.id.title_text);
//            this.descriptionText = (TextView) rootView.findViewById(R.id.description_text);
        }
    }

}
