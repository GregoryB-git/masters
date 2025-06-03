/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.style.RelativeSizeSpan
 *  java.lang.Class
 *  java.lang.Object
 */
package f0;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

public abstract class f {
    public static void a(Spannable spannable, float f8, int n8, int n9, int n10) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[])spannable.getSpans(n8, n9, RelativeSizeSpan.class)) {
            float f9 = f8;
            if (spannable.getSpanStart((Object)relativeSizeSpan) <= n8) {
                f9 = f8;
                if (spannable.getSpanEnd((Object)relativeSizeSpan) >= n9) {
                    f9 = f8 * relativeSizeSpan.getSizeChange();
                }
            }
            f.c(spannable, (Object)relativeSizeSpan, n8, n9, n10);
            f8 = f9;
        }
        spannable.setSpan((Object)new RelativeSizeSpan(f8), n8, n9, n10);
    }

    public static void b(Spannable spannable, Object object, int n8, int n9, int n10) {
        Object[] arrobject = spannable.getSpans(n8, n9, object.getClass());
        int n11 = arrobject.length;
        for (int i8 = 0; i8 < n11; ++i8) {
            f.c(spannable, arrobject[i8], n8, n9, n10);
        }
        spannable.setSpan(object, n8, n9, n10);
    }

    public static void c(Spannable spannable, Object object, int n8, int n9, int n10) {
        if (spannable.getSpanStart(object) == n8 && spannable.getSpanEnd(object) == n9 && spannable.getSpanFlags(object) == n10) {
            spannable.removeSpan(object);
        }
    }
}

