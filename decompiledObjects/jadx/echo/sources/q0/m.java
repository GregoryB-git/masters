package q0;

import B0.m;
import X2.AbstractC0703v;
import X2.E;
import android.net.Uri;
import android.text.TextUtils;
import d0.AbstractC1203z;
import d0.C1171J;
import d0.C1190m;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.M;
import i0.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k0.C1447y0;
import k0.d1;
import l0.y1;
import p0.v;
import p0.x;
import q0.s;
import r0.g;
import r0.k;
import x0.InterfaceC2117E;
import x0.InterfaceC2129j;
import x0.InterfaceC2140v;
import x0.Q;
import x0.S;
import x0.Z;

/* loaded from: classes.dex */
public final class m implements InterfaceC2140v, k.b {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f18688A;

    /* renamed from: B, reason: collision with root package name */
    public final int f18689B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f18690C;

    /* renamed from: D, reason: collision with root package name */
    public final y1 f18691D;

    /* renamed from: F, reason: collision with root package name */
    public final long f18693F;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceC2140v.a f18694G;

    /* renamed from: H, reason: collision with root package name */
    public int f18695H;

    /* renamed from: I, reason: collision with root package name */
    public Z f18696I;

    /* renamed from: M, reason: collision with root package name */
    public int f18700M;

    /* renamed from: N, reason: collision with root package name */
    public S f18701N;

    /* renamed from: o, reason: collision with root package name */
    public final h f18702o;

    /* renamed from: p, reason: collision with root package name */
    public final r0.k f18703p;

    /* renamed from: q, reason: collision with root package name */
    public final g f18704q;

    /* renamed from: r, reason: collision with root package name */
    public final y f18705r;

    /* renamed from: s, reason: collision with root package name */
    public final x f18706s;

    /* renamed from: t, reason: collision with root package name */
    public final v.a f18707t;

    /* renamed from: u, reason: collision with root package name */
    public final B0.m f18708u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC2117E.a f18709v;

    /* renamed from: w, reason: collision with root package name */
    public final B0.b f18710w;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC2129j f18713z;

    /* renamed from: E, reason: collision with root package name */
    public final s.b f18692E = new b();

    /* renamed from: x, reason: collision with root package name */
    public final IdentityHashMap f18711x = new IdentityHashMap();

    /* renamed from: y, reason: collision with root package name */
    public final v f18712y = new v();

    /* renamed from: J, reason: collision with root package name */
    public s[] f18697J = new s[0];

    /* renamed from: K, reason: collision with root package name */
    public s[] f18698K = new s[0];

    /* renamed from: L, reason: collision with root package name */
    public int[][] f18699L = new int[0][];

    public class b implements s.b {
        public b() {
        }

        @Override // x0.S.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(s sVar) {
            m.this.f18694G.e(m.this);
        }

        @Override // q0.s.b
        public void m(Uri uri) {
            m.this.f18703p.i(uri);
        }

