// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e4;

import javax.net.ssl.HttpsURLConnection;
import android.net.SSLCertificateSocketFactory;
import javax.net.ssl.SSLSocket;
import android.net.SSLSessionCache;
import java.io.File;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executors;
import java.net.URI;
import java.net.Socket;
import java.util.concurrent.ThreadFactory;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;

public class c
{
    public static final AtomicInteger l;
    public static final Charset m;
    public static ThreadFactory n;
    public static b o;
    public volatile d a;
    public volatile Socket b;
    public e4.d c;
    public final URI d;
    public final String e;
    public final h f;
    public final i g;
    public final f h;
    public final c4.c i;
    public final int j;
    public final Thread k;
    
    static {
        l = new AtomicInteger(0);
        m = Charset.forName("UTF-8");
        c.n = Executors.defaultThreadFactory();
        c.o = new b() {
            @Override
            public void a(final Thread thread, final String name) {
                thread.setName(name);
            }
        };
    }
    
    public c(final T3.c c, final URI d, final String s, final Map map) {
        this.a = e4.c.d.o;
        this.b = null;
        this.c = null;
        final int incrementAndGet = e4.c.l.incrementAndGet();
        this.j = incrementAndGet;
        this.k = j().newThread(new Runnable() {
            @Override
            public void run() {
                e4.c.this.n();
            }
        });
        this.d = d;
        this.e = c.g();
        final c4.d f = c.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("sk_");
        sb.append(incrementAndGet);
        this.i = new c4.c(f, "WebSocket", sb.toString());
        this.h = new f(d, s, map);
        this.f = new h(this);
        this.g = new i(this, "TubeSock", incrementAndGet);
    }
    
    public static b i() {
        return c.o;
    }
    
    public static ThreadFactory j() {
        return c.n;
    }
    
    public void b() {
        if (this.g.d().getState() != Thread.State.NEW) {
            this.g.d().join();
        }
        this.h().join();
    }
    
    public void c() {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0068: {
            Label_0058: {
                try {
                    final int n = c$c.a[this.a.ordinal()];
                    if (n == 1) {
                        break Label_0058;
                    }
                    if (n != 2) {
                        if (n == 3) {
                            this.q();
                            // monitorexit(this)
                            return;
                        }
                        if (n != 4) {
                            // monitorexit(this)
                            return;
                        }
                        // monitorexit(this)
                        return;
                    }
                }
                finally {
                    break Label_0068;
                }
                this.d();
                return;
            }
            this.a = e4.c.d.s;
            return;
        }
    }
    // monitorexit(this)
    
