package nc;

/* loaded from: classes.dex */
public final class f2 extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11494c = 0;

    static {
        new f2();
    }

    @Override // nc.a0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        j2 j2Var = (j2) hVar.get(j2.f11510c);
        if (j2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        j2Var.f11511b = true;
    }
}
