package z3;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f17508a;

    public final void l(int i10) {
        this.f17508a = i10 | this.f17508a;
    }

    public final boolean m(int i10) {
        return (this.f17508a & i10) == i10;
    }

    public final boolean n() {
        return m(Integer.MIN_VALUE);
    }
}
