package p6;

/* renamed from: p6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1874w {
    public static final InterfaceC1872u a(InterfaceC1869q0 interfaceC1869q0) {
        return new C1873v(interfaceC1869q0);
    }

    public static /* synthetic */ InterfaceC1872u b(InterfaceC1869q0 interfaceC1869q0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC1869q0 = null;
        }
        return a(interfaceC1869q0);
    }

    public static final boolean c(InterfaceC1872u interfaceC1872u, Object obj) {
        Throwable b7 = V5.n.b(obj);
        return b7 == null ? interfaceC1872u.n(obj) : interfaceC1872u.l(b7);
    }
}
