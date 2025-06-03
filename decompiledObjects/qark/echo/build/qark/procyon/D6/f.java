// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D6;

import java.util.Arrays;

public final class f extends c
{
    public final transient byte[][] t;
    public final transient int[] u;
    
    public f(final a a, final int n) {
        super(null);
        g.b(a.p, 0L, n);
        d d = a.o;
        final int n2 = 0;
        int n3;
        int c;
        int b;
        for (int i = n3 = 0; i < n; i += c - b, ++n3, d = d.f) {
            c = d.c;
            b = d.b;
            if (c == b) {
                throw new AssertionError((Object)"s.limit == s.pos");
            }
        }
        this.t = new byte[n3][];
        this.u = new int[n3 * 2];
        d d2 = a.o;
        int n4 = 0;
        int j = n2;
        while (j < n) {
            final byte[][] t = this.t;
            t[n4] = d2.a;
            final int c2 = d2.c;
            final int b2 = d2.b;
            if ((j += c2 - b2) > n) {
                j = n;
            }
            final int[] u = this.u;
            u[n4] = j;
            u[t.length + n4] = b2;
            d2.d = true;
            ++n4;
            d2 = d2.f;
        }
    }
    
    private Object writeReplace() {
        return this.C();
    }
    
    public final c C() {
        return new c(this.z());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            if (c.r() == this.r() && this.w(0, c, 0, this.r())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int p = super.p;
        if (p != 0) {
            return p;
        }
        final int length = this.t.length;
        int i = 0;
        int p2 = 1;
        int n = 0;
        while (i < length) {
            final byte[] array = this.t[i];
            final int[] u = this.u;
            final int n2 = u[length + i];
            final int n3 = u[i];
            for (int j = n2; j < n3 - n + n2; ++j) {
                p2 = p2 * 31 + array[j];
            }
            ++i;
            n = n3;
        }
        return super.p = p2;
    }
    
    @Override
    public byte l(final int n) {
        g.b(this.u[this.t.length - 1], n, 1L);
        final int x = this.x(n);
        int n2;
        if (x == 0) {
            n2 = 0;
        }
        else {
            n2 = this.u[x - 1];
        }
        final int[] u = this.u;
        final byte[][] t = this.t;
        return t[x][n - n2 + u[t.length + x]];
    }
    
    @Override
    public String m() {
        return this.C().m();
    }
    
    @Override
    public boolean o(int n, final byte[] array, int n2, int i) {
        if (n < 0 || n > this.r() - i || n2 < 0) {
            return false;
        }
        if (n2 > array.length - i) {
            return false;
        }
        final int x = this.x(n);
        int n3 = n;
        int n4;
        int min;
        int[] u;
        byte[][] t;
        for (n = x; i > 0; i -= min, ++n) {
            if (n == 0) {
                n4 = 0;
            }
            else {
                n4 = this.u[n - 1];
            }
            min = Math.min(i, this.u[n] - n4 + n4 - n3);
            u = this.u;
            t = this.t;
            if (!g.a(t[n], n3 - n4 + u[t.length + n], array, n2, min)) {
                return false;
            }
            n3 += min;
            n2 += min;
        }
        return true;
    }
    
    @Override
    public int r() {
        return this.u[this.t.length - 1];
    }
    
    @Override
    public c s(final int n, final int n2) {
        return this.C().s(n, n2);
    }
    
    @Override
    public String toString() {
        return this.C().toString();
    }
    
    @Override
    public String u() {
        return this.C().u();
    }
    
    public boolean w(int n, final c c, int n2, int i) {
        if (n < 0) {
            return false;
        }
        if (n > this.r() - i) {
            return false;
        }
        final int x = this.x(n);
        int n3 = n;
        int n4;
        int min;
        int[] u;
        byte[][] t;
        for (n = x; i > 0; i -= min, ++n) {
            if (n == 0) {
                n4 = 0;
            }
            else {
                n4 = this.u[n - 1];
            }
            min = Math.min(i, this.u[n] - n4 + n4 - n3);
            u = this.u;
            t = this.t;
            if (!c.o(n2, t[n], n3 - n4 + u[t.length + n], min)) {
                return false;
            }
            n3 += min;
            n2 += min;
        }
        return true;
    }
    
    public final int x(int binarySearch) {
        binarySearch = Arrays.binarySearch(this.u, 0, this.t.length, binarySearch + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return binarySearch;
    }
    
    public byte[] z() {
        final int[] u = this.u;
        final byte[][] t = this.t;
        final byte[] array = new byte[u[t.length - 1]];
        final int length = t.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int[] u2 = this.u;
            final int n2 = u2[length + i];
            final int n3 = u2[i];
            System.arraycopy(this.t[i], n2, array, n, n3 - n);
            ++i;
            n = n3;
        }
        return array;
    }
}
