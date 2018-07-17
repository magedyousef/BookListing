package com.example.maged.booklisting;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(MainActivity context, ArrayList<Book> books_list) {
        super(context, 0, books_list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_item, parent, false);
        }
        Book currentBook = getItem(position);

        TextView book_name = (TextView) listItemView.findViewById(R.id.book_name);
        book_name.setText(currentBook.getName());

        TextView book_author = (TextView) listItemView.findViewById(R.id.book_author);
        book_author.setText(currentBook.getAuthor());

        return listItemView;
    }
}
