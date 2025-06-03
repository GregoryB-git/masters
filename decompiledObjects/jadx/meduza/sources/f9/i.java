package f9;

import g9.k0;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f5506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5507b;

    public i(k0 k0Var, int i10) {
        this.f5506a = k0Var;
        this.f5507b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5506a.equals(iVar.f5506a) && this.f5507b == iVar.f5507b;
    }

    public final int hashCode() {
        return q0.g.c(this.f5507b) + (this.f5506a.hashCode() * 31);
    }
}
