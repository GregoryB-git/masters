package R2;

/* loaded from: classes.dex */
public final class U2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0497e f5053o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f5054p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R2 f5055q;

    public U2(R2 r22, C0497e c0497e, W5 w52) {
        this.f5055q = r22;
        this.f5053o = c0497e;
        this.f5054p = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        D5 d54;
        d52 = this.f5055q.f4983b;
        d52.o0();
        if (this.f5053o.f5265q.a() == null) {
            d54 = this.f5055q.f4983b;
            d54.p(this.f5053o, this.f5054p);
        } else {
            d53 = this.f5055q.f4983b;
            d53.T(this.f5053o, this.f5054p);
        }
    }
}
