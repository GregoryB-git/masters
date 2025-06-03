package ea;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f5003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5005c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5006d;

    public x(String str, String str2, int i10, long j10) {
        ec.i.e(str, "sessionId");
        ec.i.e(str2, "firstSessionId");
        this.f5003a = str;
        this.f5004b = str2;
        this.f5005c = i10;
        this.f5006d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return ec.i.a(this.f5003a, xVar.f5003a) && ec.i.a(this.f5004b, xVar.f5004b) && this.f5005c == xVar.f5005c && this.f5006d == xVar.f5006d;
    }

    public final int hashCode() {
        int e10 = (a0.j.e(this.f5004b, this.f5003a.hashCode() * 31, 31) + this.f5005c) * 31;
        long j10 = this.f5006d;
        return e10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SessionDetails(sessionId=");
        l10.append(this.f5003a);
        l10.append(", firstSessionId=");
        l10.append(this.f5004b);
        l10.append(", sessionIndex=");
        l10.append(this.f5005c);
        l10.append(", sessionStartTimestampUs=");
        l10.append(this.f5006d);
        l10.append(')');
        return l10.toString();
    }
}
