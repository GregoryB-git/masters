// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d2;

import f2.h;
import java.util.Iterator;
import java.nio.charset.Charset;
import c2.b;
import e2.l;
import e2.k;
import e2.p;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import g2.g;
import g2.f;
import java.util.Locale;
import android.os.Build;
import android.os.Build$VERSION;
import f2.i;
import java.net.MalformedURLException;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.util.TimeZone;
import java.util.Calendar;
import android.telephony.TelephonyManager;
import android.content.pm.PackageManager$NameNotFoundException;
import e2.o;
import android.net.NetworkInfo;
import e2.j;
import java.net.URL;
import android.content.Context;
import android.net.ConnectivityManager;
import j4.a;
import g2.m;

public final class d implements m
{
    public final j4.a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final p2.a e;
    public final p2.a f;
    public final int g;
    
    public d(final Context context, final p2.a a, final p2.a a2) {
        this(context, a, a2, 130000);
    }
    
    public d(final Context c, final p2.a f, final p2.a e, final int g) {
        this.a = j.b();
        this.c = c;
        this.b = (ConnectivityManager)c.getSystemService("connectivity");
        this.d = n(d2.a.c);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static int f(final NetworkInfo networkInfo) {
        o.b b;
        if (networkInfo == null) {
            b = o.b.p;
        }
        else {
            final int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                b = o.b.J;
            }
            else {
                if (o.b.c(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
        }
        return b.e();
    }
    
    public static int g(final NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.H.e();
        }
        return networkInfo.getType();
    }
    
    public static int h(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            j2.a.d("CctTransportBackend", "Unable to find version code for package", (Throwable)ex);
            return -1;
        }
    }
    
    public static TelephonyManager j(final Context context) {
        return (TelephonyManager)context.getSystemService("phone");
    }
    
    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }
    
    public static InputStream m(final InputStream in, final String anObject) {
        if ("gzip".equals(anObject)) {
            return new GZIPInputStream(in);
        }
        return in;
    }
    