        @Override // q0.s.b
        public void o() {
            if (m.k(m.this) > 0) {
                return;
            }
            int i7 = 0;
            for (s sVar : m.this.f18697J) {
                i7 += sVar.n().f20702a;
            }
            C1171J[] c1171jArr = new C1171J[i7];
            int i8 = 0;
            for (s sVar2 : m.this.f18697J) {
                int i9 = sVar2.n().f20702a;
                int i10 = 0;
                while (i10 < i9) {
                    c1171jArr[i8] = sVar2.n().b(i10);
                    i10++;
                    i8++;
                }
            }
            m.this.f18696I = new Z(c1171jArr);
            m.this.f18694G.k(m.this);
        }
    }

    public m(h hVar, r0.k kVar, g gVar, y yVar, B0.f fVar, x xVar, v.a aVar, B0.m mVar, InterfaceC2117E.a aVar2, B0.b bVar, InterfaceC2129j interfaceC2129j, boolean z7, int i7, boolean z8, y1 y1Var, long j7) {
        this.f18702o = hVar;
        this.f18703p = kVar;
        this.f18704q = gVar;
        this.f18705r = yVar;
        this.f18706s = xVar;
        this.f18707t = aVar;
        this.f18708u = mVar;
        this.f18709v = aVar2;
        this.f18710w = bVar;
        this.f18713z = interfaceC2129j;
        this.f18688A = z7;
        this.f18689B = i7;
        this.f18690C = z8;
        this.f18691D = y1Var;
        this.f18693F = j7;
        this.f18701N = interfaceC2129j.a();
    }

    public static Map A(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C1190m c1190m = (C1190m) list.get(i7);
            String str = c1190m.f12657q;
            i7++;
            int i8 = i7;
            while (i8 < arrayList.size()) {
                C1190m c1190m2 = (C1190m) arrayList.get(i8);
                if (TextUtils.equals(c1190m2.f12657q, str)) {
                    c1190m = c1190m.f(c1190m2);
                    arrayList.remove(i8);
                } else {
                    i8++;
                }
            }
            hashMap.put(str, c1190m);
        }
        return hashMap;
    }

    public static C1194q B(C1194q c1194q) {
        String Q6 = M.Q(c1194q.f12722j, 2);
        return new C1194q.b().a0(c1194q.f12713a).c0(c1194q.f12714b).d0(c1194q.f12715c).Q(c1194q.f12725m).o0(AbstractC1203z.g(Q6)).O(Q6).h0(c1194q.f12723k).M(c1194q.f12719g).j0(c1194q.f12720h).v0(c1194q.f12732t).Y(c1194q.f12733u).X(c1194q.f12734v).q0(c1194q.f12717e).m0(c1194q.f12718f).K();
    }

    public static /* synthetic */ List C(s sVar) {
        return sVar.n().c();
    }

    public static /* synthetic */ int k(m mVar) {
        int i7 = mVar.f18695H - 1;
        mVar.f18695H = i7;
        return i7;
    }

    public static C1194q z(C1194q c1194q, C1194q c1194q2, boolean z7) {
        C1201x c1201x;
        int i7;
        String str;
        int i8;
        int i9;
        String str2;
        String str3;
        List list;
        List Y6 = AbstractC0703v.Y();
        if (c1194q2 != null) {
            str3 = c1194q2.f12722j;
            c1201x = c1194q2.f12723k;
            i8 = c1194q2.f12702B;
            i7 = c1194q2.f12717e;
            i9 = c1194q2.f12718f;
            str = c1194q2.f12716d;
            str2 = c1194q2.f12714b;
            list = c1194q2.f12715c;
        } else {
            String Q6 = M.Q(c1194q.f12722j, 1);
            c1201x = c1194q.f12723k;
            if (z7) {
                i8 = c1194q.f12702B;
                i7 = c1194q.f12717e;
                i9 = c1194q.f12718f;
                str = c1194q.f12716d;
                str2 = c1194q.f12714b;
                Y6 = c1194q.f12715c;
            } else {
                i7 = 0;
                str = null;
                i8 = -1;
                i9 = 0;
                str2 = null;
            }
            List list2 = Y6;
            str3 = Q6;
            list = list2;
        }
        return new C1194q.b().a0(c1194q.f12713a).c0(str2).d0(list).Q(c1194q.f12725m).o0(AbstractC1203z.g(str3)).O(str3).h0(c1201x).M(z7 ? c1194q.f12719g : -1).j0(z7 ? c1194q.f12720h : -1).N(i8).q0(i7).m0(i9).e0(str).K();
    }

    public void D() {
        this.f18703p.l(this);
        for (s sVar : this.f18697J) {
            sVar.h0();
        }
        this.f18694G = null;
    }

    @Override // r0.k.b
    public void a() {
        for (s sVar : this.f18697J) {
            sVar.d0();
        }
        this.f18694G.e(this);
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean b() {
        return this.f18701N.b();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long c() {
        return this.f18701N.c();
    }

    @Override // x0.InterfaceC2140v
    public long d(long j7, d1 d1Var) {
        for (s sVar : this.f18698K) {
            if (sVar.S()) {
                return sVar.d(j7, d1Var);
            }
        }
        return j7;
    }

    @Override // r0.k.b
    public boolean e(Uri uri, m.c cVar, boolean z7) {
        boolean z8 = true;
        for (s sVar : this.f18697J) {
            z8 &= sVar.c0(uri, cVar, z7);
        }
        this.f18694G.e(this);
        return z8;
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long f() {
        return this.f18701N.f();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean g(C1447y0 c1447y0) {
        if (this.f18696I != null) {
            return this.f18701N.g(c1447y0);
        }
        for (s sVar : this.f18697J) {
            sVar.C();
        }
        return false;
    }

    @Override // x0.InterfaceC2140v, x0.S
    public void h(long j7) {
        this.f18701N.h(j7);
    }

    @Override // x0.InterfaceC2140v
    public long i(A0.y[] yVarArr, boolean[] zArr, Q[] qArr, boolean[] zArr2, long j7) {
        Q[] qArr2 = qArr;
        int[] iArr = new int[yVarArr.length];
        int[] iArr2 = new int[yVarArr.length];
        for (int i7 = 0; i7 < yVarArr.length; i7++) {
            Q q7 = qArr2[i7];
            iArr[i7] = q7 == null ? -1 : ((Integer) this.f18711x.get(q7)).intValue();
            iArr2[i7] = -1;
            A0.y yVar = yVarArr[i7];
            if (yVar != null) {
                C1171J d7 = yVar.d();
                int i8 = 0;
                while (true) {
                    s[] sVarArr = this.f18697J;
                    if (i8 >= sVarArr.length) {
                        break;
                    }
                    if (sVarArr[i8].n().d(d7) != -1) {
                        iArr2[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        this.f18711x.clear();
        int length = yVarArr.length;
        Q[] qArr3 = new Q[length];
        Q[] qArr4 = new Q[yVarArr.length];
        A0.y[] yVarArr2 = new A0.y[yVarArr.length];
        s[] sVarArr2 = new s[this.f18697J.length];
        int i9 = 0;
        int i10 = 0;
        boolean z7 = false;
        while (i10 < this.f18697J.length) {
            for (int i11 = 0; i11 < yVarArr.length; i11++) {
                A0.y yVar2 = null;
                qArr4[i11] = iArr[i11] == i10 ? qArr2[i11] : null;
                if (iArr2[i11] == i10) {
                    yVar2 = yVarArr[i11];
                }
                yVarArr2[i11] = yVar2;
            }
            s sVar = this.f18697J[i10];
            int i12 = i9;
            int i13 = length;
            int i14 = i10;
            A0.y[] yVarArr3 = yVarArr2;
            s[] sVarArr3 = sVarArr2;
            boolean l02 = sVar.l0(yVarArr2, zArr, qArr4, zArr2, j7, z7);
            int i15 = 0;
            boolean z8 = false;
            while (true) {
                if (i15 >= yVarArr.length) {
                    break;
                }
                Q q8 = qArr4[i15];
                if (iArr2[i15] == i14) {
                    AbstractC1297a.e(q8);
                    qArr3[i15] = q8;
                    this.f18711x.put(q8, Integer.valueOf(i14));
                    z8 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC1297a.f(q8 == null);
                }
                i15++;
            }
            if (z8) {
                sVarArr3[i12] = sVar;
                i9 = i12 + 1;
                if (i12 == 0) {
                    sVar.o0(true);
                    if (!l02) {
                        s[] sVarArr4 = this.f18698K;
                        if (sVarArr4.length != 0 && sVar == sVarArr4[0]) {
                        }
                    }
                    this.f18712y.b();
                    z7 = true;
                } else {
                    sVar.o0(i14 < this.f18700M);
                }
            } else {
                i9 = i12;
            }
            i10 = i14 + 1;
            qArr2 = qArr;
            sVarArr2 = sVarArr3;
            length = i13;
            yVarArr2 = yVarArr3;
        }
        System.arraycopy(qArr3, 0, qArr2, 0, length);
        s[] sVarArr5 = (s[]) M.O0(sVarArr2, i9);
        this.f18698K = sVarArr5;
        AbstractC0703v V6 = AbstractC0703v.V(sVarArr5);
        this.f18701N = this.f18713z.b(V6, E.k(V6, new W2.g() { // from class: q0.l
            @Override // W2.g
            public final Object apply(Object obj) {
                List C7;
                C7 = m.C((s) obj);
                return C7;
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
        return (Z) AbstractC1297a.e(this.f18696I);
    }

    @Override // x0.InterfaceC2140v
    public void p() {
        for (s sVar : this.f18697J) {
            sVar.p();
        }
    }

    @Override // x0.InterfaceC2140v
    public void q(long j7, boolean z7) {
        for (s sVar : this.f18698K) {
            sVar.q(j7, z7);
        }
    }

    @Override // x0.InterfaceC2140v
    public long s(long j7) {
        s[] sVarArr = this.f18698K;
        if (sVarArr.length > 0) {
            boolean k02 = sVarArr[0].k0(j7, false);
            int i7 = 1;
            while (true) {
                s[] sVarArr2 = this.f18698K;
                if (i7 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i7].k0(j7, k02);
                i7++;
            }
            if (k02) {
                this.f18712y.b();
            }
        }
        return j7;
    }

    @Override // x0.InterfaceC2140v
    public void u(InterfaceC2140v.a aVar, long j7) {
        this.f18694G = aVar;
        this.f18703p.j(this);
        x(j7);
    }

    public final void v(long j7, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = ((g.a) list.get(i7)).f19006d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z7 = true;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    if (M.c(str, ((g.a) list.get(i8)).f19006d)) {
                        g.a aVar = (g.a) list.get(i8);
                        arrayList3.add(Integer.valueOf(i8));
                        arrayList.add(aVar.f19003a);
                        arrayList2.add(aVar.f19004b);
                        z7 &= M.P(aVar.f19004b.f12722j, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                s y7 = y(str2, 1, (Uri[]) arrayList.toArray((Uri[]) M.j(new Uri[0])), (C1194q[]) arrayList2.toArray(new C1194q[0]), null, Collections.emptyList(), map, j7);
                list3.add(a3.f.n(arrayList3));
                list2.add(y7);
                if (this.f18688A && z7) {
                    y7.f0(new C1171J[]{new C1171J(str2, (C1194q[]) arrayList2.toArray(new C1194q[0]))}, 0, new int[0]);
                }
            }
        }
    }

    public final void w(r0.g gVar, long j7, List list, List list2, Map map) {
        int i7;
        boolean z7;
        boolean z8;
        int size = gVar.f18994e.size();
        int[] iArr = new int[size];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < gVar.f18994e.size(); i10++) {
            C1194q c1194q = ((g.b) gVar.f18994e.get(i10)).f19008b;
            if (c1194q.f12733u > 0 || M.Q(c1194q.f12722j, 2) != null) {
                iArr[i10] = 2;
                i8++;
            } else if (M.Q(c1194q.f12722j, 1) != null) {
                iArr[i10] = 1;
                i9++;
            } else {
                iArr[i10] = -1;
            }
        }
        if (i8 > 0) {
            i7 = i8;
            z7 = true;
            z8 = false;
        } else if (i9 < size) {
            i7 = size - i9;
            z8 = true;
            z7 = false;
        } else {
            i7 = size;
            z7 = false;
            z8 = false;
        }
        Uri[] uriArr = new Uri[i7];
        C1194q[] c1194qArr = new C1194q[i7];
        int[] iArr2 = new int[i7];
        int i11 = 0;
        for (int i12 = 0; i12 < gVar.f18994e.size(); i12++) {
            if ((!z7 || iArr[i12] == 2) && (!z8 || iArr[i12] != 1)) {
                g.b bVar = (g.b) gVar.f18994e.get(i12);
                uriArr[i11] = bVar.f19007a;
                c1194qArr[i11] = bVar.f19008b;
                iArr2[i11] = i12;
                i11++;
            }
        }
        String str = c1194qArr[0].f12722j;
        int P6 = M.P(str, 2);
        int P7 = M.P(str, 1);
        boolean z9 = (P7 == 1 || (P7 == 0 && gVar.f18996g.isEmpty())) && P6 <= 1 && P7 + P6 > 0;
        s y7 = y("main", (z7 || P7 <= 0) ? 0 : 1, uriArr, c1194qArr, gVar.f18999j, gVar.f19000k, map, j7);
        list.add(y7);
        list2.add(iArr2);
        if (this.f18688A && z9) {
            ArrayList arrayList = new ArrayList();
            if (P6 > 0) {
                C1194q[] c1194qArr2 = new C1194q[i7];
                for (int i13 = 0; i13 < i7; i13++) {
                    c1194qArr2[i13] = B(c1194qArr[i13]);
                }
                arrayList.add(new C1171J("main", c1194qArr2));
                if (P7 > 0 && (gVar.f18999j != null || gVar.f18996g.isEmpty())) {
                    arrayList.add(new C1171J("main:audio", z(c1194qArr[0], gVar.f18999j, false)));
                }
                List list3 = gVar.f19000k;
                if (list3 != null) {
                    for (int i14 = 0; i14 < list3.size(); i14++) {
                        arrayList.add(new C1171J("main:cc:" + i14, this.f18702o.b((C1194q) list3.get(i14))));
                    }
                }
            } else {
                C1194q[] c1194qArr3 = new C1194q[i7];
                for (int i15 = 0; i15 < i7; i15++) {
                    c1194qArr3[i15] = z(c1194qArr[i15], gVar.f18999j, true);
                }
                arrayList.add(new C1171J("main", c1194qArr3));
            }
            C1171J c1171j = new C1171J("main:id3", new C1194q.b().a0("ID3").o0("application/id3").K());
            arrayList.add(c1171j);
            y7.f0((C1171J[]) arrayList.toArray(new C1171J[0]), 0, arrayList.indexOf(c1171j));
        }
    }

    public final void x(long j7) {
        int i7 = 0;
        int i8 = 1;
        r0.g gVar = (r0.g) AbstractC1297a.e(this.f18703p.b());
        Map A7 = this.f18690C ? A(gVar.f19002m) : Collections.emptyMap();
        boolean z7 = !gVar.f18994e.isEmpty();
        List list = gVar.f18996g;
        List list2 = gVar.f18997h;
        this.f18695H = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z7) {
            w(gVar, j7, arrayList, arrayList2, A7);
        }
        v(j7, list, arrayList, arrayList2, A7);
        this.f18700M = arrayList.size();
        int i9 = 0;
        while (i9 < list2.size()) {
            g.a aVar = (g.a) list2.get(i9);
            String str = "subtitle:" + i9 + ":" + aVar.f19006d;
            C1194q c1194q = aVar.f19004b;
            Uri[] uriArr = new Uri[i8];
            uriArr[i7] = aVar.f19003a;
            C1194q[] c1194qArr = new C1194q[i8];
            c1194qArr[i7] = c1194q;
            ArrayList arrayList3 = arrayList2;
            int i10 = i9;
            s y7 = y(str, 3, uriArr, c1194qArr, null, Collections.emptyList(), A7, j7);
            arrayList3.add(new int[]{i10});
            arrayList.add(y7);
            y7.f0(new C1171J[]{new C1171J(str, this.f18702o.b(c1194q))}, 0, new int[0]);
            i9 = i10 + 1;
            i7 = 0;
            arrayList2 = arrayList3;
            i8 = 1;
        }
        int i11 = i7;
        this.f18697J = (s[]) arrayList.toArray(new s[i11]);
        this.f18699L = (int[][]) arrayList2.toArray(new int[i11][]);
        this.f18695H = this.f18697J.length;
        for (int i12 = i11; i12 < this.f18700M; i12++) {
            this.f18697J[i12].o0(true);
        }
        s[] sVarArr = this.f18697J;
        int length = sVarArr.length;
        for (int i13 = i11; i13 < length; i13++) {
            sVarArr[i13].C();
        }
        this.f18698K = this.f18697J;
    }

    public final s y(String str, int i7, Uri[] uriArr, C1194q[] c1194qArr, C1194q c1194q, List list, Map map, long j7) {
        return new s(str, i7, this.f18692E, new f(this.f18702o, this.f18703p, uriArr, c1194qArr, this.f18704q, this.f18705r, this.f18712y, this.f18693F, list, this.f18691D, null), map, this.f18710w, j7, c1194q, this.f18706s, this.f18707t, this.f18708u, this.f18709v, this.f18689B);
    }
}
