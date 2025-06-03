package R2;

/* renamed from: R2.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0516g4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Boolean f5307o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5308p;

    public RunnableC0516g4(C3 c32, Boolean bool) {
        this.f5308p = c32;
        this.f5307o = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5308p.S(this.f5307o, true);
    }
}
