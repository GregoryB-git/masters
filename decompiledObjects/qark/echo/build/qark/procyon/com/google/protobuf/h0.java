// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Arrays;

public final class h0
{
    public static final h0 f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    
    static {
        f = new h0(0, new int[0], new Object[0], false);
    }
    
    public h0(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static h0 c() {
        return h0.f;
    }
    
    public static int f(final int[] array, final int n) {
        int n2 = 17;
        for (int i = 0; i < n; ++i) {
            n2 = n2 * 31 + array[i];
        }
        return n2;
    }
    
    public static int g(final Object[] array, final int n) {
        int n2 = 17;
        for (int i = 0; i < n; ++i) {
            n2 = n2 * 31 + array[i].hashCode();
        }
        return n2;
    }
    
    public static h0 j(final h0 h0, final h0 h2) {
        final int n = h0.a + h2.a;
        final int[] copy = Arrays.copyOf(h0.b, n);
        System.arraycopy(h2.b, 0, copy, h0.a, h2.a);
        final Object[] copy2 = Arrays.copyOf(h0.c, n);
        System.arraycopy(h2.c, 0, copy2, h0.a, h2.a);
        return new h0(n, copy, copy2, true);
    }
    
    public static boolean k(final Object[] array, final Object[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (!array[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean m(final int[] array, final int[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void o(int b, final Object o, final n0 n0) {
        final int a = m0.a(b);
        b = m0.b(b);
        if (b == 0) {
            n0.c(a, (long)o);
            return;
        }
        if (b == 1) {
            n0.u(a, (long)o);
            return;
        }
        if (b == 2) {
            n0.M(a, (f)o);
            return;
        }
        if (b != 3) {
            if (b == 5) {
                n0.l(a, (int)o);
                return;
            }
            throw new RuntimeException(v.a());
        }
        else {
            if (n0.v() == com.google.protobuf.n0.a.o) {
                n0.h(a);
                ((h0)o).p(n0);
                n0.z(a);
                return;
            }
            n0.z(a);
            ((h0)o).p(n0);
            n0.h(a);
        }
    }
    
    public void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void b(int n) {
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
    
    public int d() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            final int n = this.b[i];
            final int a = m0.a(n);
            final int b = m0.b(n);
            int n2;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 5) {
                                throw new IllegalStateException(v.a());
                            }
                            n2 = h.m(a, (int)this.c[i]);
                        }
                        else {
                            n2 = h.O(a) * 2 + ((h0)this.c[i]).d();
                        }
                    }
                    else {
                        n2 = h.g(a, (f)this.c[i]);
                    }
                }
                else {
                    n2 = h.o(a, (long)this.c[i]);
                }
            }
            else {
                n2 = h.R(a, (long)this.c[i]);
            }
            d2 += n2;
            ++i;
        }
        return this.d = d2;
    }
    
    public int e() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            d2 += h.D(m0.a(this.b[i]), (f)this.c[i]);
            ++i;
        }
        return this.d = d2;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof h0)) {
            return false;
        }
        final h0 h0 = (h0)o;
        final int a = this.a;
        return a == h0.a && m(this.b, h0.b, a) && k(this.c, h0.c, this.a);
    }
    
    public void h() {
        this.e = false;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        return ((527 + a) * 31 + f(this.b, a)) * 31 + g(this.c, this.a);
    }
    
    public h0 i(final h0 h0) {
        if (h0.equals(c())) {
            return this;
        }
        this.a();
        final int a = this.a + h0.a;
        this.b(a);
        System.arraycopy(h0.b, 0, this.b, this.a, h0.a);
        System.arraycopy(h0.c, 0, this.c, this.a, h0.a);
        this.a = a;
        return this;
    }
    
    public final void l(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            M.d(sb, n, String.valueOf(m0.a(this.b[i])), this.c[i]);
        }
    }
    
    public void n(final n0 n0) {
        if (n0.v() == com.google.protobuf.n0.a.p) {
            for (int i = this.a - 1; i >= 0; --i) {
                n0.f(m0.a(this.b[i]), this.c[i]);
            }
        }
        else {
            for (int j = 0; j < this.a; ++j) {
                n0.f(m0.a(this.b[j]), this.c[j]);
            }
        }
    }
    
    public void p(final n0 n0) {
        if (this.a == 0) {
            return;
        }
        if (n0.v() == com.google.protobuf.n0.a.o) {
            for (int i = 0; i < this.a; ++i) {
                o(this.b[i], this.c[i], n0);
            }
        }
        else {
            for (int j = this.a - 1; j >= 0; --j) {
                o(this.b[j], this.c[j], n0);
            }
        }
    }
}
