package R2;

/* renamed from: R2.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0508f3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f5287o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f5288p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R2 f5289q;

    public RunnableC0508f3(R2 r22, I i7, W5 w52) {
        this.f5289q = r22;
        this.f5287o = i7;
        this.f5288p = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5289q.d1(this.f5289q.b1(this.f5287o, this.f5288p), this.f5288p);
    }
}
