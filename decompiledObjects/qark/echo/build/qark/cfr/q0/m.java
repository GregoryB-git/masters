/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.IdentityHashMap
 *  java.util.List
 *  java.util.Map
 */
package q0;

import B0.m;
import android.net.Uri;
import android.text.TextUtils;
import d0.J;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import i0.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k0.d1;
import k0.y0;
import l0.y1;
import p0.v;
import p0.x;
import q0.f;
import q0.g;
import q0.h;
import q0.l;
import q0.s;
import q0.v;
import r0.g;
import r0.k;
import x0.E;
import x0.Q;
import x0.S;
import x0.Z;
import x0.j;
import x0.v;

public final class m
implements x0.v,
k.b {
    public final boolean A;
    public final int B;
    public final boolean C;
    public final y1 D;
    public final s.b E;
    public final long F;
    public v.a G;
    public int H;
    public Z I;
    public s[] J;
    public s[] K;
    public int[][] L;
    public int M;
    public S N;
    public final h o;
    public final k p;
    public final g q;
    public final y r;
    public final x s;
    public final v.a t;
    public final B0.m u;
    public final E.a v;
    public final B0.b w;
    public final IdentityHashMap x;
    public final v y;
    public final j z;

    public m(h h8, k k8, g g8, y y8, B0.f f8, x x8, v.a a8, B0.m m8, E.a a9, B0.b b8, j j8, boolean bl, int n8, boolean bl2, y1 y12, long l8) {
        this.o = h8;
        this.p = k8;
        this.q = g8;
        this.r = y8;
        this.s = x8;
        this.t = a8;
        this.u = m8;
        this.v = a9;
        this.w = b8;
        this.z = j8;
        this.A = bl;
        this.B = n8;
        this.C = bl2;
        this.D = y12;
        this.F = l8;
        this.E = new b(null);
        this.N = j8.a();
        this.x = new IdentityHashMap();
        this.y = new v();
        this.J = new s[0];
        this.K = new s[0];
        this.L = new int[0][];
    }

    public static Map A(List list) {
        ArrayList arrayList = new ArrayList((Collection)list);
        HashMap hashMap = new HashMap();
        int n8 = 0;
        while (n8 < arrayList.size()) {
            d0.m m8 = (d0.m)list.get(n8);
            String string2 = m8.q;
            int n9 = ++n8;
            while (n9 < arrayList.size()) {
                d0.m m9 = (d0.m)arrayList.get(n9);
                if (TextUtils.equals((CharSequence)m9.q, (CharSequence)string2)) {
                    m8 = m8.f(m9);
                    arrayList.remove(n9);
                    continue;
                }
                ++n9;
            }
            hashMap.put((Object)string2, (Object)m8);
        }
        return hashMap;
    }

    public static q B(q q8) {
        String string2 = M.Q(q8.j, 2);
        String string3 = z.g(string2);
        return new q.b().a0(q8.a).c0(q8.b).d0(q8.c).Q(q8.m).o0(string3).O(string2).h0(q8.k).M(q8.g).j0(q8.h).v0(q8.t).Y(q8.u).X(q8.v).q0(q8.e).m0(q8.f).K();
    }

    public static /* synthetic */ List C(s s8) {
        return s8.n().c();
    }

    public static /* synthetic */ List j(s s8) {
        return m.C(s8);
    }

    public static /* synthetic */ int k(m m8) {
        int n8;
        m8.H = n8 = m8.H - 1;
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static q z(q q8, q object, boolean bl) {
        Object object2;
        int n8;
        Object object3;
        String string2;
        int n9;
        Object object4;
        int n10;
        Object object5 = X2.v.Y();
        int n11 = -1;
        if (object != null) {
            object5 = object.j;
            object4 = object.k;
            n9 = object.B;
            n10 = object.e;
            n8 = object.f;
            string2 = object.d;
            object3 = object.b;
            object2 = object.c;
            object = object3;
            object3 = object2;
        } else {
            object4 = M.Q(q8.j, 1);
            object2 = q8.k;
            if (bl) {
                n9 = q8.B;
                n10 = q8.e;
                n8 = q8.f;
                string2 = q8.d;
                object = q8.b;
                object5 = q8.c;
            } else {
                n10 = 0;
                string2 = null;
                n9 = -1;
                n8 = 0;
                object = null;
            }
            object3 = object5;
            object5 = object4;
            object4 = object2;
        }
        object2 = z.g((String)object5);
        int n12 = bl ? q8.g : -1;
        if (bl) {
            n11 = q8.h;
        }
        return new q.b().a0(q8.a).c0((String)object).d0((List)object3).Q(q8.m).o0((String)object2).O((String)object5).h0((d0.x)object4).M(n12).j0(n11).N(n9).q0(n10).m0(n8).e0(string2).K();
    }

    public void D() {
        this.p.l(this);
        s[] arrs = this.J;
        int n8 = arrs.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrs[i8].h0();
        }
        this.G = null;
    }

    @Override
    public void a() {
        s[] arrs = this.J;
        int n8 = arrs.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrs[i8].d0();
        }
        this.G.e(this);
    }

    @Override
    public boolean b() {
        return this.N.b();
    }

    @Override
    public long c() {
        return this.N.c();
    }

    @Override
    public long d(long l8, d1 d12) {
        for (s s8 : this.K) {
            if (!s8.S()) continue;
            return s8.d(l8, d12);
        }
        return l8;
    }

    @Override
    public boolean e(Uri uri, m.c c8, boolean bl) {
        s[] arrs = this.J;
        int n8 = arrs.length;
        boolean bl2 = true;
        for (int i8 = 0; i8 < n8; ++i8) {
            bl2 &= arrs[i8].c0(uri, c8, bl);
        }
        this.G.e(this);
        return bl2;
    }

    @Override
    public long f() {
        return this.N.f();
    }

    @Override
    public boolean g(y0 arrs) {
        if (this.I == null) {
            arrs = this.J;
            int n8 = arrs.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrs[i8].C();
            }
            return false;
        }
        return this.N.g((y0)arrs);
    }

    @Override
    public void h(long l8) {
        this.N.h(l8);
    }

    @Override
    public long i(A0.y[] object, boolean[] arrbl, Q[] arrq, boolean[] arrbl2, long l8) {
        s[] arrs;
        Object object2;
        int n8;
        Object[] arrobject;
        int n9;
        int[] arrn = new int[object.length];
        int[] arrn2 = new int[object.length];
        block0 : for (n9 = 0; n9 < object.length; ++n9) {
            object2 = arrq[n9];
            n8 = object2 == null ? -1 : (Integer)this.x.get(object2);
            arrn[n9] = n8;
            arrn2[n9] = -1;
            object2 = object[n9];
            if (object2 == null) continue;
            object2 = object2.d();
            for (n8 = 0; n8 < (arrobject = this.J).length; ++n8) {
                if (arrobject[n8].n().d((J)object2) == -1) continue;
                arrn2[n9] = n8;
                continue block0;
            }
        }
        this.x.clear();
        int n10 = object.length;
        Q[] arrq2 = new Q[n10];
        Q[] arrq3 = new Q[object.length];
        object2 = new A0.y[object.length];
        arrobject = new s[this.J.length];
        n9 = 0;
        n8 = 0;
        boolean bl = false;
        do {
            block12 : {
                boolean bl2;
                boolean bl3;
                int n11;
                Object object3;
                block13 : {
                    block14 : {
                        int n12;
                        arrs = arrq;
                        if (n8 >= this.J.length) break;
                        for (n11 = 0; n11 < object.length; ++n11) {
                            n12 = arrn[n11];
                            Object var21_24 = null;
                            object3 = n12 == n8 ? arrs[n11] : null;
                            arrq3[n11] = object3;
                            object3 = var21_24;
                            if (arrn2[n11] == n8) {
                                object3 = object[n11];
                            }
                            object2[n11] = object3;
                        }
                        object3 = this.J[n8];
                        boolean bl4 = object3.l0((A0.y[])object2, arrbl, arrq3, arrbl2, l8, bl);
                        n11 = 0;
                        n12 = 0;
                        do {
                            int n13 = object.length;
                            bl3 = true;
                            bl2 = true;
                            if (n11 >= n13) break;
                            arrs = arrq3[n11];
                            if (arrn2[n11] == n8) {
                                a.e(arrs);
                                arrq2[n11] = arrs;
                                this.x.put((Object)arrs, (Object)n8);
                                n13 = 1;
                            } else {
                                n13 = n12;
                                if (arrn[n11] == n8) {
                                    if (arrs != null) {
                                        bl2 = false;
                                    }
                                    a.f(bl2);
                                    n13 = n12;
                                }
                            }
                            ++n11;
                            n12 = n13;
                        } while (true);
                        if (n12 == 0) break block12;
                        arrobject[n9] = object3;
                        n11 = n9 + 1;
                        if (n9 != 0) break block13;
                        object3.o0(true);
                        if (bl4 || (arrs = this.K).length == 0) break block14;
                        n9 = n11;
                        if (object3 == arrs[0]) break block12;
                    }
                    this.y.b();
                    bl = true;
                    n9 = n11;
                    break block12;
                }
                bl2 = n8 < this.M ? bl3 : false;
                object3.o0(bl2);
                n9 = n11;
            }
            ++n8;
        } while (true);
        System.arraycopy((Object)arrq2, (int)0, (Object)arrs, (int)0, (int)n10);
        object = (s[])M.O0(arrobject, n9);
        this.K = object;
        object = X2.v.V((Object[])object);
        this.N = this.z.b((List)object, X2.E.k((List)object, new l()));
        return l8;
    }

    @Override
    public long l() {
        return -9223372036854775807L;
    }

    @Override
    public Z n() {
        return (Z)a.e(this.I);
    }

    @Override
    public void p() {
        s[] arrs = this.J;
        int n8 = arrs.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrs[i8].p();
        }
    }

    @Override
    public void q(long l8, boolean bl) {
        s[] arrs = this.K;
        int n8 = arrs.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrs[i8].q(l8, bl);
        }
    }

    @Override
    public long s(long l8) {
        s[] arrs = this.K;
        if (arrs.length > 0) {
            boolean bl = arrs[0].k0(l8, false);
            for (int i8 = 1; i8 < (arrs = this.K).length; ++i8) {
                arrs[i8].k0(l8, bl);
            }
            if (bl) {
                this.y.b();
            }
        }
        return l8;
    }

    @Override
    public void u(v.a a8, long l8) {
        this.G = a8;
        this.p.j(this);
        this.x(l8);
    }

    public final void v(long l8, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Object object;
            String string2 = ((g.a)list.get((int)i8)).d;
            if (!hashSet.add((Object)string2)) continue;
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
            boolean bl = true;
            for (int i9 = 0; i9 < list.size(); ++i9) {
                boolean bl2 = bl;
                if (M.c(string2, ((g.a)list.get((int)i9)).d)) {
                    object = (g.a)list.get(i9);
                    arrayList3.add((Object)i9);
                    arrayList.add((Object)object.a);
                    arrayList2.add((Object)object.b);
                    bl2 = M.P(object.b.j, 1) == 1;
                    bl2 = bl & bl2;
                }
                bl = bl2;
            }
            object = new StringBuilder();
            object.append("audio:");
            object.append(string2);
            string2 = object.toString();
            object = this.y(string2, 1, (Uri[])arrayList.toArray((Object[])((Uri[])M.j((Object[])new Uri[0]))), (q[])arrayList2.toArray((Object[])new q[0]), null, Collections.emptyList(), map, l8);
            list3.add((Object)a3.f.n((Collection)arrayList3));
            list2.add(object);
            if (!this.A || !bl) continue;
            object.f0(new J[]{new J(string2, (q[])arrayList2.toArray((Object[])new q[0]))}, 0, new int[0]);
        }
    }

    public final void w(r0.g object, long l8, List list, List stringBuilder, Map object2) {
        q[] arrq;
        int n8;
        int n9;
        int n10 = object.e.size();
        Object object3 = new int[n10];
        int n11 = n9 = (n8 = 0);
        while (n8 < object.e.size()) {
            arrq = ((g.b)object.e.get((int)n8)).b;
            if (arrq.u <= 0 && M.Q(arrq.j, 2) == null) {
                if (M.Q(arrq.j, 1) != null) {
                    object3[n8] = 1;
                    ++n11;
                } else {
                    object3[n8] = -1;
                }
            } else {
                object3[n8] = 2;
                ++n9;
            }
            ++n8;
        }
        if (n9 > 0) {
            n8 = 1;
            n11 = 0;
        } else if (n11 < n10) {
            n9 = n10 - n11;
            n11 = 1;
            n8 = 0;
        } else {
            n9 = n10;
            n11 = n8 = 0;
        }
        Uri[] arruri = new Uri[n9];
        arrq = new q[n9];
        int[] arrn = new int[n9];
        int n12 = n10 = 0;
        while (n10 < object.e.size()) {
            int n13;
            block23 : {
                block24 : {
                    block22 : {
                        if (n8 == 0) break block22;
                        n13 = n12;
                        if (object3[n10] != 2) break block23;
                    }
                    if (n11 == 0) break block24;
                    n13 = n12;
                    if (object3[n10] == true) break block23;
                }
                g.b b8 = (g.b)object.e.get(n10);
                arruri[n12] = b8.a;
                arrq[n12] = b8.b;
                arrn[n12] = n10;
                n13 = n12 + 1;
            }
            ++n10;
            n12 = n13;
        }
        object3 = arrq[0].j;
        n12 = M.P((String)object3, 2);
        n10 = M.P((String)object3, 1);
        n11 = (n10 == 1 || n10 == 0 && object.g.isEmpty()) && n12 <= 1 && n10 + n12 > 0 ? 1 : 0;
        n8 = n8 == 0 && n10 > 0 ? 1 : 0;
        object2 = this.y("main", n8, arruri, arrq, object.j, object.k, (Map)object2, l8);
        list.add(object2);
        stringBuilder.add((Object)arrn);
        if (this.A && n11 != 0) {
            list = new ArrayList();
            if (n12 > 0) {
                stringBuilder = new q[n9];
                for (n8 = 0; n8 < n9; ++n8) {
                    stringBuilder[n8] = m.B(arrq[n8]);
                }
                list.add((Object)new J("main", (q[])stringBuilder));
                if (n10 > 0 && (object.j != null || object.g.isEmpty())) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("main");
                    stringBuilder.append(":audio");
                    list.add((Object)new J(stringBuilder.toString(), m.z(arrq[0], object.j, false)));
                }
                if ((object = object.k) != null) {
                    for (n9 = 0; n9 < object.size(); ++n9) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("main");
                        stringBuilder.append(":cc:");
                        stringBuilder.append(n9);
                        list.add((Object)new J(stringBuilder.toString(), this.o.b((q)object.get(n9))));
                    }
                }
            } else {
                stringBuilder = new q[n9];
                for (n8 = 0; n8 < n9; ++n8) {
                    stringBuilder[n8] = m.z(arrq[n8], object.j, true);
                }
                list.add((Object)new J("main", (q[])stringBuilder));
            }
            object = new StringBuilder();
            object.append("main");
            object.append(":id3");
            object = new J(object.toString(), new q.b().a0("ID3").o0("application/id3").K());
            list.add(object);
            object2.f0((J[])list.toArray((Object[])new J[0]), 0, list.indexOf(object));
        }
    }

    public final void x(long l8) {
        Object object = (r0.g)a.e(this.p.b());
        Map map = this.C ? m.A(object.m) : Collections.emptyMap();
        boolean bl = object.e.isEmpty();
        Object object2 = object.g;
        List list = object.h;
        this.H = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (bl ^ true) {
            this.w((r0.g)object, l8, (List)arrayList, (List)arrayList2, map);
        }
        this.v(l8, (List)object2, (List)arrayList, (List)arrayList2, map);
        this.M = arrayList.size();
        int n8 = 0;
        while (n8 < list.size()) {
            Object object3 = (g.a)list.get(n8);
            object = new StringBuilder();
            object.append("subtitle:");
            object.append(n8);
            object.append(":");
            object.append(object3.d);
            object = object.toString();
            object2 = object3.b;
            object3 = object3.a;
            List list2 = Collections.emptyList();
            object3 = this.y((String)object, 3, new Uri[]{object3}, new q[]{object2}, null, list2, map, l8);
            arrayList2.add((Object)new int[]{n8++});
            arrayList.add(object3);
            object3.f0(new J[]{new J((String)object, this.o.b((q)object2))}, 0, new int[0]);
        }
        this.J = (s[])arrayList.toArray((Object[])new s[0]);
        this.L = (int[][])arrayList2.toArray((Object[])new int[0][]);
        this.H = this.J.length;
        for (n8 = 0; n8 < this.M; ++n8) {
            this.J[n8].o0(true);
        }
        map = this.J;
        int n9 = map.length;
        for (n8 = 0; n8 < n9; ++n8) {
            map[n8].C();
        }
        this.K = this.J;
    }

    public final s y(String string2, int n8, Uri[] object, q[] arrq, q q8, List list, Map map, long l8) {
        object = new f(this.o, this.p, (Uri[])object, arrq, this.q, this.r, this.y, this.F, list, this.D, null);
        return new s(string2, n8, this.E, (f)object, map, this.w, l8, q8, this.s, this.t, this.u, this.v, this.B);
    }

    public class b
    implements s.b {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public void a(s s8) {
            m.this.G.e(m.this);
        }

        @Override
        public void m(Uri uri) {
            m.this.p.i(uri);
        }

        @Override
        public void o() {
            int n8;
            if (m.k(m.this) > 0) {
                return;
            }
            s[] arrs = m.this.J;
            int n9 = arrs.length;
            int n10 = n8 = 0;
            while (n8 < n9) {
                n10 += arrs[n8].n().a;
                ++n8;
            }
            arrs = new J[n10];
            s[] arrs2 = m.this.J;
            int n11 = arrs2.length;
            n10 = n8 = 0;
            while (n8 < n11) {
                s s8 = arrs2[n8];
                int n12 = s8.n().a;
                n9 = 0;
                while (n9 < n12) {
                    arrs[n10] = s8.n().b(n9);
                    ++n9;
                    ++n10;
                }
                ++n8;
            }
            m.this.I = new Z((J[])arrs);
            m.this.G.k(m.this);
        }
    }

}

