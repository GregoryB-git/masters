// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import java.io.IOException;
import d0.I;
import A0.y;
import g0.a;
import g0.o;
import x0.e;
import x0.x;
import B0.b;
import A0.E;
import x0.Z;
import A0.D;
import x0.Q;
import x0.v;

public final class B0
{
    public final v a;
    public final Object b;
    public final Q[] c;
    public boolean d;
    public boolean e;
    public C0 f;
    public boolean g;
    public final boolean[] h;
    public final a1[] i;
    public final D j;
    public final T0 k;
    public B0 l;
    public Z m;
    public E n;
    public long o;
    
    public B0(final a1[] i, final long o, final D j, final b b, final T0 k, final C0 f, final E n) {
        this.i = i;
        this.o = o;
        this.j = j;
        this.k = k;
        final x.b a = f.a;
        this.b = a.a;
        this.f = f;
        this.m = Z.d;
        this.n = n;
        this.c = new Q[i.length];
        this.h = new boolean[i.length];
        this.a = f(a, k, b, f.b, f.d);
    }
    
    public static v f(final x.b b, final T0 t0, final b b2, final long n, final long n2) {
        v h = t0.h(b, b2, n);
        if (n2 != -9223372036854775807L) {
            h = new e(h, true, 0L, n2);
        }
        return h;
    }
    
    public static void w(final T0 t0, final v v) {
        v o = v;
        try {
            if (v instanceof e) {
                o = ((e)v).o;
            }
            t0.z(o);
        }
        catch (RuntimeException ex) {
            g0.o.d("MediaPeriodHolder", "Period release failed.", ex);
        }
    }
    
    public long A(final long n) {
        return n - this.m();
    }
    
    public long B(final long n) {
        return n + this.m();
    }
    
    public void C() {
        final v a = this.a;
        if (a instanceof e) {
            long d;
            if ((d = this.f.d) == -9223372036854775807L) {
                d = Long.MIN_VALUE;
            }
            ((e)a).w(0L, d);
        }
    }
    
    public long a(final E e, final long n, final boolean b) {
        return this.b(e, n, b, new boolean[this.i.length]);
    }
    
    public long b(final E n, long i, final boolean b, final boolean[] array) {
        int n2 = 0;
        while (true) {
            final int a = n.a;
            boolean b2 = true;
            if (n2 >= a) {
                break;
            }
            final boolean[] h = this.h;
            if (b || !n.b(this.n, n2)) {
                b2 = false;
            }
            h[n2] = b2;
            ++n2;
        }
        this.h(this.c);
        this.g();
        this.n = n;
        this.i();
        i = this.a.i(n.c, this.h, this.c, array, i);
        this.c(this.c);
        this.e = false;
        int n3 = 0;
        while (true) {
            final Q[] c = this.c;
            if (n3 >= c.length) {
                break;
            }
            if (c[n3] != null) {
                g0.a.f(n.c(n3));
                if (this.i[n3].l() != -2) {
                    this.e = true;
                }
            }
            else {
                g0.a.f(n.c[n3] == null);
            }
            ++n3;
        }
        return i;
    }
    
    public final void c(final Q[] array) {
        int n = 0;
        while (true) {
            final a1[] i = this.i;
            if (n >= i.length) {
                break;
            }
            if (i[n].l() == -2 && this.n.c(n)) {
                array[n] = new x0.o();
            }
            ++n;
        }
    }
    
    public boolean d(final C0 c0) {
        if (E0.d(this.f.e, c0.e)) {
            final C0 f = this.f;
            if (f.b == c0.b && f.a.equals(c0.a)) {
                return true;
            }
        }
        return false;
    }
    
    public void e(long a, final float n, final long n2) {
        a.f(this.t());
        a = this.A(a);
        this.a.g(new y0.b().f(a).g(n).e(n2).d());
    }
    
