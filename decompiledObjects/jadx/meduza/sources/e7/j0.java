package e7;

/* loaded from: classes.dex */
public abstract class j0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f4356c;

    public j0(j2 j2Var) {
        super(j2Var);
        ((j2) this.f3407b).N++;
    }

    public abstract boolean s();

    public final void t() {
        if (!this.f4356c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (this.f4356c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (s()) {
            return;
        }
        ((j2) this.f3407b).P.incrementAndGet();
        this.f4356c = true;
    }
}
