package C4;

/* loaded from: classes.dex */
public final class i extends v {

    /* renamed from: a, reason: collision with root package name */
    public static i f1004a;

    public static synchronized i f() {
        i iVar;
        synchronized (i.class) {
            try {
                if (f1004a == null) {
                    f1004a = new i();
                }
                iVar = f1004a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // C4.v
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    public Double d() {
        return Double.valueOf(1.0d);
    }

    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
