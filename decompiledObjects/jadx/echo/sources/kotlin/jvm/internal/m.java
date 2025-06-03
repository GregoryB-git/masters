package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: o, reason: collision with root package name */
    public final Class f16225o;

    /* renamed from: p, reason: collision with root package name */
    public final String f16226p;

    public m(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f16225o = jClass;
        this.f16226p = moduleName;
    }

    @Override // kotlin.jvm.internal.d
    public Class b() {
        return this.f16225o;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && Intrinsics.a(b(), ((m) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
