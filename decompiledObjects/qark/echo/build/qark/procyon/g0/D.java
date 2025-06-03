// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.Arrays;

public final class D
{
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    
    public D() {
        this(10);
    }
    
    public D(final int n) {
        this.a = new long[n];
        this.b = f(n);
    }
    
    public static Object[] f(final int n) {
        return new Object[n];
    }
    
    public void a(final long n, final Object o) {
        synchronized (this) {
            this.d(n);
            this.e();
            this.b(n, o);
        }
    }
    
    public final void b(final long n, final Object o) {
        final int c = this.c;
        final int d = this.d;
        final Object[] b = this.b;
        final int n2 = (c + d) % b.length;
        this.a[n2] = n;
        b[n2] = o;
        this.d = d + 1;
    }
    
    public void c() {
        synchronized (this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.b, null);
        }
    }
    
    public final void d(final long n) {
        final int d = this.d;
        if (d > 0 && n <= this.a[(this.c + d - 1) % this.b.length]) {
            this.c();
        }
    }
    
    public final void e() {
        final int length = this.b.length;
        if (this.d < length) {
            return;
        }
        final int n = length * 2;
        final long[] a = new long[n];
        final Object[] f = f(n);
        final int c = this.c;
        final int n2 = length - c;
        System.arraycopy(this.a, c, a, 0, n2);
        System.arraycopy(this.b, this.c, f, 0, n2);
        final int c2 = this.c;
        if (c2 > 0) {
            System.arraycopy(this.a, 0, a, n2, c2);
            System.arraycopy(this.b, 0, f, n2, this.c);
        }
        this.a = a;
        this.b = f;
        this.c = 0;
    }
    
    public final Object g(final long n, final boolean b) {
        Object j = null;
        long n2 = Long.MAX_VALUE;
        while (this.d > 0) {
            final long n3 = n - this.a[this.c];
            if (n3 < 0L) {
                if (b) {
                    break;
                }
                if (-n3 >= n2) {
                    return j;
                }
            }
            j = this.j();
            n2 = n3;
        }
        return j;
    }
    
    public Object h() {
        synchronized (this) {
            Object j;
            if (this.d == 0) {
                j = null;
            }
            else {
                j = this.j();
            }
            return j;
        }
    }
    
    public Object i(final long n) {
        synchronized (this) {
            return this.g(n, true);
        }
    }
    
    public final Object j() {
        g0.a.f(this.d > 0);
        final Object[] b = this.b;
        final int c = this.c;
        final Object o = b[c];
        b[c] = null;
        this.c = (c + 1) % b.length;
        --this.d;
        return o;
    }
    
    public int k() {
        synchronized (this) {
            return this.d;
        }
    }
}
