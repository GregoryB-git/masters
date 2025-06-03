package C4;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public static n f1009a;

    public static synchronized n f() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f1009a == null) {
                    f1009a = new n();
                }
                nVar = f1009a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // C4.v
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // C4.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }

    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
