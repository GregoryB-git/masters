package C4;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    public static t f1015a;

    public static synchronized t e() {
        t tVar;
        synchronized (t.class) {
            try {
                if (f1015a == null) {
                    f1015a = new t();
                }
                tVar = f1015a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // C4.v
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    public Long d() {
        return 300L;
    }
}
