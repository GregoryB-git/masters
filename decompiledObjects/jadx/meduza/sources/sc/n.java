package sc;

import java.util.Iterator;
import java.util.List;
import nc.s1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f14360a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kc.a] */
    static {
        String str;
        Object next;
        int i10 = v.f14369a;
        s1 s1Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator h10 = defpackage.g.h();
        ec.i.e(h10, "<this>");
        kc.f fVar = new kc.f(h10);
        if (!(fVar instanceof kc.a)) {
            fVar = new kc.a(fVar);
        }
        List<? extends m> N = kc.i.N(fVar);
        Iterator it = N.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int c10 = ((m) next).c();
                do {
                    Object next2 = it.next();
                    int c11 = ((m) next2).c();
                    if (c10 < c11) {
                        next = next2;
                        c10 = c11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        m mVar = (m) next;
        if (mVar != null) {
            try {
                s1Var = mVar.b(N);
            } catch (Throwable unused2) {
                mVar.a();
            }
            if (s1Var != null) {
                f14360a = s1Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
