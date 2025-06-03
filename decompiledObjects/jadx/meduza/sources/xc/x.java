package xc;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p2.m0;

/* loaded from: classes.dex */
public final class x extends c {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f17296m;

    public x(Socket socket) {
        ec.i.e(socket, "socket");
        this.f17296m = socket;
    }

    @Override // xc.c
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xc.c
    public final void k() {
        Level level;
        StringBuilder sb2;
        Logger logger;
        Exception exc;
        try {
            this.f17296m.close();
        } catch (AssertionError e10) {
            if (!m0.Q(e10)) {
                throw e10;
            }
            Logger logger2 = p.f17277a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e10;
            logger = logger2;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f17296m);
            logger.log(level, sb2.toString(), (Throwable) exc);
        } catch (Exception e11) {
            Logger logger3 = p.f17277a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e11;
            logger = logger3;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f17296m);
            logger.log(level, sb2.toString(), (Throwable) exc);
        }
    }
}
