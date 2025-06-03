package ib;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class h implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final Method run() {
        return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
