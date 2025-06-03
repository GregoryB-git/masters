package androidx.media2.session;

import b2.c;
import java.util.Set;
import r.d;

/* loaded from: classes.dex */
public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(c cVar) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        Set<SessionCommand> set = sessionCommandGroup.f1110a;
        if (cVar.l(1)) {
            set = (Set) cVar.k(new d());
        }
        sessionCommandGroup.f1110a = set;
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, c cVar) {
        cVar.getClass();
        cVar.F(1, sessionCommandGroup.f1110a);
    }
}
