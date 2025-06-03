package e7;

/* loaded from: classes.dex */
public final class b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6 f4113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6 f4115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f4116d;

    public b5(w4 w4Var, k6 k6Var, boolean z10, q6 q6Var) {
        this.f4113a = k6Var;
        this.f4114b = z10;
        this.f4115c = q6Var;
        this.f4116d = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w4 w4Var = this.f4116d;
        n0 n0Var = w4Var.f4735e;
        if (n0Var == null) {
            w4Var.zzj().f4060o.b("Discarding data. Failed to set user property");
            return;
        }
        m6.j.i(this.f4113a);
        this.f4116d.w(n0Var, this.f4114b ? null : this.f4115c, this.f4113a);
        this.f4116d.H();
    }
}
