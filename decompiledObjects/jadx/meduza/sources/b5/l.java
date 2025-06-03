package b5;

import b.z;
import b5.f;
import t5.j0;
import v3.i0;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: j, reason: collision with root package name */
    public final f f1899j;

    /* renamed from: k, reason: collision with root package name */
    public f.a f1900k;

    /* renamed from: l, reason: collision with root package name */
    public long f1901l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f1902m;

    public l(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, f fVar) {
        super(kVar, nVar, 2, i0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f1899j = fVar;
    }

    @Override // t5.d0.d
    public final void a() {
        if (this.f1901l == 0) {
            ((d) this.f1899j).a(this.f1900k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            t5.n a10 = this.f1862b.a(this.f1901l);
            j0 j0Var = this.f1868i;
            c4.e eVar = new c4.e(j0Var, a10.f, j0Var.a(a10));
            while (!this.f1902m) {
                try {
                    int d10 = ((d) this.f1899j).f1848a.d(eVar, d.f1847r);
                    boolean z10 = false;
                    x6.b.H(d10 != 1);
                    if (d10 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.f1901l = eVar.f2276d - this.f1862b.f;
                }
            }
        } finally {
            z.d(this.f1868i);
        }
    }

    @Override // t5.d0.d
    public final void b() {
        this.f1902m = true;
    }
}
