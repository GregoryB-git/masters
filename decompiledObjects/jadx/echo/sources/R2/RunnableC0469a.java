package R2;

/* renamed from: R2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0469a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5181o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f5182p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B f5183q;

    public RunnableC0469a(B b7, String str, long j7) {
        this.f5183q = b7;
        this.f5181o = str;
        this.f5182p = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.y(this.f5183q, this.f5181o, this.f5182p);
    }
}
