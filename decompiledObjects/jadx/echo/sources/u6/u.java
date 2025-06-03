package u6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p6.B0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f20012a;

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f20013b;

    static {
        u uVar = new u();
        f20012a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        f20013b = uVar.a();
    }

    public final B0 a() {
        n6.b a7;
        List e7;
        Object next;
        B0 e8;
        try {
            a7 = n6.f.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator());
            e7 = n6.h.e(a7);
            Iterator it = e7.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c7 = ((t) next).c();
                    do {
                        Object next2 = it.next();
                        int c8 = ((t) next2).c();
                        if (c7 < c8) {
                            next = next2;
                            c7 = c8;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            t tVar = (t) next;
            if (tVar != null && (e8 = v.e(tVar, e7)) != null) {
                return e8;
            }
            return v.b(null, null, 3, null);
        } catch (Throwable th) {
            return v.b(th, null, 2, null);
        }
    }
}
