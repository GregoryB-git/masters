package e5;

import a4.g;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import c4.v;
import e5.g;
import e5.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o7.l0;
import o7.t;
import p2.m0;
import p4.a;
import t5.c0;
import t5.d0;
import v3.i0;
import v5.e0;
import v5.u;
import z4.b0;
import z4.d0;
import z4.j0;
import z4.q;
import z4.w;

/* loaded from: classes.dex */
public final class n implements d0.a<b5.e>, d0.e, z4.d0, c4.j, b0.c {

    /* renamed from: g0, reason: collision with root package name */
    public static final Set<Integer> f4009g0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList<m> A;
    public final Map<String, a4.d> B;
    public b5.e C;
    public c[] D;
    public HashSet F;
    public SparseIntArray G;
    public b H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public i0 N;
    public i0 O;
    public boolean P;
    public j0 Q;
    public Set<z4.i0> R;
    public int[] S;
    public int T;
    public boolean U;
    public boolean[] V;
    public boolean[] W;
    public long X;
    public long Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f4010a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4011a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f4012b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4013b0;

    /* renamed from: c, reason: collision with root package name */
    public final a f4014c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4015c0;

    /* renamed from: d, reason: collision with root package name */
    public final g f4016d;

    /* renamed from: d0, reason: collision with root package name */
    public long f4017d0;

    /* renamed from: e, reason: collision with root package name */
    public final t5.b f4018e;

    /* renamed from: e0, reason: collision with root package name */
    public a4.d f4019e0;
    public final i0 f;

    /* renamed from: f0, reason: collision with root package name */
    public j f4020f0;

    /* renamed from: o, reason: collision with root package name */
    public final a4.h f4021o;

    /* renamed from: p, reason: collision with root package name */
    public final g.a f4022p;

    /* renamed from: q, reason: collision with root package name */
    public final c0 f4023q;

    /* renamed from: s, reason: collision with root package name */
    public final w.a f4025s;
    public final int t;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList<j> f4027v;

    /* renamed from: w, reason: collision with root package name */
    public final List<j> f4028w;

    /* renamed from: x, reason: collision with root package name */
    public final u.a f4029x;

    /* renamed from: y, reason: collision with root package name */
    public final b.d f4030y;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f4031z;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f4024r = new d0("Loader:HlsSampleStreamWrapper");

    /* renamed from: u, reason: collision with root package name */
    public final g.b f4026u = new g.b();
    public int[] E = new int[0];

    public interface a extends d0.a<n> {
    }

    public static class b implements v {

        /* renamed from: g, reason: collision with root package name */
        public static final i0 f4032g;

        /* renamed from: h, reason: collision with root package name */
        public static final i0 f4033h;

        /* renamed from: a, reason: collision with root package name */
        public final r4.b f4034a = new r4.b();

        /* renamed from: b, reason: collision with root package name */
        public final v f4035b;

        /* renamed from: c, reason: collision with root package name */
        public final i0 f4036c;

        /* renamed from: d, reason: collision with root package name */
        public i0 f4037d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f4038e;
        public int f;

        static {
            i0.a aVar = new i0.a();
            aVar.f15472k = "application/id3";
            f4032g = aVar.a();
            i0.a aVar2 = new i0.a();
            aVar2.f15472k = "application/x-emsg";
            f4033h = aVar2.a();
        }

        public b(v vVar, int i10) {
            i0 i0Var;
            this.f4035b = vVar;
            if (i10 == 1) {
                i0Var = f4032g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException(defpackage.f.h("Unknown metadataType: ", i10));
                }
                i0Var = f4033h;
            }
            this.f4036c = i0Var;
            this.f4038e = new byte[0];
            this.f = 0;
        }

        @Override // c4.v
        public final void a(int i10, u uVar) {
            int i11 = this.f + i10;
            byte[] bArr = this.f4038e;
            if (bArr.length < i11) {
                this.f4038e = Arrays.copyOf(bArr, (i11 / 2) + i11);
            }
            uVar.d(this.f4038e, this.f, i10);
            this.f += i10;
        }

