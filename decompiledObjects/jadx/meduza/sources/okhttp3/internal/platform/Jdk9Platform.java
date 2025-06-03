package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
final class Jdk9Platform extends Platform {

    /* renamed from: c, reason: collision with root package name */
    public final Method f12657c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f12658d;

    public Jdk9Platform(Method method, Method method2) {
        this.f12657c = method;
        this.f12658d = method2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b10 = Platform.b(list);
            this.f12657c.invoke(sSLParameters, b10.toArray(new String[b10.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw Util.a("unable to set ssl parameters", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f12658d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw Util.a("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw Util.a("failed to get ALPN selected protocol", e11);
        }
    }
}
