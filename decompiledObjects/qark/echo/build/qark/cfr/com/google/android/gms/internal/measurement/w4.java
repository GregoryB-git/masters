/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Long
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
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.l3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w4
extends l3
implements i4,
S4,
RandomAccess {
    public static final w4 r = new w4(new long[0], 0, false);
    public long[] p;
    public int q;

    public w4(long[] arrl, int n8, boolean bl) {
        super(bl);
        this.p = arrl;
        this.q = n8;
    }

    public static w4 f() {
        return r;
    }

    public final /* synthetic */ void add(int n8, Object arrl) {
        int n9;
        long l8 = (Long)arrl;
        this.a();
        if (n8 >= 0 && n8 <= (n9 = this.q)) {
            arrl = this.p;
            if (n9 < arrl.length) {
                System.arraycopy((Object)arrl, (int)n8, (Object)arrl, (int)(n8 + 1), (int)(n9 - n8));
            } else {
                long[] arrl2 = new long[n9 * 3 / 2 + 1];
                System.arraycopy((Object)arrl, (int)0, (Object)arrl2, (int)0, (int)n8);
                System.arraycopy((Object)this.p, (int)n8, (Object)arrl2, (int)(n8 + 1), (int)(this.q - n8));
                this.p = arrl2;
            }
            this.p[n8] = l8;
            ++this.q;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.d((Long)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection object) {
        this.a();
        a4.e(object);
        if (!(object instanceof w4)) {
            return super.addAll((Collection)object);
        }
        object = (w4)object;
        int n8 = object.q;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.q;
        if (Integer.MAX_VALUE - n9 >= n8) {
            long[] arrl = this.p;
            if ((n8 = n9 + n8) > arrl.length) {
                this.p = Arrays.copyOf((long[])arrl, (int)n8);
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

    public final void d(long l8) {
        this.a();
        int n8 = this.q;
        long[] arrl = this.p;
        if (n8 == arrl.length) {
            long[] arrl2 = new long[n8 * 3 / 2 + 1];
            System.arraycopy((Object)arrl, (int)0, (Object)arrl2, (int)0, (int)n8);
            this.p = arrl2;
        }
        arrl = this.p;
        n8 = this.q;
        this.q = n8 + 1;
        arrl[n8] = l8;
    }

    @Override
    public final /* synthetic */ h4 e(int n8) {
        return this.r(n8);
    }

    @Override
    public final boolean equals(Object arrl) {
        if (this == arrl) {
            return true;
        }
        if (!(arrl instanceof w4)) {
            return super.equals(arrl);
        }
        arrl = (w4)arrl;
        if (this.q != arrl.q) {
            return false;
        }
        arrl = arrl.p;
        for (int i8 = 0; i8 < this.q; ++i8) {
            if (this.p[i8] == arrl[i8]) continue;
            return false;
        }
        return true;
    }

    public final String g(int n8) {
        int n9 = this.q;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object get(int n8) {
        return this.l(n8);
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.q; ++i8) {
            n8 = n8 * 31 + a4.b(this.p[i8]);
        }
        return n8;
    }

    public final void i(int n8) {
        if (n8 >= 0 && n8 < this.q) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n8));
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        long l8 = (Long)object;
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.p[i8] != l8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final long l(int n8) {
        this.i(n8);
        return this.p[n8];
    }

    @Override
    public final i4 r(int n8) {
        if (n8 >= this.q) {
            return new w4(Arrays.copyOf((long[])this.p, (int)n8), this.q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.a();
        this.i(n8);
        long[] arrl = this.p;
        long l8 = arrl[n8];
        int n9 = this.q;
        if (n8 < n9 - 1) {
            System.arraycopy((Object)arrl, (int)(n8 + 1), (Object)arrl, (int)n8, (int)(n9 - n8 - 1));
        }
        --this.q;
        ++this.modCount;
        return l8;
    }

    public final void removeRange(int n8, int n9) {
        this.a();
        if (n9 >= n8) {
            long[] arrl = this.p;
            System.arraycopy((Object)arrl, (int)n9, (Object)arrl, (int)n8, (int)(this.q - n9));
            this.q -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int n8, Object arrl) {
        long l8 = (Long)arrl;
        this.a();
        this.i(n8);
        arrl = this.p;
        long l9 = arrl[n8];
        arrl[n8] = l8;
        return l9;
    }

    public final int size() {
        return this.q;
    }
}

