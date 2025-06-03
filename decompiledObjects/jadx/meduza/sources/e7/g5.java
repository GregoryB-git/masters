package e7;

/* loaded from: classes.dex */
public final class g5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6 f4223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f4225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f4226d;

    public g5(w4 w4Var, k6 k6Var, boolean z10, f fVar, f fVar2) {
        this.f4223a = k6Var;
        this.f4224b = z10;
        this.f4225c = fVar;
        this.f4226d = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w4 w4Var = this.f4226d;
        n0 n0Var = w4Var.f4735e;
        if (n0Var == null) {
            w4Var.zzj().f4060o.b("Discarding data. Failed to send conditional user property to service");
            return;
        }
        m6.j.i(this.f4223a);
        this.f4226d.w(n0Var, this.f4224b ? null : this.f4225c, this.f4223a);
        this.f4226d.H();
    }
}
