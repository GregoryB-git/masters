// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import java.util.concurrent.TimeoutException;
import java.io.IOException;
import d0.x;
import java.io.EOFException;
import java.math.BigInteger;
import W2.c;
import g0.G;
import r0.f;
import g0.a;
import d0.q;
import g0.z;
import java.util.List;
import g0.E;
import i0.g;
import android.net.Uri;
import X2.v;
import l0.y1;
import java.util.concurrent.atomic.AtomicInteger;
import y0.m;

public final class j extends m
{
    public static final AtomicInteger N;
    public final boolean A;
    public final boolean B;
    public final y1 C;
    public final long D;
    public k E;
    public s F;
    public int G;
    public boolean H;
    public volatile boolean I;
    public boolean J;
    public v K;
    public boolean L;
    public boolean M;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final i0.g p;
    public final i0.k q;
    public final k r;
    public final boolean s;
    public final boolean t;
    public final E u;
    public final q0.h v;
    public final List w;
    public final d0.m x;
    public final T0.h y;
    public final z z;
    
    static {
        N = new AtomicInteger();
    }
    
    public j(final q0.h v, final i0.g g, final i0.k k, final q q, final boolean a, final i0.g p28, final i0.k q2, final boolean b, final Uri m, final List w, final int n, final Object o, final long n2, final long n3, final long n4, final int o2, final boolean i, final int l, final boolean t, final boolean s, final E u, final long d, final d0.m x, final k r, final T0.h y, final z z, final boolean n5, final y1 c) {
        super(g, k, q, n, o, n2, n3, n4);
        this.A = a;
        this.o = o2;
        this.M = i;
        this.l = l;
        this.q = q2;
        this.p = p28;
        this.H = (q2 != null);
        this.B = b;
        this.m = m;
        this.s = s;
        this.u = u;
        this.D = d;
        this.t = t;
        this.v = v;
        this.w = w;
        this.x = x;
        this.r = r;
        this.y = y;
        this.z = z;
        this.n = n5;
        this.C = c;
        this.K = X2.v.Y();
        this.k = j.N.getAndIncrement();
    }
    
    public static i0.g i(final i0.g g, final byte[] array, final byte[] array2) {
        if (array != null) {
            g0.a.e(array2);
            return new q0.a(g, array, array2);
        }
        return g;
    }
    
    public static j j(final q0.h h, final i0.g g, final q q, long n, final r0.f f, final q0.f.e e, final Uri uri, final List list, final int n2, final Object o, final boolean b, final q0.v v, final long n3, final j j, byte[] l, final byte[] array, final boolean b2, final y1 y1, final B0.g.a a) {
        final r0.f.e a2 = e.a;
        final i0.k.b g2 = new i0.k.b().i(G.f(f.a, a2.o)).h(a2.w).g(a2.x);
        int n4;
        if (e.d) {
            n4 = 8;
        }
        else {
            n4 = 0;
        }
        final i0.k a3 = g2.b(n4).a();
        final boolean b3 = l != null;
        byte[] i;
        if (b3) {
            i = l((String)a.e(a2.v));
        }
        else {
            i = null;
        }
        final i0.g k = i(g, l, i);
        final r0.f.d p19 = a2.p;
        boolean b4;
        i0.g m;
        i0.k k2;
        if (p19 != null) {
            b4 = (array != null);
            if (b4) {
                l = l((String)a.e(p19.v));
            }
            else {
                l = null;
            }
            final i0.k a4 = new i0.k.b().i(G.f(f.a, p19.o)).h(p19.w).g(p19.x).a();
            m = i(g, array, l);
            k2 = a4;
        }
        else {
            k2 = null;
            m = null;
            b4 = false;
        }
        n += a2.s;
        final long q2 = a2.q;
        final int n5 = f.j + a2.r;
        T0.h y2;
        k e2;
        z z2;
        if (j != null) {
            final i0.k q3 = j.q;
            final boolean b5 = k2 == q3 || (k2 != null && q3 != null && k2.a.equals((Object)q3.a) && k2.g == j.q.g);
            final boolean b6 = uri.equals((Object)j.m) && j.J;
            y2 = j.y;
            final z z = j.z;
            if (b5 && b6 && !j.L && j.l == n5) {
                e2 = j.E;
            }
            else {
                e2 = null;
            }
            z2 = z;
        }
        else {
            final T0.h h2 = new T0.h();
            z2 = new z(10);
            final k k3 = null;
            y2 = h2;
            e2 = k3;
        }
        return new j(h, k, a3, q, b3, m, k2, b4, uri, list, n2, o, n, n + q2, e.b, e.c, e.d ^ true, n5, a2.y, b, v.a(n5), n3, a2.t, e2, y2, z2, b2, y1);
    }
    
