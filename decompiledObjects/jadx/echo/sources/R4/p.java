package R4;

import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC2157j;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f5758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5759b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5760c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5761d;

    public p(String sessionId, String firstSessionId, int i7, long j7) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f5758a = sessionId;
        this.f5759b = firstSessionId;
        this.f5760c = i7;
        this.f5761d = j7;
    }

    public final String a() {
        return this.f5759b;
    }

    public final String b() {
        return this.f5758a;
    }

    public final int c() {
        return this.f5760c;
    }

    public final long d() {
        return this.f5761d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.f5758a, pVar.f5758a) && Intrinsics.a(this.f5759b, pVar.f5759b) && this.f5760c == pVar.f5760c && this.f5761d == pVar.f5761d;
    }

    public int hashCode() {
        return (((((this.f5758a.hashCode() * 31) + this.f5759b.hashCode()) * 31) + this.f5760c) * 31) + AbstractC2157j.a(this.f5761d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f5758a + ", firstSessionId=" + this.f5759b + ", sessionIndex=" + this.f5760c + ", sessionStartTimestampUs=" + this.f5761d + ')';
    }
}
