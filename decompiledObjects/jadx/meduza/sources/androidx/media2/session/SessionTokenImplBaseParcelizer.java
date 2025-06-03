package androidx.media2.session;

import android.content.ComponentName;
import android.os.IBinder;
import b2.c;

/* loaded from: classes.dex */
public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(c cVar) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.f1117a = cVar.o(sessionTokenImplBase.f1117a, 1);
        sessionTokenImplBase.f1118b = cVar.o(sessionTokenImplBase.f1118b, 2);
        sessionTokenImplBase.f1119c = cVar.u(3, sessionTokenImplBase.f1119c);
        sessionTokenImplBase.f1120d = cVar.u(4, sessionTokenImplBase.f1120d);
        IBinder iBinder = sessionTokenImplBase.f1121e;
        if (cVar.l(5)) {
            iBinder = cVar.v();
        }
        sessionTokenImplBase.f1121e = iBinder;
        sessionTokenImplBase.f = (ComponentName) cVar.s(sessionTokenImplBase.f, 6);
        sessionTokenImplBase.f1122g = cVar.h(7, sessionTokenImplBase.f1122g);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, c cVar) {
        cVar.getClass();
        cVar.I(sessionTokenImplBase.f1117a, 1);
        cVar.I(sessionTokenImplBase.f1118b, 2);
        cVar.O(3, sessionTokenImplBase.f1119c);
        cVar.O(4, sessionTokenImplBase.f1120d);
        IBinder iBinder = sessionTokenImplBase.f1121e;
        cVar.y(5);
        cVar.P(iBinder);
        cVar.M(sessionTokenImplBase.f, 6);
        cVar.B(7, sessionTokenImplBase.f1122g);
    }
}
