package W2;

/* loaded from: classes.dex */
public final class p extends l {
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6835o;

    public p(Object obj) {
        this.f6835o = obj;
    }

    @Override // W2.l
    public Object b() {
        return this.f6835o;
    }

    @Override // W2.l
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f6835o.equals(((p) obj).f6835o);
        }
        return false;
    }

    public int hashCode() {
        return this.f6835o.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f6835o + ")";
    }
}
