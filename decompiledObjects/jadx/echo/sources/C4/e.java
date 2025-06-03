package C4;

/* loaded from: classes.dex */
public final class e extends v {

    /* renamed from: a, reason: collision with root package name */
    public static e f999a;

    public static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f999a == null) {
                    f999a = new e();
                }
                eVar = f999a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // C4.v
    public String b() {
        return "fragment_sampling_percentage";
    }

    @Override // C4.v
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(0.0d);
    }
}
