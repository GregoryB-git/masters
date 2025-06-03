package q0;

import B0.g;
import F0.C0365j;
import F0.InterfaceC0373s;
import X2.AbstractC0703v;
import android.net.Uri;
import d0.C1190m;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.E;
import g0.G;
import g0.z;
import i0.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.y1;
import q0.f;
import r0.f;

/* loaded from: classes.dex */
public final class j extends y0.m {

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicInteger f18658N = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f18659A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f18660B;

    /* renamed from: C, reason: collision with root package name */
    public final y1 f18661C;

    /* renamed from: D, reason: collision with root package name */
    public final long f18662D;

    /* renamed from: E, reason: collision with root package name */
    public k f18663E;

    /* renamed from: F, reason: collision with root package name */
    public s f18664F;

    /* renamed from: G, reason: collision with root package name */
    public int f18665G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18666H;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f18667I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f18668J;

    /* renamed from: K, reason: collision with root package name */
    public AbstractC0703v f18669K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f18670L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f18671M;

    /* renamed from: k, reason: collision with root package name */
    public final int f18672k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18673l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f18674m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18675n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18676o;

    /* renamed from: p, reason: collision with root package name */
    public final i0.g f18677p;

    /* renamed from: q, reason: collision with root package name */
    public final i0.k f18678q;

    /* renamed from: r, reason: collision with root package name */
    public final k f18679r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f18680s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18681t;

    /* renamed from: u, reason: collision with root package name */
    public final E f18682u;

    /* renamed from: v, reason: collision with root package name */
    public final h f18683v;

    /* renamed from: w, reason: collision with root package name */
    public final List f18684w;

    /* renamed from: x, reason: collision with root package name */
    public final C1190m f18685x;

    /* renamed from: y, reason: collision with root package name */
    public final T0.h f18686y;

    /* renamed from: z, reason: collision with root package name */
    public final z f18687z;

    public j(h hVar, i0.g gVar, i0.k kVar, C1194q c1194q, boolean z7, i0.g gVar2, i0.k kVar2, boolean z8, Uri uri, List list, int i7, Object obj, long j7, long j8, long j9, int i8, boolean z9, int i9, boolean z10, boolean z11, E e7, long j10, C1190m c1190m, k kVar3, T0.h hVar2, z zVar, boolean z12, y1 y1Var) {
        super(gVar, kVar, c1194q, i7, obj, j7, j8, j9);
        this.f18659A = z7;
        this.f18676o = i8;
        this.f18671M = z9;
        this.f18673l = i9;
        this.f18678q = kVar2;
        this.f18677p = gVar2;
        this.f18666H = kVar2 != null;
        this.f18660B = z8;
        this.f18674m = uri;
        this.f18680s = z11;
        this.f18682u = e7;
        this.f18662D = j10;
        this.f18681t = z10;
        this.f18683v = hVar;
        this.f18684w = list;
        this.f18685x = c1190m;
        this.f18679r = kVar3;
        this.f18686y = hVar2;
        this.f18687z = zVar;
        this.f18675n = z12;
        this.f18661C = y1Var;
        this.f18669K = AbstractC0703v.Y();
        this.f18672k = f18658N.getAndIncrement();
    }

