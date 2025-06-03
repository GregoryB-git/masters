package R2;

/* loaded from: classes.dex */
public final class B4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0627w4 f4557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f4558p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0620v4 f4559q;

    public B4(C0620v4 c0620v4, C0627w4 c0627w4, long j7) {
        this.f4559q = c0620v4;
        this.f4557o = c0627w4;
        this.f4558p = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4559q.J(this.f4557o, false, this.f4558p);
        C0620v4 c0620v4 = this.f4559q;
        c0620v4.f5555e = null;
        c0620v4.t().G(null);
    }
}