    public static URL n(final String s) {
        try {
            return new URL(s);
        }
        catch (MalformedURLException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid url: ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString(), cause);
        }
    }
    
    @Override
    public i a(final i i) {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return i.l().a("sdk-version", Build$VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }
    
    @Override
    public g b(final f p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokevirtual   d2/d.i:(Lg2/f;)Le2/j;
        //     5: astore          7
        //     7: aload_0        
        //     8: getfield        d2/d.d:Ljava/net/URL;
        //    11: astore          5
        //    13: aload_1        
        //    14: invokevirtual   g2/f.c:()[B
        //    17: astore          8
        //    19: aconst_null    
        //    20: astore          4
        //    22: aconst_null    
        //    23: astore          6
        //    25: aload           5
        //    27: astore_3       
        //    28: aload           8
        //    30: ifnull          92
        //    33: aload_1        
        //    34: invokevirtual   g2/f.c:()[B
        //    37: invokestatic    d2/a.c:([B)Ld2/a;
        //    40: astore          8
        //    42: aload           6
        //    44: astore_1       
        //    45: aload           8
        //    47: invokevirtual   d2/a.e:()Ljava/lang/String;
        //    50: ifnull          59
        //    53: aload           8
        //    55: invokevirtual   d2/a.e:()Ljava/lang/String;
        //    58: astore_1       
        //    59: aload           5
        //    61: astore_3       
        //    62: aload_1        
        //    63: astore          4
        //    65: aload           8
        //    67: invokevirtual   d2/a.f:()Ljava/lang/String;
        //    70: ifnull          92
        //    73: aload           8
        //    75: invokevirtual   d2/a.f:()Ljava/lang/String;
        //    78: invokestatic    d2/d.n:(Ljava/lang/String;)Ljava/net/URL;
        //    81: astore_3       
        //    82: aload_1        
        //    83: astore          4
        //    85: goto            92
        //    88: invokestatic    g2/g.a:()Lg2/g;
        //    91: areturn        
        //    92: iconst_5       
        //    93: new             Ld2/d$a;
        //    96: dup            
        //    97: aload_3        
        //    98: aload           7
        //   100: aload           4
        //   102: invokespecial   d2/d$a.<init>:(Ljava/net/URL;Le2/j;Ljava/lang/String;)V
        //   105: new             Ld2/b;
        //   108: dup            
        //   109: aload_0        
        //   110: invokespecial   d2/b.<init>:(Ld2/d;)V
        //   113: new             Ld2/c;
        //   116: dup            
        //   117: invokespecial   d2/c.<init>:()V
        //   120: invokestatic    k2/b.a:(ILjava/lang/Object;Lk2/a;Lk2/c;)Ljava/lang/Object;
        //   123: checkcast       Ld2/d$b;
        //   126: astore_1       
        //   127: aload_1        
        //   128: getfield        d2/d$b.a:I
        //   131: istore_2       
        //   132: iload_2        
        //   133: sipush          200
        //   136: if_icmpne       189
        //   139: aload_1        
        //   140: getfield        d2/d$b.c:J
        //   143: invokestatic    g2/g.e:(J)Lg2/g;
        //   146: areturn        
        //   147: iload_2        
        //   148: sipush          400
        //   151: if_icmpne       158
        //   154: invokestatic    g2/g.d:()Lg2/g;
        //   157: areturn        
        //   158: invokestatic    g2/g.a:()Lg2/g;
        //   161: areturn        
        //   162: invokestatic    g2/g.f:()Lg2/g;
        //   165: astore_1       
        //   166: aload_1        
        //   167: areturn        
        //   168: ldc             "CctTransportBackend"
        //   170: ldc_w           "Could not make request to the backend"
        //   173: aload_1        
        //   174: invokestatic    j2/a.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   177: invokestatic    g2/g.f:()Lg2/g;
        //   180: areturn        
        //   181: astore_1       
        //   182: goto            88
        //   185: astore_1       
        //   186: goto            168
        //   189: iload_2        
        //   190: sipush          500
        //   193: if_icmpge       162
        //   196: iload_2        
        //   197: sipush          404
        //   200: if_icmpne       147
        //   203: goto            162
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  33     42     181    92     Ljava/lang/IllegalArgumentException;
        //  45     59     181    92     Ljava/lang/IllegalArgumentException;
        //  65     82     181    92     Ljava/lang/IllegalArgumentException;
        //  92     132    185    181    Ljava/io/IOException;
        //  139    147    185    181    Ljava/io/IOException;
        //  154    158    185    181    Ljava/io/IOException;
        //  158    162    185    181    Ljava/io/IOException;
        //  162    166    185    181    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    public final b e(final a p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc_w           "Making request to: %s"
        //     5: aload_1        
        //     6: getfield        d2/d$a.a:Ljava/net/URL;
        //     9: invokestatic    j2/a.f:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //    12: aload_1        
        //    13: getfield        d2/d$a.a:Ljava/net/URL;
        //    16: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    19: checkcast       Ljava/net/HttpURLConnection;
        //    22: astore          4
        //    24: aload           4
        //    26: sipush          30000
        //    29: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //    32: aload           4
        //    34: aload_0        
        //    35: getfield        d2/d.g:I
        //    38: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //    41: aload           4
        //    43: iconst_1       
        //    44: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //    47: aload           4
        //    49: iconst_0       
        //    50: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //    53: aload           4
        //    55: ldc_w           "POST"
        //    58: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    61: aload           4
        //    63: ldc_w           "User-Agent"
        //    66: ldc_w           "datatransport/%s android/"
        //    69: iconst_1       
        //    70: anewarray       Ljava/lang/Object;
        //    73: dup            
        //    74: iconst_0       
        //    75: ldc_w           "3.1.9"
        //    78: aastore        
        //    79: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    82: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    85: aload           4
        //    87: ldc_w           "Content-Encoding"
        //    90: ldc             "gzip"
        //    92: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    95: aload           4
        //    97: ldc_w           "Content-Type"
        //   100: ldc_w           "application/json"
        //   103: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   106: aload           4
        //   108: ldc_w           "Accept-Encoding"
        //   111: ldc             "gzip"
        //   113: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   116: aload_1        
        //   117: getfield        d2/d$a.c:Ljava/lang/String;
        //   120: astore_3       
        //   121: aload_3        
        //   122: ifnull          134
        //   125: aload           4
        //   127: ldc_w           "X-Goog-Api-Key"
        //   130: aload_3        
        //   131: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   134: aload           4
        //   136: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   139: astore_3       
        //   140: new             Ljava/util/zip/GZIPOutputStream;
        //   143: dup            
        //   144: aload_3        
        //   145: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   148: astore          5
        //   150: aload_0        
        //   151: getfield        d2/d.a:Lj4/a;
        //   154: aload_1        
        //   155: getfield        d2/d$a.b:Le2/j;
        //   158: new             Ljava/io/BufferedWriter;
        //   161: dup            
        //   162: new             Ljava/io/OutputStreamWriter;
        //   165: dup            
        //   166: aload           5
        //   168: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;)V
        //   171: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;)V
        //   174: invokeinterface j4/a.b:(Ljava/lang/Object;Ljava/io/Writer;)V
        //   179: aload           5
        //   181: invokevirtual   java/io/OutputStream.close:()V
        //   184: aload_3        
        //   185: ifnull          211
        //   188: aload_3        
        //   189: invokevirtual   java/io/OutputStream.close:()V
        //   192: goto            211
        //   195: astore_1       
        //   196: goto            489
        //   199: astore_1       
        //   200: goto            489
        //   203: astore_1       
        //   204: goto            511
        //   207: astore_1       
        //   208: goto            511
        //   211: aload           4
        //   213: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   216: istore_2       
        //   217: ldc             "CctTransportBackend"
        //   219: ldc_w           "Status Code: %d"
        //   222: iload_2        
        //   223: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   226: invokestatic    j2/a.f:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   229: ldc             "CctTransportBackend"
        //   231: ldc_w           "Content-Type: %s"
        //   234: aload           4
        //   236: ldc_w           "Content-Type"
        //   239: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   242: invokestatic    j2/a.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   245: ldc             "CctTransportBackend"
        //   247: ldc_w           "Content-Encoding: %s"
        //   250: aload           4
        //   252: ldc_w           "Content-Encoding"
        //   255: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   258: invokestatic    j2/a.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   261: iload_2        
        //   262: sipush          302
        //   265: if_icmpeq       422
        //   268: iload_2        
        //   269: sipush          301
        //   272: if_icmpeq       422
        //   275: iload_2        
        //   276: sipush          307
        //   279: if_icmpne       285
        //   282: goto            422
        //   285: iload_2        
        //   286: sipush          200
        //   289: if_icmpeq       303
        //   292: new             Ld2/d$b;
        //   295: dup            
        //   296: iload_2        
        //   297: aconst_null    
        //   298: lconst_0       
        //   299: invokespecial   d2/d$b.<init>:(ILjava/net/URL;J)V
        //   302: areturn        
        //   303: aload           4
        //   305: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   308: astore_1       
        //   309: aload_1        
        //   310: aload           4
        //   312: ldc_w           "Content-Encoding"
        //   315: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   318: invokestatic    d2/d.m:(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
        //   321: astore_3       
        //   322: new             Ld2/d$b;
        //   325: dup            
        //   326: iload_2        
        //   327: aconst_null    
        //   328: new             Ljava/io/BufferedReader;
        //   331: dup            
        //   332: new             Ljava/io/InputStreamReader;
        //   335: dup            
        //   336: aload_3        
        //   337: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   340: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   343: invokestatic    e2/n.b:(Ljava/io/Reader;)Le2/n;
        //   346: invokevirtual   e2/n.c:()J
        //   349: invokespecial   d2/d$b.<init>:(ILjava/net/URL;J)V
        //   352: astore          4
        //   354: aload_3        
        //   355: ifnull          369
        //   358: aload_3        
        //   359: invokevirtual   java/io/InputStream.close:()V
        //   362: goto            369
        //   365: astore_3       
        //   366: goto            403
        //   369: aload_1        
        //   370: ifnull          377
        //   373: aload_1        
        //   374: invokevirtual   java/io/InputStream.close:()V
        //   377: aload           4
        //   379: areturn        
        //   380: astore          4
        //   382: aload_3        
        //   383: ifnull          400
        //   386: aload_3        
        //   387: invokevirtual   java/io/InputStream.close:()V
        //   390: goto            400
        //   393: astore_3       
        //   394: aload           4
        //   396: aload_3        
        //   397: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   400: aload           4
        //   402: athrow         
        //   403: aload_1        
        //   404: ifnull          420
        //   407: aload_1        
        //   408: invokevirtual   java/io/InputStream.close:()V
        //   411: goto            420
        //   414: astore_1       
        //   415: aload_3        
        //   416: aload_1        
        //   417: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   420: aload_3        
        //   421: athrow         
        //   422: new             Ld2/d$b;
        //   425: dup            
        //   426: iload_2        
        //   427: new             Ljava/net/URL;
        //   430: dup            
        //   431: aload           4
        //   433: ldc_w           "Location"
        //   436: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   439: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   442: lconst_0       
        //   443: invokespecial   d2/d$b.<init>:(ILjava/net/URL;J)V
        //   446: areturn        
        //   447: astore_1       
        //   448: goto            470
        //   451: astore_1       
        //   452: aload           5
        //   454: invokevirtual   java/io/OutputStream.close:()V
        //   457: goto            468
        //   460: astore          4
        //   462: aload_1        
        //   463: aload           4
        //   465: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   468: aload_1        
        //   469: athrow         
        //   470: aload_3        
        //   471: ifnull          487
        //   474: aload_3        
        //   475: invokevirtual   java/io/OutputStream.close:()V
        //   478: goto            487
        //   481: astore_3       
        //   482: aload_1        
        //   483: aload_3        
        //   484: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   487: aload_1        
        //   488: athrow         
        //   489: ldc             "CctTransportBackend"
        //   491: ldc_w           "Couldn't encode request, returning with 400"
        //   494: aload_1        
        //   495: invokestatic    j2/a.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   498: new             Ld2/d$b;
        //   501: dup            
        //   502: sipush          400
        //   505: aconst_null    
        //   506: lconst_0       
        //   507: invokespecial   d2/d$b.<init>:(ILjava/net/URL;J)V
        //   510: areturn        
        //   511: ldc             "CctTransportBackend"
        //   513: ldc_w           "Couldn't open connection, returning with 500"
        //   516: aload_1        
        //   517: invokestatic    j2/a.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   520: new             Ld2/d$b;
        //   523: dup            
        //   524: sipush          500
        //   527: aconst_null    
        //   528: lconst_0       
        //   529: invokespecial   d2/d$b.<init>:(ILjava/net/URL;J)V
        //   532: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  134    140    207    211    Ljava/net/ConnectException;
        //  134    140    203    207    Ljava/net/UnknownHostException;
        //  134    140    199    203    Lj4/b;
        //  134    140    195    199    Ljava/io/IOException;
        //  140    150    447    489    Any
        //  150    179    451    470    Any
        //  179    184    447    489    Any
        //  188    192    207    211    Ljava/net/ConnectException;
        //  188    192    203    207    Ljava/net/UnknownHostException;
        //  188    192    199    203    Lj4/b;
        //  188    192    195    199    Ljava/io/IOException;
        //  309    322    365    422    Any
        //  322    354    380    403    Any
        //  358    362    365    422    Any
        //  386    390    393    400    Any
        //  394    400    365    422    Any
        //  400    403    365    422    Any
        //  407    411    414    420    Any
        //  452    457    460    468    Any
        //  462    468    447    489    Any
        //  468    470    447    489    Any
        //  474    478    481    487    Any
        //  482    487    207    211    Ljava/net/ConnectException;
        //  482    487    203    207    Ljava/net/UnknownHostException;
        //  482    487    199    203    Lj4/b;
        //  482    487    195    199    Ljava/io/IOException;
        //  487    489    207    211    Ljava/net/ConnectException;
        //  487    489    203    207    Ljava/net/UnknownHostException;
        //  487    489    199    203    Lj4/b;
        //  487    489    195    199    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 250 out of bounds for length 250
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    public final j i(f f) {
        final HashMap<e2.m.a, ArrayList<i>> hashMap = new HashMap<e2.m.a, ArrayList<i>>();
        f = (f)f.b().iterator();
        while (((Iterator)f).hasNext()) {
            final i i = ((Iterator<i>)f).next();
            final Object key = i.j();
            if (!hashMap.containsKey(key)) {
                final ArrayList<i> value = new ArrayList<i>();
                value.add(i);
                hashMap.put((e2.m.a)key, value);
            }
            else {
                hashMap.get(key).add(i);
            }
        }
        final ArrayList<e2.m> list = new ArrayList<e2.m>();
        final Iterator<Map.Entry<e2.m.a, ArrayList<i>>> iterator = hashMap.entrySet().iterator();
        Object key;
        i j;
        ArrayList<l> list2;
        c2.b b;
        Label_0385_Outer:Label_0370_Outer:Label_0639_Outer:
        while (true) {
            while (true) {
                if (iterator.hasNext()) {
                    f = (f)iterator.next();
                    j = ((Map.Entry<K, List<i>>)f).getValue().get(0);
                    key = e2.m.a().f(p.p).g(this.f.a()).h(this.e.a()).b(k.a().c(k.b.q).b(e2.a.a().m(j.g("sdk-version")).j(j.b("model")).f(j.b("hardware")).d(j.b("device")).l(j.b("product")).k(j.b("os-uild")).h(j.b("manufacturer")).e(j.b("fingerprint")).c(j.b("country")).g(j.b("locale")).i(j.b("mcc_mnc")).b(j.b("application_build")).a()).a());
                    while (true) {
                        try {
                            ((e2.m.a)key).i(Integer.parseInt(((Map.Entry<String, V>)f).getKey()));
                            while (true) {
                                list2 = new ArrayList<l>();
                                for (final i k : ((Map.Entry<K, List<i>>)f).getValue()) {
                                    f = (f)k.e();
                                    b = ((h)f).b();
                                    if (b.equals(c2.b.b("proto"))) {
                                        f = (f)l.j(((h)f).a());
                                    }
                                    else {
                                        if (!b.equals(c2.b.b("json"))) {
                                            j2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b);
                                            continue Label_0385_Outer;
                                        }
                                        f = (f)l.i(new String(((h)f).a(), Charset.forName("UTF-8")));
                                    }
                                    ((l.a)f).c(k.f()).d(k.k()).h(k.h("tz-offset")).e(o.a().c(o.c.c(k.g("net-type"))).b(o.b.c(k.g("mobile-subtype"))).a());
                                    if (k.d() != null) {
                                        ((l.a)f).b(k.d());
                                    }
                                    list2.add(((l.a)f).a());
                                }
                                ((e2.m.a)key).c(list2);
                                list.add(((e2.m.a)key).a());
                                continue Label_0385_Outer;
                                ((e2.m.a)key).j(((Map.Entry<String, V>)f).getKey());
                                continue Label_0370_Outer;
                            }
                            return e2.j.a(list);
                        }
                        catch (NumberFormatException ex) {}
                        continue Label_0639_Outer;
                    }
                }
                continue;
            }
        }
    }
    
    public static final class a
    {
        public final URL a;
        public final j b;
        public final String c;
        
        public a(final URL a, final j b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public a a(final URL url) {
            return new a(url, this.b, this.c);
        }
    }
    
    public static final class b
    {
        public final int a;
        public final URL b;
        public final long c;
        
        public b(final int a, final URL b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
