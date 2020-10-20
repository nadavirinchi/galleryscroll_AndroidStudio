package com.example.galleryscroll;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter {

    Context context;

    public  GalleryAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return animal.animalimages.length;
    }

    @Override
    public Object getItem(int i) {
        return animal.animalimages[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(animal.animalimages[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(1000,1000));
        imageView.setPadding(100,100,100,100);
        return imageView;
    }
}