        @Override // c4.v
        public final void b(int i10, u uVar) {
            a(i10, uVar);
        }

        @Override // c4.v
        public final void c(long j10, int i10, int i11, int i12, v.a aVar) {
            this.f4037d.getClass();
            int i13 = this.f - i12;
            u uVar = new u(Arrays.copyOfRange(this.f4038e, i13 - i11, i13));
            byte[] bArr = this.f4038e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f = i12;
            if (!e0.a(this.f4037d.t, this.f4036c.t)) {
                if (!"application/x-emsg".equals(this.f4037d.t)) {
                    StringBuilder l10 = defpackage.f.l("Ignoring sample for unsupported format: ");
                    l10.append(this.f4037d.t);
                    v5.m.f("HlsSampleStreamWrapper", l10.toString());
                    return;
                }
                this.f4034a.getClass();
                r4.a C = r4.b.C(uVar);
                i0 n2 = C.n();
                if (!(n2 != null && e0.a(this.f4036c.t, n2.t))) {
                    v5.m.f("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f4036c.t, C.n()));
                    return;
                } else {
                    byte[] B = C.B();
                    B.getClass();
                    uVar = new u(B);
                }
            }
            int i14 = uVar.f15976c - uVar.f15975b;
            this.f4035b.b(i14, uVar);
            this.f4035b.c(j10, i10, i14, i12, aVar);
        }

        @Override // c4.v
        public final void d(i0 i0Var) {
            this.f4037d = i0Var;
            this.f4035b.d(this.f4036c);
        }

        @Override // c4.v
        public final int e(t5.h hVar, int i10, boolean z10) {
            return f(hVar, i10, z10);
        }

        public final int f(t5.h hVar, int i10, boolean z10) {
            int i11 = this.f + i10;
            byte[] bArr = this.f4038e;
            if (bArr.length < i11) {
                this.f4038e = Arrays.copyOf(bArr, (i11 / 2) + i11);
            }
            int read = hVar.read(this.f4038e, this.f, i10);
            if (read != -1) {
                this.f += read;
                return read;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
    }

    public static final class c extends b0 {
        public final Map<String, a4.d> H;
        public a4.d I;

        public c() {
            throw null;
        }

        public c(t5.b bVar, a4.h hVar, g.a aVar, Map map) {
            super(bVar, hVar, aVar);
            this.H = map;
        }

        @Override // z4.b0, c4.v
        public final void c(long j10, int i10, int i11, int i12, v.a aVar) {
            super.c(j10, i10, i11, i12, aVar);
        }

        @Override // z4.b0
        public final i0 l(i0 i0Var) {
            a4.d dVar;
            a4.d dVar2 = this.I;
            if (dVar2 == null) {
                dVar2 = i0Var.f15459w;
            }
            if (dVar2 != null && (dVar = this.H.get(dVar2.f169c)) != null) {
                dVar2 = dVar;
            }
            p4.a aVar = i0Var.f15455r;
            if (aVar != null) {
                int length = aVar.f12996a.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    a.b bVar = aVar.f12996a[i11];
                    if ((bVar instanceof u4.k) && "com.apple.streaming.transportStreamTimestamp".equals(((u4.k) bVar).f14971b)) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1) {
                    if (length != 1) {
                        a.b[] bVarArr = new a.b[length - 1];
                        while (i10 < length) {
                            if (i10 != i11) {
                                bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.f12996a[i10];
                            }
                            i10++;
                        }
                        aVar = new p4.a(bVarArr);
                    }
                }
                if (dVar2 == i0Var.f15459w || aVar != i0Var.f15455r) {
                    i0.a a10 = i0Var.a();
                    a10.f15475n = dVar2;
                    a10.f15470i = aVar;
                    i0Var = a10.a();
                }
                return super.l(i0Var);
            }
            aVar = null;
            if (dVar2 == i0Var.f15459w) {
            }
            i0.a a102 = i0Var.a();
            a102.f15475n = dVar2;
            a102.f15470i = aVar;
            i0Var = a102.a();
            return super.l(i0Var);
        }
    }

    public n(String str, int i10, l.a aVar, g gVar, Map map, t5.b bVar, long j10, i0 i0Var, a4.h hVar, g.a aVar2, c0 c0Var, w.a aVar3, int i11) {
        this.f4010a = str;
        this.f4012b = i10;
        this.f4014c = aVar;
        this.f4016d = gVar;
        this.B = map;
        this.f4018e = bVar;
        this.f = i0Var;
        this.f4021o = hVar;
        this.f4022p = aVar2;
        this.f4023q = c0Var;
        this.f4025s = aVar3;
        this.t = i11;
        Set<Integer> set = f4009g0;
        this.F = new HashSet(set.size());
        this.G = new SparseIntArray(set.size());
        this.D = new c[0];
        this.W = new boolean[0];
        this.V = new boolean[0];
        ArrayList<j> arrayList = new ArrayList<>();
        this.f4027v = arrayList;
        this.f4028w = Collections.unmodifiableList(arrayList);
        this.A = new ArrayList<>();
        this.f4029x = new u.a(this, 11);
        this.f4030y = new b.d(this, 11);
        this.f4031z = e0.l(null);
        this.X = j10;
        this.Y = j10;
    }

    public static int A(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static c4.g v(int i10, int i11) {
        v5.m.f("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c4.g();
    }

    public static i0 x(i0 i0Var, i0 i0Var2, boolean z10) {
        String c10;
        String str;
        if (i0Var == null) {
            return i0Var2;
        }
        int i10 = v5.p.i(i0Var2.t);
        if (e0.p(i10, i0Var.f15454q) == 1) {
            c10 = e0.q(i10, i0Var.f15454q);
            str = v5.p.e(c10);
        } else {
            c10 = v5.p.c(i0Var.f15454q, i0Var2.t);
            str = i0Var2.t;
        }
        i0.a aVar = new i0.a(i0Var2);
        aVar.f15463a = i0Var.f15447a;
        aVar.f15464b = i0Var.f15448b;
        aVar.f15465c = i0Var.f15449c;
        aVar.f15466d = i0Var.f15450d;
        aVar.f15467e = i0Var.f15451e;
        aVar.f = z10 ? i0Var.f : -1;
        aVar.f15468g = z10 ? i0Var.f15452o : -1;
        aVar.f15469h = c10;
        if (i10 == 2) {
            aVar.f15477p = i0Var.f15461y;
            aVar.f15478q = i0Var.f15462z;
            aVar.f15479r = i0Var.A;
        }
        if (str != null) {
            aVar.f15472k = str;
        }
        int i11 = i0Var.G;
        if (i11 != -1 && i10 == 1) {
            aVar.f15484x = i11;
        }
        p4.a aVar2 = i0Var.f15455r;
        if (aVar2 != null) {
            p4.a aVar3 = i0Var2.f15455r;
            if (aVar3 != null) {
                a.b[] bVarArr = aVar2.f12996a;
                if (bVarArr.length == 0) {
                    aVar2 = aVar3;
                } else {
                    long j10 = aVar3.f12997b;
                    a.b[] bVarArr2 = aVar3.f12996a;
                    Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                    System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                    aVar2 = new p4.a(j10, (a.b[]) copyOf);
                }
            }
            aVar.f15470i = aVar2;
        }
        return new i0(aVar);
    }

    public final boolean B() {
        return this.Y != -9223372036854775807L;
    }

    public final void C() {
        i0 i0Var;
        if (!this.P && this.S == null && this.K) {
            for (c cVar : this.D) {
                if (cVar.p() == null) {
                    return;
                }
            }
            j0 j0Var = this.Q;
            if (j0Var != null) {
                int i10 = j0Var.f17691a;
                int[] iArr = new int[i10];
                this.S = iArr;
                Arrays.fill(iArr, -1);
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 0;
                    while (true) {
                        c[] cVarArr = this.D;
                        if (i12 < cVarArr.length) {
                            i0 p10 = cVarArr[i12].p();
                            x6.b.K(p10);
                            i0 i0Var2 = this.Q.a(i11).f17687d[0];
                            String str = p10.t;
                            String str2 = i0Var2.t;
                            int i13 = v5.p.i(str);
                            if (i13 == 3 ? e0.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || p10.L == i0Var2.L) : i13 == v5.p.i(str2)) {
                                this.S[i11] = i12;
                                break;
                            }
                            i12++;
                        }
                    }
                }
                Iterator<m> it = this.A.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                return;
            }
            int length = this.D.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                i0 p11 = this.D[i14].p();
                x6.b.K(p11);
                String str3 = p11.t;
                int i17 = v5.p.m(str3) ? 2 : v5.p.k(str3) ? 1 : v5.p.l(str3) ? 3 : -2;
                if (A(i17) > A(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            z4.i0 i0Var3 = this.f4016d.f3951h;
            int i18 = i0Var3.f17684a;
            this.T = -1;
            this.S = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.S[i19] = i19;
            }
            z4.i0[] i0VarArr = new z4.i0[length];
            int i20 = 0;
            while (i20 < length) {
                i0 p12 = this.D[i20].p();
                x6.b.K(p12);
                if (i20 == i15) {
                    i0[] i0VarArr2 = new i0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        i0 i0Var4 = i0Var3.f17687d[i21];
                        if (i16 == 1 && (i0Var = this.f) != null) {
                            i0Var4 = i0Var4.d(i0Var);
                        }
                        i0VarArr2[i21] = i18 == 1 ? p12.d(i0Var4) : x(i0Var4, p12, true);
                    }
                    i0VarArr[i20] = new z4.i0(this.f4010a, i0VarArr2);
                    this.T = i20;
                } else {
                    i0 i0Var5 = (i16 == 2 && v5.p.k(p12.t)) ? this.f : null;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f4010a);
                    sb2.append(":muxed:");
                    sb2.append(i20 < i15 ? i20 : i20 - 1);
                    i0VarArr[i20] = new z4.i0(sb2.toString(), x(i0Var5, p12, false));
                }
                i20++;
            }
            this.Q = w(i0VarArr);
            x6.b.H(this.R == null);
            this.R = Collections.emptySet();
            this.L = true;
            ((l.a) this.f4014c).c();
        }
    }

