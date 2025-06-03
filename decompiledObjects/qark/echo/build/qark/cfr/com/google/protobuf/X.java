/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.RandomAccess
 */
package com.google.protobuf;

import com.google.protobuf.c;
import com.google.protobuf.t;
import java.util.Arrays;
import java.util.RandomAccess;

public final class X
extends c
implements RandomAccess {
    public static final X r;
    public Object[] p;
    public int q;

    static {
        X x8;
        r = x8 = new X(new Object[0], 0);
        x8.j();
    }

    public X(Object[] arrobject, int n8) {
        this.p = arrobject;
        this.q = n8;
    }

    public static Object[] d(int n8) {
        return new Object[n8];
    }

    public static X f() {
        return r;
    }

    private void g(int n8) {
        if (n8 >= 0 && n8 < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    private String i(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void add(int n8, Object object) {
        int n9;
        this.a();
        if (n8 >= 0 && n8 <= (n9 = this.q)) {
            Object[] arrobject = this.p;
            if (n9 < arrobject.length) {
                System.arraycopy((Object)arrobject, (int)n8, (Object)arrobject, (int)(n8 + 1), (int)(n9 - n8));
            } else {
                arrobject = X.d(n9 * 3 / 2 + 1);
                System.arraycopy((Object)this.p, (int)0, (Object)arrobject, (int)0, (int)n8);
                System.arraycopy((Object)this.p, (int)n8, (Object)arrobject, (int)(n8 + 1), (int)(this.q - n8));
                this.p = arrobject;
            }
            this.p[n8] = object;
            ++this.q;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public boolean add(Object object) {
        this.a();
        int n8 = this.q;
        Object[] arrobject = this.p;
        if (n8 == arrobject.length) {
            this.p = Arrays.copyOf((Object[])arrobject, (int)(n8 * 3 / 2 + 1));
        }
        arrobject = this.p;
        n8 = this.q;
        this.q = n8 + 1;
        arrobject[n8] = object;
        ++this.modCount;
        return true;
    }

    public Object get(int n8) {
        this.g(n8);
        return this.p[n8];
    }

    public X k(int n8) {
        if (n8 >= this.q) {
            return new X(Arrays.copyOf((Object[])this.p, (int)n8), this.q);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Object remove(int n8) {
        this.a();
        this.g(n8);
        Object[] arrobject = this.p;
        Object object = arrobject[n8];
        int n9 = this.q;
        if (n8 < n9 - 1) {
            System.arraycopy((Object)arrobject, (int)(n8 + 1), (Object)arrobject, (int)n8, (int)(n9 - n8 - 1));
        }
        --this.q;
        ++this.modCount;
        return object;
    }

    public Object set(int n8, Object object) {
        this.a();
        this.g(n8);
        Object[] arrobject = this.p;
        Object object2 = arrobject[n8];
        arrobject[n8] = object;
        ++this.modCount;
        return object2;
    }

    public int size() {
        return this.q;
    }
}

