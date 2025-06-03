package R2;

/* renamed from: R2.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0538j5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D5 f5354o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Runnable f5355p;

    public RunnableC0538j5(C0531i5 c0531i5, D5 d52, Runnable runnable) {
        this.f5354o = d52;
        this.f5355p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5354o.o0();
        this.f5354o.y(this.f5355p);
        this.f5354o.t0();
    }
}
