// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.net.HttpURLConnection;

public final class AFc1lSDK
{
    private final int AFInAppEventType;
    
    public AFc1lSDK(final int afInAppEventType) {
        this.AFInAppEventType = afInAppEventType;
    }
    
    @NonNull
    private static String AFKeystoreWrapper(final HttpURLConnection p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: iload_1        
        //     3: ifeq            14
        //     6: aload_0        
        //     7: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //    10: astore_0       
        //    11: goto            146
        //    14: aload_0        
        //    15: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //    18: astore_0       
        //    19: goto            146
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: astore          5
        //    31: new             Ljava/io/InputStreamReader;
        //    34: dup            
        //    35: aload_0        
        //    36: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //    39: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    42: astore_0       
        //    43: new             Ljava/io/BufferedReader;
        //    46: dup            
        //    47: aload_0        
        //    48: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    51: astore          4
        //    53: iconst_1       
        //    54: istore_2       
        //    55: aload           4
        //    57: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    60: astore_3       
        //    61: aload_3        
        //    62: ifnull          92
        //    65: iload_2        
        //    66: ifne            80
        //    69: aload           5
        //    71: bipush          10
        //    73: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    76: pop            
        //    77: goto            80
        //    80: aload           5
        //    82: aload_3        
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: pop            
        //    87: iconst_0       
        //    88: istore_2       
        //    89: goto            55
        //    92: aload           5
        //    94: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    97: astore_3       
        //    98: aload_0        
        //    99: invokevirtual   java/io/Reader.close:()V
        //   102: aload           4
        //   104: invokevirtual   java/io/Reader.close:()V
        //   107: aload_3        
        //   108: areturn        
        //   109: astore_3       
        //   110: aconst_null    
        //   111: astore          4
        //   113: aload_0        
        //   114: ifnull          121
        //   117: aload_0        
        //   118: invokevirtual   java/io/Reader.close:()V
        //   121: aload           4
        //   123: ifnull          131
        //   126: aload           4
        //   128: invokevirtual   java/io/Reader.close:()V
        //   131: aload_3        
        //   132: athrow         
        //   133: astore          5
        //   135: aconst_null    
        //   136: astore          4
        //   138: aload_3        
        //   139: astore_0       
        //   140: aload           5
        //   142: astore_3       
        //   143: goto            113
        //   146: aload_0        
        //   147: ifnonnull       22
        //   150: ldc             ""
        //   152: areturn        
        //   153: astore_3       
        //   154: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      11     133    146    Any
        //  14     19     133    146    Any
        //  22     43     133    146    Any
        //  43     53     109    113    Any
        //  55     61     153    157    Any
        //  69     77     153    157    Any
        //  80     87     153    157    Any
        //  92     98     153    157    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    
    public final AFc1gSDK<String> AFInAppEventParameterName(final AFa1aSDK p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lstore          4
        //     5: aload_1        
        //     6: invokevirtual   com/appsflyer/internal/AFa1aSDK.valueOf:()[B
        //     9: astore          10
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: astore          7
        //    20: aload           7
        //    22: aload_1        
        //    23: getfield        com/appsflyer/internal/AFa1aSDK.AFInAppEventParameterName:Ljava/lang/String;
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: pop            
        //    30: aload           7
        //    32: ldc             ":"
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: pop            
        //    38: aload           7
        //    40: aload_1        
        //    41: getfield        com/appsflyer/internal/AFa1aSDK.valueOf:Ljava/lang/String;
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: pop            
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: aload           7
        //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    57: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    60: astore          8
        //    62: aload_1        
        //    63: invokevirtual   com/appsflyer/internal/AFa1aSDK.valueOf:()[B
        //    66: astore          7
        //    68: aload_1        
        //    69: invokevirtual   com/appsflyer/internal/AFa1aSDK.values:()Z
        //    72: istore          6
        //    74: iload           6
        //    76: ifeq            128
        //    79: aload           7
        //    81: ifnull          128
        //    84: aload_1        
        //    85: invokevirtual   com/appsflyer/internal/AFa1aSDK.AFKeystoreWrapper:()Z
        //    88: ifeq            98
        //    91: ldc             "<encrypted>"
        //    93: astore          7
        //    95: goto            112
        //    98: new             Ljava/lang/String;
        //   101: dup            
        //   102: aload           7
        //   104: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //   107: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //   110: astore          7
        //   112: aload           8
        //   114: ldc             "\n payload: "
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: aload           8
        //   122: aload           7
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: pop            
        //   128: aload_1        
        //   129: getfield        com/appsflyer/internal/AFa1aSDK.AFKeystoreWrapper:Ljava/util/Map;
        //   132: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   137: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   142: astore          7
        //   144: aload           7
        //   146: invokeinterface java/util/Iterator.hasNext:()Z
        //   151: istore          6
        //   153: iload           6
        //   155: ifeq            221
        //   158: aload           7
        //   160: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   165: checkcast       Ljava/util/Map$Entry;
        //   168: astore          9
        //   170: aload           8
        //   172: ldc             "\n "
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: pop            
        //   178: aload           8
        //   180: aload           9
        //   182: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   187: checkcast       Ljava/lang/String;
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: pop            
        //   194: aload           8
        //   196: ldc             ": "
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: pop            
        //   202: aload           8
        //   204: aload           9
        //   206: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   211: checkcast       Ljava/lang/String;
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: pop            
        //   218: goto            144
        //   221: new             Ljava/lang/StringBuilder;
        //   224: dup            
        //   225: ldc             "HTTP: ["
        //   227: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   230: astore          7
        //   232: aload           7
        //   234: aload_1        
        //   235: invokevirtual   java/lang/Object.hashCode:()I
        //   238: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   241: pop            
        //   242: aload           7
        //   244: ldc             "] "
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: pop            
        //   250: aload           7
        //   252: aload           8
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload           7
        //   260: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   263: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //   266: new             Ljava/net/URL;
        //   269: dup            
        //   270: aload_1        
        //   271: getfield        com/appsflyer/internal/AFa1aSDK.valueOf:Ljava/lang/String;
        //   274: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   277: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //   280: invokestatic    com/google/firebase/perf/network/FirebasePerfUrlConnection.instrument:(Ljava/lang/Object;)Ljava/lang/Object;
        //   283: checkcast       Ljava/net/URLConnection;
        //   286: checkcast       Ljava/net/HttpURLConnection;
        //   289: astore          7
        //   291: aload           7
        //   293: aload_1        
        //   294: getfield        com/appsflyer/internal/AFa1aSDK.AFInAppEventParameterName:Ljava/lang/String;
        //   297: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   300: aload_1        
        //   301: invokevirtual   com/appsflyer/internal/AFa1aSDK.AFInAppEventParameterName:()Z
        //   304: ifeq            316
        //   307: aload           7
        //   309: iconst_0       
        //   310: invokevirtual   java/net/URLConnection.setUseCaches:(Z)V
        //   313: goto            316
        //   316: aload_1        
        //   317: invokevirtual   com/appsflyer/internal/AFa1aSDK.afDebugLog:()Z
        //   320: ifne            329
        //   323: aload           7
        //   325: iconst_0       
        //   326: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //   329: aload_0        
        //   330: getfield        com/appsflyer/internal/AFc1lSDK.AFInAppEventType:I
        //   333: istore_2       
        //   334: aload_1        
        //   335: getfield        com/appsflyer/internal/AFa1aSDK.afDebugLog:I
        //   338: istore_3       
        //   339: iload_3        
        //   340: iconst_m1      
        //   341: if_icmpeq       346
        //   344: iload_3        
        //   345: istore_2       
        //   346: aload           7
        //   348: iload_2        
        //   349: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   352: aload           7
        //   354: iload_2        
        //   355: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //   358: aload_1        
        //   359: invokevirtual   com/appsflyer/internal/AFa1aSDK.AFKeystoreWrapper:()Z
        //   362: ifeq            961
        //   365: ldc             "application/octet-stream"
        //   367: astore          8
        //   369: goto            372
        //   372: aload           7
        //   374: ldc             "Content-Type"
        //   376: aload           8
        //   378: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   381: aload_1        
        //   382: getfield        com/appsflyer/internal/AFa1aSDK.AFKeystoreWrapper:Ljava/util/Map;
        //   385: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   390: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   395: astore          8
        //   397: aload           8
        //   399: invokeinterface java/util/Iterator.hasNext:()Z
        //   404: ifeq            447
        //   407: aload           8
        //   409: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   414: checkcast       Ljava/util/Map$Entry;
        //   417: astore          9
        //   419: aload           7
        //   421: aload           9
        //   423: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   428: checkcast       Ljava/lang/String;
        //   431: aload           9
        //   433: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   438: checkcast       Ljava/lang/String;
        //   441: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   444: goto            397
        //   447: iconst_1       
        //   448: istore          6
        //   450: aload           10
        //   452: ifnull          533
        //   455: aload           7
        //   457: iconst_1       
        //   458: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   461: new             Ljava/lang/StringBuilder;
        //   464: dup            
        //   465: invokespecial   java/lang/StringBuilder.<init>:()V
        //   468: astore          8
        //   470: aload           8
        //   472: aload           10
        //   474: arraylength    
        //   475: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   478: pop            
        //   479: aload           7
        //   481: ldc             "Content-Length"
        //   483: aload           8
        //   485: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   488: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   491: new             Ljava/io/BufferedOutputStream;
        //   494: dup            
        //   495: aload           7
        //   497: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   500: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   503: astore          9
        //   505: aload           9
        //   507: aload           10
        //   509: invokevirtual   java/io/OutputStream.write:([B)V
        //   512: aload           9
        //   514: invokevirtual   java/io/OutputStream.close:()V
        //   517: goto            533
        //   520: aload           9
        //   522: ifnull          530
        //   525: aload           9
        //   527: invokevirtual   java/io/OutputStream.close:()V
        //   530: aload           8
        //   532: athrow         
        //   533: aload           7
        //   535: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   538: bipush          100
        //   540: idiv           
        //   541: iconst_2       
        //   542: if_icmpne       982
        //   545: goto            548
        //   548: aload_1        
        //   549: invokevirtual   com/appsflyer/internal/AFa1aSDK.AFInAppEventType:()Z
        //   552: ifeq            988
        //   555: aload           7
        //   557: iload           6
        //   559: invokestatic    com/appsflyer/internal/AFc1lSDK.AFKeystoreWrapper:(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;
        //   562: astore          8
        //   564: goto            567
        //   567: new             Lcom/appsflyer/internal/AFc1kSDK;
        //   570: dup            
        //   571: invokestatic    java/lang/System.currentTimeMillis:()J
        //   574: lload           4
        //   576: lsub           
        //   577: invokespecial   com/appsflyer/internal/AFc1kSDK.<init>:(J)V
        //   580: astore          9
        //   582: new             Ljava/lang/StringBuilder;
        //   585: dup            
        //   586: ldc             "response code:"
        //   588: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   591: astore          10
        //   593: aload           10
        //   595: aload           7
        //   597: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   600: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   603: pop            
        //   604: aload           10
        //   606: ldc             " "
        //   608: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   611: pop            
        //   612: aload           10
        //   614: aload           7
        //   616: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //   619: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   622: pop            
        //   623: aload           10
        //   625: ldc             "\n body:"
        //   627: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   630: pop            
        //   631: aload           10
        //   633: aload           8
        //   635: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   638: pop            
        //   639: aload           10
        //   641: ldc             "\n took "
        //   643: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   646: pop            
        //   647: aload           10
        //   649: aload           9
        //   651: getfield        com/appsflyer/internal/AFc1kSDK.AFKeystoreWrapper:J
        //   654: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   657: pop            
        //   658: aload           10
        //   660: ldc_w           "ms"
        //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   666: pop            
        //   667: aload           10
        //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   672: astore          10
        //   674: new             Ljava/lang/StringBuilder;
        //   677: dup            
        //   678: ldc             "HTTP: ["
        //   680: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   683: astore          11
        //   685: aload           11
        //   687: aload_1        
        //   688: invokevirtual   java/lang/Object.hashCode:()I
        //   691: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   694: pop            
        //   695: aload           11
        //   697: ldc             "] "
        //   699: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   702: pop            
        //   703: aload           11
        //   705: aload           10
        //   707: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   710: pop            
        //   711: aload           11
        //   713: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   716: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //   719: new             Ljava/util/HashMap;
        //   722: dup            
        //   723: aload           7
        //   725: invokevirtual   java/net/URLConnection.getHeaderFields:()Ljava/util/Map;
        //   728: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   731: astore          10
        //   733: aload           10
        //   735: aconst_null    
        //   736: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   741: pop            
        //   742: new             Lcom/appsflyer/internal/AFc1gSDK;
        //   745: dup            
        //   746: aload           8
        //   748: aload           7
        //   750: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   753: iload           6
        //   755: aload           10
        //   757: aload           9
        //   759: invokespecial   com/appsflyer/internal/AFc1gSDK.<init>:(Ljava/lang/Object;IZLjava/util/Map;Lcom/appsflyer/internal/AFc1kSDK;)V
        //   762: astore          8
        //   764: aload           7
        //   766: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   769: aload           8
        //   771: areturn        
        //   772: astore_1       
        //   773: aconst_null    
        //   774: astore          7
        //   776: goto            916
        //   779: astore          8
        //   781: aconst_null    
        //   782: astore          7
        //   784: new             Lcom/appsflyer/internal/AFc1kSDK;
        //   787: dup            
        //   788: invokestatic    java/lang/System.currentTimeMillis:()J
        //   791: lload           4
        //   793: lsub           
        //   794: invokespecial   com/appsflyer/internal/AFc1kSDK.<init>:(J)V
        //   797: astore          9
        //   799: new             Ljava/lang/StringBuilder;
        //   802: dup            
        //   803: ldc_w           "error: "
        //   806: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   809: astore          10
        //   811: aload           10
        //   813: aload           8
        //   815: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   818: pop            
        //   819: aload           10
        //   821: ldc             "\n took "
        //   823: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   826: pop            
        //   827: aload           10
        //   829: aload           9
        //   831: getfield        com/appsflyer/internal/AFc1kSDK.AFKeystoreWrapper:J
        //   834: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   837: pop            
        //   838: aload           10
        //   840: ldc_w           "ms"
        //   843: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   846: pop            
        //   847: aload           10
        //   849: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   852: astore          10
        //   854: new             Ljava/lang/StringBuilder;
        //   857: dup            
        //   858: ldc             "HTTP: ["
        //   860: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   863: astore          11
        //   865: aload           11
        //   867: aload_1        
        //   868: invokevirtual   java/lang/Object.hashCode:()I
        //   871: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   874: pop            
        //   875: aload           11
        //   877: ldc             "] "
        //   879: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   882: pop            
        //   883: aload           11
        //   885: aload           10
        //   887: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   890: pop            
        //   891: aload           11
        //   893: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   896: aload           8
        //   898: iconst_0       
        //   899: iconst_0       
        //   900: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V
        //   903: new             Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;
        //   906: dup            
        //   907: aload           8
        //   909: aload           9
        //   911: invokespecial   com/appsflyer/internal/components/network/http/exceptions/HttpException.<init>:(Ljava/lang/Throwable;Lcom/appsflyer/internal/AFc1kSDK;)V
        //   914: athrow         
        //   915: astore_1       
        //   916: aload           7
        //   918: ifnull          926
        //   921: aload           7
        //   923: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   926: aload_1        
        //   927: athrow         
        //   928: astore_1       
        //   929: aconst_null    
        //   930: astore          7
        //   932: goto            916
        //   935: astore          8
        //   937: aconst_null    
        //   938: astore          7
        //   940: goto            784
        //   943: astore_1       
        //   944: goto            916
        //   947: astore          8
        //   949: goto            784
        //   952: astore_1       
        //   953: goto            944
        //   956: astore          8
        //   958: goto            949
        //   961: ldc_w           "application/json"
        //   964: astore          8
        //   966: goto            372
        //   969: astore          8
        //   971: goto            520
        //   974: astore          8
        //   976: aconst_null    
        //   977: astore          9
        //   979: goto            520
        //   982: iconst_0       
        //   983: istore          6
        //   985: goto            548
        //   988: ldc             ""
        //   990: astore          8
        //   992: goto            567
        //    Signature:
        //  (Lcom/appsflyer/internal/AFa1aSDK;)Lcom/appsflyer/internal/AFc1gSDK<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      74     779    784    Ljava/lang/Exception;
        //  5      74     772    779    Any
        //  84     91     935    943    Ljava/lang/Exception;
        //  84     91     928    935    Any
        //  98     112    935    943    Ljava/lang/Exception;
        //  98     112    928    935    Any
        //  112    128    935    943    Ljava/lang/Exception;
        //  112    128    928    935    Any
        //  128    144    779    784    Ljava/lang/Exception;
        //  128    144    772    779    Any
        //  144    153    779    784    Ljava/lang/Exception;
        //  144    153    772    779    Any
        //  158    218    935    943    Ljava/lang/Exception;
        //  158    218    928    935    Any
        //  221    291    779    784    Ljava/lang/Exception;
        //  221    291    772    779    Any
        //  291    313    947    949    Ljava/lang/Exception;
        //  291    313    943    944    Any
        //  316    329    947    949    Ljava/lang/Exception;
        //  316    329    943    944    Any
        //  329    339    956    961    Ljava/lang/Exception;
        //  329    339    952    956    Any
        //  346    365    956    961    Ljava/lang/Exception;
        //  346    365    952    956    Any
        //  372    397    956    961    Ljava/lang/Exception;
        //  372    397    952    956    Any
        //  397    444    956    961    Ljava/lang/Exception;
        //  397    444    952    956    Any
        //  455    491    956    961    Ljava/lang/Exception;
        //  455    491    952    956    Any
        //  491    505    974    982    Any
        //  505    512    969    974    Any
        //  512    517    956    961    Ljava/lang/Exception;
        //  512    517    952    956    Any
        //  525    530    956    961    Ljava/lang/Exception;
        //  525    530    952    956    Any
        //  530    533    956    961    Ljava/lang/Exception;
        //  530    533    952    956    Any
        //  533    545    956    961    Ljava/lang/Exception;
        //  533    545    952    956    Any
        //  548    564    956    961    Ljava/lang/Exception;
        //  548    564    952    956    Any
        //  567    764    956    961    Ljava/lang/Exception;
        //  567    764    952    956    Any
        //  784    915    915    916    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 446 out of bounds for length 446
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
}
