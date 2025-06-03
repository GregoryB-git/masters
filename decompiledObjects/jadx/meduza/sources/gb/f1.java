package gb;

import eb.d;

/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f6363a;

    public f1(d1 d1Var) {
        this.f6363a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6363a.f6273x.f5184a == eb.n.IDLE) {
            this.f6363a.f6260j.a(d.a.INFO, "CONNECTING as requested");
            d1.b(this.f6363a, eb.n.CONNECTING);
            d1.i(this.f6363a);
        }
    }
}
