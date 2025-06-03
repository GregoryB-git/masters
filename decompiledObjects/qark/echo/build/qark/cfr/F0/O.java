/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package F0;

import F0.L;
import F0.M;
import F0.P;
import F0.T;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import d0.i;
import d0.q;
import g0.a;
import g0.z;
import java.util.List;

public final class O
implements r {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public t f;
    public T g;

    public O(int n8, int n9, String string2) {
        this.a = n8;
        this.b = n9;
        this.c = string2;
    }

    @Override
    public void a(long l8, long l9) {
        if (l8 == 0L || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override
    public void b(t t8) {
        this.f = t8;
        this.c(this.c);
    }

    public final void c(String string2) {
        T t8;
        this.g = t8 = this.f.a(1024, 4);
        t8.d(new q.b().o0(string2).K());
        this.f.j();
        this.f.e(new P(-9223372036854775807L));
        this.e = 1;
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        boolean bl = this.a != -1 && this.b != -1;
        a.f(bl);
        z z8 = new z(this.b);
        s8.n(z8.e(), 0, this.b);
        if (z8.M() == this.a) {
            return true;
        }
        return false;
    }

    public final void f(s s8) {
        int n8 = ((T)a.e(this.g)).f(s8, 1024, true);
        if (n8 == -1) {
            this.e = 2;
            this.g.b(0L, 1, this.d, 0, null);
            this.d = 0;
            return;
        }
        this.d += n8;
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        int n8 = this.e;
        if (n8 != 1) {
            if (n8 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        this.f(s8);
        return 0;
    }

    @Override
    public void release() {
    }
}

