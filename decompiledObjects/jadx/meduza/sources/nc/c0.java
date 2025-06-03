package nc;

import nc.b0;

/* loaded from: classes.dex */
public final class c0 {
    public static final void a(ub.h hVar, Throwable th) {
        try {
            b0 b0Var = (b0) hVar.get(b0.a.f11471a);
            if (b0Var != null) {
                b0Var.I(hVar, th);
            } else {
                p2.m0.M(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                x6.b.e(runtimeException, th);
                th = runtimeException;
            }
            p2.m0.M(hVar, th);
        }
    }
}
