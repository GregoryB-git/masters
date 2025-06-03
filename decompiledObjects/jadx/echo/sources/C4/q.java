package C4;

/* loaded from: classes.dex */
public final class q extends v {

    /* renamed from: a, reason: collision with root package name */
    public static q f1012a;

    public static synchronized q f() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f1012a == null) {
                    f1012a = new q();
                }
                qVar = f1012a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // C4.v
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // C4.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }

    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
