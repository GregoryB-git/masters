package B3;

import java.util.Set;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;

/* renamed from: B3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0343d {
    public static Object a(InterfaceC0344e interfaceC0344e, F f7) {
        InterfaceC1922b b7 = interfaceC0344e.b(f7);
        if (b7 == null) {
            return null;
        }
        return b7.get();
    }

    public static Object b(InterfaceC0344e interfaceC0344e, Class cls) {
        return interfaceC0344e.h(F.b(cls));
    }

    public static InterfaceC1921a c(InterfaceC0344e interfaceC0344e, Class cls) {
        return interfaceC0344e.d(F.b(cls));
    }

    public static InterfaceC1922b d(InterfaceC0344e interfaceC0344e, Class cls) {
        return interfaceC0344e.b(F.b(cls));
    }

    public static Set e(InterfaceC0344e interfaceC0344e, F f7) {
        return (Set) interfaceC0344e.f(f7).get();
    }

    public static Set f(InterfaceC0344e interfaceC0344e, Class cls) {
        return interfaceC0344e.e(F.b(cls));
    }
}
