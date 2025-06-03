package Y3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7551b;

    public g(Object obj, Object obj2) {
        this.f7550a = obj;
        this.f7551b = obj2;
    }

    public Object a() {
        return this.f7550a;
    }

    public Object b() {
        return this.f7551b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Object obj2 = this.f7550a;
        if (obj2 == null ? gVar.f7550a != null : !obj2.equals(gVar.f7550a)) {
            return false;
        }
        Object obj3 = this.f7551b;
        Object obj4 = gVar.f7551b;
        return obj3 == null ? obj4 == null : obj3.equals(obj4);
    }

    public int hashCode() {
        Object obj = this.f7550a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f7551b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair(" + this.f7550a + "," + this.f7551b + ")";
    }
}
