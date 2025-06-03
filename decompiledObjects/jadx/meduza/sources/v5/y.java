package v5;

import v3.e1;

/* loaded from: classes.dex */
public final class y implements o {

    /* renamed from: a, reason: collision with root package name */
    public final c f15989a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15990b;

    /* renamed from: c, reason: collision with root package name */
    public long f15991c;

    /* renamed from: d, reason: collision with root package name */
    public long f15992d;

    /* renamed from: e, reason: collision with root package name */
    public e1 f15993e = e1.f15326d;

    public y(c cVar) {
        this.f15989a = cVar;
    }

    public final void a(long j10) {
        this.f15991c = j10;
        if (this.f15990b) {
            this.f15992d = this.f15989a.d();
        }
    }

    @Override // v5.o
    public final void c(e1 e1Var) {
        if (this.f15990b) {
            a(l());
        }
        this.f15993e = e1Var;
    }

    @Override // v5.o
    public final e1 f() {
        return this.f15993e;
    }

    @Override // v5.o
    public final long l() {
        long j10 = this.f15991c;
        if (!this.f15990b) {
            return j10;
        }
        long d10 = this.f15989a.d() - this.f15992d;
        return j10 + (this.f15993e.f15327a == 1.0f ? e0.I(d10) : d10 * r4.f15329c);
    }
}
