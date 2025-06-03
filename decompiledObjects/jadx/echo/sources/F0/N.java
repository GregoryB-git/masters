package F0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: c, reason: collision with root package name */
    public static final N f1793c = new N(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f1794a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1795b;

    public N(long j7, long j8) {
        this.f1794a = j7;
        this.f1795b = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n7 = (N) obj;
        return this.f1794a == n7.f1794a && this.f1795b == n7.f1795b;
    }

    public int hashCode() {
        return (((int) this.f1794a) * 31) + ((int) this.f1795b);
    }

    public String toString() {
        return "[timeUs=" + this.f1794a + ", position=" + this.f1795b + "]";
    }
}
