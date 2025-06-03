package androidx.media2.session;

import b2.e;

/* loaded from: classes.dex */
public final class SessionToken implements e {

    /* renamed from: a, reason: collision with root package name */
    public SessionTokenImpl f1116a;

    public interface SessionTokenImpl extends e {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SessionToken) {
            return this.f1116a.equals(((SessionToken) obj).f1116a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1116a.hashCode();
    }

    public final String toString() {
        return this.f1116a.toString();
    }
}
