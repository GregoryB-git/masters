package R2;

/* renamed from: R2.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0506f1 extends G1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f5286b;

    public AbstractC0506f1(N2 n22) {
        super(n22);
        this.f5424a.n();
    }

    public abstract boolean A();

    public final void v() {
        if (!z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f5286b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        this.f5424a.R();
        this.f5286b = true;
    }

    public final void x() {
        if (this.f5286b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        y();
        this.f5424a.R();
        this.f5286b = true;
    }

    public final boolean z() {
        return this.f5286b;
    }

    public void y() {
    }
}
