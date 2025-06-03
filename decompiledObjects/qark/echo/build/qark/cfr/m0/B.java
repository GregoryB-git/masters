/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package m0;

import android.media.AudioTrack;
import g0.M;
import g0.c;
import java.lang.reflect.Method;
import m0.A;

public final class B {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public long I;
    public c J;
    public final a a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public A f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public B(a a8) {
        this.a = (a)g0.a.e(a8);
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        this.b = new long[10];
        this.J = c.a;
    }

    public static boolean o(int n8) {
        if (M.a < 23 && (n8 == 5 || n8 == 6)) {
            return true;
        }
        return false;
    }

    public void a() {
        this.H = true;
        A a8 = this.f;
        if (a8 != null) {
            a8.b();
        }
    }

    public final boolean b() {
        if (this.h && ((AudioTrack)g0.a.e((Object)this.c)).getPlayState() == 2 && this.e() == 0L) {
            return true;
        }
        return false;
    }

    public int c(long l8) {
        int n8 = (int)(l8 - this.e() * (long)this.d);
        return this.e - n8;
    }

    public long d(boolean bl) {
        long l8;
        long l9;
        if (((AudioTrack)g0.a.e((Object)this.c)).getPlayState() == 3) {
            this.m();
        }
        long l10 = this.J.c() / 1000L;
        A a8 = (A)g0.a.e(this.f);
        boolean bl2 = a8.e();
        if (bl2) {
            l9 = M.V0(a8.c(), this.g) + M.c0(l10 - a8.d(), this.j);
        } else {
            l8 = this.x == 0 ? this.f() : M.c0(this.l + l10, this.j);
            l9 = l8;
            if (!bl) {
                l9 = Math.max((long)0L, (long)(l8 - this.o));
            }
        }
        if (this.E != bl2) {
            this.G = this.D;
            this.F = this.C;
        }
        long l11 = l10 - this.G;
        l8 = l9;
        if (l11 < 1000000L) {
            l8 = this.F;
            long l12 = M.c0(l11, this.j);
            l11 = l11 * 1000L / 1000000L;
            l8 = (l9 * l11 + (1000L - l11) * (l8 + l12)) / 1000L;
        }
        if (!this.k && l8 > (l9 = this.C)) {
            this.k = true;
            l11 = M.h0(M.i1(l8 - l9), this.j);
            l9 = this.J.a();
            l11 = M.i1(l11);
            this.a.b(l9 - l11);
        }
        this.D = l10;
        this.C = l8;
        this.E = bl2;
        return l8;
    }

    public final long e() {
        long l8 = this.J.b();
        if (this.y != -9223372036854775807L) {
            if (((AudioTrack)g0.a.e((Object)this.c)).getPlayState() == 2) {
                return this.A;
            }
            l8 = M.F(M.c0(M.J0(l8) - this.y, this.j), this.g);
            return Math.min((long)this.B, (long)(this.A + l8));
        }
        if (l8 - this.s >= 5L) {
            this.w(l8);
            this.s = l8;
        }
        return this.t + this.I + (this.u << 32);
    }

    public final long f() {
        return M.V0(this.e(), this.g);
    }

    public void g(long l8) {
        this.A = this.e();
        this.y = M.J0(this.J.b());
        this.B = l8;
    }

    public boolean h(long l8) {
        boolean bl = false;
        if (l8 > M.F(this.d(false), this.g) || this.b()) {
            bl = true;
        }
        return bl;
    }

