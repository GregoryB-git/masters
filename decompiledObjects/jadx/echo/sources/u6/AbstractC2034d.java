package u6;

/* renamed from: u6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2034d {

    /* renamed from: a, reason: collision with root package name */
    public static final F f19975a = new F("CLOSED");

    public static final AbstractC2035e b(AbstractC2035e abstractC2035e) {
        while (true) {
            Object f7 = abstractC2035e.f();
            if (f7 == f19975a) {
                return abstractC2035e;
            }
            AbstractC2035e abstractC2035e2 = (AbstractC2035e) f7;
            if (abstractC2035e2 != null) {
                abstractC2035e = abstractC2035e2;
            } else if (abstractC2035e.j()) {
                return abstractC2035e;
            }
        }
    }

    public static final Object c(C c7, long j7, g6.p pVar) {
        while (true) {
            if (c7.f19955q >= j7 && !c7.h()) {
                return D.a(c7);
            }
            Object f7 = c7.f();
            if (f7 == f19975a) {
                return D.a(f19975a);
            }
            C c8 = (C) ((AbstractC2035e) f7);
            if (c8 == null) {
                c8 = (C) pVar.invoke(Long.valueOf(c7.f19955q + 1), c7);
                if (c7.l(c8)) {
                    if (c7.h()) {
                        c7.k();
                    }
                }
            }
            c7 = c8;
        }
    }
}
