package R2;

/* loaded from: classes.dex */
public final class O2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0633x3 f4949o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N2 f4950p;

    public O2(N2 n22, C0633x3 c0633x3) {
        this.f4950p = n22;
        this.f4949o = c0633x3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N2.g(this.f4950p, this.f4949o);
        this.f4950p.k(this.f4949o.f5605g);
    }
}
