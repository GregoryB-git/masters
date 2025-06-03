package R2;

/* loaded from: classes.dex */
public final class P3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f4968o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f4969p;

    public P3(C3 c32, boolean z7) {
        this.f4969p = c32;
        this.f4968o = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p7 = this.f4969p.f5424a.p();
        boolean o7 = this.f4969p.f5424a.o();
        this.f4969p.f5424a.m(this.f4968o);
        if (o7 == this.f4968o) {
            this.f4969p.f5424a.j().K().b("Default data collection state already set to", Boolean.valueOf(this.f4968o));
        }
        if (this.f4969p.f5424a.p() == p7 || this.f4969p.f5424a.p() != this.f4969p.f5424a.o()) {
            this.f4969p.f5424a.j().M().c("Default data collection is different than actual status", Boolean.valueOf(this.f4968o), Boolean.valueOf(p7));
        }
        this.f4969p.t0();
    }
}
