package g9;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6032b;

    public /* synthetic */ n(u uVar, int i10) {
        this.f6031a = i10;
        this.f6032b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6031a) {
            case 0:
                i9.n nVar = this.f6032b.f6092g;
                nVar.f7743a.y("Delete All Indexes", new b.k(nVar, 13));
                break;
            default:
                this.f6032b.f6093h.b();
                break;
        }
    }
}
