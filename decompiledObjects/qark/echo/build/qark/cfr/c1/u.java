/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package c1;

import F0.L;
import F0.q;
import F0.r;
import F0.s;
import c1.t;
import c1.v;
import java.util.List;

public class u
implements r {
    public final r a;
    public final t.a b;
    public v c;

    public u(r r8, t.a a8) {
        this.a = r8;
        this.b = a8;
    }

    @Override
    public void a(long l8, long l9) {
        v v8 = this.c;
        if (v8 != null) {
            v8.b();
        }
        this.a.a(l8, l9);
    }

    @Override
    public void b(F0.t t8) {
        t8 = new v(t8, this.b);
        this.c = t8;
        this.a.b(t8);
    }

    @Override
    public r d() {
        return this.a;
    }

    @Override
    public boolean e(s s8) {
        return this.a.e(s8);
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        return this.a.i(s8, l8);
    }

    @Override
    public void release() {
        this.a.release();
    }
}