    public boolean i() {
        if (((AudioTrack)g0.a.e((Object)this.c)).getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public boolean j(long l8) {
        if (this.z != -9223372036854775807L && l8 > 0L && this.J.b() - this.z >= 200L) {
            return true;
        }
        return false;
    }

    public boolean k(long l8) {
        boolean bl;
        int n8 = ((AudioTrack)g0.a.e((Object)this.c)).getPlayState();
        if (this.h) {
            if (n8 == 2) {
                this.p = false;
                return false;
            }
            if (n8 == 1 && this.e() == 0L) {
                return false;
            }
        }
        boolean bl2 = this.p;
        this.p = bl = this.h(l8);
        if (bl2 && !bl && n8 != 1) {
            this.a.a(this.e, M.i1(this.i));
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void l(long l8) {
        A a8 = (A)g0.a.e(this.f);
        if (!a8.f(l8)) {
            return;
        }
        long l9 = a8.d();
        long l10 = a8.c();
        long l11 = this.f();
        if (Math.abs((long)(l9 - l8)) > 5000000L) {
            this.a.d(l10, l9, l8, l11);
        } else {
            if (Math.abs((long)(M.V0(l10, this.g) - l11)) <= 5000000L) {
                a8.a();
                return;
            }
            this.a.c(l10, l9, l8, l11);
        }
        a8.g();
    }

    public final void m() {
        long l8 = this.J.c() / 1000L;
        if (l8 - this.m >= 30000L) {
            int n8;
            long l9 = this.f();
            if (l9 == 0L) {
                return;
            }
            this.b[this.w] = M.h0(l9, this.j) - l8;
            this.w = (this.w + 1) % 10;
            int n9 = this.x;
            if (n9 < 10) {
                this.x = n9 + 1;
            }
            this.m = l8;
            this.l = 0L;
            for (n9 = 0; n9 < (n8 = this.x); ++n9) {
                this.l += this.b[n9] / (long)n8;
            }
        }
        if (this.h) {
            return;
        }
        this.l(l8);
        this.n(l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(long l8) {
        Method method;
        if (this.q && (method = this.n) != null && l8 - this.r >= 500000L) {
            block4 : {
                try {
                    long l9;
                    this.o = l9 = (long)((Integer)M.i((Object)((Integer)method.invoke(g0.a.e((Object)this.c), new Object[0])))).intValue() * 1000L - this.i;
                    this.o = l9 = Math.max((long)l9, (long)0L);
                    if (l9 > 5000000L) {
                        this.a.e(l9);
                        this.o = 0L;
                    }
                    break block4;
                }
                catch (Exception exception) {}
                this.n = null;
            }
            this.r = l8;
        }
    }

    public boolean p() {
        this.r();
        if (this.y == -9223372036854775807L) {
            ((A)g0.a.e(this.f)).h();
            return true;
        }
        this.A = this.e();
        return false;
    }

    public void q() {
        this.r();
        this.c = null;
        this.f = null;
    }

    public final void r() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }

    public void s(AudioTrack audioTrack, boolean bl, int n8, int n9, int n10) {
        this.c = audioTrack;
        this.d = n9;
        this.e = n10;
        this.f = new A(audioTrack);
        this.g = audioTrack.getSampleRate();
        bl = bl && B.o(n8);
        this.h = bl;
        this.q = bl = M.A0(n8);
        long l8 = bl ? M.V0(n10 / n9, this.g) : -9223372036854775807L;
        this.i = l8;
        this.t = 0L;
        this.u = 0L;
        this.H = false;
        this.I = 0L;
        this.v = 0L;
        this.p = false;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void t(float f8) {
        this.j = f8;
        A a8 = this.f;
        if (a8 != null) {
            a8.h();
        }
        this.r();
    }

    public void u(c c8) {
        this.J = c8;
    }

    public void v() {
        if (this.y != -9223372036854775807L) {
            this.y = M.J0(this.J.b());
        }
        ((A)g0.a.e(this.f)).h();
    }

    public final void w(long l8) {
        long l9;
        AudioTrack audioTrack = (AudioTrack)g0.a.e((Object)this.c);
        int n8 = audioTrack.getPlayState();
        if (n8 == 1) {
            return;
        }
        long l10 = l9 = (long)audioTrack.getPlaybackHeadPosition() & 0xFFFFFFFFL;
        if (this.h) {
            if (n8 == 2 && l9 == 0L) {
                this.v = this.t;
            }
            l10 = l9 + this.v;
        }
        if (M.a <= 29) {
            if (l10 == 0L && this.t > 0L && n8 == 3) {
                if (this.z == -9223372036854775807L) {
                    this.z = l8;
                }
                return;
            }
            this.z = -9223372036854775807L;
        }
        if ((l8 = this.t) > l10) {
            if (this.H) {
                this.I += l8;
                this.H = false;
            } else {
                ++this.u;
            }
        }
        this.t = l10;
    }

    public static interface a {
        public void a(int var1, long var2);

        public void b(long var1);

        public void c(long var1, long var3, long var5, long var7);

        public void d(long var1, long var3, long var5, long var7);

        public void e(long var1);
    }

}

