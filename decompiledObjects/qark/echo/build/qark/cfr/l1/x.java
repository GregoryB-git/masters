/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package l1;

import F0.T;
import F0.t;
import d0.q;
import g0.E;
import g0.M;
import g0.a;
import g0.z;
import l1.D;
import l1.K;

public final class x
implements D {
    public q a;
    public E b;
    public T c;

    public x(String string2) {
        this.a = new q.b().o0(string2).K();
    }

    @Override
    public void a(z z8) {
        this.b();
        long l8 = this.b.e();
        long l9 = this.b.f();
        if (l8 != -9223372036854775807L) {
            if (l9 == -9223372036854775807L) {
                return;
            }
            q q8 = this.a;
            if (l9 != q8.s) {
                this.a = q8 = q8.a().s0(l9).K();
                this.c.d(q8);
            }
            int n8 = z8.a();
            this.c.e(z8, n8);
            this.c.b(l8, 1, n8, 0, null);
        }
    }

    public final void b() {
        a.h(this.b);
        M.i(this.c);
    }

    @Override
    public void c(E object, t t8, K.d d8) {
        this.b = object;
        d8.a();
        this.c = object = t8.a(d8.c(), 5);
        object.d(this.a);
    }
}

