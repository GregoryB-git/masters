// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

public final class X extends c implements RandomAccess
{
    public static final X r;
    public Object[] p;
    public int q;
    
    static {
        (r = new X(new Object[0], 0)).j();
    }
    
    public X(final Object[] p2, final int q) {
        this.p = p2;
        this.q = q;
    }
    
    public static Object[] d(final int n) {
        return new Object[n];
    }
    
    public static X f() {
        return X.r;
    }
    
    private void g(final int n) {
        if (n >= 0 && n < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    private String i(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.q);
        return sb.toString();
    }
    
    @Override
    public void add(final int n, final Object o) {
        this.a();
        if (n >= 0) {
            final int q = this.q;
            if (n <= q) {
                final Object[] p2 = this.p;
                if (q < p2.length) {
                    System.arraycopy(p2, n, p2, n + 1, q - n);
                }
                else {
                    final Object[] d = d(q * 3 / 2 + 1);
                    System.arraycopy(this.p, 0, d, 0, n);
                    System.arraycopy(this.p, n, d, n + 1, this.q - n);
                    this.p = d;
                }
                this.p[n] = o;
                ++this.q;
                ++super.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    @Override
    public boolean add(final Object o) {
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
    
    @Override
    public Object get(final int n) {
        this.g(n);
        return this.p[n];
    }
    
    public X k(final int newLength) {
        if (newLength >= this.q) {
            return new X(Arrays.copyOf(this.p, newLength), this.q);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public Object remove(final int n) {
        this.a();
        this.g(n);
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
    public Object set(final int n, final Object o) {
        this.a();
        this.g(n);
        final Object[] p2 = this.p;
        final Object o2 = p2[n];
        p2[n] = o;
        ++super.modCount;
        return o2;
    }
    
    @Override
    public int size() {
        return this.q;
    }
}
