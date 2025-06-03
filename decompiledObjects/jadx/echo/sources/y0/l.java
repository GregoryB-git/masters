package y0;

import F0.C0365j;
import d0.C1194q;
import i0.x;
import y0.InterfaceC2227f;

/* loaded from: classes.dex */
public final class l extends AbstractC2226e {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2227f f21299j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2227f.b f21300k;

    /* renamed from: l, reason: collision with root package name */
    public long f21301l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f21302m;

    public l(i0.g gVar, i0.k kVar, C1194q c1194q, int i7, Object obj, InterfaceC2227f interfaceC2227f) {
        super(gVar, kVar, 2, c1194q, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f21299j = interfaceC2227f;
    }

    @Override // B0.n.e
    public void b() {
        if (this.f21301l == 0) {
            this.f21299j.b(this.f21300k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            i0.k e7 = this.f21253b.e(this.f21301l);
            x xVar = this.f21260i;
            C0365j c0365j = new C0365j(xVar, e7.f14658g, xVar.e(e7));
            while (!this.f21302m && this.f21299j.c(c0365j)) {
                try {
                } finally {
                    this.f21301l = c0365j.p() - this.f21253b.f14658g;
                }
            }
        } finally {
            i0.j.a(this.f21260i);
        }
    }

    @Override // B0.n.e
    public void c() {
        this.f21302m = true;
    }

    public void g(InterfaceC2227f.b bVar) {
        this.f21300k = bVar;
    }
}
