package t5;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import o7.u0;
import t5.k;

/* loaded from: classes.dex */
public final class s extends f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14593e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14594g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14595h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f14596i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f14597j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14598k;

    /* renamed from: l, reason: collision with root package name */
    public n7.j<String> f14599l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f14600m;

    /* renamed from: n, reason: collision with root package name */
    public InputStream f14601n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14602o;

    /* renamed from: p, reason: collision with root package name */
    public int f14603p;

    /* renamed from: q, reason: collision with root package name */
    public long f14604q;

    /* renamed from: r, reason: collision with root package name */
    public long f14605r;

    public static final class a implements k.a {

        /* renamed from: b, reason: collision with root package name */
        public String f14607b;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14610e;

        /* renamed from: a, reason: collision with root package name */
        public final a0 f14606a = new a0();

        /* renamed from: c, reason: collision with root package name */
        public int f14608c = 8000;

        /* renamed from: d, reason: collision with root package name */
        public int f14609d = 8000;

        @Override // t5.k.a
        public final k a() {
            return new s(this.f14607b, this.f14608c, this.f14609d, this.f14610e, this.f14606a);
        }
    }

    public static class b extends o7.p<String, List<String>> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f14611a;

        public b(Map<String, List<String>> map) {
            this.f14611a = map;
        }

        @Override // o7.q
        public final Object b() {
            return this.f14611a;
        }

        @Override // o7.p
        public final Map<String, List<String>> c() {
            return this.f14611a;
        }

        @Override // o7.p, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // o7.p, java.util.Map
        public final boolean containsValue(Object obj) {
            Iterator it = ((o7.h) entrySet()).iterator();
            it.getClass();
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
            } else {
                while (it.hasNext()) {
                    if (obj.equals(((Map.Entry) it.next()).getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // o7.p, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return u0.b(super.entrySet(), new n7.j() { // from class: t5.t
                @Override // n7.j
                public final boolean apply(Object obj) {
                    return ((Map.Entry) obj).getKey() != null;
                }
            });
        }

        @Override // o7.p, java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && o7.e0.a(this, obj);
        }

        @Override // o7.p, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // o7.p, java.util.Map
        public final int hashCode() {
            return u0.c(entrySet());
        }

        @Override // o7.p, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // o7.p, java.util.Map
        public final Set<String> keySet() {
            return u0.b(super.keySet(), new n7.j() { // from class: s5.e
                @Override // n7.j
                public final boolean apply(Object obj) {
                    return ((String) obj) != null;
                }
            });
        }

        @Override // o7.p, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public s(String str, int i10, int i11, boolean z10, a0 a0Var) {
        super(true);
        this.f14595h = str;
        this.f = i10;
        this.f14594g = i11;
        this.f14593e = z10;
        this.f14596i = a0Var;
        this.f14599l = null;
        this.f14597j = new a0();
        this.f14598k = false;
    }

    public static void w(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = v5.e0.f15881a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    @Override // t5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(t5.n r19) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.s.a(t5.n):long");
    }

    @Override // t5.k
    public final void close() {
        try {
            InputStream inputStream = this.f14601n;
            if (inputStream != null) {
                long j10 = this.f14604q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f14605r;
                }
                w(this.f14600m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = v5.e0.f15881a;
                    throw new x(e10, 2000, 3);
                }
            }
        } finally {
            this.f14601n = null;
            s();
            if (this.f14602o) {
                this.f14602o = false;
                p();
            }
        }
    }

    @Override // t5.f, t5.k
    public final Map<String, List<String>> h() {
        HttpURLConnection httpURLConnection = this.f14600m;
        return httpURLConnection == null ? o7.m0.f12013o : new b(httpURLConnection.getHeaderFields());
    }

    @Override // t5.k
    public final Uri l() {
        HttpURLConnection httpURLConnection = this.f14600m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f14604q;
            if (j10 != -1) {
                long j11 = j10 - this.f14605r;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f14601n;
            int i12 = v5.e0.f15881a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f14605r += read;
                o(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i13 = v5.e0.f15881a;
            throw x.a(e10, 2);
        }
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.f14600m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                v5.m.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f14600m = null;
        }
    }

    public final URL t(URL url, String str) {
        if (str == null) {
            throw new x("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new x(defpackage.g.d("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f14593e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            StringBuilder l10 = defpackage.f.l("Disallowed cross-protocol redirect (");
            l10.append(url.getProtocol());
            l10.append(" to ");
            l10.append(protocol);
            l10.append(")");
            throw new x(l10.toString(), 2001);
        } catch (MalformedURLException e10) {
            throw new x(e10, 2001, 1);
        }
    }

    public final HttpURLConnection u(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        Map<String, String> map2;
        String sb2;
        String str;
        Map<String, String> map3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.f14594g);
        HashMap hashMap = new HashMap();
        a0 a0Var = this.f14596i;
        if (a0Var != null) {
            synchronized (a0Var) {
                if (a0Var.f14448b == null) {
                    a0Var.f14448b = Collections.unmodifiableMap(new HashMap(a0Var.f14447a));
                }
                map3 = a0Var.f14448b;
            }
            hashMap.putAll(map3);
        }
        a0 a0Var2 = this.f14597j;
        synchronized (a0Var2) {
            if (a0Var2.f14448b == null) {
                a0Var2.f14448b = Collections.unmodifiableMap(new HashMap(a0Var2.f14447a));
            }
            map2 = a0Var2.f14448b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = b0.f14449a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bytes=");
            sb3.append(j10);
            sb3.append("-");
            if (j11 != -1) {
                sb3.append((j10 + j11) - 1);
            }
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str2 = this.f14595h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = n.f14546k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection v(n nVar) {
        HttpURLConnection u10;
        n nVar2 = nVar;
        URL url = new URL(nVar2.f14547a.toString());
        int i10 = nVar2.f14549c;
        byte[] bArr = nVar2.f14550d;
        long j10 = nVar2.f;
        long j11 = nVar2.f14552g;
        boolean z10 = (nVar2.f14554i & 1) == 1;
        if (!this.f14593e && !this.f14598k) {
            return u(url, i10, bArr, j10, j11, z10, true, nVar2.f14551e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new x(new NoRouteToHostException(defpackage.f.h("Too many redirects: ", i13)), 2001, 1);
            }
            Map<String, String> map = nVar2.f14551e;
            int i14 = i11;
            URL url3 = url2;
            long j12 = j11;
            u10 = u(url2, i11, bArr2, j10, j11, z10, false, map);
            int responseCode = u10.getResponseCode();
            String headerField = u10.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                u10.disconnect();
                url2 = t(url3, headerField);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                u10.disconnect();
                if (this.f14598k && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                url2 = t(url3, headerField);
            }
            nVar2 = nVar;
            i12 = i13;
            j11 = j12;
        }
        return u10;
    }

    public final void x(long j10) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f14601n;
            int i10 = v5.e0.f15881a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new x(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new x();
            }
            j10 -= read;
            o(read);
        }
    }
}
