/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$State
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalSpaceItemDecoration
extends RecyclerView.ItemDecoration {
    private final int spaceBetween;
    private final int spaceLeft;
    private final int spaceRight;

    public HorizontalSpaceItemDecoration(int n) {
        this.spaceBetween = n;
        this.spaceLeft = 0;
        this.spaceRight = 0;
    }

    public HorizontalSpaceItemDecoration(int n, int n2, int n3) {
        this.spaceBetween = n;
        this.spaceLeft = n2;
        this.spaceRight = n3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int n = recyclerView.getChildAdapterPosition(view);
        if (n == 0) {
            rect.left = this.spaceLeft;
        }
        rect.right = n == recyclerView.getAdapter().getItemCount() - 1 ? this.spaceRight : this.spaceBetween;
    }
}

