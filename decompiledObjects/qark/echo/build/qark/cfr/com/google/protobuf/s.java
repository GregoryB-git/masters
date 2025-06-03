/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.RandomAccess
 */
package com.google.protobuf;

import com.google.protobuf.U;
import com.google.protobuf.c;
import com.google.protobuf.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class s
extends c
implements t.d,
RandomAccess,
U {
    public static final s r;
    public int[] p;
    public int q;

    static {
        s s8;
        r = s8 = new s(new int[0], 0);
        s8.j();
    }

    public s(int[] arrn, int n8) {
        this.p = arrn;
        this.q = n8;
    }

    public static s i() {
        return r;
    }

    public Integer D(int n8) {
        this.a();
        this.k(n8);
        int[] arrn = this.p;
        int n9 = arrn[n8];
        int n10 = this.q;
        if (n8 < n10 - 1) {
            System.arraycopy((Object)arrn, (int)(n8 + 1), (Object)arrn, (int)n8, (int)(n10 - n8 - 1));
        }
        --this.q;
        ++this.modCount;
        return n9;
    }

    @Override
    public int F(int n8) {
        this.k(n8);
        return this.p[n8];
    }

    public Integer M(int n8, Integer n9) {
        return this.S(n8, n9);
    }

    public int S(int n8, int n9) {
        this.a();
        this.k(n8);
        int[] arrn = this.p;
        int n10 = arrn[n8];
        arrn[n8] = n9;
        return n10;
    }

    @Override
    public boolean addAll(Collection object) {
        this.a();
        t.a(object);
        if (!(object instanceof s)) {
            return super.addAll((Collection)object);
        }
        object = (s)object;
        int n8 = object.q;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.q;
        if (Integer.MAX_VALUE - n9 >= n8) {
            int[] arrn = this.p;
            if ((n8 = n9 + n8) > arrn.length) {
                this.p = Arrays.copyOf((int[])arrn, (int)n8);
            }
            System.arraycopy((Object)object.p, (int)0, (Object)this.p, (int)this.q, (int)object.q);
            this.q = n8;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object object) {
        if (this.indexOf(object) != -1) {
            return true;
        }
        return false;
    }

    public void d(int n8, Integer n9) {
        this.g(n8, n9);
    }

    @Override
    public boolean equals(Object arrn) {
        if (this == arrn) {
            return true;
        }
        if (!(arrn instanceof s)) {
            return super.equals(arrn);
        }
        arrn = (s)arrn;
        if (this.q != arrn.q) {
            return false;
        }
        arrn = arrn.p;
        for (int i8 = 0; i8 < this.q; ++i8) {
            if (this.p[i8] == arrn[i8]) continue;
            return false;
        }
        return true;
    }

    public boolean f(Integer n8) {
        this.z(n8);
        return true;
    }

    public final void g(int n8, int n9) {
        int n10;
        this.a();
        if (n8 >= 0 && n8 <= (n10 = this.q)) {
            int[] arrn = this.p;
            if (n10 < arrn.length) {
                System.arraycopy((Object)arrn, (int)n8, (Object)arrn, (int)(n8 + 1), (int)(n10 - n8));
            } else {
                int[] arrn2 = new int[n10 * 3 / 2 + 1];
                System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n8);
                System.arraycopy((Object)this.p, (int)n8, (Object)arrn2, (int)(n8 + 1), (int)(this.q - n8));
                this.p = arrn2;
            }
            this.p[n8] = n9;
            ++this.q;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.s(n8));
    }

    @Override
    public t.d h(int n8) {
        if (n8 >= this.q) {
            return new s(Arrays.copyOf((int[])this.p, (int)n8), this.q);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.q; ++i8) {
            n8 = n8 * 31 + this.p[i8];
        }
        return n8;
    }

    public int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n8 = (Integer)object;
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.p[i8] != n8) continue;
            return i8;
        }
        return -1;
    }

    public final void k(int n8) {
        if (n8 >= 0 && n8 < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.s(n8));
    }

    public Integer q(int n8) {
        return this.F(n8);
    }

    public void removeRange(int n8, int n9) {
        this.a();
        if (n9 >= n8) {
            int[] arrn = this.p;
            System.arraycopy((Object)arrn, (int)n9, (Object)arrn, (int)n8, (int)(this.q - n9));
            this.q -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final String s(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public int size() {
        return this.q;
    }

    @Override
    public void z(int n8) {
        this.a();
        int n9 = this.q;
        int[] arrn = this.p;
        if (n9 == arrn.length) {
            int[] arrn2 = new int[n9 * 3 / 2 + 1];
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n9);
            this.p = arrn2;
        }
        arrn = this.p;
        n9 = this.q;
        this.q = n9 + 1;
        arrn[n9] = n8;
    }
}

