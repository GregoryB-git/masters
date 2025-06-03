package R2;

/* renamed from: R2.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0550l3 extends AbstractC0557m3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f5409b;

    public AbstractC0550l3(N2 n22) {
        super(n22);
        this.f5424a.n();
    }

    public final void o() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.f5409b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (s()) {
            return;
        }
        this.f5424a.R();
        this.f5409b = true;
    }

    public final void q() {
        if (this.f5409b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        t();
        this.f5424a.R();
        this.f5409b = true;
    }

    public final boolean r() {
        return this.f5409b;
    }

    public abstract boolean s();

    public void t() {
    }
}
