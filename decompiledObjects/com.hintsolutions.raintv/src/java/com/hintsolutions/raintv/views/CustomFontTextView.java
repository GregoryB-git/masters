/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatTextView
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.hintsolutions.raintv.utils.CustomFontUtils;

public class CustomFontTextView
extends AppCompatTextView {
    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(CustomFontUtils.applyCustomFont(context, attributeSet));
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
        this.setTypeface(CustomFontUtils.applyCustomFont(context, attributeSet));
    }
}

