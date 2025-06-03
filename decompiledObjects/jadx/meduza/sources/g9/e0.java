package g9;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5929a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.l f5930b;

    public e0(int i10, j9.l lVar) {
        this.f5929a = i10;
        this.f5930b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e0)) {
            e0 e0Var = (e0) obj;
            if (this.f5929a == e0Var.f5929a && this.f5930b.equals(e0Var.f5930b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5930b.hashCode() + ((q0.g.c(this.f5929a) + 899) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5929a == 1 ? "" : "-");
        sb2.append(this.f5930b.h());
        return sb2.toString();
    }
}
