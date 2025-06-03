package androidx.media2.session;

import b2.e;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class SessionCommandGroup implements e {

    /* renamed from: a, reason: collision with root package name */
    public Set<SessionCommand> f1110a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        Set<SessionCommand> set = this.f1110a;
        Set<SessionCommand> set2 = ((SessionCommandGroup) obj).f1110a;
        return set == null ? set2 == null : set.equals(set2);
    }

    public final int hashCode() {
        Set<SessionCommand> set = this.f1110a;
        if (set != null) {
            return set.hashCode();
        }
        return 0;
    }
}
