package gb;

import eb.d;

/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f6301a;

    public e1(d1 d1Var) {
        this.f6301a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = this.f6301a;
        d1Var.f6267q = null;
        d1Var.f6260j.a(d.a.INFO, "CONNECTING after backoff");
        d1.b(this.f6301a, eb.n.CONNECTING);
        d1.i(this.f6301a);
    }
}
