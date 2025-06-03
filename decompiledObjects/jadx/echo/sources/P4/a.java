package P4;

import java.util.Set;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4238a;

    public a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f4238a = set;
    }

    @Override // P4.b
    public Set b() {
        return this.f4238a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4238a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f4238a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f4238a + "}";
    }
}
