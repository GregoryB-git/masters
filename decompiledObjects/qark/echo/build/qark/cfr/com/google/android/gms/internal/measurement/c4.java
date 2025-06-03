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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.S4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.l3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class c4
extends l3
implements f4,
S4,
RandomAccess {
    public static final c4 r = new c4(new int[0], 0, false);
    public int[] p;
    public int q;

    public c4(int[] arrn, int n8, boolean bl) {
        super(bl);
        this.p = arrn;
        this.q = n8;
    }

    public static c4 f() {
        return r;
    }

    public final /* synthetic */ void add(int n8, Object arrn) {
        int n9;
        int n10 = (Integer)arrn;
        this.a();
        if (n8 >= 0 && n8 <= (n9 = this.q)) {
            arrn = this.p;
            if (n9 < arrn.length) {
                System.arraycopy((Object)arrn, (int)n8, (Object)arrn, (int)(n8 + 1), (int)(n9 - n8));
            } else {
                int[] arrn2 = new int[n9 * 3 / 2 + 1];
                System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n8);
                System.arraycopy((Object)this.p, (int)n8, (Object)arrn2, (int)(n8 + 1), (int)(this.q - n8));
                this.p = arrn2;
            }
            this.p[n8] = n10;
            ++this.q;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.g((Integer)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection object) {
        this.a();
        a4.e(object);
        if (!(object instanceof c4)) {
            return super.addAll((Collection)object);
        }
        object = (c4)object;
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

    public final boolean contains(Object object) {
        if (this.indexOf(object) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int n8) {
        this.k(n8);
        return this.p[n8];
    }

    @Override
    public final /* synthetic */ h4 e(int n8) {
        return this.r(n8);
    }

    @Override
    public final boolean equals(Object arrn) {
        if (this == arrn) {
            return true;
        }
        if (!(arrn instanceof c4)) {
            return super.equals(arrn);
        }
        arrn = (c4)arrn;
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

    public final void g(int n8) {
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

    public final /* synthetic */ Object get(int n8) {
        return this.d(n8);
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.q; ++i8) {
            n8 = n8 * 31 + this.p[i8];
        }
        return n8;
    }

    public final String i(int n8) {
        int n9 = this.q;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    public final int indexOf(Object object) {
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
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final f4 r(int n8) {
        if (n8 >= this.q) {
            return new c4(Arrays.copyOf((int[])this.p, (int)n8), this.q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
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

    public final void removeRange(int n8, int n9) {
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

    public final /* synthetic */ Object set(int n8, Object arrn) {
        int n9 = (Integer)arrn;
        this.a();
        this.k(n8);
        arrn = this.p;
        int n10 = arrn[n8];
        arrn[n8] = n9;
        return n10;
    }

    public final int size() {
        return this.q;
    }
}

