/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.URLSpan
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.utils;

import android.text.TextPaint;
import android.text.style.URLSpan;

public class URLSpanNoUnderline
extends URLSpan {
    public URLSpanNoUnderline(String string2) {
        super(string2);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

