/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package Y3;

import Y3.m;
import d4.a;
import d4.b;
import d4.c;
import d4.f;
import d4.k;
import d4.l;
import d4.n;
import d4.t;
import java.util.Iterator;

public abstract class e {
    public static long a(k k8) {
        block6 : {
            long l8;
            block4 : {
                block5 : {
                    boolean bl = k8 instanceof f;
                    l8 = 8L;
                    if (bl || k8 instanceof l) break block4;
                    if (!(k8 instanceof a)) break block5;
                    l8 = 4L;
                    break block4;
                }
                if (!(k8 instanceof t)) break block6;
                l8 = (long)((String)k8.getValue()).length() + 2L;
            }
            if (k8.t().isEmpty()) {
                return l8;
            }
            return l8 + 24L + e.a((k)k8.t());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown leaf node type: ");
        stringBuilder.append((Object)k8.getClass());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static long b(n n8) {
        if (n8.isEmpty()) {
            return 4L;
        }
        if (n8.B()) {
            return e.a((k)n8);
        }
        boolean bl = n8 instanceof c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected node type: ");
        stringBuilder.append((Object)n8.getClass());
        m.g(bl, stringBuilder.toString());
        stringBuilder = n8.iterator();
        long l8 = 1L;
        while (stringBuilder.hasNext()) {
            d4.m m8 = (d4.m)stringBuilder.next();
            l8 = l8 + (long)m8.c().e().length() + 4L + e.b(m8.d());
        }
        long l9 = l8;
        if (!n8.t().isEmpty()) {
            l9 = l8 + 12L + e.a((k)n8.t());
        }
        return l9;
    }

    public static int c(n n8) {
        boolean bl = n8.isEmpty();
        int n9 = 0;
        if (bl) {
            return 0;
        }
        if (n8.B()) {
            return 1;
        }
        bl = n8 instanceof c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected node type: ");
        stringBuilder.append((Object)n8.getClass());
        m.g(bl, stringBuilder.toString());
        n8 = n8.iterator();
        while (n8.hasNext()) {
            n9 += e.c(((d4.m)n8.next()).d());
        }
        return n9;
    }
}

