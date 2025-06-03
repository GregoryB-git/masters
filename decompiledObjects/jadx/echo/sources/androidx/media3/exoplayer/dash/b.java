package androidx.media3.exoplayer.dash;

import B0.f;
import B0.m;
import B0.o;
import X2.AbstractC0703v;
import X2.E;
import X2.G;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import d0.C1171J;
import d0.C1194q;
import g0.M;
import i0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.C1447y0;
import k0.d1;
import l0.y1;
import n0.C1689b;
import n0.j;
import o0.C1750a;
import o0.C1752c;
import o0.e;
import o0.g;
import p0.v;
import p0.x;
import x0.C2134o;
import x0.InterfaceC2117E;
import x0.InterfaceC2129j;
import x0.InterfaceC2140v;
import x0.Q;
import x0.S;
import x0.Z;
import y0.C2229h;

/* loaded from: classes.dex */
public final class b implements InterfaceC2140v, S.a, C2229h.b {

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f9814M = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f9815N = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A, reason: collision with root package name */
    public final d f9816A;

    /* renamed from: C, reason: collision with root package name */
    public final InterfaceC2117E.a f9818C;

    /* renamed from: D, reason: collision with root package name */
    public final v.a f9819D;

    /* renamed from: E, reason: collision with root package name */
    public final y1 f9820E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC2140v.a f9821F;

    /* renamed from: I, reason: collision with root package name */
    public S f9824I;

    /* renamed from: J, reason: collision with root package name */
    public C1752c f9825J;

    /* renamed from: K, reason: collision with root package name */
    public int f9826K;

    /* renamed from: L, reason: collision with root package name */
    public List f9827L;

    /* renamed from: o, reason: collision with root package name */
    public final int f9828o;

    /* renamed from: p, reason: collision with root package name */
    public final a.InterfaceC0163a f9829p;

    /* renamed from: q, reason: collision with root package name */
    public final y f9830q;

    /* renamed from: r, reason: collision with root package name */
    public final x f9831r;

    /* renamed from: s, reason: collision with root package name */
    public final m f9832s;

    /* renamed from: t, reason: collision with root package name */
    public final C1689b f9833t;

    /* renamed from: u, reason: collision with root package name */
    public final long f9834u;

    /* renamed from: v, reason: collision with root package name */
    public final o f9835v;

    /* renamed from: w, reason: collision with root package name */
    public final B0.b f9836w;

    /* renamed from: x, reason: collision with root package name */
    public final Z f9837x;

    /* renamed from: y, reason: collision with root package name */
    public final a[] f9838y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC2129j f9839z;

    /* renamed from: G, reason: collision with root package name */
    public C2229h[] f9822G = I(0);

    /* renamed from: H, reason: collision with root package name */
    public j[] f9823H = new j[0];

    /* renamed from: B, reason: collision with root package name */
    public final IdentityHashMap f9817B = new IdentityHashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f9840a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9841b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9842c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9843d;

        /* renamed from: e, reason: collision with root package name */
        public final int f9844e;

        /* renamed from: f, reason: collision with root package name */
        public final int f9845f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9846g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC0703v f9847h;

        public a(int i7, int i8, int[] iArr, int i9, int i10, int i11, int i12, AbstractC0703v abstractC0703v) {
            this.f9841b = i7;
            this.f9840a = iArr;
            this.f9842c = i8;
            this.f9844e = i9;
            this.f9845f = i10;
            this.f9846g = i11;
            this.f9843d = i12;
            this.f9847h = abstractC0703v;
        }

        public static a a(int[] iArr, int i7, AbstractC0703v abstractC0703v) {
            return new a(3, 1, iArr, i7, -1, -1, -1, abstractC0703v);
        }

        public static a b(int[] iArr, int i7) {
            return new a(5, 1, iArr, i7, -1, -1, -1, AbstractC0703v.Y());
        }

        public static a c(int i7) {
            return new a(5, 2, new int[0], -1, -1, -1, i7, AbstractC0703v.Y());
        }

