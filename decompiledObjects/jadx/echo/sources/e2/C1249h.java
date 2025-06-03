package e2;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249h extends AbstractC1255n {

    /* renamed from: a, reason: collision with root package name */
    public final long f13877a;

    public C1249h(long j7) {
        this.f13877a = j7;
    }

    @Override // e2.AbstractC1255n
    public long c() {
        return this.f13877a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC1255n) && this.f13877a == ((AbstractC1255n) obj).c();
    }

    public int hashCode() {
        long j7 = this.f13877a;
        return ((int) (j7 ^ (j7 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f13877a + "}";
    }
}
