package h5;

import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends z3.h implements g {

    /* renamed from: c, reason: collision with root package name */
    public g f7139c;

    /* renamed from: d, reason: collision with root package name */
    public long f7140d;

    @Override // h5.g
    public final int f(long j10) {
        g gVar = this.f7139c;
        gVar.getClass();
        return gVar.f(j10 - this.f7140d);
    }

    @Override // h5.g
    public final long g(int i10) {
        g gVar = this.f7139c;
        gVar.getClass();
        return gVar.g(i10) + this.f7140d;
    }

    @Override // h5.g
    public final List<a> h(long j10) {
        g gVar = this.f7139c;
        gVar.getClass();
        return gVar.h(j10 - this.f7140d);
    }

    @Override // h5.g
    public final int i() {
        g gVar = this.f7139c;
        gVar.getClass();
        return gVar.i();
    }

    public final void p(long j10, g gVar, long j11) {
        this.f17537b = j10;
        this.f7139c = gVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f7140d = j10;
    }
}
