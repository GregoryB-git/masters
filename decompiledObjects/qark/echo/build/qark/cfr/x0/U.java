/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 */
package x0;

import android.net.Uri;
import d0.I;
import d0.J;
import d0.q;
import d0.u;
import g0.M;
import i0.y;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k0.d1;
import k0.v0;
import k0.y0;
import x0.Q;
import x0.V;
import x0.Z;
import x0.a;
import x0.v;
import x0.x;

public final class U
extends a {
    public static final q j;
    public static final u k;
    public static final byte[] l;
    public final long h;
    public u i;

    static {
        q q8;
        j = q8 = new q.b().o0("audio/raw").N(2).p0(44100).i0(2).K();
        k = new u.c().b("SilenceMediaSource").e(Uri.EMPTY).c(q8.n).a();
        l = new byte[M.g0(2, 2) * 1024];
    }

    public U(long l8, u u8) {
        boolean bl = l8 >= 0L;
        g0.a.a(bl);
        this.h = l8;
        this.i = u8;
    }

    public /* synthetic */ U(long l8, u u8,  a8) {
        this(l8, u8);
    }

    public static long H(long l8) {
        l8 = l8 * 44100L / 1000000L;
        return (long)M.g0(2, 2) * l8;
    }

    public static long I(long l8) {
        return l8 / (long)M.g0(2, 2) * 1000000L / 44100L;
    }

    @Override
    public void B() {
    }

    @Override
    public u a() {
        synchronized (this) {
            u u8 = this.i;
            return u8;
        }
    }

    @Override
    public void e(v v8) {
    }

    @Override
    public v f(x.b b8, B0.b b9, long l8) {
        return new c(this.h);
    }

    @Override
    public void h() {
    }

    @Override
    public void l(u u8) {
        synchronized (this) {
            this.i = u8;
            return;
        }
    }

    @Override
    public void z(y y8) {
        this.A(new V(this.h, true, false, false, null, this.a()));
    }

    public static final class b {
        public long a;
        public Object b;

        public U a() {
            boolean bl = this.a > 0L;
            g0.a.f(bl);
            return new U(this.a, k.a().d(this.b).a(), null);
        }

        public b b(long l8) {
            this.a = l8;
            return this;
        }

        public b c(Object object) {
            this.b = object;
            return this;
        }
    }

    public static final class c
    implements v {
        public static final Z q = new Z(new J(U.D()));
        public final long o;
        public final ArrayList p;

        public c(long l8) {
            this.o = l8;
            this.p = new ArrayList();
        }

        public final long a(long l8) {
            return M.q(l8, 0L, this.o);
        }

        @Override
        public boolean b() {
            return false;
        }

        @Override
        public long c() {
            return Long.MIN_VALUE;
        }

        @Override
        public long d(long l8, d1 d12) {
            return this.a(l8);
        }

        @Override
        public long f() {
            return Long.MIN_VALUE;
        }

        @Override
        public boolean g(y0 y02) {
            return false;
        }

        @Override
        public void h(long l8) {
        }

        @Override
        public long i(A0.y[] arry, boolean[] arrbl, Q[] arrq, boolean[] arrbl2, long l8) {
            l8 = this.a(l8);
            for (int i8 = 0; i8 < arry.length; ++i8) {
                Q q8 = arrq[i8];
                if (!(q8 == null || arry[i8] != null && arrbl[i8])) {
                    this.p.remove((Object)q8);
                    arrq[i8] = null;
                }
                if (arrq[i8] != null || arry[i8] == null) continue;
                q8 = new d(this.o);
                q8.b(l8);
                this.p.add((Object)q8);
                arrq[i8] = q8;
                arrbl2[i8] = true;
            }
            return l8;
        }

        @Override
        public long l() {
            return -9223372036854775807L;
        }

        @Override
        public Z n() {
            return q;
        }

        @Override
        public void p() {
        }

        @Override
        public void q(long l8, boolean bl) {
        }

        @Override
        public long s(long l8) {
            l8 = this.a(l8);
            for (int i8 = 0; i8 < this.p.size(); ++i8) {
                ((d)this.p.get(i8)).b(l8);
            }
            return l8;
        }

        @Override
        public void u(v.a a8, long l8) {
            a8.k(this);
        }
    }

    public static final class d
    implements Q {
        public final long o;
        public boolean p;
        public long q;

        public d(long l8) {
            this.o = U.H(l8);
            this.b(0L);
        }

        @Override
        public void a() {
        }

        public void b(long l8) {
            this.q = M.q(U.H(l8), 0L, this.o);
        }

        @Override
        public boolean e() {
            return true;
        }

        @Override
        public int j(v0 v02, i i8, int n8) {
            if (this.p && (n8 & 2) == 0) {
                long l8 = this.o;
                long l9 = this.q;
                if ((l8 -= l9) == 0L) {
                    i8.l(4);
                    return -4;
                }
                i8.t = U.I(l9);
                i8.l(1);
                int n9 = (int)Math.min((long)l.length, (long)l8);
                if ((n8 & 4) == 0) {
                    i8.z(n9);
                    i8.r.put(l, 0, n9);
                }
                if ((n8 & 1) == 0) {
                    this.q += (long)n9;
                }
                return -4;
            }
            v02.b = j;
            this.p = true;
            return -5;
        }

        @Override
        public int m(long l8) {
            long l9 = this.q;
            this.b(l8);
            return (int)((this.q - l9) / (long)l.length);
        }
    }

}

