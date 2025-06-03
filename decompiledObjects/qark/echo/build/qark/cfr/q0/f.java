/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package q0;

import B0.g;
import X2.B;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import d0.J;
import d0.q;
import g0.G;
import g0.M;
import i0.k;
import i0.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k0.d1;
import k0.y0;
import l0.y1;
import q0.g;
import q0.h;
import q0.j;
import q0.v;
import r0.f;
import y0.k;
import y0.m;
import y0.n;

public class f {
    public final h a;
    public final i0.g b;
    public final i0.g c;
    public final v d;
    public final Uri[] e;
    public final q[] f;
    public final r0.k g;
    public final J h;
    public final List i;
    public final q0.e j;
    public final y1 k;
    public final long l;
    public boolean m;
    public byte[] n;
    public IOException o;
    public Uri p;
    public boolean q;
    public A0.y r;
    public long s;
    public boolean t;
    public long u;

    public f(h object, r0.k k8, Uri[] arruri, q[] arrq, g g8, y y8, v v8, long l8, List list, y1 y12, B0.f f8) {
        this.a = object;
        this.g = k8;
        this.e = arruri;
        this.f = arrq;
        this.d = v8;
        this.l = l8;
        this.i = list;
        this.k = y12;
        this.u = -9223372036854775807L;
        this.j = new q0.e(4);
        this.n = M.f;
        this.s = -9223372036854775807L;
        this.b = object = g8.a(1);
        if (y8 != null) {
            object.c(y8);
        }
        this.c = g8.a(3);
        this.h = new J(arrq);
        object = new ArrayList();
        for (int i8 = 0; i8 < arruri.length; ++i8) {
            if ((arrq[i8].f & 16384) != 0) continue;
            object.add((Object)i8);
        }
        this.r = new d(this.h, a3.f.n((Collection)object));
    }

    public static Uri e(r0.f f8, f.e object) {
        if (object != null && (object = object.u) != null) {
            return G.f(f8.a, (String)object);
        }
        return null;
    }

    public static e h(r0.f f8, long l8, int n8) {
        int n9 = (int)(l8 - f8.k);
        int n10 = f8.r.size();
        Object object = null;
        if (n9 == n10) {
            if (n8 == -1) {
                n8 = 0;
            }
            if (n8 < f8.s.size()) {
                object = new e((f.e)f8.s.get(n8), l8, n8);
            }
            return object;
        }
        object = (f.d)f8.r.get(n9);
        if (n8 == -1) {
            return new e((f.e)object, l8, -1);
        }
        if (n8 < object.A.size()) {
            return new e((f.e)object.A.get(n8), l8, n8);
        }
        n8 = n9 + 1;
        if (n8 < f8.r.size()) {
            return new e((f.e)f8.r.get(n8), l8 + 1L, -1);
        }
        if (!f8.s.isEmpty()) {
            return new e((f.e)f8.s.get(0), l8 + 1L, 0);
        }
        return null;
    }

    public static List j(r0.f f8, long l8, int n8) {
        int n9 = (int)(l8 - f8.k);
        if (n9 >= 0 && f8.r.size() >= n9) {
            ArrayList arrayList = new ArrayList();
            int n10 = f8.r.size();
            int n11 = 0;
            int n12 = n8;
            if (n9 < n10) {
                Object object;
                n12 = n9;
                if (n8 != -1) {
                    object = (f.d)f8.r.get(n9);
                    if (n8 == 0) {
                        arrayList.add(object);
                    } else if (n8 < object.A.size()) {
                        object = object.A;
                        arrayList.addAll((Collection)object.subList(n8, object.size()));
                    }
                    n12 = n9 + 1;
                }
                object = f8.r;
                arrayList.addAll((Collection)object.subList(n12, object.size()));
                n12 = 0;
            }
            if (f8.n != -9223372036854775807L) {
                if (n12 == -1) {
                    n12 = n11;
                }
                if (n12 < f8.s.size()) {
                    f8 = f8.s;
                    arrayList.addAll((Collection)f8.subList(n12, f8.size()));
                }
            }
            return Collections.unmodifiableList((List)arrayList);
        }
        return X2.v.Y();
    }

