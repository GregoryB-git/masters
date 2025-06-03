package r5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o7.l0;
import o7.t;
import o7.u;
import o7.x;
import v5.e0;
import z4.i0;

/* loaded from: classes.dex */
public class m implements v3.g {
    public static final m I = new m(new a());
    public static final String J = e0.E(1);
    public static final String K = e0.E(2);
    public static final String L = e0.E(3);
    public static final String M = e0.E(4);
    public static final String N = e0.E(5);
    public static final String O = e0.E(6);
    public static final String P = e0.E(7);
    public static final String Q = e0.E(8);
    public static final String R = e0.E(9);
    public static final String S = e0.E(10);
    public static final String T = e0.E(11);
    public static final String U = e0.E(12);
    public static final String V = e0.E(13);
    public static final String W = e0.E(14);
    public static final String X = e0.E(15);
    public static final String Y = e0.E(16);
    public static final String Z = e0.E(17);

    /* renamed from: a0, reason: collision with root package name */
    public static final String f13724a0 = e0.E(18);

    /* renamed from: b0, reason: collision with root package name */
    public static final String f13725b0 = e0.E(19);

    /* renamed from: c0, reason: collision with root package name */
    public static final String f13726c0 = e0.E(20);

    /* renamed from: d0, reason: collision with root package name */
    public static final String f13727d0 = e0.E(21);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f13728e0 = e0.E(22);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f13729f0 = e0.E(23);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f13730g0 = e0.E(24);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f13731h0 = e0.E(25);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f13732i0 = e0.E(26);
    public final t<String> A;
    public final int B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final u<i0, l> G;
    public final x<Integer> H;

    /* renamed from: a, reason: collision with root package name */
    public final int f13733a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13734b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13735c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13736d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13737e;
    public final int f;

    /* renamed from: o, reason: collision with root package name */
    public final int f13738o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13739p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13740q;

    /* renamed from: r, reason: collision with root package name */
    public final int f13741r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13742s;
    public final t<String> t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13743u;

    /* renamed from: v, reason: collision with root package name */
    public final t<String> f13744v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13745w;

    /* renamed from: x, reason: collision with root package name */
    public final int f13746x;

    /* renamed from: y, reason: collision with root package name */
    public final int f13747y;

    /* renamed from: z, reason: collision with root package name */
    public final t<String> f13748z;

