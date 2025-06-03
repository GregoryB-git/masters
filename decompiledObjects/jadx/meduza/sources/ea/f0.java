package ea;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4912c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4913d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4914e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4915g;

    public f0(String str, String str2, int i10, long j10, j jVar, String str3, String str4) {
        ec.i.e(str, "sessionId");
        ec.i.e(str2, "firstSessionId");
        this.f4910a = str;
        this.f4911b = str2;
        this.f4912c = i10;
        this.f4913d = j10;
        this.f4914e = jVar;
        this.f = str3;
        this.f4915g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return ec.i.a(this.f4910a, f0Var.f4910a) && ec.i.a(this.f4911b, f0Var.f4911b) && this.f4912c == f0Var.f4912c && this.f4913d == f0Var.f4913d && ec.i.a(this.f4914e, f0Var.f4914e) && ec.i.a(this.f, f0Var.f) && ec.i.a(this.f4915g, f0Var.f4915g);
    }

    public final int hashCode() {
        int e10 = (a0.j.e(this.f4911b, this.f4910a.hashCode() * 31, 31) + this.f4912c) * 31;
        long j10 = this.f4913d;
        return this.f4915g.hashCode() + a0.j.e(this.f, (this.f4914e.hashCode() + ((e10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SessionInfo(sessionId=");
        l10.append(this.f4910a);
        l10.append(", firstSessionId=");
        l10.append(this.f4911b);
        l10.append(", sessionIndex=");
        l10.append(this.f4912c);
        l10.append(", eventTimestampUs=");
        l10.append(this.f4913d);
        l10.append(", dataCollectionStatus=");
        l10.append(this.f4914e);
        l10.append(", firebaseInstallationId=");
        l10.append(this.f);
        l10.append(", firebaseAuthenticationToken=");
        l10.append(this.f4915g);
        l10.append(')');
        return l10.toString();
    }
}
