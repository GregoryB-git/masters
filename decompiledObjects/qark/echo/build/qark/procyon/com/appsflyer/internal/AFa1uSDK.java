// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.net.HttpURLConnection;

@Deprecated
public final class AFa1uSDK
{
    private final AFe1jSDK valueOf;
    private final AFb1tSDK values;
    
    public AFa1uSDK() {
    }
    
    public AFa1uSDK(final AFe1jSDK valueOf, final AFb1tSDK values) {
        this.valueOf = valueOf;
        this.values = values;
    }
    
    public final HttpURLConnection AFInAppEventParameterName(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: aload_0        
        //     3: getfield        com/appsflyer/internal/AFa1uSDK.valueOf:Lcom/appsflyer/internal/AFe1jSDK;
        //     6: astore          8
        //     8: aload           8
        //    10: getfield        com/appsflyer/internal/AFa1qSDK.afRDLog:Ljava/lang/String;
        //    13: astore          13
        //    15: aload           8
        //    17: invokevirtual   com/appsflyer/internal/AFa1qSDK.valueOf:()Ljava/util/Map;
        //    20: invokestatic    com/appsflyer/internal/AFa1rSDK.AFInAppEventType:(Ljava/util/Map;)Lorg/json/JSONObject;
        //    23: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    26: astore          10
        //    28: aload_0        
        //    29: getfield        com/appsflyer/internal/AFa1uSDK.valueOf:Lcom/appsflyer/internal/AFe1jSDK;
        //    32: invokevirtual   com/appsflyer/internal/AFe1jSDK.getLevel:()Z
        //    35: istore          4
        //    37: aload_0        
        //    38: getfield        com/appsflyer/internal/AFa1uSDK.valueOf:Lcom/appsflyer/internal/AFe1jSDK;
        //    41: invokevirtual   com/appsflyer/internal/AFe1jSDK.afErrorLogForExcManagerOnly:()Z
        //    44: istore          5
        //    46: aload_0        
        //    47: getfield        com/appsflyer/internal/AFa1uSDK.valueOf:Lcom/appsflyer/internal/AFe1jSDK;
        //    50: invokevirtual   com/appsflyer/internal/AFe1jSDK.AFVersionDeclaration:()Z
        //    53: istore          6
        //    55: aload_0        
        //    56: getfield        com/appsflyer/internal/AFa1uSDK.valueOf:Lcom/appsflyer/internal/AFe1jSDK;
        //    59: invokevirtual   com/appsflyer/internal/AFa1qSDK.values:()Z
        //    62: istore          7
        //    64: ldc             ""
        //    66: astore          8
        //    68: aload           10
        //    70: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //    73: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //    76: astore          12
        //    78: aconst_null    
        //    79: astore          11
        //    81: iload           4
        //    83: ifeq            88
        //    86: aconst_null    
        //    87: areturn        
        //    88: new             Ljava/net/URL;
        //    91: dup            
        //    92: aload           13
        //    94: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    97: astore          14
        //    99: iload           6
        //   101: ifeq            216
        //   104: aload_0        
        //   105: getfield        com/appsflyer/internal/AFa1uSDK.values:Lcom/appsflyer/internal/AFb1tSDK;
        //   108: aload           14
        //   110: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   113: aload           10
        //   115: invokeinterface com/appsflyer/internal/AFb1tSDK.valueOf:(Ljava/lang/String;Ljava/lang/String;)V
        //   120: aload           10
        //   122: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //   125: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   128: arraylength    
        //   129: istore_3       
        //   130: new             Ljava/lang/StringBuilder;
        //   133: dup            
        //   134: ldc             "call = "
        //   136: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   139: astore          15
        //   141: aload           15
        //   143: aload           14
        //   145: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   148: pop            
        //   149: aload           15
        //   151: ldc             "; size = "
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: pop            
        //   157: aload           15
        //   159: iload_3        
        //   160: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   163: pop            
        //   164: aload           15
        //   166: ldc             " byte"
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: pop            
        //   172: iload_3        
        //   173: iconst_1       
        //   174: if_icmple       743
        //   177: ldc             "s"
        //   179: astore          9
        //   181: goto            184
        //   184: aload           15
        //   186: aload           9
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: pop            
        //   192: aload           15
        //   194: ldc             "; body = "
        //   196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   199: pop            
        //   200: aload           15
        //   202: aload           10
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: pop            
        //   208: aload           15
        //   210: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   213: invokestatic    com/appsflyer/internal/AFa1aSDK.values:(Ljava/lang/String;)V
        //   216: ldc             "AppsFlyer"
        //   218: invokevirtual   java/lang/Object.hashCode:()I
        //   221: invokestatic    android/net/TrafficStats.setThreadStatsTag:(I)V
        //   224: aload           14
        //   226: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //   229: invokestatic    com/google/firebase/perf/network/FirebasePerfUrlConnection.instrument:(Ljava/lang/Object;)Ljava/lang/Object;
        //   232: checkcast       Ljava/net/URLConnection;
        //   235: checkcast       Ljava/net/HttpURLConnection;
        //   238: astore          10
        //   240: aload           8
        //   242: astore          9
        //   244: aload           10
        //   246: sipush          30000
        //   249: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //   252: aload           8
        //   254: astore          9
        //   256: aload           10
        //   258: sipush          30000
        //   261: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   264: aload           8
        //   266: astore          9
        //   268: aload           10
        //   270: ldc             "POST"
        //   272: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   275: aload           8
        //   277: astore          9
        //   279: aload           10
        //   281: iconst_1       
        //   282: invokevirtual   java/net/URLConnection.setDoInput:(Z)V
        //   285: aload           8
        //   287: astore          9
        //   289: aload           10
        //   291: iconst_1       
        //   292: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   295: iload           7
        //   297: ifeq            762
        //   300: ldc             "application/octet-stream"
        //   302: astore          11
        //   304: goto            307
        //   307: aload           8
        //   309: astore          9
        //   311: aload           10
        //   313: ldc             "Content-Type"
        //   315: aload           11
        //   317: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   320: aload           8
        //   322: astore          9
        //   324: aload           10
        //   326: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   329: astore          15
        //   331: aload           12
        //   333: astore          11
        //   335: iload           7
        //   337: ifeq            524
        //   340: invokestatic    android/media/AudioTrack.getMaxVolume:()F
        //   343: fconst_0       
        //   344: fcmpl          
        //   345: ldc             53079
        //   347: iadd           
        //   348: i2c            
        //   349: iconst_0       
        //   350: iconst_0       
        //   351: invokestatic    android/graphics/drawable/Drawable.resolveOpacity:(II)I
        //   354: bipush          37
        //   356: iadd           
        //   357: bipush          37
        //   359: invokestatic    android/view/ViewConfiguration.getScrollBarFadeDuration:()I
        //   362: bipush          16
        //   364: ishr           
        //   365: isub           
        //   366: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //   369: checkcast       Ljava/lang/Class;
        //   372: ldc             "AFInAppEventParameterName"
        //   374: iconst_1       
        //   375: anewarray       Ljava/lang/Class;
        //   378: dup            
        //   379: iconst_0       
        //   380: ldc             Ljava/lang/String;.class
        //   382: aastore        
        //   383: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   386: aconst_null    
        //   387: iconst_1       
        //   388: anewarray       Ljava/lang/Object;
        //   391: dup            
        //   392: iconst_0       
        //   393: aload_1        
        //   394: aastore        
        //   395: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   398: astore_1       
        //   399: invokestatic    android/view/ViewConfiguration.getMaximumDrawingCacheSize:()I
        //   402: bipush          24
        //   404: ishr           
        //   405: ldc             53080
        //   407: iadd           
        //   408: i2c            
        //   409: bipush          37
        //   411: invokestatic    android/os/Process.myPid:()I
        //   414: bipush          22
        //   416: ishr           
        //   417: isub           
        //   418: invokestatic    android/view/KeyEvent.getModifierMetaStateMask:()I
        //   421: i2b            
        //   422: bipush          38
        //   424: iadd           
        //   425: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //   428: checkcast       Ljava/lang/Class;
        //   431: ldc             "AFInAppEventParameterName"
        //   433: iconst_1       
        //   434: anewarray       Ljava/lang/Class;
        //   437: dup            
        //   438: iconst_0       
        //   439: ldc             [B.class
        //   441: aastore        
        //   442: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   445: aload_1        
        //   446: iconst_1       
        //   447: anewarray       Ljava/lang/Object;
        //   450: dup            
        //   451: iconst_0       
        //   452: aload           12
        //   454: aastore        
        //   455: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   458: checkcast       [B
        //   461: astore          11
        //   463: goto            524
        //   466: astore_1       
        //   467: aload           8
        //   469: astore          9
        //   471: aload_1        
        //   472: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   475: astore          11
        //   477: aload           11
        //   479: ifnull          489
        //   482: aload           8
        //   484: astore          9
        //   486: aload           11
        //   488: athrow         
        //   489: aload           8
        //   491: astore          9
        //   493: aload_1        
        //   494: athrow         
        //   495: astore_1       
        //   496: aload           8
        //   498: astore          9
        //   500: aload_1        
        //   501: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   504: astore          11
        //   506: aload           11
        //   508: ifnull          518
        //   511: aload           8
        //   513: astore          9
        //   515: aload           11
        //   517: athrow         
        //   518: aload           8
        //   520: astore          9
        //   522: aload_1        
        //   523: athrow         
        //   524: aload           8
        //   526: astore          9
        //   528: aload           15
        //   530: aload           11
        //   532: invokevirtual   java/io/OutputStream.write:([B)V
        //   535: goto            548
        //   538: aload           8
        //   540: astore          9
        //   542: ldc             "AFCrypto: reflection init failed"
        //   544: aload_1        
        //   545: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   548: aload           8
        //   550: astore          9
        //   552: aload           15
        //   554: invokevirtual   java/io/OutputStream.close:()V
        //   557: aload           8
        //   559: astore          9
        //   561: aload           10
        //   563: invokevirtual   java/net/URLConnection.connect:()V
        //   566: aload           8
        //   568: astore          9
        //   570: aload           10
        //   572: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   575: istore_3       
        //   576: aload           8
        //   578: astore_1       
        //   579: iload           5
        //   581: ifeq            594
        //   584: aload           8
        //   586: astore          9
        //   588: aload           10
        //   590: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/net/HttpURLConnection;)Ljava/lang/String;
        //   593: astore_1       
        //   594: iload           6
        //   596: ifeq            618
        //   599: aload_1        
        //   600: astore          9
        //   602: aload_0        
        //   603: getfield        com/appsflyer/internal/AFa1uSDK.values:Lcom/appsflyer/internal/AFb1tSDK;
        //   606: aload           14
        //   608: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   611: iload_3        
        //   612: aload_1        
        //   613: invokeinterface com/appsflyer/internal/AFb1tSDK.AFInAppEventParameterName:(Ljava/lang/String;ILjava/lang/String;)V
        //   618: iload_3        
        //   619: sipush          200
        //   622: if_icmpne       637
        //   625: aload_1        
        //   626: astore          9
        //   628: ldc_w           "Status 200 ok"
        //   631: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   634: goto            671
        //   637: iconst_1       
        //   638: istore_2       
        //   639: goto            671
        //   642: astore_1       
        //   643: aload           11
        //   645: astore          9
        //   647: ldc_w           "Error while calling "
        //   650: aload           13
        //   652: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   655: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   658: aload_1        
        //   659: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   662: iconst_1       
        //   663: istore_2       
        //   664: aload           8
        //   666: astore_1       
        //   667: aload           9
        //   669: astore          10
        //   671: new             Ljava/lang/StringBuilder;
        //   674: dup            
        //   675: ldc_w           "Connection "
        //   678: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   681: astore          9
        //   683: iload_2        
        //   684: ifeq            695
        //   687: ldc_w           "error"
        //   690: astore          8
        //   692: goto            700
        //   695: ldc_w           "call succeeded"
        //   698: astore          8
        //   700: aload           9
        //   702: aload           8
        //   704: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   707: pop            
        //   708: aload           9
        //   710: ldc_w           ": "
        //   713: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   716: pop            
        //   717: aload           9
        //   719: aload_1        
        //   720: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   723: pop            
        //   724: aload           9
        //   726: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   729: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   732: aload           10
        //   734: areturn        
        //   735: astore_1       
        //   736: aload           11
        //   738: astore          9
        //   740: goto            647
        //   743: ldc             ""
        //   745: astore          9
        //   747: goto            184
        //   750: astore_1       
        //   751: aload           9
        //   753: astore          8
        //   755: aload           10
        //   757: astore          9
        //   759: goto            647
        //   762: ldc_w           "application/json"
        //   765: astore          11
        //   767: goto            307
        //   770: astore_1       
        //   771: goto            538
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  88     99     642    647    Any
        //  104    172    735    743    Any
        //  184    216    735    743    Any
        //  216    240    642    647    Any
        //  244    252    750    762    Any
        //  256    264    750    762    Any
        //  268    275    750    762    Any
        //  279    285    750    762    Any
        //  289    295    750    762    Any
        //  311    320    750    762    Any
        //  324    331    750    762    Any
        //  340    399    495    524    Any
        //  399    463    466    495    Any
        //  471    477    770    548    Ljava/lang/Exception;
        //  471    477    750    762    Any
        //  486    489    770    548    Ljava/lang/Exception;
        //  486    489    750    762    Any
        //  493    495    770    548    Ljava/lang/Exception;
        //  493    495    750    762    Any
        //  500    506    770    548    Ljava/lang/Exception;
        //  500    506    750    762    Any
        //  515    518    770    548    Ljava/lang/Exception;
        //  515    518    750    762    Any
        //  522    524    770    548    Ljava/lang/Exception;
        //  522    524    750    762    Any
        //  528    535    770    548    Ljava/lang/Exception;
        //  528    535    750    762    Any
        //  542    548    750    762    Any
        //  552    557    750    762    Any
        //  561    566    750    762    Any
        //  570    576    750    762    Any
        //  588    594    750    762    Any
        //  602    618    750    762    Any
        //  628    634    750    762    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 375 out of bounds for length 375
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
    
    public interface AFa1zSDK
    {
        void AFKeystoreWrapper(final String p0);
        
        void valueOf(final String p0, final String p1, final String p2);
    }
}
