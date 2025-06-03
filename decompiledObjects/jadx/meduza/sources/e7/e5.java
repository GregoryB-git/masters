package e7;

/* loaded from: classes.dex */
public final class e5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6 f4178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f4180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f4181d;

    public e5(w4 w4Var, k6 k6Var, boolean z10, f0 f0Var, String str) {
        this.f4178a = k6Var;
        this.f4179b = z10;
        this.f4180c = f0Var;
        this.f4181d = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w4 w4Var = this.f4181d;
        n0 n0Var = w4Var.f4735e;
        if (n0Var == null) {
            w4Var.zzj().f4060o.b("Discarding data. Failed to send event to service");
            return;
        }
        m6.j.i(this.f4178a);
        this.f4181d.w(n0Var, this.f4179b ? null : this.f4180c, this.f4178a);
        this.f4181d.H();
    }
}
