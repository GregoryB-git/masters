package z4;

import a4.g;
import android.net.Uri;
import android.os.Handler;
import c4.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p4.a;
import t5.d0;
import v3.a1;
import v3.i0;
import v3.n1;
import z4.b0;
import z4.m;
import z4.r;
import z4.w;

/* loaded from: classes.dex */
public final class y implements r, c4.j, d0.a<a>, d0.e, b0.c {
    public static final Map<String, String> U;
    public static final v3.i0 V;
    public boolean C;
    public boolean D;
    public boolean E;
    public e F;
    public c4.t G;
    public boolean I;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public long O;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f17746a;

    /* renamed from: b, reason: collision with root package name */
    public final t5.k f17747b;

    /* renamed from: c, reason: collision with root package name */
    public final a4.h f17748c;

    /* renamed from: d, reason: collision with root package name */
    public final t5.c0 f17749d;

    /* renamed from: e, reason: collision with root package name */
    public final w.a f17750e;
    public final g.a f;

    /* renamed from: o, reason: collision with root package name */
    public final b f17751o;

    /* renamed from: p, reason: collision with root package name */
    public final t5.b f17752p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17753q;

    /* renamed from: r, reason: collision with root package name */
    public final long f17754r;
    public final x t;

    /* renamed from: y, reason: collision with root package name */
    public r.a f17760y;

    /* renamed from: z, reason: collision with root package name */
    public t4.b f17761z;

    /* renamed from: s, reason: collision with root package name */
    public final t5.d0 f17755s = new t5.d0("ProgressiveMediaPeriod");

    /* renamed from: u, reason: collision with root package name */
    public final b5.g f17756u = new b5.g(1);

    /* renamed from: v, reason: collision with root package name */
    public final u.a f17757v = new u.a(this, 9);

    /* renamed from: w, reason: collision with root package name */
    public final b.d f17758w = new b.d(this, 10);

    /* renamed from: x, reason: collision with root package name */
    public final Handler f17759x = v5.e0.l(null);
    public d[] B = new d[0];
    public b0[] A = new b0[0];
    public long P = -9223372036854775807L;
    public long H = -9223372036854775807L;
    public int J = 1;

    public final class a implements d0.d, m.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f17763b;

        /* renamed from: c, reason: collision with root package name */
        public final t5.j0 f17764c;

        /* renamed from: d, reason: collision with root package name */
        public final x f17765d;

        /* renamed from: e, reason: collision with root package name */
        public final c4.j f17766e;
        public final b5.g f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f17768h;

        /* renamed from: j, reason: collision with root package name */
        public long f17770j;

        /* renamed from: l, reason: collision with root package name */
        public b0 f17772l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f17773m;

        /* renamed from: g, reason: collision with root package name */
        public final c4.s f17767g = new c4.s();

        /* renamed from: i, reason: collision with root package name */
        public boolean f17769i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f17762a = n.f17701b.getAndIncrement();

        /* renamed from: k, reason: collision with root package name */
        public t5.n f17771k = c(0);

        public a(Uri uri, t5.k kVar, x xVar, c4.j jVar, b5.g gVar) {
            this.f17763b = uri;
            this.f17764c = new t5.j0(kVar);
            this.f17765d = xVar;
            this.f17766e = jVar;
            this.f = gVar;
        }

