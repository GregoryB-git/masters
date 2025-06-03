package H4;

import N4.g;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final g f2397a;

    public b(g gVar) {
        this.f2397a = gVar;
    }

    @Override // H4.e
    public boolean c() {
        return this.f2397a.h0() && (this.f2397a.d0() > 0 || this.f2397a.c0() > 0 || (this.f2397a.g0() && this.f2397a.f0().Y()));
    }
}
