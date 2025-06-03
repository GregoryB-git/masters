package R2;

/* loaded from: classes.dex */
public final class X2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0497e f5133o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R2 f5134p;

    public X2(R2 r22, C0497e c0497e) {
        this.f5134p = r22;
        this.f5133o = c0497e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        D5 d54;
        d52 = this.f5134p.f4983b;
        d52.o0();
        if (this.f5133o.f5265q.a() == null) {
            d54 = this.f5134p.f4983b;
            d54.o(this.f5133o);
        } else {
            d53 = this.f5134p.f4983b;
            d53.S(this.f5133o);
        }
    }
}
