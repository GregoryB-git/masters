/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package kotlin.text;

import kotlin.Metadata;
import l6.c;

@Metadata
class CharsKt__CharJVMKt {
    public static final int a(char c8, int n8) {
        return Character.digit((int)c8, (int)n8);
    }

    public static final boolean b(char c8) {
        if (!Character.isWhitespace((char)c8) && !Character.isSpaceChar((char)c8)) {
            return false;
        }
        return true;
    }

    public static final int checkRadix(int n8) {
        if (2 <= n8 && n8 < 37) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("radix ");
        stringBuilder.append(n8);
        stringBuilder.append(" was not in valid range ");
        stringBuilder.append((Object)new c(2, 36));
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

