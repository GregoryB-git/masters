package w6;

import p6.AbstractC1849g0;

/* loaded from: classes.dex */
public abstract class f extends AbstractC1849g0 {

    /* renamed from: r, reason: collision with root package name */
    public final int f20480r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20481s;

    /* renamed from: t, reason: collision with root package name */
    public final long f20482t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20483u;

    /* renamed from: v, reason: collision with root package name */
    public a f20484v = H();

    public f(int i7, int i8, long j7, String str) {
        this.f20480r = i7;
        this.f20481s = i8;
        this.f20482t = j7;
        this.f20483u = str;
    }

    @Override // p6.F
    public void E(X5.g gVar, Runnable runnable) {
        a.k(this.f20484v, runnable, null, false, 6, null);
    }

    public final a H() {
        return new a(this.f20480r, this.f20481s, this.f20482t, this.f20483u);
    }

    public final void I(Runnable runnable, i iVar, boolean z7) {
        this.f20484v.i(runnable, iVar, z7);
    }
}
