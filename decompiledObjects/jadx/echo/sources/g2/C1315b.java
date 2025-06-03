package g2;

import g2.g;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f14394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14395b;

    public C1315b(g.a aVar, long j7) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f14394a = aVar;
        this.f14395b = j7;
    }

    @Override // g2.g
    public long b() {
        return this.f14395b;
    }

    @Override // g2.g
    public g.a c() {
        return this.f14394a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14394a.equals(gVar.c()) && this.f14395b == gVar.b();
    }

    public int hashCode() {
        int hashCode = (this.f14394a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f14395b;
        return hashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f14394a + ", nextRequestWaitMillis=" + this.f14395b + "}";
    }
}
