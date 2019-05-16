package ru.nbdev.androidapp3;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class SpacesItemDecorator extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecorator(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        //добавить переданное кол-во пикселей отступа снизу, кроме последнего элемента
        if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
            outRect.bottom = space;
        } else {
            outRect.bottom = 0;
        }
    }
}