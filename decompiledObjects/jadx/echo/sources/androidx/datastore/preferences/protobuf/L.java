package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final J f8906a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final J f8907b = new K();

    public static J a() {
        return f8906a;
    }

    public static J b() {
        return f8907b;
    }

    public static J c() {
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