    public m(a aVar) {
        this.f13733a = aVar.f13749a;
        this.f13734b = aVar.f13750b;
        this.f13735c = aVar.f13751c;
        this.f13736d = aVar.f13752d;
        this.f13737e = aVar.f13753e;
        this.f = aVar.f;
        this.f13738o = aVar.f13754g;
        this.f13739p = aVar.f13755h;
        this.f13740q = aVar.f13756i;
        this.f13741r = aVar.f13757j;
        this.f13742s = aVar.f13758k;
        this.t = aVar.f13759l;
        this.f13743u = aVar.f13760m;
        this.f13744v = aVar.f13761n;
        this.f13745w = aVar.f13762o;
        this.f13746x = aVar.f13763p;
        this.f13747y = aVar.f13764q;
        this.f13748z = aVar.f13765r;
        this.A = aVar.f13766s;
        this.B = aVar.t;
        this.C = aVar.f13767u;
        this.D = aVar.f13768v;
        this.E = aVar.f13769w;
        this.F = aVar.f13770x;
        this.G = u.b(aVar.f13771y);
        this.H = x.q(aVar.f13772z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f13733a == mVar.f13733a && this.f13734b == mVar.f13734b && this.f13735c == mVar.f13735c && this.f13736d == mVar.f13736d && this.f13737e == mVar.f13737e && this.f == mVar.f && this.f13738o == mVar.f13738o && this.f13739p == mVar.f13739p && this.f13742s == mVar.f13742s && this.f13740q == mVar.f13740q && this.f13741r == mVar.f13741r && this.t.equals(mVar.t) && this.f13743u == mVar.f13743u && this.f13744v.equals(mVar.f13744v) && this.f13745w == mVar.f13745w && this.f13746x == mVar.f13746x && this.f13747y == mVar.f13747y && this.f13748z.equals(mVar.f13748z) && this.A.equals(mVar.A) && this.B == mVar.B && this.C == mVar.C && this.D == mVar.D && this.E == mVar.E && this.F == mVar.F) {
            u<i0, l> uVar = this.G;
            u<i0, l> uVar2 = mVar.G;
            uVar.getClass();
            if (o7.e0.a(uVar, uVar2) && this.H.equals(mVar.H)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.H.hashCode() + ((this.G.hashCode() + ((((((((((((this.A.hashCode() + ((this.f13748z.hashCode() + ((((((((this.f13744v.hashCode() + ((((this.t.hashCode() + ((((((((((((((((((((((this.f13733a + 31) * 31) + this.f13734b) * 31) + this.f13735c) * 31) + this.f13736d) * 31) + this.f13737e) * 31) + this.f) * 31) + this.f13738o) * 31) + this.f13739p) * 31) + (this.f13742s ? 1 : 0)) * 31) + this.f13740q) * 31) + this.f13741r) * 31)) * 31) + this.f13743u) * 31)) * 31) + this.f13745w) * 31) + this.f13746x) * 31) + this.f13747y) * 31)) * 31)) * 31) + this.B) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31)) * 31);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13749a;

        /* renamed from: b, reason: collision with root package name */
        public int f13750b;

        /* renamed from: c, reason: collision with root package name */
        public int f13751c;

        /* renamed from: d, reason: collision with root package name */
        public int f13752d;

        /* renamed from: e, reason: collision with root package name */
        public int f13753e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f13754g;

        /* renamed from: h, reason: collision with root package name */
        public int f13755h;

        /* renamed from: i, reason: collision with root package name */
        public int f13756i;

        /* renamed from: j, reason: collision with root package name */
        public int f13757j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f13758k;

        /* renamed from: l, reason: collision with root package name */
        public t<String> f13759l;

        /* renamed from: m, reason: collision with root package name */
        public int f13760m;

        /* renamed from: n, reason: collision with root package name */
        public t<String> f13761n;

        /* renamed from: o, reason: collision with root package name */
        public int f13762o;

        /* renamed from: p, reason: collision with root package name */
        public int f13763p;

        /* renamed from: q, reason: collision with root package name */
        public int f13764q;

        /* renamed from: r, reason: collision with root package name */
        public t<String> f13765r;

        /* renamed from: s, reason: collision with root package name */
        public t<String> f13766s;
        public int t;

        /* renamed from: u, reason: collision with root package name */
        public int f13767u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f13768v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f13769w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f13770x;

        /* renamed from: y, reason: collision with root package name */
        public HashMap<i0, l> f13771y;

        /* renamed from: z, reason: collision with root package name */
        public HashSet<Integer> f13772z;

        @Deprecated
        public a() {
            this.f13749a = Integer.MAX_VALUE;
            this.f13750b = Integer.MAX_VALUE;
            this.f13751c = Integer.MAX_VALUE;
            this.f13752d = Integer.MAX_VALUE;
            this.f13756i = Integer.MAX_VALUE;
            this.f13757j = Integer.MAX_VALUE;
            this.f13758k = true;
            t.b bVar = t.f12050b;
            l0 l0Var = l0.f12009e;
            this.f13759l = l0Var;
            this.f13760m = 0;
            this.f13761n = l0Var;
            this.f13762o = 0;
            this.f13763p = Integer.MAX_VALUE;
            this.f13764q = Integer.MAX_VALUE;
            this.f13765r = l0Var;
            this.f13766s = l0Var;
            this.t = 0;
            this.f13767u = 0;
            this.f13768v = false;
            this.f13769w = false;
            this.f13770x = false;
            this.f13771y = new HashMap<>();
            this.f13772z = new HashSet<>();
        }

        public static l0 a(String[] strArr) {
            t.b bVar = t.f12050b;
            t.a aVar = new t.a();
            for (String str : strArr) {
                str.getClass();
                aVar.c(e0.J(str));
            }
            return aVar.e();
        }

        public a b(int i10, int i11) {
            this.f13756i = i10;
            this.f13757j = i11;
            this.f13758k = true;
            return this;
        }

        public a(Bundle bundle) {
            l0 a10;
            String str = m.O;
            m mVar = m.I;
            this.f13749a = bundle.getInt(str, mVar.f13733a);
            this.f13750b = bundle.getInt(m.P, mVar.f13734b);
            this.f13751c = bundle.getInt(m.Q, mVar.f13735c);
            this.f13752d = bundle.getInt(m.R, mVar.f13736d);
            this.f13753e = bundle.getInt(m.S, mVar.f13737e);
            this.f = bundle.getInt(m.T, mVar.f);
            this.f13754g = bundle.getInt(m.U, mVar.f13738o);
            this.f13755h = bundle.getInt(m.V, mVar.f13739p);
            this.f13756i = bundle.getInt(m.W, mVar.f13740q);
            this.f13757j = bundle.getInt(m.X, mVar.f13741r);
            this.f13758k = bundle.getBoolean(m.Y, mVar.f13742s);
            String[] stringArray = bundle.getStringArray(m.Z);
            this.f13759l = t.q(stringArray == null ? new String[0] : stringArray);
            this.f13760m = bundle.getInt(m.f13731h0, mVar.f13743u);
            String[] stringArray2 = bundle.getStringArray(m.J);
            this.f13761n = a(stringArray2 == null ? new String[0] : stringArray2);
            this.f13762o = bundle.getInt(m.K, mVar.f13745w);
            this.f13763p = bundle.getInt(m.f13724a0, mVar.f13746x);
            this.f13764q = bundle.getInt(m.f13725b0, mVar.f13747y);
            String[] stringArray3 = bundle.getStringArray(m.f13726c0);
            this.f13765r = t.q(stringArray3 == null ? new String[0] : stringArray3);
            String[] stringArray4 = bundle.getStringArray(m.L);
            this.f13766s = a(stringArray4 == null ? new String[0] : stringArray4);
            this.t = bundle.getInt(m.M, mVar.B);
            this.f13767u = bundle.getInt(m.f13732i0, mVar.C);
            this.f13768v = bundle.getBoolean(m.N, mVar.D);
            this.f13769w = bundle.getBoolean(m.f13727d0, mVar.E);
            this.f13770x = bundle.getBoolean(m.f13728e0, mVar.F);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m.f13729f0);
            if (parcelableArrayList == null) {
                a10 = l0.f12009e;
            } else {
                a10 = v5.b.a(l.f13721e, parcelableArrayList);
            }
            this.f13771y = new HashMap<>();
            for (int i10 = 0; i10 < a10.f12011d; i10++) {
                l lVar = (l) a10.get(i10);
                this.f13771y.put(lVar.f13722a, lVar);
            }
            int[] intArray = bundle.getIntArray(m.f13730g0);
            intArray = intArray == null ? new int[0] : intArray;
            this.f13772z = new HashSet<>();
            for (int i11 : intArray) {
                this.f13772z.add(Integer.valueOf(i11));
            }
        }
    }
}
