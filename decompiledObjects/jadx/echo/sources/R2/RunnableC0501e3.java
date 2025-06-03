package R2;

/* renamed from: R2.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0501e3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f5276o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5277p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R2 f5278q;

    public RunnableC0501e3(R2 r22, I i7, String str) {
        this.f5278q = r22;
        this.f5276o = i7;
        this.f5277p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        d52 = this.f5278q.f4983b;
        d52.o0();
        d53 = this.f5278q.f4983b;
        d53.r(this.f5276o, this.f5277p);
    }
}
