package e7;

/* loaded from: classes.dex */
public final class t4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s4 f4677b;

    public /* synthetic */ t4(s4 s4Var, int i10) {
        this.f4676a = i10;
        this.f4677b = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4676a) {
            case 0:
                s4 s4Var = this.f4677b;
                s4Var.f = s4Var.f4646s;
                break;
            default:
                this.f4677b.f4646s = null;
                break;
        }
    }
}
