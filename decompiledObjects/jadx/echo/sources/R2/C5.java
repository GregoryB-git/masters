package R2;

/* loaded from: classes.dex */
public abstract class C5 extends AbstractC0649z5 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f4585c;

    public C5(D5 d52) {
        super(d52);
        this.f5633b.r0();
    }

    public final void u() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f4585c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        x();
        this.f5633b.q0();
        this.f4585c = true;
    }

    public final boolean w() {
        return this.f4585c;
    }

    public abstract boolean x();
}
