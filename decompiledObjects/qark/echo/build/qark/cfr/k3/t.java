/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.security.SecureRandom
 *  java.util.Objects
 */
package k3;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import k3.a;
import k3.s;

public abstract class t {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public static Integer a() {
        if (!t.b()) {
            return null;
        }
        return a.a();
    }

    public static boolean b() {
        return Objects.equals((Object)System.getProperty((String)"java.vendor"), (Object)"The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] arrby = new byte[4];
        int n8 = 0;
        while (n8 == 0) {
            secureRandom.nextBytes(arrby);
            n8 = (arrby[0] & 127) << 24 | (arrby[1] & 255) << 16 | (arrby[2] & 255) << 8 | arrby[3] & 255;
        }
        return n8;
    }

    public static final byte d(char c8) {
        if (c8 >= '!' && c8 <= '~') {
            return (byte)c8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a printable ASCII character: ");
        stringBuilder.append(c8);
        throw new s(stringBuilder.toString());
    }

    public static final r3.a e(String string2) {
        byte[] arrby = new byte[string2.length()];
        for (int i8 = 0; i8 < string2.length(); ++i8) {
            arrby[i8] = t.d(string2.charAt(i8));
        }
        return r3.a.a(arrby);
    }
}

