package p6;

/* renamed from: p6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1858l extends X5.d {

    /* renamed from: p6.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1858l interfaceC1858l, Throwable th, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                th = null;
            }
            return interfaceC1858l.o(th);
        }
    }

    void d(g6.l lVar);

    Object g(Object obj, Object obj2, g6.l lVar);

    void j(Object obj, g6.l lVar);

    boolean o(Throwable th);

    void p(Object obj);
}
