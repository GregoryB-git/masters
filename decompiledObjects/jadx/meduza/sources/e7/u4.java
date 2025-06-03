package e7;

/* loaded from: classes.dex */
public final class u4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q4 f4692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q4 f4693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4 f4696e;

    public u4(s4 s4Var, q4 q4Var, q4 q4Var2, long j10, boolean z10) {
        this.f4692a = q4Var;
        this.f4693b = q4Var2;
        this.f4694c = j10;
        this.f4695d = z10;
        this.f4696e = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4696e.x(this.f4692a, this.f4693b, this.f4694c, this.f4695d, null);
    }
}
