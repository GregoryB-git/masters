package c8;

import l6.b;

/* loaded from: classes.dex */
public final class q0 implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f2507a;

    public q0(r0 r0Var) {
        this.f2507a = r0Var;
    }

    @Override // l6.b.a
    public final void a(boolean z10) {
        if (z10) {
            this.f2507a.f2516c = true;
            r rVar = this.f2507a.f2515b;
            rVar.f2513e.removeCallbacks(rVar.f);
        } else {
            this.f2507a.f2516c = false;
            r0 r0Var = this.f2507a;
            if (r0Var.f2514a > 0 && !r0Var.f2516c) {
                this.f2507a.f2515b.a();
            }
        }
    }
}
