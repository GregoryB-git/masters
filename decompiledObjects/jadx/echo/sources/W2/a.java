package W2;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: o, reason: collision with root package name */
    public static final a f6807o = new a();
    private static final long serialVersionUID = 0;

    public static l e() {
        return f6807o;
    }

    private Object readResolve() {
        return f6807o;
    }

    @Override // W2.l
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // W2.l
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
