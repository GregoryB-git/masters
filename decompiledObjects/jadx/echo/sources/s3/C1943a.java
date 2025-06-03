package s3;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1943a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f19230a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19231b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19232c;

    public C1943a(long j7, long j8, long j9) {
        this.f19230a = j7;
        this.f19231b = j8;
        this.f19232c = j9;
    }

    @Override // s3.n
    public long b() {
        return this.f19231b;
    }

    @Override // s3.n
    public long c() {
        return this.f19230a;
    }

    @Override // s3.n
    public long d() {
        return this.f19232c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f19230a == nVar.c() && this.f19231b == nVar.b() && this.f19232c == nVar.d();
    }

    public int hashCode() {
        long j7 = this.f19230a;
        long j8 = this.f19231b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f19232c;
        return i7 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f19230a + ", elapsedRealtime=" + this.f19231b + ", uptimeMillis=" + this.f19232c + "}";
    }
}
