package R2;

/* loaded from: classes.dex */
public final class E0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f4651o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f4652p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B f4653q;

    public E0(B b7, String str, long j7) {
        this.f4653q = b7;
        this.f4651o = str;
        this.f4652p = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.C(this.f4653q, this.f4651o, this.f4652p);
    }
}
