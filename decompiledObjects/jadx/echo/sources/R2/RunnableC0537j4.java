package R2;

/* renamed from: R2.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0537j4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0643z f5352o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5353p;

    public RunnableC0537j4(C3 c32, C0643z c0643z) {
        this.f5353p = c32;
        this.f5352o = c0643z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5353p.i().z(this.f5352o)) {
            this.f5353p.t().U(false);
        } else {
            this.f5353p.j().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f5352o.a()));
        }
    }
}
