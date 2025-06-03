// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.util.List;
import X2.a0;
import java.util.Set;
import X2.q;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.HashMap;
import java.net.NoRouteToHostException;
import java.net.MalformedURLException;
import g0.o;
import android.net.Uri;
import X2.w;
import java.util.Map;
import java.io.IOException;
import java.io.InterruptedIOException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.net.URL;
import java.lang.reflect.Method;
import g0.a;
import g0.M;
import java.io.InputStream;
import java.net.HttpURLConnection;
import W2.n;

public class m extends i0.b implements g
{
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final u j;
    public final u k;
    public final n l;
    public final boolean m;
    public k n;
    public HttpURLConnection o;
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;
    
    public m(final String i, final int g, final int h, final boolean e, final boolean f, final u j, final n l, final boolean m) {
        super(true);
        this.i = i;
        this.g = g;
        this.h = h;
        this.e = e;
        this.f = f;
        if (e && f) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.j = j;
        this.l = l;
        this.k = new u();
        this.m = m;
    }
    
    public static boolean w(final HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }
    
    public static void z(final HttpURLConnection httpURLConnection, final long n) {
        if (httpURLConnection == null) {
            return;
        }
        if (M.a > 20) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    final InputStream inputStream = httpURLConnection.getInputStream();
                    if (n == -1L) {
                        if (inputStream.read() == -1) {
                            return;
                        }
                        final String name = inputStream.getClass().getName();
                        if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                            final Method declaredMethod = ((Class)g0.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", (Class[])new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                        return;
                    }
                }
                catch (Exception ex) {
                    return;
                }
                if (n <= 2048L) {
                    break;
                }
                continue;
            }
        }
    }
    
    public HttpURLConnection A(final URL url) {
        return (HttpURLConnection)FirebasePerfUrlConnection.instrument(url.openConnection());
    }
    
    public final int B(final byte[] b, int read, final int n) {
        if (n == 0) {
            return 0;
        }
        final long s = this.s;
        int len = n;
        if (s != -1L) {
            final long b2 = s - this.t;
            if (b2 == 0L) {
                return -1;
            }
            len = (int)Math.min(n, b2);
        }
        read = ((InputStream)M.i(this.p)).read(b, read, len);
        if (read == -1) {
            return -1;
        }
        this.t += read;
        this.q(read);
        return read;
    }
    
    public final void C(long a, final k k) {
        if (a == 0L) {
            return;
        }
        final byte[] b = new byte[4096];
        while (a > 0L) {
            final int read = ((InputStream)M.i(this.p)).read(b, 0, (int)Math.min(a, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new r(new InterruptedIOException(), k, 2000, 1);
            }
            if (read == -1) {
                throw new r(k, 2008, 1);
            }
            a -= read;
            this.q(read);
        }
    }
    
    @Override
    public void close() {
        while (true) {
            InputStream p;
            try {
                p = this.p;
                if (p != null) {
                    final long s = this.s;
                    long n = -1L;
                    if (s != -1L) {
                        n = s - this.t;
                    }
                    z(this.o, n);
                    final InputStream inputStream = p;
                    inputStream.close();
                }
                break Label_0085;
            }
            finally {
                this.p = null;
                this.u();
                if (this.q) {
                    this.q = false;
                    this.r();
                }
                this.p = null;
                this.u();
                // iftrue(Label_0110:, !this.q)
                this.q = false;
                this.r();
                Label_0110: {
                    return;
                }
            }
            try {
                final InputStream inputStream = p;
                inputStream.close();
                continue;
            }
            catch (IOException ex) {}
            break;
        }
    }
    
    @Override
    public long e(final k p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: putfield        i0/m.n:Li0/k;
        //     5: lconst_0       
        //     6: lstore          5
        //     8: aload_0        
        //     9: lconst_0       
        //    10: putfield        i0/m.t:J
        //    13: aload_0        
        //    14: lconst_0       
        //    15: putfield        i0/m.s:J
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokevirtual   i0/b.s:(Li0/k;)V
        //    23: aload_0        
        //    24: aload_1        
        //    25: invokevirtual   i0/m.x:(Li0/k;)Ljava/net/HttpURLConnection;
        //    28: astore          12
        //    30: aload_0        
        //    31: aload           12
        //    33: putfield        i0/m.o:Ljava/net/HttpURLConnection;
        //    36: aload_0        
        //    37: aload           12
        //    39: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    42: putfield        i0/m.r:I
        //    45: aload           12
        //    47: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //    50: astore          14
        //    52: aload_0        
        //    53: getfield        i0/m.r:I
        //    56: istore_2       
        //    57: ldc2_w          -1
        //    60: lstore          7
        //    62: iload_2        
        //    63: sipush          200
        //    66: if_icmplt       364
        //    69: iload_2        
        //    70: sipush          299
        //    73: if_icmple       79
        //    76: goto            364
        //    79: aload           12
        //    81: invokevirtual   java/net/URLConnection.getContentType:()Ljava/lang/String;
        //    84: astore          13
        //    86: aload_0        
        //    87: getfield        i0/m.l:LW2/n;
        //    90: astore          14
        //    92: aload           14
        //    94: ifnull          127
        //    97: aload           14
        //    99: aload           13
        //   101: invokeinterface W2/n.apply:(Ljava/lang/Object;)Z
        //   106: ifeq            112
        //   109: goto            127
        //   112: aload_0        
        //   113: invokevirtual   i0/m.u:()V
        //   116: new             Li0/s;
        //   119: dup            
        //   120: aload           13
        //   122: aload_1        
        //   123: invokespecial   i0/s.<init>:(Ljava/lang/String;Li0/k;)V
        //   126: athrow         
        //   127: lload           5
        //   129: lstore_3       
        //   130: aload_0        
        //   131: getfield        i0/m.r:I
        //   134: sipush          200
        //   137: if_icmpne       159
        //   140: aload_1        
        //   141: getfield        i0/k.g:J
        //   144: lstore          9
        //   146: lload           5
        //   148: lstore_3       
        //   149: lload           9
        //   151: lconst_0       
        //   152: lcmp           
        //   153: ifeq            159
        //   156: lload           9
        //   158: lstore_3       
        //   159: aload           12
        //   161: invokestatic    i0/m.w:(Ljava/net/HttpURLConnection;)Z
        //   164: istore          11
        //   166: iload           11
        //   168: ifne            244
        //   171: aload_1        
        //   172: getfield        i0/k.h:J
        //   175: lstore          5
        //   177: lload           5
        //   179: ldc2_w          -1
        //   182: lcmp           
        //   183: ifeq            195
        //   186: aload_0        
        //   187: lload           5
        //   189: putfield        i0/m.s:J
        //   192: goto            252
        //   195: aload           12
        //   197: ldc_w           "Content-Length"
        //   200: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   203: aload           12
        //   205: ldc_w           "Content-Range"
        //   208: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   211: invokestatic    i0/v.b:(Ljava/lang/String;Ljava/lang/String;)J
        //   214: lstore          9
        //   216: lload           7
        //   218: lstore          5
        //   220: lload           9
        //   222: ldc2_w          -1
        //   225: lcmp           
        //   226: ifeq            235
        //   229: lload           9
        //   231: lload_3        
        //   232: lsub           
        //   233: lstore          5
        //   235: aload_0        
        //   236: lload           5
        //   238: putfield        i0/m.s:J
        //   241: goto            252
        //   244: aload_0        
        //   245: aload_1        
        //   246: getfield        i0/k.h:J
        //   249: putfield        i0/m.s:J
        //   252: aload_0        
        //   253: aload           12
        //   255: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   258: putfield        i0/m.p:Ljava/io/InputStream;
        //   261: iload           11
        //   263: ifeq            289
        //   266: aload_0        
        //   267: new             Ljava/util/zip/GZIPInputStream;
        //   270: dup            
        //   271: aload_0        
        //   272: getfield        i0/m.p:Ljava/io/InputStream;
        //   275: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   278: putfield        i0/m.p:Ljava/io/InputStream;
        //   281: goto            289
        //   284: astore          12
        //   286: goto            345
        //   289: aload_0        
        //   290: iconst_1       
        //   291: putfield        i0/m.q:Z
        //   294: aload_0        
        //   295: aload_1        
        //   296: invokevirtual   i0/b.t:(Li0/k;)V
        //   299: aload_0        
        //   300: lload_3        
        //   301: aload_1        
        //   302: invokevirtual   i0/m.C:(JLi0/k;)V
        //   305: aload_0        
        //   306: getfield        i0/m.s:J
        //   309: lreturn        
        //   310: astore          12
        //   312: aload_0        
        //   313: invokevirtual   i0/m.u:()V
        //   316: aload           12
        //   318: instanceof      Li0/r;
        //   321: ifeq            330
        //   324: aload           12
        //   326: checkcast       Li0/r;
        //   329: athrow         
        //   330: new             Li0/r;
        //   333: dup            
        //   334: aload           12
        //   336: aload_1        
        //   337: sipush          2000
        //   340: iconst_1       
        //   341: invokespecial   i0/r.<init>:(Ljava/io/IOException;Li0/k;II)V
        //   344: athrow         
        //   345: aload_0        
        //   346: invokevirtual   i0/m.u:()V
        //   349: new             Li0/r;
        //   352: dup            
        //   353: aload           12
        //   355: aload_1        
        //   356: sipush          2000
        //   359: iconst_1       
        //   360: invokespecial   i0/r.<init>:(Ljava/io/IOException;Li0/k;II)V
        //   363: athrow         
        //   364: aload           12
        //   366: invokevirtual   java/net/URLConnection.getHeaderFields:()Ljava/util/Map;
        //   369: astore          15
        //   371: aload_0        
        //   372: getfield        i0/m.r:I
        //   375: sipush          416
        //   378: if_icmpne       431
        //   381: aload           12
        //   383: ldc_w           "Content-Range"
        //   386: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   389: invokestatic    i0/v.c:(Ljava/lang/String;)J
        //   392: lstore_3       
        //   393: aload_1        
        //   394: getfield        i0/k.g:J
        //   397: lload_3        
        //   398: lcmp           
        //   399: ifne            431
        //   402: aload_0        
        //   403: iconst_1       
        //   404: putfield        i0/m.q:Z
        //   407: aload_0        
        //   408: aload_1        
        //   409: invokevirtual   i0/b.t:(Li0/k;)V
        //   412: aload_1        
        //   413: getfield        i0/k.h:J
        //   416: lstore_3       
        //   417: lload_3        
        //   418: ldc2_w          -1
        //   421: lcmp           
        //   422: ifeq            428
        //   425: lload_3        
        //   426: lstore          5
        //   428: lload           5
        //   430: lreturn        
        //   431: aload           12
        //   433: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //   436: astore          12
        //   438: aload           12
        //   440: ifnull          453
        //   443: aload           12
        //   445: invokestatic    Y2/a.b:(Ljava/io/InputStream;)[B
        //   448: astore          12
        //   450: goto            458
        //   453: getstatic       g0/M.f:[B
        //   456: astore          12
        //   458: goto            469
        //   461: getstatic       g0/M.f:[B
        //   464: astore          12
        //   466: goto            458
        //   469: aload_0        
        //   470: invokevirtual   i0/m.u:()V
        //   473: aload_0        
        //   474: getfield        i0/m.r:I
        //   477: sipush          416
        //   480: if_icmpne       498
        //   483: new             Li0/h;
        //   486: dup            
        //   487: sipush          2008
        //   490: invokespecial   i0/h.<init>:(I)V
        //   493: astore          13
        //   495: goto            504
        //   498: aconst_null    
        //   499: astore          13
        //   501: goto            495
        //   504: new             Li0/t;
        //   507: dup            
        //   508: aload_0        
        //   509: getfield        i0/m.r:I
        //   512: aload           14
        //   514: aload           13
        //   516: aload           15
        //   518: aload_1        
        //   519: aload           12
        //   521: invokespecial   i0/t.<init>:(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Li0/k;[B)V
        //   524: athrow         
        //   525: astore          12
        //   527: aload_0        
        //   528: invokevirtual   i0/m.u:()V
        //   531: aload           12
        //   533: aload_1        
        //   534: iconst_1       
        //   535: invokestatic    i0/r.c:(Ljava/io/IOException;Li0/k;I)Li0/r;
        //   538: athrow         
        //   539: astore          12
        //   541: goto            461
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     52     525    539    Ljava/io/IOException;
        //  252    261    284    289    Ljava/io/IOException;
        //  266    281    284    289    Ljava/io/IOException;
        //  299    305    310    345    Ljava/io/IOException;
        //  443    450    539    469    Ljava/io/IOException;
        //  453    458    539    469    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0453:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public Map g() {
        final HttpURLConnection o = this.o;
        if (o == null) {
            return w.j();
        }
        return new c(o.getHeaderFields());
    }
    
    @Override
    public Uri k() {
        final HttpURLConnection o = this.o;
        if (o == null) {
            return null;
        }
        return Uri.parse(o.getURL().toString());
    }
    
    @Override
    public int read(final byte[] array, int b, final int n) {
        try {
            b = this.B(array, b, n);
            return b;
        }
        catch (IOException ex) {
            throw i0.r.c(ex, (k)M.i(this.n), 2);
        }
    }
    
    public final void u() {
        final HttpURLConnection o = this.o;
        if (o != null) {
            try {
                o.disconnect();
            }
            catch (Exception ex) {
                g0.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", ex);
            }
            this.o = null;
        }
    }
    
    public final URL v(URL context, String protocol, final k k) {
        if (protocol != null) {
            try {
                final URL url = new URL(context, protocol);
                protocol = url.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported protocol redirect: ");
                    sb.append(protocol);
                    throw new r(sb.toString(), k, 2001, 1);
                }
                if (!this.e && !protocol.equals(context.getProtocol())) {
                    if (this.f) {
                        try {
                            context = new URL(url.toString().replaceFirst(protocol, context.getProtocol()));
                            return context;
                        }
                        catch (MalformedURLException ex) {
                            throw new r(ex, k, 2001, 1);
                        }
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Disallowed cross-protocol redirect (");
                    sb2.append(context.getProtocol());
                    sb2.append(" to ");
                    sb2.append(protocol);
                    sb2.append(")");
                    throw new r(sb2.toString(), k, 2001, 1);
                }
                return url;
            }
            catch (MalformedURLException ex2) {
                throw new r(ex2, k, 2001, 1);
            }
        }
        throw new r("Null location redirect", k, 2001, 1);
    }
    
    public final HttpURLConnection x(final k k) {
        URL url = new URL(k.a.toString());
        int c = k.c;
        byte[] d = k.d;
        final long g = k.g;
        final long h = k.h;
        final boolean d2 = k.d(1);
        if (!this.e && !this.f && !this.m) {
            return this.y(url, c, d, g, h, d2, true, k.e);
        }
        int n = 0;
        while (true) {
            final int i = n + 1;
            if (n > 20) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Too many redirects: ");
                sb.append(i);
                throw new r(new NoRouteToHostException(sb.toString()), k, 2001, 1);
            }
            final HttpURLConnection y = this.y(url, c, d, g, h, d2, false, k.e);
            final int responseCode = y.getResponseCode();
            final String headerField = y.getHeaderField("Location");
            if ((c == 1 || c == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                y.disconnect();
                url = this.v(url, headerField, k);
            }
            else {
                if (c != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return y;
                }
                y.disconnect();
                if (!this.m || responseCode != 302) {
                    d = null;
                    c = 1;
                }
                url = this.v(url, headerField, k);
            }
            n = i;
        }
    }
    
    public final HttpURLConnection y(final URL url, final int n, final byte[] b, final long n2, final long n3, final boolean b2, final boolean instanceFollowRedirects, final Map map) {
        final HttpURLConnection a = this.A(url);
        a.setConnectTimeout(this.g);
        a.setReadTimeout(this.h);
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        final u j = this.j;
        if (j != null) {
            hashMap.putAll((Map<?, ?>)j.b());
        }
        hashMap.putAll((Map<?, ?>)this.k.b());
        hashMap.putAll((Map<?, ?>)map);
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            a.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
        final String a2 = v.a(n2, n3);
        if (a2 != null) {
            a.setRequestProperty("Range", a2);
        }
        final String i = this.i;
        if (i != null) {
            a.setRequestProperty("User-Agent", i);
        }
        String value;
        if (b2) {
            value = "gzip";
        }
        else {
            value = "identity";
        }
        a.setRequestProperty("Accept-Encoding", value);
        a.setInstanceFollowRedirects(instanceFollowRedirects);
        a.setDoOutput(b != null);
        a.setRequestMethod(i0.k.c(n));
        if (b != null) {
            a.setFixedLengthStreamingMode(b.length);
            a.connect();
            final OutputStream outputStream = a.getOutputStream();
            outputStream.write(b);
            outputStream.close();
            return a;
        }
        a.connect();
        return a;
    }
    
    public static final class b implements a
    {
        public final u a;
        public y b;
        public n c;
        public String d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;
        public boolean i;
        
        public b() {
            this.a = new u();
            this.e = 8000;
            this.f = 8000;
        }
        
        public m b() {
            final m m = new m(this.d, this.e, this.f, this.g, this.h, this.a, this.c, this.i, null);
            final y b = this.b;
            if (b != null) {
                m.c(b);
            }
            return m;
        }
        
        public b c(final boolean g) {
            this.g = g;
            return this;
        }
        
        public b d(final Map map) {
            this.a.a(map);
            return this;
        }
        
        public b e(final String d) {
            this.d = d;
            return this;
        }
    }
    
    public static class c extends q
    {
        public final Map o;
        
        public c(final Map o) {
            this.o = o;
        }
        
        @Override
        public Map b() {
            return this.o;
        }
        
        @Override
        public boolean containsKey(final Object o) {
            return o != null && super.containsKey(o);
        }
        
        @Override
        public boolean containsValue(final Object o) {
            return super.c(o);
        }
        
        @Override
        public Set entrySet() {
            return a0.b(super.entrySet(), new i0.n());
        }
        
        @Override
        public boolean equals(final Object o) {
            return o != null && super.d(o);
        }
        
        public List h(final Object o) {
            if (o == null) {
                return null;
            }
            return (List)super.get(o);
        }
        
        @Override
        public int hashCode() {
            return super.e();
        }
        
        @Override
        public boolean isEmpty() {
            final boolean empty = super.isEmpty();
            boolean b = true;
            if (!empty) {
                if (super.size() == 1 && super.containsKey(null)) {
                    return true;
                }
                b = false;
            }
            return b;
        }
        
        @Override
        public Set keySet() {
            return a0.b(super.keySet(), new i0.o());
        }
        
        @Override
        public int size() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
    }
}
