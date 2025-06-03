package ib;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

/* loaded from: classes.dex */
public final class f implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final Method run() {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
