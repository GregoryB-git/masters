package C4;

/* loaded from: classes.dex */
public final class c extends v {

    /* renamed from: a, reason: collision with root package name */
    public static c f997a;

    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f997a == null) {
                    f997a = new c();
                }
                cVar = f997a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // C4.v
    public String a() {
        return "isEnabled";
    }

    @Override // C4.v
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
