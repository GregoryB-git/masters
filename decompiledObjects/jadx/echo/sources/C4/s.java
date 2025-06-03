package C4;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: a, reason: collision with root package name */
    public static s f1014a;

    public static synchronized s e() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f1014a == null) {
                    f1014a = new s();
                }
                sVar = f1014a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // C4.v
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    public Long d() {
        return 30L;
    }
}
