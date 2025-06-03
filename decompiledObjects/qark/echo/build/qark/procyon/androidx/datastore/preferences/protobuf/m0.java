// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class m0
{
    public static final m0 f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    
    static {
        f = new m0(0, new int[0], new Object[0], false);
    }
    
    public m0() {
        this(0, new int[8], new Object[8], true);
    }
    
    public m0(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static boolean c(final int[] array, final int[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean d(final Object[] array, final Object[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (!array[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static m0 e() {
        return m0.f;
    }
    
    public static int h(final int[] array, final int n) {
        int n2 = 17;
        for (int i = 0; i < n; ++i) {
            n2 = n2 * 31 + array[i];
        }
        return n2;
    }
    
    public static int i(final Object[] array, final int n) {
        int n2 = 17;
        for (int i = 0; i < n; ++i) {
            n2 = n2 * 31 + array[i].hashCode();
        }
        return n2;
    }
    
    public static m0 k(final m0 m0, final m0 m2) {
        final int n = m0.a + m2.a;
        final int[] copy = Arrays.copyOf(m0.b, n);
        System.arraycopy(m2.b, 0, copy, m0.a, m2.a);
        final Object[] copy2 = Arrays.copyOf(m0.c, n);
        System.arraycopy(m2.c, 0, copy2, m0.a, m2.a);
        return new m0(n, copy, copy2, true);
    }
    
    public static m0 l() {
        return new m0();
    }
    
    public static void p(int b, final Object o, final s0 s0) {
        final int a = r0.a(b);
        b = r0.b(b);
        if (b == 0) {
            s0.c(a, (long)o);
            return;
        }
        if (b == 1) {
            s0.u(a, (long)o);
            return;
        }
        if (b == 2) {
            s0.J(a, (g)o);
            return;
        }
        if (b != 3) {
            if (b == 5) {
                s0.l(a, (int)o);
                return;
            }
            throw new RuntimeException(z.d());
        }
        else {
            if (s0.v() == androidx.datastore.preferences.protobuf.s0.a.o) {
                s0.h(a);
                ((m0)o).q(s0);
                s0.z(a);
                return;
            }
            s0.z(a);
            ((m0)o).q(s0);
            s0.h(a);
        }
    }
    
    public void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void b() {
        final int a = this.a;
        final int[] b = this.b;
        if (a == b.length) {
            int n;
            if (a < 4) {
                n = 8;
            }
            else {
                n = a >> 1;
            }
            final int n2 = a + n;
            this.b = Arrays.copyOf(b, n2);
            this.c = Arrays.copyOf(this.c, n2);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof m0)) {
            return false;
        }
        final m0 m0 = (m0)o;
        final int a = this.a;
        return a == m0.a && c(this.b, m0.b, a) && d(this.c, m0.c, this.a);
    }
    
    public int f() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            final int n = this.b[i];
            final int a = r0.a(n);
            final int b = r0.b(n);
            int n2;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 5) {
                                throw new IllegalStateException(z.d());
                            }
                            n2 = j.l(a, (int)this.c[i]);
                        }
                        else {
                            n2 = j.P(a) * 2 + ((m0)this.c[i]).f();
                        }
                    }
                    else {
                        n2 = j.f(a, (g)this.c[i]);
                    }
                }
                else {
                    n2 = j.n(a, (long)this.c[i]);
                }
            }
            else {
                n2 = j.S(a, (long)this.c[i]);
            }
            d2 += n2;
            ++i;
        }
        return this.d = d2;
    }
    
    public int g() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        int i = 0;
        int d2 = 0;
        while (i < this.a) {
            d2 += j.D(r0.a(this.b[i]), (g)this.c[i]);
            ++i;
        }
        return this.d = d2;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        return ((527 + a) * 31 + h(this.b, a)) * 31 + i(this.c, this.a);
    }
    
    public void j() {
        this.e = false;
    }
    
    public final void m(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            Q.c(sb, n, String.valueOf(r0.a(this.b[i])), this.c[i]);
        }
    }
    
    public void n(final int n, final Object o) {
        this.a();
        this.b();
        final int[] b = this.b;
        final int a = this.a;
        b[a] = n;
        this.c[a] = o;
        this.a = a + 1;
    }
    
    public void o(final s0 s0) {
        if (s0.v() == androidx.datastore.preferences.protobuf.s0.a.p) {
            for (int i = this.a - 1; i >= 0; --i) {
                s0.f(r0.a(this.b[i]), this.c[i]);
            }
        }
        else {
            for (int j = 0; j < this.a; ++j) {
                s0.f(r0.a(this.b[j]), this.c[j]);
            }
        }
    }
    
    public void q(final s0 s0) {
        if (this.a == 0) {
            return;
        }
        if (s0.v() == androidx.datastore.preferences.protobuf.s0.a.o) {
            for (int i = 0; i < this.a; ++i) {
                p(this.b[i], this.c[i], s0);
            }
        }
        else {
            for (int j = this.a - 1; j >= 0; --j) {
                p(this.b[j], this.c[j], s0);
            }
        }
    }
}
