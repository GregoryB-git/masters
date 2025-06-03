package e7;

/* loaded from: classes.dex */
public final class v4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s4 f4715b;

    public v4(s4 s4Var, long j10) {
        this.f4714a = j10;
        this.f4715b = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = ((j2) this.f4715b.f3407b).f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        aVar.s(this.f4714a);
        this.f4715b.f = null;
    }
}