    public static byte[] l(final String s) {
        String substring = s;
        if (W2.c.e(s).startsWith("0x")) {
            substring = s.substring(2);
        }
        final byte[] byteArray = new BigInteger(substring, 16).toByteArray();
        final byte[] array = new byte[16];
        int n;
        if (byteArray.length > 16) {
            n = byteArray.length - 16;
        }
        else {
            n = 0;
        }
        System.arraycopy(byteArray, n, array, 16 - byteArray.length + n, byteArray.length - n);
        return array;
    }
    
    public static boolean p(final q0.f.e e, final r0.f f) {
        final r0.f.e a = e.a;
        if (a instanceof r0.f.b) {
            return ((r0.f.b)a).z || (e.c == 0 && f.c);
        }
        return f.c;
    }
    
    public static boolean w(final j j, final Uri uri, final r0.f f, final q0.f.e e, final long n) {
        boolean b = false;
        if (j == null) {
            return false;
        }
        if (uri.equals((Object)j.m) && j.J) {
            return false;
        }
        final long s = e.a.s;
        if (!p(e, f) || n + s < j.h) {
            b = true;
        }
        return b;
    }
    
    @Override
    public void b() {
        g0.a.e(this.F);
        if (this.E == null) {
            final k r = this.r;
            if (r != null && r.e()) {
                this.E = this.r;
                this.H = false;
            }
        }
        this.s();
        if (!this.I) {
            if (!this.t) {
                this.r();
            }
            this.J = (this.I ^ true);
        }
    }
    
    @Override
    public void c() {
        this.I = true;
    }
    
    @Override
    public boolean h() {
        return this.J;
    }
    
    public final void k(final i0.g g, final i0.k k, final boolean b, final boolean b2) {
        final boolean b3 = false;
        boolean b4 = false;
        Object o;
        if (b) {
            if (this.G != 0) {
                b4 = true;
            }
            o = k;
        }
        else {
            o = k.e(this.G);
            b4 = b3;
        }
        Label_0208: {
            try {
                o = this.u(g, (i0.k)o, b2);
                if (b4) {
                    ((F0.s)o).i(this.G);
                }
            }
            finally {
                break Label_0208;
            }
            Label_0180: {
                try {
                    try {
                        while (!this.I && this.E.c((F0.s)o)) {}
                    }
                    finally {}
                }
                catch (EOFException ex) {
                    while (true) {
                        if ((super.d.f & 0x4000) != 0x0) {
                            this.E.d();
                            final long n = ((F0.s)o).p();
                            final long n2 = k.g;
                            this.G = (int)(n - n2);
                            break Label_0180;
                        }
                        throw ex;
                        final long n = ((F0.s)o).p();
                        final long n2 = k.g;
                        continue;
                    }
                }
            }
            i0.j.a(g);
            return;
            this.G = (int)(((F0.s)o).p() - k.g);
        }
        i0.j.a(g);
    }
    
    public int m(final int n) {
        g0.a.f(this.n ^ true);
        if (n >= this.K.size()) {
            return 0;
        }
        return this.K.get(n);
    }
    
    public void n(final s f, final v k) {
        this.F = f;
        this.K = k;
    }
    
    public void o() {
        this.L = true;
    }
    
    public boolean q() {
        return this.M;
    }
    
    public final void r() {
        this.k(super.i, super.b, this.A, true);
    }
    
    public final void s() {
        if (!this.H) {
            return;
        }
        g0.a.e(this.p);
        g0.a.e(this.q);
        this.k(this.p, this.q, this.B, false);
        this.G = 0;
        this.H = false;
    }
    
    public final long t(final F0.s s) {
        s.h();
        try {
            this.z.P(10);
            s.n(this.z.e(), 0, 10);
            if (this.z.J() != 4801587) {
                return -9223372036854775807L;
            }
            this.z.U(3);
            final int f = this.z.F();
            final int n = f + 10;
            if (n > this.z.b()) {
                final byte[] e = this.z.e();
                this.z.P(n);
                System.arraycopy(e, 0, this.z.e(), 0, 10);
            }
            s.n(this.z.e(), 10, f);
            final x e2 = this.y.e(this.z.e(), f);
            if (e2 == null) {
                return -9223372036854775807L;
            }
            for (int e3 = e2.e(), i = 0; i < e3; ++i) {
                final x.b d = e2.d(i);
                if (d instanceof T0.m) {
                    final T0.m m = (T0.m)d;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(m.p)) {
                        System.arraycopy(m.q, 0, this.z.e(), 0, 8);
                        this.z.T(0);
                        this.z.S(8);
                        return this.z.z() & 0x1FFFFFFFFL;
                    }
                }
            }
            return -9223372036854775807L;
        }
        catch (EOFException ex) {
            return -9223372036854775807L;
        }
    }
    
    public final F0.j u(final i0.g g, final i0.k k, final boolean b) {
        g.e(k);
        if (b) {
            try {
                this.u.j(this.s, super.g, this.D);
                goto Label_0053;
            }
            catch (TimeoutException cause) {
                throw new IOException(cause);
            }
            catch (InterruptedException ex) {}
            goto Label_0045;
        }
        goto Label_0053;
    }
    
    public void v() {
        this.M = true;
    }
}
