package D3;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(Throwable th) {
        if (th == null) {
            E3.f.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            g.d().f1260a.p(th);
        }
    }

    public static void b(String str) {
        g.d().f1260a.w("com.crashlytics.flutter.build-id.0", str);
    }
}
