package ea;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f4960a;

    public p(String str) {
        this.f4960a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && ec.i.a(this.f4960a, ((p) obj).f4960a);
    }

    public final int hashCode() {
        String str = this.f4960a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FirebaseSessionsData(sessionId=");
        l10.append(this.f4960a);
        l10.append(')');
        return l10.toString();
    }
}
