package eb;

import java.security.cert.Certificate;
import java.util.AbstractMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f5054d = Logger.getLogger(c0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f5055e = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f5056a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5057b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f5058c;

    public static final class a {
        public a(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                c0.f5054d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
        }
    }

    public c0() {
        new ConcurrentSkipListMap();
        this.f5056a = new ConcurrentSkipListMap();
        this.f5057b = new ConcurrentHashMap();
        this.f5058c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(AbstractMap abstractMap, e0 e0Var) {
    }

    public static void b(AbstractMap abstractMap, e0 e0Var) {
    }
}