    public final void d() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0095: {
            Label_0076: {
                try {
                    if (this.a == e4.c.d.s) {
                        // monitorexit(this)
                        return;
                    }
                    this.f.h();
                    this.g.i();
                    if (this.b != null) {
                        final c c = this;
                        final Socket socket = c.b;
                        socket.close();
                    }
                    break Label_0076;
                }
                finally {
                    break Label_0095;
                }
                try {
                    final c c = this;
                    final Socket socket = c.b;
                    socket.close();
                }
                catch (Exception ex) {
                    this.c.d(new e("Failed to close", ex));
                }
            }
            this.a = e4.c.d.s;
            this.c.b();
            return;
        }
    }
    // monitorexit(this)
    
    public void e() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0102: {
            try {
                if (this.a != e4.c.d.o) {
                    this.c.d(new e("connect() already called"));
                    this.c();
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0102;
            }
            final b i = i();
            final Thread h = this.h();
            final StringBuilder sb = new StringBuilder();
            sb.append("TubeSockReader-");
            sb.append(this.j);
            i.a(h, sb.toString());
            this.a = e4.c.d.p;
            this.h().start();
            return;
        }
    }
    // monitorexit(this)
    
    public final Socket f() {
        final String scheme = this.d.getScheme();
        final String host = this.d.getHost();
        final int port = this.d.getPort();
        if (scheme != null && scheme.equals("ws")) {
            int port2;
            if ((port2 = port) == -1) {
                port2 = 80;
            }
            Label_0112: {
                try {
                    return new Socket(host, port2);
                }
                catch (IOException ex) {}
                catch (UnknownHostException ex2) {
                    break Label_0112;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("error while creating socket to ");
                sb.append(this.d);
                final IOException ex;
                throw new e(sb.toString(), ex);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown host: ");
            sb2.append(host);
            final UnknownHostException ex2;
            throw new e(sb2.toString(), ex2);
        }
        if (scheme != null && scheme.equals("wss")) {
            int n;
            if ((n = port) == -1) {
                n = 443;
            }
            SSLSessionCache sslSessionCache = null;
            try {
                if (this.e != null) {
                    sslSessionCache = new SSLSessionCache(new File(this.e));
                }
            }
            catch (IOException ex3) {
                this.i.a("Failed to initialize SSL session cache", ex3, new Object[0]);
                sslSessionCache = sslSessionCache;
            }
            Label_0354: {
                try {
                    final SSLSocket sslSocket = (SSLSocket)SSLCertificateSocketFactory.getDefault(60000, sslSessionCache).createSocket(host, n);
                    if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sslSocket.getSession())) {
                        return sslSocket;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error while verifying secure socket to ");
                    sb3.append(this.d);
                    throw new e(sb3.toString());
                }
                catch (IOException ex4) {}
                catch (UnknownHostException ex5) {
                    break Label_0354;
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("error while creating secure socket to ");
                sb4.append(this.d);
                final IOException ex4;
                throw new e(sb4.toString(), ex4);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("unknown host: ");
            sb5.append(host);
            final UnknownHostException ex5;
            throw new e(sb5.toString(), ex5);
        }
        final StringBuilder sb6 = new StringBuilder();
        sb6.append("unsupported protocol: ");
        sb6.append(scheme);
        throw new e(sb6.toString());
    }
    
    public e4.d g() {
        return this.c;
    }
    
    public Thread h() {
        return this.k;
    }
    
    public void k(final e e) {
        this.c.d(e);
        if (this.a == e4.c.d.q) {
            this.c();
        }
        this.d();
    }
    
    public void l() {
        this.d();
    }
    
    public void m(final byte[] array) {
        synchronized (this) {
            this.o((byte)10, array);
        }
    }
    
    public final void n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   e4/c.f:()Ljava/net/Socket;
        //     4: astore          4
        //     6: aload_0        
        //     7: monitorenter   
        //     8: aload_0        
        //     9: aload           4
        //    11: putfield        e4/c.b:Ljava/net/Socket;
        //    14: aload_0        
        //    15: getfield        e4/c.a:Le4/c$d;
        //    18: astore          5
        //    20: getstatic       e4/c$d.s:Le4/c$d;
        //    23: astore          6
        //    25: aload           5
        //    27: aload           6
        //    29: if_acmpne       68
        //    32: aload_0        
        //    33: getfield        e4/c.b:Ljava/net/Socket;
        //    36: invokevirtual   java/net/Socket.close:()V
        //    39: aload_0        
        //    40: aconst_null    
        //    41: putfield        e4/c.b:Ljava/net/Socket;
        //    44: aload_0        
        //    45: monitorexit    
        //    46: aload_0        
        //    47: invokevirtual   e4/c.c:()V
        //    50: return         
        //    51: astore          4
        //    53: goto            457
        //    56: astore          4
        //    58: new             Ljava/lang/RuntimeException;
        //    61: dup            
        //    62: aload           4
        //    64: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //    67: athrow         
        //    68: aload_0        
        //    69: monitorexit    
        //    70: new             Ljava/io/DataInputStream;
        //    73: dup            
        //    74: aload           4
        //    76: invokevirtual   java/net/Socket.getInputStream:()Ljava/io/InputStream;
        //    79: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    82: astore          5
        //    84: aload           4
        //    86: invokevirtual   java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        //    89: astore          6
        //    91: aload           6
        //    93: aload_0        
        //    94: getfield        e4/c.h:Le4/f;
        //    97: invokevirtual   e4/f.c:()[B
        //   100: invokevirtual   java/io/OutputStream.write:([B)V
        //   103: sipush          1000
        //   106: newarray        B
        //   108: astore          4
        //   110: new             Ljava/util/ArrayList;
        //   113: dup            
        //   114: invokespecial   java/util/ArrayList.<init>:()V
        //   117: astore          7
        //   119: iconst_0       
        //   120: istore_2       
        //   121: iload_2        
        //   122: istore_1       
        //   123: iload_2        
        //   124: ifne            288
        //   127: aload           5
        //   129: invokevirtual   java/io/InputStream.read:()I
        //   132: istore_3       
        //   133: iload_3        
        //   134: iconst_m1      
        //   135: if_icmpeq       277
        //   138: aload           4
        //   140: iload_1        
        //   141: iload_3        
        //   142: i2b            
        //   143: bastore        
        //   144: iload_1        
        //   145: iconst_1       
        //   146: iadd           
        //   147: istore_3       
        //   148: aload           4
        //   150: iload_1        
        //   151: baload         
        //   152: bipush          10
        //   154: if_icmpne       552
        //   157: aload           4
        //   159: iload_1        
        //   160: iconst_1       
        //   161: isub           
        //   162: baload         
        //   163: bipush          13
        //   165: if_icmpne       552
        //   168: new             Ljava/lang/String;
        //   171: dup            
        //   172: aload           4
        //   174: getstatic       e4/c.m:Ljava/nio/charset/Charset;
        //   177: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //   180: astore          4
        //   182: aload           4
        //   184: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   187: ldc_w           ""
        //   190: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   193: ifeq            201
        //   196: iconst_1       
        //   197: istore_2       
        //   198: goto            212
        //   201: aload           7
        //   203: aload           4
        //   205: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   208: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   211: pop            
        //   212: sipush          1000
        //   215: newarray        B
        //   217: astore          4
        //   219: iconst_0       
        //   220: istore_1       
        //   221: goto            123
        //   224: new             Ljava/lang/String;
        //   227: dup            
        //   228: aload           4
        //   230: getstatic       e4/c.m:Ljava/nio/charset/Charset;
        //   233: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //   236: astore          4
        //   238: new             Ljava/lang/StringBuilder;
        //   241: dup            
        //   242: invokespecial   java/lang/StringBuilder.<init>:()V
        //   245: astore          5
        //   247: aload           5
        //   249: ldc_w           "Unexpected long line in handshake: "
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: pop            
        //   256: aload           5
        //   258: aload           4
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: pop            
        //   264: new             Le4/e;
        //   267: dup            
        //   268: aload           5
        //   270: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   273: invokespecial   e4/e.<init>:(Ljava/lang/String;)V
        //   276: athrow         
        //   277: new             Le4/e;
        //   280: dup            
        //   281: ldc_w           "Connection closed before handshake was complete"
        //   284: invokespecial   e4/e.<init>:(Ljava/lang/String;)V
        //   287: athrow         
        //   288: aload_0        
        //   289: getfield        e4/c.h:Le4/f;
        //   292: aload           7
        //   294: iconst_0       
        //   295: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   298: checkcast       Ljava/lang/String;
        //   301: invokevirtual   e4/f.f:(Ljava/lang/String;)V
        //   304: aload           7
        //   306: iconst_0       
        //   307: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   310: pop            
        //   311: new             Ljava/util/HashMap;
        //   314: dup            
        //   315: invokespecial   java/util/HashMap.<init>:()V
        //   318: astore          4
        //   320: aload           7
        //   322: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   325: astore          7
        //   327: aload           7
        //   329: invokeinterface java/util/Iterator.hasNext:()Z
        //   334: ifeq            392
        //   337: aload           7
        //   339: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   344: checkcast       Ljava/lang/String;
        //   347: ldc_w           ": "
        //   350: iconst_2       
        //   351: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   354: astore          8
        //   356: aload           8
        //   358: iconst_0       
        //   359: aaload         
        //   360: astore          9
        //   362: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   365: astore          10
        //   367: aload           4
        //   369: aload           9
        //   371: aload           10
        //   373: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   376: aload           8
        //   378: iconst_1       
        //   379: aaload         
        //   380: aload           10
        //   382: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   385: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   388: pop            
        //   389: goto            327
        //   392: aload_0        
        //   393: getfield        e4/c.h:Le4/f;
        //   396: aload           4
        //   398: invokevirtual   e4/f.e:(Ljava/util/HashMap;)V
        //   401: aload_0        
        //   402: getfield        e4/c.g:Le4/i;
        //   405: aload           6
        //   407: invokevirtual   e4/i.h:(Ljava/io/OutputStream;)V
        //   410: aload_0        
        //   411: getfield        e4/c.f:Le4/h;
        //   414: aload           5
        //   416: invokevirtual   e4/h.g:(Ljava/io/DataInputStream;)V
        //   419: aload_0        
        //   420: getstatic       e4/c$d.q:Le4/c$d;
        //   423: putfield        e4/c.a:Le4/c$d;
        //   426: aload_0        
        //   427: getfield        e4/c.g:Le4/i;
        //   430: invokevirtual   e4/i.d:()Ljava/lang/Thread;
        //   433: invokevirtual   java/lang/Thread.start:()V
        //   436: aload_0        
        //   437: getfield        e4/c.c:Le4/d;
        //   440: invokeinterface e4/d.c:()V
        //   445: aload_0        
        //   446: getfield        e4/c.f:Le4/h;
        //   449: invokevirtual   e4/h.f:()V
        //   452: aload_0        
        //   453: invokevirtual   e4/c.c:()V
        //   456: return         
        //   457: aload_0        
        //   458: monitorexit    
        //   459: aload           4
        //   461: athrow         
        //   462: aload_0        
        //   463: getfield        e4/c.c:Le4/d;
        //   466: astore          4
        //   468: new             Ljava/lang/StringBuilder;
        //   471: dup            
        //   472: invokespecial   java/lang/StringBuilder.<init>:()V
        //   475: astore          5
        //   477: aload           5
        //   479: ldc_w           "error while connecting: "
        //   482: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   485: pop            
        //   486: aload           5
        //   488: aload           6
        //   490: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   493: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   496: pop            
        //   497: aload           4
        //   499: new             Le4/e;
        //   502: dup            
        //   503: aload           5
        //   505: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   508: aload           6
        //   510: invokespecial   e4/e.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   513: invokeinterface e4/d.d:(Le4/e;)V
        //   518: goto            452
        //   521: aload_0        
        //   522: getfield        e4/c.c:Le4/d;
        //   525: aload           4
        //   527: invokeinterface e4/d.d:(Le4/e;)V
        //   532: goto            452
        //   535: aload_0        
        //   536: invokevirtual   e4/c.c:()V
        //   539: aload           4
        //   541: athrow         
        //   542: astore          6
        //   544: goto            462
        //   547: astore          4
        //   549: goto            521
        //   552: iload_3        
        //   553: sipush          1000
        //   556: if_icmpeq       224
        //   559: iload_3        
        //   560: istore_1       
        //   561: goto            123
        //   564: astore          4
        //   566: goto            535
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      8      547    535    Le4/e;
        //  0      8      542    521    Any
        //  8      25     51     462    Any
        //  32     39     56     68     Ljava/io/IOException;
        //  32     39     51     462    Any
        //  39     46     51     462    Any
        //  58     68     51     462    Any
        //  68     70     51     462    Any
        //  70     119    547    535    Le4/e;
        //  70     119    542    521    Any
        //  127    133    547    535    Le4/e;
        //  127    133    542    521    Any
        //  168    196    547    535    Le4/e;
        //  168    196    542    521    Any
        //  201    212    547    535    Le4/e;
        //  201    212    542    521    Any
        //  212    219    547    535    Le4/e;
        //  212    219    542    521    Any
        //  224    277    547    535    Le4/e;
        //  224    277    542    521    Any
        //  277    288    547    535    Le4/e;
        //  277    288    542    521    Any
        //  288    327    547    535    Le4/e;
        //  288    327    542    521    Any
        //  327    356    547    535    Le4/e;
        //  327    356    542    521    Any
        //  362    389    547    535    Le4/e;
        //  362    389    542    521    Any
        //  392    452    547    535    Le4/e;
        //  392    452    542    521    Any
        //  457    459    51     462    Any
        //  459    462    547    535    Le4/e;
        //  459    462    542    521    Any
        //  462    518    564    542    Any
        //  521    532    564    542    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0462:
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
    
    public final void o(final byte b, final byte[] array) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0079: {
            Label_0076: {
                try {
                    if (this.a != e4.c.d.q) {
                        this.c.d(new e("error while sending data: not connected"));
                        break Label_0076;
                    }
                }
                finally {
                    break Label_0079;
                }
                try {
                    final byte[] array2;
                    this.g.g(b, true, array2);
                }
                catch (IOException ex) {
                    this.c.d(new e("Failed to send frame", ex));
                    this.c();
                }
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void p(final String s) {
        synchronized (this) {
            this.o((byte)1, s.getBytes(e4.c.m));
        }
    }
    
    public final void q() {
        try {
            this.a = e4.c.d.r;
            this.g.i();
            this.g.g((byte)8, true, new byte[0]);
        }
        catch (IOException ex) {
            this.c.d(new e("Failed to send close frame", ex));
        }
    }
    
    public void r(final e4.d c) {
        this.c = c;
    }
    
    public enum d
    {
        o("NONE", 0), 
        p("CONNECTING", 1), 
        q("CONNECTED", 2), 
        r("DISCONNECTING", 3), 
        s("DISCONNECTED", 4);
        
        public d(final String name, final int ordinal) {
        }
    }
}
