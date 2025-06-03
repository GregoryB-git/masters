package p6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w0 extends B implements X, InterfaceC1859l0 {

    /* renamed from: r, reason: collision with root package name */
    public x0 f18555r;

    @Override // p6.InterfaceC1859l0
    public boolean a() {
        return true;
    }

    @Override // p6.X
    public void b() {
        w().u0(this);
    }

    @Override // p6.InterfaceC1859l0
    public C0 g() {
        return null;
    }

    @Override // u6.q
    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(w()) + ']';
    }

    public final x0 w() {
        x0 x0Var = this.f18555r;
        if (x0Var != null) {
            return x0Var;
        }
        Intrinsics.n("job");
        return null;
    }

    public final void x(x0 x0Var) {
        this.f18555r = x0Var;
    }
}
