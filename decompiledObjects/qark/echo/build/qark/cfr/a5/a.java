/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package a5;

import V4.c;
import V4.g;
import Y4.b;
import b5.e;
import b5.i;
import b5.j;
import b5.k;
import b5.l;
import java.util.Map;

public final class a
implements g {
    public static b b(h5.b b8, int n8, int n9) {
        b b9;
        int n10 = b8.e();
        int n11 = b8.d();
        int n12 = Math.max((int)n8, (int)n10);
        int n13 = Math.max((int)n9, (int)n11);
        int n14 = Math.min((int)(n12 / n10), (int)(n13 / n11));
        n12 = (n12 - n10 * n14) / 2;
        n13 = (n13 - n11 * n14) / 2;
        if (n9 >= n11 && n8 >= n10) {
            b9 = new b(n8, n9);
            n8 = n12;
            n9 = n13;
        } else {
            b9 = new b(n10, n11);
            n9 = n8 = 0;
        }
        b9.b();
        n12 = 0;
        while (n12 < n11) {
            n13 = n8;
            int n15 = 0;
            while (n15 < n10) {
                if (b8.b(n15, n12) == 1) {
                    b9.n(n13, n9, n14, n14);
                }
                ++n15;
                n13 += n14;
            }
            ++n12;
            n9 += n14;
        }
        return b9;
    }

    public static b c(e e8, k k8, int n8, int n9) {
        int n10;
        int n11 = k8.h();
        int n12 = k8.g();
        h5.b b8 = new h5.b(k8.j(), k8.i());
        int n13 = n10 = 0;
        while (n10 < n12) {
            int n14;
            boolean bl;
            int n15;
            int n16 = n13;
            if (n10 % k8.e == 0) {
                n15 = n16 = 0;
                while (n16 < k8.j()) {
                    bl = n16 % 2 == 0;
                    b8.g(n15, n13, bl);
                    ++n15;
                    ++n16;
                }
                n16 = n13 + 1;
            }
            n13 = n15 = 0;
            while (n15 < n11) {
                n14 = n13;
                if (n15 % k8.d == 0) {
                    b8.g(n13, n16, true);
                    n14 = n13 + 1;
                }
                b8.g(n14, n16, e8.e(n15, n10));
                n13 = n14 + 1;
                int n17 = k8.d;
                if (n15 % n17 == n17 - 1) {
                    bl = n10 % 2 == 0;
                    b8.g(n13, n16, bl);
                    n13 = n14 + 2;
                }
                ++n15;
            }
            n14 = n16 + 1;
            n13 = k8.e;
            if (n10 % n13 == n13 - 1) {
                n15 = n13 = 0;
                while (n13 < k8.j()) {
                    b8.g(n15, n14, true);
                    ++n15;
                    ++n13;
                }
                n13 = n16 + 2;
            } else {
                n13 = n14;
            }
            ++n10;
        }
        return a.b(b8, n8, n9);
    }

    @Override
    public b a(String object, V4.a object2, int n8, int n9, Map map) {
        if (!object.isEmpty()) {
            if (object2 == V4.a.t) {
                if (n8 >= 0 && n9 >= 0) {
                    Object object3 = object2 = l.o;
                    if (map != null) {
                        object3 = (l)((Object)map.get((Object)c.q));
                        if (object3 != null) {
                            object2 = object3;
                        }
                        android.support.v4.media.a.a(map.get((Object)c.r));
                        android.support.v4.media.a.a(map.get((Object)c.s));
                        object3 = object2;
                    }
                    object = j.b((String)object, (l)((Object)object3), null, null);
                    object2 = k.l(object.length(), (l)((Object)object3), null, null, true);
                    object = new e(i.c((String)object, (k)object2), object2.h(), object2.g());
                    object.h();
                    return a.c((e)object, (k)object2, n8, n9);
                }
                object = new StringBuilder("Requested dimensions can't be negative: ");
                object.append(n8);
                object.append('x');
                object.append(n9);
                throw new IllegalArgumentException(object.toString());
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf((Object)object2)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}

