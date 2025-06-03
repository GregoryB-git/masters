package y0;

import F0.C0365j;
import F0.T;
import d0.AbstractC1203z;
import d0.C1194q;
import g0.z;
import i0.x;
import y0.InterfaceC2227f;

/* renamed from: y0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2231j extends AbstractC2222a {

    /* renamed from: o, reason: collision with root package name */
    public final int f21291o;

    /* renamed from: p, reason: collision with root package name */
    public final long f21292p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2227f f21293q;

    /* renamed from: r, reason: collision with root package name */
    public long f21294r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f21295s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21296t;

    public C2231j(i0.g gVar, i0.k kVar, C1194q c1194q, int i7, Object obj, long j7, long j8, long j9, long j10, long j11, int i8, long j12, InterfaceC2227f interfaceC2227f) {
        super(gVar, kVar, c1194q, i7, obj, j7, j8, j9, j10, j11);
        this.f21291o = i8;
        this.f21292p = j12;
        this.f21293q = interfaceC2227f;
    }

    @Override // B0.n.e
    public final void b() {
        C2224c j7 = j();
        if (this.f21294r == 0) {
            j7.c(this.f21292p);
            InterfaceC2227f interfaceC2227f = this.f21293q;
            InterfaceC2227f.b l7 = l(j7);
            long j8 = this.f21223k;
            long j9 = j8 == -9223372036854775807L ? -9223372036854775807L : j8 - this.f21292p;
            long j10 = this.f21224l;
            interfaceC2227f.b(l7, j9, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f21292p);
        }
        try {
            i0.k e7 = this.f21253b.e(this.f21294r);
            x xVar = this.f21260i;
            C0365j c0365j = new C0365j(xVar, e7.f14658g, xVar.e(e7));
            do {
                try {
                    if (this.f21295s) {
                        break;
                    }
                } finally {
                    this.f21294r = c0365j.p() - this.f21253b.f14658g;
                }
            } while (this.f21293q.c(c0365j));
            m(j7);
            this.f21294r = c0365j.p() - this.f21253b.f14658g;
            i0.j.a(this.f21260i);
            this.f21296t = !this.f21295s;
        } catch (Throwable th) {
            i0.j.a(this.f21260i);
            throw th;
        }
    }

    @Override // B0.n.e
    public final void c() {
        this.f21295s = true;
    }

    @Override // y0.m
    public long g() {
        return this.f21303j + this.f21291o;
    }

    @Override // y0.m
    public boolean h() {
        return this.f21296t;
    }

    public final void m(C2224c c2224c) {
        if (AbstractC1203z.p(this.f21255d.f12725m)) {
            C1194q c1194q = this.f21255d;
            int i7 = c1194q.f12709I;
            if ((i7 <= 1 && c1194q.f12710J <= 1) || i7 == -1 || c1194q.f12710J == -1) {
                return;
            }
            T a7 = c2224c.a(0, 4);
            C1194q c1194q2 = this.f21255d;
            int i8 = c1194q2.f12710J * c1194q2.f12709I;
            long j7 = (this.f21259h - this.f21258g) / i8;
            for (int i9 = 1; i9 < i8; i9++) {
                a7.e(new z(), 0);
                a7.b(i9 * j7, 0, 0, 0, null);
            }
        }
    }

    public InterfaceC2227f.b l(C2224c c2224c) {
        return c2224c;
    }
}
