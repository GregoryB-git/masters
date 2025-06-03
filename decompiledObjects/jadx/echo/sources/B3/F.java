package B3;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final Class f737a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f738b;

    public @interface a {
    }

    public F(Class cls, Class cls2) {
        this.f737a = cls;
        this.f738b = cls2;
    }

    public static F a(Class cls, Class cls2) {
        return new F(cls, cls2);
    }

    public static F b(Class cls) {
        return new F(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f7 = (F) obj;
        if (this.f738b.equals(f7.f738b)) {
            return this.f737a.equals(f7.f737a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f738b.hashCode() * 31) + this.f737a.hashCode();
    }

    public String toString() {
        if (this.f737a == a.class) {
            return this.f738b.getName();
        }
        return "@" + this.f737a.getName() + " " + this.f738b.getName();
    }
}
