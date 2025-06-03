/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$LayoutParams
 *  androidx.recyclerview.widget.RecyclerView$State
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hintsolutions.raintv.utils.CommonUtils;

public class DividerItemDecoration
extends RecyclerView.ItemDecoration {
    private Drawable mDivider;
    private boolean mShowFirstDivider = false;
    private boolean mShowLastDivider = false;
    private boolean withLeftMargin;

    public DividerItemDecoration(Context context, AttributeSet attributeSet) {
        this.withLeftMargin = true;
        context = context.obtainStyledAttributes(attributeSet, new int[]{16843284});
        this.mDivider = context.getDrawable(0);
        context.recycle();
    }

    public DividerItemDecoration(Context context, AttributeSet attributeSet, boolean bl, boolean bl2) {
        this(context, attributeSet);
        this.mShowFirstDivider = bl;
        this.mShowLastDivider = bl2;
    }

    public DividerItemDecoration(Drawable drawable) {
        this.withLeftMargin = true;
        this.mDivider = drawable;
    }

    public DividerItemDecoration(Drawable drawable, boolean bl) {
        this.mDivider = drawable;
        this.withLeftMargin = bl;
    }

    public DividerItemDecoration(Drawable drawable, boolean bl, boolean bl2) {
        this(drawable);
        this.mShowFirstDivider = bl;
        this.mShowLastDivider = bl2;
    }

    private int getOrientation(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager)recyclerView.getLayoutManager()).getOrientation();
        }
        throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.mDivider == null) {
            return;
        }
        if (recyclerView.getChildPosition(view) < 1) {
            return;
        }
        if (this.getOrientation(recyclerView) == 1) {
            rect.top = this.mDivider.getIntrinsicHeight();
        } else {
            rect.left = this.mDivider.getIntrinsicWidth();
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.mDivider == null) {
            super.onDrawOver(canvas, recyclerView, state);
            return;
        }
        int n5 = this.getOrientation(recyclerView);
        int n6 = recyclerView.getChildCount();
        int n7 = 0;
        if (n5 == 1) {
            this.mDivider.getIntrinsicHeight();
            n4 = recyclerView.getPaddingLeft();
            n3 = recyclerView.getWidth();
            n2 = recyclerView.getPaddingRight();
            n = 0;
            n2 = n3 - n2;
            n3 = 0;
        } else {
            this.mDivider.getIntrinsicWidth();
            n3 = recyclerView.getPaddingTop();
            n4 = recyclerView.getHeight();
            n = recyclerView.getPaddingBottom();
            n2 = 0;
            n = n4 - n;
            n4 = 0;
        }
        try {
            if (this.withLeftMargin) {
                n7 = CommonUtils.dpToPx(recyclerView.getContext(), 72);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            n7 = n4;
        }
        int n8 = this.mShowFirstDivider ^ 1;
        n4 = n;
        n = n7;
        for (n7 = n8; n7 < n6; ++n7) {
            state = recyclerView.getChildAt(n7);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)state.getLayoutParams();
            if (n5 == 1) {
                n3 = state.getTop() - layoutParams.topMargin;
                n4 = n3 + 1;
            } else {
                n = state.getLeft() - layoutParams.leftMargin;
                n2 = n + 1;
            }
            this.mDivider.setBounds(n, n3, n2, n4);
            this.mDivider.draw(canvas);
        }
        if (this.mShowLastDivider && n6 > 0) {
            recyclerView = recyclerView.getChildAt(n6 - 1);
            state = (RecyclerView.LayoutParams)recyclerView.getLayoutParams();
            if (n5 == 1) {
                n3 = recyclerView.getBottom() + state.bottomMargin;
                n4 = n3 + 1;
            } else {
                n = recyclerView.getRight() + state.rightMargin;
                n2 = n + 1;
            }
            this.mDivider.setBounds(n, n3, n2, n4);
            this.mDivider.draw(canvas);
        }
    }
}

