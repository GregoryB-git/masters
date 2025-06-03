// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import android.util.Pair;
import x0.T;
import d0.I;

public abstract class a extends I
{
    public final int e;
    public final T f;
    public final boolean g;
    
    public a(final boolean g, final T f) {
        this.g = g;
        this.f = f;
        this.e = f.a();
    }
    
    public static Object v(final Object o) {
        return ((Pair)o).second;
    }
    
    public static Object w(final Object o) {
        return ((Pair)o).first;
    }
    
    public static Object y(final Object o, final Object o2) {
        return Pair.create(o, o2);
    }
    
    public abstract int A(final int p0);
    
    public final int B(final int n, final boolean b) {
        if (b) {
            return this.f.c(n);
        }
        if (n < this.e - 1) {
            return n + 1;
        }
        return -1;
    }
    
    public final int C(final int n, final boolean b) {
        if (b) {
            return this.f.f(n);
        }
        if (n > 0) {
            return n - 1;
        }
        return -1;
    }
    
    public abstract I D(final int p0);
    
    @Override
    public int a(boolean b) {
        if (this.e == 0) {
            return -1;
        }
        final boolean g = this.g;
        int n = 0;
        if (g) {
            b = false;
        }
        if (b) {
            n = this.f.e();
        }
        while (this.D(n).q()) {
            if ((n = this.B(n, b)) == -1) {
                return -1;
            }
        }
        return this.A(n) + this.D(n).a(b);
    }
    
    @Override
    public final int b(Object v) {
        if (!(v instanceof Pair)) {
            return -1;
        }
        final Object w = w(v);
        v = v(v);
        final int s = this.s(w);
        if (s == -1) {
            return -1;
        }
        final int b = this.D(s).b(v);
        if (b == -1) {
            return -1;
        }
        return this.z(s) + b;
    }
    
    @Override
    public int c(boolean b) {
        final int e = this.e;
        if (e == 0) {
            return -1;
        }
        if (this.g) {
            b = false;
        }
        int n;
        if (b) {
            n = this.f.g();
        }
        else {
            n = e - 1;
        }
        while (this.D(n).q()) {
            if ((n = this.C(n, b)) == -1) {
                return -1;
            }
        }
        return this.A(n) + this.D(n).c(b);
    }
    
    @Override
    public int e(int n, int n2, boolean b) {
        final boolean g = this.g;
        final int n3 = 0;
        int n4 = n2;
        if (g) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final int u = this.u(n);
        final int a = this.A(u);
        final I d = this.D(u);
        if (n4 == 2) {
            n2 = n3;
        }
        else {
            n2 = n4;
        }
        n = d.e(n - a, n2, b);
        if (n != -1) {
            return a + n;
        }
        for (n = this.B(u, b); n != -1 && this.D(n).q(); n = this.B(n, b)) {}
        if (n != -1) {
            return this.A(n) + this.D(n).a(b);
        }
        if (n4 == 2) {
            return this.a(b);
        }
        return -1;
    }
    
    @Override
    public final b g(final int n, final b b, final boolean b2) {
        final int t = this.t(n);
        final int a = this.A(t);
        this.D(t).g(n - this.z(t), b, b2);
        b.c += a;
        if (b2) {
            b.b = y(this.x(t), g0.a.e(b.b));
        }
        return b;
    }
    
    @Override
    public final b h(final Object b, final b b2) {
        final Object w = w(b);
        final Object v = v(b);
        final int s = this.s(w);
        final int a = this.A(s);
        this.D(s).h(v, b2);
        b2.c += a;
        b2.b = b;
        return b2;
    }
    
    @Override
    public int l(int n, int n2, boolean b) {
        final boolean g = this.g;
        final int n3 = 0;
        int n4 = n2;
        if (g) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final int u = this.u(n);
        final int a = this.A(u);
        final I d = this.D(u);
        if (n4 == 2) {
            n2 = n3;
        }
        else {
            n2 = n4;
        }
        n = d.l(n - a, n2, b);
        if (n != -1) {
            return a + n;
        }
        for (n = this.C(u, b); n != -1 && this.D(n).q(); n = this.C(n, b)) {}
        if (n != -1) {
            return this.A(n) + this.D(n).c(b);
        }
        if (n4 == 2) {
            return this.c(b);
        }
        return -1;
    }
    
    @Override
    public final Object m(final int n) {
        final int t = this.t(n);
        return y(this.x(t), this.D(t).m(n - this.z(t)));
    }
    
    @Override
    public final c o(final int n, final c c, final long n2) {
        final int u = this.u(n);
        final int a = this.A(u);
        final int z = this.z(u);
        this.D(u).o(n - a, c, n2);
        Object a2 = this.x(u);
        if (!I.c.q.equals(c.a)) {
            a2 = y(a2, c.a);
        }
        c.a = a2;
        c.n += z;
        c.o += z;
        return c;
    }
    
    public abstract int s(final Object p0);
    
    public abstract int t(final int p0);
    
    public abstract int u(final int p0);
    
    public abstract Object x(final int p0);
    
    public abstract int z(final int p0);
}
