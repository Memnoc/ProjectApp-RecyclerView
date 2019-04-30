package com.smartdroidesign.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Items> mExampleList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Variables for the views
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        // Assigning values to the views
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    /**
     *
     * @param exampleList the ArrayList from MainActivity.java
     */
    public Adapter(ArrayList<Items> exampleList) {
        mExampleList = exampleList;
    }

    /**
     * Passing the layout we want to inflate
     * @param viewGroup - The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param i - The view type of the new View.
     * @return - A new ViewHolder that holds a View of the given view type.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example_item, viewGroup, false);
        ViewHolder evh = new ViewHolder(v);
        return evh;
    }

    /**
     *
     * @param viewHolder The ViewHolder which should be updated to represent the contents of the item at the given position in the data set.
     * @param i The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Items currentItem = mExampleList.get(i);

        viewHolder.mImageView.setImageResource(currentItem.getImageResource());
        viewHolder.mTextView1.setText(currentItem.getTextOne());
        viewHolder.mTextView2.setText(currentItem.getTextTwo());
    }

    /**
     *
     * @return Returns the total number of items in the data set held by the adapter.
     * .size() makes sure only the requested items are returned
     */
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
