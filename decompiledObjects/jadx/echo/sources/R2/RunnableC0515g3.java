package R2;

/* renamed from: R2.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0515g3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ R5 f5304o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f5305p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R2 f5306q;

    public RunnableC0515g3(R2 r22, R5 r52, W5 w52) {
        this.f5306q = r22;
        this.f5304o = r52;
        this.f5305p = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        D5 d54;
        d52 = this.f5306q.f4983b;
        d52.o0();
        if (this.f5304o.a() == null) {
            d54 = this.f5306q.f4983b;
            d54.D(this.f5304o.f4991p, this.f5305p);
        } else {
            d53 = this.f5306q.f4983b;
            d53.u(this.f5304o, this.f5305p);
        }
    }
}
