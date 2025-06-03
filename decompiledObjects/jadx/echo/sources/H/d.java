package H;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2114a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2115b;

    public d(Object obj, Object obj2) {
        this.f2114a = obj;
        this.f2115b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f2114a, this.f2114a) && c.a(dVar.f2115b, this.f2115b);
    }

    public int hashCode() {
        Object obj = this.f2114a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2115b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2114a + " " + this.f2115b + "}";
    }
}
