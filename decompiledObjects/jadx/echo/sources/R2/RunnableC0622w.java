package R2;

/* renamed from: R2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0622w implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0571o3 f5566o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0629x f5567p;

    public RunnableC0622w(AbstractC0629x abstractC0629x, InterfaceC0571o3 interfaceC0571o3) {
        this.f5567p = abstractC0629x;
        this.f5566o = interfaceC0571o3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5566o.d();
        if (C0504f.a()) {
            this.f5566o.e().D(this);
            return;
        }
        boolean e7 = this.f5567p.e();
        this.f5567p.f5585c = 0L;
        if (e7) {
            this.f5567p.d();
        }
    }
}
