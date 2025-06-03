/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.RelativeLayout
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class FixedAspectRatioRelativeLayout
extends RelativeLayout {
    public FixedAspectRatioRelativeLayout(Context context) {
        super(context);
    }

    public FixedAspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int n, int n2) {
        n = View.MeasureSpec.getSize((int)n);
        n2 = n * 9 / 16;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000));
    }
}

