/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Arrays
 */
package g0;

import g0.a;
import java.util.Arrays;

public final class D {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public D() {
        this(10);
    }

    public D(int n8) {
        this.a = new long[n8];
        this.b = D.f(n8);
    }

    public static Object[] f(int n8) {
        return new Object[n8];
    }

    public void a(long l8, Object object) {
        synchronized (this) {
            this.d(l8);
            this.e();
            this.b(l8, object);
            return;
        }
    }

    public final void b(long l8, Object object) {
        int n8 = this.c;
        int n9 = this.d;
        Object[] arrobject = this.b;
        n8 = (n8 + n9) % arrobject.length;
        this.a[n8] = l8;
        arrobject[n8] = object;
        this.d = n9 + 1;
    }

    public void c() {
        synchronized (this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill((Object[])this.b, (Object)null);
            return;
        }
    }

    public final void d(long l8) {
        int n8;
        int n9;
        int n10 = this.d;
        if (n10 > 0 && l8 <= this.a[((n9 = this.c) + n10 - 1) % (n8 = this.b.length)]) {
            this.c();
        }
    }

    public final void e() {
        int n8 = this.b.length;
        if (this.d < n8) {
            return;
        }
        int n9 = n8 * 2;
        long[] arrl = new long[n9];
        Object[] arrobject = D.f(n9);
        n9 = this.c;
        System.arraycopy((Object)this.a, (int)n9, (Object)arrl, (int)0, (int)(n8 -= n9));
        System.arraycopy((Object)this.b, (int)this.c, (Object)arrobject, (int)0, (int)n8);
        n9 = this.c;
        if (n9 > 0) {
            System.arraycopy((Object)this.a, (int)0, (Object)arrl, (int)n8, (int)n9);
            System.arraycopy((Object)this.b, (int)0, (Object)arrobject, (int)n8, (int)this.c);
        }
        this.a = arrl;
        this.b = arrobject;
        this.c = 0;
    }

    public final Object g(long l8, boolean bl) {
        Object object = null;
        long l9 = Long.MAX_VALUE;
        while (this.d > 0) {
            long l10 = l8 - this.a[this.c];
            if (l10 < 0L) {
                if (bl) break;
                if (- l10 >= l9) {
                    return object;
                }
            }
            object = this.j();
            l9 = l10;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object h() {
        synchronized (this) {
            block4 : {
                if (this.d != 0) break block4;
                return null;
            }
            return this.j();
        }
    }

    public Object i(long l8) {
        synchronized (this) {
            Object object = this.g(l8, true);
            return object;
        }
    }

    public final Object j() {
        boolean bl = this.d > 0;
        a.f(bl);
        Object[] arrobject = this.b;
        int n8 = this.c;
        Object object = arrobject[n8];
        arrobject[n8] = null;
        this.c = (n8 + 1) % arrobject.length;
        --this.d;
        return object;
    }

    public int k() {
        synchronized (this) {
            int n8 = this.d;
            return n8;
        }
    }
}

