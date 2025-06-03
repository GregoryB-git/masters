package C4;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: a, reason: collision with root package name */
    public static r f1013a;

    public static synchronized r f() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f1013a == null) {
                    f1013a = new r();
                }
                rVar = f1013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // C4.v
    public String b() {
        return "sessions_sampling_percentage";
    }

    @Override // C4.v
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(0.01d);
    }

    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
