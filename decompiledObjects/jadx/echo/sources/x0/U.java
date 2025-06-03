package x0;

import android.net.Uri;
import d0.C1171J;
import d0.C1194q;
import d0.C1198u;
import g0.AbstractC1297a;
import java.util.ArrayList;
import k0.C1441v0;
import k0.C1447y0;
import k0.d1;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class U extends AbstractC2120a {

    /* renamed from: j, reason: collision with root package name */
    public static final C1194q f20668j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1198u f20669k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f20670l;

    /* renamed from: h, reason: collision with root package name */
    public final long f20671h;

    /* renamed from: i, reason: collision with root package name */
    public C1198u f20672i;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public long f20673a;

        /* renamed from: b, reason: collision with root package name */
        public Object f20674b;

        public U a() {
            AbstractC1297a.f(this.f20673a > 0);
            return new U(this.f20673a, U.f20669k.a().d(this.f20674b).a());
        }

        public b b(long j7) {
            this.f20673a = j7;
            return this;
        }

        public b c(Object obj) {
            this.f20674b = obj;
            return this;
        }
    }

    static {
        C1194q K6 = new C1194q.b().o0("audio/raw").N(2).p0(44100).i0(2).K();
        f20668j = K6;
        f20669k = new C1198u.c().b("SilenceMediaSource").e(Uri.EMPTY).c(K6.f12726n).a();
        f20670l = new byte[g0.M.g0(2, 2) * 1024];
    }

    public U(long j7, C1198u c1198u) {
        AbstractC1297a.a(j7 >= 0);
        this.f20671h = j7;
        this.f20672i = c1198u;
    }

    public static long H(long j7) {
        return g0.M.g0(2, 2) * ((j7 * 44100) / 1000000);
    }

    public static long I(long j7) {
        return ((j7 / g0.M.g0(2, 2)) * 1000000) / 44100;
    }

    @Override // x0.InterfaceC2142x
    public synchronized C1198u a() {
        return this.f20672i;
    }

    @Override // x0.InterfaceC2142x
    public InterfaceC2140v f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        return new c(this.f20671h);
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public synchronized void l(C1198u c1198u) {
        this.f20672i = c1198u;
    }

    @Override // x0.AbstractC2120a
    public void z(i0.y yVar) {
        A(new V(this.f20671h, true, false, false, null, a()));
    }

    public static final class c implements InterfaceC2140v {

        /* renamed from: q, reason: collision with root package name */
        public static final Z f20675q = new Z(new C1171J(U.f20668j));

        /* renamed from: o, reason: collision with root package name */
        public final long f20676o;

        /* renamed from: p, reason: collision with root package name */
        public final ArrayList f20677p = new ArrayList();

        public c(long j7) {
            this.f20676o = j7;
        }

        public final long a(long j7) {
            return g0.M.q(j7, 0L, this.f20676o);
        }

        @Override // x0.InterfaceC2140v, x0.S
        public boolean b() {
            return false;
        }

        @Override // x0.InterfaceC2140v, x0.S
        public long c() {
            return Long.MIN_VALUE;
        }

        @Override // x0.InterfaceC2140v
        public long d(long j7, d1 d1Var) {
            return a(j7);
        }

        @Override // x0.InterfaceC2140v, x0.S
        public long f() {
            return Long.MIN_VALUE;
        }

        @Override // x0.InterfaceC2140v, x0.S
        public boolean g(C1447y0 c1447y0) {
            return false;
        }

        @Override // x0.InterfaceC2140v
        public long i(A0.y[] yVarArr, boolean[] zArr, Q[] qArr, boolean[] zArr2, long j7) {
            long a7 = a(j7);
            for (int i7 = 0; i7 < yVarArr.length; i7++) {
                Q q7 = qArr[i7];
                if (q7 != null && (yVarArr[i7] == null || !zArr[i7])) {
                    this.f20677p.remove(q7);
                    qArr[i7] = null;
                }
                if (qArr[i7] == null && yVarArr[i7] != null) {
                    d dVar = new d(this.f20676o);
                    dVar.b(a7);
                    this.f20677p.add(dVar);
                    qArr[i7] = dVar;
                    zArr2[i7] = true;
                }
            }
            return a7;
        }

        @Override // x0.InterfaceC2140v
        public long l() {
            return -9223372036854775807L;
        }

        @Override // x0.InterfaceC2140v
        public Z n() {
            return f20675q;
        }

        @Override // x0.InterfaceC2140v
        public long s(long j7) {
            long a7 = a(j7);
            for (int i7 = 0; i7 < this.f20677p.size(); i7++) {
                ((d) this.f20677p.get(i7)).b(a7);
            }
            return a7;
        }

        @Override // x0.InterfaceC2140v
        public void u(InterfaceC2140v.a aVar, long j7) {
            aVar.k(this);
        }

        @Override // x0.InterfaceC2140v
        public void p() {
        }

        @Override // x0.InterfaceC2140v, x0.S
        public void h(long j7) {
        }

        @Override // x0.InterfaceC2140v
        public void q(long j7, boolean z7) {
        }
    }

    public static final class d implements Q {

        /* renamed from: o, reason: collision with root package name */
        public final long f20678o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f20679p;

        /* renamed from: q, reason: collision with root package name */
        public long f20680q;

        public d(long j7) {
            this.f20678o = U.H(j7);
            b(0L);
        }

        public void b(long j7) {
            this.f20680q = g0.M.q(U.H(j7), 0L, this.f20678o);
        }

        @Override // x0.Q
        public boolean e() {
            return true;
        }

        @Override // x0.Q
        public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
            if (!this.f20679p || (i7 & 2) != 0) {
                c1441v0.f16024b = U.f20668j;
                this.f20679p = true;
                return -5;
            }
            long j7 = this.f20678o;
            long j8 = this.f20680q;
            long j9 = j7 - j8;
            if (j9 == 0) {
                iVar.l(4);
                return -4;
            }
            iVar.f15402t = U.I(j8);
            iVar.l(1);
            int min = (int) Math.min(U.f20670l.length, j9);
            if ((i7 & 4) == 0) {
                iVar.z(min);
                iVar.f15400r.put(U.f20670l, 0, min);
            }
            if ((i7 & 1) == 0) {
                this.f20680q += min;
            }
            return -4;
        }

        @Override // x0.Q
        public int m(long j7) {
            long j8 = this.f20680q;
            b(j7);
            return (int) ((this.f20680q - j8) / U.f20670l.length);
        }

        @Override // x0.Q
        public void a() {
        }
    }

    @Override // x0.AbstractC2120a
    public void B() {
    }

    @Override // x0.InterfaceC2142x
    public void h() {
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
    }
}
