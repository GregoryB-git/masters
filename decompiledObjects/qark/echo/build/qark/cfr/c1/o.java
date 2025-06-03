/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package c1;

import F0.H;
import F0.L;
import F0.T;
import F0.r;
import F0.s;
import X2.v;
import a3.f;
import c1.d;
import c1.e;
import c1.n;
import c1.t;
import d0.A;
import d0.q;
import g0.M;
import g0.a;
import g0.g;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class o
implements r {
    public final t a;
    public final d b;
    public final q c;
    public final List d;
    public final z e;
    public byte[] f;
    public T g;
    public int h;
    public int i;
    public long[] j;
    public long k;

    public o(t t8, q q8) {
        this.a = t8;
        this.b = new d();
        this.f = M.f;
        this.e = new z();
        this.c = q8.a().o0("application/x-media3-cues").O(q8.n).S(t8.d()).K();
        this.d = new ArrayList();
        this.i = 0;
        this.j = M.g;
        this.k = -9223372036854775807L;
    }

    public static /* synthetic */ void c(o o8, e e8) {
        o8.f(e8);
    }

    @Override
    public void a(long l8, long l9) {
        int n8 = this.i;
        boolean bl = n8 != 0 && n8 != 5;
        a.f(bl);
        this.k = l9;
        if (this.i == 2) {
            this.i = 1;
        }
        if (this.i == 4) {
            this.i = 3;
        }
    }

    @Override
    public void b(F0.t t8) {
        T t9;
        boolean bl = this.i == 0;
        a.f(bl);
        this.g = t9 = t8.a(0, 3);
        t9.d(this.c);
        t8.j();
        t8.e(new H(new long[]{0L}, new long[]{0L}, -9223372036854775807L));
        this.i = 1;
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        return true;
    }

    public final /* synthetic */ void f(e e8) {
        b b8 = new b(e8.b, this.b.a(e8.a, e8.c), null);
        this.d.add((Object)b8);
        long l8 = this.k;
        if (l8 == -9223372036854775807L || e8.b >= l8) {
            this.m(b8);
        }
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        try {
            long l8 = this.k;
            t.b b8 = l8 != -9223372036854775807L ? t.b.c(l8) : t.b.b();
            this.a.c(this.f, 0, this.h, b8, new n(this));
            Collections.sort((List)this.d);
            this.j = new long[this.d.size()];
            for (int i8 = 0; i8 < this.d.size(); ++i8) {
                this.j[i8] = ((b)this.d.get(i8)).o;
            }
            this.f = M.f;
            return;
        }
        catch (RuntimeException runtimeException) {
            throw A.a("SubtitleParser failed.", (Throwable)runtimeException);
        }
    }

    @Override
    public int i(s s8, L l8) {
        int n8 = this.i;
        boolean bl = n8 != 0 && n8 != 5;
        a.f(bl);
        if (this.i == 1) {
            n8 = s8.a() != -1L ? f.d(s8.a()) : 1024;
            if (n8 > this.f.length) {
                this.f = new byte[n8];
            }
            this.h = 0;
            this.i = 2;
        }
        if (this.i == 2 && this.j(s8)) {
            this.h();
            this.i = 4;
        }
        if (this.i == 3 && this.k(s8)) {
            this.l();
            this.i = 4;
        }
        if (this.i == 4) {
            return -1;
        }
        return 0;
    }

    public final boolean j(s s8) {
        long l8;
        byte[] arrby = this.f;
        if (arrby.length == this.h) {
            this.f = Arrays.copyOf((byte[])arrby, (int)(arrby.length + 1024));
        }
        arrby = this.f;
        int n8 = this.h;
        if ((n8 = s8.read(arrby, n8, arrby.length - n8)) != -1) {
            this.h += n8;
        }
        if ((l8 = s8.a()) != -1L && (long)this.h == l8 || n8 == -1) {
            return true;
        }
        return false;
    }

    public final boolean k(s s8) {
        int n8 = s8.a() != -1L ? f.d(s8.a()) : 1024;
        if (s8.b(n8) == -1) {
            return true;
        }
        return false;
    }

    public final void l() {
        long l8 = this.k;
        int n8 = l8 == -9223372036854775807L ? 0 : M.h(this.j, l8, true, true);
        while (n8 < this.d.size()) {
            this.m((b)this.d.get(n8));
            ++n8;
        }
    }

    public final void m(b b8) {
        a.h(this.g);
        int n8 = b8.p.length;
        this.e.Q(b8.p);
        this.g.e(this.e, n8);
        this.g.b(b8.o, 1, n8, 0, null);
    }

    @Override
    public void release() {
        if (this.i == 5) {
            return;
        }
        this.a.b();
        this.i = 5;
    }

    public static class b
    implements Comparable {
        public final long o;
        public final byte[] p;

        public b(long l8, byte[] arrby) {
            this.o = l8;
            this.p = arrby;
        }

        public /* synthetic */ b(long l8, byte[] arrby,  a8) {
            this(l8, arrby);
        }

        public int h(b b8) {
            return Long.compare((long)this.o, (long)b8.o);
        }
    }

}

