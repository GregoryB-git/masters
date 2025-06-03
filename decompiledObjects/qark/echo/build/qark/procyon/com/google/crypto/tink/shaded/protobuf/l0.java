// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

public final class l0
{
    public static final l0 f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    
    static {
        f = new l0(0, new int[0], new Object[0], false);
    }
    
    public l0() {
        this(0, new int[8], new Object[8], true);
    }
    
    public l0(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static l0 c() {
        return l0.f;
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
    
    public static l0 j(final l0 l0, final l0 l2) {
        final int n = l0.a + l2.a;
        final int[] copy = Arrays.copyOf(l0.b, n);
        System.arraycopy(l2.b, 0, copy, l0.a, l2.a);
        final Object[] copy2 = Arrays.copyOf(l0.c, n);
        System.arraycopy(l2.c, 0, copy2, l0.a, l2.a);
        return new l0(n, copy, copy2, true);
    }
    
    public static l0 k() {
        return new l0();
    }
    
    public static boolean l(final Object[] array, final Object[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (!array[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean o(final int[] array, final int[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void q(int b, final Object o, final r0 r0) {
        final int a = q0.a(b);
        b = q0.b(b);
        if (b == 0) {
            r0.c(a, (long)o);
            return;
        }
        if (b == 1) {
            r0.u(a, (long)o);
            return;
        }
        if (b == 2) {
            r0.M(a, (h)o);
            return;
        }
        if (b != 3) {
            if (b == 5) {
                r0.l(a, (int)o);
                return;
            }
            throw new RuntimeException(A.e());
        }
        else {
            if (r0.v() == com.google.crypto.tink.shaded.protobuf.r0.a.o) {
                r0.h(a);
                ((l0)o).r(r0);
                r0.z(a);
                return;
            }
            r0.z(a);
            ((l0)o).r(r0);
            r0.h(a);
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
            final int a = q0.a(n);
            final int b = q0.b(n);
            int n2;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 5) {
                                throw new IllegalStateException(A.e());
                            }
                            n2 = k.l(a, (int)this.c[i]);
                        }
                        else {
                            n2 = k.L(a) * 2 + ((l0)this.c[i]).d();
                        }
                    }
                    else {
                        n2 = k.f(a, (h)this.c[i]);
                    }
                }
                else {
                    n2 = k.n(a, (long)this.c[i]);
                }
            }
            else {
                n2 = k.O(a, (long)this.c[i]);
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
            d2 += k.A(q0.a(this.b[i]), (h)this.c[i]);
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
        if (!(o instanceof l0)) {
            return false;
        }
        final l0 l0 = (l0)o;
        final int a = this.a;
        return a == l0.a && o(this.b, l0.b, a) && l(this.c, l0.c, this.a);
    }
    
    public void h() {
        this.e = false;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        return ((527 + a) * 31 + f(this.b, a)) * 31 + g(this.c, this.a);
    }
    
    public l0 i(final l0 l0) {
        if (l0.equals(c())) {
            return this;
        }
        this.a();
        final int a = this.a + l0.a;
        this.b(a);
        System.arraycopy(l0.b, 0, this.b, this.a, l0.a);
        System.arraycopy(l0.c, 0, this.c, this.a, l0.a);
        this.a = a;
        return this;
    }
    
    public final void m(final StringBuilder sb, final int n) {
        for (int i = 0; i < this.a; ++i) {
            Q.d(sb, n, String.valueOf(q0.a(this.b[i])), this.c[i]);
        }
    }
    
    public void n(final int n, final Object o) {
        this.a();
        this.b(this.a + 1);
        final int[] b = this.b;
        final int a = this.a;
        b[a] = n;
        this.c[a] = o;
        this.a = a + 1;
    }
    
    public void p(final r0 r0) {
        if (r0.v() == com.google.crypto.tink.shaded.protobuf.r0.a.p) {
            for (int i = this.a - 1; i >= 0; --i) {
                r0.f(q0.a(this.b[i]), this.c[i]);
            }
        }
        else {
            for (int j = 0; j < this.a; ++j) {
                r0.f(q0.a(this.b[j]), this.c[j]);
            }
        }
    }
    
    public void r(final r0 r0) {
        if (this.a == 0) {
            return;
        }
        if (r0.v() == com.google.crypto.tink.shaded.protobuf.r0.a.o) {
            for (int i = 0; i < this.a; ++i) {
                q(this.b[i], this.c[i], r0);
            }
        }
        else {
            for (int j = this.a - 1; j >= 0; --j) {
                q(this.b[j], this.c[j], r0);
            }
        }
    }
}
