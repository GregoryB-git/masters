package C4;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: a, reason: collision with root package name */
    public static j f1005a;

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f1005a == null) {
                    f1005a = new j();
                }
                jVar = f1005a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // C4.v
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    public Long d() {
        return 600L;
    }
}
