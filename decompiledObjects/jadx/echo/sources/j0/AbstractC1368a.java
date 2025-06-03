package j0;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1368a {

    /* renamed from: o, reason: collision with root package name */
    public int f15385o;

    public final void l(int i7) {
        this.f15385o = i7 | this.f15385o;
    }

    public void m() {
        this.f15385o = 0;
    }

    public final boolean n(int i7) {
        return (this.f15385o & i7) == i7;
    }

    public final boolean o() {
        return n(268435456);
    }

    public final boolean p() {
        return n(4);
    }

    public final boolean r() {
        return n(134217728);
    }

    public final boolean s() {
        return n(1);
    }

    public final boolean u() {
        return n(536870912);
    }

    public final void w(int i7) {
        this.f15385o = i7;
    }
}
