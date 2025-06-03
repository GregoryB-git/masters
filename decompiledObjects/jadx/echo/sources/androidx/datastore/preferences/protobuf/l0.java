package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class l0 {
    public abstract void a(Object obj, int i7, int i8);

    public abstract void b(Object obj, int i7, long j7);

    public abstract void c(Object obj, int i7, Object obj2);

    public abstract void d(Object obj, int i7, AbstractC0760g abstractC0760g);

    public abstract void e(Object obj, int i7, long j7);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, d0 d0Var) {
        while (d0Var.p() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    public final boolean m(Object obj, d0 d0Var) {
        int e7 = d0Var.e();
        int a7 = r0.a(e7);
        int b7 = r0.b(e7);
        if (b7 == 0) {
            e(obj, a7, d0Var.E());
            return true;
        }
        if (b7 == 1) {
            b(obj, a7, d0Var.f());
            return true;
        }
        if (b7 == 2) {
            d(obj, a7, d0Var.u());
            return true;
        }
        if (b7 != 3) {
            if (b7 == 4) {
                return false;
            }
            if (b7 != 5) {
                throw C0778z.d();
            }
            a(obj, a7, d0Var.n());
            return true;
        }
        Object n7 = n();
        int c7 = r0.c(a7, 4);
        l(n7, d0Var);
        if (c7 != d0Var.e()) {
            throw C0778z.a();
        }
        c(obj, a7, r(n7));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(d0 d0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, s0 s0Var);

    public abstract void t(Object obj, s0 s0Var);
}
