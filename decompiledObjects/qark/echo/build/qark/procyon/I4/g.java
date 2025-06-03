// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I4;

import android.os.Build$VERSION;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.security.Permission;
import java.io.IOException;
import java.io.OutputStream;
import M4.l;
import G4.j;
import java.net.HttpURLConnection;
import F4.a;

public class g
{
    public static final a f;
    public final HttpURLConnection a;
    public final j b;
    public long c;
    public long d;
    public final l e;
    
    static {
        f = a.e();
    }
    
    public g(final HttpURLConnection a, final l e, final j b) {
        this.c = -1L;
        this.d = -1L;
        this.a = a;
        this.b = b;
        this.e = e;
        b.C(a.getURL().toString());
    }
    
    public boolean A() {
        return this.a.getInstanceFollowRedirects();
    }
    
    public long B() {
        this.a0();
        return this.a.getLastModified();
    }
    
    public OutputStream C() {
        Label_0037: {
            OutputStream outputStream;
            try {
                outputStream = this.a.getOutputStream();
                if (outputStream != null) {
                    return new b(outputStream, this.b, this.e);
                }
            }
            catch (IOException ex) {
                break Label_0037;
            }
            return outputStream;
        }
        this.b.A(this.e.c());
        I4.j.d(this.b);
        throw;
    }
    
    public Permission D() {
        try {
            return this.a.getPermission();
        }
        catch (IOException ex) {
            this.b.A(this.e.c());
            I4.j.d(this.b);
            throw ex;
        }
    }
    
    public int E() {
        return this.a.getReadTimeout();
    }
    
    public String F() {
        return this.a.getRequestMethod();
    }
    
    public Map G() {
        return this.a.getRequestProperties();
    }
    
    public String H(final String key) {
        return this.a.getRequestProperty(key);
    }
    
    public int I() {
        this.a0();
        if (this.d == -1L) {
            final long c = this.e.c();
            this.d = c;
            this.b.B(c);
        }
        try {
            final int responseCode = this.a.getResponseCode();
            this.b.r(responseCode);
            return responseCode;
        }
        catch (IOException ex) {
            this.b.A(this.e.c());
            I4.j.d(this.b);
            throw ex;
        }
    }
    
    public String J() {
        this.a0();
        if (this.d == -1L) {
            final long c = this.e.c();
            this.d = c;
            this.b.B(c);
        }
        try {
            final String responseMessage = this.a.getResponseMessage();
            this.b.r(this.a.getResponseCode());
            return responseMessage;
        }
        catch (IOException ex) {
            this.b.A(this.e.c());
            I4.j.d(this.b);
            throw ex;
        }
    }
    
    public URL K() {
        return this.a.getURL();
    }
    
    public boolean L() {
        return this.a.getUseCaches();
    }
    
    public void M(final boolean allowUserInteraction) {
        this.a.setAllowUserInteraction(allowUserInteraction);
    }
    
    public void N(final int chunkedStreamingMode) {
        this.a.setChunkedStreamingMode(chunkedStreamingMode);
    }
    
    public void O(final int connectTimeout) {
        this.a.setConnectTimeout(connectTimeout);
    }
    
    public void P(final boolean defaultUseCaches) {
        this.a.setDefaultUseCaches(defaultUseCaches);
    }
    
    public void Q(final boolean doInput) {
        this.a.setDoInput(doInput);
    }
    
    public void R(final boolean doOutput) {
        this.a.setDoOutput(doOutput);
    }
    
    public void S(final int fixedLengthStreamingMode) {
        this.a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
    }
    
    public void T(final long fixedLengthStreamingMode) {
        this.a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
    }
    
    public void U(final long ifModifiedSince) {
        this.a.setIfModifiedSince(ifModifiedSince);
    }
    
    public void V(final boolean instanceFollowRedirects) {
        this.a.setInstanceFollowRedirects(instanceFollowRedirects);
    }
    
    public void W(final int readTimeout) {
        this.a.setReadTimeout(readTimeout);
    }
    
    public void X(final String requestMethod) {
        this.a.setRequestMethod(requestMethod);
    }
    
    public void Y(final String s, final String value) {
        if ("User-Agent".equalsIgnoreCase(s)) {
            this.b.E(value);
        }
        this.a.setRequestProperty(s, value);
    }
    
    public void Z(final boolean useCaches) {
        this.a.setUseCaches(useCaches);
    }
    
    public void a(final String key, final String value) {
        this.a.addRequestProperty(key, value);
    }
    
    public final void a0() {
        if (this.c == -1L) {
            this.e.g();
            final long e = this.e.e();
            this.c = e;
            this.b.w(e);
        }
        final String f = this.F();
        if (f != null) {
            this.b.q(f);
            return;
        }
        j j;
        String s;
        if (this.o()) {
            j = this.b;
            s = "POST";
        }
        else {
            j = this.b;
            s = "GET";
        }
        j.q(s);
    }
    