    public final void g() {
        if (!this.t()) {
            return;
        }
        int n = 0;
        while (true) {
            final E n2 = this.n;
            if (n >= n2.a) {
                break;
            }
            final boolean c = n2.c(n);
            final y y = this.n.c[n];
            if (c && y != null) {
                y.g();
            }
            ++n;
        }
    }
    
    public final void h(final Q[] array) {
        int n = 0;
        while (true) {
            final a1[] i = this.i;
            if (n >= i.length) {
                break;
            }
            if (i[n].l() == -2) {
                array[n] = null;
            }
            ++n;
        }
    }
    
    public final void i() {
        if (!this.t()) {
            return;
        }
        int n = 0;
        while (true) {
            final E n2 = this.n;
            if (n >= n2.a) {
                break;
            }
            final boolean c = n2.c(n);
            final y y = this.n.c[n];
            if (c && y != null) {
                y.j();
            }
            ++n;
        }
    }
    
    public long j() {
        if (!this.d) {
            return this.f.b;
        }
        long f;
        if (this.e) {
            f = this.a.f();
        }
        else {
            f = Long.MIN_VALUE;
        }
        long e = f;
        if (f == Long.MIN_VALUE) {
            e = this.f.e;
        }
        return e;
    }
    
    public B0 k() {
        return this.l;
    }
    
    public long l() {
        if (!this.d) {
            return 0L;
        }
        return this.a.c();
    }
    
    public long m() {
        return this.o;
    }
    
    public long n() {
        return this.f.b + this.o;
    }
    
    public Z o() {
        return this.m;
    }
    
    public E p() {
        return this.n;
    }
    
    public void q(final float n, final I i) {
        this.d = true;
        this.m = this.a.n();
        final E x = this.x(n, i);
        final C0 f = this.f;
        final long b = f.b;
        final long e = f.e;
        long max = b;
        if (e != -9223372036854775807L) {
            max = b;
            if (b >= e) {
                max = Math.max(0L, e - 1L);
            }
        }
        final long a = this.a(x, max, false);
        final long o = this.o;
        final C0 f2 = this.f;
        this.o = o + (f2.b - a);
        this.f = f2.b(a);
    }
    
    public boolean r() {
        try {
            if (!this.d) {
                this.a.p();
                return false;
            }
            final Q[] c = this.c;
            for (int length = c.length, i = 0; i < length; ++i) {
                final Q q = c[i];
                if (q != null) {
                    q.a();
                }
            }
            return false;
        }
        catch (IOException ex) {
            return true;
        }
    }
    
    public boolean s() {
        return this.d && (!this.e || this.a.f() == Long.MIN_VALUE);
    }
    
    public final boolean t() {
        return this.l == null;
    }
    
    public void u(final long n) {
        g0.a.f(this.t());
        if (this.d) {
            this.a.h(this.A(n));
        }
    }
    
    public void v() {
        this.g();
        w(this.k, this.a);
    }
    
    public E x(final float n, final I i) {
        final E k = this.j.k(this.i, this.o(), this.f.a, i);
        final int n2 = 0;
        for (int j = 0; j < k.a; ++j) {
            final boolean c = k.c(j);
            final boolean b = true;
            boolean b2 = false;
            Label_0091: {
                if (c) {
                    b2 = b;
                    if (k.c[j] != null) {
                        break Label_0091;
                    }
                    if (this.i[j].l() == -2) {
                        b2 = b;
                        break Label_0091;
                    }
                }
                else if (k.c[j] == null) {
                    b2 = b;
                    break Label_0091;
                }
                b2 = false;
            }
            g0.a.f(b2);
        }
        final y[] c2 = k.c;
        for (int length = c2.length, l = n2; l < length; ++l) {
            final y y = c2[l];
            if (y != null) {
                y.r(n);
            }
        }
        return k;
    }
    
    public void y(final B0 l) {
        if (l == this.l) {
            return;
        }
        this.g();
        this.l = l;
        this.i();
    }
    
    public void z(final long o) {
        this.o = o;
    }
    
    public interface a
    {
        B0 a(final C0 p0, final long p1);
    }
}
