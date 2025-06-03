package C4;

/* loaded from: classes.dex */
public final class p extends v {

    /* renamed from: a, reason: collision with root package name */
    public static p f1011a;

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f1011a == null) {
                    f1011a = new p();
                }
                pVar = f1011a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // C4.v
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // C4.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}
