package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class Handshake {

    /* renamed from: a, reason: collision with root package name */
    public final TlsVersion f12238a;

    /* renamed from: b, reason: collision with root package name */
    public final CipherSuite f12239b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Certificate> f12240c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Certificate> f12241d;

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
        this.f12238a = tlsVersion;
        this.f12239b = cipherSuite;
        this.f12240c = list;
        this.f12241d = list2;
    }

    public static Handshake a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        CipherSuite a10 = CipherSuite.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        TlsVersion f = TlsVersion.f(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List o10 = certificateArr != null ? Util.o(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new Handshake(f, a10, o10, localCertificates != null ? Util.o(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return this.f12238a.equals(handshake.f12238a) && this.f12239b.equals(handshake.f12239b) && this.f12240c.equals(handshake.f12240c) && this.f12241d.equals(handshake.f12241d);
    }

    public final int hashCode() {
        return this.f12241d.hashCode() + ((this.f12240c.hashCode() + ((this.f12239b.hashCode() + ((this.f12238a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
