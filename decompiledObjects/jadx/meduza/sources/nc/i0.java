package nc;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f11506a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        l0 l0Var;
        int i10 = sc.v.f14369a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            tc.c cVar = r0.f11545a;
            s1 s1Var = sc.n.f14360a;
            s1Var.C0();
            if (s1Var instanceof l0) {
                l0Var = (l0) s1Var;
                f11506a = l0Var;
            }
        }
        l0Var = h0.f11502r;
        f11506a = l0Var;
    }
}
