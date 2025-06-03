package j8;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f8621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8623c;

    public /* synthetic */ q(s sVar, long j10, String str) {
        this.f8621a = sVar;
        this.f8622b = j10;
        this.f8623c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f8621a;
        sVar.f8639p.f9141b.a(new w5.l(sVar, this.f8622b, this.f8623c));
    }
}
