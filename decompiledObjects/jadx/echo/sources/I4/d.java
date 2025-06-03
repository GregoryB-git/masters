package I4;

import M4.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class d extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final g f2570a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpsURLConnection f2571b;

    public d(HttpsURLConnection httpsURLConnection, l lVar, G4.j jVar) {
        super(httpsURLConnection.getURL());
        this.f2571b = httpsURLConnection;
        this.f2570a = new g(httpsURLConnection, lVar, jVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f2570a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f2570a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f2570a.c();
    }

    public boolean equals(Object obj) {
        return this.f2570a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f2570a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f2571b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f2570a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f2570a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f2570a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f2570a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f2570a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f2570a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f2570a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f2570a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f2570a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f2570a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f2570a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f2570a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i7) {
        return this.f2570a.r(i7);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j7) {
        return this.f2570a.t(str, j7);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i7) {
        return this.f2570a.u(str, i7);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i7) {
        return this.f2570a.v(i7);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j7) {
        return this.f2570a.w(str, j7);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f2570a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f2571b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f2570a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f2570a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f2570a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f2570a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f2571b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f2571b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f2570a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f2571b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f2570a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f2570a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f2570a.F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f2570a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f2570a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f2570a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f2570a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f2571b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f2571b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f2570a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f2570a.L();
    }

    public int hashCode() {
        return this.f2570a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z7) {
        this.f2570a.M(z7);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i7) {
        this.f2570a.N(i7);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i7) {
        this.f2570a.O(i7);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z7) {
        this.f2570a.P(z7);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z7) {
        this.f2570a.Q(z7);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z7) {
        this.f2570a.R(z7);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i7) {
        this.f2570a.S(i7);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f2571b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j7) {
        this.f2570a.U(j7);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z7) {
        this.f2570a.V(z7);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i7) {
        this.f2570a.W(i7);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f2570a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f2570a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f2571b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z7) {
        this.f2570a.Z(z7);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f2570a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f2570a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f2570a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f2570a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j7) {
        this.f2570a.T(j7);
    }
}
