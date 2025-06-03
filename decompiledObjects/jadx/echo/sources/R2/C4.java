package R2;

/* loaded from: classes.dex */
public final class C4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f4583o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0620v4 f4584p;

    public C4(C0620v4 c0620v4, long j7) {
        this.f4584p = c0620v4;
        this.f4583o = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4584p.o().v(this.f4583o);
        this.f4584p.f5555e = null;
    }
}
