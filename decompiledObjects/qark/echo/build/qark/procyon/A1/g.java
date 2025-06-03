// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Iterator;
import kotlin.jvm.internal.y;
import V5.s;
import V5.t;
import kotlin.jvm.internal.l;
import g6.p;
import V5.q;
import java.util.Map;
import org.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.Collection;
import org.json.JSONArray;
import W5.m;
import l6.c;
import kotlin.text.i;
import O1.P;
import java.util.ArrayList;
import x1.N;
import O1.C;
import kotlin.jvm.internal.Intrinsics;
import x1.F;
import W5.I;
import java.util.List;
import java.util.HashSet;

public final class g
{
    public static final g a;
    public static final HashSet b;
    public static final HashSet c;
    public static a d;
    public static List e;
    public static int f;
    
    static {
        a = new g();
        b = I.c(200, 202);
        c = I.c(503, 504, 429);
    }
    
    public static final /* synthetic */ HashSet b() {
        return g.b;
    }
    
    public static final void d(final String s, final String s2, final String s3) {
        Intrinsics.checkNotNullParameter(s, "datasetID");
        Intrinsics.checkNotNullParameter(s2, "url");
        Intrinsics.checkNotNullParameter(s3, "accessKey");
        C.e.c(N.s, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", s, s2, s3);
        final g a = g.a;
        a.i(new a(s, s2, s3));
        a.j(new ArrayList());
    }
    
    public static final void l(final F f) {
        Intrinsics.checkNotNullParameter(f, "request");
        final P a = P.a;
        P.B0(new f(f));
    }
    
    public static final void m(final F f) {
        Intrinsics.checkNotNullParameter(f, "$request");
        final String r = f.r();
        List v;
        if (r == null) {
            v = null;
        }
        else {
            v = i.V(r, new String[] { "/" }, false, 0, 6, null);
        }
        if (v != null) {
            if (v.size() == 2) {
                try {
                    final g a = g.a;
                    final String b = a.e().b();
                    final String c = a.e().c();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append("/capi/");
                    sb.append(c);
                    sb.append("/events");
                    final String string = sb.toString();
                    final List k = a.k(f);
                    if (k == null) {
                        return;
                    }
                    a.c(k);
                    final int min = Math.min(a.f().size(), 10);
                    final List d = m.D(a.f(), new c(0, min - 1));
                    a.f().subList(0, min).clear();
                    final JSONArray jsonArray = new JSONArray((Collection)d);
                    final LinkedHashMap<String, JSONArray> linkedHashMap = new LinkedHashMap<String, JSONArray>();
                    linkedHashMap.put("data", jsonArray);
                    linkedHashMap.put("accessKey", (JSONArray)a.e().a());
                    final JSONObject jsonObject = new JSONObject((Map)linkedHashMap);
                    final C.a e = C.e;
                    final N s = N.s;
                    final String string2 = jsonObject.toString(2);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonBodyStr.toString(2)");
                    e.c(s, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", string, f, string2);
                    a.h(string, "POST", jsonObject.toString(), W5.C.b(q.a("Content-Type", "application/json")), 60000, new p() {
                        public static final void d(final Integer n, final List list) {
                            Intrinsics.checkNotNullParameter(list, "$processedEvents");
                            if (!m.o(g.b(), n)) {
                                g.a.g(n, list, 5);
                            }
                        }
                        
                        public final void b(final String s, final Integer n) {
                            final P a = P.a;
                            P.B0(new A1.h(n, d));
                        }
                    });
                    return;
                }
                catch (s s2) {
                    C.e.c(N.t, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", s2);
                    return;
                }
            }
        }
        C.e.c(N.t, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", f);
    }
    
    public final void c(final List list) {
        if (list != null) {
            this.f().addAll(list);
        }
        final int max = Math.max(0, this.f().size() - 1000);
        if (max > 0) {
            this.j(y.a(m.p(this.f(), max)));
        }
    }
    
    public final a e() {
        final a d = g.d;
        if (d != null) {
            return d;
        }
        Intrinsics.n("credentials");
        throw null;
    }
    
    public final List f() {
        final List e = g.e;
        if (e != null) {
            return e;
        }
        Intrinsics.n("transformedEvents");
        throw null;
    }
    
    public final void g(final Integer n, final List list, final int n2) {
        Intrinsics.checkNotNullParameter(list, "processedEvents");
        if (m.o(g.c, n)) {
            if (g.f >= n2) {
                this.f().clear();
                g.f = 0;
                return;
            }
            this.f().addAll(0, list);
            ++g.f;
        }
    }
    
    public final void h(final String p0, final String p1, final String p2, final Map p3, final int p4, final p p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "urlStr"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2        
        //     8: ldc_w           "requestMethod"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: new             Ljava/net/URL;
        //    17: dup            
        //    18: aload_1        
        //    19: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    22: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    25: invokestatic    com/google/firebase/perf/network/FirebasePerfUrlConnection.instrument:(Ljava/lang/Object;)Ljava/lang/Object;
        //    28: checkcast       Ljava/net/URLConnection;
        //    31: astore_1       
        //    32: aload_1        
        //    33: ifnull          365
        //    36: aload_1        
        //    37: checkcast       Ljava/net/HttpURLConnection;
        //    40: astore_1       
        //    41: aload_1        
        //    42: aload_2        
        //    43: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    46: aload           4
        //    48: ifnonnull       54
        //    51: goto            117
        //    54: aload           4
        //    56: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    61: astore_2       
        //    62: aload_2        
        //    63: ifnonnull       69
        //    66: goto            117
        //    69: aload_2        
        //    70: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    75: astore_2       
        //    76: aload_2        
        //    77: invokeinterface java/util/Iterator.hasNext:()Z
        //    82: ifeq            117
        //    85: aload_2        
        //    86: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    91: checkcast       Ljava/lang/String;
        //    94: astore          8
        //    96: aload_1        
        //    97: aload           8
        //    99: aload           4
        //   101: aload           8
        //   103: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   108: checkcast       Ljava/lang/String;
        //   111: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   114: goto            76
        //   117: aload_1        
        //   118: invokevirtual   java/net/HttpURLConnection.getRequestMethod:()Ljava/lang/String;
        //   121: ldc             "POST"
        //   123: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   126: ifne            462
        //   129: aload_1        
        //   130: invokevirtual   java/net/HttpURLConnection.getRequestMethod:()Ljava/lang/String;
        //   133: ldc_w           "PUT"
        //   136: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   139: ifeq            456
        //   142: goto            462
        //   145: aload_1        
        //   146: iload           7
        //   148: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   151: aload_1        
        //   152: iload           5
        //   154: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   157: new             Ljava/io/BufferedOutputStream;
        //   160: dup            
        //   161: aload_1        
        //   162: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   165: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   168: astore_2       
        //   169: new             Ljava/io/BufferedWriter;
        //   172: dup            
        //   173: new             Ljava/io/OutputStreamWriter;
        //   176: dup            
        //   177: aload_2        
        //   178: ldc_w           "UTF-8"
        //   181: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //   184: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;)V
        //   187: astore          4
        //   189: aload           4
        //   191: aload_3        
        //   192: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   195: aload           4
        //   197: invokevirtual   java/io/BufferedWriter.flush:()V
        //   200: aload           4
        //   202: invokevirtual   java/io/BufferedWriter.close:()V
        //   205: aload_2        
        //   206: invokevirtual   java/io/OutputStream.close:()V
        //   209: new             Ljava/lang/StringBuilder;
        //   212: dup            
        //   213: invokespecial   java/lang/StringBuilder.<init>:()V
        //   216: astore_3       
        //   217: getstatic       A1/g.b:Ljava/util/HashSet;
        //   220: aload_1        
        //   221: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   224: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   227: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   230: ifeq            299
        //   233: new             Ljava/io/BufferedReader;
        //   236: dup            
        //   237: new             Ljava/io/InputStreamReader;
        //   240: dup            
        //   241: aload_1        
        //   242: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   245: ldc_w           "UTF-8"
        //   248: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/lang/String;)V
        //   251: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   254: astore_2       
        //   255: aload_2        
        //   256: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   259: astore          4
        //   261: aload           4
        //   263: ifnull          276
        //   266: aload_3        
        //   267: aload           4
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   272: pop            
        //   273: goto            255
        //   276: getstatic       V5/t.a:LV5/t;
        //   279: astore          4
        //   281: aload_2        
        //   282: aconst_null    
        //   283: invokestatic    e6/b.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   286: goto            299
        //   289: aload_3        
        //   290: athrow         
        //   291: astore_1       
        //   292: aload_2        
        //   293: aload_3        
        //   294: invokestatic    e6/b.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   297: aload_1        
        //   298: athrow         
        //   299: aload_3        
        //   300: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   303: astore_2       
        //   304: aload_2        
        //   305: ldc_w           "connResponseSB.toString()"
        //   308: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   311: getstatic       O1/C.e:LO1/C$a;
        //   314: getstatic       x1/N.s:Lx1/N;
        //   317: ldc             "CAPITransformerWebRequests"
        //   319: ldc_w           "\nResponse Received: \n%s\n%s"
        //   322: iconst_2       
        //   323: anewarray       Ljava/lang/Object;
        //   326: dup            
        //   327: iconst_0       
        //   328: aload_2        
        //   329: aastore        
        //   330: dup            
        //   331: iconst_1       
        //   332: aload_1        
        //   333: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   336: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   339: aastore        
        //   340: invokevirtual   O1/C$a.c:(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   343: aload           6
        //   345: ifnull          447
        //   348: aload           6
        //   350: aload_2        
        //   351: aload_1        
        //   352: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   355: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   358: invokeinterface g6/p.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   363: pop            
        //   364: return         
        //   365: new             Ljava/lang/NullPointerException;
        //   368: dup            
        //   369: ldc_w           "null cannot be cast to non-null type java.net.HttpURLConnection"
        //   372: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   375: athrow         
        //   376: getstatic       O1/C.e:LO1/C$a;
        //   379: getstatic       x1/N.t:Lx1/N;
        //   382: ldc             "CAPITransformerWebRequests"
        //   384: ldc_w           "Send to server failed: \n%s"
        //   387: iconst_1       
        //   388: anewarray       Ljava/lang/Object;
        //   391: dup            
        //   392: iconst_0       
        //   393: aload_1        
        //   394: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   397: aastore        
        //   398: invokevirtual   O1/C$a.c:(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   401: return         
        //   402: getstatic       O1/C.e:LO1/C$a;
        //   405: getstatic       x1/N.s:Lx1/N;
        //   408: ldc             "CAPITransformerWebRequests"
        //   410: ldc_w           "Connection failed, retrying: \n%s"
        //   413: iconst_1       
        //   414: anewarray       Ljava/lang/Object;
        //   417: dup            
        //   418: iconst_0       
        //   419: aload_1        
        //   420: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   423: aastore        
        //   424: invokevirtual   O1/C$a.c:(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   427: aload           6
        //   429: ifnull          447
        //   432: aload           6
        //   434: aconst_null    
        //   435: sipush          503
        //   438: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   441: invokeinterface g6/p.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   446: pop            
        //   447: return         
        //   448: astore_1       
        //   449: goto            376
        //   452: astore_1       
        //   453: goto            402
        //   456: iconst_0       
        //   457: istore          7
        //   459: goto            145
        //   462: iconst_1       
        //   463: istore          7
        //   465: goto            145
        //   468: astore_3       
        //   469: goto            289
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  14     32     452    447    Ljava/net/UnknownHostException;
        //  14     32     448    402    Ljava/io/IOException;
        //  36     46     452    447    Ljava/net/UnknownHostException;
        //  36     46     448    402    Ljava/io/IOException;
        //  54     62     452    447    Ljava/net/UnknownHostException;
        //  54     62     448    402    Ljava/io/IOException;
        //  69     76     452    447    Ljava/net/UnknownHostException;
        //  69     76     448    402    Ljava/io/IOException;
        //  76     114    452    447    Ljava/net/UnknownHostException;
        //  76     114    448    402    Ljava/io/IOException;
        //  117    142    452    447    Ljava/net/UnknownHostException;
        //  117    142    448    402    Ljava/io/IOException;
        //  145    255    452    447    Ljava/net/UnknownHostException;
        //  145    255    448    402    Ljava/io/IOException;
        //  255    261    468    299    Any
        //  266    273    468    299    Any
        //  276    281    468    299    Any
        //  281    286    452    447    Ljava/net/UnknownHostException;
        //  281    286    448    402    Ljava/io/IOException;
        //  289    291    291    299    Any
        //  292    299    452    447    Ljava/net/UnknownHostException;
        //  292    299    448    402    Ljava/io/IOException;
        //  299    343    452    447    Ljava/net/UnknownHostException;
        //  299    343    448    402    Ljava/io/IOException;
        //  348    364    452    447    Ljava/net/UnknownHostException;
        //  348    364    448    402    Ljava/io/IOException;
        //  365    376    452    447    Ljava/net/UnknownHostException;
        //  365    376    448    402    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0255:
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
    
    public final void i(final a d) {
        Intrinsics.checkNotNullParameter(d, "<set-?>");
        g.d = d;
    }
    
    public final void j(final List e) {
        Intrinsics.checkNotNullParameter(e, "<set-?>");
        g.e = e;
    }
    
    public final List k(final F f) {
        final JSONObject q = f.q();
        if (q == null) {
            return null;
        }
        final Map o = W5.C.o(P.n(q));
        final Object w = f.w();
        if (w != null) {
            o.put("custom_events", w);
            final StringBuilder sb = new StringBuilder();
            for (final String str : o.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(o.get(str));
                sb.append(System.getProperty("line.separator"));
            }
            C.e.c(N.s, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
            return A1.e.a.e(o);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        
        public a(final String a, final String b, final String c) {
            Intrinsics.checkNotNullParameter(a, "datasetID");
            Intrinsics.checkNotNullParameter(b, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(c, "accessKey");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final String a() {
            return this.c;
        }
        
        public final String b() {
            return this.b;
        }
        
        public final String c() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return Intrinsics.a(this.a, a.a) && Intrinsics.a(this.b, a.b) && Intrinsics.a(this.c, a.c);
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("CloudBridgeCredentials(datasetID=");
            sb.append(this.a);
            sb.append(", cloudBridgeURL=");
            sb.append(this.b);
            sb.append(", accessKey=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }
}
