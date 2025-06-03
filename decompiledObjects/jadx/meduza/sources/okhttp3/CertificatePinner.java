package okhttp3;

import defpackage.f;
import defpackage.g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import xc.i;

/* loaded from: classes.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final CertificatePinner f12177c = new CertificatePinner(new LinkedHashSet(new Builder().f12180a), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set<Pin> f12178a;

    /* renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f12179b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12180a = new ArrayList();
    }

    public static final class Pin {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Pin)) {
                return false;
            }
            ((Pin) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.f12178a = set;
        this.f12179b = certificateChainCleaner;
    }

    public static String b(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder l10 = f.l("sha256/");
        l10.append(i.o(x509Certificate.getPublicKey().getEncoded()).h("SHA-256").f());
        return l10.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<Pin> it = this.f12178a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        if (emptyList.isEmpty()) {
            return;
        }
        CertificateChainCleaner certificateChainCleaner = this.f12179b;
        if (certificateChainCleaner != 0) {
            list = certificateChainCleaner.a(str, list);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (emptyList.size() > 0) {
                ((Pin) emptyList.get(0)).getClass();
                throw null;
            }
        }
        StringBuilder g10 = g.g("Certificate pinning failure!", "\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i11);
            g10.append("\n    ");
            g10.append(b(x509Certificate));
            g10.append(": ");
            g10.append(x509Certificate.getSubjectDN().getName());
        }
        g10.append("\n  Pinned certificates for ");
        g10.append(str);
        g10.append(":");
        int size3 = emptyList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Pin pin = (Pin) emptyList.get(i12);
            g10.append("\n    ");
            g10.append(pin);
        }
        throw new SSLPeerUnverifiedException(g10.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Util.k(this.f12179b, certificatePinner.f12179b) && this.f12178a.equals(certificatePinner.f12178a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CertificateChainCleaner certificateChainCleaner = this.f12179b;
        return this.f12178a.hashCode() + ((certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0) * 31);
    }
}
