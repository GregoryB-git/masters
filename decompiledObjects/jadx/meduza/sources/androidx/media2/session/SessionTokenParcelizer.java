package androidx.media2.session;

import androidx.media2.session.SessionToken;
import b2.c;

/* loaded from: classes.dex */
public final class SessionTokenParcelizer {
    public static SessionToken read(c cVar) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.f1116a = (SessionToken.SessionTokenImpl) cVar.x(sessionToken.f1116a, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, c cVar) {
        cVar.getClass();
        cVar.R(sessionToken.f1116a, 1);
    }
}
