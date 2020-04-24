package com.example.demoapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Hero> {
    List<Hero> heroList;
    Context context;

    public ListViewAdapter(List<Hero> heroList, Context context){

        super(context, R.layout.custom_layout_listview, heroList);
        this.heroList = heroList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View listviewitem = inflater.inflate(R.layout.custom_layout_listview, null, true);
        TextView name = listviewitem.findViewById(R.id.name);
        TextView imageurl = listviewitem.findViewById(R.id.imageurl);
        ImageView imageView = listviewitem.findViewById(R.id.imageview);

        Hero hero = heroList.get(position);

        name.setText(hero.getName());
        imageurl.setText(hero.getImageURL());
        Picasso.get().load(hero.getImageURL()).into(imageView);

        return listviewitem;
    }
}
