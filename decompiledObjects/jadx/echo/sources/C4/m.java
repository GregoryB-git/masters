package C4;

/* loaded from: classes.dex */
public final class m extends v {

    /* renamed from: a, reason: collision with root package name */
    public static m f1008a;

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f1008a == null) {
                    f1008a = new m();
                }
                mVar = f1008a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // C4.v
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // C4.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}
