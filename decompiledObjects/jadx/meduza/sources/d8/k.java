package d8;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t<?> f3610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3612c;

    public k(int i10, int i11, Class cls) {
        this((t<?>) t.a(cls), i10, i11);
    }

    public k(t<?> tVar, int i10, int i11) {
        if (tVar == null) {
            throw new NullPointerException("Null dependency anInterface.");
        }
        this.f3610a = tVar;
        this.f3611b = i10;
        this.f3612c = i11;
    }

    public static k a(Class<?> cls) {
        return new k(0, 2, cls);
    }

    public static k b(Class<?> cls) {
        return new k(0, 1, cls);
    }

    public static k c(t<?> tVar) {
        return new k(tVar, 1, 0);
    }

    public static k d(Class<?> cls) {
        return new k(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3610a.equals(kVar.f3610a) && this.f3611b == kVar.f3611b && this.f3612c == kVar.f3612c;
    }

    public final int hashCode() {
        return ((((this.f3610a.hashCode() ^ 1000003) * 1000003) ^ this.f3611b) * 1000003) ^ this.f3612c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f3610a);
        sb2.append(", type=");
        int i10 = this.f3611b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f3612c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(defpackage.f.h("Unsupported injection: ", i11));
            }
            str = "deferred";
        }
        return defpackage.g.f(sb2, str, "}");
    }
}