    public void b() {
        if (this.c == -1L) {
            this.e.g();
            final long e = this.e.e();
            this.c = e;
            this.b.w(e);
        }
        try {
            this.a.connect();
        }
        catch (IOException ex) {
            this.b.A(this.e.c());
            I4.j.d(this.b);
            throw ex;
        }
    }
    
    public boolean b0() {
        return this.a.usingProxy();
    }
    
    public void c() {
        this.b.A(this.e.c());
        this.b.g();
        this.a.disconnect();
    }
    
    public boolean d() {
        return this.a.getAllowUserInteraction();
    }
    
    public int e() {
        return this.a.getConnectTimeout();
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.a.equals(obj);
    }
    
    public Object f() {
        this.a0();
        this.b.r(this.a.getResponseCode());
        try {
            final Object content = this.a.getContent();
            if (content instanceof InputStream) {
                this.b.x(this.a.getContentType());
                return new I4.a((InputStream)content, this.b, this.e);
            }
            this.b.x(this.a.getContentType());
            this.b.y(this.a.getContentLength());
            this.b.A(this.e.c());
            this.b.g();
            return content;
        }
        catch (IOException ex) {
            this.b.A(this.e.c());
            I4.j.d(this.b);
            throw ex;
        }
    }
    
    public Object g(final Class[] classes) {
        this.a0();
        this.b.r(this.a.getResponseCode());
        try {
            final Object content = this.a.getContent(classes);
            if (content instanceof InputStream) {
                this.b.x(this.a.getContentType());
                return new I4.a((InputStream)content, this.b, this.e);
            }
            this.b.x(this.a.getContentType());
            this.b.y(this.a.getContentLength());
            this.b.A(this.e.c());
            this.b.g();
            return content;
        }
        catch (IOException ex) {
            this.b.A(this.e.c());
            I4.j.d(this.b);
            throw ex;
        }
    }
    
    public String h() {
        this.a0();
        return this.a.getContentEncoding();
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public int i() {
        this.a0();
        return this.a.getContentLength();
    }
    
    public long j() {
        this.a0();
        if (Build$VERSION.SDK_INT >= 24) {
            return I4.e.a(this.a);
        }
        return 0L;
    }
    
    public String k() {
        this.a0();
        return this.a.getContentType();
    }
    
    public long l() {
        this.a0();
        return this.a.getDate();
    }
    
    public boolean m() {
        return this.a.getDefaultUseCaches();
    }
    
    public boolean n() {
        return this.a.getDoInput();
    }
    
    public boolean o() {
        return this.a.getDoOutput();
    }
    
    public InputStream p() {
        this.a0();
        while (true) {
            try {
                this.b.r(this.a.getResponseCode());
                while (true) {
                    final InputStream errorStream = this.a.getErrorStream();
                    if (errorStream != null) {
                        return new I4.a(errorStream, this.b, this.e);
                    }
                    return errorStream;
                    g.f.a("IOException thrown trying to obtain the response code");
                    continue;
                }
            }
            catch (IOException ex) {}
            continue;
        }
    }
    
    public long q() {
        this.a0();
        return this.a.getExpiration();
    }
    
    public String r(final int n) {
        this.a0();
        return this.a.getHeaderField(n);
    }
    
    public String s(final String name) {
        this.a0();
        return this.a.getHeaderField(name);
    }
    
    public long t(final String name, final long default1) {
        this.a0();
        return this.a.getHeaderFieldDate(name, default1);
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public int u(final String name, final int default1) {
        this.a0();
        return this.a.getHeaderFieldInt(name, default1);
    }
    
    public String v(final int n) {
        this.a0();
        return this.a.getHeaderFieldKey(n);
    }
    
    public long w(final String s, final long n) {
        this.a0();
        if (Build$VERSION.SDK_INT >= 24) {
            return I4.f.a(this.a, s, n);
        }
        return 0L;
    }
    
    public Map x() {
        this.a0();
        return this.a.getHeaderFields();
    }
    
    public long y() {
        return this.a.getIfModifiedSince();
    }
    
    public InputStream z() {
        this.a0();
        this.b.r(this.a.getResponseCode());
        this.b.x(this.a.getContentType());
        Label_0071: {
            InputStream inputStream;
            try {
                inputStream = this.a.getInputStream();
                if (inputStream != null) {
                    return new I4.a(inputStream, this.b, this.e);
                }
            }
            catch (IOException ex) {
                break Label_0071;
            }
            return inputStream;
        }
        this.b.A(this.e.c());
        I4.j.d(this.b);
        throw;
    }
}
