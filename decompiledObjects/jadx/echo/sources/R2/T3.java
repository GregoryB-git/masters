package R2;

/* loaded from: classes.dex */
public final class T3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5034o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5035p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5036q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5037r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C3 f5038s;

    public T3(C3 c32, String str, String str2, Object obj, long j7) {
        this.f5038s = c32;
        this.f5034o = str;
        this.f5035p = str2;
        this.f5036q = obj;
        this.f5037r = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5038s.a0(this.f5034o, this.f5035p, this.f5036q, this.f5037r);
    }
}
