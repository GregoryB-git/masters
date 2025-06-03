package s5;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import h5.a;

/* loaded from: classes.dex */
public final class f {
    public static void a(a.C0105a c0105a) {
        c0105a.f7119k = -3.4028235E38f;
        c0105a.f7118j = Integer.MIN_VALUE;
        CharSequence charSequence = c0105a.f7110a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0105a.f7110a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0105a.f7110a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(float f, int i10, int i11, int i12) {
        float f10;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f10 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f10 = i11;
        }
        return f * f10;
    }
}
