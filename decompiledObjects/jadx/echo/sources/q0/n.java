package q0;

import g0.AbstractC1297a;
import k0.C1441v0;
import x0.Q;

/* loaded from: classes.dex */
public final class n implements Q {

    /* renamed from: o, reason: collision with root package name */
    public final int f18715o;

    /* renamed from: p, reason: collision with root package name */
    public final s f18716p;

    /* renamed from: q, reason: collision with root package name */
    public int f18717q = -1;

    public n(s sVar, int i7) {
        this.f18716p = sVar;
        this.f18715o = i7;
    }

    @Override // x0.Q
    public void a() {
        int i7 = this.f18717q;
        if (i7 == -2) {
            throw new u(this.f18716p.n().b(this.f18715o).a(0).f12726n);
        }
        if (i7 == -1) {
            this.f18716p.W();
        } else if (i7 != -3) {
            this.f18716p.X(i7);
        }
    }

    public void b() {
        AbstractC1297a.a(this.f18717q == -1);
        this.f18717q = this.f18716p.z(this.f18715o);
    }

    public final boolean c() {
        int i7 = this.f18717q;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }

    public void d() {
        if (this.f18717q != -1) {
            this.f18716p.r0(this.f18715o);
            this.f18717q = -1;
        }
    }

    @Override // x0.Q
    public boolean e() {
        return this.f18717q == -3 || (c() && this.f18716p.R(this.f18717q));
    }

    @Override // x0.Q
    public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
        if (this.f18717q == -3) {
            iVar.l(4);
            return -4;
        }
        if (c()) {
            return this.f18716p.g0(this.f18717q, c1441v0, iVar, i7);
        }
        return -3;
    }

    @Override // x0.Q
    public int m(long j7) {
        if (c()) {
            return this.f18716p.q0(this.f18717q, j7);
        }
        return 0;
    }
}
