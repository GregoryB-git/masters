/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 */
package A0;

import A0.c;
import A0.y;
import A0.z;
import B0.e;
import X2.B;
import X2.D;
import X2.J;
import X2.v;
import d0.I;
import d0.J;
import d0.q;
import g0.M;
import g0.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import x0.x;
import y0.m;
import y0.n;

public class a
extends c {
    public final e h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final v p;
    public final g0.c q;
    public float r;
    public int s;
    public int t;
    public long u;
    public m v;
    public long w;

    public a(J j8, int[] arrn, int n8, e e8, long l8, long l9, long l10, int n9, int n10, float f8, float f9, List list, g0.c c8) {
        super(j8, arrn, n8);
        if (l10 < l8) {
            o.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            l10 = l8;
        }
        this.h = e8;
        this.i = l8 * 1000L;
        this.j = l9 * 1000L;
        this.k = l10 * 1000L;
        this.l = n9;
        this.m = n10;
        this.n = f8;
        this.o = f9;
        this.p = v.U((Collection)list);
        this.q = c8;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
        this.w = -2147483647L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static v B(y.a[] object) {
        Object object2;
        int n8;
        Object object3;
        ArrayList arrayList = new ArrayList();
        int n9 = 0;
        for (n8 = 0; n8 < object.length; ++n8) {
            object2 = object[n8];
            if (object2 != null && object2.b.length > 1) {
                object2 = v.M();
                object2.h(new a(0L, 0L));
            } else {
                object2 = null;
            }
            arrayList.add(object2);
        }
        object2 = a.G((y.a[])object);
        int[] arrn = new int[object2.length];
        long[] arrl = new long[object2.length];
        for (n8 = 0; n8 < object2.length; ++n8) {
            object3 = object2[n8];
            Object object4 = object3.length == 0 ? 0L : (Object)object3[0];
            arrl[n8] = object4;
        }
        a.y((List)arrayList, arrl);
        object3 = a.H((long[][])object2);
        for (n8 = 0; n8 < object3.size(); ++n8) {
            int n10;
            int n11 = (Integer)object3.get(n8);
            arrn[n11] = n10 = arrn[n11] + 1;
            arrl[n11] = object2[n11][n10];
            a.y((List)arrayList, arrl);
        }
        for (n8 = 0; n8 < object.length; ++n8) {
            if (arrayList.get(n8) == null) continue;
            arrl[n8] = arrl[n8] * 2L;
        }
        a.y((List)arrayList, arrl);
        object2 = v.M();
        n8 = n9;
        while (n8 < arrayList.size()) {
            object = (v.a)arrayList.get(n8);
            object = object == null ? v.Y() : object.k();
            object2.h(object);
            ++n8;
        }
        return object2.k();
    }

    public static long[][] G(y.a[] arra) {
        long[][] arrarrl = new long[arra.length][];
        for (int i8 = 0; i8 < arra.length; ++i8) {
            int[] arrn;
            y.a a8 = arra[i8];
            if (a8 == null) {
                arrarrl[i8] = new long[0];
                continue;
            }
            arrarrl[i8] = new long[a8.b.length];
            for (int i9 = 0; i9 < (arrn = a8.b).length; ++i9) {
                long l8 = a8.a.a((int)arrn[i9]).i;
                arrn = arrarrl[i8];
                long l9 = l8;
                if (l8 == -1L) {
                    l9 = 0L;
                }
                arrn[i9] = (int)l9;
            }
            Arrays.sort((long[])arrarrl[i8]);
        }
        return arrarrl;
    }

    public static v H(long[][] arrl) {
        D d8 = X2.J.a().a().c();
        for (int i8 = 0; i8 < arrl.length; ++i8) {
            double d9;
            long[] arrl2 = arrl[i8];
            if (arrl2.length <= 1) continue;
            int n8 = arrl2.length;
            arrl2 = new double[n8];
            int n9 = 0;
            do {
                long[] arrl3 = arrl[i8];
                int n10 = arrl3.length;
                d9 = 0.0;
                if (n9 >= n10) break;
                long l8 = arrl3[n9];
                if (l8 != -1L) {
                    d9 = Math.log((double)l8);
                }
                arrl2[n9] = (long)d9;
                ++n9;
            } while (true);
            long l9 = arrl2[--n8] - arrl2[0];
            n9 = 0;
            while (n9 < n8) {
                d9 = arrl2[n9];
                long l10 = arrl2[++n9];
                d9 = l9 == 0.0 ? 1.0 : ((d9 + l10) * 0.5 - arrl2[0]) / l9;
                d8.put(d9, i8);
            }
        }
        return v.U(d8.values());
    }

    public static void y(List list, long[] arrl) {
        long l8 = 0L;
        int n8 = 0;
        int n9 = 0;
        do {
            if (n9 >= arrl.length) break;
            l8 += arrl[n9];
            ++n9;
        } while (true);
        for (int i8 = n8; i8 < list.size(); ++i8) {
            v.a a8 = (v.a)list.get(i8);
            if (a8 == null) continue;
            a8.h(new a(l8, arrl[i8]));
        }
    }

    public final int A(long l8, long l9) {
        l9 = this.C(l9);
        int n8 = 0;
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (l8 != Long.MIN_VALUE && this.i(i8, l8)) continue;
            q q8 = this.b(i8);
            if (this.z(q8, q8.i, l9)) {
                return i8;
            }
            n8 = i8;
        }
        return n8;
    }

    public final long C(long l8) {
        int n8;
        l8 = this.I(l8);
        if (this.p.isEmpty()) {
            return l8;
        }
        for (n8 = 1; n8 < this.p.size() - 1 && ((a)this.p.get((int)n8)).a < l8; ++n8) {
        }
        a a8 = (a)this.p.get(n8 - 1);
        a a9 = (a)this.p.get(n8);
        long l9 = a8.a;
        float f8 = (float)(l8 - l9) / (float)(a9.a - l9);
        l8 = a8.b;
        return l8 + (long)(f8 * (float)(a9.b - l8));
    }

    public final long D(List object) {
        boolean bl = object.isEmpty();
        long l8 = -9223372036854775807L;
        if (bl) {
            return -9223372036854775807L;
        }
        object = (m)B.d((Iterable)object);
        long l9 = object.g;
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            long l11 = object.h;
            l10 = l8;
            if (l11 != -9223372036854775807L) {
                l10 = l11 - l9;
            }
        }
        return l10;
    }

    public long E() {
        return this.k;
    }

    public final long F(n[] object, List list) {
        int n8 = this.s;
        if (n8 < object.length && object[n8].next()) {
            object = object[this.s];
            return object.a() - object.b();
        }
        for (n n9 : object) {
            if (!n9.next()) continue;
            return n9.a() - n9.b();
        }
        return this.D(list);
    }

    public final long I(long l8) {
        long l9;
        this.w = l9 = this.h.d();
        l9 = (long)((float)l9 * this.n);
        long l10 = this.h.b();
        if (l10 != -9223372036854775807L && l8 != -9223372036854775807L) {
            float f8 = l8;
            float f9 = Math.max((float)(f8 / this.r - (float)l10), (float)0.0f);
            return (long)((float)l9 * f9 / f8);
        }
        return (long)((float)l9 / this.r);
    }

    public final long J(long l8, long l9) {
        if (l8 == -9223372036854775807L) {
            return this.i;
        }
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            l10 = l8 - l9;
        }
        return Math.min((long)((long)((float)l10 * this.o)), (long)this.i);
    }

    public boolean K(long l8, List list) {
        long l9 = this.u;
        if (l9 != -9223372036854775807L && l8 - l9 < 1000L && (list.isEmpty() || ((m)B.d((Iterable)list)).equals((Object)this.v))) {
            return false;
        }
        return true;
    }

    @Override
    public void g() {
        this.v = null;
    }

    @Override
    public void j() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override
    public int k(long l8, List list) {
        long l9;
        long l10 = this.q.b();
        if (!this.K(l10, list)) {
            return list.size();
        }
        this.u = l10;
        Object object = list.isEmpty() ? null : (m)B.d((Iterable)list);
        this.v = object;
        boolean bl = list.isEmpty();
        if (bl) {
            return 0;
        }
        int n8 = list.size();
        long l11 = M.h0(((m)list.get((int)(n8 - 1))).g - l8, this.r);
        if (l11 < (l9 = this.E())) {
            return n8;
        }
        object = this.b(this.A(l10, this.D(list)));
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9;
            int n10;
            m m8 = (m)list.get(i8);
            q q8 = m8.d;
            if (M.h0(m8.g - l8, this.r) < l9 || q8.i >= object.i || (n9 = q8.u) == -1 || n9 > this.m || (n10 = q8.t) == -1 || n10 > this.l || n9 >= object.u) continue;
            return i8;
        }
        return n8;
    }

    @Override
    public int n() {
        return this.t;
    }

    @Override
    public int o() {
        return this.s;
    }

    @Override
    public void r(float f8) {
        this.r = f8;
    }

    @Override
    public Object s() {
        return null;
    }

    @Override
    public void v(long l8, long l9, long l10, List object, n[] object2) {
        int n8;
        int n9;
        int n10;
        block6 : {
            block7 : {
                int n11;
                l8 = this.q.b();
                long l11 = this.F((n[])object2, (List)object);
                n9 = this.t;
                if (n9 == 0) {
                    this.t = 1;
                    this.s = this.A(l8, l11);
                    return;
                }
                n8 = this.s;
                n10 = object.isEmpty() ? -1 : this.a(((m)B.d((Iterable)object)).d);
                if (n10 != -1) {
                    n9 = ((m)B.d((Iterable)object)).e;
                    n8 = n10;
                }
                n10 = n11 = this.A(l8, l11);
                if (n11 == n8) break block6;
                n10 = n11;
                if (this.i(n8, l8)) break block6;
                object = this.b(n8);
                object2 = this.b(n11);
                l8 = this.J(l10, l11);
                int n12 = object2.i;
                int n13 = object.i;
                if (n12 > n13 && l9 < l8) break block7;
                n10 = n11;
                if (n12 >= n13) break block6;
                n10 = n11;
                if (l9 < this.j) break block6;
            }
            n10 = n8;
        }
        if (n10 != n8) {
            n9 = 3;
        }
        this.t = n9;
        this.s = n10;
    }

    public boolean z(q q8, int n8, long l8) {
        if ((long)n8 <= l8) {
            return true;
        }
        return false;
    }

    public static final class a {
        public final long a;
        public final long b;

        public a(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (this.a == object.a && this.b == object.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }

    public static class b
    implements y.b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final float f;
        public final float g;
        public final g0.c h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int n8, int n9, int n10, float f8) {
            this(n8, n9, n10, 1279, 719, f8, 0.75f, g0.c.a);
        }

        public b(int n8, int n9, int n10, int n11, int n12, float f8, float f9, g0.c c8) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = f8;
            this.g = f9;
            this.h = c8;
        }

        @Override
        public final y[] a(y.a[] arra, e e8, x.b object, I object2) {
            object2 = a.B(arra);
            y[] arry = new y[arra.length];
            for (int i8 = 0; i8 < arra.length; ++i8) {
                int[] arrn;
                object = arra[i8];
                if (object == null || (arrn = object.b).length == 0) continue;
                object = arrn.length == 1 ? new z(object.a, arrn[0], object.c) : this.b(object.a, arrn, object.c, e8, (v)((Object)object2.get(i8)));
                arry[i8] = object;
            }
            return arry;
        }

        public a b(J j8, int[] arrn, int n8, e e8, v v8) {
            return new a(j8, arrn, n8, e8, this.a, this.b, this.c, this.d, this.e, this.f, this.g, v8, this.h);
        }
    }

}

