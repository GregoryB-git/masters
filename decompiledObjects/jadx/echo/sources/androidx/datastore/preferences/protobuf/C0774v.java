package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0774v implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C0774v f9185a = new C0774v();

    public static C0774v c() {
        return f9185a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public M a(Class cls) {
        if (!AbstractC0775w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC0775w.u(cls.asSubclass(AbstractC0775w.class)).n();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean b(Class cls) {
        return AbstractC0775w.class.isAssignableFrom(cls);
    }
}
