package C4;

/* loaded from: classes.dex */
public final class g extends v {

    /* renamed from: a, reason: collision with root package name */
    public static g f1002a;

    public static synchronized g e() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f1002a == null) {
                    f1002a = new g();
                }
                gVar = f1002a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // C4.v
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    public Long d() {
        return 70L;
    }
}
