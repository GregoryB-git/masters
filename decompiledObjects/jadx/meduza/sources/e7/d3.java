package e7;

/* loaded from: classes.dex */
public abstract class d3 extends d2.q {

    /* renamed from: c, reason: collision with root package name */
    public boolean f4148c;

    public d3(j2 j2Var) {
        super(j2Var);
        ((j2) this.f3407b).N++;
    }

    public final void m() {
        if (!this.f4148c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n() {
        if (this.f4148c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (o()) {
            return;
        }
        ((j2) this.f3407b).P.incrementAndGet();
        this.f4148c = true;
    }

    public abstract boolean o();
}
