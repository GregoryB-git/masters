package h4;

import c4.j;
import c4.t;
import c4.u;
import c4.v;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f7087a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7088b;

    public class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f7089a;

        public a(t tVar) {
            this.f7089a = tVar;
        }

        @Override // c4.t
        public final boolean e() {
            return this.f7089a.e();
        }

        @Override // c4.t
        public final t.a g(long j10) {
            t.a g10 = this.f7089a.g(j10);
            u uVar = g10.f2314a;
            long j11 = uVar.f2319a;
            long j12 = uVar.f2320b;
            long j13 = d.this.f7087a;
            u uVar2 = new u(j11, j12 + j13);
            u uVar3 = g10.f2315b;
            return new t.a(uVar2, new u(uVar3.f2319a, uVar3.f2320b + j13));
        }

        @Override // c4.t
        public final long h() {
            return this.f7089a.h();
        }
    }

    public d(long j10, j jVar) {
        this.f7087a = j10;
        this.f7088b = jVar;
    }

    @Override // c4.j
    public final void m() {
        this.f7088b.m();
    }

    @Override // c4.j
    public final v r(int i10, int i11) {
        return this.f7088b.r(i10, i11);
    }

    @Override // c4.j
    public final void t(t tVar) {
        this.f7088b.t(new a(tVar));
    }
}
