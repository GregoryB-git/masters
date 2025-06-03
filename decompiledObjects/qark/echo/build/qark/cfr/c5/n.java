/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package c5;

import V4.a;
import V4.c;
import V4.g;
import Y4.b;
import java.util.Map;

public abstract class n
implements g {
    public static int b(boolean[] arrbl, int n8, int[] arrn, boolean bl) {
        int n9;
        int n10 = arrn.length;
        int n11 = n9 = 0;
        int n12 = n8;
        for (n8 = n9; n8 < n10; ++n8) {
            int n13 = arrn[n8];
            n9 = 0;
            while (n9 < n13) {
                arrbl[n12] = bl;
                ++n9;
                ++n12;
            }
            n11 += n13;
            bl ^= true;
        }
        return n11;
    }

    public static b e(boolean[] arrbl, int n8, int n9, int n10) {
        int n11 = arrbl.length;
        int n12 = n10 + n11;
        int n13 = Math.max((int)n8, (int)n12);
        n10 = Math.max((int)1, (int)n9);
        n12 = n13 / n12;
        n8 = (n13 - n11 * n12) / 2;
        b b8 = new b(n13, n10);
        n9 = 0;
        while (n9 < n11) {
            if (arrbl[n9]) {
                b8.n(n8, 0, n12, n10);
            }
            ++n9;
            n8 += n12;
        }
        return b8;
    }

    @Override
    public b a(String string2, a enum_, int n8, int n9, Map map) {
        if (!string2.isEmpty()) {
            if (n8 >= 0 && n9 >= 0) {
                int n10;
                int n11 = n10 = this.d();
                if (map != null) {
                    enum_ = c.t;
                    n11 = n10;
                    if (map.containsKey((Object)enum_)) {
                        n11 = Integer.parseInt((String)map.get((Object)enum_).toString());
                    }
                }
                return n.e(this.c(string2), n8, n9, n11);
            }
            string2 = new StringBuilder("Negative size is not allowed. Input: ");
            string2.append(n8);
            string2.append('x');
            string2.append(n9);
            throw new IllegalArgumentException(string2.toString());
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public abstract boolean[] c(String var1);

    public int d() {
        return 10;
    }
}

