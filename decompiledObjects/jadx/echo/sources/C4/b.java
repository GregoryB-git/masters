package C4;

/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: a, reason: collision with root package name */
    public static b f996a;

    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f996a == null) {
                    f996a = new b();
                }
                bVar = f996a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // C4.v
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}
