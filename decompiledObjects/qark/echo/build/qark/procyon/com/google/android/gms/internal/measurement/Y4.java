// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

public final class Y4 extends l3 implements RandomAccess
{
    public static final Y4 r;
    public Object[] p;
    public int q;
    
    static {
        r = new Y4(new Object[0], 0, false);
    }
    
    public Y4(final Object[] p3, final int q, final boolean b) {
        super(b);
        this.p = p3;
        this.q = q;
    }
    
    public static Y4 g() {
        return Y4.r;
    }
    
    @Override
    public final void add(final int n, final Object o) {
        this.a();
        if (n >= 0) {
            final int q = this.q;
            if (n <= q) {
                final Object[] p2 = this.p;
                if (q < p2.length) {
                    System.arraycopy(p2, n, p2, n + 1, q - n);
                }
                else {
                    final Object[] p3 = new Object[q * 3 / 2 + 1];
                    System.arraycopy(p2, 0, p3, 0, n);
                    System.arraycopy(this.p, n, p3, n + 1, this.q - n);
                    this.p = p3;
                }
                this.p[n] = o;
                ++this.q;
                ++super.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.d(n));
    }
    
    @Override
    public final boolean add(final Object o) {
        this.a();
        final int q = this.q;
        final Object[] p = this.p;
        if (q == p.length) {
            this.p = Arrays.copyOf(p, q * 3 / 2 + 1);
        }
        this.p[this.q++] = o;
        ++super.modCount;
        return true;
    }
    
    public final String d(final int i) {
        final int q = this.q;
        final StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(q);
        return sb.toString();
    }
    
    public final void f(final int n) {
        if (n >= 0 && n < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.d(n));
    }
    
    @Override
    public final Object get(final int n) {
        this.f(n);
        return this.p[n];
    }
    
    @Override
    public final Object remove(final int n) {
        this.a();
        this.f(n);
        final Object[] p = this.p;
        final Object o = p[n];
        final int q = this.q;
        if (n < q - 1) {
            System.arraycopy(p, n + 1, p, n, q - n - 1);
        }
        --this.q;
        ++super.modCount;
        return o;
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        this.a();
        this.f(n);
        final Object[] p2 = this.p;
        final Object o2 = p2[n];
        p2[n] = o;
        ++super.modCount;
        return o2;
    }
    
    @Override
    public final int size() {
        return this.q;
    }
}
