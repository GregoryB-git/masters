// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;
import java.util.Map;
import java.net.URL;

public final class k2 implements Runnable
{
    public final URL o;
    public final byte[] p;
    public final e2 q;
    public final String r;
    public final Map s;
    public final /* synthetic */ f2 t;
    
    public k2(final f2 t, final String r, final URL o, final byte[] p6, final Map s, final e2 q) {
        this.t = t;
        n.e(r);
        n.i(o);
        n.i(q);
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        R2/k2.t:LR2/f2;
        //     4: invokevirtual   R2/m3.l:()V
        //     7: aconst_null    
        //     8: astore          6
        //    10: aconst_null    
        //    11: astore          4
        //    13: aload_0        
        //    14: getfield        R2/k2.o:Ljava/net/URL;
        //    17: astore_2       
        //    18: invokestatic    com/google/android/gms/internal/measurement/h0.a:()Lcom/google/android/gms/internal/measurement/h0;
        //    21: aload_2        
        //    22: ldc             "client-measurement"
        //    24: invokevirtual   com/google/android/gms/internal/measurement/h0.b:(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;
        //    27: astore_2       
        //    28: aload_2        
        //    29: instanceof      Ljava/net/HttpURLConnection;
        //    32: ifeq            392
        //    35: aload_2        
        //    36: checkcast       Ljava/net/HttpURLConnection;
        //    39: astore_2       
        //    40: aload_2        
        //    41: iconst_0       
        //    42: invokevirtual   java/net/URLConnection.setDefaultUseCaches:(Z)V
        //    45: aload_2        
        //    46: ldc             60000
        //    48: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //    51: aload_2        
        //    52: ldc             61000
        //    54: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //    57: aload_2        
        //    58: iconst_0       
        //    59: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //    62: aload_2        
        //    63: iconst_1       
        //    64: invokevirtual   java/net/URLConnection.setDoInput:(Z)V
        //    67: aload_0        
        //    68: getfield        R2/k2.s:Ljava/util/Map;
        //    71: astore_3       
        //    72: aload_3        
        //    73: ifnull          135
        //    76: aload_3        
        //    77: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    82: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    87: astore_3       
        //    88: aload_3        
        //    89: invokeinterface java/util/Iterator.hasNext:()Z
        //    94: ifeq            135
        //    97: aload_3        
        //    98: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   103: checkcast       Ljava/util/Map$Entry;
        //   106: astore          5
        //   108: aload_2        
        //   109: aload           5
        //   111: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   116: checkcast       Ljava/lang/String;
        //   119: aload           5
        //   121: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   126: checkcast       Ljava/lang/String;
        //   129: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   132: goto            88
        //   135: aload_0        
        //   136: getfield        R2/k2.p:[B
        //   139: ifnull          259
        //   142: aload_0        
        //   143: getfield        R2/k2.t:LR2/f2;
        //   146: invokevirtual   R2/z5.o:()LR2/N5;
        //   149: aload_0        
        //   150: getfield        R2/k2.p:[B
        //   153: invokevirtual   R2/N5.g0:([B)[B
        //   156: astore          5
        //   158: aload_0        
        //   159: getfield        R2/k2.t:LR2/f2;
        //   162: invokevirtual   R2/m3.j:()LR2/Y1;
        //   165: invokevirtual   R2/Y1.K:()LR2/a2;
        //   168: ldc             "Uploading data. size"
        //   170: aload           5
        //   172: arraylength    
        //   173: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   176: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   179: aload_2        
        //   180: iconst_1       
        //   181: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   184: aload_2        
        //   185: ldc             "Content-Encoding"
        //   187: ldc             "gzip"
        //   189: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   192: aload_2        
        //   193: aload           5
        //   195: arraylength    
        //   196: invokevirtual   java/net/HttpURLConnection.setFixedLengthStreamingMode:(I)V
        //   199: aload_2        
        //   200: invokevirtual   java/net/URLConnection.connect:()V
        //   203: aload_2        
        //   204: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   207: astore_3       
        //   208: aload_3        
        //   209: aload           5
        //   211: invokevirtual   java/io/OutputStream.write:([B)V
        //   214: aload_3        
        //   215: invokevirtual   java/io/OutputStream.close:()V
        //   218: goto            259
        //   221: astore          5
        //   223: aconst_null    
        //   224: astore          6
        //   226: iconst_0       
        //   227: istore_1       
        //   228: aload_3        
        //   229: astore          4
        //   231: aload           5
        //   233: astore_3       
        //   234: aload_2        
        //   235: astore          5
        //   237: aload           6
        //   239: astore_2       
        //   240: goto            402
        //   243: astore          5
        //   245: aconst_null    
        //   246: astore          6
        //   248: iconst_0       
        //   249: istore_1       
        //   250: aload_2        
        //   251: astore          4
        //   253: aload           6
        //   255: astore_2       
        //   256: goto            483
        //   259: aload_2        
        //   260: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   263: istore_1       
        //   264: aload_2        
        //   265: invokevirtual   java/net/URLConnection.getHeaderFields:()Ljava/util/Map;
        //   268: astore_3       
        //   269: aload_0        
        //   270: getfield        R2/k2.t:LR2/f2;
        //   273: aload_2        
        //   274: invokestatic    R2/f2.y:(LR2/f2;Ljava/net/HttpURLConnection;)[B
        //   277: astore          5
        //   279: aload_2        
        //   280: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   283: aload_0        
        //   284: getfield        R2/k2.t:LR2/f2;
        //   287: invokevirtual   R2/m3.e:()LR2/G2;
        //   290: astore_2       
        //   291: new             LR2/i2;
        //   294: dup            
        //   295: aload_0        
        //   296: getfield        R2/k2.r:Ljava/lang/String;
        //   299: aload_0        
        //   300: getfield        R2/k2.q:LR2/e2;
        //   303: iload_1        
        //   304: aconst_null    
        //   305: aload           5
        //   307: aload_3        
        //   308: aconst_null    
        //   309: invokespecial   R2/i2.<init>:(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
        //   312: astore_3       
        //   313: aload_2        
        //   314: aload_3        
        //   315: invokevirtual   R2/G2.D:(Ljava/lang/Runnable;)V
        //   318: return         
        //   319: astore          5
        //   321: aload_3        
        //   322: astore          6
        //   324: aload           5
        //   326: astore_3       
        //   327: aload_2        
        //   328: astore          5
        //   330: aload           6
        //   332: astore_2       
        //   333: goto            402
        //   336: astore          7
        //   338: aload_3        
        //   339: astore          5
        //   341: aload_2        
        //   342: astore          4
        //   344: aload           7
        //   346: astore_3       
        //   347: aload           5
        //   349: astore_2       
        //   350: goto            590
        //   353: astore_3       
        //   354: aconst_null    
        //   355: astore          6
        //   357: aload_2        
        //   358: astore          5
        //   360: aload           6
        //   362: astore_2       
        //   363: goto            402
        //   366: astore_3       
        //   367: aconst_null    
        //   368: astore          5
        //   370: aload_2        
        //   371: astore          4
        //   373: aload           5
        //   375: astore_2       
        //   376: goto            590
        //   379: astore_3       
        //   380: aconst_null    
        //   381: astore_2       
        //   382: goto            568
        //   385: astore_3       
        //   386: aconst_null    
        //   387: astore          4
        //   389: goto            586
        //   392: new             Ljava/io/IOException;
        //   395: dup            
        //   396: ldc             "Failed to obtain HTTP connection"
        //   398: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   401: athrow         
        //   402: aload           4
        //   404: ifnull          441
        //   407: aload           4
        //   409: invokevirtual   java/io/OutputStream.close:()V
        //   412: goto            441
        //   415: astore          4
        //   417: aload_0        
        //   418: getfield        R2/k2.t:LR2/f2;
        //   421: invokevirtual   R2/m3.j:()LR2/Y1;
        //   424: invokevirtual   R2/Y1.G:()LR2/a2;
        //   427: ldc             "Error closing HTTP compressed POST connection output stream. appId"
        //   429: aload_0        
        //   430: getfield        R2/k2.r:Ljava/lang/String;
        //   433: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   436: aload           4
        //   438: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   441: aload           5
        //   443: ifnull          451
        //   446: aload           5
        //   448: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   451: aload_0        
        //   452: getfield        R2/k2.t:LR2/f2;
        //   455: invokevirtual   R2/m3.e:()LR2/G2;
        //   458: new             LR2/i2;
        //   461: dup            
        //   462: aload_0        
        //   463: getfield        R2/k2.r:Ljava/lang/String;
        //   466: aload_0        
        //   467: getfield        R2/k2.q:LR2/e2;
        //   470: iload_1        
        //   471: aconst_null    
        //   472: aconst_null    
        //   473: aload_2        
        //   474: aconst_null    
        //   475: invokespecial   R2/i2.<init>:(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
        //   478: invokevirtual   R2/G2.D:(Ljava/lang/Runnable;)V
        //   481: aload_3        
        //   482: athrow         
        //   483: aload_3        
        //   484: ifnull          518
        //   487: aload_3        
        //   488: invokevirtual   java/io/OutputStream.close:()V
        //   491: goto            518
        //   494: astore_3       
        //   495: aload_0        
        //   496: getfield        R2/k2.t:LR2/f2;
        //   499: invokevirtual   R2/m3.j:()LR2/Y1;
        //   502: invokevirtual   R2/Y1.G:()LR2/a2;
        //   505: ldc             "Error closing HTTP compressed POST connection output stream. appId"
        //   507: aload_0        
        //   508: getfield        R2/k2.r:Ljava/lang/String;
        //   511: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   514: aload_3        
        //   515: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   518: aload           4
        //   520: ifnull          528
        //   523: aload           4
        //   525: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   528: aload_0        
        //   529: getfield        R2/k2.t:LR2/f2;
        //   532: invokevirtual   R2/m3.e:()LR2/G2;
        //   535: astore_3       
        //   536: new             LR2/i2;
        //   539: dup            
        //   540: aload_0        
        //   541: getfield        R2/k2.r:Ljava/lang/String;
        //   544: aload_0        
        //   545: getfield        R2/k2.q:LR2/e2;
        //   548: iload_1        
        //   549: aload           5
        //   551: aconst_null    
        //   552: aload_2        
        //   553: aconst_null    
        //   554: invokespecial   R2/i2.<init>:(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
        //   557: astore          4
        //   559: aload_3        
        //   560: astore_2       
        //   561: aload           4
        //   563: astore_3       
        //   564: goto            313
        //   567: astore_3       
        //   568: aconst_null    
        //   569: astore          6
        //   571: iconst_0       
        //   572: istore_1       
        //   573: aload_2        
        //   574: astore          5
        //   576: aload           6
        //   578: astore_2       
        //   579: goto            402
        //   582: astore_3       
        //   583: aload_2        
        //   584: astore          4
        //   586: aconst_null    
        //   587: astore_2       
        //   588: iconst_0       
        //   589: istore_1       
        //   590: aload_3        
        //   591: astore          5
        //   593: aload           6
        //   595: astore_3       
        //   596: goto            483
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  13     67     385    392    Ljava/io/IOException;
        //  13     67     379    385    Any
        //  67     72     582    586    Ljava/io/IOException;
        //  67     72     567    568    Any
        //  76     88     582    586    Ljava/io/IOException;
        //  76     88     567    568    Any
        //  88     132    582    586    Ljava/io/IOException;
        //  88     132    567    568    Any
        //  135    208    582    586    Ljava/io/IOException;
        //  135    208    567    568    Any
        //  208    218    243    259    Ljava/io/IOException;
        //  208    218    221    243    Any
        //  259    264    582    586    Ljava/io/IOException;
        //  259    264    567    568    Any
        //  264    269    366    379    Ljava/io/IOException;
        //  264    269    353    366    Any
        //  269    279    336    353    Ljava/io/IOException;
        //  269    279    319    336    Any
        //  392    402    385    392    Ljava/io/IOException;
        //  392    402    379    385    Any
        //  407    412    415    441    Ljava/io/IOException;
        //  487    491    494    518    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
}
