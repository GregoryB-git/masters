package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class u extends t {
    public static final String g0(String str, int i7) {
        int b7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 >= 0) {
            b7 = l6.f.b(i7, str.length());
            String substring = str.substring(b7);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    public static char h0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(s.x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
