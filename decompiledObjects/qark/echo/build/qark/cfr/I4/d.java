/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.security.Permission
 *  java.security.Principal
 *  java.security.cert.Certificate
 *  java.util.Map
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.HttpsURLConnection
 *  javax.net.ssl.SSLSocketFactory
 */
package I4;

import G4.j;
import I4.g;
import M4.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class d
extends HttpsURLConnection {
    public final g a;
    public final HttpsURLConnection b;

    public d(HttpsURLConnection httpsURLConnection, l l8, j j8) {
        super(httpsURLConnection.getURL());
        this.b = httpsURLConnection;
        this.a = new g((HttpURLConnection)httpsURLConnection, l8, j8);
    }

    public void addRequestProperty(String string2, String string3) {
        this.a.a(string2, string3);
    }

    public void connect() {
        this.a.b();
    }

    public void disconnect() {
        this.a.c();
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public boolean getAllowUserInteraction() {
        return this.a.d();
    }

    public String getCipherSuite() {
        return this.b.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.a.e();
    }

    public Object getContent() {
        return this.a.f();
    }

    public Object getContent(Class[] arrclass) {
        return this.a.g(arrclass);
    }

    public String getContentEncoding() {
        return this.a.h();
    }

    public int getContentLength() {
        return this.a.i();
    }

    public long getContentLengthLong() {
        return this.a.j();
    }

    public String getContentType() {
        return this.a.k();
    }

    public long getDate() {
        return this.a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.a.m();
    }

    public boolean getDoInput() {
        return this.a.n();
    }

    public boolean getDoOutput() {
        return this.a.o();
    }

    public InputStream getErrorStream() {
        return this.a.p();
    }

    public long getExpiration() {
        return this.a.q();
    }

    public String getHeaderField(int n8) {
        return this.a.r(n8);
    }

    public String getHeaderField(String string2) {
        return this.a.s(string2);
    }

    public long getHeaderFieldDate(String string2, long l8) {
        return this.a.t(string2, l8);
    }

    public int getHeaderFieldInt(String string2, int n8) {
        return this.a.u(string2, n8);
    }

    public String getHeaderFieldKey(int n8) {
        return this.a.v(n8);
    }

    public long getHeaderFieldLong(String string2, long l8) {
        return this.a.w(string2, l8);
    }

    public Map getHeaderFields() {
        return this.a.x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.a.y();
    }

    public InputStream getInputStream() {
        return this.a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.a.A();
    }

    public long getLastModified() {
        return this.a.B();
    }

    public Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    public OutputStream getOutputStream() {
        return this.a.C();
    }

    public Principal getPeerPrincipal() {
        return this.b.getPeerPrincipal();
    }

    public Permission getPermission() {
        return this.a.D();
    }

    public int getReadTimeout() {
        return this.a.E();
    }

    public String getRequestMethod() {
        return this.a.F();
    }

    public Map getRequestProperties() {
        return this.a.G();
    }

    public String getRequestProperty(String string2) {
        return this.a.H(string2);
    }

    public int getResponseCode() {
        return this.a.I();
    }

    public String getResponseMessage() {
        return this.a.J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() {
        return this.b.getServerCertificates();
    }

    public URL getURL() {
        return this.a.K();
    }

    public boolean getUseCaches() {
        return this.a.L();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void setAllowUserInteraction(boolean bl) {
        this.a.M(bl);
    }

    public void setChunkedStreamingMode(int n8) {
        this.a.N(n8);
    }

    public void setConnectTimeout(int n8) {
        this.a.O(n8);
    }

    public void setDefaultUseCaches(boolean bl) {
        this.a.P(bl);
    }

    public void setDoInput(boolean bl) {
        this.a.Q(bl);
    }

    public void setDoOutput(boolean bl) {
        this.a.R(bl);
    }

    public void setFixedLengthStreamingMode(int n8) {
        this.a.S(n8);
    }

    public void setFixedLengthStreamingMode(long l8) {
        this.a.T(l8);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.b.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long l8) {
        this.a.U(l8);
    }

    public void setInstanceFollowRedirects(boolean bl) {
        this.a.V(bl);
    }

    public void setReadTimeout(int n8) {
        this.a.W(n8);
    }

    public void setRequestMethod(String string2) {
        this.a.X(string2);
    }

    public void setRequestProperty(String string2, String string3) {
        this.a.Y(string2, string3);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.b.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean bl) {
        this.a.Z(bl);
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean usingProxy() {
        return this.a.b0();
    }
}

