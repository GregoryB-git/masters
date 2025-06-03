package m6;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static k f10281b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f10282c = new l(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public l f10283a;

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f10281b == null) {
                f10281b = new k();
            }
            kVar = f10281b;
        }
        return kVar;
    }
}
