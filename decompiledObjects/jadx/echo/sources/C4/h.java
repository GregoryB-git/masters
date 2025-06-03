package C4;

/* loaded from: classes.dex */
public final class h extends v {

    /* renamed from: a, reason: collision with root package name */
    public static h f1003a;

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f1003a == null) {
                    f1003a = new h();
                }
                hVar = f1003a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // C4.v
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    public Long d() {
        return 700L;
    }
}
