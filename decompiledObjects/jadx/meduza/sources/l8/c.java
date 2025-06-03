package l8;

import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9758a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9759b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f9760c;

    public c(String str, long j10, Map<String, String> map) {
        ec.i.e(map, "additionalCustomKeys");
        this.f9758a = str;
        this.f9759b = j10;
        this.f9760c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return ec.i.a(this.f9758a, cVar.f9758a) && this.f9759b == cVar.f9759b && ec.i.a(this.f9760c, cVar.f9760c);
    }

    public final int hashCode() {
        int hashCode = this.f9758a.hashCode() * 31;
        long j10 = this.f9759b;
        return this.f9760c.hashCode() + ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("EventMetadata(sessionId=");
        l10.append(this.f9758a);
        l10.append(", timestamp=");
        l10.append(this.f9759b);
        l10.append(", additionalCustomKeys=");
        l10.append(this.f9760c);
        l10.append(')');
        return l10.toString();
    }
}
