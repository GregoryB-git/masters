// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import g0.M;
import g0.a;
import java.lang.reflect.Method;
import android.media.AudioTrack;
import g0.c;

public final class B
{
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
    
    public B(final a a) {
        this.a = (a)g0.a.e(a);
        while (true) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", (Class<?>[])null);
                this.b = new long[10];
                this.J = g0.c.a;
            }
            catch (NoSuchMethodException ex) {
                continue;
            }
            break;
        }
    }
    
    public static boolean o(final int n) {
        return M.a < 23 && (n == 5 || n == 6);
    }
    
    public void a() {
        this.H = true;
        final A f = this.f;
        if (f != null) {
            f.b();
        }
    }
    
    public final boolean b() {
        return this.h && ((AudioTrack)g0.a.e(this.c)).getPlayState() == 2 && this.e() == 0L;
    }
    
    public int c(final long n) {
        return this.e - (int)(n - this.e() * this.d);
    }
    
    public long d(final boolean b) {
        if (((AudioTrack)g0.a.e(this.c)).getPlayState() == 3) {
            this.m();
        }
        final long d = this.J.c() / 1000L;
        final A a = (A)g0.a.e(this.f);
        final boolean e = a.e();
        long max;
        if (e) {
            max = M.V0(a.c(), this.g) + M.c0(d - a.d(), this.j);
        }
        else {
            long n;
            if (this.x == 0) {
                n = this.f();
            }
            else {
                n = M.c0(this.l + d, this.j);
            }
            max = n;
            if (!b) {
                max = Math.max(0L, n - this.o);
            }
        }
        if (this.E != e) {
            this.G = this.D;
            this.F = this.C;
        }
        final long n2 = d - this.G;
        long c = max;
        if (n2 < 1000000L) {
            final long f = this.F;
            final long c2 = M.c0(n2, this.j);
            final long n3 = n2 * 1000L / 1000000L;
            c = (max * n3 + (1000L - n3) * (f + c2)) / 1000L;
        }
        if (!this.k) {
            final long c3 = this.C;
            if (c > c3) {
                this.k = true;
                this.a.b(this.J.a() - M.i1(M.h0(M.i1(c - c3), this.j)));
            }
        }
        this.D = d;
        this.C = c;
        this.E = e;
        return c;
    }
    
    public final long e() {
        final long b = this.J.b();
        if (this.y == -9223372036854775807L) {
            if (b - this.s >= 5L) {
                this.w(b);
                this.s = b;
            }
            return this.t + this.I + (this.u << 32);
        }
        if (((AudioTrack)g0.a.e(this.c)).getPlayState() == 2) {
            return this.A;
        }
        return Math.min(this.B, this.A + M.F(M.c0(M.J0(b) - this.y, this.j), this.g));
    }
    
    public final long f() {
        return M.V0(this.e(), this.g);
    }
    
    public void g(final long b) {
        this.A = this.e();
        this.y = M.J0(this.J.b());
        this.B = b;
    }
    
    public boolean h(final long n) {
        boolean b = false;
        if (n > M.F(this.d(false), this.g) || this.b()) {
            b = true;
        }
        return b;
    }
    
    public boolean i() {
        return ((AudioTrack)g0.a.e(this.c)).getPlayState() == 3;
    }
    
    public boolean j(final long n) {
        return this.z != -9223372036854775807L && n > 0L && this.J.b() - this.z >= 200L;
    }
    
    public boolean k(final long n) {
        final int playState = ((AudioTrack)g0.a.e(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                return this.p = false;
            }
            if (playState == 1 && this.e() == 0L) {
                return false;
            }
        }
        final boolean p = this.p;
        final boolean h = this.h(n);
        this.p = h;
        if (p && !h && playState != 1) {
            this.a.a(this.e, M.i1(this.i));
        }
        return true;
    }
    
    public final void l(final long n) {
        final A a = (A)g0.a.e(this.f);
        if (!a.f(n)) {
            return;
        }
        final long d = a.d();
        final long c = a.c();
        final long f = this.f();
        if (Math.abs(d - n) > 5000000L) {
            this.a.d(c, d, n, f);
        }
        else {
            if (Math.abs(M.V0(c, this.g) - f) <= 5000000L) {
                a.a();
                return;
            }
            this.a.c(c, d, n, f);
        }
        a.g();
    }
    
    public final void m() {
        final long m = this.J.c() / 1000L;
        if (m - this.m >= 30000L) {
            final long f = this.f();
            if (f == 0L) {
                return;
            }
            this.b[this.w] = M.h0(f, this.j) - m;
            this.w = (this.w + 1) % 10;
            final int x = this.x;
            if (x < 10) {
                this.x = x + 1;
            }
            this.m = m;
            this.l = 0L;
            int n = 0;
            while (true) {
                final int x2 = this.x;
                if (n >= x2) {
                    break;
                }
                this.l += this.b[n] / x2;
                ++n;
            }
        }
        if (this.h) {
            return;
        }
        this.l(m);
        this.n(m);
    }
    
    public final void n(final long r) {
        if (!this.q) {
            return;
        }
        final Method n = this.n;
        if (n == null || r - this.r < 500000L) {
            return;
        }
    Label_0112_Outer:
        while (true) {
            while (true) {
                try {
                    final long n2 = (int)M.i(n.invoke(g0.a.e(this.c), new Object[0])) * 1000L - this.i;
                    this.o = n2;
                    final long max = Math.max(n2, 0L);
                    this.o = max;
                    if (max > 5000000L) {
                        this.a.e(max);
                        this.o = 0L;
                    }
                    while (true) {
                        this.r = r;
                        return;
                        this.n = null;
                        continue Label_0112_Outer;
                    }
                }
                catch (Exception ex) {}
                continue;
            }
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
    
    public void s(final AudioTrack c, final boolean b, final int n, final int d, final int e) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new A(c);
        this.g = c.getSampleRate();
        this.h = (b && o(n));
        final boolean a0 = M.A0(n);
        this.q = a0;
        long v0;
        if (a0) {
            v0 = M.V0(e / d, this.g);
        }
        else {
            v0 = -9223372036854775807L;
        }
        this.i = v0;
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
    
    public void t(final float j) {
        this.j = j;
        final A f = this.f;
        if (f != null) {
            f.h();
        }
        this.r();
    }
    
    public void u(final c j) {
        this.J = j;
    }
    
    public void v() {
        if (this.y != -9223372036854775807L) {
            this.y = M.J0(this.J.b());
        }
        ((A)g0.a.e(this.f)).h();
    }
    
    public final void w(long t) {
        final AudioTrack audioTrack = (AudioTrack)g0.a.e(this.c);
        final int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long t2;
        final long n = t2 = ((long)audioTrack.getPlaybackHeadPosition() & 0xFFFFFFFFL);
        if (this.h) {
            if (playState == 2 && n == 0L) {
                this.v = this.t;
            }
            t2 = n + this.v;
        }
        if (M.a <= 29) {
            if (t2 == 0L && this.t > 0L && playState == 3) {
                if (this.z == -9223372036854775807L) {
                    this.z = t;
                }
                return;
            }
            this.z = -9223372036854775807L;
        }
        t = this.t;
        if (t > t2) {
            if (this.H) {
                this.I += t;
                this.H = false;
            }
            else {
                ++this.u;
            }
        }
        this.t = t2;
    }
    
    public interface a
    {
        void a(final int p0, final long p1);
        
        void b(final long p0);
        
        void c(final long p0, final long p1, final long p2, final long p3);
        
        void d(final long p0, final long p1, final long p2, final long p3);
        
        void e(final long p0);
    }
}
