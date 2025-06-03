package R4;

import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC2157j;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f5774a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5776c;

    /* renamed from: d, reason: collision with root package name */
    public long f5777d;

    /* renamed from: e, reason: collision with root package name */
    public f f5778e;

    /* renamed from: f, reason: collision with root package name */
    public String f5779f;

    public t(String sessionId, String firstSessionId, int i7, long j7, f dataCollectionStatus, String firebaseInstallationId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        this.f5774a = sessionId;
        this.f5775b = firstSessionId;
        this.f5776c = i7;
        this.f5777d = j7;
        this.f5778e = dataCollectionStatus;
        this.f5779f = firebaseInstallationId;
    }

    public final f a() {
        return this.f5778e;
    }

    public final long b() {
        return this.f5777d;
    }

    public final String c() {
        return this.f5779f;
    }

    public final String d() {
        return this.f5775b;
    }

    public final String e() {
        return this.f5774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.a(this.f5774a, tVar.f5774a) && Intrinsics.a(this.f5775b, tVar.f5775b) && this.f5776c == tVar.f5776c && this.f5777d == tVar.f5777d && Intrinsics.a(this.f5778e, tVar.f5778e) && Intrinsics.a(this.f5779f, tVar.f5779f);
    }

    public final int f() {
        return this.f5776c;
    }

    public final void g(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f5779f = str;
    }

    public int hashCode() {
        return (((((((((this.f5774a.hashCode() * 31) + this.f5775b.hashCode()) * 31) + this.f5776c) * 31) + AbstractC2157j.a(this.f5777d)) * 31) + this.f5778e.hashCode()) * 31) + this.f5779f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f5774a + ", firstSessionId=" + this.f5775b + ", sessionIndex=" + this.f5776c + ", eventTimestampUs=" + this.f5777d + ", dataCollectionStatus=" + this.f5778e + ", firebaseInstallationId=" + this.f5779f + ')';
    }

    public /* synthetic */ t(String str, String str2, int i7, long j7, f fVar, String str3, int i8, kotlin.jvm.internal.g gVar) {
        this(str, str2, i7, j7, (i8 & 16) != 0 ? new f(null, null, 0.0d, 7, null) : fVar, (i8 & 32) != 0 ? "" : str3);
    }
}
