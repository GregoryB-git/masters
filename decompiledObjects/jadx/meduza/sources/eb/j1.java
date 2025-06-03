package eb;

import eb.p;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class j1 extends p.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5136a = Logger.getLogger(j1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<p> f5137b = new ThreadLocal<>();

    @Override // eb.p.b
    public final p a() {
        p pVar = f5137b.get();
        return pVar == null ? p.f5187b : pVar;
    }

    @Override // eb.p.b
    public final void b(p pVar, p pVar2) {
        ThreadLocal<p> threadLocal;
        if (a() != pVar) {
            f5136a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (pVar2 != p.f5187b) {
            threadLocal = f5137b;
        } else {
            threadLocal = f5137b;
            pVar2 = null;
        }
        threadLocal.set(pVar2);
    }

    @Override // eb.p.b
    public final p c(p pVar) {
        p a10 = a();
        f5137b.set(pVar);
        return a10;
    }
}
