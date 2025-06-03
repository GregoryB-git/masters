// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f0;

import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.Spannable;

public abstract class f
{
    public static void a(final Spannable spannable, float n, final int n2, final int n3, final int n4) {
        final RelativeSizeSpan[] array = (RelativeSizeSpan[])((Spanned)spannable).getSpans(n2, n3, (Class)RelativeSizeSpan.class);
        float n5;
        for (int length = array.length, i = 0; i < length; ++i, n = n5) {
            final RelativeSizeSpan relativeSizeSpan = array[i];
            n5 = n;
            if (((Spanned)spannable).getSpanStart((Object)relativeSizeSpan) <= n2) {
                n5 = n;
                if (((Spanned)spannable).getSpanEnd((Object)relativeSizeSpan) >= n3) {
                    n5 = n * relativeSizeSpan.getSizeChange();
                }
            }
            c(spannable, relativeSizeSpan, n2, n3, n4);
        }
        spannable.setSpan((Object)new RelativeSizeSpan(n), n2, n3, n4);
    }
    
    public static void b(final Spannable spannable, final Object o, final int n, final int n2, final int n3) {
        final Object[] spans = ((Spanned)spannable).getSpans(n, n2, (Class)o.getClass());
        for (int length = spans.length, i = 0; i < length; ++i) {
            c(spannable, spans[i], n, n2, n3);
        }
        spannable.setSpan(o, n, n2, n3);
    }
    
    public static void c(final Spannable spannable, final Object o, final int n, final int n2, final int n3) {
        if (((Spanned)spannable).getSpanStart(o) == n && ((Spanned)spannable).getSpanEnd(o) == n2 && ((Spanned)spannable).getSpanFlags(o) == n3) {
            spannable.removeSpan(o);
        }
    }
}
