package e7;

/* loaded from: classes.dex */
public final class c4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k3 f4137e;

    public c4(k3 k3Var, String str, String str2, Object obj, long j10) {
        this.f4133a = str;
        this.f4134b = str2;
        this.f4135c = obj;
        this.f4136d = j10;
        this.f4137e = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4137e.F(this.f4133a, this.f4134b, this.f4135c, this.f4136d);
    }
}
