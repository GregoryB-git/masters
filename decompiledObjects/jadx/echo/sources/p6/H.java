package p6;

import u6.AbstractC2038h;

/* loaded from: classes.dex */
public abstract class H {
    public static final void a(X5.g gVar, Throwable th) {
        try {
            G g7 = (G) gVar.b(G.f18492m);
            if (g7 != null) {
                g7.h(gVar, th);
            } else {
                AbstractC2038h.a(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC2038h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        V5.b.a(runtimeException, th);
        return runtimeException;
    }
}