        public static a d(int i7, int[] iArr, int i8, int i9, int i10) {
            return new a(i7, 0, iArr, i8, i9, i10, -1, AbstractC0703v.Y());
        }
    }

    public b(int i7, C1752c c1752c, C1689b c1689b, int i8, a.InterfaceC0163a interfaceC0163a, y yVar, f fVar, x xVar, v.a aVar, m mVar, InterfaceC2117E.a aVar2, long j7, o oVar, B0.b bVar, InterfaceC2129j interfaceC2129j, d.b bVar2, y1 y1Var) {
        this.f9828o = i7;
        this.f9825J = c1752c;
        this.f9833t = c1689b;
        this.f9826K = i8;
        this.f9829p = interfaceC0163a;
        this.f9830q = yVar;
        this.f9831r = xVar;
        this.f9819D = aVar;
        this.f9832s = mVar;
        this.f9818C = aVar2;
        this.f9834u = j7;
        this.f9835v = oVar;
        this.f9836w = bVar;
        this.f9839z = interfaceC2129j;
        this.f9820E = y1Var;
        this.f9816A = new d(c1752c, bVar2, bVar);
        this.f9824I = interfaceC2129j.a();
        g d7 = c1752c.d(i8);
        List list = d7.f18120d;
        this.f9827L = list;
        Pair w7 = w(xVar, interfaceC0163a, d7.f18119c, list);
        this.f9837x = (Z) w7.first;
        this.f9838y = (a[]) w7.second;
    }

    public static C1194q[] A(List list, int[] iArr) {
        C1194q K6;
        Pattern pattern;
        for (int i7 : iArr) {
            C1750a c1750a = (C1750a) list.get(i7);
            List list2 = ((C1750a) list.get(i7)).f18075d;
            for (int i8 = 0; i8 < list2.size(); i8++) {
                e eVar = (e) list2.get(i8);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f18109a)) {
                    K6 = new C1194q.b().o0("application/cea-608").a0(c1750a.f18072a + ":cea608").K();
                    pattern = f9814M;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f18109a)) {
                    K6 = new C1194q.b().o0("application/cea-708").a0(c1750a.f18072a + ":cea708").K();
                    pattern = f9815N;
                }
                return K(eVar, pattern, K6);
            }
        }
        return new C1194q[0];
    }

    public static int[][] B(List list) {
        e x7;
        Integer num;
        int size = list.size();
        HashMap f7 = G.f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            f7.put(Long.valueOf(((C1750a) list.get(i7)).f18072a), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            C1750a c1750a = (C1750a) list.get(i8);
            e z7 = z(c1750a.f18076e);
            if (z7 == null) {
                z7 = z(c1750a.f18077f);
            }
            int intValue = (z7 == null || (num = (Integer) f7.get(Long.valueOf(Long.parseLong(z7.f18110b)))) == null) ? i8 : num.intValue();
            if (intValue == i8 && (x7 = x(c1750a.f18077f)) != null) {
                for (String str : M.b1(x7.f18110b, ",")) {
                    Integer num2 = (Integer) f7.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i8) {
                List list2 = (List) sparseArray.get(i8);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i8, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] n7 = a3.f.n((Collection) arrayList.get(i9));
            iArr[i9] = n7;
            Arrays.sort(n7);
        }
        return iArr;
    }

    public static boolean E(List list, int[] iArr) {
        for (int i7 : iArr) {
            List list2 = ((C1750a) list.get(i7)).f18074c;
            for (int i8 = 0; i8 < list2.size(); i8++) {
                if (!((o0.j) list2.get(i8)).f18135e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int F(int i7, List list, int[][] iArr, boolean[] zArr, C1194q[][] c1194qArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (E(list, iArr[i9])) {
                zArr[i9] = true;
                i8++;
            }
            C1194q[] A7 = A(list, iArr[i9]);
            c1194qArr[i9] = A7;
            if (A7.length != 0) {
                i8++;
            }
        }
        return i8;
    }

    public static /* synthetic */ List G(C2229h c2229h) {
        return AbstractC0703v.Z(Integer.valueOf(c2229h.f21274o));
    }

    public static void H(a.InterfaceC0163a interfaceC0163a, C1194q[] c1194qArr) {
        for (int i7 = 0; i7 < c1194qArr.length; i7++) {
            c1194qArr[i7] = interfaceC0163a.b(c1194qArr[i7]);
        }
    }

    public static C2229h[] I(int i7) {
        return new C2229h[i7];
    }

    public static C1194q[] K(e eVar, Pattern pattern, C1194q c1194q) {
        String str = eVar.f18110b;
        if (str == null) {
            return new C1194q[]{c1194q};
        }
        String[] b12 = M.b1(str, ";");
        C1194q[] c1194qArr = new C1194q[b12.length];
        for (int i7 = 0; i7 < b12.length; i7++) {
            Matcher matcher = pattern.matcher(b12[i7]);
            if (!matcher.matches()) {
                return new C1194q[]{c1194q};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            c1194qArr[i7] = c1194q.a().a0(c1194q.f12713a + ":" + parseInt).L(parseInt).e0(matcher.group(2)).K();
        }
        return c1194qArr;
    }

    public static void r(List list, C1171J[] c1171jArr, a[] aVarArr, int i7) {
        int i8 = 0;
        while (i8 < list.size()) {
            o0.f fVar = (o0.f) list.get(i8);
            c1171jArr[i7] = new C1171J(fVar.a() + ":" + i8, new C1194q.b().a0(fVar.a()).o0("application/x-emsg").K());
            aVarArr[i7] = a.c(i8);
            i8++;
            i7++;
        }
    }

    public static int t(x xVar, a.InterfaceC0163a interfaceC0163a, List list, int[][] iArr, int i7, boolean[] zArr, C1194q[][] c1194qArr, C1171J[] c1171jArr, a[] aVarArr) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i7) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            int length = iArr2.length;
            for (int i15 = i12; i15 < length; i15++) {
                arrayList.addAll(((C1750a) list.get(iArr2[i15])).f18074c);
            }
            int size = arrayList.size();
            C1194q[] c1194qArr2 = new C1194q[size];
            for (int i16 = i12; i16 < size; i16++) {
                C1194q c1194q = ((o0.j) arrayList.get(i16)).f18132b;
                c1194qArr2[i16] = c1194q.a().R(xVar.b(c1194q)).K();
            }
            C1750a c1750a = (C1750a) list.get(iArr2[i12]);
            long j7 = c1750a.f18072a;
            String l7 = j7 != -1 ? Long.toString(j7) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i8 = i14 + 2;
            } else {
                i8 = i17;
                i17 = -1;
            }
            if (c1194qArr[i13].length != 0) {
                i9 = i8 + 1;
            } else {
                i9 = i8;
                i8 = -1;
            }
            H(interfaceC0163a, c1194qArr2);
            c1171jArr[i14] = new C1171J(l7, c1194qArr2);
            aVarArr[i14] = a.d(c1750a.f18073b, iArr2, i14, i17, i8);
            if (i17 != -1) {
                String str = l7 + ":emsg";
                i10 = 0;
                c1171jArr[i17] = new C1171J(str, new C1194q.b().a0(str).o0("application/x-emsg").K());
                aVarArr[i17] = a.b(iArr2, i14);
                i11 = -1;
            } else {
                i10 = 0;
                i11 = -1;
            }
            if (i8 != i11) {
                aVarArr[i8] = a.a(iArr2, i14, AbstractC0703v.V(c1194qArr[i13]));
                H(interfaceC0163a, c1194qArr[i13]);
                c1171jArr[i8] = new C1171J(l7 + ":cc", c1194qArr[i13]);
            }
            i13++;
            i14 = i9;
            i12 = i10;
        }
        return i14;
    }

    public static Pair w(x xVar, a.InterfaceC0163a interfaceC0163a, List list, List list2) {
        int[][] B7 = B(list);
        int length = B7.length;
        boolean[] zArr = new boolean[length];
        C1194q[][] c1194qArr = new C1194q[length][];
        int F6 = F(length, list, B7, zArr, c1194qArr) + length + list2.size();
        C1171J[] c1171jArr = new C1171J[F6];
        a[] aVarArr = new a[F6];
        r(list2, c1171jArr, aVarArr, t(xVar, interfaceC0163a, list, B7, length, zArr, c1194qArr, c1171jArr, aVarArr));
        return Pair.create(new Z(c1171jArr), aVarArr);
    }

    public static e x(List list) {
        return y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static e y(List list, String str) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            if (str.equals(eVar.f18109a)) {
                return eVar;
            }
        }
        return null;
    }

    public static e z(List list) {
        return y(list, "http://dashif.org/guidelines/trickmode");
    }

    public final int C(int i7, int[] iArr) {
        int i8 = iArr[i7];
        if (i8 == -1) {
            return -1;
        }
        int i9 = this.f9838y[i8].f9844e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && this.f9838y[i11].f9842c == 0) {
                return i10;
            }
        }
        return -1;
    }

    public final int[] D(A0.y[] yVarArr) {
        int[] iArr = new int[yVarArr.length];
        for (int i7 = 0; i7 < yVarArr.length; i7++) {
            A0.y yVar = yVarArr[i7];
            if (yVar != null) {
                iArr[i7] = this.f9837x.d(yVar.d());
            } else {
                iArr[i7] = -1;
            }
        }
        return iArr;
    }

    @Override // x0.S.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void e(C2229h c2229h) {
        this.f9821F.e(this);
    }

    public void L() {
        this.f9816A.o();
        for (C2229h c2229h : this.f9822G) {
            c2229h.P(this);
        }
        this.f9821F = null;
    }

    public final void M(A0.y[] yVarArr, boolean[] zArr, Q[] qArr) {
        for (int i7 = 0; i7 < yVarArr.length; i7++) {
            if (yVarArr[i7] == null || !zArr[i7]) {
                Q q7 = qArr[i7];
                if (q7 instanceof C2229h) {
                    ((C2229h) q7).P(this);
                } else if (q7 instanceof C2229h.a) {
                    ((C2229h.a) q7).c();
                }
                qArr[i7] = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(A0.y[] r5, x0.Q[] r6, int[] r7) {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L3c
            r1 = r6[r0]
            boolean r2 = r1 instanceof x0.C2134o
            if (r2 != 0) goto Le
            boolean r1 = r1 instanceof y0.C2229h.a
            if (r1 == 0) goto L39
        Le:
            int r1 = r4.C(r0, r7)
            r2 = -1
            if (r1 != r2) goto L1c
            r1 = r6[r0]
            boolean r1 = r1 instanceof x0.C2134o
            if (r1 != 0) goto L39
            goto L2b
        L1c:
            r2 = r6[r0]
            boolean r3 = r2 instanceof y0.C2229h.a
            if (r3 == 0) goto L2b
            y0.h$a r2 = (y0.C2229h.a) r2
            y0.h r2 = r2.f21286o
            r1 = r6[r1]
            if (r2 != r1) goto L2b
            goto L39
        L2b:
            r1 = r6[r0]
            boolean r2 = r1 instanceof y0.C2229h.a
            if (r2 == 0) goto L36
            y0.h$a r1 = (y0.C2229h.a) r1
            r1.c()
        L36:
            r1 = 0
            r6[r0] = r1
        L39:
            int r0 = r0 + 1
            goto L1
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.b.N(A0.y[], x0.Q[], int[]):void");
    }

    public final void O(A0.y[] yVarArr, Q[] qArr, boolean[] zArr, long j7, int[] iArr) {
        for (int i7 = 0; i7 < yVarArr.length; i7++) {
            A0.y yVar = yVarArr[i7];
            if (yVar != null) {
                Q q7 = qArr[i7];
                if (q7 == null) {
                    zArr[i7] = true;
                    a aVar = this.f9838y[iArr[i7]];
                    int i8 = aVar.f9842c;
                    if (i8 == 0) {
                        qArr[i7] = v(aVar, yVar, j7);
                    } else if (i8 == 2) {
                        qArr[i7] = new j((o0.f) this.f9827L.get(aVar.f9843d), yVar.d().a(0), this.f9825J.f18085d);
                    }
                } else if (q7 instanceof C2229h) {
                    ((androidx.media3.exoplayer.dash.a) ((C2229h) q7).E()).i(yVar);
                }
            }
        }
        for (int i9 = 0; i9 < yVarArr.length; i9++) {
            if (qArr[i9] == null && yVarArr[i9] != null) {
                a aVar2 = this.f9838y[iArr[i9]];
                if (aVar2.f9842c == 1) {
                    int C7 = C(i9, iArr);
                    if (C7 == -1) {
                        qArr[i9] = new C2134o();
                    } else {
                        qArr[i9] = ((C2229h) qArr[C7]).S(j7, aVar2.f9841b);
                    }
                }
            }
        }
    }

    public void P(C1752c c1752c, int i7) {
        this.f9825J = c1752c;
        this.f9826K = i7;
        this.f9816A.q(c1752c);
        C2229h[] c2229hArr = this.f9822G;
        if (c2229hArr != null) {
            for (C2229h c2229h : c2229hArr) {
                ((androidx.media3.exoplayer.dash.a) c2229h.E()).c(c1752c, i7);
            }
            this.f9821F.e(this);
        }
        this.f9827L = c1752c.d(i7).f18120d;
        for (j jVar : this.f9823H) {
            Iterator it = this.f9827L.iterator();
            while (true) {
                if (it.hasNext()) {
                    o0.f fVar = (o0.f) it.next();
                    if (fVar.a().equals(jVar.b())) {
                        jVar.d(fVar, c1752c.f18085d && i7 == c1752c.e() - 1);
                    }
                }
            }
        }
    }

    @Override // y0.C2229h.b
    public synchronized void a(C2229h c2229h) {
        d.c cVar = (d.c) this.f9817B.remove(c2229h);
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean b() {
        return this.f9824I.b();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long c() {
        return this.f9824I.c();
    }

    @Override // x0.InterfaceC2140v
    public long d(long j7, d1 d1Var) {
        for (C2229h c2229h : this.f9822G) {
            if (c2229h.f21274o == 2) {
                return c2229h.d(j7, d1Var);
            }
        }
        return j7;
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long f() {
        return this.f9824I.f();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean g(C1447y0 c1447y0) {
        return this.f9824I.g(c1447y0);
    }

    @Override // x0.InterfaceC2140v, x0.S
    public void h(long j7) {
        this.f9824I.h(j7);
    }

    @Override // x0.InterfaceC2140v
    public long i(A0.y[] yVarArr, boolean[] zArr, Q[] qArr, boolean[] zArr2, long j7) {
        int[] D7 = D(yVarArr);
        M(yVarArr, zArr, qArr);
        N(yVarArr, qArr, D7);
        O(yVarArr, qArr, zArr2, j7, D7);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Q q7 : qArr) {
            if (q7 instanceof C2229h) {
                arrayList.add((C2229h) q7);
            } else if (q7 instanceof j) {
                arrayList2.add((j) q7);
            }
        }
        C2229h[] I6 = I(arrayList.size());
        this.f9822G = I6;
        arrayList.toArray(I6);
        j[] jVarArr = new j[arrayList2.size()];
        this.f9823H = jVarArr;
        arrayList2.toArray(jVarArr);
        this.f9824I = this.f9839z.b(arrayList, E.k(arrayList, new W2.g() { // from class: n0.d
            @Override // W2.g
            public final Object apply(Object obj) {
                List G6;
                G6 = androidx.media3.exoplayer.dash.b.G((C2229h) obj);
                return G6;
            }
        }));
        return j7;
    }

    @Override // x0.InterfaceC2140v
    public long l() {
        return -9223372036854775807L;
    }

    @Override // x0.InterfaceC2140v
    public Z n() {
        return this.f9837x;
    }

    @Override // x0.InterfaceC2140v
    public void p() {
        this.f9835v.a();
    }

    @Override // x0.InterfaceC2140v
    public void q(long j7, boolean z7) {
        for (C2229h c2229h : this.f9822G) {
            c2229h.q(j7, z7);
        }
    }

    @Override // x0.InterfaceC2140v
    public long s(long j7) {
        for (C2229h c2229h : this.f9822G) {
            c2229h.R(j7);
        }
        for (j jVar : this.f9823H) {
            jVar.c(j7);
        }
        return j7;
    }

    @Override // x0.InterfaceC2140v
    public void u(InterfaceC2140v.a aVar, long j7) {
        this.f9821F = aVar;
        aVar.k(this);
    }

    public final C2229h v(a aVar, A0.y yVar, long j7) {
        int i7;
        C1171J c1171j;
        int i8;
        int i9 = aVar.f9845f;
        boolean z7 = i9 != -1;
        d.c cVar = null;
        if (z7) {
            c1171j = this.f9837x.b(i9);
            i7 = 1;
        } else {
            i7 = 0;
            c1171j = null;
        }
        int i10 = aVar.f9846g;
        AbstractC0703v Y6 = i10 != -1 ? this.f9838y[i10].f9847h : AbstractC0703v.Y();
        int size = i7 + Y6.size();
        C1194q[] c1194qArr = new C1194q[size];
        int[] iArr = new int[size];
        if (z7) {
            c1194qArr[0] = c1171j.a(0);
            iArr[0] = 5;
            i8 = 1;
        } else {
            i8 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < Y6.size(); i11++) {
            C1194q c1194q = (C1194q) Y6.get(i11);
            c1194qArr[i8] = c1194q;
            iArr[i8] = 3;
            arrayList.add(c1194q);
            i8++;
        }
        if (this.f9825J.f18085d && z7) {
            cVar = this.f9816A.k();
        }
        d.c cVar2 = cVar;
        C2229h c2229h = new C2229h(aVar.f9841b, iArr, c1194qArr, this.f9829p.c(this.f9835v, this.f9825J, this.f9833t, this.f9826K, aVar.f9840a, yVar, aVar.f9841b, this.f9834u, z7, arrayList, cVar2, this.f9830q, this.f9820E, null), this, this.f9836w, j7, this.f9831r, this.f9819D, this.f9832s, this.f9818C);
        synchronized (this) {
            this.f9817B.put(c2229h, cVar2);
        }
        return c2229h;
    }
}
