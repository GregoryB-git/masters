package e7;

/* loaded from: classes.dex */
public abstract class h6 extends z5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f4304d;

    public h6(i6 i6Var) {
        super(i6Var);
        this.f4804c.f4345z++;
    }

    public final void p() {
        if (!this.f4304d) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f4304d) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r();
        this.f4804c.A++;
        this.f4304d = true;
    }

    public abstract boolean r();
}
