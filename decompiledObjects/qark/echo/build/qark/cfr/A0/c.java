/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.List
 */
package A0;

import A0.b;
import A0.x;
import A0.y;
import android.os.SystemClock;
import d0.J;
import d0.q;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import y0.e;

public abstract class c
implements y {
    public final J a;
    public final int b;
    public final int[] c;
    public final int d;
    public final q[] e;
    public final long[] f;
    public int g;

    public /* varargs */ c(J j8, int ... arrn) {
        this(j8, arrn, 0);
    }

    public c(J j8, int[] arrn, int n8) {
        int n9 = arrn.length;
        int n10 = 0;
        boolean bl = n9 > 0;
        a.f(bl);
        this.d = n8;
        this.a = (J)a.e(j8);
        this.b = n8 = arrn.length;
        this.e = new q[n8];
        for (n8 = 0; n8 < arrn.length; ++n8) {
            this.e[n8] = j8.a(arrn[n8]);
        }
        Arrays.sort((Object[])this.e, (Comparator)new b());
        this.c = new int[this.b];
        n8 = n10;
        while (n8 < (n10 = this.b)) {
            this.c[n8] = j8.b(this.e[n8]);
            ++n8;
        }
        this.f = new long[n10];
    }

    public static /* synthetic */ int f(q q8, q q9) {
        return c.w(q8, q9);
    }

    public static /* synthetic */ int w(q q8, q q9) {
        return q9.i - q8.i;
    }

    @Override
    public final int a(q q8) {
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (this.e[i8] != q8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final q b(int n8) {
        return this.e[n8];
    }

    @Override
    public final int c(int n8) {
        return this.c[n8];
    }

    @Override
    public final J d() {
        return this.a;
    }

    @Override
    public final int e(int n8) {
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (this.c[i8] != n8) continue;
            return i8;
        }
        return -1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (c)object;
            if (this.a.equals(object.a) && Arrays.equals((int[])this.c, (int[])object.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void g() {
    }

    @Override
    public /* synthetic */ void h(boolean bl) {
        x.b(this, bl);
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = System.identityHashCode((Object)this.a) * 31 + Arrays.hashCode((int[])this.c);
        }
        return this.g;
    }

    @Override
    public boolean i(int n8, long l8) {
        if (this.f[n8] > l8) {
            return true;
        }
        return false;
    }

    @Override
    public void j() {
    }

    @Override
    public int k(long l8, List list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.c[this.o()];
    }

    @Override
    public final int length() {
        return this.c.length;
    }

    @Override
    public final q m() {
        return this.e[this.o()];
    }

    @Override
    public boolean p(int n8, long l8) {
        long l9 = SystemClock.elapsedRealtime();
        boolean bl = this.i(n8, l9);
        for (int i8 = 0; i8 < this.b && !bl; ++i8) {
            bl = i8 != n8 && !this.i(i8, l9);
        }
        if (!bl) {
            return false;
        }
        long[] arrl = this.f;
        arrl[n8] = Math.max((long)arrl[n8], (long)M.b(l9, l8, Long.MAX_VALUE));
        return true;
    }

    @Override
    public /* synthetic */ boolean q(long l8, e e8, List list) {
        return x.d(this, l8, e8, list);
    }

    @Override
    public void r(float f8) {
    }

    @Override
    public /* synthetic */ void t() {
        x.a(this);
    }

    @Override
    public /* synthetic */ void u() {
        x.c(this);
    }
}

