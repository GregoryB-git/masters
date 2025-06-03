package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0769p f9071a = new C0770q();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0769p f9072b = c();

    public static AbstractC0769p a() {
        AbstractC0769p abstractC0769p = f9072b;
        if (abstractC0769p != null) {
            return abstractC0769p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC0769p b() {
        return f9071a;
    }

    public static AbstractC0769p c() {
        try {
            return (AbstractC0769p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
