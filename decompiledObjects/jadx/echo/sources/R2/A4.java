package R2;

/* loaded from: classes.dex */
public final class A4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0627w4 f4544o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0627w4 f4545p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f4546q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f4547r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0620v4 f4548s;

    public A4(C0620v4 c0620v4, C0627w4 c0627w4, C0627w4 c0627w42, long j7, boolean z7) {
        this.f4548s = c0620v4;
        this.f4544o = c0627w4;
        this.f4545p = c0627w42;
        this.f4546q = j7;
        this.f4547r = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4548s.I(this.f4544o, this.f4545p, this.f4546q, this.f4547r, null);
    }
}
