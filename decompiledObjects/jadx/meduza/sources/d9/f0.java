package d9;

/* loaded from: classes.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public h0 f3668a;

    public f0(g0 g0Var) {
        this.f3668a = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return this.f3668a.equals(((f0) obj).f3668a);
    }

    public final int hashCode() {
        return this.f3668a.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("MemoryCacheSettings{gcSettings=");
        l10.append(this.f3668a);
        l10.append("}");
        return l10.toString();
    }
}
