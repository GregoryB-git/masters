package eb;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final n f5184a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f5185b;

    public o(n nVar, e1 e1Var) {
        this.f5184a = nVar;
        x6.b.y(e1Var, "status is null");
        this.f5185b = e1Var;
    }

    public static o a(n nVar) {
        x6.b.s("state is TRANSIENT_ERROR. Use forError() instead", nVar != n.TRANSIENT_FAILURE);
        return new o(nVar, e1.f5070e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f5184a.equals(oVar.f5184a) && this.f5185b.equals(oVar.f5185b);
    }

    public final int hashCode() {
        return this.f5184a.hashCode() ^ this.f5185b.hashCode();
    }

    public final String toString() {
        if (this.f5185b.e()) {
            return this.f5184a.toString();
        }
        return this.f5184a + "(" + this.f5185b + ")";
    }
}
