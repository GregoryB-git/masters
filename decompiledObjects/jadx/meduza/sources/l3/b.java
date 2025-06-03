package l3;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9542a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9543b;

    public b(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f9542a = i10;
        this.f9543b = j10;
    }

    @Override // l3.g
    public final long a() {
        return this.f9543b;
    }

    @Override // l3.g
    public final int b() {
        return this.f9542a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return q0.g.b(this.f9542a, gVar.b()) && this.f9543b == gVar.a();
    }

    public final int hashCode() {
        int c10 = (q0.g.c(this.f9542a) ^ 1000003) * 1000003;
        long j10 = this.f9543b;
        return c10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BackendResponse{status=");
        l10.append(defpackage.g.r(this.f9542a));
        l10.append(", nextRequestWaitMillis=");
        l10.append(this.f9543b);
        l10.append("}");
        return l10.toString();
    }
}
