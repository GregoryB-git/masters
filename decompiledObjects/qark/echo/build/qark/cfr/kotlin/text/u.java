/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.NoSuchElementException
 */
package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.t;
import l6.d;

public class u
extends t {
    public static final String g0(String string2, int n8) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        if (n8 >= 0) {
            string2 = string2.substring(d.b(n8, string2.length()));
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            return string2;
        }
        string2 = new StringBuilder();
        string2.append("Requested character count ");
        string2.append(n8);
        string2.append(" is less than zero.");
        throw new IllegalArgumentException(string2.toString().toString());
    }

    public static char h0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(s.x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}

