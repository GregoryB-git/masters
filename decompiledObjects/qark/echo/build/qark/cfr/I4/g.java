/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.security.Permission
 *  java.util.Map
 */
package I4;

import I4.a;
import I4.b;
import I4.e;
import I4.f;
import I4.j;
import M4.l;
import N4.h;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

public class g {
    public static final F4.a f = F4.a.e();
    public final HttpURLConnection a;
    public final G4.j b;
    public long c = -1L;
    public long d = -1L;
    public final l e;

    public g(HttpURLConnection httpURLConnection, l l8, G4.j j8) {
        this.a = httpURLConnection;
        this.b = j8;
        this.e = l8;
        j8.C(httpURLConnection.getURL().toString());
    }

    public boolean A() {
        return this.a.getInstanceFollowRedirects();
    }

    public long B() {
        this.a0();
        return this.a.getLastModified();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public OutputStream C() {
        OutputStream outputStream;
        try {
            outputStream = this.a.getOutputStream();
            if (outputStream == null) return outputStream;
        }
        catch (IOException iOException) {}
        return new b(outputStream, this.b, this.e);
        this.b.A(this.e.c());
        j.d(this.b);
        throw iOException;
    }

    public Permission D() {
        try {
            Permission permission = this.a.getPermission();
            return permission;
        }
        catch (IOException iOException) {
            this.b.A(this.e.c());
            j.d(this.b);
            throw iOException;
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

    public String H(String string2) {
        return this.a.getRequestProperty(string2);
    }

    public int I() {
        this.a0();
        if (this.d == -1L) {
            long l8;
            this.d = l8 = this.e.c();
            this.b.B(l8);
        }
        try {
            int n8 = this.a.getResponseCode();
            this.b.r(n8);
            return n8;
        }
        catch (IOException iOException) {
            this.b.A(this.e.c());
            j.d(this.b);
            throw iOException;
        }
    }

    public String J() {
        this.a0();
        if (this.d == -1L) {
            long l8;
            this.d = l8 = this.e.c();
            this.b.B(l8);
        }
        try {
            String string2 = this.a.getResponseMessage();
            this.b.r(this.a.getResponseCode());
            return string2;
        }
        catch (IOException iOException) {
            this.b.A(this.e.c());
            j.d(this.b);
            throw iOException;
        }
    }

    public URL K() {
        return this.a.getURL();
    }

    public boolean L() {
        return this.a.getUseCaches();
    }

    public void M(boolean bl) {
        this.a.setAllowUserInteraction(bl);
    }

    public void N(int n8) {
        this.a.setChunkedStreamingMode(n8);
    }

    public void O(int n8) {
        this.a.setConnectTimeout(n8);
    }

    public void P(boolean bl) {
        this.a.setDefaultUseCaches(bl);
    }

    public void Q(boolean bl) {
        this.a.setDoInput(bl);
    }

    public void R(boolean bl) {
        this.a.setDoOutput(bl);
    }

    public void S(int n8) {
        this.a.setFixedLengthStreamingMode(n8);
    }

    public void T(long l8) {
        this.a.setFixedLengthStreamingMode(l8);
    }

    public void U(long l8) {
        this.a.setIfModifiedSince(l8);
    }

    public void V(boolean bl) {
        this.a.setInstanceFollowRedirects(bl);
    }

    public void W(int n8) {
        this.a.setReadTimeout(n8);
    }

    public void X(String string2) {
        this.a.setRequestMethod(string2);
    }

    public void Y(String string2, String string3) {
        if ("User-Agent".equalsIgnoreCase(string2)) {
            this.b.E(string3);
        }
        this.a.setRequestProperty(string2, string3);
    }

    public void Z(boolean bl) {
        this.a.setUseCaches(bl);
    }

    public void a(String string2, String string3) {
        this.a.addRequestProperty(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a0() {
        String string2;
        Object object;
        if (this.c == -1L) {
            long l8;
            this.e.g();
            this.c = l8 = this.e.e();
            this.b.w(l8);
        }
        if ((object = this.F()) != null) {
            this.b.q((String)object);
            return;
        }
        if (this.o()) {
            object = this.b;
            string2 = "POST";
        } else {
            object = this.b;
            string2 = "GET";
        }
        object.q(string2);
    }

    public void b() {
        if (this.c == -1L) {
            long l8;
            this.e.g();
            this.c = l8 = this.e.e();
            this.b.w(l8);
        }
        try {
            this.a.connect();
            return;
        }
        catch (IOException iOException) {
            this.b.A(this.e.c());
            j.d(this.b);
            throw iOException;
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

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public Object f() {
        Object object;
        this.a0();
        this.b.r(this.a.getResponseCode());
        try {
            object = this.a.getContent();
        }
        catch (IOException iOException) {
            this.b.A(this.e.c());
            j.d(this.b);
            throw iOException;
        }
        if (object instanceof InputStream) {
            this.b.x(this.a.getContentType());
            return new a((InputStream)object, this.b, this.e);
        }
        this.b.x(this.a.getContentType());
        this.b.y(this.a.getContentLength());
        this.b.A(this.e.c());
        this.b.g();
        return object;
    }

    public Object g(Class[] object) {
        this.a0();
        this.b.r(this.a.getResponseCode());
        try {
            object = this.a.getContent((Class[])object);
        }
        catch (IOException iOException) {
            this.b.A(this.e.c());
            j.d(this.b);
            throw iOException;
        }
        if (object instanceof InputStream) {
            this.b.x(this.a.getContentType());
            return new a((InputStream)object, this.b, this.e);
        }
        this.b.x(this.a.getContentType());
        this.b.y(this.a.getContentLength());
        this.b.A(this.e.c());
        this.b.g();
        return object;
    }

    public String h() {
        this.a0();
        return this.a.getContentEncoding();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int i() {
        this.a0();
        return this.a.getContentLength();
    }

    public long j() {
        this.a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(this.a);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream p() {
        block3 : {
            this.a0();
            try {
                this.b.r(this.a.getResponseCode());
                break block3;
            }
            catch (IOException iOException) {}
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream inputStream = this.a.getErrorStream();
        if (inputStream != null) {
            return new a(inputStream, this.b, this.e);
        }
        return inputStream;
    }

    public long q() {
        this.a0();
        return this.a.getExpiration();
    }

    public String r(int n8) {
        this.a0();
        return this.a.getHeaderField(n8);
    }

    public String s(String string2) {
        this.a0();
        return this.a.getHeaderField(string2);
    }

    public long t(String string2, long l8) {
        this.a0();
        return this.a.getHeaderFieldDate(string2, l8);
    }

    public String toString() {
        return this.a.toString();
    }

    public int u(String string2, int n8) {
        this.a0();
        return this.a.getHeaderFieldInt(string2, n8);
    }

    public String v(int n8) {
        this.a0();
        return this.a.getHeaderFieldKey(n8);
    }

    public long w(String string2, long l8) {
        this.a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return f.a(this.a, string2, l8);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public InputStream z() {
        InputStream inputStream;
        this.a0();
        this.b.r(this.a.getResponseCode());
        this.b.x(this.a.getContentType());
        try {
            inputStream = this.a.getInputStream();
            if (inputStream == null) return inputStream;
        }
        catch (IOException iOException) {}
        return new a(inputStream, this.b, this.e);
        this.b.A(this.e.c());
        j.d(this.b);
        throw iOException;
    }
}

