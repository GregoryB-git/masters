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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.l3;
import java.util.Arrays;
import java.util.RandomAccess;

public final class Y4
extends l3
implements RandomAccess {
    public static final Y4 r = new Y4(new Object[0], 0, false);
    public Object[] p;
    public int q;

    public Y4(Object[] arrobject, int n8, boolean bl) {
        super(bl);
        this.p = arrobject;
        this.q = n8;
    }

    public static Y4 g() {
        return r;
    }

    public final void add(int n8, Object object) {
        int n9;
        this.a();
        if (n8 >= 0 && n8 <= (n9 = this.q)) {
            Object[] arrobject = this.p;
            if (n9 < arrobject.length) {
                System.arraycopy((Object)arrobject, (int)n8, (Object)arrobject, (int)(n8 + 1), (int)(n9 - n8));
            } else {
                Object[] arrobject2 = new Object[n9 * 3 / 2 + 1];
                System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n8);
                System.arraycopy((Object)this.p, (int)n8, (Object)arrobject2, (int)(n8 + 1), (int)(this.q - n8));
                this.p = arrobject2;
            }
            this.p[n8] = object;
            ++this.q;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.d(n8));
    }

    @Override
    public final boolean add(Object object) {
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

    public final String d(int n8) {
        int n9 = this.q;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    @Override
    public final /* synthetic */ h4 e(int n8) {
        if (n8 >= this.q) {
            return new Y4(Arrays.copyOf((Object[])this.p, (int)n8), this.q, true);
        }
        throw new IllegalArgumentException();
    }

    public final void f(int n8) {
        if (n8 >= 0 && n8 < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.d(n8));
    }

    public final Object get(int n8) {
        this.f(n8);
        return this.p[n8];
    }

    @Override
    public final Object remove(int n8) {
        this.a();
        this.f(n8);
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

    public final Object set(int n8, Object object) {
        this.a();
        this.f(n8);
        Object[] arrobject = this.p;
        Object object2 = arrobject[n8];
        arrobject[n8] = object;
        ++this.modCount;
        return object2;
    }

    public final int size() {
        return this.q;
    }
}

