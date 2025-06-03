// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class v5
{
    public static final v5 f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    
    static {
        f = new v5(0, new int[0], new Object[0], false);
    }
    
    public v5() {
        this(0, new int[8], new Object[8], true);
    }
    
    public v5(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static v5 c(final v5 v5, final v5 v6) {
        final int n = v5.a + v6.a;
        final int[] copy = Arrays.copyOf(v5.b, n);
        System.arraycopy(v6.b, 0, copy, v5.a, v6.a);
        final Object[] copy2 = Arrays.copyOf(v5.c, n);
        System.arraycopy(v6.c, 0, copy2, v5.a, v6.a);
        return new v5(n, copy, copy2, true);
    }
    
    public static void f(int n, final Object o, final T5 t5) {
        final int n2 = n >>> 3;
        n &= 0x7;
        if (n == 0) {
            t5.j(n2, (long)o);
            return;
        }
        if (n == 1) {
            t5.M(n2, (long)o);
            return;
        }
        if (n == 2) {
            t5.f(n2, (q3)o);
            return;
        }
        if (n != 3) {
            if (n == 5) {
                t5.k(n2, (int)o);
                return;
            }
            throw new RuntimeException(k4.a());
        }
        else {
            if (t5.a() == W5.a) {
                t5.l(n2);
                ((v5)o).j(t5);
                t5.e(n2);
                return;
            }
            t5.e(n2);
            ((v5)o).j(t5);
            t5.l(n2);
        }
    }
    
    public static v5 k() {
        return v5.f;
    }
    
    public static v5 l() {
        return new v5();
    }
    
    public final int a() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            final int n = this.b[i];
            final int n2 = n >>> 3;
            final int n3 = n & 0x7;
            int n4;
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 5) {
                                throw new IllegalStateException(k4.a());
                            }
                            n4 = J3.h0(n2, (int)this.c[i]);
                        }
                        else {
                            n4 = (J3.s0(n2) << 1) + ((v5)this.c[i]).a();
                        }
                    }
                    else {
                        n4 = J3.Q(n2, (q3)this.c[i]);
                    }
                }
                else {
                    n4 = J3.P(n2, (long)this.c[i]);
                }
            }
            else {
                n4 = J3.m0(n2, (long)this.c[i]);
            }
            d2 += n4;
            ++i;
        }
        return this.d = d2;
    }
    
    public final v5 b(final v5 v5) {
        if (v5.equals(v5.f)) {
            return this;
        }
        this.n();
        final int a = this.a + v5.a;
        this.d(a);
        System.arraycopy(v5.b, 0, this.b, this.a, v5.a);
        System.arraycopy(v5.c, 0, this.c, this.a, v5.a);
        this.a = a;
        return this;
    }
    
    public final void d(int n) {
        final int[] b = this.b;
        if (n > b.length) {
            final int a = this.a;
            final int n2 = a + a / 2;
            if (n2 >= n) {
                n = n2;
            }
            int n3 = n;
            if (n < 8) {
                n3 = 8;
            }
            this.b = Arrays.copyOf(b, n3);
            this.c = Arrays.copyOf(this.c, n3);
        }
    }
    
    public final void e(final int n, final Object o) {
        this.n();
        this.d(this.a + 1);
        final int[] b = this.b;
        final int a = this.a;
        b[a] = n;
        this.c[a] = o;
        this.a = a + 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof v5)) {
            return false;
        }
        final v5 v5 = (v5)o;
        final int a = this.a;
        if (a == v5.a) {
            final int[] b = this.b;
            final int[] b2 = v5.b;
            for (int i = 0; i < a; ++i) {
                if (b[i] != b2[i]) {
                    return false;
                }
            }
            final Object[] c = this.c;
            final Object[] c2 = v5.c;
            for (int a2 = this.a, j = 0; j < a2; ++j) {
                if (!c[j].equals(c2[j])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final void g(final T5 t5) {
        if (t5.a() == W5.b) {
            for (int i = this.a - 1; i >= 0; --i) {
                t5.t(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int j = 0; j < this.a; ++j) {
            t5.t(this.b[j] >>> 3, this.c[j]);
        }
    }
    
    public final void h(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            N4.d(sb, n, String.valueOf(this.b[i] >>> 3), this.c[i]);
        }
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int[] b = this.b;
        int n = 17;
        final int n2 = 0;
        int n3 = 17;
        for (int i = 0; i < a; ++i) {
            n3 = n3 * 31 + b[i];
        }
        final Object[] c = this.c;
        for (int a2 = this.a, j = n2; j < a2; ++j) {
            n = n * 31 + c[j].hashCode();
        }
        return ((a + 527) * 31 + n3) * 31 + n;
    }
    
    public final int i() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            d2 += J3.Z(this.b[i] >>> 3, (q3)this.c[i]);
            ++i;
        }
        return this.d = d2;
    }
    
    public final void j(final T5 t5) {
        if (this.a == 0) {
            return;
        }
        if (t5.a() == W5.a) {
            for (int i = 0; i < this.a; ++i) {
                f(this.b[i], this.c[i], t5);
            }
            return;
        }
        for (int j = this.a - 1; j >= 0; --j) {
            f(this.b[j], this.c[j], t5);
        }
    }
    
    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }
    
    public final void n() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }
}