    public final void D() {
        this.f4024r.a();
        g gVar = this.f4016d;
        z4.b bVar = gVar.f3957n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = gVar.f3958o;
        if (uri == null || !gVar.f3962s) {
            return;
        }
        gVar.f3950g.b(uri);
    }

    public final void E(z4.i0[] i0VarArr, int... iArr) {
        this.Q = w(i0VarArr);
        this.R = new HashSet();
        for (int i10 : iArr) {
            this.R.add(this.Q.a(i10));
        }
        this.T = 0;
        Handler handler = this.f4031z;
        a aVar = this.f4014c;
        Objects.requireNonNull(aVar);
        handler.post(new b.m(aVar, 12));
        this.L = true;
    }

    public final void F() {
        for (c cVar : this.D) {
            cVar.v(this.Z);
        }
        this.Z = false;
    }

    public final boolean G(long j10, boolean z10) {
        boolean z11;
        this.X = j10;
        if (B()) {
            this.Y = j10;
            return true;
        }
        if (this.K && !z10) {
            int length = this.D.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.D[i10].x(j10, false) && (this.W[i10] || !this.U)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.Y = j10;
        this.f4013b0 = false;
        this.f4027v.clear();
        if (this.f4024r.d()) {
            if (this.K) {
                for (c cVar : this.D) {
                    cVar.h();
                }
            }
            this.f4024r.b();
        } else {
            this.f4024r.f14471c = null;
            F();
        }
        return true;
    }

    public final void H(long j10) {
        if (this.f4017d0 != j10) {
            this.f4017d0 = j10;
            for (c cVar : this.D) {
                if (cVar.F != j10) {
                    cVar.F = j10;
                    cVar.f17594z = true;
                }
            }
        }
    }

    @Override // z4.b0.c
    public final void a() {
        this.f4031z.post(this.f4029x);
    }

    public final void b() {
        x6.b.H(this.L);
        this.Q.getClass();
        this.R.getClass();
    }

    @Override // z4.d0
    public final long c() {
        if (B()) {
            return this.Y;
        }
        if (this.f4013b0) {
            return Long.MIN_VALUE;
        }
        return z().f1867h;
    }

    @Override // z4.d0
    public final boolean d(long j10) {
        List<j> list;
        long max;
        if (this.f4013b0 || this.f4024r.d() || this.f4024r.c()) {
            return false;
        }
        if (B()) {
            list = Collections.emptyList();
            max = this.Y;
            for (c cVar : this.D) {
                cVar.t = this.Y;
            }
        } else {
            list = this.f4028w;
            j z10 = z();
            max = z10.H ? z10.f1867h : Math.max(this.X, z10.f1866g);
        }
        List<j> list2 = list;
        long j11 = max;
        g.b bVar = this.f4026u;
        bVar.f3964a = null;
        bVar.f3965b = false;
        bVar.f3966c = null;
        this.f4016d.c(j10, j11, list2, this.L || !list2.isEmpty(), this.f4026u);
        g.b bVar2 = this.f4026u;
        boolean z11 = bVar2.f3965b;
        b5.e eVar = bVar2.f3964a;
        Uri uri = bVar2.f3966c;
        if (z11) {
            this.Y = -9223372036854775807L;
            this.f4013b0 = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                l.this.f3990b.l(uri);
            }
            return false;
        }
        if (eVar instanceof j) {
            j jVar = (j) eVar;
            this.f4020f0 = jVar;
            this.N = jVar.f1864d;
            this.Y = -9223372036854775807L;
            this.f4027v.add(jVar);
            t.b bVar3 = t.f12050b;
            t.a aVar = new t.a();
            for (c cVar2 : this.D) {
                aVar.c(Integer.valueOf(cVar2.f17586q + cVar2.f17585p));
            }
            l0 e10 = aVar.e();
            jVar.D = this;
            jVar.I = e10;
            for (c cVar3 : this.D) {
                cVar3.getClass();
                cVar3.C = jVar.f3974k;
                if (jVar.f3977n) {
                    cVar3.G = true;
                }
            }
        }
        this.C = eVar;
        this.f4025s.n(new z4.n(eVar.f1861a, eVar.f1862b, this.f4024r.f(eVar, this, ((t5.u) this.f4023q).b(eVar.f1863c))), eVar.f1863c, this.f4012b, eVar.f1864d, eVar.f1865e, eVar.f, eVar.f1866g, eVar.f1867h);
        return true;
    }

