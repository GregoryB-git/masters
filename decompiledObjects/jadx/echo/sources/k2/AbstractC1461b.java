package k2;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1461b {
    public static Object a(int i7, Object obj, InterfaceC1460a interfaceC1460a, InterfaceC1462c interfaceC1462c) {
        Object apply;
        if (i7 < 1) {
            return interfaceC1460a.apply(obj);
        }
        do {
            apply = interfaceC1460a.apply(obj);
            obj = interfaceC1462c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i7--;
        } while (i7 >= 1);
        return apply;
    }
}
