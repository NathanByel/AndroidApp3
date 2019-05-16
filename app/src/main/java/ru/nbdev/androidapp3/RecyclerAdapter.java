package ru.nbdev.androidapp3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerAdapter extends RecyclerView.Adapter {

    private List<Integer> items;

    public RecyclerAdapter(List<Integer> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new CardViewHolder (v);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((CardViewHolder)holder).imgView.setImageResource(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgView;
        public CardViewHolder(View view) {
            super(view);
            imgView = view.findViewById(R.id.recycler_image);
        }
    }

}
