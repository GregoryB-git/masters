package z0;

import X2.AbstractC0703v;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c1.C0813b;
import c1.C0816e;
import c1.l;
import c1.m;
import c1.p;
import c1.q;
import d0.AbstractC1203z;
import d0.C1194q;
import f0.C1281b;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import java.nio.ByteBuffer;
import java.util.Objects;
import k0.AbstractC1425n;
import k0.C1441v0;
import k0.Z0;
import x0.InterfaceC2142x;

/* renamed from: z0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2290i extends AbstractC1425n implements Handler.Callback {

    /* renamed from: F, reason: collision with root package name */
    public final C0813b f21603F;

    /* renamed from: G, reason: collision with root package name */
    public final j0.i f21604G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC2282a f21605H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC2288g f21606I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f21607J;

    /* renamed from: K, reason: collision with root package name */
    public int f21608K;

    /* renamed from: L, reason: collision with root package name */
    public l f21609L;

    /* renamed from: M, reason: collision with root package name */
    public p f21610M;

    /* renamed from: N, reason: collision with root package name */
    public q f21611N;

    /* renamed from: O, reason: collision with root package name */
    public q f21612O;

    /* renamed from: P, reason: collision with root package name */
    public int f21613P;

    /* renamed from: Q, reason: collision with root package name */
    public final Handler f21614Q;

    /* renamed from: R, reason: collision with root package name */
    public final InterfaceC2289h f21615R;

    /* renamed from: S, reason: collision with root package name */
    public final C1441v0 f21616S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f21617T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f21618U;

    /* renamed from: V, reason: collision with root package name */
    public C1194q f21619V;

    /* renamed from: W, reason: collision with root package name */
    public long f21620W;

    /* renamed from: X, reason: collision with root package name */
    public long f21621X;

    /* renamed from: Y, reason: collision with root package name */
    public long f21622Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f21623Z;

    public C2290i(InterfaceC2289h interfaceC2289h, Looper looper) {
        this(interfaceC2289h, looper, InterfaceC2288g.f21601a);
    }

    private long l0(long j7) {
        AbstractC1297a.f(j7 != -9223372036854775807L);
        AbstractC1297a.f(this.f21620W != -9223372036854775807L);
        return j7 - this.f21620W;
    }

    public static boolean p0(C1194q c1194q) {
        return Objects.equals(c1194q.f12726n, "application/x-media3-cues");
    }

    @Override // k0.AbstractC1425n
    public void T() {
        this.f21619V = null;
        this.f21622Y = -9223372036854775807L;
        i0();
        this.f21620W = -9223372036854775807L;
        this.f21621X = -9223372036854775807L;
        if (this.f21609L != null) {
            s0();
        }
    }

    @Override // k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        this.f21621X = j7;
        InterfaceC2282a interfaceC2282a = this.f21605H;
        if (interfaceC2282a != null) {
            interfaceC2282a.clear();
        }
        i0();
        this.f21617T = false;
        this.f21618U = false;
        this.f21622Y = -9223372036854775807L;
        C1194q c1194q = this.f21619V;
        if (c1194q == null || p0(c1194q)) {
            return;
        }
        if (this.f21608K != 0) {
            v0();
            return;
        }
        r0();
        l lVar = (l) AbstractC1297a.e(this.f21609L);
        lVar.flush();
        lVar.c(P());
    }

    @Override // k0.a1
    public int a(C1194q c1194q) {
        if (p0(c1194q) || this.f21606I.a(c1194q)) {
            return Z0.a(c1194q.f12711K == 0 ? 4 : 2);
        }
        return Z0.a(AbstractC1203z.r(c1194q.f12726n) ? 1 : 0);
    }

    @Override // k0.Y0
    public boolean c() {
        return this.f21618U;
    }

    @Override // k0.AbstractC1425n
    public void c0(C1194q[] c1194qArr, long j7, long j8, InterfaceC2142x.b bVar) {
        this.f21620W = j8;
        C1194q c1194q = c1194qArr[0];
        this.f21619V = c1194q;
        if (p0(c1194q)) {
            this.f21605H = this.f21619V.f12708H == 1 ? new C2286e() : new C2287f();
            return;
        }
        h0();
        if (this.f21609L != null) {
            this.f21608K = 1;
        } else {
            n0();
        }
    }

    @Override // k0.Y0, k0.a1
    public String d() {
        return "TextRenderer";
    }

    @Override // k0.Y0
    public boolean e() {
        return true;
    }

    @Override // k0.Y0
    public void f(long j7, long j8) {
        if (A()) {
            long j9 = this.f21622Y;
            if (j9 != -9223372036854775807L && j7 >= j9) {
                r0();
                this.f21618U = true;
            }
        }
        if (this.f21618U) {
            return;
        }
        if (p0((C1194q) AbstractC1297a.e(this.f21619V))) {
            AbstractC1297a.e(this.f21605H);
            t0(j7);
        } else {
            h0();
            u0(j7);
        }
    }

    public final void h0() {
        AbstractC1297a.g(this.f21623Z || Objects.equals(this.f21619V.f12726n, "application/cea-608") || Objects.equals(this.f21619V.f12726n, "application/x-mp4-cea-608") || Objects.equals(this.f21619V.f12726n, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f21619V.f12726n + " samples (expected application/x-media3-cues).");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        o0((C1281b) message.obj);
        return true;
    }

    public final void i0() {
        x0(new C1281b(AbstractC0703v.Y(), l0(this.f21621X)));
    }

    public final long j0(long j7) {
        int c7 = this.f21611N.c(j7);
        if (c7 == 0 || this.f21611N.j() == 0) {
            return this.f21611N.f15408p;
        }
        if (c7 != -1) {
            return this.f21611N.e(c7 - 1);
        }
        return this.f21611N.e(r2.j() - 1);
    }

    public final long k0() {
        if (this.f21613P == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC1297a.e(this.f21611N);
        if (this.f21613P >= this.f21611N.j()) {
            return Long.MAX_VALUE;
        }
        return this.f21611N.e(this.f21613P);
    }

    public final void m0(m mVar) {
        o.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f21619V, mVar);
        i0();
        v0();
    }

    public final void n0() {
        this.f21607J = true;
        l b7 = this.f21606I.b((C1194q) AbstractC1297a.e(this.f21619V));
        this.f21609L = b7;
        b7.c(P());
    }

    public final void o0(C1281b c1281b) {
        this.f21615R.k(c1281b.f14119a);
        this.f21615R.r(c1281b);
    }

    public final boolean q0(long j7) {
        if (this.f21617T || e0(this.f21616S, this.f21604G, 0) != -4) {
            return false;
        }
        if (this.f21604G.p()) {
            this.f21617T = true;
            return false;
        }
        this.f21604G.C();
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(this.f21604G.f15400r);
        C0816e a7 = this.f21603F.a(this.f21604G.f15402t, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f21604G.m();
        return this.f21605H.c(a7, j7);
    }

    public final void r0() {
        this.f21610M = null;
        this.f21613P = -1;
        q qVar = this.f21611N;
        if (qVar != null) {
            qVar.x();
            this.f21611N = null;
        }
        q qVar2 = this.f21612O;
        if (qVar2 != null) {
            qVar2.x();
            this.f21612O = null;
        }
    }

    public final void s0() {
        r0();
        ((l) AbstractC1297a.e(this.f21609L)).release();
        this.f21609L = null;
        this.f21608K = 0;
    }

    public final void t0(long j7) {
        boolean q02 = q0(j7);
        long b7 = this.f21605H.b(this.f21621X);
        if (b7 == Long.MIN_VALUE && this.f21617T && !q02) {
            this.f21618U = true;
        }
        if ((b7 != Long.MIN_VALUE && b7 <= j7) || q02) {
            AbstractC0703v a7 = this.f21605H.a(j7);
            long d7 = this.f21605H.d(j7);
            x0(new C1281b(a7, l0(d7)));
            this.f21605H.e(d7);
        }
        this.f21621X = j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x008a, code lost:
    
        if (r0 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(long r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2290i.u0(long):void");
    }

    public final void v0() {
        s0();
        n0();
    }

    public void w0(long j7) {
        AbstractC1297a.f(A());
        this.f21622Y = j7;
    }

    public final void x0(C1281b c1281b) {
        Handler handler = this.f21614Q;
        if (handler != null) {
            handler.obtainMessage(1, c1281b).sendToTarget();
        } else {
            o0(c1281b);
        }
    }

    public C2290i(InterfaceC2289h interfaceC2289h, Looper looper, InterfaceC2288g interfaceC2288g) {
        super(3);
        this.f21615R = (InterfaceC2289h) AbstractC1297a.e(interfaceC2289h);
        this.f21614Q = looper == null ? null : M.z(looper, this);
        this.f21606I = interfaceC2288g;
        this.f21603F = new C0813b();
        this.f21604G = new j0.i(1);
        this.f21616S = new C1441v0();
        this.f21622Y = -9223372036854775807L;
        this.f21620W = -9223372036854775807L;
        this.f21621X = -9223372036854775807L;
        this.f21623Z = false;
    }
}
