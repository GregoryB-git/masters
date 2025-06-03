/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 *  java.lang.Object
 */
package ru.tvrain.core.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class CustomTypefaceSpan
extends MetricAffectingSpan {
    private final Typeface mTypeface;

    public CustomTypefaceSpan(Typeface typeface) {
        this.mTypeface = typeface;
    }

    private static void apply(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int n3 = typeface2 == null ? 0 : typeface2.getStyle();
        if (((n3 &= ~typeface.getStyle()) & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((n3 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        CustomTypefaceSpan.apply((Paint)textPaint, this.mTypeface);
    }

    public void updateMeasureState(TextPaint textPaint) {
        CustomTypefaceSpan.apply((Paint)textPaint, this.mTypeface);
    }
}

