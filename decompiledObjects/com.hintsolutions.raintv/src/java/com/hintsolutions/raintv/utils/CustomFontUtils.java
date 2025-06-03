/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.hintsolutions.raintv.R;
import com.hintsolutions.raintv.utils.FontCache;

public class CustomFontUtils {
    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public static Typeface applyCustomFont(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CustomFontTextView);
        String string2 = typedArray.getString(0);
        int n = attributeSet.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", 0);
        typedArray.recycle();
        return CustomFontUtils.selectTypeface(context, string2, n);
    }

    public static void applyCustomFontForToolbar(Context context, Toolbar toolbar, int n) {
        String string2 = context.getString(n);
        for (n = 0; n < toolbar.getChildCount(); ++n) {
            View view = toolbar.getChildAt(n);
            if (!(view instanceof TextView)) continue;
            ((TextView)view).setTypeface(CustomFontUtils.selectTypeface(context, string2, 0));
        }
    }

    public static Typeface selectTypeface(Context context, int n) {
        return CustomFontUtils.selectTypeface(context, context.getString(n), 0);
    }

    public static Typeface selectTypeface(Context context, String string2, int n) {
        return FontCache.getTypeface(string2, context);
    }
}

