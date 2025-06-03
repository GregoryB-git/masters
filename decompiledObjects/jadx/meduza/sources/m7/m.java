package m7;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final int f10366a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10367b;

    public m(int i10, long j10) {
        this.f10366a = i10;
        this.f10367b = j10;
    }

    @Override // m7.n
    public final int a() {
        return this.f10366a;
    }

    @Override // m7.n
    public final long b() {
        return this.f10367b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f10366a == nVar.a() && this.f10367b == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10367b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f10366a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("EventRecord{eventType=");
        l10.append(this.f10366a);
        l10.append(", eventTimestamp=");
        l10.append(this.f10367b);
        l10.append("}");
        return l10.toString();
    }
}
