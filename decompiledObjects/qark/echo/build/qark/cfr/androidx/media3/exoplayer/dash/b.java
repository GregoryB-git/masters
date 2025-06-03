/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.IdentityHashMap
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package androidx.media3.exoplayer.dash;

import B0.m;
import B0.o;
import X2.G;
import X2.v;
import a3.f;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import d0.J;
import d0.q;
import g0.M;
import i0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.d1;
import k0.y0;
import l0.y1;
import n0.j;
import o0.c;
import o0.e;
import o0.g;
import p0.v;
import p0.x;
import x0.E;
import x0.Q;
import x0.S;
import x0.Z;
import x0.v;
import y0.h;
import y0.i;

public final class b
implements x0.v,
S.a,
h.b {
    public static final Pattern M = Pattern.compile((String)"CC([1-4])=(.+)");
    public static final Pattern N = Pattern.compile((String)"([1-4])=lang:(\\w+)(,.+)?");
    public final d A;
    public final IdentityHashMap B;
    public final E.a C;
    public final v.a D;
    public final y1 E;
    public v.a F;
    public h[] G;
    public j[] H;
    public S I;
    public c J;
    public int K;
    public List L;
    public final int o;
    public final a.a p;
    public final y q;
    public final x r;
    public final m s;
    public final n0.b t;
    public final long u;
    public final o v;
    public final B0.b w;
    public final Z x;
    public final a[] y;
    public final x0.j z;

    public b(int n8, c object, n0.b b8, int n9, a.a a8, y y8, B0.f f8, x x8, v.a a9, m m8, E.a a10, long l8, o o8, B0.b b9, x0.j j8, d.b b10, y1 y12) {
        this.o = n8;
        this.J = object;
        this.t = b8;
        this.K = n9;
        this.p = a8;
        this.q = y8;
        this.r = x8;
        this.D = a9;
        this.s = m8;
        this.C = a10;
        this.u = l8;
        this.v = o8;
        this.w = b9;
        this.z = j8;
        this.E = y12;
        this.A = new d((c)object, b10, b9);
        this.G = b.I(0);
        this.H = new j[0];
        this.B = new IdentityHashMap();
        this.I = j8.a();
        object = object.d(n9);
        b8 = object.d;
        this.L = b8;
        object = b.w(x8, a8, object.c, (List)b8);
        this.x = (Z)object.first;
        this.y = (a[])object.second;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static q[] A(List object, int[] stringBuilder) {
        int n8 = stringBuilder.length;
        int n9 = 0;
        while (n9 < n8) {
            reference var3_4 = stringBuilder[n9];
            o0.a a8 = (o0.a)object.get((int)var3_4);
            List list = ((o0.a)object.get((int)var3_4)).d;
            for (var3_4 = (reference)false; var3_4 < list.size(); ++var3_4) {
                e e8 = (e)list.get((int)var3_4);
                if ("urn:scte:dash:cc:cea-608:2015".equals((Object)e8.a)) {
                    object = new q.b().o0("application/cea-608");
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(a8.a);
                    stringBuilder.append(":cea608");
                    object = object.a0(stringBuilder.toString()).K();
                    stringBuilder = M;
                    do {
                        return b.K(e8, (Pattern)stringBuilder, (q)object);
                        break;
                    } while (true);
                }
                if (!"urn:scte:dash:cc:cea-708:2015".equals((Object)e8.a)) continue;
                object = new q.b().o0("application/cea-708");
                stringBuilder = new StringBuilder();
                stringBuilder.append(a8.a);
                stringBuilder.append(":cea708");
                object = object.a0(stringBuilder.toString()).K();
                stringBuilder = N;
                return b.K(e8, (Pattern)stringBuilder, (q)object);
            }
            ++n9;
        }
        return new q[0];
    }

    public static int[][] B(List arrarrn) {
        String[] arrstring;
        int n8;
        int n9;
        int n10 = arrarrn.size();
        HashMap hashMap = G.f(n10);
        ArrayList arrayList = new ArrayList(n10);
        SparseArray sparseArray = new SparseArray(n10);
        int n11 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            hashMap.put((Object)((o0.a)arrarrn.get((int)n8)).a, (Object)n8);
            arrstring = new ArrayList();
            arrstring.add((Object)n8);
            arrayList.add((Object)arrstring);
            sparseArray.put(n8, (Object)arrstring);
        }
        for (n9 = 0; n9 < n10; ++n9) {
            o0.a a8 = (o0.a)arrarrn.get(n9);
            e e8 = b.z(a8.e);
            arrstring = e8;
            if (e8 == null) {
                arrstring = b.z(a8.f);
            }
            n8 = arrstring != null && (arrstring = (Integer)hashMap.get((Object)Long.parseLong((String)arrstring.b))) != null ? arrstring.intValue() : n9;
            int n12 = n8;
            if (n8 == n9) {
                arrstring = b.x(a8.f);
                n12 = n8;
                if (arrstring != null) {
                    arrstring = M.b1(arrstring.b, ",");
                    int n13 = arrstring.length;
                    int n14 = 0;
                    do {
                        n12 = n8;
                        if (n14 >= n13) break;
                        e8 = (Integer)hashMap.get((Object)Long.parseLong((String)arrstring[n14]));
                        n12 = n8;
                        if (e8 != null) {
                            n12 = Math.min((int)n8, (int)e8.intValue());
                        }
                        ++n14;
                        n8 = n12;
                    } while (true);
                }
            }
            if (n12 == n9) continue;
            arrstring = (List)sparseArray.get(n9);
            e8 = (List)sparseArray.get(n12);
            e8.addAll((Collection)arrstring);
            sparseArray.put(n9, (Object)e8);
            arrayList.remove((Object)arrstring);
        }
        n9 = arrayList.size();
        arrarrn = new int[n9][];
        for (n8 = n11; n8 < n9; ++n8) {
            arrstring = f.n((Collection)arrayList.get(n8));
            arrarrn[n8] = arrstring;
            Arrays.sort((int[])arrstring);
        }
        return arrarrn;
    }

    public static boolean E(List list, int[] arrn) {
        int n8 = arrn.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            List list2 = ((o0.a)list.get((int)arrn[i8])).c;
            for (int i9 = 0; i9 < list2.size(); ++i9) {
                if (((o0.j)list2.get((int)i9)).e.isEmpty()) continue;
                return true;
            }
        }
        return false;
    }

    public static int F(int n8, List list, int[][] arrn, boolean[] arrbl, q[][] arrq) {
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = n9;
            if (b.E(list, arrn[i8])) {
                arrbl[i8] = true;
                n10 = n9 + 1;
            }
            q[] arrq2 = b.A(list, arrn[i8]);
            arrq[i8] = arrq2;
            n9 = n10;
            if (arrq2.length == 0) continue;
            n9 = n10 + 1;
        }
        return n9;
    }

    public static /* synthetic */ List G(h h8) {
        return v.Z(h8.o);
    }

    public static void H(a.a a8, q[] arrq) {
        for (int i8 = 0; i8 < arrq.length; ++i8) {
            arrq[i8] = a8.b(arrq[i8]);
        }
    }

    public static h[] I(int n8) {
        return new h[n8];
    }

    public static q[] K(e object, Pattern pattern, q q8) {
        object = object.b;
        if (object == null) {
            return new q[]{q8};
        }
        object = M.b1((String)object, ";");
        q[] arrq = new q[object.length];
        for (int i8 = 0; i8 < object.length; ++i8) {
            Matcher matcher = pattern.matcher((CharSequence)object[i8]);
            if (!matcher.matches()) {
                return new q[]{q8};
            }
            int n8 = Integer.parseInt((String)matcher.group(1));
            q.b b8 = q8.a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(q8.a);
            stringBuilder.append(":");
            stringBuilder.append(n8);
            arrq[i8] = b8.a0(stringBuilder.toString()).L(n8).e0(matcher.group(2)).K();
        }
        return arrq;
    }

    public static /* synthetic */ List j(h h8) {
        return b.G(h8);
    }

    public static void r(List list, J[] arrj, a[] arra, int n8) {
        int n9 = 0;
        while (n9 < list.size()) {
            o0.f f8 = (o0.f)list.get(n9);
            q q8 = new q.b().a0(f8.a()).o0("application/x-emsg").K();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f8.a());
            stringBuilder.append(":");
            stringBuilder.append(n9);
            arrj[n8] = new J(stringBuilder.toString(), q8);
            arra[n8] = a.c(n9);
            ++n9;
            ++n8;
        }
    }

    public static int t(x x8, a.a a8, List list, int[][] arrn, int n8, boolean[] arrbl, q[][] arrq, J[] arrj, a[] arra) {
        int n9;
        int n10 = 0;
        int n11 = n9 = 0;
        while (n9 < n8) {
            Object object;
            int n12;
            int[] arrn2 = arrn[n9];
            Object object2 = new ArrayList();
            int n13 = arrn2.length;
            for (n12 = n10; n12 < n13; ++n12) {
                object2.addAll((Collection)((o0.a)list.get((int)arrn2[n12])).c);
            }
            n13 = object2.size();
            Object object3 = new q[n13];
            for (n12 = n10; n12 < n13; ++n12) {
                object = ((o0.j)object2.get((int)n12)).b;
                object3[n12] = object.a().R(x8.b((q)object)).K();
            }
            object = (o0.a)list.get(arrn2[n10]);
            long l8 = object.a;
            if (l8 != -1L) {
                object2 = Long.toString((long)l8);
            } else {
                object2 = new StringBuilder();
                object2.append("unset:");
                object2.append(n9);
                object2 = object2.toString();
            }
            n12 = n11 + 1;
            if (arrbl[n9]) {
                n10 = n11 + 2;
            } else {
                n10 = n12;
                n12 = -1;
            }
            if (arrq[n9].length != 0) {
                int n14 = n10 + 1;
                n13 = n10;
                n10 = n14;
            } else {
                n13 = -1;
            }
            b.H(a8, (q[])object3);
            arrj[n11] = new J((String)object2, (q[])object3);
            arra[n11] = a.d(object.b, arrn2, n11, n12, n13);
            if (n12 != -1) {
                object3 = new StringBuilder();
                object3.append((String)object2);
                object3.append(":emsg");
                object3 = object3.toString();
                arrj[n12] = new J((String)object3, new q.b().a0((String)object3).o0("application/x-emsg").K());
                arra[n12] = a.b(arrn2, n11);
            }
            if (n13 != -1) {
                object3 = new StringBuilder();
                object3.append((String)object2);
                object3.append(":cc");
                object2 = object3.toString();
                arra[n13] = a.a(arrn2, n11, v.V(arrq[n9]));
                b.H(a8, arrq[n9]);
                arrj[n13] = new J((String)object2, arrq[n9]);
            }
            ++n9;
            n11 = n10;
            n10 = 0;
        }
        return n11;
    }

    public static Pair w(x x8, a.a a8, List list, List list2) {
        int[][] arrn = b.B(list);
        int n8 = arrn.length;
        boolean[] arrbl = new boolean[n8];
        q[][] arrq = new q[n8][];
        int n9 = b.F(n8, list, arrn, arrbl, arrq) + n8 + list2.size();
        J[] arrj = new J[n9];
        a[] arra = new a[n9];
        b.r(list2, arrj, arra, b.t(x8, a8, list, arrn, n8, arrbl, arrq, arrj, arra));
        return Pair.create((Object)new Z(arrj), (Object)arra);
    }

    public static e x(List list) {
        return b.y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static e y(List list, String string2) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            e e8 = (e)list.get(i8);
            if (!string2.equals((Object)e8.a)) continue;
            return e8;
        }
        return null;
    }

    public static e z(List list) {
        return b.y(list, "http://dashif.org/guidelines/trickmode");
    }

    public final int C(int n8, int[] arrn) {
        if ((n8 = arrn[n8]) == -1) {
            return -1;
        }
        int n9 = this.y[n8].e;
        for (n8 = 0; n8 < arrn.length; ++n8) {
            int n10 = arrn[n8];
            if (n10 != n9 || this.y[n10].c != 0) continue;
            return n8;
        }
        return -1;
    }

    public final int[] D(A0.y[] arry) {
        int[] arrn = new int[arry.length];
        for (int i8 = 0; i8 < arry.length; ++i8) {
            A0.y y8 = arry[i8];
            arrn[i8] = y8 != null ? this.x.d(y8.d()) : -1;
        }
        return arrn;
    }

    public void J(h h8) {
        this.F.e(this);
    }

    public void L() {
        this.A.o();
        h[] arrh = this.G;
        int n8 = arrh.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrh[i8].P(this);
        }
        this.F = null;
    }

    public final void M(A0.y[] arry, boolean[] arrbl, Q[] arrq) {
        for (int i8 = 0; i8 < arry.length; ++i8) {
            if (arry[i8] != null && arrbl[i8]) continue;
            Q q8 = arrq[i8];
            if (q8 instanceof h) {
                ((h)q8).P(this);
            } else if (q8 instanceof h.a) {
                ((h.a)q8).c();
            }
            arrq[i8] = null;
        }
    }

    public final void N(A0.y[] arry, Q[] arrq, int[] arrn) {
        for (int i8 = 0; i8 < arry.length; ++i8) {
            Q q8 = arrq[i8];
            if (!(q8 instanceof x0.o) && !(q8 instanceof h.a)) continue;
            int n8 = this.C(i8, arrn);
            if (n8 == -1) {
                if (arrq[i8] instanceof x0.o) continue;
            } else {
                q8 = arrq[i8];
                if (q8 instanceof h.a && ((h.a)q8).o == arrq[n8]) continue;
            }
            q8 = arrq[i8];
            if (q8 instanceof h.a) {
                ((h.a)q8).c();
            }
            arrq[i8] = null;
        }
    }

    public final void O(A0.y[] arry, Q[] arrq, boolean[] object, long l8, int[] arrn) {
        int n8;
        int n9 = 0;
        int n10 = 0;
        do {
            if (n10 >= arry.length) break;
            A0.y y8 = arry[n10];
            if (y8 != null) {
                Object object2 = arrq[n10];
                if (object2 == null) {
                    object[n10] = true;
                    n8 = arrn[n10];
                    object2 = this.y[n8];
                    n8 = object2.c;
                    if (n8 == 0) {
                        arrq[n10] = this.v((a)object2, y8, l8);
                    } else if (n8 == 2) {
                        arrq[n10] = new j((o0.f)this.L.get(object2.d), y8.d().a(0), this.J.d);
                    }
                } else if (object2 instanceof h) {
                    ((androidx.media3.exoplayer.dash.a)((h)object2).E()).i(y8);
                }
            }
            ++n10;
        } while (true);
        for (n8 = n9; n8 < arry.length; ++n8) {
            if (arrq[n8] != null || arry[n8] == null) continue;
            n10 = arrn[n8];
            object = this.y[n10];
            if (object.c != 1) continue;
            n10 = this.C(n8, arrn);
            arrq[n8] = n10 == -1 ? new x0.o() : ((h)arrq[n10]).S(l8, object.b);
        }
    }

    public void P(c c8, int n8) {
        this.J = c8;
        this.K = n8;
        this.A.q(c8);
        h[] arrh = this.G;
        if (arrh != null) {
            int n9 = arrh.length;
            for (int i8 = 0; i8 < n9; ++i8) {
                ((androidx.media3.exoplayer.dash.a)arrh[i8].E()).c(c8, n8);
            }
            this.F.e(this);
        }
        this.L = c8.d((int)n8).d;
        block1 : for (h h8 : this.H) {
            for (o0.f f8 : this.L) {
                if (!f8.a().equals((Object)h8.b())) continue;
                int n10 = c8.e();
                boolean bl = true;
                if (!c8.d || n8 != n10 - 1) {
                    bl = false;
                }
                h8.d(f8, bl);
                continue block1;
            }
        }
    }

    @Override
    public void a(h object) {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    try {
                        object = (d.c)this.B.remove(object);
                        if (object == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object.n();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public boolean b() {
        return this.I.b();
    }

    @Override
    public long c() {
        return this.I.c();
    }

    @Override
    public long d(long l8, d1 d12) {
        for (h h8 : this.G) {
            if (h8.o != 2) continue;
            return h8.d(l8, d12);
        }
        return l8;
    }

    @Override
    public long f() {
        return this.I.f();
    }

    @Override
    public boolean g(y0 y02) {
        return this.I.g(y02);
    }

    @Override
    public void h(long l8) {
        this.I.h(l8);
    }

    @Override
    public long i(A0.y[] arrayList, boolean[] arrayList2, Q[] arrq, boolean[] object2, long l8) {
        void var5_7;
        int[] arrn = this.D((A0.y[])arrayList);
        this.M((A0.y[])arrayList, (boolean[])arrayList2, arrq);
        this.N((A0.y[])arrayList, arrq, arrn);
        this.O((A0.y[])arrayList, arrq, (boolean[])object2, (long)var5_7, arrn);
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        for (Q q8 : arrq) {
            if (q8 instanceof h) {
                arrayList.add((Object)((h)q8));
                continue;
            }
            if (!(q8 instanceof j)) continue;
            arrayList2.add((Object)((j)q8));
        }
        arrq = b.I(arrayList.size());
        this.G = arrq;
        arrayList.toArray((Object[])arrq);
        arrq = new j[arrayList2.size()];
        this.H = arrq;
        arrayList2.toArray((Object[])arrq);
        this.I = this.z.b((List)arrayList, X2.E.k((List)arrayList, new n0.d()));
        return (long)var5_7;
    }

    @Override
    public long l() {
        return -9223372036854775807L;
    }

    @Override
    public Z n() {
        return this.x;
    }

    @Override
    public void p() {
        this.v.a();
    }

    @Override
    public void q(long l8, boolean bl) {
        h[] arrh = this.G;
        int n8 = arrh.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrh[i8].q(l8, bl);
        }
    }

    @Override
    public long s(long l8) {
        int n8;
        h[] arrh = this.G;
        int n9 = arrh.length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            arrh[n8].R(l8);
        }
        arrh = this.H;
        n9 = arrh.length;
        for (n8 = n10; n8 < n9; ++n8) {
            arrh[n8].c(l8);
        }
        return l8;
    }

    @Override
    public void u(v.a a8, long l8) {
        this.F = a8;
        a8.k(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h v(a object, A0.y object2, long l8) {
        Object object3;
        int n8 = object.f;
        int n9 = 0;
        boolean bl = n8 != -1;
        Object var11_7 = null;
        if (bl) {
            object3 = this.x.b(n8);
            n8 = 1;
        } else {
            n8 = 0;
            object3 = null;
        }
        int n10 = object.g;
        v v8 = n10 != -1 ? this.y[n10].h : v.Y();
        q[] arrq = new q[n8 += v8.size()];
        int[] arrn = new int[n8];
        if (bl) {
            arrq[0] = object3.a(0);
            arrn[0] = 5;
            n8 = 1;
        } else {
            n8 = 0;
        }
        ArrayList arrayList = new ArrayList();
        while (n9 < v8.size()) {
            arrq[n8] = object3 = (q)v8.get(n9);
            arrn[n8] = 3;
            arrayList.add(object3);
            ++n8;
            ++n9;
        }
        object3 = var11_7;
        if (this.J.d) {
            object3 = var11_7;
            if (bl) {
                object3 = this.A.k();
            }
        }
        object2 = this.p.c(this.v, this.J, this.t, this.K, object.a, (A0.y)object2, object.b, this.u, bl, (List)arrayList, (d.c)object3, this.q, this.E, null);
        object = new h(object.b, arrn, arrq, (i)object2, this, this.w, l8, this.r, this.D, this.s, this.C);
        synchronized (this) {
            this.B.put(object, object3);
            return object;
        }
    }

    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final v h;

        public a(int n8, int n9, int[] arrn, int n10, int n11, int n12, int n13, v v8) {
            this.b = n8;
            this.a = arrn;
            this.c = n9;
            this.e = n10;
            this.f = n11;
            this.g = n12;
            this.d = n13;
            this.h = v8;
        }

        public static a a(int[] arrn, int n8, v v8) {
            return new a(3, 1, arrn, n8, -1, -1, -1, v8);
        }

        public static a b(int[] arrn, int n8) {
            return new a(5, 1, arrn, n8, -1, -1, -1, v.Y());
        }

        public static a c(int n8) {
            v v8 = v.Y();
            return new a(5, 2, new int[0], -1, -1, -1, n8, v8);
        }

        public static a d(int n8, int[] arrn, int n9, int n10, int n11) {
            return new a(n8, 0, arrn, n9, n10, n11, -1, v.Y());
        }
    }

}

