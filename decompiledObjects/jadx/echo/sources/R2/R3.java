package R2;

/* loaded from: classes.dex */
public final class R3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f4986o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f4987p;

    public R3(C3 c32, long j7) {
        this.f4987p = c32;
        this.f4986o = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4987p.i().f5394k.b(this.f4986o);
        this.f4987p.j().F().b("Session timeout duration set", Long.valueOf(this.f4986o));
    }
}
