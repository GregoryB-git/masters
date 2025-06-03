/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package F0;

import F0.B;
import F0.M;
import F0.N;
import g0.a;

public final class A
implements M {
    public final B a;
    public final long b;

    public A(B b8, long l8) {
        this.a = b8;
        this.b = l8;
    }

    public final N a(long l8, long l9) {
        return new N(l8 * 1000000L / (long)this.a.e, this.b + l9);
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public M.a j(long l8) {
        a.h(this.a.k);
        Object object = this.a;
        long[] arrl = object.k;
        long[] arrl2 = arrl.a;
        arrl = arrl.b;
        int n8 = g0.M.h(arrl2, object.i(l8), true, false);
        long l9 = 0L;
        long l10 = n8 == -1 ? 0L : arrl2[n8];
        if (n8 != -1) {
            l9 = arrl[n8];
        }
        object = this.a(l10, l9);
        if (object.a != l8 && n8 != arrl2.length - 1) {
            return new M.a((N)object, this.a(arrl2[n8], arrl[++n8]));
        }
        return new M.a((N)object);
    }

    @Override
    public long l() {
        return this.a.f();
    }
}

