package e7;

/* loaded from: classes.dex */
public final class g4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3 f4219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k3 f4222d;

    public g4(k3 k3Var, e3 e3Var, long j10, boolean z10) {
        this.f4219a = e3Var;
        this.f4220b = j10;
        this.f4221c = z10;
        this.f4222d = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4222d.y(this.f4219a);
        k3.A(this.f4222d, this.f4219a, this.f4220b, false, this.f4221c);
    }
}
