package e7;

/* loaded from: classes.dex */
public final class h4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3 f4294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k3 f4297d;

    public h4(k3 k3Var, e3 e3Var, long j10, boolean z10) {
        this.f4294a = e3Var;
        this.f4295b = j10;
        this.f4296c = z10;
        this.f4297d = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4297d.y(this.f4294a);
        k3.A(this.f4297d, this.f4294a, this.f4295b, true, this.f4296c);
    }
}
