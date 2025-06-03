/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.style.URLSpan
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Exception
 *  java.lang.Object
 */
package com.hintsolutions.raintv.utils;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import com.hintsolutions.raintv.utils.URLSpanNoUnderline;

public class ViewUtils {
    public static void removeViewFromParent(View view) {
        if (view != null) {
            try {
                if (view.getParent() != null) {
                    ((ViewGroup)view.getParent()).removeView(view);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void stripUnderlines(Spannable spannable) {
        for (URLSpan uRLSpan : (URLSpan[])spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int n = spannable.getSpanStart((Object)uRLSpan);
            int n2 = spannable.getSpanEnd((Object)uRLSpan);
            spannable.removeSpan((Object)uRLSpan);
            spannable.setSpan((Object)new URLSpanNoUnderline(uRLSpan.getURL()), n, n2, 0);
        }
    }
}

