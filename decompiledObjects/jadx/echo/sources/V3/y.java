package V3;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f6750a;

    public y(long j7) {
        this.f6750a = j7;
    }

    public long a() {
        return this.f6750a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y.class == obj.getClass() && this.f6750a == ((y) obj).f6750a;
    }

    public int hashCode() {
        long j7 = this.f6750a;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.f6750a + '}';
    }
}
