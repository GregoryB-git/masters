// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class s extends c implements d, RandomAccess, U
{
    public static final s r;
    public int[] p;
    public int q;
    
    static {
        (r = new s(new int[0], 0)).j();
    }
    
    public s(final int[] p2, final int q) {
        this.p = p2;
        this.q = q;
    }
    
    public static s i() {
        return s.r;
    }
    
    public Integer D(final int n) {
        this.a();
        this.k(n);
        final int[] p = this.p;
        final int i = p[n];
        final int q = this.q;
        if (n < q - 1) {
            System.arraycopy(p, n + 1, p, n, q - n - 1);
        }
        --this.q;
        ++super.modCount;
        return i;
    }
    
    @Override
    public int F(final int n) {
        this.k(n);
        return this.p[n];
    }
    
    public Integer M(final int n, final Integer n2) {
        return this.S(n, n2);
    }
    
    public int S(final int n, final int n2) {
        this.a();
        this.k(n);
        final int[] p2 = this.p;
        final int n3 = p2[n];
        p2[n] = n2;
        return n3;
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        this.a();
        t.a(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        final s s = (s)collection;
        final int q = s.q;
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
            System.arraycopy(s.p, 0, this.p, this.q, s.q);
            this.q = n;
            ++super.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public void d(final int n, final Integer n2) {
        this.g(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return super.equals(o);
        }
        final s s = (s)o;
        if (this.q != s.q) {
            return false;
        }
        final int[] p = s.p;
        for (int i = 0; i < this.q; ++i) {
            if (this.p[i] != p[i]) {
                return false;
            }
        }
        return true;
    }
    
    public boolean f(final Integer n) {
        this.z(n);
        return true;
    }
    
    public final void g(final int n, final int n2) {
        this.a();
        if (n >= 0) {
            final int q = this.q;
            if (n <= q) {
                final int[] p2 = this.p;
                if (q < p2.length) {
                    System.arraycopy(p2, n, p2, n + 1, q - n);
                }
                else {
                    final int[] p3 = new int[q * 3 / 2 + 1];
                    System.arraycopy(p2, 0, p3, 0, n);
                    System.arraycopy(this.p, n, p3, n + 1, this.q - n);
                    this.p = p3;
                }
                this.p[n] = n2;
                ++this.q;
                ++super.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.s(n));
    }
    
    @Override
    public d h(final int newLength) {
        if (newLength >= this.q) {
            return new s(Arrays.copyOf(this.p, newLength), this.q);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        for (int i = 0; i < this.q; ++i) {
            n = n * 31 + this.p[i];
        }
        return n;
    }
    
    @Override
    public int indexOf(final Object o) {
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
        throw new IndexOutOfBoundsException(this.s(n));
    }
    
    public Integer q(final int n) {
        return this.F(n);
    }
    
    public void removeRange(final int n, final int n2) {
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
    
    public final String s(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.q);
        return sb.toString();
    }
    
    @Override
    public int size() {
        return this.q;
    }
    
    @Override
    public void z(final int n) {
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
}