    public static i0.g i(i0.g gVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return gVar;
        }
        AbstractC1297a.e(bArr2);
        return new C1880a(gVar, bArr, bArr2);
    }

    public static j j(h hVar, i0.g gVar, C1194q c1194q, long j7, r0.f fVar, f.e eVar, Uri uri, List list, int i7, Object obj, boolean z7, v vVar, long j8, j jVar, byte[] bArr, byte[] bArr2, boolean z8, y1 y1Var, g.a aVar) {
        i0.k kVar;
        i0.g gVar2;
        boolean z9;
        T0.h hVar2;
        z zVar;
        k kVar2;
        f.e eVar2 = eVar.f18651a;
        i0.k a7 = new k.b().i(G.f(fVar.f19013a, eVar2.f18976o)).h(eVar2.f18984w).g(eVar2.f18985x).b(eVar.f18654d ? 8 : 0).a();
        boolean z10 = bArr != null;
        i0.g i8 = i(gVar, bArr, z10 ? l((String) AbstractC1297a.e(eVar2.f18983v)) : null);
        f.d dVar = eVar2.f18977p;
        if (dVar != null) {
            boolean z11 = bArr2 != null;
            byte[] l7 = z11 ? l((String) AbstractC1297a.e(dVar.f18983v)) : null;
            kVar = new k.b().i(G.f(fVar.f19013a, dVar.f18976o)).h(dVar.f18984w).g(dVar.f18985x).a();
            z9 = z11;
            gVar2 = i(gVar, bArr2, l7);
        } else {
            kVar = null;
            gVar2 = null;
            z9 = false;
        }
        long j9 = j7 + eVar2.f18980s;
        long j10 = j9 + eVar2.f18978q;
        int i9 = fVar.f18956j + eVar2.f18979r;
        if (jVar != null) {
            i0.k kVar3 = jVar.f18678q;
            boolean z12 = kVar == kVar3 || (kVar != null && kVar3 != null && kVar.f14652a.equals(kVar3.f14652a) && kVar.f14658g == jVar.f18678q.f14658g);
            boolean z13 = uri.equals(jVar.f18674m) && jVar.f18668J;
            T0.h hVar3 = jVar.f18686y;
            z zVar2 = jVar.f18687z;
            kVar2 = (z12 && z13 && !jVar.f18670L && jVar.f18673l == i9) ? jVar.f18663E : null;
            hVar2 = hVar3;
            zVar = zVar2;
        } else {
            hVar2 = new T0.h();
            zVar = new z(10);
            kVar2 = null;
        }
        return new j(hVar, i8, a7, c1194q, z10, gVar2, kVar, z9, uri, list, i7, obj, j9, j10, eVar.f18652b, eVar.f18653c, !eVar.f18654d, i9, eVar2.f18986y, z7, vVar.a(i9), j8, eVar2.f18981t, kVar2, hVar2, zVar, z8, y1Var);
    }

    public static byte[] l(String str) {
        if (W2.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean p(f.e eVar, r0.f fVar) {
        f.e eVar2 = eVar.f18651a;
        return eVar2 instanceof f.b ? ((f.b) eVar2).f18970z || (eVar.f18653c == 0 && fVar.f19015c) : fVar.f19015c;
    }

    public static boolean w(j jVar, Uri uri, r0.f fVar, f.e eVar, long j7) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f18674m) && jVar.f18668J) {
            return false;
        }
        return !p(eVar, fVar) || j7 + eVar.f18651a.f18980s < jVar.f21259h;
    }

    @Override // B0.n.e
    public void b() {
        k kVar;
        AbstractC1297a.e(this.f18664F);
        if (this.f18663E == null && (kVar = this.f18679r) != null && kVar.e()) {
            this.f18663E = this.f18679r;
            this.f18666H = false;
        }
        s();
        if (this.f18667I) {
            return;
        }
        if (!this.f18681t) {
            r();
        }
        this.f18668J = !this.f18667I;
    }

    @Override // B0.n.e
    public void c() {
        this.f18667I = true;
    }

    @Override // y0.m
    public boolean h() {
        return this.f18668J;
    }

    public final void k(i0.g gVar, i0.k kVar, boolean z7, boolean z8) {
        i0.k e7;
        long p7;
        long j7;
        if (z7) {
            r0 = this.f18665G != 0;
            e7 = kVar;
        } else {
            e7 = kVar.e(this.f18665G);
        }
        try {
            C0365j u7 = u(gVar, e7, z8);
            if (r0) {
                u7.i(this.f18665G);
            }
            while (!this.f18667I && this.f18663E.c(u7)) {
                try {
                    try {
                    } catch (EOFException e8) {
                        if ((this.f21255d.f12718f & 16384) == 0) {
                            throw e8;
                        }
                        this.f18663E.d();
                        p7 = u7.p();
                        j7 = kVar.f14658g;
                    }
                } catch (Throwable th) {
                    this.f18665G = (int) (u7.p() - kVar.f14658g);
                    throw th;
                }
            }
            p7 = u7.p();
            j7 = kVar.f14658g;
            this.f18665G = (int) (p7 - j7);
        } finally {
            i0.j.a(gVar);
        }
    }

    public int m(int i7) {
        AbstractC1297a.f(!this.f18675n);
        if (i7 >= this.f18669K.size()) {
            return 0;
        }
        return ((Integer) this.f18669K.get(i7)).intValue();
    }

    public void n(s sVar, AbstractC0703v abstractC0703v) {
        this.f18664F = sVar;
        this.f18669K = abstractC0703v;
    }

    public void o() {
        this.f18670L = true;
    }

    public boolean q() {
        return this.f18671M;
    }

    public final void r() {
        k(this.f21260i, this.f21253b, this.f18659A, true);
    }

    public final void s() {
        if (this.f18666H) {
            AbstractC1297a.e(this.f18677p);
            AbstractC1297a.e(this.f18678q);
            k(this.f18677p, this.f18678q, this.f18660B, false);
            this.f18665G = 0;
            this.f18666H = false;
        }
    }

    public final long t(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.h();
        try {
            this.f18687z.P(10);
            interfaceC0373s.n(this.f18687z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f18687z.J() != 4801587) {
            return -9223372036854775807L;
        }
        this.f18687z.U(3);
        int F6 = this.f18687z.F();
        int i7 = F6 + 10;
        if (i7 > this.f18687z.b()) {
            byte[] e7 = this.f18687z.e();
            this.f18687z.P(i7);
            System.arraycopy(e7, 0, this.f18687z.e(), 0, 10);
        }
        interfaceC0373s.n(this.f18687z.e(), 10, F6);
        C1201x e8 = this.f18686y.e(this.f18687z.e(), F6);
        if (e8 == null) {
            return -9223372036854775807L;
        }
        int e9 = e8.e();
        for (int i8 = 0; i8 < e9; i8++) {
            C1201x.b d7 = e8.d(i8);
            if (d7 instanceof T0.m) {
                T0.m mVar = (T0.m) d7;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f6052p)) {
                    System.arraycopy(mVar.f6053q, 0, this.f18687z.e(), 0, 8);
                    this.f18687z.T(0);
                    this.f18687z.S(8);
                    return this.f18687z.z() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final C0365j u(i0.g gVar, i0.k kVar, boolean z7) {
        s sVar;
        long j7;
        long e7 = gVar.e(kVar);
        if (z7) {
            try {
                this.f18682u.j(this.f18680s, this.f21258g, this.f18662D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e8) {
                throw new IOException(e8);
            }
        }
        C0365j c0365j = new C0365j(gVar, kVar.f14658g, e7);
        if (this.f18663E == null) {
            long t7 = t(c0365j);
            c0365j.h();
            k kVar2 = this.f18679r;
            k f7 = kVar2 != null ? kVar2.f() : this.f18683v.c(kVar.f14652a, this.f21255d, this.f18684w, this.f18682u, gVar.g(), c0365j, this.f18661C);
            this.f18663E = f7;
            if (f7.a()) {
                sVar = this.f18664F;
                j7 = t7 != -9223372036854775807L ? this.f18682u.b(t7) : this.f21258g;
            } else {
                sVar = this.f18664F;
                j7 = 0;
            }
            sVar.p0(j7);
            this.f18664F.b0();
            this.f18663E.b(this.f18664F);
        }
        this.f18664F.m0(this.f18685x);
        return c0365j;
    }

    public void v() {
        this.f18671M = true;
    }
}
