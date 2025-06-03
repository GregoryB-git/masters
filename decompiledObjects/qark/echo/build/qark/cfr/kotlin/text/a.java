/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package kotlin.text;

import kotlin.text.CharsKt__CharJVMKt;

public class a
extends CharsKt__CharJVMKt {
    public static int c(char c8) {
        int n8 = CharsKt__CharJVMKt.a(c8, 10);
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Char ");
        stringBuilder.append(c8);
        stringBuilder.append(" is not a decimal digit");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final boolean d(char c8, char c9, boolean bl) {
        boolean bl2 = true;
        if (c8 == c9) {
            return true;
        }
        if (!bl) {
            return false;
        }
        c8 = Character.toUpperCase((char)c8);
        c9 = Character.toUpperCase((char)c9);
        bl = bl2;
        if (c8 != c9) {
            if (Character.toLowerCase((char)c8) == Character.toLowerCase((char)c9)) {
                return true;
            }
            bl = false;
        }
        return bl;
    }
}

