package w4;

/* loaded from: classes.dex */
public class b implements InterfaceC2104a {

    /* renamed from: a, reason: collision with root package name */
    public static b f20400a;

    public static b b() {
        if (f20400a == null) {
            f20400a = new b();
        }
        return f20400a;
    }

    @Override // w4.InterfaceC2104a
    public long a() {
        return System.currentTimeMillis();
    }
}
