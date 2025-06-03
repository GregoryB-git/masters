// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w4 extends l3 implements i4, S4, RandomAccess
{
    public static final w4 r;
    public long[] p;
    public int q;
    
    static {
        r = new w4(new long[0], 0, false);
    }
    
    public w4(final long[] p3, final int q, final boolean b) {
        super(b);
        this.p = p3;
        this.q = q;
    }
    
    public static w4 f() {
        return w4.r;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.a();
        a4.e(collection);
        if (!(collection instanceof w4)) {
            return super.addAll(collection);
        }
        final w4 w4 = (w4)collection;
        final int q = w4.q;
        if (q == 0) {
            return false;
        }
        final int q2 = this.q;
        if (Integer.MAX_VALUE - q2 >= q) {
            final int n = q2 + q;
            final long[] p = this.p;
            if (n > p.length) {
                this.p = Arrays.copyOf(p, n);
            }
            System.arraycopy(w4.p, 0, this.p, this.q, w4.q);
            this.q = n;
            ++super.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final void d(final long n) {
        this.a();
        final int q = this.q;
        final long[] p = this.p;
        if (q == p.length) {
            final long[] p2 = new long[q * 3 / 2 + 1];
            System.arraycopy(p, 0, p2, 0, q);
            this.p = p2;
        }
        this.p[this.q++] = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w4)) {
            return super.equals(o);
        }
        final w4 w4 = (w4)o;
        if (this.q != w4.q) {
            return false;
        }
        final long[] p = w4.p;
        for (int i = 0; i < this.q; ++i) {
            if (this.p[i] != p[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final String g(final int i) {
        final int q = this.q;
        final StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(q);
        return sb.toString();
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.q; ++i) {
            n = n * 31 + a4.b(this.p[i]);
        }
        return n;
    }
    
    public final void i(final int n) {
        if (n >= 0 && n < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n));
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Long)) {
            return -1;
        }
        final long longValue = (long)o;
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.p[i] == longValue) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final long l(final int n) {
        this.i(n);
        return this.p[n];
    }
    
    @Override
    public final i4 r(final int newLength) {
        if (newLength >= this.q) {
            return new w4(Arrays.copyOf(this.p, newLength), this.q, true);
        }
        throw new IllegalArgumentException();
    }
    
    public final void removeRange(final int n, final int n2) {
        this.a();
        if (n2 >= n) {
            final long[] p2 = this.p;
            System.arraycopy(p2, n2, p2, n, this.q - n2);
            this.q -= n2 - n;
            ++super.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    @Override
    public final int size() {
        return this.q;
    }
}
