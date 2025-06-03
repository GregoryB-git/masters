package androidx.media2.session;

import androidx.media2.common.MediaItem;
import b2.c;

/* loaded from: classes.dex */
public final class SessionResultParcelizer {
    public static SessionResult read(c cVar) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.f1111a = cVar.o(sessionResult.f1111a, 1);
        sessionResult.f1112b = cVar.q(2, sessionResult.f1112b);
        sessionResult.f1113c = cVar.h(3, sessionResult.f1113c);
        MediaItem mediaItem = (MediaItem) cVar.x(sessionResult.f1115e, 4);
        sessionResult.f1115e = mediaItem;
        sessionResult.f1114d = mediaItem;
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, c cVar) {
        cVar.getClass();
        MediaItem mediaItem = sessionResult.f1114d;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (sessionResult.f1115e == null) {
                    sessionResult.f1115e = a.a(sessionResult.f1114d);
                }
            }
        }
        cVar.I(sessionResult.f1111a, 1);
        cVar.J(2, sessionResult.f1112b);
        cVar.B(3, sessionResult.f1113c);
        cVar.R(sessionResult.f1115e, 4);
    }
}
