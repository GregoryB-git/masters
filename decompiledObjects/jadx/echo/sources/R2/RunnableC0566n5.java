package R2;

/* renamed from: R2.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0566n5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5436o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0552l5 f5437p;

    public RunnableC0566n5(C0552l5 c0552l5, long j7) {
        this.f5437p = c0552l5;
        this.f5436o = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0552l5.C(this.f5437p, this.f5436o);
    }
}
