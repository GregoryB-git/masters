package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import b2.c;
import b2.e;

/* loaded from: classes.dex */
public final class SessionTokenImplLegacyParcelizer {
    public static SessionTokenImplLegacy read(c cVar) {
        MediaSessionCompat.Token token;
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.f1124b = cVar.h(1, sessionTokenImplLegacy.f1124b);
        sessionTokenImplLegacy.f1125c = cVar.o(sessionTokenImplLegacy.f1125c, 2);
        sessionTokenImplLegacy.f1126d = cVar.o(sessionTokenImplLegacy.f1126d, 3);
        sessionTokenImplLegacy.f1127e = (ComponentName) cVar.s(sessionTokenImplLegacy.f1127e, 4);
        sessionTokenImplLegacy.f = cVar.u(5, sessionTokenImplLegacy.f);
        sessionTokenImplLegacy.f1128g = cVar.h(6, sessionTokenImplLegacy.f1128g);
        Bundle bundle = sessionTokenImplLegacy.f1124b;
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.Token.class.getClassLoader());
            android.support.v4.media.session.IMediaSession asInterface = IMediaSession.Stub.asInterface(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
            e b10 = b2.a.b(bundle);
            MediaSessionCompat.Token token2 = (MediaSessionCompat.Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token2 != null) {
                token = new MediaSessionCompat.Token(token2.f491b, asInterface, b10);
                sessionTokenImplLegacy.f1123a = token;
                return sessionTokenImplLegacy;
            }
        }
        token = null;
        sessionTokenImplLegacy.f1123a = token;
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, c cVar) {
        e eVar;
        cVar.getClass();
        MediaSessionCompat.Token token = sessionTokenImplLegacy.f1123a;
        if (token != null) {
            synchronized (token) {
                MediaSessionCompat.Token token2 = sessionTokenImplLegacy.f1123a;
                synchronized (token2.f490a) {
                    eVar = token2.f493d;
                }
                MediaSessionCompat.Token token3 = sessionTokenImplLegacy.f1123a;
                synchronized (token3.f490a) {
                    token3.f493d = null;
                }
                sessionTokenImplLegacy.f1124b = sessionTokenImplLegacy.f1123a.b();
                MediaSessionCompat.Token token4 = sessionTokenImplLegacy.f1123a;
                synchronized (token4.f490a) {
                    token4.f493d = eVar;
                }
            }
        } else {
            sessionTokenImplLegacy.f1124b = null;
        }
        cVar.B(1, sessionTokenImplLegacy.f1124b);
        cVar.I(sessionTokenImplLegacy.f1125c, 2);
        cVar.I(sessionTokenImplLegacy.f1126d, 3);
        cVar.M(sessionTokenImplLegacy.f1127e, 4);
        cVar.O(5, sessionTokenImplLegacy.f);
        cVar.B(6, sessionTokenImplLegacy.f1128g);
    }
}
