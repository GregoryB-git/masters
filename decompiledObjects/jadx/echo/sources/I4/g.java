package I4;

import M4.l;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: f, reason: collision with root package name */
    public static final F4.a f2572f = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f2573a;

    /* renamed from: b, reason: collision with root package name */
    public final G4.j f2574b;

    /* renamed from: c, reason: collision with root package name */
    public long f2575c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f2576d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final l f2577e;

    public g(HttpURLConnection httpURLConnection, l lVar, G4.j jVar) {
        this.f2573a = httpURLConnection;
        this.f2574b = jVar;
        this.f2577e = lVar;
        jVar.C(httpURLConnection.getURL().toString());
    }

    public boolean A() {
        return this.f2573a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f2573a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f2573a.getOutputStream();
            return outputStream != null ? new b(outputStream, this.f2574b, this.f2577e) : outputStream;
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }

    public Permission D() {
        try {
            return this.f2573a.getPermission();
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }

    public int E() {
        return this.f2573a.getReadTimeout();
    }

    public String F() {
        return this.f2573a.getRequestMethod();
    }

    public Map G() {
        return this.f2573a.getRequestProperties();
    }

    public String H(String str) {
        return this.f2573a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f2576d == -1) {
            long c7 = this.f2577e.c();
            this.f2576d = c7;
            this.f2574b.B(c7);
        }
        try {
            int responseCode = this.f2573a.getResponseCode();
            this.f2574b.r(responseCode);
            return responseCode;
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }

    public String J() {
        a0();
        if (this.f2576d == -1) {
            long c7 = this.f2577e.c();
            this.f2576d = c7;
            this.f2574b.B(c7);
        }
        try {
            String responseMessage = this.f2573a.getResponseMessage();
            this.f2574b.r(this.f2573a.getResponseCode());
            return responseMessage;
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }

    public URL K() {
        return this.f2573a.getURL();
    }

    public boolean L() {
        return this.f2573a.getUseCaches();
    }

    public void M(boolean z7) {
        this.f2573a.setAllowUserInteraction(z7);
    }

    public void N(int i7) {
        this.f2573a.setChunkedStreamingMode(i7);
    }

    public void O(int i7) {
        this.f2573a.setConnectTimeout(i7);
    }

    public void P(boolean z7) {
        this.f2573a.setDefaultUseCaches(z7);
    }

    public void Q(boolean z7) {
        this.f2573a.setDoInput(z7);
    }

    public void R(boolean z7) {
        this.f2573a.setDoOutput(z7);
    }

    public void S(int i7) {
        this.f2573a.setFixedLengthStreamingMode(i7);
    }

    public void T(long j7) {
        this.f2573a.setFixedLengthStreamingMode(j7);
    }

    public void U(long j7) {
        this.f2573a.setIfModifiedSince(j7);
    }

    public void V(boolean z7) {
        this.f2573a.setInstanceFollowRedirects(z7);
    }

    public void W(int i7) {
        this.f2573a.setReadTimeout(i7);
    }

    public void X(String str) {
        this.f2573a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f2574b.E(str2);
        }
        this.f2573a.setRequestProperty(str, str2);
    }

    public void Z(boolean z7) {
        this.f2573a.setUseCaches(z7);
    }

    public void a(String str, String str2) {
        this.f2573a.addRequestProperty(str, str2);
    }

    public final void a0() {
        G4.j jVar;
        String str;
        if (this.f2575c == -1) {
            this.f2577e.g();
            long e7 = this.f2577e.e();
            this.f2575c = e7;
            this.f2574b.w(e7);
        }
        String F6 = F();
        if (F6 != null) {
            this.f2574b.q(F6);
            return;
        }
        if (o()) {
            jVar = this.f2574b;
            str = "POST";
        } else {
            jVar = this.f2574b;
            str = "GET";
        }
        jVar.q(str);
    }

    public void b() {
        if (this.f2575c == -1) {
            this.f2577e.g();
            long e7 = this.f2577e.e();
            this.f2575c = e7;
            this.f2574b.w(e7);
        }
        try {
            this.f2573a.connect();
        } catch (IOException e8) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e8;
        }
    }

    public boolean b0() {
        return this.f2573a.usingProxy();
    }

    public void c() {
        this.f2574b.A(this.f2577e.c());
        this.f2574b.g();
        this.f2573a.disconnect();
    }

    public boolean d() {
        return this.f2573a.getAllowUserInteraction();
    }

    public int e() {
        return this.f2573a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f2573a.equals(obj);
    }

    public Object f() {
        a0();
        this.f2574b.r(this.f2573a.getResponseCode());
        try {
            Object content = this.f2573a.getContent();
            if (content instanceof InputStream) {
                this.f2574b.x(this.f2573a.getContentType());
                return new a((InputStream) content, this.f2574b, this.f2577e);
            }
            this.f2574b.x(this.f2573a.getContentType());
            this.f2574b.y(this.f2573a.getContentLength());
            this.f2574b.A(this.f2577e.c());
            this.f2574b.g();
            return content;
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f2574b.r(this.f2573a.getResponseCode());
        try {
            Object content = this.f2573a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f2574b.x(this.f2573a.getContentType());
                return new a((InputStream) content, this.f2574b, this.f2577e);
            }
            this.f2574b.x(this.f2573a.getContentType());
            this.f2574b.y(this.f2573a.getContentLength());
            this.f2574b.A(this.f2577e.c());
            this.f2574b.g();
            return content;
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }

    public String h() {
        a0();
        return this.f2573a.getContentEncoding();
    }

    public int hashCode() {
        return this.f2573a.hashCode();
    }

    public int i() {
        a0();
        return this.f2573a.getContentLength();
    }

    public long j() {
        long contentLengthLong;
        a0();
        if (Build.VERSION.SDK_INT < 24) {
            return 0L;
        }
        contentLengthLong = this.f2573a.getContentLengthLong();
        return contentLengthLong;
    }

    public String k() {
        a0();
        return this.f2573a.getContentType();
    }

    public long l() {
        a0();
        return this.f2573a.getDate();
    }

    public boolean m() {
        return this.f2573a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f2573a.getDoInput();
    }

    public boolean o() {
        return this.f2573a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f2574b.r(this.f2573a.getResponseCode());
        } catch (IOException unused) {
            f2572f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f2573a.getErrorStream();
        return errorStream != null ? new a(errorStream, this.f2574b, this.f2577e) : errorStream;
    }

    public long q() {
        a0();
        return this.f2573a.getExpiration();
    }

    public String r(int i7) {
        a0();
        return this.f2573a.getHeaderField(i7);
    }

    public String s(String str) {
        a0();
        return this.f2573a.getHeaderField(str);
    }

    public long t(String str, long j7) {
        a0();
        return this.f2573a.getHeaderFieldDate(str, j7);
    }

    public String toString() {
        return this.f2573a.toString();
    }

    public int u(String str, int i7) {
        a0();
        return this.f2573a.getHeaderFieldInt(str, i7);
    }

    public String v(int i7) {
        a0();
        return this.f2573a.getHeaderFieldKey(i7);
    }

    public long w(String str, long j7) {
        long headerFieldLong;
        a0();
        if (Build.VERSION.SDK_INT < 24) {
            return 0L;
        }
        headerFieldLong = this.f2573a.getHeaderFieldLong(str, j7);
        return headerFieldLong;
    }

    public Map x() {
        a0();
        return this.f2573a.getHeaderFields();
    }

    public long y() {
        return this.f2573a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f2574b.r(this.f2573a.getResponseCode());
        this.f2574b.x(this.f2573a.getContentType());
        try {
            InputStream inputStream = this.f2573a.getInputStream();
            return inputStream != null ? new a(inputStream, this.f2574b, this.f2577e) : inputStream;
        } catch (IOException e7) {
            this.f2574b.A(this.f2577e.c());
            j.d(this.f2574b);
            throw e7;
        }
    }
}
