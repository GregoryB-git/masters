// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class c4 extends l3 implements f4, S4, RandomAccess
{
    public static final c4 r;
    public int[] p;
    public int q;
    
    static {
        r = new c4(new int[0], 0, false);
    }
    
    public c4(final int[] p3, final int q, final boolean b) {
        super(b);
        this.p = p3;
        this.q = q;
    }
    
    public static c4 f() {
        return c4.r;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.a();
        a4.e(collection);
        if (!(collection instanceof c4)) {
            return super.addAll(collection);
        }
        final c4 c4 = (c4)collection;
        final int q = c4.q;
        if (q == 0) {
            return false;
        }
        final int q2 = this.q;
        if (Integer.MAX_VALUE - q2 >= q) {
            final int n = q2 + q;
            final int[] p = this.p;
            if (n > p.length) {
                this.p = Arrays.copyOf(p, n);
            }
            System.arraycopy(c4.p, 0, this.p, this.q, c4.q);
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
    
    public final int d(final int n) {
        this.k(n);
        return this.p[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c4)) {
            return super.equals(o);
        }
        final c4 c4 = (c4)o;
        if (this.q != c4.q) {
            return false;
        }
        final int[] p = c4.p;
        for (int i = 0; i < this.q; ++i) {
            if (this.p[i] != p[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void g(final int n) {
        this.a();
        final int q = this.q;
        final int[] p = this.p;
        if (q == p.length) {
            final int[] p2 = new int[q * 3 / 2 + 1];
            System.arraycopy(p, 0, p2, 0, q);
            this.p = p2;
        }
        this.p[this.q++] = n;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.q; ++i) {
            n = n * 31 + this.p[i];
        }
        return n;
    }
    
    public final String i(final int i) {
        final int q = this.q;
        final StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(q);
        return sb.toString();
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int intValue = (int)o;
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.p[i] == intValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void k(final int n) {
        if (n >= 0 && n < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    @Override
    public final f4 r(final int newLength) {
        if (newLength >= this.q) {
            return new c4(Arrays.copyOf(this.p, newLength), this.q, true);
        }
        throw new IllegalArgumentException();
    }
    
    public final void removeRange(final int n, final int n2) {
        this.a();
        if (n2 >= n) {
            final int[] p2 = this.p;
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
