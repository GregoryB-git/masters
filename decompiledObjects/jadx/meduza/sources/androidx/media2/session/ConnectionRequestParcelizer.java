package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(c cVar) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.f1050a = cVar.o(connectionRequest.f1050a, 0);
        connectionRequest.f1051b = cVar.u(1, connectionRequest.f1051b);
        connectionRequest.f1052c = cVar.o(connectionRequest.f1052c, 2);
        connectionRequest.f1053d = cVar.h(3, connectionRequest.f1053d);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, c cVar) {
        cVar.getClass();
        cVar.I(connectionRequest.f1050a, 0);
        cVar.O(1, connectionRequest.f1051b);
        cVar.I(connectionRequest.f1052c, 2);
        cVar.B(3, connectionRequest.f1053d);
    }
}
