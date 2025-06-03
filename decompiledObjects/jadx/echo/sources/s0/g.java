package s0;

import android.graphics.Bitmap;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.F;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import k0.AbstractC1425n;
import k0.C1441v0;
import k0.Z0;
import s0.InterfaceC1935c;

/* loaded from: classes.dex */
public class g extends AbstractC1425n {

    /* renamed from: F, reason: collision with root package name */
    public final InterfaceC1935c.a f19153F;

    /* renamed from: G, reason: collision with root package name */
    public final i f19154G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayDeque f19155H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f19156I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f19157J;

    /* renamed from: K, reason: collision with root package name */
    public a f19158K;

    /* renamed from: L, reason: collision with root package name */
    public long f19159L;

    /* renamed from: M, reason: collision with root package name */
    public long f19160M;

    /* renamed from: N, reason: collision with root package name */
    public int f19161N;

    /* renamed from: O, reason: collision with root package name */
    public int f19162O;

    /* renamed from: P, reason: collision with root package name */
    public C1194q f19163P;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC1935c f19164Q;

    /* renamed from: R, reason: collision with root package name */
    public i f19165R;

    /* renamed from: S, reason: collision with root package name */
    public e f19166S;

    /* renamed from: T, reason: collision with root package name */
    public Bitmap f19167T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f19168U;

    /* renamed from: V, reason: collision with root package name */
    public b f19169V;

    /* renamed from: W, reason: collision with root package name */
    public b f19170W;

    /* renamed from: X, reason: collision with root package name */
    public int f19171X;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f19172c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f19173a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19174b;

        public a(long j7, long j8) {
            this.f19173a = j7;
            this.f19174b = j8;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19175a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19176b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f19177c;

        public b(int i7, long j7) {
            this.f19175a = i7;
            this.f19176b = j7;
        }

        public long a() {
            return this.f19176b;
        }

        public Bitmap b() {
            return this.f19177c;
        }

        public int c() {
            return this.f19175a;
        }

        public boolean d() {
            return this.f19177c != null;
        }

        public void e(Bitmap bitmap) {
            this.f19177c = bitmap;
        }
    }

    public g(InterfaceC1935c.a aVar, e eVar) {
        super(4);
        this.f19153F = aVar;
        this.f19166S = l0(eVar);
        this.f19154G = i.F();
        this.f19158K = a.f19172c;
        this.f19155H = new ArrayDeque();
        this.f19160M = -9223372036854775807L;
        this.f19159L = -9223372036854775807L;
        this.f19161N = 0;
        this.f19162O = 1;
    }

    public static e l0(e eVar) {
        return eVar == null ? e.f19151a : eVar;
    }

    private void q0(long j7) {
        this.f19159L = j7;
        while (!this.f19155H.isEmpty() && j7 >= ((a) this.f19155H.peek()).f19173a) {
            this.f19158K = (a) this.f19155H.removeFirst();
        }
    }

    @Override // k0.AbstractC1425n
    public void T() {
        this.f19163P = null;
        this.f19158K = a.f19172c;
        this.f19155H.clear();
        s0();
        this.f19166S.b();
    }

    @Override // k0.AbstractC1425n
    public void U(boolean z7, boolean z8) {
        this.f19162O = z8 ? 1 : 0;
    }

