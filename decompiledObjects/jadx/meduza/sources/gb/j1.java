package gb;

/* loaded from: classes.dex */
public final class j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f6534c;

    public j1(d1 d1Var, x xVar, boolean z10) {
        this.f6534c = d1Var;
        this.f6532a = xVar;
        this.f6533b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6534c.f6270u.c(this.f6532a, this.f6533b);
    }
}
