package u6;

import java.util.Iterator;

/* renamed from: u6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2038h {
    public static final void a(X5.g gVar, Throwable th) {
        Iterator it = AbstractC2037g.a().iterator();
        while (it.hasNext()) {
            try {
                ((p6.G) it.next()).h(gVar, th);
            } catch (Throwable th2) {
                AbstractC2037g.b(p6.H.b(th, th2));
            }
        }
        try {
            V5.b.a(th, new C2039i(gVar));
        } catch (Throwable unused) {
        }
        AbstractC2037g.b(th);
    }
}
