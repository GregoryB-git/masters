package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class SessionCommandParcelizer {
    public static SessionCommand read(c cVar) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.f1107a = cVar.o(sessionCommand.f1107a, 1);
        sessionCommand.f1108b = cVar.u(2, sessionCommand.f1108b);
        sessionCommand.f1109c = cVar.h(3, sessionCommand.f1109c);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, c cVar) {
        cVar.getClass();
        cVar.I(sessionCommand.f1107a, 1);
        cVar.O(2, sessionCommand.f1108b);
        cVar.B(3, sessionCommand.f1109c);
    }
}
