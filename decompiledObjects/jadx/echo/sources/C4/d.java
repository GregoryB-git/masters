package C4;

/* loaded from: classes.dex */
public final class d extends v {

    /* renamed from: a, reason: collision with root package name */
    public static d f998a;

    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f998a == null) {
                    f998a = new d();
                }
                dVar = f998a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // C4.v
    public String b() {
        return "experiment_app_start_ttid";
    }

    @Override // C4.v
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}
