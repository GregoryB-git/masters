package i0;

import X2.AbstractC0699q;
import X2.AbstractC0704w;
import X2.a0;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import g0.AbstractC1297a;
import g0.M;
import i0.g;
import i0.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class m extends i0.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14687e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14688f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14689g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14690h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14691i;

    /* renamed from: j, reason: collision with root package name */
    public final u f14692j;

    /* renamed from: k, reason: collision with root package name */
    public final u f14693k;

    /* renamed from: l, reason: collision with root package name */
    public final W2.n f14694l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14695m;

    /* renamed from: n, reason: collision with root package name */
    public k f14696n;

    /* renamed from: o, reason: collision with root package name */
    public HttpURLConnection f14697o;

    /* renamed from: p, reason: collision with root package name */
    public InputStream f14698p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14699q;

    /* renamed from: r, reason: collision with root package name */
    public int f14700r;

    /* renamed from: s, reason: collision with root package name */
    public long f14701s;

    /* renamed from: t, reason: collision with root package name */
    public long f14702t;

    public static final class b implements g.a {

        /* renamed from: b, reason: collision with root package name */
        public y f14704b;

        /* renamed from: c, reason: collision with root package name */
        public W2.n f14705c;

        /* renamed from: d, reason: collision with root package name */
        public String f14706d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f14709g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f14710h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f14711i;

        /* renamed from: a, reason: collision with root package name */
        public final u f14703a = new u();

        /* renamed from: e, reason: collision with root package name */
        public int f14707e = 8000;

        /* renamed from: f, reason: collision with root package name */
        public int f14708f = 8000;

        @Override // i0.g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a() {
            m mVar = new m(this.f14706d, this.f14707e, this.f14708f, this.f14709g, this.f14710h, this.f14703a, this.f14705c, this.f14711i);
            y yVar = this.f14704b;
            if (yVar != null) {
                mVar.c(yVar);
            }
            return mVar;
        }

        public b c(boolean z7) {
            this.f14709g = z7;
            return this;
        }

        public b d(Map map) {
            this.f14703a.a(map);
            return this;
        }

        public b e(String str) {
            this.f14706d = str;
            return this;
        }
    }

    public static class c extends AbstractC0699q {

        /* renamed from: o, reason: collision with root package name */
        public final Map f14712o;

        public c(Map map) {
            this.f14712o = map;
        }

        public static /* synthetic */ boolean i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean j(String str) {
            return str != null;
        }

        @Override // X2.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f14712o;
        }

        @Override // X2.AbstractC0699q, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // X2.AbstractC0699q, java.util.Map
        public Set entrySet() {
            return a0.b(super.entrySet(), new W2.n() { // from class: i0.n
                @Override // W2.n
                public final boolean apply(Object obj) {
                    boolean i7;
                    i7 = m.c.i((Map.Entry) obj);
                    return i7;
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // X2.AbstractC0699q, java.util.Map
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // X2.AbstractC0699q, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // X2.AbstractC0699q, java.util.Map
        public Set keySet() {
            return a0.b(super.keySet(), new W2.n() { // from class: i0.o
                @Override // W2.n
                public final boolean apply(Object obj) {
                    boolean j7;
                    j7 = m.c.j((String) obj);
                    return j7;
                }
            });
        }

        @Override // X2.AbstractC0699q, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public m(String str, int i7, int i8, boolean z7, boolean z8, u uVar, W2.n nVar, boolean z9) {
        super(true);
        this.f14691i = str;
        this.f14689g = i7;
        this.f14690h = i8;
        this.f14687e = z7;
        this.f14688f = z8;
        if (z7 && z8) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f14692j = uVar;
        this.f14694l = nVar;
        this.f14693k = new u();
        this.f14695m = z9;
    }

    public static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void z(HttpURLConnection httpURLConnection, long j7) {
        if (httpURLConnection == null || M.f14261a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j7 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j7 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) AbstractC1297a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public HttpURLConnection A(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    public final int B(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f14701s;
        if (j7 != -1) {
            long j8 = j7 - this.f14702t;
            if (j8 == 0) {
                return -1;
            }
            i8 = (int) Math.min(i8, j8);
        }
        int read = ((InputStream) M.i(this.f14698p)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        this.f14702t += read;
        q(read);
        return read;
    }

    public final void C(long j7, k kVar) {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int read = ((InputStream) M.i(this.f14698p)).read(bArr, 0, (int) Math.min(j7, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new r(new InterruptedIOException(), kVar, 2000, 1);
            }
            if (read == -1) {
                throw new r(kVar, 2008, 1);
            }
            j7 -= read;
            q(read);
        }
    }

    @Override // i0.g
    public void close() {
        try {
            InputStream inputStream = this.f14698p;
            if (inputStream != null) {
                long j7 = this.f14701s;
                long j8 = -1;
                if (j7 != -1) {
                    j8 = j7 - this.f14702t;
                }
                z(this.f14697o, j8);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new r(e7, (k) M.i(this.f14696n), 2000, 3);
                }
            }
        } finally {
            this.f14698p = null;
            u();
            if (this.f14699q) {
                this.f14699q = false;
                r();
            }
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        byte[] bArr;
        this.f14696n = kVar;
        long j7 = 0;
        this.f14702t = 0L;
        this.f14701s = 0L;
        s(kVar);
        try {
            HttpURLConnection x7 = x(kVar);
            this.f14697o = x7;
            this.f14700r = x7.getResponseCode();
            String responseMessage = x7.getResponseMessage();
            int i7 = this.f14700r;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = x7.getHeaderFields();
                if (this.f14700r == 416) {
                    if (kVar.f14658g == v.c(x7.getHeaderField("Content-Range"))) {
                        this.f14699q = true;
                        t(kVar);
                        long j8 = kVar.f14659h;
                        if (j8 != -1) {
                            return j8;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = x7.getErrorStream();
                try {
                    bArr = errorStream != null ? Y2.a.b(errorStream) : M.f14266f;
                } catch (IOException unused) {
                    bArr = M.f14266f;
                }
                byte[] bArr2 = bArr;
                u();
                throw new t(this.f14700r, responseMessage, this.f14700r == 416 ? new h(2008) : null, headerFields, kVar, bArr2);
            }
            String contentType = x7.getContentType();
            W2.n nVar = this.f14694l;
            if (nVar != null && !nVar.apply(contentType)) {
                u();
                throw new s(contentType, kVar);
            }
            if (this.f14700r == 200) {
                long j9 = kVar.f14658g;
                if (j9 != 0) {
                    j7 = j9;
                }
            }
            boolean w7 = w(x7);
            if (w7) {
                this.f14701s = kVar.f14659h;
            } else {
                long j10 = kVar.f14659h;
                if (j10 != -1) {
                    this.f14701s = j10;
                } else {
                    long b7 = v.b(x7.getHeaderField("Content-Length"), x7.getHeaderField("Content-Range"));
                    this.f14701s = b7 != -1 ? b7 - j7 : -1L;
                }
            }
            try {
                this.f14698p = x7.getInputStream();
                if (w7) {
                    this.f14698p = new GZIPInputStream(this.f14698p);
                }
                this.f14699q = true;
                t(kVar);
                try {
                    C(j7, kVar);
                    return this.f14701s;
                } catch (IOException e7) {
                    u();
                    if (e7 instanceof r) {
                        throw ((r) e7);
                    }
                    throw new r(e7, kVar, 2000, 1);
                }
            } catch (IOException e8) {
                u();
                throw new r(e8, kVar, 2000, 1);
            }
        } catch (IOException e9) {
            u();
            throw r.c(e9, kVar, 1);
        }
    }

    @Override // i0.b, i0.g
    public Map g() {
        HttpURLConnection httpURLConnection = this.f14697o;
        return httpURLConnection == null ? AbstractC0704w.j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // i0.g
    public Uri k() {
        HttpURLConnection httpURLConnection = this.f14697o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        try {
            return B(bArr, i7, i8);
        } catch (IOException e7) {
            throw r.c(e7, (k) M.i(this.f14696n), 2);
        }
    }

    public final void u() {
        HttpURLConnection httpURLConnection = this.f14697o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                g0.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f14697o = null;
        }
    }

    public final URL v(URL url, String str, k kVar) {
        if (str == null) {
            throw new r("Null location redirect", kVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new r("Unsupported protocol redirect: " + protocol, kVar, 2001, 1);
            }
            if (this.f14687e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f14688f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e7) {
                    throw new r(e7, kVar, 2001, 1);
                }
            }
            throw new r("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", kVar, 2001, 1);
        } catch (MalformedURLException e8) {
            throw new r(e8, kVar, 2001, 1);
        }
    }

    public final HttpURLConnection x(k kVar) {
        HttpURLConnection y7;
        URL url = new URL(kVar.f14652a.toString());
        int i7 = kVar.f14654c;
        byte[] bArr = kVar.f14655d;
        long j7 = kVar.f14658g;
        long j8 = kVar.f14659h;
        boolean d7 = kVar.d(1);
        if (!this.f14687e && !this.f14688f && !this.f14695m) {
            return y(url, i7, bArr, j7, j8, d7, true, kVar.f14656e);
        }
        int i8 = 0;
        URL url2 = url;
        int i9 = i7;
        byte[] bArr2 = bArr;
        while (true) {
            int i10 = i8 + 1;
            if (i8 > 20) {
                throw new r(new NoRouteToHostException("Too many redirects: " + i10), kVar, 2001, 1);
            }
            long j9 = j7;
            long j10 = j7;
            int i11 = i9;
            URL url3 = url2;
            long j11 = j8;
            y7 = y(url2, i9, bArr2, j9, j8, d7, false, kVar.f14656e);
            int responseCode = y7.getResponseCode();
            String headerField = y7.getHeaderField("Location");
            if ((i11 == 1 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                y7.disconnect();
                url2 = v(url3, headerField, kVar);
                i9 = i11;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                y7.disconnect();
                if (this.f14695m && responseCode == 302) {
                    i9 = i11;
                } else {
                    bArr2 = null;
                    i9 = 1;
                }
                url2 = v(url3, headerField, kVar);
            }
            i8 = i10;
            j7 = j10;
            j8 = j11;
        }
        return y7;
    }

    public final HttpURLConnection y(URL url, int i7, byte[] bArr, long j7, long j8, boolean z7, boolean z8, Map map) {
        HttpURLConnection A7 = A(url);
        A7.setConnectTimeout(this.f14689g);
        A7.setReadTimeout(this.f14690h);
        HashMap hashMap = new HashMap();
        u uVar = this.f14692j;
        if (uVar != null) {
            hashMap.putAll(uVar.b());
        }
        hashMap.putAll(this.f14693k.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A7.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a7 = v.a(j7, j8);
        if (a7 != null) {
            A7.setRequestProperty("Range", a7);
        }
        String str = this.f14691i;
        if (str != null) {
            A7.setRequestProperty("User-Agent", str);
        }
        A7.setRequestProperty("Accept-Encoding", z7 ? "gzip" : "identity");
        A7.setInstanceFollowRedirects(z8);
        A7.setDoOutput(bArr != null);
        A7.setRequestMethod(k.c(i7));
        if (bArr != null) {
            A7.setFixedLengthStreamingMode(bArr.length);
            A7.connect();
            OutputStream outputStream = A7.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A7.connect();
        }
        return A7;
    }
}
