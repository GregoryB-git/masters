// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I4;

import java.net.URL;
import java.security.Permission;
import java.io.OutputStream;
import java.util.Map;
import java.io.InputStream;
import G4.j;
import M4.l;
import java.net.HttpURLConnection;

public final class c extends HttpURLConnection
{
    public final g a;
    
    public c(final HttpURLConnection httpURLConnection, final l l, final j j) {
        super(httpURLConnection.getURL());
        this.a = new g(httpURLConnection, l, j);
    }
    
    @Override
    public void addRequestProperty(final String s, final String s2) {
        this.a.a(s, s2);
    }
    
    @Override
    public void connect() {
        this.a.b();
    }
    
    @Override
    public void disconnect() {
        this.a.c();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.a.equals(o);
    }
    
    @Override
    public boolean getAllowUserInteraction() {
        return this.a.d();
    }
    
    @Override
    public int getConnectTimeout() {
        return this.a.e();
    }
    
    @Override
    public Object getContent() {
        return this.a.f();
    }
    
    @Override
    public Object getContent(final Class[] array) {
        return this.a.g(array);
    }
    
    @Override
    public String getContentEncoding() {
        return this.a.h();
    }
    
    @Override
    public int getContentLength() {
        return this.a.i();
    }
    
    @Override
    public long getContentLengthLong() {
        return this.a.j();
    }
    
    @Override
    public String getContentType() {
        return this.a.k();
    }
    
    @Override
    public long getDate() {
        return this.a.l();
    }
    
    @Override
    public boolean getDefaultUseCaches() {
        return this.a.m();
    }
    
    @Override
    public boolean getDoInput() {
        return this.a.n();
    }
    
    @Override
    public boolean getDoOutput() {
        return this.a.o();
    }
    
    @Override
    public InputStream getErrorStream() {
        return this.a.p();
    }
    
    @Override
    public long getExpiration() {
        return this.a.q();
    }
    
    @Override
    public String getHeaderField(final int n) {
        return this.a.r(n);
    }
    
    @Override
    public String getHeaderField(final String s) {
        return this.a.s(s);
    }
    
    @Override
    public long getHeaderFieldDate(final String s, final long n) {
        return this.a.t(s, n);
    }
    
    @Override
    public int getHeaderFieldInt(final String s, final int n) {
        return this.a.u(s, n);
    }
    
    @Override
    public String getHeaderFieldKey(final int n) {
        return this.a.v(n);
    }
    
    @Override
    public long getHeaderFieldLong(final String s, final long n) {
        return this.a.w(s, n);
    }
    
    @Override
    public Map getHeaderFields() {
        return this.a.x();
    }
    
    @Override
    public long getIfModifiedSince() {
        return this.a.y();
    }
    
    @Override
    public InputStream getInputStream() {
        return this.a.z();
    }
    
    @Override
    public boolean getInstanceFollowRedirects() {
        return this.a.A();
    }
    
    @Override
    public long getLastModified() {
        return this.a.B();
    }
    
    @Override
    public OutputStream getOutputStream() {
        return this.a.C();
    }
    
    @Override
    public Permission getPermission() {
        return this.a.D();
    }
    
    @Override
    public int getReadTimeout() {
        return this.a.E();
    }
    
    @Override
    public String getRequestMethod() {
        return this.a.F();
    }
    
    @Override
    public Map getRequestProperties() {
        return this.a.G();
    }
    
    @Override
    public String getRequestProperty(final String s) {
        return this.a.H(s);
    }
    
    @Override
    public int getResponseCode() {
        return this.a.I();
    }
    
    @Override
    public String getResponseMessage() {
        return this.a.J();
    }
    
    @Override
    public URL getURL() {
        return this.a.K();
    }
    
    @Override
    public boolean getUseCaches() {
        return this.a.L();
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public void setAllowUserInteraction(final boolean b) {
        this.a.M(b);
    }
    
    @Override
    public void setChunkedStreamingMode(final int n) {
        this.a.N(n);
    }
    
    @Override
    public void setConnectTimeout(final int n) {
        this.a.O(n);
    }
    
    @Override
    public void setDefaultUseCaches(final boolean b) {
        this.a.P(b);
    }
    
    @Override
    public void setDoInput(final boolean b) {
        this.a.Q(b);
    }
    
    @Override
    public void setDoOutput(final boolean b) {
        this.a.R(b);
    }
    
    @Override
    public void setFixedLengthStreamingMode(final int n) {
        this.a.S(n);
    }
    
    @Override
    public void setFixedLengthStreamingMode(final long n) {
        this.a.T(n);
    }
    
    @Override
    public void setIfModifiedSince(final long n) {
        this.a.U(n);
    }
    
    @Override
    public void setInstanceFollowRedirects(final boolean b) {
        this.a.V(b);
    }
    
    @Override
    public void setReadTimeout(final int n) {
        this.a.W(n);
    }
    
    @Override
    public void setRequestMethod(final String s) {
        this.a.X(s);
    }
    
    @Override
    public void setRequestProperty(final String s, final String s2) {
        this.a.Y(s, s2);
    }
    
    @Override
    public void setUseCaches(final boolean b) {
        this.a.Z(b);
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    @Override
    public boolean usingProxy() {
        return this.a.b0();
    }
}
