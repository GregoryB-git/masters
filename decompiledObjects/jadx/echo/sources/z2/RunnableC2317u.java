package z2;

/* renamed from: z2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2317u implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21753o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2320x f21754p;

    public RunnableC2317u(C2320x c2320x, int i7) {
        this.f21754p = c2320x;
        this.f21753o = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21754p.h(this.f21753o);
    }
}
