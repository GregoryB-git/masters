/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.twitter.sdk.android.tweetui.R;

public class AspectRatioFrameLayout
extends FrameLayout {
    public static final int ADJUST_DIMENSION_HEIGHT = 0;
    public static final int ADJUST_DIMENSION_WIDTH = 1;
    private static final int DEFAULT_ADJUST_DIMENSION = 0;
    private static final float DEFAULT_ASPECT_RATIO = 1.0f;
    public double aspectRatio;
    private int dimensionToAdjust;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.initAttributes(n);
    }

    private void initAttributes(int n) {
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(n, R.styleable.AspectRatioFrameLayout);
        try {
            this.aspectRatio = typedArray.getFloat(R.styleable.AspectRatioFrameLayout_tw__frame_layout_aspect_ratio, 1.0f);
            this.dimensionToAdjust = typedArray.getInt(R.styleable.AspectRatioFrameLayout_tw__frame_layout_dimension_to_adjust, 0);
            return;
        }
        finally {
            typedArray.recycle();
        }
    }

    public void onMeasure(int n, int n3) {
        int n4 = this.getPaddingLeft();
        n4 = this.getPaddingRight() + n4;
        int n5 = this.getPaddingBottom();
        n5 = this.getPaddingTop() + n5;
        if (this.dimensionToAdjust == 0) {
            if (View.MeasureSpec.getMode((int)n) == 0x40000000) {
                n = View.MeasureSpec.getSize((int)n);
            } else {
                super.onMeasure(n, n3);
                n = this.getMeasuredWidth();
            }
            n3 = n - n4;
            n = (int)((double)n3 / this.aspectRatio);
        } else {
            if (View.MeasureSpec.getMode((int)n3) == 0x40000000) {
                n = View.MeasureSpec.getSize((int)n3);
            } else {
                super.onMeasure(n, n3);
                n = this.getMeasuredHeight();
            }
            n3 = (int)((double)(n -= n5) * this.aspectRatio);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)(n3 + n4), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n + n5), (int)0x40000000));
    }

    public void setAspectRatio(double d2) {
        this.aspectRatio = d2;
    }
}

