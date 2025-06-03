package f0;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1285f {
    public static void a(Spannable spannable, float f7, int i7, int i8, int i9) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i7, i8, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i7 && spannable.getSpanEnd(relativeSizeSpan) >= i8) {
                f7 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i7, i8, i9);
        }
        spannable.setSpan(new RelativeSizeSpan(f7), i7, i8, i9);
    }

    public static void b(Spannable spannable, Object obj, int i7, int i8, int i9) {
        for (Object obj2 : spannable.getSpans(i7, i8, obj.getClass())) {
            c(spannable, obj2, i7, i8, i9);
        }
        spannable.setSpan(obj, i7, i8, i9);
    }

    public static void c(Spannable spannable, Object obj, int i7, int i8, int i9) {
        if (spannable.getSpanStart(obj) == i7 && spannable.getSpanEnd(obj) == i8 && spannable.getSpanFlags(obj) == i9) {
            spannable.removeSpan(obj);
        }
    }
}
