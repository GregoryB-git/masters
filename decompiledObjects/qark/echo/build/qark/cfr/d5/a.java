/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.nio.charset.Charset
 *  java.util.Map
 */
package d5;

import V4.g;
import Y4.b;
import e5.c;
import e5.d;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

public final class a
implements g {
    public static b b(byte[][] arrby, int n8) {
        int n9 = arrby[0].length;
        int n10 = n8 * 2;
        b b8 = new b(n9 + n10, arrby.length + n10);
        b8.b();
        n9 = b8.g() - n8 - 1;
        n10 = 0;
        while (n10 < arrby.length) {
            byte[] arrby2 = arrby[n10];
            for (int i8 = 0; i8 < arrby[0].length; ++i8) {
                if (arrby2[i8] != 1) continue;
                b8.l(i8 + n8, n9);
            }
            ++n10;
            --n9;
        }
        return b8;
    }

    public static b c(d arrby, String arrby2, int n8, int n9, int n10, int n11) {
        arrby.e((String)arrby2, n8);
        arrby2 = arrby.f().b(1, 4);
        n8 = n10 > n9 ? 1 : 0;
        int n12 = arrby2[0].length < arrby2.length ? 1 : 0;
        if (n8 != n12) {
            arrby2 = a.d(arrby2);
            n8 = 1;
        } else {
            n8 = 0;
        }
        if ((n9 /= arrby2[0].length) >= (n10 /= arrby2.length)) {
            n9 = n10;
        }
        if (n9 > 1) {
            arrby = arrby2 = arrby.f().b(n9, n9 << 2);
            if (n8 != 0) {
                arrby = a.d(arrby2);
            }
            return a.b(arrby, n11);
        }
        return a.b(arrby2, n11);
    }

    public static byte[][] d(byte[][] arrby) {
        int n8 = arrby[0].length;
        int n9 = arrby.length;
        byte[][] arrby2 = (byte[][])Array.newInstance((Class)Byte.TYPE, (int[])new int[]{n8, n9});
        for (n8 = 0; n8 < arrby.length; ++n8) {
            int n10 = arrby.length;
            for (n9 = 0; n9 < arrby[0].length; ++n9) {
                arrby2[n9][n10 - n8 - 1] = arrby[n8][n9];
            }
        }
        return arrby2;
    }

    @Override
    public b a(String string2, V4.a object, int n8, int n9, Map map) {
        if (object == V4.a.y) {
            int n10;
            object = new d();
            int n11 = 30;
            int n12 = n10 = 2;
            int n13 = n11;
            if (map != null) {
                V4.c c8 = V4.c.u;
                if (map.containsKey((Object)c8)) {
                    object.h(Boolean.valueOf((String)map.get((Object)c8).toString()));
                }
                if (map.containsKey((Object)(c8 = V4.c.v))) {
                    object.i(c.valueOf(map.get((Object)c8).toString()));
                }
                if (!map.containsKey((Object)(c8 = V4.c.w))) {
                    c8 = V4.c.t;
                    if (map.containsKey((Object)c8)) {
                        n11 = Integer.parseInt((String)map.get((Object)c8).toString());
                    }
                    if (map.containsKey((Object)(c8 = V4.c.o))) {
                        n10 = Integer.parseInt((String)map.get((Object)c8).toString());
                    }
                    c8 = V4.c.p;
                    n12 = n10;
                    n13 = n11;
                    if (map.containsKey((Object)c8)) {
                        object.j(Charset.forName((String)map.get((Object)c8).toString()));
                        n13 = n11;
                        n12 = n10;
                    }
                } else {
                    android.support.v4.media.a.a(map.get((Object)c8));
                    throw null;
                }
            }
            return a.c((d)object, string2, n12, n8, n9, n13);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf((Object)object)));
    }
}

