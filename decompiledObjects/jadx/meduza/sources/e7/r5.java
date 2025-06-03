package e7;

/* loaded from: classes.dex */
public final class r5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public long f4621a;

    /* renamed from: b, reason: collision with root package name */
    public long f4622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3.l f4623c;

    public r5(l3.l lVar, long j10, long j11) {
        this.f4623c = lVar;
        this.f4621a = j10;
        this.f4622b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((q5) this.f4623c.f9560b).zzl().u(new i6.r(this, 4));
    }
}