    @Override // k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        o0(1);
        this.f19157J = false;
        this.f19156I = false;
        this.f19167T = null;
        this.f19169V = null;
        this.f19170W = null;
        this.f19168U = false;
        this.f19165R = null;
        InterfaceC1935c interfaceC1935c = this.f19164Q;
        if (interfaceC1935c != null) {
            interfaceC1935c.flush();
        }
        this.f19155H.clear();
    }

    @Override // k0.AbstractC1425n
    public void X() {
        s0();
    }

    @Override // k0.AbstractC1425n
    public void Z() {
        s0();
        o0(1);
    }

    @Override // k0.a1
    public int a(C1194q c1194q) {
        return this.f19153F.a(c1194q);
    }

    @Override // k0.Y0
    public boolean c() {
        return this.f19157J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // k0.AbstractC1425n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c0(d0.C1194q[] r5, long r6, long r8, x0.InterfaceC2142x.b r10) {
        /*
            r4 = this;
            super.c0(r5, r6, r8, r10)
            s0.g$a r5 = r4.f19158K
            long r5 = r5.f19174b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque r5 = r4.f19155H
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f19160M
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f19159L
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque r5 = r4.f19155H
            s0.g$a r6 = new s0.g$a
            long r0 = r4.f19160M
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            s0.g$a r5 = new s0.g$a
            r5.<init>(r0, r8)
            r4.f19158K = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.c0(d0.q[], long, long, x0.x$b):void");
    }

    @Override // k0.Y0, k0.a1
    public String d() {
        return "ImageRenderer";
    }

    @Override // k0.Y0
    public boolean e() {
        int i7 = this.f19162O;
        return i7 == 3 || (i7 == 0 && this.f19168U);
    }

    @Override // k0.Y0
    public void f(long j7, long j8) {
        if (this.f19157J) {
            return;
        }
        if (this.f19163P == null) {
            C1441v0 N6 = N();
            this.f19154G.m();
            int e02 = e0(N6, this.f19154G, 2);
            if (e02 != -5) {
                if (e02 == -4) {
                    AbstractC1297a.f(this.f19154G.p());
                    this.f19156I = true;
                    this.f19157J = true;
                    return;
                }
                return;
            }
            this.f19163P = (C1194q) AbstractC1297a.h(N6.f16024b);
            m0();
        }
        try {
            F.a("drainAndFeedDecoder");
            while (j0(j7, j8)) {
            }
            while (k0(j7)) {
            }
            F.b();
        } catch (d e7) {
            throw J(e7, null, 4003);
        }
    }

    public final boolean h0(C1194q c1194q) {
        int a7 = this.f19153F.a(c1194q);
        return a7 == Z0.a(4) || a7 == Z0.a(3);
    }

    public final Bitmap i0(int i7) {
        AbstractC1297a.h(this.f19167T);
        int width = this.f19167T.getWidth() / ((C1194q) AbstractC1297a.h(this.f19163P)).f12709I;
        int height = this.f19167T.getHeight() / ((C1194q) AbstractC1297a.h(this.f19163P)).f12710J;
        int i8 = this.f19163P.f12709I;
        return Bitmap.createBitmap(this.f19167T, (i7 % i8) * width, (i7 / i8) * height, width, height);
    }

    public final boolean j0(long j7, long j8) {
        if (this.f19167T != null && this.f19169V == null) {
            return false;
        }
        if (this.f19162O == 0 && getState() != 2) {
            return false;
        }
        if (this.f19167T == null) {
            AbstractC1297a.h(this.f19164Q);
            f a7 = this.f19164Q.a();
            if (a7 == null) {
                return false;
            }
            if (((f) AbstractC1297a.h(a7)).p()) {
                if (this.f19161N == 3) {
                    s0();
                    AbstractC1297a.h(this.f19163P);
                    m0();
                } else {
                    ((f) AbstractC1297a.h(a7)).x();
                    if (this.f19155H.isEmpty()) {
                        this.f19157J = true;
                    }
                }
                return false;
            }
            AbstractC1297a.i(a7.f19152s, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f19167T = a7.f19152s;
            ((f) AbstractC1297a.h(a7)).x();
        }
        if (!this.f19168U || this.f19167T == null || this.f19169V == null) {
            return false;
        }
        AbstractC1297a.h(this.f19163P);
        C1194q c1194q = this.f19163P;
        int i7 = c1194q.f12709I;
        boolean z7 = ((i7 == 1 && c1194q.f12710J == 1) || i7 == -1 || c1194q.f12710J == -1) ? false : true;
        if (!this.f19169V.d()) {
            b bVar = this.f19169V;
            bVar.e(z7 ? i0(bVar.c()) : (Bitmap) AbstractC1297a.h(this.f19167T));
        }
        if (!r0(j7, j8, (Bitmap) AbstractC1297a.h(this.f19169V.b()), this.f19169V.a())) {
            return false;
        }
        q0(((b) AbstractC1297a.h(this.f19169V)).a());
        this.f19162O = 3;
        if (!z7 || ((b) AbstractC1297a.h(this.f19169V)).c() == (((C1194q) AbstractC1297a.h(this.f19163P)).f12710J * ((C1194q) AbstractC1297a.h(this.f19163P)).f12709I) - 1) {
            this.f19167T = null;
        }
        this.f19169V = this.f19170W;
        this.f19170W = null;
        return true;
    }

    public final boolean k0(long j7) {
        if (this.f19168U && this.f19169V != null) {
            return false;
        }
        C1441v0 N6 = N();
        InterfaceC1935c interfaceC1935c = this.f19164Q;
        if (interfaceC1935c == null || this.f19161N == 3 || this.f19156I) {
            return false;
        }
        if (this.f19165R == null) {
            i iVar = (i) interfaceC1935c.f();
            this.f19165R = iVar;
            if (iVar == null) {
                return false;
            }
        }
        if (this.f19161N == 2) {
            AbstractC1297a.h(this.f19165R);
            this.f19165R.w(4);
            ((InterfaceC1935c) AbstractC1297a.h(this.f19164Q)).b(this.f19165R);
            this.f19165R = null;
            this.f19161N = 3;
            return false;
        }
        int e02 = e0(N6, this.f19165R, 0);
        if (e02 == -5) {
            this.f19163P = (C1194q) AbstractC1297a.h(N6.f16024b);
            this.f19161N = 2;
            return true;
        }
        if (e02 != -4) {
            if (e02 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f19165R.C();
        boolean z7 = ((ByteBuffer) AbstractC1297a.h(this.f19165R.f15400r)).remaining() > 0 || ((i) AbstractC1297a.h(this.f19165R)).p();
        if (z7) {
            ((InterfaceC1935c) AbstractC1297a.h(this.f19164Q)).b((i) AbstractC1297a.h(this.f19165R));
            this.f19171X = 0;
        }
        p0(j7, (i) AbstractC1297a.h(this.f19165R));
        if (((i) AbstractC1297a.h(this.f19165R)).p()) {
            this.f19156I = true;
            this.f19165R = null;
            return false;
        }
        this.f19160M = Math.max(this.f19160M, ((i) AbstractC1297a.h(this.f19165R)).f15402t);
        if (z7) {
            this.f19165R = null;
        } else {
            ((i) AbstractC1297a.h(this.f19165R)).m();
        }
        return !this.f19168U;
    }

    public final void m0() {
        if (!h0(this.f19163P)) {
            throw J(new d("Provided decoder factory can't create decoder for format."), this.f19163P, 4005);
        }
        InterfaceC1935c interfaceC1935c = this.f19164Q;
        if (interfaceC1935c != null) {
            interfaceC1935c.release();
        }
        this.f19164Q = this.f19153F.b();
    }

    public final boolean n0(b bVar) {
        return ((C1194q) AbstractC1297a.h(this.f19163P)).f12709I == -1 || this.f19163P.f12710J == -1 || bVar.c() == (((C1194q) AbstractC1297a.h(this.f19163P)).f12710J * this.f19163P.f12709I) - 1;
    }

    public final void o0(int i7) {
        this.f19162O = Math.min(this.f19162O, i7);
    }

    public final void p0(long j7, i iVar) {
        boolean z7 = true;
        if (iVar.p()) {
            this.f19168U = true;
            return;
        }
        b bVar = new b(this.f19171X, iVar.f15402t);
        this.f19170W = bVar;
        this.f19171X++;
        if (!this.f19168U) {
            long a7 = bVar.a();
            boolean z8 = a7 - 30000 <= j7 && j7 <= 30000 + a7;
            b bVar2 = this.f19169V;
            boolean z9 = bVar2 != null && bVar2.a() <= j7 && j7 < a7;
            boolean n02 = n0((b) AbstractC1297a.h(this.f19170W));
            if (!z8 && !z9 && !n02) {
                z7 = false;
            }
            this.f19168U = z7;
            if (z9 && !z8) {
                return;
            }
        }
        this.f19169V = this.f19170W;
        this.f19170W = null;
    }

    public boolean r0(long j7, long j8, Bitmap bitmap, long j9) {
        long j10 = j9 - j7;
        if (!u0() && j10 >= 30000) {
            return false;
        }
        this.f19166S.a(j9 - this.f19158K.f19174b, bitmap);
        return true;
    }

    public final void s0() {
        this.f19165R = null;
        this.f19161N = 0;
        this.f19160M = -9223372036854775807L;
        InterfaceC1935c interfaceC1935c = this.f19164Q;
        if (interfaceC1935c != null) {
            interfaceC1935c.release();
            this.f19164Q = null;
        }
    }

    @Override // k0.AbstractC1425n, k0.V0.b
    public void t(int i7, Object obj) {
        if (i7 != 15) {
            super.t(i7, obj);
        } else {
            t0(obj instanceof e ? (e) obj : null);
        }
    }

    public final void t0(e eVar) {
        this.f19166S = l0(eVar);
    }

    public final boolean u0() {
        boolean z7 = getState() == 2;
        int i7 = this.f19162O;
        if (i7 == 0) {
            return z7;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }
}
