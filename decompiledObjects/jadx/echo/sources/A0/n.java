package A0;

import A0.A;
import A0.C0310a;
import A0.n;
import A0.y;
import X2.AbstractC0696n;
import X2.AbstractC0703v;
import X2.P;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d0.AbstractC1170I;
import d0.C1171J;
import d0.C1172K;
import d0.C1179b;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import k0.Y0;
import k0.Z0;
import k0.a1;
import k0.b1;
import x0.InterfaceC2142x;
import x0.Z;

/* loaded from: classes.dex */
public class n extends A implements a1.a {

    /* renamed from: k, reason: collision with root package name */
    public static final P f89k = P.b(new Comparator() { // from class: A0.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int S6;
            S6 = n.S((Integer) obj, (Integer) obj2);
            return S6;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final Object f90d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f91e;

    /* renamed from: f, reason: collision with root package name */
    public final y.b f92f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93g;

    /* renamed from: h, reason: collision with root package name */
    public e f94h;

    /* renamed from: i, reason: collision with root package name */
    public g f95i;

    /* renamed from: j, reason: collision with root package name */
    public C1179b f96j;

    public static final class b extends i implements Comparable {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f97A;

        /* renamed from: B, reason: collision with root package name */
        public final boolean f98B;

        /* renamed from: C, reason: collision with root package name */
        public final int f99C;

        /* renamed from: D, reason: collision with root package name */
        public final int f100D;

        /* renamed from: E, reason: collision with root package name */
        public final boolean f101E;

        /* renamed from: F, reason: collision with root package name */
        public final int f102F;

        /* renamed from: G, reason: collision with root package name */
        public final int f103G;

        /* renamed from: H, reason: collision with root package name */
        public final int f104H;

        /* renamed from: I, reason: collision with root package name */
        public final int f105I;

        /* renamed from: J, reason: collision with root package name */
        public final boolean f106J;

        /* renamed from: K, reason: collision with root package name */
        public final boolean f107K;

        /* renamed from: s, reason: collision with root package name */
        public final int f108s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f109t;

        /* renamed from: u, reason: collision with root package name */
        public final String f110u;

        /* renamed from: v, reason: collision with root package name */
        public final e f111v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f112w;

        /* renamed from: x, reason: collision with root package name */
        public final int f113x;

        /* renamed from: y, reason: collision with root package name */
        public final int f114y;

        /* renamed from: z, reason: collision with root package name */
        public final int f115z;

        public b(int i7, C1171J c1171j, int i8, e eVar, int i9, boolean z7, W2.n nVar, int i10) {
            super(i7, c1171j, i8);
            int i11;
            int i12;
            int i13;
            this.f111v = eVar;
            int i14 = eVar.f150s0 ? 24 : 16;
            this.f97A = eVar.f146o0 && (i10 & i14) != 0;
            this.f110u = n.X(this.f193r.f12716d);
            this.f112w = Z0.k(i9, false);
            int i15 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i15 >= eVar.f12491n.size()) {
                    i12 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    i12 = n.G(this.f193r, (String) eVar.f12491n.get(i15), false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f114y = i15;
            this.f113x = i12;
            this.f115z = n.K(this.f193r.f12718f, eVar.f12492o);
            C1194q c1194q = this.f193r;
            int i16 = c1194q.f12718f;
            this.f98B = i16 == 0 || (i16 & 1) != 0;
            this.f101E = (c1194q.f12717e & 1) != 0;
            int i17 = c1194q.f12702B;
            this.f102F = i17;
            this.f103G = c1194q.f12703C;
            int i18 = c1194q.f12721i;
            this.f104H = i18;
            this.f109t = (i18 == -1 || i18 <= eVar.f12494q) && (i17 == -1 || i17 <= eVar.f12493p) && nVar.apply(c1194q);
            String[] l02 = M.l0();
            int i19 = 0;
            while (true) {
                if (i19 >= l02.length) {
                    i13 = 0;
                    i19 = Integer.MAX_VALUE;
                    break;
                } else {
                    i13 = n.G(this.f193r, l02[i19], false);
                    if (i13 > 0) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f99C = i19;
            this.f100D = i13;
            int i20 = 0;
            while (true) {
                if (i20 < eVar.f12495r.size()) {
                    String str = this.f193r.f12726n;
                    if (str != null && str.equals(eVar.f12495r.get(i20))) {
                        i11 = i20;
                        break;
                    }
                    i20++;
                } else {
                    break;
                }
            }
            this.f105I = i11;
            this.f106J = Z0.g(i9) == 128;
            this.f107K = Z0.i(i9) == 64;
            this.f108s = m(i9, z7, i14);
        }

        public static int h(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC0703v l(int i7, C1171J c1171j, e eVar, int[] iArr, boolean z7, W2.n nVar, int i8) {
            AbstractC0703v.a M6 = AbstractC0703v.M();
            for (int i9 = 0; i9 < c1171j.f12438a; i9++) {
                M6.a(new b(i7, c1171j, i9, eVar, iArr[i9], z7, nVar, i8));
            }
            return M6.k();
        }

        @Override // A0.n.i
        public int c() {
            return this.f108s;
        }

        @Override // java.lang.Comparable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            P g7 = (this.f109t && this.f112w) ? n.f89k : n.f89k.g();
            AbstractC0696n f7 = AbstractC0696n.j().g(this.f112w, bVar.f112w).f(Integer.valueOf(this.f114y), Integer.valueOf(bVar.f114y), P.d().g()).d(this.f113x, bVar.f113x).d(this.f115z, bVar.f115z).g(this.f101E, bVar.f101E).g(this.f98B, bVar.f98B).f(Integer.valueOf(this.f99C), Integer.valueOf(bVar.f99C), P.d().g()).d(this.f100D, bVar.f100D).g(this.f109t, bVar.f109t).f(Integer.valueOf(this.f105I), Integer.valueOf(bVar.f105I), P.d().g());
            if (this.f111v.f12502y) {
                f7 = f7.f(Integer.valueOf(this.f104H), Integer.valueOf(bVar.f104H), n.f89k.g());
            }
            AbstractC0696n f8 = f7.g(this.f106J, bVar.f106J).g(this.f107K, bVar.f107K).f(Integer.valueOf(this.f102F), Integer.valueOf(bVar.f102F), g7).f(Integer.valueOf(this.f103G), Integer.valueOf(bVar.f103G), g7);
            if (M.c(this.f110u, bVar.f110u)) {
                f8 = f8.f(Integer.valueOf(this.f104H), Integer.valueOf(bVar.f104H), g7);
            }
            return f8.i();
        }

        public final int m(int i7, boolean z7, int i8) {
            if (!Z0.k(i7, this.f111v.f152u0)) {
                return 0;
            }
            if (!this.f109t && !this.f111v.f145n0) {
                return 0;
            }
            e eVar = this.f111v;
            if (eVar.f12496s.f12508a == 2 && !n.Y(eVar, i7, this.f193r)) {
                return 0;
            }
            if (Z0.k(i7, false) && this.f109t && this.f193r.f12721i != -1) {
                e eVar2 = this.f111v;
                if (!eVar2.f12503z && !eVar2.f12502y && ((eVar2.f154w0 || !z7) && eVar2.f12496s.f12508a != 2 && (i7 & i8) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // A0.n.i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean e(b bVar) {
            int i7;
            String str;
            int i8;
            if ((this.f111v.f148q0 || ((i8 = this.f193r.f12702B) != -1 && i8 == bVar.f193r.f12702B)) && (this.f97A || ((str = this.f193r.f12726n) != null && TextUtils.equals(str, bVar.f193r.f12726n)))) {
                e eVar = this.f111v;
                if ((eVar.f147p0 || ((i7 = this.f193r.f12703C) != -1 && i7 == bVar.f193r.f12703C)) && (eVar.f149r0 || (this.f106J == bVar.f106J && this.f107K == bVar.f107K))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c extends i implements Comparable {

        /* renamed from: s, reason: collision with root package name */
        public final int f116s;

        /* renamed from: t, reason: collision with root package name */
        public final int f117t;

        public c(int i7, C1171J c1171j, int i8, e eVar, int i9) {
            super(i7, c1171j, i8);
            this.f116s = Z0.k(i9, eVar.f152u0) ? 1 : 0;
            this.f117t = this.f193r.d();
        }

        public static int h(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static AbstractC0703v l(int i7, C1171J c1171j, e eVar, int[] iArr) {
            AbstractC0703v.a M6 = AbstractC0703v.M();
            for (int i8 = 0; i8 < c1171j.f12438a; i8++) {
                M6.a(new c(i7, c1171j, i8, eVar, iArr[i8]));
            }
            return M6.k();
        }

        @Override // A0.n.i
        public int c() {
            return this.f116s;
        }

        @Override // java.lang.Comparable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f117t, cVar.f117t);
        }

        @Override // A0.n.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean e(c cVar) {
            return false;
        }
    }

    public static final class d implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final boolean f118o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f119p;

        public d(C1194q c1194q, int i7) {
            this.f118o = (c1194q.f12717e & 1) != 0;
            this.f119p = Z0.k(i7, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return AbstractC0696n.j().g(this.f119p, dVar.f119p).g(this.f118o, dVar.f118o).i();
        }
    }

    public static final class e extends C1172K {

        /* renamed from: A0, reason: collision with root package name */
        public static final e f120A0;

        /* renamed from: B0, reason: collision with root package name */
        public static final e f121B0;

        /* renamed from: C0, reason: collision with root package name */
        public static final String f122C0;

        /* renamed from: D0, reason: collision with root package name */
        public static final String f123D0;

        /* renamed from: E0, reason: collision with root package name */
        public static final String f124E0;

        /* renamed from: F0, reason: collision with root package name */
        public static final String f125F0;

        /* renamed from: G0, reason: collision with root package name */
        public static final String f126G0;

        /* renamed from: H0, reason: collision with root package name */
        public static final String f127H0;

        /* renamed from: I0, reason: collision with root package name */
        public static final String f128I0;

        /* renamed from: J0, reason: collision with root package name */
        public static final String f129J0;

        /* renamed from: K0, reason: collision with root package name */
        public static final String f130K0;

        /* renamed from: L0, reason: collision with root package name */
        public static final String f131L0;

        /* renamed from: M0, reason: collision with root package name */
        public static final String f132M0;

        /* renamed from: N0, reason: collision with root package name */
        public static final String f133N0;

        /* renamed from: O0, reason: collision with root package name */
        public static final String f134O0;

        /* renamed from: P0, reason: collision with root package name */
        public static final String f135P0;

        /* renamed from: Q0, reason: collision with root package name */
        public static final String f136Q0;

        /* renamed from: R0, reason: collision with root package name */
        public static final String f137R0;

        /* renamed from: S0, reason: collision with root package name */
        public static final String f138S0;

        /* renamed from: T0, reason: collision with root package name */
        public static final String f139T0;

        /* renamed from: U0, reason: collision with root package name */
        public static final String f140U0;

        /* renamed from: j0, reason: collision with root package name */
        public final boolean f141j0;

        /* renamed from: k0, reason: collision with root package name */
        public final boolean f142k0;

        /* renamed from: l0, reason: collision with root package name */
        public final boolean f143l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f144m0;

        /* renamed from: n0, reason: collision with root package name */
        public final boolean f145n0;

        /* renamed from: o0, reason: collision with root package name */
        public final boolean f146o0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f147p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f148q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f149r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f150s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f151t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f152u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f153v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f154w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f155x0;

        /* renamed from: y0, reason: collision with root package name */
        public final SparseArray f156y0;

        /* renamed from: z0, reason: collision with root package name */
        public final SparseBooleanArray f157z0;

        public static final class a extends C1172K.c {

            /* renamed from: C, reason: collision with root package name */
            public boolean f158C;

            /* renamed from: D, reason: collision with root package name */
            public boolean f159D;

            /* renamed from: E, reason: collision with root package name */
            public boolean f160E;

            /* renamed from: F, reason: collision with root package name */
            public boolean f161F;

            /* renamed from: G, reason: collision with root package name */
            public boolean f162G;

            /* renamed from: H, reason: collision with root package name */
            public boolean f163H;

            /* renamed from: I, reason: collision with root package name */
            public boolean f164I;

            /* renamed from: J, reason: collision with root package name */
            public boolean f165J;

            /* renamed from: K, reason: collision with root package name */
            public boolean f166K;

            /* renamed from: L, reason: collision with root package name */
            public boolean f167L;

            /* renamed from: M, reason: collision with root package name */
            public boolean f168M;

            /* renamed from: N, reason: collision with root package name */
            public boolean f169N;

            /* renamed from: O, reason: collision with root package name */
            public boolean f170O;

            /* renamed from: P, reason: collision with root package name */
            public boolean f171P;

            /* renamed from: Q, reason: collision with root package name */
            public boolean f172Q;

            /* renamed from: R, reason: collision with root package name */
            public final SparseArray f173R;

            /* renamed from: S, reason: collision with root package name */
            public final SparseBooleanArray f174S;

            public a() {
                this.f173R = new SparseArray();
                this.f174S = new SparseBooleanArray();
                c0();
            }

            public static SparseArray b0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    sparseArray2.put(sparseArray.keyAt(i7), new HashMap((Map) sparseArray.valueAt(i7)));
                }
                return sparseArray2;
            }

            @Override // d0.C1172K.c
            /* renamed from: a0, reason: merged with bridge method [inline-methods] */
            public e C() {
                return new e(this);
            }

            public final void c0() {
                this.f158C = true;
                this.f159D = false;
                this.f160E = true;
                this.f161F = false;
                this.f162G = true;
                this.f163H = false;
                this.f164I = false;
                this.f165J = false;
                this.f166K = false;
                this.f167L = true;
                this.f168M = true;
                this.f169N = true;
                this.f170O = false;
                this.f171P = true;
                this.f172Q = false;
            }

            public a d0(C1172K c1172k) {
                super.E(c1172k);
                return this;
            }

            @Override // d0.C1172K.c
            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a G(Context context) {
                super.G(context);
                return this;
            }

            @Override // d0.C1172K.c
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public a H(int i7, int i8, boolean z7) {
                super.H(i7, i8, z7);
                return this;
            }

            @Override // d0.C1172K.c
            /* renamed from: g0, reason: merged with bridge method [inline-methods] */
            public a I(Context context, boolean z7) {
                super.I(context, z7);
                return this;
            }

            public a(e eVar) {
                super(eVar);
                this.f158C = eVar.f141j0;
                this.f159D = eVar.f142k0;
                this.f160E = eVar.f143l0;
                this.f161F = eVar.f144m0;
                this.f162G = eVar.f145n0;
                this.f163H = eVar.f146o0;
                this.f164I = eVar.f147p0;
                this.f165J = eVar.f148q0;
                this.f166K = eVar.f149r0;
                this.f167L = eVar.f150s0;
                this.f168M = eVar.f151t0;
                this.f169N = eVar.f152u0;
                this.f170O = eVar.f153v0;
                this.f171P = eVar.f154w0;
                this.f172Q = eVar.f155x0;
                this.f173R = b0(eVar.f156y0);
                this.f174S = eVar.f157z0.clone();
            }

            public a(Context context) {
                super(context);
                this.f173R = new SparseArray();
                this.f174S = new SparseBooleanArray();
                c0();
            }
        }

        static {
            e C7 = new a().C();
            f120A0 = C7;
            f121B0 = C7;
            f122C0 = M.w0(1000);
            f123D0 = M.w0(1001);
            f124E0 = M.w0(1002);
            f125F0 = M.w0(1003);
            f126G0 = M.w0(1004);
            f127H0 = M.w0(1005);
            f128I0 = M.w0(1006);
            f129J0 = M.w0(1007);
            f130K0 = M.w0(1008);
            f131L0 = M.w0(1009);
            f132M0 = M.w0(1010);
            f133N0 = M.w0(1011);
            f134O0 = M.w0(1012);
            f135P0 = M.w0(1013);
            f136Q0 = M.w0(1014);
            f137R0 = M.w0(1015);
            f138S0 = M.w0(1016);
            f139T0 = M.w0(1017);
            f140U0 = M.w0(1018);
        }

        public e(a aVar) {
            super(aVar);
            this.f141j0 = aVar.f158C;
            this.f142k0 = aVar.f159D;
            this.f143l0 = aVar.f160E;
            this.f144m0 = aVar.f161F;
            this.f145n0 = aVar.f162G;
            this.f146o0 = aVar.f163H;
            this.f147p0 = aVar.f164I;
            this.f148q0 = aVar.f165J;
            this.f149r0 = aVar.f166K;
            this.f150s0 = aVar.f167L;
            this.f151t0 = aVar.f168M;
            this.f152u0 = aVar.f169N;
            this.f153v0 = aVar.f170O;
            this.f154w0 = aVar.f171P;
            this.f155x0 = aVar.f172Q;
            this.f156y0 = aVar.f173R;
            this.f157z0 = aVar.f174S;
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i7));
                if (indexOfKey < 0 || !f((Map) sparseArray.valueAt(i7), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean f(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                Z z7 = (Z) entry.getKey();
                if (!map2.containsKey(z7) || !M.c(entry.getValue(), map2.get(z7))) {
                    return false;
                }
            }
            return true;
        }

        public static e h(Context context) {
            return new a(context).C();
        }

        @Override // d0.C1172K
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return super.equals(eVar) && this.f141j0 == eVar.f141j0 && this.f142k0 == eVar.f142k0 && this.f143l0 == eVar.f143l0 && this.f144m0 == eVar.f144m0 && this.f145n0 == eVar.f145n0 && this.f146o0 == eVar.f146o0 && this.f147p0 == eVar.f147p0 && this.f148q0 == eVar.f148q0 && this.f149r0 == eVar.f149r0 && this.f150s0 == eVar.f150s0 && this.f151t0 == eVar.f151t0 && this.f152u0 == eVar.f152u0 && this.f153v0 == eVar.f153v0 && this.f154w0 == eVar.f154w0 && this.f155x0 == eVar.f155x0 && d(this.f157z0, eVar.f157z0) && e(this.f156y0, eVar.f156y0);
        }

        @Override // d0.C1172K
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        @Override // d0.C1172K
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f141j0 ? 1 : 0)) * 31) + (this.f142k0 ? 1 : 0)) * 31) + (this.f143l0 ? 1 : 0)) * 31) + (this.f144m0 ? 1 : 0)) * 31) + (this.f145n0 ? 1 : 0)) * 31) + (this.f146o0 ? 1 : 0)) * 31) + (this.f147p0 ? 1 : 0)) * 31) + (this.f148q0 ? 1 : 0)) * 31) + (this.f149r0 ? 1 : 0)) * 31) + (this.f150s0 ? 1 : 0)) * 31) + (this.f151t0 ? 1 : 0)) * 31) + (this.f152u0 ? 1 : 0)) * 31) + (this.f153v0 ? 1 : 0)) * 31) + (this.f154w0 ? 1 : 0)) * 31) + (this.f155x0 ? 1 : 0);
        }

        public boolean i(int i7) {
            return this.f157z0.get(i7);
        }

        public f j(int i7, Z z7) {
            Map map = (Map) this.f156y0.get(i7);
            if (map == null) {
                return null;
            }
            android.support.v4.media.a.a(map.get(z7));
            return null;
        }

        public boolean k(int i7, Z z7) {
            Map map = (Map) this.f156y0.get(i7);
            return map != null && map.containsKey(z7);
        }
    }

    public static final class f {
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f175a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f176b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f177c;

        /* renamed from: d, reason: collision with root package name */
        public Spatializer$OnSpatializerStateChangedListener f178d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f179a;

            public a(n nVar) {
                this.f179a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
                this.f179a.V();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
                this.f179a.V();
            }
        }

        public g(Spatializer spatializer) {
            int immersiveAudioLevel;
            this.f175a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f176b = immersiveAudioLevel != 0;
        }

        public static g g(Context context) {
            Spatializer spatializer;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            spatializer = audioManager.getSpatializer();
            return new g(spatializer);
        }

        public boolean a(C1179b c1179b, C1194q c1194q) {
            boolean canBeSpatialized;
            int M6 = M.M(("audio/eac3-joc".equals(c1194q.f12726n) && c1194q.f12702B == 16) ? 12 : c1194q.f12702B);
            if (M6 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(M6);
            int i7 = c1194q.f12703C;
            if (i7 != -1) {
                channelMask.setSampleRate(i7);
            }
            canBeSpatialized = this.f175a.canBeSpatialized(c1179b.a().f12606a, channelMask.build());
            return canBeSpatialized;
        }

        public void b(n nVar, Looper looper) {
            if (this.f178d == null && this.f177c == null) {
                this.f178d = new a(nVar);
                Handler handler = new Handler(looper);
                this.f177c = handler;
                Spatializer spatializer = this.f175a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new m0.Z(handler), this.f178d);
            }
        }

        public boolean c() {
            boolean isAvailable;
            isAvailable = this.f175a.isAvailable();
            return isAvailable;
        }

        public boolean d() {
            boolean isEnabled;
            isEnabled = this.f175a.isEnabled();
            return isEnabled;
        }

        public boolean e() {
            return this.f176b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f178d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f177c == null) {
                return;
            }
            this.f175a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) M.i(this.f177c)).removeCallbacksAndMessages(null);
            this.f177c = null;
            this.f178d = null;
        }
    }

    public static final class h extends i implements Comparable {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f181A;

        /* renamed from: s, reason: collision with root package name */
        public final int f182s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f183t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f184u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f185v;

        /* renamed from: w, reason: collision with root package name */
        public final int f186w;

        /* renamed from: x, reason: collision with root package name */
        public final int f187x;

        /* renamed from: y, reason: collision with root package name */
        public final int f188y;

        /* renamed from: z, reason: collision with root package name */
        public final int f189z;

        public h(int i7, C1171J c1171j, int i8, e eVar, int i9, String str) {
            super(i7, c1171j, i8);
            int i10;
            int i11 = 0;
            this.f183t = Z0.k(i9, false);
            int i12 = this.f193r.f12717e & (~eVar.f12499v);
            this.f184u = (i12 & 1) != 0;
            this.f185v = (i12 & 2) != 0;
            AbstractC0703v Z6 = eVar.f12497t.isEmpty() ? AbstractC0703v.Z("") : eVar.f12497t;
            int i13 = 0;
            while (true) {
                if (i13 >= Z6.size()) {
                    i13 = Integer.MAX_VALUE;
                    i10 = 0;
                    break;
                } else {
                    i10 = n.G(this.f193r, (String) Z6.get(i13), eVar.f12500w);
                    if (i10 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f186w = i13;
            this.f187x = i10;
            int K6 = n.K(this.f193r.f12718f, eVar.f12498u);
            this.f188y = K6;
            this.f181A = (this.f193r.f12718f & 1088) != 0;
            int G6 = n.G(this.f193r, str, n.X(str) == null);
            this.f189z = G6;
            boolean z7 = i10 > 0 || (eVar.f12497t.isEmpty() && K6 > 0) || this.f184u || (this.f185v && G6 > 0);
            if (Z0.k(i9, eVar.f152u0) && z7) {
                i11 = 1;
            }
            this.f182s = i11;
        }

        public static int h(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static AbstractC0703v l(int i7, C1171J c1171j, e eVar, int[] iArr, String str) {
            AbstractC0703v.a M6 = AbstractC0703v.M();
            for (int i8 = 0; i8 < c1171j.f12438a; i8++) {
                M6.a(new h(i7, c1171j, i8, eVar, iArr[i8], str));
            }
            return M6.k();
        }

        @Override // A0.n.i
        public int c() {
            return this.f182s;
        }

        @Override // java.lang.Comparable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC0696n d7 = AbstractC0696n.j().g(this.f183t, hVar.f183t).f(Integer.valueOf(this.f186w), Integer.valueOf(hVar.f186w), P.d().g()).d(this.f187x, hVar.f187x).d(this.f188y, hVar.f188y).g(this.f184u, hVar.f184u).f(Boolean.valueOf(this.f185v), Boolean.valueOf(hVar.f185v), this.f187x == 0 ? P.d() : P.d().g()).d(this.f189z, hVar.f189z);
            if (this.f188y == 0) {
                d7 = d7.h(this.f181A, hVar.f181A);
            }
            return d7.i();
        }

        @Override // A0.n.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean e(h hVar) {
            return false;
        }
    }

    public static abstract class i {

        /* renamed from: o, reason: collision with root package name */
        public final int f190o;

        /* renamed from: p, reason: collision with root package name */
        public final C1171J f191p;

        /* renamed from: q, reason: collision with root package name */
        public final int f192q;

        /* renamed from: r, reason: collision with root package name */
        public final C1194q f193r;

        public interface a {
            List a(int i7, C1171J c1171j, int[] iArr);
        }

        public i(int i7, C1171J c1171j, int i8) {
            this.f190o = i7;
            this.f191p = c1171j;
            this.f192q = i8;
            this.f193r = c1171j.a(i8);
        }

        public abstract int c();

        public abstract boolean e(i iVar);
    }

    public static final class j extends i {

        /* renamed from: A, reason: collision with root package name */
        public final int f194A;

        /* renamed from: B, reason: collision with root package name */
        public final boolean f195B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f196C;

        /* renamed from: D, reason: collision with root package name */
        public final int f197D;

        /* renamed from: E, reason: collision with root package name */
        public final boolean f198E;

        /* renamed from: F, reason: collision with root package name */
        public final boolean f199F;

        /* renamed from: G, reason: collision with root package name */
        public final int f200G;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f201s;

        /* renamed from: t, reason: collision with root package name */
        public final e f202t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f203u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f204v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f205w;

        /* renamed from: x, reason: collision with root package name */
        public final int f206x;

        /* renamed from: y, reason: collision with root package name */
        public final int f207y;

        /* renamed from: z, reason: collision with root package name */
        public final int f208z;

        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(int r5, d0.C1171J r6, int r7, A0.n.e r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: A0.n.j.<init>(int, d0.J, int, A0.n$e, int, int, boolean):void");
        }

        public static int l(j jVar, j jVar2) {
            AbstractC0696n g7 = AbstractC0696n.j().g(jVar.f204v, jVar2.f204v).d(jVar.f194A, jVar2.f194A).g(jVar.f195B, jVar2.f195B).g(jVar.f205w, jVar2.f205w).g(jVar.f201s, jVar2.f201s).g(jVar.f203u, jVar2.f203u).f(Integer.valueOf(jVar.f208z), Integer.valueOf(jVar2.f208z), P.d().g()).g(jVar.f198E, jVar2.f198E).g(jVar.f199F, jVar2.f199F);
            if (jVar.f198E && jVar.f199F) {
                g7 = g7.d(jVar.f200G, jVar2.f200G);
            }
            return g7.i();
        }

        public static int m(j jVar, j jVar2) {
            P g7 = (jVar.f201s && jVar.f204v) ? n.f89k : n.f89k.g();
            AbstractC0696n j7 = AbstractC0696n.j();
            if (jVar.f202t.f12502y) {
                j7 = j7.f(Integer.valueOf(jVar.f206x), Integer.valueOf(jVar2.f206x), n.f89k.g());
            }
            return j7.f(Integer.valueOf(jVar.f207y), Integer.valueOf(jVar2.f207y), g7).f(Integer.valueOf(jVar.f206x), Integer.valueOf(jVar2.f206x), g7).i();
        }

        public static int n(List list, List list2) {
            return AbstractC0696n.j().f((j) Collections.max(list, new Comparator() { // from class: A0.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l7;
                    l7 = n.j.l((n.j) obj, (n.j) obj2);
                    return l7;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: A0.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l7;
                    l7 = n.j.l((n.j) obj, (n.j) obj2);
                    return l7;
                }
            }), new Comparator() { // from class: A0.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l7;
                    l7 = n.j.l((n.j) obj, (n.j) obj2);
                    return l7;
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: A0.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m7;
                    m7 = n.j.m((n.j) obj, (n.j) obj2);
                    return m7;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: A0.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m7;
                    m7 = n.j.m((n.j) obj, (n.j) obj2);
                    return m7;
                }
            }), new Comparator() { // from class: A0.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m7;
                    m7 = n.j.m((n.j) obj, (n.j) obj2);
                    return m7;
                }
            }).i();
        }

        public static AbstractC0703v o(int i7, C1171J c1171j, e eVar, int[] iArr, int i8) {
            int H6 = n.H(c1171j, eVar.f12486i, eVar.f12487j, eVar.f12488k);
            AbstractC0703v.a M6 = AbstractC0703v.M();
            for (int i9 = 0; i9 < c1171j.f12438a; i9++) {
                int d7 = c1171j.a(i9).d();
                M6.a(new j(i7, c1171j, i9, eVar, iArr[i9], i8, H6 == Integer.MAX_VALUE || (d7 != -1 && d7 <= H6)));
            }
            return M6.k();
        }

        @Override // A0.n.i
        public int c() {
            return this.f197D;
        }

        public final int p(int i7, int i8) {
            if ((this.f193r.f12718f & 16384) != 0 || !Z0.k(i7, this.f202t.f152u0)) {
                return 0;
            }
            if (!this.f201s && !this.f202t.f141j0) {
                return 0;
            }
            if (Z0.k(i7, false) && this.f203u && this.f201s && this.f193r.f12721i != -1) {
                e eVar = this.f202t;
                if (!eVar.f12503z && !eVar.f12502y && (i7 & i8) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // A0.n.i
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public boolean e(j jVar) {
            return (this.f196C || M.c(this.f193r.f12726n, jVar.f193r.f12726n)) && (this.f202t.f144m0 || (this.f198E == jVar.f198E && this.f199F == jVar.f199F));
        }
    }

    public n(Context context) {
        this(context, new C0310a.b());
    }

    public static void D(A.a aVar, e eVar, y.a[] aVarArr) {
        int d7 = aVar.d();
        for (int i7 = 0; i7 < d7; i7++) {
            Z f7 = aVar.f(i7);
            if (eVar.k(i7, f7)) {
                eVar.j(i7, f7);
                aVarArr[i7] = null;
            }
        }
    }

    public static void E(A.a aVar, C1172K c1172k, y.a[] aVarArr) {
        int d7 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < d7; i7++) {
            F(aVar.f(i7), c1172k, hashMap);
        }
        F(aVar.h(), c1172k, hashMap);
        for (int i8 = 0; i8 < d7; i8++) {
            android.support.v4.media.a.a(hashMap.get(Integer.valueOf(aVar.e(i8))));
        }
    }

    public static void F(Z z7, C1172K c1172k, Map map) {
        for (int i7 = 0; i7 < z7.f20702a; i7++) {
            android.support.v4.media.a.a(c1172k.f12476A.get(z7.b(i7)));
        }
    }

    public static int G(C1194q c1194q, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(c1194q.f12716d)) {
            return 4;
        }
        String X6 = X(str);
        String X7 = X(c1194q.f12716d);
        if (X7 == null || X6 == null) {
            return (z7 && X7 == null) ? 1 : 0;
        }
        if (X7.startsWith(X6) || X6.startsWith(X7)) {
            return 3;
        }
        return M.c1(X7, "-")[0].equals(M.c1(X6, "-")[0]) ? 2 : 0;
    }

    public static int H(C1171J c1171j, int i7, int i8, boolean z7) {
        int i9;
        int i10 = Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
            for (int i11 = 0; i11 < c1171j.f12438a; i11++) {
                C1194q a7 = c1171j.a(i11);
                int i12 = a7.f12732t;
                if (i12 > 0 && (i9 = a7.f12733u) > 0) {
                    Point I6 = I(z7, i7, i8, i12, i9);
                    int i13 = a7.f12732t;
                    int i14 = a7.f12733u;
                    int i15 = i13 * i14;
                    if (i13 >= ((int) (I6.x * 0.98f)) && i14 >= ((int) (I6.y * 0.98f)) && i15 < i10) {
                        i10 = i15;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point I(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = g0.M.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = g0.M.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.n.I(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int K(int i7, int i8) {
        if (i7 == 0 || i7 != i8) {
            return Integer.bitCount(i7 & i8);
        }
        return Integer.MAX_VALUE;
    }

    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static boolean N(C1194q c1194q) {
        String str = c1194q.f12726n;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    public static /* synthetic */ List P(e eVar, int i7, C1171J c1171j, int[] iArr) {
        return c.l(i7, c1171j, eVar, iArr);
    }

    public static /* synthetic */ List Q(e eVar, String str, int i7, C1171J c1171j, int[] iArr) {
        return h.l(i7, c1171j, eVar, iArr, str);
    }

    public static /* synthetic */ List R(e eVar, int[] iArr, int i7, C1171J c1171j, int[] iArr2) {
        return j.o(i7, c1171j, eVar, iArr2, iArr[i7]);
    }

    public static /* synthetic */ int S(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static void T(e eVar, A.a aVar, int[][][] iArr, b1[] b1VarArr, y[] yVarArr) {
        int i7 = -1;
        boolean z7 = false;
        int i8 = 0;
        for (int i9 = 0; i9 < aVar.d(); i9++) {
            int e7 = aVar.e(i9);
            y yVar = yVarArr[i9];
            if (e7 != 1 && yVar != null) {
                return;
            }
            if (e7 == 1 && yVar != null && yVar.length() == 1) {
                if (Y(eVar, iArr[i9][aVar.f(i9).d(yVar.d())][yVar.c(0)], yVar.m())) {
                    i8++;
                    i7 = i9;
                }
            }
        }
        if (i8 == 1) {
            int i10 = eVar.f12496s.f12509b ? 1 : 2;
            b1 b1Var = b1VarArr[i7];
            if (b1Var != null && b1Var.f15695b) {
                z7 = true;
            }
            b1VarArr[i7] = new b1(i10, z7);
        }
    }

    public static void U(A.a aVar, int[][][] iArr, b1[] b1VarArr, y[] yVarArr) {
        boolean z7;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < aVar.d(); i9++) {
            int e7 = aVar.e(i9);
            y yVar = yVarArr[i9];
            if ((e7 == 1 || e7 == 2) && yVar != null && Z(iArr[i9], aVar.f(i9), yVar)) {
                if (e7 == 1) {
                    if (i8 != -1) {
                        z7 = false;
                        break;
                    }
                    i8 = i9;
                } else {
                    if (i7 != -1) {
                        z7 = false;
                        break;
                    }
                    i7 = i9;
                }
            }
        }
        z7 = true;
        if (z7 && ((i8 == -1 || i7 == -1) ? false : true)) {
            b1 b1Var = new b1(0, true);
            b1VarArr[i8] = b1Var;
            b1VarArr[i7] = b1Var;
        }
    }

    public static String X(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean Y(e eVar, int i7, C1194q c1194q) {
        if (Z0.f(i7) == 0) {
            return false;
        }
        if (eVar.f12496s.f12510c && (Z0.f(i7) & 2048) == 0) {
            return false;
        }
        if (eVar.f12496s.f12509b) {
            return !(c1194q.f12705E != 0 || c1194q.f12706F != 0) || ((Z0.f(i7) & 1024) != 0);
        }
        return true;
    }

    public static boolean Z(int[][] iArr, Z z7, y yVar) {
        if (yVar == null) {
            return false;
        }
        int d7 = z7.d(yVar.d());
        for (int i7 = 0; i7 < yVar.length(); i7++) {
            if (Z0.j(iArr[d7][yVar.c(i7)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Override // A0.D
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f90d) {
            eVar = this.f94h;
        }
        return eVar;
    }

    public final boolean M(C1194q c1194q) {
        boolean z7;
        g gVar;
        g gVar2;
        synchronized (this.f90d) {
            try {
                if (this.f94h.f151t0) {
                    if (!this.f93g) {
                        if (c1194q.f12702B > 2) {
                            if (N(c1194q)) {
                                if (M.f14261a >= 32 && (gVar2 = this.f95i) != null && gVar2.e()) {
                                }
                            }
                            if (M.f14261a < 32 || (gVar = this.f95i) == null || !gVar.e() || !this.f95i.c() || !this.f95i.d() || !this.f95i.a(this.f96j, c1194q)) {
                                z7 = false;
                            }
                        }
                    }
                }
                z7 = true;
            } finally {
            }
        }
        return z7;
    }

    public final /* synthetic */ List O(e eVar, boolean z7, int[] iArr, int i7, C1171J c1171j, int[] iArr2) {
        return b.l(i7, c1171j, eVar, iArr2, z7, new W2.n() { // from class: A0.m
            @Override // W2.n
            public final boolean apply(Object obj) {
                boolean M6;
                M6 = n.this.M((C1194q) obj);
                return M6;
            }
        }, iArr[i7]);
    }

    public final void V() {
        boolean z7;
        g gVar;
        synchronized (this.f90d) {
            try {
                z7 = this.f94h.f151t0 && !this.f93g && M.f14261a >= 32 && (gVar = this.f95i) != null && gVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            f();
        }
    }

    public final void W(Y0 y02) {
        boolean z7;
        synchronized (this.f90d) {
            z7 = this.f94h.f155x0;
        }
        if (z7) {
            g(y02);
        }
    }

    @Override // k0.a1.a
    public void a(Y0 y02) {
        W(y02);
    }

    public y.a[] a0(A.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int d7 = aVar.d();
        y.a[] aVarArr = new y.a[d7];
        Pair g02 = g0(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair c02 = (eVar.f12501x || g02 == null) ? c0(aVar, iArr, eVar) : null;
        if (c02 != null) {
            aVarArr[((Integer) c02.second).intValue()] = (y.a) c02.first;
        } else if (g02 != null) {
            aVarArr[((Integer) g02.second).intValue()] = (y.a) g02.first;
        }
        Pair b02 = b0(aVar, iArr, iArr2, eVar);
        if (b02 != null) {
            aVarArr[((Integer) b02.second).intValue()] = (y.a) b02.first;
        }
        if (b02 != null) {
            Object obj = b02.first;
            str = ((y.a) obj).f209a.a(((y.a) obj).f210b[0]).f12716d;
        }
        Pair e02 = e0(aVar, iArr, eVar, str);
        if (e02 != null) {
            aVarArr[((Integer) e02.second).intValue()] = (y.a) e02.first;
        }
        for (int i7 = 0; i7 < d7; i7++) {
            int e7 = aVar.e(i7);
            if (e7 != 2 && e7 != 1 && e7 != 3 && e7 != 4) {
                aVarArr[i7] = d0(e7, aVar.f(i7), iArr[i7], eVar);
            }
        }
        return aVarArr;
    }

    public Pair b0(A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 < aVar.d()) {
                if (2 == aVar.e(i7) && aVar.f(i7).f20702a > 0) {
                    z7 = true;
                    break;
                }
                i7++;
            } else {
                break;
            }
        }
        return f0(1, aVar, iArr, new i.a() { // from class: A0.g
            @Override // A0.n.i.a
            public final List a(int i8, C1171J c1171j, int[] iArr3) {
                List O6;
                O6 = n.this.O(eVar, z7, iArr2, i8, c1171j, iArr3);
                return O6;
            }
        }, new Comparator() { // from class: A0.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.h((List) obj, (List) obj2);
            }
        });
    }

    public Pair c0(A.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f12496s.f12508a == 2) {
            return null;
        }
        return f0(4, aVar, iArr, new i.a() { // from class: A0.e
            @Override // A0.n.i.a
            public final List a(int i7, C1171J c1171j, int[] iArr2) {
                List P6;
                P6 = n.P(n.e.this, i7, c1171j, iArr2);
                return P6;
            }
        }, new Comparator() { // from class: A0.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.h((List) obj, (List) obj2);
            }
        });
    }

    public y.a d0(int i7, Z z7, int[][] iArr, e eVar) {
        if (eVar.f12496s.f12508a == 2) {
            return null;
        }
        int i8 = 0;
        C1171J c1171j = null;
        d dVar = null;
        for (int i9 = 0; i9 < z7.f20702a; i9++) {
            C1171J b7 = z7.b(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < b7.f12438a; i10++) {
                if (Z0.k(iArr2[i10], eVar.f152u0)) {
                    d dVar2 = new d(b7.a(i10), iArr2[i10]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        c1171j = b7;
                        i8 = i10;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (c1171j == null) {
            return null;
        }
        return new y.a(c1171j, i8);
    }

    public Pair e0(A.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f12496s.f12508a == 2) {
            return null;
        }
        return f0(3, aVar, iArr, new i.a() { // from class: A0.k
            @Override // A0.n.i.a
            public final List a(int i7, C1171J c1171j, int[] iArr2) {
                List Q6;
                Q6 = n.Q(n.e.this, str, i7, c1171j, iArr2);
                return Q6;
            }
        }, new Comparator() { // from class: A0.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.h((List) obj, (List) obj2);
            }
        });
    }

    public final Pair f0(int i7, A.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i8;
        RandomAccess randomAccess;
        A.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d7 = aVar.d();
        int i9 = 0;
        while (i9 < d7) {
            if (i7 == aVar3.e(i9)) {
                Z f7 = aVar3.f(i9);
                for (int i10 = 0; i10 < f7.f20702a; i10++) {
                    C1171J b7 = f7.b(i10);
                    List a7 = aVar2.a(i9, b7, iArr[i9][i10]);
                    boolean[] zArr = new boolean[b7.f12438a];
                    int i11 = 0;
                    while (i11 < b7.f12438a) {
                        i iVar = (i) a7.get(i11);
                        int c7 = iVar.c();
                        if (zArr[i11] || c7 == 0) {
                            i8 = d7;
                        } else {
                            if (c7 == 1) {
                                randomAccess = AbstractC0703v.Z(iVar);
                                i8 = d7;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i12 = i11 + 1;
                                while (i12 < b7.f12438a) {
                                    i iVar2 = (i) a7.get(i12);
                                    int i13 = d7;
                                    if (iVar2.c() == 2 && iVar.e(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i12] = true;
                                    }
                                    i12++;
                                    d7 = i13;
                                }
                                i8 = d7;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11++;
                        d7 = i8;
                    }
                }
            }
            i9++;
            aVar3 = aVar;
            d7 = d7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((i) list.get(i14)).f192q;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new y.a(iVar3.f191p, iArr2), Integer.valueOf(iVar3.f190o));
    }

    public Pair g0(A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        if (eVar.f12496s.f12508a == 2) {
            return null;
        }
        return f0(2, aVar, iArr, new i.a() { // from class: A0.i
            @Override // A0.n.i.a
            public final List a(int i7, C1171J c1171j, int[] iArr3) {
                List R6;
                R6 = n.R(n.e.this, iArr2, i7, c1171j, iArr3);
                return R6;
            }
        }, new Comparator() { // from class: A0.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.n((List) obj, (List) obj2);
            }
        });
    }

    @Override // A0.D
    public boolean h() {
        return true;
    }

    public final void h0(e eVar) {
        boolean z7;
        AbstractC1297a.e(eVar);
        synchronized (this.f90d) {
            z7 = !this.f94h.equals(eVar);
            this.f94h = eVar;
        }
        if (z7) {
            if (eVar.f151t0 && this.f91e == null) {
                g0.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            f();
        }
    }

    @Override // A0.D
    public void j() {
        g gVar;
        synchronized (this.f90d) {
            try {
                if (M.f14261a >= 32 && (gVar = this.f95i) != null) {
                    gVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.j();
    }

    @Override // A0.D
    public void l(C1179b c1179b) {
        boolean z7;
        synchronized (this.f90d) {
            z7 = !this.f96j.equals(c1179b);
            this.f96j = c1179b;
        }
        if (z7) {
            V();
        }
    }

    @Override // A0.D
    public void m(C1172K c1172k) {
        if (c1172k instanceof e) {
            h0((e) c1172k);
        }
        h0(new e.a().d0(c1172k).C());
    }

    @Override // A0.A
    public final Pair q(A.a aVar, int[][][] iArr, int[] iArr2, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I) {
        e eVar;
        g gVar;
        synchronized (this.f90d) {
            try {
                eVar = this.f94h;
                if (eVar.f151t0 && M.f14261a >= 32 && (gVar = this.f95i) != null) {
                    gVar.b(this, (Looper) AbstractC1297a.h(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int d7 = aVar.d();
        y.a[] a02 = a0(aVar, iArr, iArr2, eVar);
        E(aVar, eVar, a02);
        D(aVar, eVar, a02);
        for (int i7 = 0; i7 < d7; i7++) {
            int e7 = aVar.e(i7);
            if (eVar.i(i7) || eVar.f12477B.contains(Integer.valueOf(e7))) {
                a02[i7] = null;
            }
        }
        y[] a7 = this.f92f.a(a02, b(), bVar, abstractC1170I);
        b1[] b1VarArr = new b1[d7];
        for (int i8 = 0; i8 < d7; i8++) {
            b1VarArr[i8] = (eVar.i(i8) || eVar.f12477B.contains(Integer.valueOf(aVar.e(i8))) || (aVar.e(i8) != -2 && a7[i8] == null)) ? null : b1.f15693c;
        }
        if (eVar.f153v0) {
            U(aVar, iArr, b1VarArr, a7);
        }
        if (eVar.f12496s.f12508a != 0) {
            T(eVar, aVar, iArr, b1VarArr, a7);
        }
        return Pair.create(b1VarArr, a7);
    }

    public n(Context context, y.b bVar) {
        this(context, e.h(context), bVar);
    }

    public n(Context context, C1172K c1172k, y.b bVar) {
        this(c1172k, bVar, context);
    }

    public n(C1172K c1172k, y.b bVar, Context context) {
        e C7;
        this.f90d = new Object();
        this.f91e = context != null ? context.getApplicationContext() : null;
        this.f92f = bVar;
        if (c1172k instanceof e) {
            C7 = (e) c1172k;
        } else {
            C7 = (context == null ? e.f120A0 : e.h(context)).a().d0(c1172k).C();
        }
        this.f94h = C7;
        this.f96j = C1179b.f12594g;
        boolean z7 = context != null && M.E0(context);
        this.f93g = z7;
        if (!z7 && context != null && M.f14261a >= 32) {
            this.f95i = g.g(context);
        }
        if (this.f94h.f151t0 && context == null) {
            g0.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // A0.D
    public a1.a d() {
        return this;
    }
}
