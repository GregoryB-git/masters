package C4;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: a, reason: collision with root package name */
    public static k f1006a;

    public static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            try {
                if (f1006a == null) {
                    f1006a = new k();
                }
                kVar = f1006a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // C4.v
    public String c() {
        return "fpr_disabled_android_versions";
    }

    public String d() {
        return "";
    }
}