        @Override // t5.d0.d
        public final void a() {
            t5.k kVar;
            int i10;
            int i11 = 0;
            while (i11 == 0 && !this.f17768h) {
                try {
                    long j10 = this.f17767g.f2313a;
                    t5.n c10 = c(j10);
                    this.f17771k = c10;
                    long a10 = this.f17764c.a(c10);
                    if (a10 != -1) {
                        a10 += j10;
                        y yVar = y.this;
                        yVar.f17759x.post(new b.k(yVar, 9));
                    }
                    long j11 = a10;
                    y.this.f17761z = t4.b.a(this.f17764c.h());
                    t5.j0 j0Var = this.f17764c;
                    t4.b bVar = y.this.f17761z;
                    if (bVar == null || (i10 = bVar.f) == -1) {
                        kVar = j0Var;
                    } else {
                        kVar = new m(j0Var, i10, this);
                        y yVar2 = y.this;
                        yVar2.getClass();
                        b0 B = yVar2.B(new d(0, true));
                        this.f17772l = B;
                        B.d(y.V);
                    }
                    long j12 = j10;
                    ((r3.a0) this.f17765d).i(kVar, this.f17763b, this.f17764c.h(), j10, j11, this.f17766e);
                    if (y.this.f17761z != null) {
                        Object obj = ((r3.a0) this.f17765d).f13550b;
                        if (((c4.h) obj) instanceof j4.d) {
                            ((j4.d) ((c4.h) obj)).f8407r = true;
                        }
                    }
                    if (this.f17769i) {
                        x xVar = this.f17765d;
                        long j13 = this.f17770j;
                        c4.h hVar = (c4.h) ((r3.a0) xVar).f13550b;
                        hVar.getClass();
                        hVar.f(j12, j13);
                        this.f17769i = false;
                    }
                    while (true) {
                        long j14 = j12;
                        while (i11 == 0 && !this.f17768h) {
                            try {
                                b5.g gVar = this.f;
                                synchronized (gVar) {
                                    while (!gVar.f1869a) {
                                        gVar.wait();
                                    }
                                }
                                x xVar2 = this.f17765d;
                                c4.s sVar = this.f17767g;
                                r3.a0 a0Var = (r3.a0) xVar2;
                                c4.h hVar2 = (c4.h) a0Var.f13550b;
                                hVar2.getClass();
                                c4.i iVar = (c4.i) a0Var.f13551c;
                                iVar.getClass();
                                i11 = hVar2.d(iVar, sVar);
                                j12 = ((r3.a0) this.f17765d).a();
                                if (j12 > y.this.f17754r + j14) {
                                    b5.g gVar2 = this.f;
                                    synchronized (gVar2) {
                                        gVar2.f1869a = false;
                                    }
                                    y yVar3 = y.this;
                                    yVar3.f17759x.post(yVar3.f17758w);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (((r3.a0) this.f17765d).a() != -1) {
                        this.f17767g.f2313a = ((r3.a0) this.f17765d).a();
                    }
                    b.z.d(this.f17764c);
                } catch (Throwable th) {
                    if (i11 != 1 && ((r3.a0) this.f17765d).a() != -1) {
                        this.f17767g.f2313a = ((r3.a0) this.f17765d).a();
                    }
                    b.z.d(this.f17764c);
                    throw th;
                }
            }
        }

        @Override // t5.d0.d
        public final void b() {
            this.f17768h = true;
        }

        public final t5.n c(long j10) {
            Collections.emptyMap();
            Uri uri = this.f17763b;
            String str = y.this.f17753q;
            Map<String, String> map = y.U;
            if (uri != null) {
                return new t5.n(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }

    public interface b {
    }

    public final class c implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f17775a;

        public c(int i10) {
            this.f17775a = i10;
        }

        @Override // z4.c0
        public final void a() {
            y yVar = y.this;
            yVar.A[this.f17775a].s();
            t5.d0 d0Var = yVar.f17755s;
            int b10 = ((t5.u) yVar.f17749d).b(yVar.J);
            IOException iOException = d0Var.f14471c;
            if (iOException != null) {
                throw iOException;
            }
            d0.c<? extends d0.d> cVar = d0Var.f14470b;
            if (cVar != null) {
                if (b10 == Integer.MIN_VALUE) {
                    b10 = cVar.f14474a;
                }
                IOException iOException2 = cVar.f14478e;
                if (iOException2 != null && cVar.f > b10) {
                    throw iOException2;
                }
            }
        }

        @Override // z4.c0
        public final boolean b() {
            y yVar = y.this;
            return !yVar.D() && yVar.A[this.f17775a].q(yVar.S);
        }

        @Override // z4.c0
        public final int m(long j10) {
            y yVar = y.this;
            int i10 = this.f17775a;
            if (yVar.D()) {
                return 0;
            }
            yVar.z(i10);
            b0 b0Var = yVar.A[i10];
            int o10 = b0Var.o(j10, yVar.S);
            b0Var.y(o10);
            if (o10 != 0) {
                return o10;
            }
            yVar.A(i10);
            return o10;
        }

        @Override // z4.c0
        public final int r(l3.l lVar, z3.g gVar, int i10) {
            y yVar = y.this;
            int i11 = this.f17775a;
            if (yVar.D()) {
                return -3;
            }
            yVar.z(i11);
            int u10 = yVar.A[i11].u(lVar, gVar, i10, yVar.S);
            if (u10 == -3) {
                yVar.A(i11);
            }
            return u10;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f17777a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17778b;

        public d(int i10, boolean z10) {
            this.f17777a = i10;
            this.f17778b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f17777a == dVar.f17777a && this.f17778b == dVar.f17778b;
        }

        public final int hashCode() {
            return (this.f17777a * 31) + (this.f17778b ? 1 : 0);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final j0 f17779a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f17780b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f17781c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f17782d;

        public e(j0 j0Var, boolean[] zArr) {
            this.f17779a = j0Var;
            this.f17780b = zArr;
            int i10 = j0Var.f17691a;
            this.f17781c = new boolean[i10];
            this.f17782d = new boolean[i10];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        U = Collections.unmodifiableMap(hashMap);
        i0.a aVar = new i0.a();
        aVar.f15463a = "icy";
        aVar.f15472k = "application/x-icy";
        V = aVar.a();
    }

    public y(Uri uri, t5.k kVar, r3.a0 a0Var, a4.h hVar, g.a aVar, t5.c0 c0Var, w.a aVar2, b bVar, t5.b bVar2, String str, int i10) {
        this.f17746a = uri;
        this.f17747b = kVar;
        this.f17748c = hVar;
        this.f = aVar;
        this.f17749d = c0Var;
        this.f17750e = aVar2;
        this.f17751o = bVar;
        this.f17752p = bVar2;
        this.f17753q = str;
        this.f17754r = i10;
        this.t = a0Var;
    }

    public final void A(int i10) {
        b();
        boolean[] zArr = this.F.f17780b;
        if (this.Q && zArr[i10] && !this.A[i10].q(false)) {
            this.P = 0L;
            this.Q = false;
            this.L = true;
            this.O = 0L;
            this.R = 0;
            for (b0 b0Var : this.A) {
                b0Var.v(false);
            }
            r.a aVar = this.f17760y;
            aVar.getClass();
            aVar.a(this);
        }
    }

    public final b0 B(d dVar) {
        int length = this.A.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.B[i10])) {
                return this.A[i10];
            }
        }
        t5.b bVar = this.f17752p;
        a4.h hVar = this.f17748c;
        g.a aVar = this.f;
        hVar.getClass();
        aVar.getClass();
        b0 b0Var = new b0(bVar, hVar, aVar);
        b0Var.f = this;
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.B, i11);
        dVarArr[length] = dVar;
        this.B = dVarArr;
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.A, i11);
        b0VarArr[length] = b0Var;
        this.A = b0VarArr;
        return b0Var;
    }

    public final void C() {
        a aVar = new a(this.f17746a, this.f17747b, this.t, this, this.f17756u);
        if (this.D) {
            x6.b.H(x());
            long j10 = this.H;
            if (j10 != -9223372036854775807L && this.P > j10) {
                this.S = true;
                this.P = -9223372036854775807L;
                return;
            }
            c4.t tVar = this.G;
            tVar.getClass();
            long j11 = tVar.g(this.P).f2314a.f2320b;
            long j12 = this.P;
            aVar.f17767g.f2313a = j11;
            aVar.f17770j = j12;
            aVar.f17769i = true;
            aVar.f17773m = false;
            for (b0 b0Var : this.A) {
                b0Var.t = this.P;
            }
            this.P = -9223372036854775807L;
        }
        this.R = v();
        this.f17750e.n(new n(aVar.f17762a, aVar.f17771k, this.f17755s.f(aVar, this, ((t5.u) this.f17749d).b(this.J))), 1, -1, null, 0, null, aVar.f17770j, this.H);
    }

    public final boolean D() {
        return this.L || x();
    }

    @Override // z4.b0.c
    public final void a() {
        this.f17759x.post(this.f17757v);
    }

    public final void b() {
        x6.b.H(this.D);
        this.F.getClass();
        this.G.getClass();
    }

    @Override // z4.r, z4.d0
    public final long c() {
        return g();
    }

    @Override // z4.r, z4.d0
    public final boolean d(long j10) {
        if (this.S || this.f17755s.c() || this.Q) {
            return false;
        }
        if (this.D && this.M == 0) {
            return false;
        }
        boolean a10 = this.f17756u.a();
        if (this.f17755s.d()) {
            return a10;
        }
        C();
        return true;
    }

    @Override // z4.r
    public final long e(long j10, n1 n1Var) {
        b();
        if (!this.G.e()) {
            return 0L;
        }
        t.a g10 = this.G.g(j10);
        return n1Var.a(j10, g10.f2314a.f2319a, g10.f2315b.f2319a);
    }

    @Override // t5.d0.e
    public final void f() {
        for (b0 b0Var : this.A) {
            b0Var.v(true);
            a4.e eVar = b0Var.f17577h;
            if (eVar != null) {
                eVar.f(b0Var.f17575e);
                b0Var.f17577h = null;
                b0Var.f17576g = null;
            }
        }
        r3.a0 a0Var = (r3.a0) this.t;
        c4.h hVar = (c4.h) a0Var.f13550b;
        if (hVar != null) {
            hVar.release();
            a0Var.f13550b = null;
        }
        a0Var.f13551c = null;
    }

    @Override // z4.r, z4.d0
    public final long g() {
        long j10;
        boolean z10;
        long j11;
        b();
        if (this.S || this.M == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.P;
        }
        if (this.E) {
            int length = this.A.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.F;
                if (eVar.f17780b[i10] && eVar.f17781c[i10]) {
                    b0 b0Var = this.A[i10];
                    synchronized (b0Var) {
                        z10 = b0Var.f17591w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        b0 b0Var2 = this.A[i10];
                        synchronized (b0Var2) {
                            j11 = b0Var2.f17590v;
                        }
                        j10 = Math.min(j10, j11);
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = w(false);
        }
        return j10 == Long.MIN_VALUE ? this.O : j10;
    }

    @Override // z4.r, z4.d0
    public final void h(long j10) {
    }

    @Override // z4.r
    public final long i(r5.h[] hVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        r5.h hVar;
        b();
        e eVar = this.F;
        j0 j0Var = eVar.f17779a;
        boolean[] zArr3 = eVar.f17781c;
        int i10 = this.M;
        int i11 = 0;
        for (int i12 = 0; i12 < hVarArr.length; i12++) {
            c0 c0Var = c0VarArr[i12];
            if (c0Var != null && (hVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) c0Var).f17775a;
                x6.b.H(zArr3[i13]);
                this.M--;
                zArr3[i13] = false;
                c0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.K ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < hVarArr.length; i14++) {
            if (c0VarArr[i14] == null && (hVar = hVarArr[i14]) != null) {
                x6.b.H(hVar.length() == 1);
                x6.b.H(hVar.c(0) == 0);
                int b10 = j0Var.b(hVar.a());
                x6.b.H(!zArr3[b10]);
                this.M++;
                zArr3[b10] = true;
                c0VarArr[i14] = new c(b10);
                zArr2[i14] = true;
                if (!z10) {
                    b0 b0Var = this.A[b10];
                    z10 = (b0Var.x(j10, true) || b0Var.f17586q + b0Var.f17588s == 0) ? false : true;
                }
            }
        }
        if (this.M == 0) {
            this.Q = false;
            this.L = false;
            if (this.f17755s.d()) {
                b0[] b0VarArr = this.A;
                int length = b0VarArr.length;
                while (i11 < length) {
                    b0VarArr[i11].h();
                    i11++;
                }
                this.f17755s.b();
            } else {
                for (b0 b0Var2 : this.A) {
                    b0Var2.v(false);
                }
            }
        } else if (z10) {
            j10 = l(j10);
            while (i11 < c0VarArr.length) {
                if (c0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.K = true;
        return j10;
    }

    @Override // z4.r, z4.d0
    public final boolean isLoading() {
        boolean z10;
        if (this.f17755s.d()) {
            b5.g gVar = this.f17756u;
            synchronized (gVar) {
                z10 = gVar.f1869a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // z4.r
    public final void j() {
        t5.d0 d0Var = this.f17755s;
        int b10 = ((t5.u) this.f17749d).b(this.J);
        IOException iOException = d0Var.f14471c;
        if (iOException != null) {
            throw iOException;
        }
        d0.c<? extends d0.d> cVar = d0Var.f14470b;
        if (cVar != null) {
            if (b10 == Integer.MIN_VALUE) {
                b10 = cVar.f14474a;
            }
            IOException iOException2 = cVar.f14478e;
            if (iOException2 != null && cVar.f > b10) {
                throw iOException2;
            }
        }
        if (this.S && !this.D) {
            throw a1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // t5.d0.a
    public final void k(a aVar, long j10, long j11, boolean z10) {
        a aVar2 = aVar;
        t5.j0 j0Var = aVar2.f17764c;
        Uri uri = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        this.f17749d.getClass();
        this.f17750e.e(nVar, 1, -1, null, 0, null, aVar2.f17770j, this.H);
        if (z10) {
            return;
        }
        for (b0 b0Var : this.A) {
            b0Var.v(false);
        }
        if (this.M > 0) {
            r.a aVar3 = this.f17760y;
            aVar3.getClass();
            aVar3.a(this);
        }
    }

    @Override // z4.r
    public final long l(long j10) {
        boolean z10;
        b();
        boolean[] zArr = this.F.f17780b;
        if (!this.G.e()) {
            j10 = 0;
        }
        this.L = false;
        this.O = j10;
        if (x()) {
            this.P = j10;
            return j10;
        }
        if (this.J != 7) {
            int length = this.A.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.A[i10].x(j10, false) && (zArr[i10] || !this.E)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return j10;
            }
        }
        this.Q = false;
        this.P = j10;
        this.S = false;
        if (this.f17755s.d()) {
            for (b0 b0Var : this.A) {
                b0Var.h();
            }
            this.f17755s.b();
        } else {
            this.f17755s.f14471c = null;
            for (b0 b0Var2 : this.A) {
                b0Var2.v(false);
            }
        }
        return j10;
    }

    @Override // c4.j
    public final void m() {
        this.C = true;
        this.f17759x.post(this.f17757v);
    }

    @Override // z4.r
    public final void n(r.a aVar, long j10) {
        this.f17760y = aVar;
        this.f17756u.a();
        C();
    }

    @Override // z4.r
    public final long o() {
        if (!this.L) {
            return -9223372036854775807L;
        }
        if (!this.S && v() <= this.R) {
            return -9223372036854775807L;
        }
        this.L = false;
        return this.O;
    }

    @Override // t5.d0.a
    public final void p(a aVar, long j10, long j11) {
        c4.t tVar;
        a aVar2 = aVar;
        if (this.H == -9223372036854775807L && (tVar = this.G) != null) {
            boolean e10 = tVar.e();
            long w10 = w(true);
            long j12 = w10 == Long.MIN_VALUE ? 0L : w10 + 10000;
            this.H = j12;
            ((z) this.f17751o).y(j12, e10, this.I);
        }
        t5.j0 j0Var = aVar2.f17764c;
        Uri uri = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        this.f17749d.getClass();
        this.f17750e.h(nVar, 1, -1, null, 0, null, aVar2.f17770j, this.H);
        this.S = true;
        r.a aVar3 = this.f17760y;
        aVar3.getClass();
        aVar3.a(this);
    }

    @Override // z4.r
    public final j0 q() {
        b();
        return this.F.f17779a;
    }

    @Override // c4.j
    public final c4.v r(int i10, int i11) {
        return B(new d(i10, false));
    }

    @Override // z4.r
    public final void s(long j10, boolean z10) {
        b();
        if (x()) {
            return;
        }
        boolean[] zArr = this.F.f17781c;
        int length = this.A.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A[i10].g(j10, z10, zArr[i10]);
        }
    }

    @Override // c4.j
    public final void t(c4.t tVar) {
        this.f17759x.post(new w.g(11, this, tVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    @Override // t5.d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t5.d0.b u(z4.y.a r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.y.u(t5.d0$d, long, long, java.io.IOException, int):t5.d0$b");
    }

    public final int v() {
        int i10 = 0;
        for (b0 b0Var : this.A) {
            i10 += b0Var.f17586q + b0Var.f17585p;
        }
        return i10;
    }

    public final long w(boolean z10) {
        long j10;
        long j11 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.A.length; i10++) {
            if (!z10) {
                e eVar = this.F;
                eVar.getClass();
                if (!eVar.f17781c[i10]) {
                    continue;
                }
            }
            b0 b0Var = this.A[i10];
            synchronized (b0Var) {
                j10 = b0Var.f17590v;
            }
            j11 = Math.max(j11, j10);
        }
        return j11;
    }

    public final boolean x() {
        return this.P != -9223372036854775807L;
    }

    public final void y() {
        p4.a aVar;
        if (this.T || this.D || !this.C || this.G == null) {
            return;
        }
        for (b0 b0Var : this.A) {
            if (b0Var.p() == null) {
                return;
            }
        }
        b5.g gVar = this.f17756u;
        synchronized (gVar) {
            gVar.f1869a = false;
        }
        int length = this.A.length;
        i0[] i0VarArr = new i0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            v3.i0 p10 = this.A[i10].p();
            p10.getClass();
            String str = p10.t;
            boolean k10 = v5.p.k(str);
            boolean z10 = k10 || v5.p.m(str);
            zArr[i10] = z10;
            this.E = z10 | this.E;
            t4.b bVar = this.f17761z;
            if (bVar != null) {
                if (k10 || this.B[i10].f17778b) {
                    p4.a aVar2 = p10.f15455r;
                    if (aVar2 == null) {
                        aVar = new p4.a(bVar);
                    } else {
                        long j10 = aVar2.f12997b;
                        a.b[] bVarArr = aVar2.f12996a;
                        int i11 = v5.e0.f15881a;
                        Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        System.arraycopy(new a.b[]{bVar}, 0, copyOf, bVarArr.length, 1);
                        aVar = new p4.a(j10, (a.b[]) copyOf);
                    }
                    i0.a aVar3 = new i0.a(p10);
                    aVar3.f15470i = aVar;
                    p10 = new v3.i0(aVar3);
                }
                if (k10 && p10.f == -1 && p10.f15452o == -1 && bVar.f14437a != -1) {
                    i0.a aVar4 = new i0.a(p10);
                    aVar4.f = bVar.f14437a;
                    p10 = new v3.i0(aVar4);
                }
            }
            i0VarArr[i10] = new i0(Integer.toString(i10), p10.b(this.f17748c.e(p10)));
        }
        this.F = new e(new j0(i0VarArr), zArr);
        this.D = true;
        r.a aVar5 = this.f17760y;
        aVar5.getClass();
        aVar5.b(this);
    }

    public final void z(int i10) {
        b();
        e eVar = this.F;
        boolean[] zArr = eVar.f17782d;
        if (zArr[i10]) {
            return;
        }
        v3.i0 i0Var = eVar.f17779a.a(i10).f17687d[0];
        this.f17750e.b(v5.p.i(i0Var.t), i0Var, 0, null, this.O);
        zArr[i10] = true;
    }
}
