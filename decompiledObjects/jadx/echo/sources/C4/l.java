package C4;

/* loaded from: classes.dex */
public final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    public static l f1007a;

    public static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            try {
                if (f1007a == null) {
                    f1007a = new l();
                }
                lVar = f1007a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // C4.v
    public String c() {
        return "fpr_enabled";
    }

    public Boolean d() {
        return Boolean.TRUE;
    }
}
