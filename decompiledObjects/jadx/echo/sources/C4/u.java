package C4;

/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    public static u f1016a;

    public static synchronized u f() {
        u uVar;
        synchronized (u.class) {
            try {
                if (f1016a == null) {
                    f1016a = new u();
                }
                uVar = f1016a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // C4.v
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(1.0d);
    }

    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
