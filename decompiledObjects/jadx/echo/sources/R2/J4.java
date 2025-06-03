package R2;

import A2.AbstractC0328n;

/* loaded from: classes.dex */
public final class J4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4758o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4759p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R5 f4760q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D4 f4761r;

    public J4(D4 d42, W5 w52, boolean z7, R5 r52) {
        this.f4761r = d42;
        this.f4758o = w52;
        this.f4759p = z7;
        this.f4760q = r52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f4761r.f4593d;
        if (r12 == null) {
            this.f4761r.j().G().a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC0328n.i(this.f4758o);
        this.f4761r.F(r12, this.f4759p ? null : this.f4760q, this.f4758o);
        this.f4761r.g0();
    }
}
