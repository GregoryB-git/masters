/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.List
 */
package c1;

import F0.S;
import F0.T;
import X2.v;
import c1.d;
import c1.e;
import c1.t;
import c1.w;
import d0.i;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.g;
import java.io.EOFException;
import java.util.List;

public final class x
implements T {
    public final T a;
    public final t.a b;
    public final d c;
    public final g0.z d;
    public int e;
    public int f;
    public byte[] g;
    public t h;
    public q i;

    public x(T t8, t.a a8) {
        this.a = t8;
        this.b = a8;
        this.c = new d();
        this.e = 0;
        this.f = 0;
        this.g = M.f;
        this.d = new g0.z();
    }

    public static /* synthetic */ void g(x x8, long l8, int n8, e e8) {
        x8.i(l8, n8, e8);
    }

    @Override
    public void a(g0.z z8, int n8, int n9) {
        if (this.h == null) {
            this.a.a(z8, n8, n9);
            return;
        }
        this.h(n8);
        z8.l(this.g, this.f, n8);
        this.f += n8;
    }

    @Override
    public void b(long l8, int n8, int n9, int n10, T.a a8) {
        if (this.h == null) {
            this.a.b(l8, n8, n9, n10, a8);
            return;
        }
        boolean bl = a8 == null;
        a.b(bl, "DRM on subtitles is not supported");
        n10 = this.f - n10 - n9;
        this.h.c(this.g, n10, n9, t.b.b(), new w(this, l8, n8));
        this.e = n8 = n10 + n9;
        if (n8 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    @Override
    public int c(i i8, int n8, boolean bl, int n9) {
        if (this.h == null) {
            return this.a.c(i8, n8, bl, n9);
        }
        this.h(n8);
        n8 = i8.read(this.g, this.f, n8);
        if (n8 == -1) {
            if (bl) {
                return -1;
            }
            throw new EOFException();
        }
        this.f += n8;
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void d(q object) {
        Object object2;
        a.e(object.n);
        boolean bl = z.k(object.n) == 3;
        a.a(bl);
        if (!object.equals(this.i)) {
            this.i = object;
            object2 = this.b.a((q)object) ? this.b.b((q)object) : null;
            this.h = object2;
        }
        if (this.h == null) {
            T t8 = this.a;
            object2 = object;
            object = t8;
        } else {
            object2 = this.a;
            q q8 = object.a().o0("application/x-media3-cues").O(object.n).s0(Long.MAX_VALUE).S(this.b.c((q)object)).K();
            object = object2;
            object2 = q8;
        }
        object.d((q)object2);
    }

    @Override
    public /* synthetic */ void e(g0.z z8, int n8) {
        S.b(this, z8, n8);
    }

    @Override
    public /* synthetic */ int f(i i8, int n8, boolean bl) {
        return S.a(this, i8, n8, bl);
    }

    public final void h(int n8) {
        byte[] arrby;
        int n9 = this.g.length;
        int n10 = this.f;
        if (n9 - n10 >= n8) {
            return;
        }
        n9 = n10 - this.e;
        byte[] arrby2 = (n8 = Math.max((int)(n9 * 2), (int)(n8 + n9))) <= (arrby = this.g).length ? arrby : new byte[n8];
        System.arraycopy((Object)arrby, (int)this.e, (Object)arrby2, (int)0, (int)n9);
        this.e = 0;
        this.f = n9;
        this.g = arrby2;
    }

    public final /* synthetic */ void i(long l8, int n8, e e8) {
        this.j(e8, l8, n8);
    }

    public final void j(e e8, long l8, int n8) {
        a.h(this.i);
        byte[] arrby = this.c.a(e8.a, e8.c);
        this.d.Q(arrby);
        this.a.e(this.d, arrby.length);
        long l9 = e8.b;
        if (l9 == -9223372036854775807L) {
            boolean bl = this.i.s == Long.MAX_VALUE;
            a.f(bl);
        } else {
            long l10 = this.i.s;
            l8 = l10 == Long.MAX_VALUE ? (l8 += l9) : l9 + l10;
        }
        this.a.b(l8, n8, arrby.length, 0, null);
    }

    public void k() {
        t t8 = this.h;
        if (t8 != null) {
            t8.b();
        }
    }
}

