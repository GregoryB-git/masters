/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package D6;

import java.nio.charset.Charset;

public abstract class g {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public static boolean a(byte[] arrby, int n8, byte[] arrby2, int n9, int n10) {
        for (int i8 = 0; i8 < n10; ++i8) {
            if (arrby[i8 + n8] == arrby2[i8 + n9]) continue;
            return false;
        }
        return true;
    }

    public static void b(long l8, long l9, long l10) {
        if ((l9 | l10) >= 0L && l9 <= l8 && l8 - l9 >= l10) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException(String.format((String)"size=%s offset=%s byteCount=%s", (Object[])new Object[]{l8, l9, l10}));
    }
}

