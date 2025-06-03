package p6;

import X5.g;
import java.util.concurrent.CancellationException;

/* renamed from: p6.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1869q0 extends g.b {

    /* renamed from: n, reason: collision with root package name */
    public static final b f18550n = b.f18551o;

    /* renamed from: p6.q0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC1869q0 interfaceC1869q0, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1869q0.w(cancellationException);
        }

        public static Object b(InterfaceC1869q0 interfaceC1869q0, Object obj, g6.p pVar) {
            return g.b.a.a(interfaceC1869q0, obj, pVar);
        }

        public static g.b c(InterfaceC1869q0 interfaceC1869q0, g.c cVar) {
            return g.b.a.b(interfaceC1869q0, cVar);
        }

        public static /* synthetic */ X d(InterfaceC1869q0 interfaceC1869q0, boolean z7, boolean z8, g6.l lVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i7 & 1) != 0) {
                z7 = false;
            }
            if ((i7 & 2) != 0) {
                z8 = true;
            }
            return interfaceC1869q0.v(z7, z8, lVar);
        }

        public static X5.g e(InterfaceC1869q0 interfaceC1869q0, g.c cVar) {
            return g.b.a.c(interfaceC1869q0, cVar);
        }

        public static X5.g f(InterfaceC1869q0 interfaceC1869q0, X5.g gVar) {
            return g.b.a.d(interfaceC1869q0, gVar);
        }
    }

    /* renamed from: p6.q0$b */
    public static final class b implements g.c {

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ b f18551o = new b();
    }

    boolean a();

    X e(g6.l lVar);

    InterfaceC1869q0 getParent();

    r r(InterfaceC1871t interfaceC1871t);

    CancellationException s();

    boolean start();

    X v(boolean z7, boolean z8, g6.l lVar);

    void w(CancellationException cancellationException);
}
