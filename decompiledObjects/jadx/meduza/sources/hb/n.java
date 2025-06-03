package hb;

import ib.b;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final List<ib.j> f7332a = Collections.unmodifiableList(Arrays.asList(ib.j.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, ib.b bVar) {
        x6.b.y(sSLSocketFactory, "sslSocketFactory");
        x6.b.y(socket, "socket");
        x6.b.y(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        String[] strArr = bVar.f7901b != null ? (String[]) ib.l.a(bVar.f7901b, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr2 = (String[]) ib.l.a(bVar.f7902c, sSLSocket.getEnabledProtocols());
        b.a aVar = new b.a(bVar);
        if (!aVar.f7904a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr == null) {
            aVar.f7905b = null;
        } else {
            aVar.f7905b = (String[]) strArr.clone();
        }
        if (!aVar.f7904a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr2 == null) {
            aVar.f7906c = null;
        } else {
            aVar.f7906c = (String[]) strArr2.clone();
        }
        ib.b bVar2 = new ib.b(aVar);
        sSLSocket.setEnabledProtocols(bVar2.f7902c);
        String[] strArr3 = bVar2.f7901b;
        if (strArr3 != null) {
            sSLSocket.setEnabledCipherSuites(strArr3);
        }
        String d10 = k.f7317d.d(sSLSocket, str, bVar.f7903d ? f7332a : null);
        List<ib.j> list = f7332a;
        ib.j jVar = ib.j.HTTP_1_0;
        if (!d10.equals("http/1.0")) {
            jVar = ib.j.HTTP_1_1;
            if (!d10.equals("http/1.1")) {
                jVar = ib.j.HTTP_2;
                if (!d10.equals("h2")) {
                    jVar = ib.j.SPDY_3;
                    if (!d10.equals("spdy/3.1")) {
                        throw new IOException(defpackage.g.d("Unexpected protocol: ", d10));
                    }
                }
            }
        }
        x6.b.G(d10, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(jVar));
        if (hostnameVerifier == null) {
            hostnameVerifier = ib.e.f7916a;
        }
        if (hostnameVerifier.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException(defpackage.g.d("Cannot verify hostname: ", str));
    }
}
