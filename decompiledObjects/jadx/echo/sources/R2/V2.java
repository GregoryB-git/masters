package R2;

/* loaded from: classes.dex */
public final class V2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5071o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5072p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5073q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5074r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ R2 f5075s;

    public V2(R2 r22, String str, String str2, String str3, long j7) {
        this.f5075s = r22;
        this.f5071o = str;
        this.f5072p = str2;
        this.f5073q = str3;
        this.f5074r = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        String str = this.f5071o;
        if (str == null) {
            d53 = this.f5075s.f4983b;
            d53.C(this.f5072p, null);
        } else {
            C0627w4 c0627w4 = new C0627w4(this.f5073q, str, this.f5074r);
            d52 = this.f5075s.f4983b;
            d52.C(this.f5072p, c0627w4);
        }
    }
}
