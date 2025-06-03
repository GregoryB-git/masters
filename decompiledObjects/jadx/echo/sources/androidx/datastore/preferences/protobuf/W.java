package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final U f8931a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final U f8932b = new V();

    public static U a() {
        return f8931a;
    }

    public static U b() {
        return f8932b;
    }

    public static U c() {
        try {
            return (U) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
