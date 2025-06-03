package D6;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static d f1504a;

    /* renamed from: b, reason: collision with root package name */
    public static long f1505b;

    public static void a(d dVar) {
        if (dVar.f1502f != null || dVar.f1503g != null) {
            throw new IllegalArgumentException();
        }
        if (dVar.f1500d) {
            return;
        }
        synchronized (e.class) {
            try {
                long j7 = f1505b;
                if (j7 + 8192 > 65536) {
                    return;
                }
                f1505b = j7 + 8192;
                dVar.f1502f = f1504a;
                dVar.f1499c = 0;
                dVar.f1498b = 0;
                f1504a = dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d b() {
        synchronized (e.class) {
            try {
                d dVar = f1504a;
                if (dVar == null) {
                    return new d();
                }
                f1504a = dVar.f1502f;
                dVar.f1502f = null;
                f1505b -= 8192;
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
