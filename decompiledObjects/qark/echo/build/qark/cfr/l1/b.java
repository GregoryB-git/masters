/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package l1;

import F0.L;
import F0.M;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import g0.z;
import java.util.List;
import l1.K;
import l1.a;
import l1.c;

public final class b
implements r {
    public static final x d = new a();
    public final c a = new c();
    public final z b = new z(2786);
    public boolean c;

    public static /* synthetic */ r[] c() {
        return b.f();
    }

    private static /* synthetic */ r[] f() {
        return new r[]{new b()};
    }

    @Override
    public void a(long l8, long l9) {
        this.c = false;
        this.a.b();
    }

    @Override
    public void b(t t8) {
        this.a.e(t8, new K.d(0, 1));
        t8.j();
        t8.e(new M.b(-9223372036854775807L));
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        z z8 = new z(10);
        int n8 = 0;
        do {
            int n9;
            s8.n(z8.e(), 0, 10);
            z8.T(0);
            if (z8.J() != 4801587) {
                s8.h();
                s8.o(n8);
                n9 = 0;
                int n10 = n8;
                do {
                    s8.n(z8.e(), 0, 6);
                    z8.T(0);
                    if (z8.M() != 2935) {
                        s8.h();
                        if (++n10 - n8 >= 8192) {
                            return false;
                        }
                        s8.o(n10);
                        n9 = 0;
                        continue;
                    }
                    if (++n9 >= 4) {
                        return true;
                    }
                    int n11 = F0.b.g(z8.e());
                    if (n11 == -1) {
                        return false;
                    }
                    s8.o(n11 - 6);
                } while (true);
            }
            z8.U(3);
            n9 = z8.F();
            n8 += n9 + 10;
            s8.o(n9);
        } while (true);
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        int n8 = s8.read(this.b.e(), 0, 2786);
        if (n8 == -1) {
            return -1;
        }
        this.b.T(0);
        this.b.S(n8);
        if (!this.c) {
            this.a.d(0L, 4);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override
    public void release() {
    }
}

