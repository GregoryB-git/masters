/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package l1;

import F0.T;
import F0.g;
import F0.t;
import d0.q;
import g0.a;
import g0.z;
import java.util.List;
import l1.K;

public final class M {
    public final List a;
    public final T[] b;

    public M(List list) {
        this.a = list;
        this.b = new T[list.size()];
    }

    public void a(long l8, z z8) {
        if (z8.a() < 9) {
            return;
        }
        int n8 = z8.p();
        int n9 = z8.p();
        int n10 = z8.G();
        if (n8 == 434 && n9 == 1195456820 && n10 == 3) {
            g.b(l8, z8, this.b);
        }
    }

    public void b(t t8, K.d d8) {
        for (int i8 = 0; i8 < this.b.length; ++i8) {
            d8.a();
            T t9 = t8.a(d8.c(), 3);
            q q8 = (q)this.a.get(i8);
            String string2 = q8.n;
            boolean bl = "application/cea-608".equals((Object)string2) || "application/cea-708".equals((Object)string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid closed caption MIME type provided: ");
            stringBuilder.append(string2);
            a.b(bl, stringBuilder.toString());
            t9.d(new q.b().a0(d8.b()).o0(string2).q0(q8.e).e0(q8.d).L(q8.G).b0(q8.q).K());
            this.b[i8] = t9;
        }
    }
}

