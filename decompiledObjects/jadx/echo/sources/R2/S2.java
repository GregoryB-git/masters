package R2;

/* loaded from: classes.dex */
public final class S2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f5015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R2 f5016p;

    public S2(R2 r22, W5 w52) {
        this.f5016p = r22;
        this.f5015o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        d52 = this.f5016p.f4983b;
        d52.o0();
        d53 = this.f5016p.f4983b;
        d53.Z(this.f5015o);
    }
}
