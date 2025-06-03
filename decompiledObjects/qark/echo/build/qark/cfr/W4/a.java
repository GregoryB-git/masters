/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.Map
 */
package W4;

import V4.c;
import V4.g;
import Y4.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class a
implements g {
    public static b b(String string2, V4.a a8, int n8, int n9, Charset charset, int n10, int n11) {
        if (a8 == V4.a.o) {
            return a.c(X4.c.d(string2.getBytes(charset), n10, n11), n8, n9);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf((Object)((Object)a8))));
    }

    public static b c(X4.a object, int n8, int n9) {
        if ((object = object.a()) != null) {
            int n10 = object.j();
            int n11 = object.g();
            int n12 = Math.max((int)n8, (int)n10);
            n9 = Math.max((int)n9, (int)n11);
            int n13 = Math.min((int)(n12 / n10), (int)(n9 / n11));
            int n14 = (n12 - n10 * n13) / 2;
            n8 = (n9 - n11 * n13) / 2;
            b b8 = new b(n12, n9);
            n9 = 0;
            while (n9 < n11) {
                int n15 = 0;
                n12 = n14;
                while (n15 < n10) {
                    if (object.f(n15, n9)) {
                        b8.n(n12, n8, n13, n13);
                    }
                    ++n15;
                    n12 += n13;
                }
                ++n9;
                n8 += n13;
            }
            return b8;
        }
        throw new IllegalStateException();
    }

    @Override
    public b a(String string2, V4.a a8, int n8, int n9, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int n10 = 33;
        int n11 = 0;
        Object object = charset;
        int n12 = n10;
        int n13 = n11;
        if (map != null) {
            object = c.p;
            if (map.containsKey(object)) {
                charset = Charset.forName((String)map.get(object).toString());
            }
            if (map.containsKey(object = c.o)) {
                n10 = Integer.parseInt((String)map.get(object).toString());
            }
            c c8 = c.x;
            object = charset;
            n12 = n10;
            n13 = n11;
            if (map.containsKey((Object)c8)) {
                n13 = Integer.parseInt((String)map.get((Object)c8).toString());
                n12 = n10;
                object = charset;
            }
        }
        return a.b(string2, a8, n8, n9, (Charset)object, n12, n13);
    }
}

