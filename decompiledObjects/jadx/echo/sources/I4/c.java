package I4;

import M4.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final g f2569a;

    public c(HttpURLConnection httpURLConnection, l lVar, G4.j jVar) {
        super(httpURLConnection.getURL());
        this.f2569a = new g(httpURLConnection, lVar, jVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f2569a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f2569a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f2569a.c();
    }

    public boolean equals(Object obj) {
        return this.f2569a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f2569a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f2569a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f2569a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f2569a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f2569a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f2569a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f2569a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f2569a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f2569a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f2569a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f2569a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f2569a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f2569a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i7) {
        return this.f2569a.r(i7);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j7) {
        return this.f2569a.t(str, j7);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i7) {
        return this.f2569a.u(str, i7);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i7) {
        return this.f2569a.v(i7);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j7) {
        return this.f2569a.w(str, j7);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f2569a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f2569a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f2569a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f2569a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f2569a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f2569a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f2569a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f2569a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f2569a.F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f2569a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f2569a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f2569a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f2569a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f2569a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f2569a.L();
    }

    public int hashCode() {
        return this.f2569a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z7) {
        this.f2569a.M(z7);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i7) {
        this.f2569a.N(i7);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i7) {
        this.f2569a.O(i7);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z7) {
        this.f2569a.P(z7);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z7) {
        this.f2569a.Q(z7);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z7) {
        this.f2569a.R(z7);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i7) {
        this.f2569a.S(i7);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j7) {
        this.f2569a.U(j7);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z7) {
        this.f2569a.V(z7);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i7) {
        this.f2569a.W(i7);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f2569a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f2569a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z7) {
        this.f2569a.Z(z7);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f2569a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f2569a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f2569a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f2569a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j7) {
        this.f2569a.T(j7);
    }
}
