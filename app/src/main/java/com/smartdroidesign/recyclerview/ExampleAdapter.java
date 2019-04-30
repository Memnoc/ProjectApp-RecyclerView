package com.smartdroidesign.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExampleItems;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        // Variables for the views
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        // Assigning values to the views
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        mExampleItems = exampleList;
    }

    /**
     * Passing the layout we want to inflate
     * @param viewGroup
     * @param i
     * @return the ViewHolder
     */
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example_item, viewGroup, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        ExampleItem currentItem = mExampleItems.get(i);

        exampleViewHolder.mImageView.setImageResource(currentItem.getImageResource());
        exampleViewHolder.mTextView1.setText(currentItem.getTextOne());
        exampleViewHolder.mTextView2.setText(currentItem.getTextTwo());
    }

    @Override
    public int getItemCount() {
        return mExampleItems.size();
    }
}
