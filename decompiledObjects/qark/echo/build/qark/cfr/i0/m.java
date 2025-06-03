/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InterruptedIOException
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.NoRouteToHostException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.zip.GZIPInputStream
 */
package i0;

import X2.a0;
import X2.q;
import X2.w;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import g0.M;
import g0.a;
import i0.g;
import i0.h;
import i0.k;
import i0.n;
import i0.o;
import i0.r;
import i0.s;
import i0.t;
import i0.u;
import i0.v;
import i0.y;
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

public class m
extends i0.b
implements g {
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final u j;
    public final u k;
    public final W2.n l;
    public final boolean m;
    public k n;
    public HttpURLConnection o;
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;

    public m(String string2, int n8, int n9, boolean bl, boolean bl2, u u8, W2.n n10, boolean bl3) {
        super(true);
        this.i = string2;
        this.g = n8;
        this.h = n9;
        this.e = bl;
        this.f = bl2;
        if (bl && bl2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.j = u8;
        this.l = n10;
        this.k = new u();
        this.m = bl3;
    }

    public /* synthetic */ m(String string2, int n8, int n9, boolean bl, boolean bl2, u u8, W2.n n10, boolean bl3,  a8) {
        this(string2, n8, n9, bl, bl2, u8, n10, bl3);
    }

    public static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void z(HttpURLConnection httpURLConnection, long l8) {
        if (httpURLConnection != null) {
            if (M.a > 20) {
                return;
            }
            try {
                httpURLConnection = httpURLConnection.getInputStream();
                if (l8 == -1L ? httpURLConnection.read() == -1 : l8 <= 2048L) {
                    return;
                }
            }
            catch (Exception exception) {
                return;
            }
            String string2 = httpURLConnection.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals((Object)string2) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals((Object)string2)) {
                string2 = ((Class)a.e((Object)httpURLConnection.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                string2.setAccessible(true);
                string2.invoke((Object)httpURLConnection, new Object[0]);
            }
        }
    }

    public HttpURLConnection A(URL uRL) {
        return (HttpURLConnection)((URLConnection)FirebasePerfUrlConnection.instrument((Object)uRL.openConnection()));
    }

    public final int B(byte[] arrby, int n8, int n9) {
        if (n9 == 0) {
            return 0;
        }
        long l8 = this.s;
        int n10 = n9;
        if (l8 != -1L) {
            if ((l8 -= this.t) == 0L) {
                return -1;
            }
            n10 = (int)Math.min((long)n9, (long)l8);
        }
        if ((n8 = ((InputStream)M.i((Object)this.p)).read(arrby, n8, n10)) == -1) {
            return -1;
        }
        this.t += (long)n8;
        this.q(n8);
        return n8;
    }

    public final void C(long l8, k k8) {
        if (l8 == 0L) {
            return;
        }
        byte[] arrby = new byte[4096];
        while (l8 > 0L) {
            int n8 = (int)Math.min((long)l8, (long)4096);
            n8 = ((InputStream)M.i((Object)this.p)).read(arrby, 0, n8);
            if (!Thread.currentThread().isInterrupted()) {
                if (n8 != -1) {
                    l8 -= (long)n8;
                    this.q(n8);
                    continue;
                }
                throw new r(k8, 2008, 1);
            }
            throw new r((IOException)new InterruptedIOException(), k8, 2000, 1);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void close() {
        Throwable throwable2222;
        block7 : {
            block6 : {
                try {
                    InputStream inputStream = this.p;
                    if (inputStream != null) {
                        long l8 = this.s;
                        long l9 = -1L;
                        if (l8 != -1L) {
                            l9 = l8 - this.t;
                        }
                        m.z(this.o, l9);
                        inputStream.close();
                    }
                    break block6;
                }
                catch (Throwable throwable2222) {
                    break block7;
                }
                catch (IOException iOException) {
                    throw new r(iOException, (k)M.i(this.n), 2000, 3);
                }
            }
            this.p = null;
            this.u();
            if (!this.q) return;
            this.q = false;
            this.r();
            return;
        }
        this.p = null;
        this.u();
        if (!this.q) throw throwable2222;
        this.q = false;
        this.r();
        throw throwable2222;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public long e(k var1_1) {
        block21 : {
            block18 : {
                block20 : {
                    block19 : {
                        this.n = var1_1;
                        var5_2 = 0L;
                        this.t = 0L;
                        this.s = 0L;
                        this.s(var1_1);
                        try {
                            var12_3 = this.x(var1_1);
                            this.o = var12_3;
                            this.r = var12_3.getResponseCode();
                            var14_8 = var12_3.getResponseMessage();
                            var2_9 = this.r;
                            var7_10 = -1L;
                            if (var2_9 < 200 || var2_9 > 299) break block18;
                        }
                        catch (IOException var12_7) {
                            this.u();
                            throw r.c(var12_7, var1_1, 1);
                        }
                        var13_11 = var12_3.getContentType();
                        var14_8 = this.l;
                        if (var14_8 != null && !var14_8.apply(var13_11)) {
                            this.u();
                            throw new s(var13_11, var1_1);
                        }
                        var3_13 = var5_2;
                        if (this.r == 200) {
                            var9_15 = var1_1.g;
                            var3_13 = var5_2;
                            if (var9_15 != 0L) {
                                var3_13 = var9_15;
                            }
                        }
                        if (!(var11_16 = m.w((HttpURLConnection)var12_3))) {
                            var5_2 = var1_1.h;
                            if (var5_2 != -1L) {
                                this.s = var5_2;
                            } else {
                                var9_15 = v.b(var12_3.getHeaderField("Content-Length"), var12_3.getHeaderField("Content-Range"));
                                var5_2 = var7_10;
                                if (var9_15 != -1L) {
                                    var5_2 = var9_15 - var3_13;
                                }
                                this.s = var5_2;
                            }
                        } else {
                            this.s = var1_1.h;
                        }
                        try {
                            this.p = var12_3.getInputStream();
                            if (!var11_16) break block19;
                            this.p = new GZIPInputStream(this.p);
                        }
                        catch (IOException var12_4) {
                            break block20;
                        }
                    }
                    this.q = true;
                    this.t(var1_1);
                    try {
                        this.C(var3_13, var1_1);
                        return this.s;
                    }
                    catch (IOException var12_5) {
                        this.u();
                        if (var12_5 instanceof r == false) throw new r(var12_5, var1_1, 2000, 1);
                        throw (r)var12_5;
                    }
                }
                this.u();
                throw new r(var12_4, var1_1, 2000, 1);
            }
            var15_17 = var12_3.getHeaderFields();
            if (this.r == 416 && var1_1.g == (var3_14 = v.c(var12_3.getHeaderField("Content-Range")))) {
                this.q = true;
                this.t(var1_1);
                var3_14 = var1_1.h;
                if (var3_14 == -1L) return var5_2;
                return var3_14;
            }
            if ((var12_3 = var12_3.getErrorStream()) == null) ** GOTO lbl72
            try {
                var12_3 = Y2.a.b((InputStream)var12_3);
                break block21;
lbl72: // 1 sources:
                var12_3 = M.f;
                break block21;
            }
            catch (IOException var12_6) {}
            var12_3 = M.f;
        }
        this.u();
        if (this.r == 416) {
            var13_12 = new h(2008);
            throw new t(this.r, (String)var14_8, var13_12, var15_17, var1_1, var12_3);
        }
        var13_12 = null;
        throw new t(this.r, (String)var14_8, var13_12, var15_17, var1_1, var12_3);
    }

    @Override
    public Map g() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return w.j();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    @Override
    public Uri k() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse((String)httpURLConnection.getURL().toString());
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        try {
            n8 = this.B(arrby, n8, n9);
            return n8;
        }
        catch (IOException iOException) {
            throw r.c(iOException, (k)M.i(this.n), 2);
        }
    }

    public final void u() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                g0.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", (Throwable)exception);
            }
            this.o = null;
        }
    }

    public final URL v(URL uRL, String string2, k k8) {
        if (string2 != null) {
            URL uRL2;
            try {
                uRL2 = new URL(uRL, string2);
            }
            catch (MalformedURLException malformedURLException) {
                throw new r((IOException)malformedURLException, k8, 2001, 1);
            }
            string2 = uRL2.getProtocol();
            if (!"https".equals((Object)string2) && !"http".equals((Object)string2)) {
                uRL = new StringBuilder();
                uRL.append("Unsupported protocol redirect: ");
                uRL.append(string2);
                throw new r(uRL.toString(), k8, 2001, 1);
            }
            if (!this.e && !string2.equals((Object)uRL.getProtocol())) {
                if (this.f) {
                    try {
                        uRL = new URL(uRL2.toString().replaceFirst(string2, uRL.getProtocol()));
                        return uRL;
                    }
                    catch (MalformedURLException malformedURLException) {
                        throw new r((IOException)malformedURLException, k8, 2001, 1);
                    }
                }
                uRL2 = new StringBuilder();
                uRL2.append("Disallowed cross-protocol redirect (");
                uRL2.append(uRL.getProtocol());
                uRL2.append(" to ");
                uRL2.append(string2);
                uRL2.append(")");
                throw new r(uRL2.toString(), k8, 2001, 1);
            }
            return uRL2;
        }
        throw new r("Null location redirect", k8, 2001, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final HttpURLConnection x(k k8) {
        int n8;
        URL uRL = new URL(k8.a.toString());
        int n9 = k8.c;
        StringBuilder stringBuilder = k8.d;
        long l8 = k8.g;
        long l9 = k8.h;
        boolean bl = k8.d(1);
        if (!(this.e || this.f || this.m)) {
            return this.y(uRL, n9, (byte[])stringBuilder, l8, l9, bl, true, k8.e);
        }
        int n10 = 0;
        do {
            n8 = n10 + 1;
            if (n10 > 20) break;
            HttpURLConnection httpURLConnection = this.y(uRL, n9, (byte[])stringBuilder, l8, l9, bl, false, k8.e);
            n10 = httpURLConnection.getResponseCode();
            String string2 = httpURLConnection.getHeaderField("Location");
            if (n9 != 1 && n9 != 3 || n10 != 300 && n10 != 301 && n10 != 302 && n10 != 303 && n10 != 307 && n10 != 308) {
                if (n9 != 2 || n10 != 300 && n10 != 301 && n10 != 302 && n10 != 303) return httpURLConnection;
                httpURLConnection.disconnect();
                if (!this.m || n10 != 302) {
                    stringBuilder = null;
                    n9 = 1;
                }
                uRL = this.v(uRL, string2, k8);
            } else {
                httpURLConnection.disconnect();
                uRL = this.v(uRL, string2, k8);
            }
            n10 = n8;
        } while (true);
        stringBuilder = new StringBuilder();
        stringBuilder.append("Too many redirects: ");
        stringBuilder.append(n8);
        throw new r((IOException)new NoRouteToHostException(stringBuilder.toString()), k8, 2001, 1);
    }

    public final HttpURLConnection y(URL object, int n8, byte[] arrby, long l8, long l9, boolean bl, boolean bl2, Map map2) {
        HttpURLConnection httpURLConnection = this.A((URL)object);
        httpURLConnection.setConnectTimeout(this.g);
        httpURLConnection.setReadTimeout(this.h);
        object = new HashMap();
        u u8 = this.j;
        if (u8 != null) {
            object.putAll(u8.b());
        }
        object.putAll(this.k.b());
        object.putAll(map2);
        for (Map map2 : object.entrySet()) {
            httpURLConnection.setRequestProperty((String)map2.getKey(), (String)map2.getValue());
        }
        object = v.a(l8, l9);
        if (object != null) {
            httpURLConnection.setRequestProperty("Range", (String)object);
        }
        if ((object = this.i) != null) {
            httpURLConnection.setRequestProperty("User-Agent", (String)object);
        }
        object = bl ? "gzip" : "identity";
        httpURLConnection.setRequestProperty("Accept-Encoding", (String)object);
        httpURLConnection.setInstanceFollowRedirects(bl2);
        bl = arrby != null;
        httpURLConnection.setDoOutput(bl);
        httpURLConnection.setRequestMethod(k.c(n8));
        if (arrby != null) {
            httpURLConnection.setFixedLengthStreamingMode(arrby.length);
            httpURLConnection.connect();
            object = httpURLConnection.getOutputStream();
            object.write(arrby);
            object.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static final class b
    implements g.a {
        public final u a = new u();
        public y b;
        public W2.n c;
        public String d;
        public int e = 8000;
        public int f = 8000;
        public boolean g;
        public boolean h;
        public boolean i;

        public m b() {
            m m8 = new m(this.d, this.e, this.f, this.g, this.h, this.a, this.c, this.i, null);
            y y8 = this.b;
            if (y8 != null) {
                m8.c(y8);
            }
            return m8;
        }

        public b c(boolean bl) {
            this.g = bl;
            return this;
        }

        public b d(Map map) {
            this.a.a(map);
            return this;
        }

        public b e(String string2) {
            this.d = string2;
            return this;
        }
    }

    public static class c
    extends q {
        public final Map o;

        public c(Map map) {
            this.o = map;
        }

        public static /* synthetic */ boolean f(Map.Entry entry) {
            return c.i(entry);
        }

        public static /* synthetic */ boolean g(String string2) {
            return c.j(string2);
        }

        public static /* synthetic */ boolean i(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ boolean j(String string2) {
            if (string2 != null) {
                return true;
            }
            return false;
        }

        @Override
        public Map b() {
            return this.o;
        }

        @Override
        public boolean containsKey(Object object) {
            if (object != null && super.containsKey(object)) {
                return true;
            }
            return false;
        }

        public boolean containsValue(Object object) {
            return super.c(object);
        }

        @Override
        public Set entrySet() {
            return a0.b(super.entrySet(), new n());
        }

        public boolean equals(Object object) {
            if (object != null && super.d(object)) {
                return true;
            }
            return false;
        }

        public List h(Object object) {
            if (object == null) {
                return null;
            }
            return (List)super.get(object);
        }

        public int hashCode() {
            return super.e();
        }

        @Override
        public boolean isEmpty() {
            boolean bl = super.isEmpty();
            boolean bl2 = true;
            if (!bl) {
                if (super.size() == 1 && super.containsKey(null)) {
                    return true;
                }
                bl2 = false;
            }
            return bl2;
        }

        @Override
        public Set keySet() {
            return a0.b(super.keySet(), new o());
        }

        @Override
        public int size() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }
    }

}

