/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package f5;

import V4.g;
import Y4.b;
import h5.c;
import h5.f;
import java.util.Map;

public final class a
implements g {
    public static b b(f object, int n8, int n9, int n10) {
        if ((object = object.a()) != null) {
            int n11 = object.e();
            int n12 = object.d();
            int n13 = n11 + (n10 <<= 1);
            int n14 = n10 + n12;
            n10 = Math.max((int)n8, (int)n13);
            n9 = Math.max((int)n9, (int)n14);
            int n15 = Math.min((int)(n10 / n13), (int)(n9 / n14));
            n14 = (n10 - n11 * n15) / 2;
            n8 = (n9 - n12 * n15) / 2;
            b b8 = new b(n10, n9);
            n9 = 0;
            while (n9 < n12) {
                n13 = 0;
                n10 = n14;
                while (n13 < n11) {
                    if (object.b(n13, n9) == 1) {
                        b8.n(n10, n8, n15, n15);
                    }
                    ++n13;
                    n10 += n15;
                }
                ++n9;
                n8 += n15;
            }
            return b8;
        }
        throw new IllegalStateException();
    }

    @Override
    public b a(String string2, V4.a enum_, int n8, int n9, Map map) {
        if (!string2.isEmpty()) {
            if (enum_ == V4.a.z) {
                if (n8 >= 0 && n9 >= 0) {
                    int n10;
                    enum_ = g5.a.p;
                    int n11 = n10 = 4;
                    Enum enum_2 = enum_;
                    if (map != null) {
                        enum_2 = V4.c.o;
                        if (map.containsKey((Object)enum_2)) {
                            enum_ = g5.a.valueOf(map.get((Object)enum_2).toString());
                        }
                        V4.c c8 = V4.c.t;
                        n11 = n10;
                        enum_2 = enum_;
                        if (map.containsKey((Object)c8)) {
                            n11 = Integer.parseInt((String)map.get((Object)c8).toString());
                            enum_2 = enum_;
                        }
                    }
                    return a.b(c.n(string2, (g5.a)enum_2, map), n8, n9, n11);
                }
                string2 = new StringBuilder("Requested dimensions are too small: ");
                string2.append(n8);
                string2.append('x');
                string2.append(n9);
                throw new IllegalArgumentException(string2.toString());
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf((Object)enum_)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}

