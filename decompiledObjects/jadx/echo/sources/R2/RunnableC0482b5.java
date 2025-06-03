package R2;

/* renamed from: R2.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0482b5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ R1 f5219o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0475a5 f5220p;

    public RunnableC0482b5(ServiceConnectionC0475a5 serviceConnectionC0475a5, R1 r12) {
        this.f5220p = serviceConnectionC0475a5;
        this.f5219o = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5220p) {
            try {
                this.f5220p.f5198a = false;
                if (!this.f5220p.f5200c.c0()) {
                    this.f5220p.f5200c.j().F().a("Connected to remote service");
                    this.f5220p.f5200c.E(this.f5219o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