    public n[] a(j j8, long l8) {
        int n8 = j8 == null ? -1 : this.h.b(j8.d);
        int n9 = this.r.length();
        n[] arrn = new n[n9];
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10 = this.r.c(i8);
            Object object = this.e[n10];
            if (!this.g.d((Uri)object)) {
                arrn[i8] = n.a;
                continue;
            }
            object = this.g.k((Uri)object, false);
            g0.a.e(object);
            long l9 = object.h - this.g.m();
            boolean bl = n10 != n8;
            Pair pair = this.g(j8, bl, (r0.f)object, l9, l8);
            long l10 = (Long)pair.first;
            n10 = (Integer)pair.second;
            arrn[i8] = new c(object.a, l9, f.j((r0.f)object, l10, n10));
        }
        return arrn;
    }

    public final void b() {
        int n8 = this.r.l();
        this.g.g(this.e[n8]);
    }

    public long c(long l8, d1 d12) {
        Object object;
        int n8 = this.r.o();
        object = n8 < (object = this.e).length && n8 != -1 ? this.g.k(object[this.r.l()], true) : null;
        long l9 = l8;
        if (object != null) {
            l9 = l8;
            if (!object.r.isEmpty()) {
                if (!object.c) {
                    return l8;
                }
                long l10 = object.h - this.g.m();
                long l11 = l8 - l10;
                n8 = M.f(object.r, (Comparable)Long.valueOf((long)l11), true, true);
                l9 = ((f.d)object.r.get((int)n8)).s;
                l8 = n8 != object.r.size() - 1 ? ((f.d)object.r.get((int)(n8 + 1))).s : l9;
                l9 = d12.a(l11, l9, l8) + l10;
            }
        }
        return l9;
    }

    public int d(j j8) {
        if (j8.o == -1) {
            return 1;
        }
        Object object = this.e[this.h.b(j8.d)];
        r0.f f8 = (r0.f)g0.a.e(this.g.k((Uri)object, false));
        int n8 = (int)(j8.j - f8.k);
        if (n8 < 0) {
            return 1;
        }
        object = n8 < f8.r.size() ? ((f.d)f8.r.get((int)n8)).A : f8.s;
        if (j8.o >= object.size()) {
            return 2;
        }
        object = (f.b)object.get(j8.o);
        if (object.A) {
            return 0;
        }
        if (M.c((Object)Uri.parse((String)G.e(f8.a, object.o)), (Object)j8.b.a)) {
            return 1;
        }
        return 2;
    }

    public void f(y0 object, long l8, List list, boolean bl, b b8) {
        y0.e e8;
        y0.e e9;
        j j8 = list.isEmpty() ? null : (j)B.d((Iterable)list);
        int n8 = j8 == null ? -1 : this.h.b(j8.d);
        long l9 = object.a;
        long l10 = l8 - l9;
        long l11 = this.u(l9);
        long l12 = l10;
        long l13 = l11;
        if (j8 != null) {
            l12 = l10;
            l13 = l11;
            if (!this.q) {
                long l14 = j8.d();
                l12 = l10 = Math.max((long)0L, (long)(l10 - l14));
                l13 = l11;
                if (l11 != -9223372036854775807L) {
                    l13 = Math.max((long)0L, (long)(l11 - l14));
                    l12 = l10;
                }
            }
        }
        object = this.a(j8, l8);
        this.r.v(l9, l12, l13, list, (n[])object);
        int n9 = this.r.l();
        boolean bl2 = n8 != n9;
        list = this.e[n9];
        if (!this.g.d((Uri)list)) {
            b8.c = list;
            this.t &= list.equals((Object)this.p);
            this.p = list;
            return;
        }
        object = this.g.k((Uri)list, true);
        g0.a.e(object);
        this.q = object.c;
        this.y((r0.f)object);
        l12 = object.h - this.g.m();
        Object object2 = this.g(j8, bl2, (r0.f)object, l12, l8);
        l13 = (Long)object2.first;
        int n10 = (Integer)object2.second;
        if (l13 < object.k && j8 != null && bl2) {
            list = this.e[n8];
            object = this.g.k((Uri)list, true);
            g0.a.e(object);
            l12 = object.h - this.g.m();
            object2 = this.g(j8, false, (r0.f)object, l12, l8);
            l8 = (Long)object2.first;
            n10 = (Integer)object2.second;
            n9 = n8;
        } else {
            l8 = l13;
        }
        if (n9 != n8 && n8 != -1) {
            object2 = this.e[n8];
            this.g.g((Uri)object2);
        }
        if (l8 < object.k) {
            this.o = new x0.b();
            return;
        }
        e e10 = f.h((r0.f)object, l8, n10);
        object2 = e10;
        if (e10 == null) {
            if (!object.o) {
                b8.c = list;
                this.t &= list.equals((Object)this.p);
                this.p = list;
                return;
            }
            if (!bl && !object.r.isEmpty()) {
                object2 = new e((f.e)B.d((Iterable)object.r), object.k + (long)object.r.size() - 1L, -1);
            } else {
                b8.b = true;
                return;
            }
        }
        this.t = false;
        this.p = null;
        this.u = SystemClock.elapsedRealtime();
        e10 = f.e((r0.f)object, object2.a.p);
        b8.a = e8 = this.n((Uri)e10, n9, true, null);
        if (e8 != null) {
            return;
        }
        e8 = f.e((r0.f)object, object2.a);
        b8.a = e9 = this.n((Uri)e8, n9, false, null);
        if (e9 != null) {
            return;
        }
        bl = j.w(j8, (Uri)list, (r0.f)object, (e)object2, l12);
        if (bl && object2.d) {
            return;
        }
        b8.a = j.j(this.a, this.b, this.f[n9], l12, (r0.f)object, (e)object2, (Uri)list, this.i, this.r.n(), this.r.s(), this.m, this.d, this.l, j8, this.j.a((Uri)e8), this.j.a((Uri)e10), bl, this.k, null);
    }

    public final Pair g(j object, boolean bl, r0.f f8, long l8, long l9) {
        int n8 = -1;
        if (object != null && !bl) {
            if (object.h()) {
                l8 = object.o == -1 ? object.g() : object.j;
                int n9 = object.o;
                if (n9 != -1) {
                    n8 = n9 + 1;
                }
                return new Pair((Object)l8, (Object)n8);
            }
            return new Pair((Object)object.j, (Object)object.o);
        }
        long l10 = f8.u;
        long l11 = l9;
        if (object != null) {
            l11 = this.q ? l9 : object.g;
        }
        if (!f8.o && l11 >= l10 + l8) {
            return new Pair((Object)(f8.k + (long)f8.r.size()), (Object)-1);
        }
        Object object2 = f8.r;
        bl = this.g.a();
        int n10 = 0;
        bl = !bl || object == null;
        int n11 = M.f((List)object2, (Comparable)Long.valueOf((long)(l11 -= l8)), true, bl);
        l9 = (long)n11 + f8.k;
        int n12 = n8;
        l8 = l9;
        if (n11 >= 0) {
            object = (f.d)f8.r.get(n11);
            object = l11 < object.s + object.q ? object.A : f8.s;
            do {
                n12 = n8;
                l8 = l9;
                if (n10 >= object.size()) break;
                object2 = (f.b)object.get(n10);
                if (l11 < object2.s + object2.q) {
                    n12 = n8;
                    l8 = l9;
                    if (!object2.z) break;
                    l8 = object == f8.s ? 1L : 0L;
                    l8 = l9 + l8;
                    n12 = n10;
                    break;
                }
                ++n10;
            } while (true);
        }
        return new Pair((Object)l8, (Object)n12);
    }

    public int i(long l8, List list) {
        if (this.o == null && this.r.length() >= 2) {
            return this.r.k(l8, list);
        }
        return list.size();
    }

    public J k() {
        return this.h;
    }

    public A0.y l() {
        return this.r;
    }

    public boolean m() {
        return this.q;
    }

    public final y0.e n(Uri object, int n8, boolean bl, g.a arrby) {
        if (object == null) {
            return null;
        }
        arrby = this.j.c((Uri)object);
        if (arrby != null) {
            this.j.b((Uri)object, arrby);
            return null;
        }
        object = new k.b().i((Uri)object).b(1).a();
        return new a(this.c, (i0.k)object, this.f[n8], this.r.n(), this.r.s(), this.n);
    }

    public boolean o(y0.e e8, long l8) {
        A0.y y8 = this.r;
        return y8.p(y8.e(this.h.b(e8.d)), l8);
    }

    public void p() {
        IOException iOException = this.o;
        if (iOException == null) {
            iOException = this.p;
            if (iOException != null && this.t) {
                this.g.h((Uri)iOException);
            }
            return;
        }
        throw iOException;
    }

    public boolean q(Uri uri) {
        return M.s((Object[])this.e, (Object)uri);
    }

    public void r(y0.e e8) {
        if (e8 instanceof a) {
            e8 = (a)e8;
            this.n = e8.h();
            this.j.b(e8.b.a, (byte[])g0.a.e(e8.j()));
        }
    }

    public boolean s(Uri uri, long l8) {
        boolean bl;
        block10 : {
            block9 : {
                int n8;
                boolean bl2;
                block8 : {
                    Uri[] arruri;
                    bl2 = false;
                    for (n8 = 0; n8 < (arruri = this.e).length; ++n8) {
                        if (!arruri[n8].equals((Object)uri)) {
                            continue;
                        }
                        break block8;
                    }
                    n8 = -1;
                }
                if (n8 == -1) {
                    return true;
                }
                if ((n8 = this.r.e(n8)) == -1) {
                    return true;
                }
                this.t |= uri.equals((Object)this.p);
                if (l8 == -9223372036854775807L) break block9;
                bl = bl2;
                if (!this.r.p(n8, l8)) break block10;
                bl = bl2;
                if (!this.g.c(uri, l8)) break block10;
            }
            bl = true;
        }
        return bl;
    }

    public void t() {
        this.b();
        this.o = null;
    }

    public final long u(long l8) {
        long l9 = this.s;
        long l10 = -9223372036854775807L;
        if (l9 != -9223372036854775807L) {
            l10 = l9 - l8;
        }
        return l10;
    }

    public void v(boolean bl) {
        this.m = bl;
    }

    public void w(A0.y y8) {
        this.b();
        this.r = y8;
    }

    public boolean x(long l8, y0.e e8, List list) {
        if (this.o != null) {
            return false;
        }
        return this.r.q(l8, e8, list);
    }

    public final void y(r0.f f8) {
        long l8 = f8.o ? -9223372036854775807L : f8.e() - this.g.m();
        this.s = l8;
    }

    public static final class a
    extends k {
        public byte[] l;

        public a(i0.g g8, i0.k k8, q q8, int n8, Object object, byte[] arrby) {
            super(g8, k8, 3, q8, n8, object, arrby);
        }

        @Override
        public void g(byte[] arrby, int n8) {
            this.l = Arrays.copyOf((byte[])arrby, (int)n8);
        }

        public byte[] j() {
            return this.l;
        }
    }

    public static final class b {
        public y0.e a;
        public boolean b;
        public Uri c;

        public b() {
            this.a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    public static final class c
    extends y0.b {
        public final List e;
        public final long f;
        public final String g;

        public c(String string2, long l8, List list) {
            super(0L, list.size() - 1);
            this.g = string2;
            this.f = l8;
            this.e = list;
        }

        @Override
        public long a() {
            this.c();
            f.e e8 = (f.e)this.e.get((int)this.d());
            return this.f + e8.s + e8.q;
        }

        @Override
        public long b() {
            this.c();
            return this.f + ((f.e)this.e.get((int)((int)this.d()))).s;
        }
    }

    public static final class d
    extends A0.c {
        public int h;

        public d(J j8, int[] arrn) {
            super(j8, arrn);
            this.h = this.a(j8.a(arrn[0]));
        }

        @Override
        public int n() {
            return 0;
        }

        @Override
        public int o() {
            return this.h;
        }

        @Override
        public Object s() {
            return null;
        }

        @Override
        public void v(long l8, long l9, long l10, List list, n[] arrn) {
            l8 = SystemClock.elapsedRealtime();
            if (!this.i(this.h, l8)) {
                return;
            }
            for (int i8 = this.b - 1; i8 >= 0; --i8) {
                if (this.i(i8, l8)) continue;
                this.h = i8;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e {
        public final f.e a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(f.e e8, long l8, int n8) {
            this.a = e8;
            this.b = l8;
            this.c = n8;
            boolean bl = e8 instanceof f.b && ((f.b)e8).A;
            this.d = bl;
        }
    }

}

