package R2;

/* loaded from: classes.dex */
public final class Z4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ R1 f5178o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0475a5 f5179p;

    public Z4(ServiceConnectionC0475a5 serviceConnectionC0475a5, R1 r12) {
        this.f5179p = serviceConnectionC0475a5;
        this.f5178o = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5179p) {
            try {
                this.f5179p.f5198a = false;
                if (!this.f5179p.f5200c.c0()) {
                    this.f5179p.f5200c.j().K().a("Connected to service");
                    this.f5179p.f5200c.E(this.f5178o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
