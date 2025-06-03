package androidx.lifecycle;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final a f9722a;

    /* renamed from: b, reason: collision with root package name */
    public final t f9723b;

    public interface a {
        r a(Class cls);
    }

    public s(t tVar, a aVar) {
        this.f9722a = aVar;
        this.f9723b = tVar;
    }

    public r a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public r b(String str, Class cls) {
        r b7 = this.f9723b.b(str);
        if (cls.isInstance(b7)) {
            return b7;
        }
        r a7 = this.f9722a.a(cls);
        this.f9723b.d(str, a7);
        return a7;
    }
}
