package R2;

import b3.InterfaceC0793b;

/* loaded from: classes.dex */
public final class Q3 implements InterfaceC0793b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0621v5 f4977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3 f4978b;

    public Q3(C3 c32, C0621v5 c0621v5) {
        this.f4978b = c32;
        this.f4977a = c0621v5;
    }

    @Override // b3.InterfaceC0793b
    public final void a(Object obj) {
        this.f4978b.n();
        this.f4978b.f4574i = false;
        this.f4978b.r0();
        this.f4978b.j().F().b("registerTriggerAsync ran. uri", this.f4977a.f5563o);
    }

    @Override // b3.InterfaceC0793b
    public final void onFailure(Throwable th) {
        this.f4978b.n();
        this.f4978b.f4574i = false;
        this.f4978b.r0();
        this.f4978b.j().G().b("registerTriggerAsync failed with throwable", th);
    }
}
