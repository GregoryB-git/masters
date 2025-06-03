package okhttp3;

import defpackage.f;
import defpackage.g;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f12148a;

    /* renamed from: b, reason: collision with root package name */
    public final Dns f12149b;

    /* renamed from: c, reason: collision with root package name */
    public final SocketFactory f12150c;

    /* renamed from: d, reason: collision with root package name */
    public final Authenticator f12151d;

    /* renamed from: e, reason: collision with root package name */
    public final List<Protocol> f12152e;
    public final List<ConnectionSpec> f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f12153g;

    /* renamed from: h, reason: collision with root package name */
    public final Proxy f12154h;

    /* renamed from: i, reason: collision with root package name */
    public final SSLSocketFactory f12155i;

    /* renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f12156j;

    /* renamed from: k, reason: collision with root package name */
    public final CertificatePinner f12157k;

    public Address(String str, int i10, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (!str3.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException(g.d("unexpected scheme: ", str3));
        }
        builder.f12253a = str2;
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String c10 = Util.c(HttpUrl.j(0, str.length(), str, false));
        if (c10 == null) {
            throw new IllegalArgumentException(g.d("unexpected host: ", str));
        }
        builder.f12256d = c10;
        if (i10 <= 0 || i10 > 65535) {
            throw new IllegalArgumentException(f.h("unexpected port: ", i10));
        }
        builder.f12257e = i10;
        this.f12148a = builder.a();
        if (dns == null) {
            throw new NullPointerException("dns == null");
        }
        this.f12149b = dns;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f12150c = socketFactory;
        if (authenticator == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f12151d = authenticator;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f12152e = Util.n(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = Util.n(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f12153g = proxySelector;
        this.f12154h = proxy;
        this.f12155i = sSLSocketFactory;
        this.f12156j = hostnameVerifier;
        this.f12157k = certificatePinner;
    }

    public final boolean a(Address address) {
        return this.f12149b.equals(address.f12149b) && this.f12151d.equals(address.f12151d) && this.f12152e.equals(address.f12152e) && this.f.equals(address.f) && this.f12153g.equals(address.f12153g) && Util.k(this.f12154h, address.f12154h) && Util.k(this.f12155i, address.f12155i) && Util.k(this.f12156j, address.f12156j) && Util.k(this.f12157k, address.f12157k) && this.f12148a.f12249e == address.f12148a.f12249e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (this.f12148a.equals(address.f12148a) && a(address)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f12153g.hashCode() + ((this.f.hashCode() + ((this.f12152e.hashCode() + ((this.f12151d.hashCode() + ((this.f12149b.hashCode() + ((this.f12148a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f12154h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f12155i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f12156j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        CertificatePinner certificatePinner = this.f12157k;
        return hashCode4 + (certificatePinner != null ? certificatePinner.hashCode() : 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder l10 = f.l("Address{");
        l10.append(this.f12148a.f12248d);
        l10.append(":");
        l10.append(this.f12148a.f12249e);
        if (this.f12154h != null) {
            l10.append(", proxy=");
            obj = this.f12154h;
        } else {
            l10.append(", proxySelector=");
            obj = this.f12153g;
        }
        l10.append(obj);
        l10.append("}");
        return l10.toString();
    }
}