    @Override // t5.d0.e
    public final void f() {
        for (c cVar : this.D) {
            cVar.v(true);
            a4.e eVar = cVar.f17577h;
            if (eVar != null) {
                eVar.f(cVar.f17575e);
                cVar.f17577h = null;
                cVar.f17576g = null;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // z4.d0
    public final long g() {
        /*
            r8 = this;
            boolean r0 = r8.f4013b0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r8.B()
            if (r0 == 0) goto L10
            long r0 = r8.Y
            return r0
        L10:
            long r0 = r8.X
            e5.j r2 = r8.z()
            boolean r3 = r2.H
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            java.util.ArrayList<e5.j> r2 = r8.f4027v
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L33
            java.util.ArrayList<e5.j> r2 = r8.f4027v
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            e5.j r2 = (e5.j) r2
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 == 0) goto L3c
            long r2 = r2.f1867h
            long r0 = java.lang.Math.max(r0, r2)
        L3c:
            boolean r2 = r8.K
            if (r2 == 0) goto L56
            e5.n$c[] r2 = r8.D
            int r3 = r2.length
            r4 = 0
        L44:
            if (r4 >= r3) goto L56
            r5 = r2[r4]
            monitor-enter(r5)
            long r6 = r5.f17590v     // Catch: java.lang.Throwable -> L53
            monitor-exit(r5)
            long r0 = java.lang.Math.max(r0, r6)
            int r4 = r4 + 1
            goto L44
        L53:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.n.g():long");
    }

    @Override // z4.d0
    public final void h(long j10) {
        if (this.f4024r.c() || B()) {
            return;
        }
        if (this.f4024r.d()) {
            this.C.getClass();
            g gVar = this.f4016d;
            if (gVar.f3957n != null) {
                return;
            }
            gVar.f3960q.h();
            return;
        }
        int size = this.f4028w.size();
        while (size > 0) {
            int i10 = size - 1;
            if (this.f4016d.b(this.f4028w.get(i10)) != 2) {
                break;
            } else {
                size = i10;
            }
        }
        if (size < this.f4028w.size()) {
            y(size);
        }
        g gVar2 = this.f4016d;
        List<j> list = this.f4028w;
        int size2 = (gVar2.f3957n != null || gVar2.f3960q.length() < 2) ? list.size() : gVar2.f3960q.n(j10, list);
        if (size2 < this.f4027v.size()) {
            y(size2);
        }
    }

    @Override // z4.d0
    public final boolean isLoading() {
        return this.f4024r.d();
    }

    @Override // t5.d0.a
    public final void k(b5.e eVar, long j10, long j11, boolean z10) {
        b5.e eVar2 = eVar;
        this.C = null;
        long j12 = eVar2.f1861a;
        t5.j0 j0Var = eVar2.f1868i;
        Uri uri = j0Var.f14525c;
        z4.n nVar = new z4.n(j0Var.f14526d);
        this.f4023q.getClass();
        this.f4025s.e(nVar, eVar2.f1863c, this.f4012b, eVar2.f1864d, eVar2.f1865e, eVar2.f, eVar2.f1866g, eVar2.f1867h);
        if (z10) {
            return;
        }
        if (B() || this.M == 0) {
            F();
        }
        if (this.M > 0) {
            ((l.a) this.f4014c).a(this);
        }
    }

    @Override // c4.j
    public final void m() {
        this.f4015c0 = true;
        this.f4031z.post(this.f4030y);
    }

    @Override // t5.d0.a
    public final void p(b5.e eVar, long j10, long j11) {
        b5.e eVar2 = eVar;
        this.C = null;
        g gVar = this.f4016d;
        gVar.getClass();
        if (eVar2 instanceof g.a) {
            g.a aVar = (g.a) eVar2;
            gVar.f3956m = aVar.f1897j;
            f fVar = gVar.f3953j;
            Uri uri = aVar.f1862b.f14547a;
            byte[] bArr = aVar.f3963l;
            bArr.getClass();
            e eVar3 = fVar.f3944a;
            uri.getClass();
            eVar3.put(uri, bArr);
        }
        long j12 = eVar2.f1861a;
        t5.j0 j0Var = eVar2.f1868i;
        Uri uri2 = j0Var.f14525c;
        z4.n nVar = new z4.n(j0Var.f14526d);
        this.f4023q.getClass();
        this.f4025s.h(nVar, eVar2.f1863c, this.f4012b, eVar2.f1864d, eVar2.f1865e, eVar2.f, eVar2.f1866g, eVar2.f1867h);
        if (this.L) {
            ((l.a) this.f4014c).a(this);
        } else {
            d(this.X);
        }
    }

    @Override // c4.j
    public final v r(int i10, int i11) {
        v vVar;
        Set<Integer> set = f4009g0;
        if (!set.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                v[] vVarArr = this.D;
                if (i12 >= vVarArr.length) {
                    break;
                }
                if (this.E[i12] == i10) {
                    vVar = vVarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            x6.b.q(set.contains(Integer.valueOf(i11)));
            int i13 = this.G.get(i11, -1);
            if (i13 != -1) {
                if (this.F.add(Integer.valueOf(i11))) {
                    this.E[i13] = i10;
                }
                vVar = this.E[i13] == i10 ? this.D[i13] : v(i10, i11);
            }
            vVar = null;
        }
        if (vVar == null) {
            if (this.f4015c0) {
                return v(i10, i11);
            }
            int length = this.D.length;
            boolean z10 = i11 == 1 || i11 == 2;
            c cVar = new c(this.f4018e, this.f4021o, this.f4022p, this.B);
            cVar.t = this.X;
            if (z10) {
                cVar.I = this.f4019e0;
                cVar.f17594z = true;
            }
            long j10 = this.f4017d0;
            if (cVar.F != j10) {
                cVar.F = j10;
                cVar.f17594z = true;
            }
            j jVar = this.f4020f0;
            if (jVar != null) {
                cVar.C = jVar.f3974k;
            }
            cVar.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.E, i14);
            this.E = copyOf;
            copyOf[length] = i10;
            c[] cVarArr = this.D;
            int i15 = e0.f15881a;
            Object[] copyOf2 = Arrays.copyOf(cVarArr, cVarArr.length + 1);
            copyOf2[cVarArr.length] = cVar;
            this.D = (c[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.W, i14);
            this.W = copyOf3;
            copyOf3[length] = z10;
            this.U |= z10;
            this.F.add(Integer.valueOf(i11));
            this.G.append(i11, length);
            if (A(i11) > A(this.I)) {
                this.J = length;
                this.I = i11;
            }
            this.V = Arrays.copyOf(this.V, i14);
            vVar = cVar;
        }
        if (i11 != 5) {
            return vVar;
        }
        if (this.H == null) {
            this.H = new b(vVar, this.t);
        }
        return this.H;
    }

    @Override // c4.j
    public final void t(c4.t tVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    @Override // t5.d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t5.d0.b u(b5.e r18, long r19, long r21, java.io.IOException r23, int r24) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.n.u(t5.d0$d, long, long, java.io.IOException, int):t5.d0$b");
    }

    public final j0 w(z4.i0[] i0VarArr) {
        for (int i10 = 0; i10 < i0VarArr.length; i10++) {
            z4.i0 i0Var = i0VarArr[i10];
            i0[] i0VarArr2 = new i0[i0Var.f17684a];
            for (int i11 = 0; i11 < i0Var.f17684a; i11++) {
                i0 i0Var2 = i0Var.f17687d[i11];
                i0VarArr2[i11] = i0Var2.b(this.f4021o.e(i0Var2));
            }
            i0VarArr[i10] = new z4.i0(i0Var.f17685b, i0VarArr2);
        }
        return new j0(i0VarArr);
    }

    public final void y(int i10) {
        boolean z10;
        x6.b.H(!this.f4024r.d());
        int i11 = i10;
        while (true) {
            if (i11 >= this.f4027v.size()) {
                i11 = -1;
                break;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= this.f4027v.size()) {
                    j jVar = this.f4027v.get(i11);
                    for (int i13 = 0; i13 < this.D.length; i13++) {
                        int g10 = jVar.g(i13);
                        c cVar = this.D[i13];
                        if (cVar.f17586q + cVar.f17588s <= g10) {
                        }
                    }
                    z10 = true;
                } else if (this.f4027v.get(i12).f3977n) {
                    break;
                } else {
                    i12++;
                }
            }
            z10 = false;
            if (z10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j10 = z().f1867h;
        j jVar2 = this.f4027v.get(i11);
        ArrayList<j> arrayList = this.f4027v;
        e0.N(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.D.length; i14++) {
            this.D[i14].j(jVar2.g(i14));
        }
        if (this.f4027v.isEmpty()) {
            this.Y = this.X;
        } else {
            ((j) m0.K(this.f4027v)).J = true;
        }
        this.f4013b0 = false;
        w.a aVar = this.f4025s;
        aVar.p(new q(1, this.I, null, 3, null, aVar.a(jVar2.f1866g), aVar.a(j10)));
    }

    public final j z() {
        return this.f4027v.get(r0.size() - 1);
    }
}
