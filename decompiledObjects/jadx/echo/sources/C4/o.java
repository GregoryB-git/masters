package C4;

/* loaded from: classes.dex */
public final class o extends v {

    /* renamed from: a, reason: collision with root package name */
    public static o f1010a;

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f1010a == null) {
                    f1010a = new o();
                }
                oVar = f1010a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // C4.v
    public String b() {
        return "sessions_max_length_minutes";
    }

    @Override // C4.v
    public String c() {
        return "fpr_session_max_duration_min";
    }

    public Long d() {
        return 240L;
    }
}
