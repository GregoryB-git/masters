package gb;

/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f6907a;

    public y1(r1 r1Var) {
        this.f6907a = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r1 r1Var = this.f6907a;
        if (r1Var.I) {
            return;
        }
        r1Var.I = true;
        r1.J(r1Var);
    }
}
