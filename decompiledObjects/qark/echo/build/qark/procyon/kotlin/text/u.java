// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import java.util.NoSuchElementException;
import l6.d;
import kotlin.jvm.internal.Intrinsics;

public class u extends t
{
    public static final String g0(String substring, final int i) {
        Intrinsics.checkNotNullParameter(substring, "<this>");
        if (i >= 0) {
            substring = substring.substring(d.b(i, substring.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static char h0(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(s.x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
