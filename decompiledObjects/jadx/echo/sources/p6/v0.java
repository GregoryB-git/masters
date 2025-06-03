package p6;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v0 {
    public static final InterfaceC1875x a(InterfaceC1869q0 interfaceC1869q0) {
        return new t0(interfaceC1869q0);
    }

    public static /* synthetic */ InterfaceC1875x b(InterfaceC1869q0 interfaceC1869q0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC1869q0 = null;
        }
        return u0.a(interfaceC1869q0);
    }

    public static final void c(X5.g gVar, CancellationException cancellationException) {
        InterfaceC1869q0 interfaceC1869q0 = (InterfaceC1869q0) gVar.b(InterfaceC1869q0.f18550n);
        if (interfaceC1869q0 != null) {
            interfaceC1869q0.w(cancellationException);
        }
    }

    public static final void d(X5.g gVar) {
        InterfaceC1869q0 interfaceC1869q0 = (InterfaceC1869q0) gVar.b(InterfaceC1869q0.f18550n);
        if (interfaceC1869q0 != null) {
            u0.e(interfaceC1869q0);
        }
    }

    public static final void e(InterfaceC1869q0 interfaceC1869q0) {
        if (!interfaceC1869q0.a()) {
            throw interfaceC1869q0.s();
        }
    }
}
