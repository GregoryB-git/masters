// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.AFLogger;
import android.net.Uri;
import android.content.Intent;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.appsflyer.AppsFlyerLib;
import androidx.annotation.NonNull;
import android.content.Context;

public final class AFe1ySDK
{
    public static String valueOf;
    public final AFb1dSDK values;
    
    static {
        final StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFa1eSDK.AFInAppEventType);
        AFe1ySDK.valueOf = sb.toString();
    }
    
    public AFe1ySDK(@NonNull final Context context) {
        this.values = AFa1eSDK.valueOf().values(context);
    }
    
    public static boolean AFInAppEventType(@NonNull final AFb1dSDK aFb1dSDK) {
        return aFb1dSDK.valueOf("sentRegisterRequestToAF");
    }
    
    public static void valueOf(final String s) {
        final AFc1xSDK afInAppEventType = AFa1eSDK.valueOf().AFInAppEventType();
        final AFd1eSDK aFd1eSDK = new AFd1eSDK(s, afInAppEventType);
        final AFc1bSDK afVersionDeclaration = afInAppEventType.AFVersionDeclaration();
        afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
            private /* synthetic */ AFd1zSDK AFInAppEventType = aFd1eSDK;
            
            @Override
            public final void run() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //     7: astore          6
                //     9: aload           6
                //    11: monitorenter   
                //    12: aload_0        
                //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                //    19: aload_0        
                //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                //    28: ifeq            64
                //    31: new             Ljava/lang/StringBuilder;
                //    34: dup            
                //    35: ldc             "QUEUE: tried to add already running task: "
                //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //    40: astore          7
                //    42: aload           7
                //    44: aload_0        
                //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //    51: pop            
                //    52: aload           7
                //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                //    60: aload           6
                //    62: monitorexit    
                //    63: return         
                //    64: aload_0        
                //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //    71: aload_0        
                //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                //    80: ifne            676
                //    83: aload_0        
                //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //    90: aload_0        
                //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                //    99: ifeq            105
                //   102: goto            676
                //   105: aload_0        
                //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   109: astore          7
                //   111: aload_0        
                //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   115: astore          8
                //   117: aload           8
                //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                //   127: astore          9
                //   129: aload           9
                //   131: invokeinterface java/util/Iterator.hasNext:()Z
                //   136: ifeq            182
                //   139: aload           9
                //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                //   149: astore          10
                //   151: aload           7
                //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                //   156: aload           10
                //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                //   163: ifeq            129
                //   166: aload           8
                //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                //   171: aload           10
                //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                //   178: pop            
                //   179: goto            129
                //   182: aload_0        
                //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   186: aload_0        
                //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                //   193: ifeq            217
                //   196: aload_0        
                //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   203: aload_0        
                //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                //   212: istore          4
                //   214: goto            284
                //   217: aload_0        
                //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //   224: aload_0        
                //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                //   233: istore          5
                //   235: iload           5
                //   237: istore          4
                //   239: iload           5
                //   241: ifeq            284
                //   244: new             Ljava/lang/StringBuilder;
                //   247: dup            
                //   248: ldc             "QUEUE: new task was blocked: "
                //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   253: astore          7
                //   255: aload           7
                //   257: aload_0        
                //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   264: pop            
                //   265: aload           7
                //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                //   273: aload_0        
                //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                //   280: iload           5
                //   282: istore          4
                //   284: iload           4
                //   286: ifeq            326
                //   289: aload_0        
                //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   293: astore          7
                //   295: aload           7
                //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   300: aload           7
                //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                //   310: pop            
                //   311: aload_0        
                //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                //   318: invokeinterface java/util/List.clear:()V
                //   323: goto            355
                //   326: new             Ljava/lang/StringBuilder;
                //   329: dup            
                //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   335: astore          7
                //   337: aload           7
                //   339: aload_0        
                //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   346: pop            
                //   347: aload           7
                //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                //   355: aload           6
                //   357: monitorexit    
                //   358: iload           4
                //   360: ifeq            646
                //   363: aload_0        
                //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                //   370: aload_0        
                //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                //   382: pop            
                //   383: new             Ljava/lang/StringBuilder;
                //   386: dup            
                //   387: ldc             "QUEUE: new task added: "
                //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   392: astore          6
                //   394: aload           6
                //   396: aload_0        
                //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   403: pop            
                //   404: aload           6
                //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                //   412: aload_0        
                //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                //   424: astore          6
                //   426: aload           6
                //   428: invokeinterface java/util/Iterator.hasNext:()Z
                //   433: ifeq            451
                //   436: aload           6
                //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                //   446: astore          7
                //   448: goto            426
                //   451: aload_0        
                //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   455: astore          6
                //   457: aload           6
                //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                //   462: aload           6
                //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                //   469: pop            
                //   470: aload_0        
                //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                //   474: astore          8
                //   476: aload           8
                //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   481: astore          7
                //   483: aload           7
                //   485: monitorenter   
                //   486: aload           8
                //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   491: invokeinterface java/util/Set.size:()I
                //   496: aload           8
                //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //   501: invokeinterface java/util/Set.size:()I
                //   506: iadd           
                //   507: bipush          40
                //   509: isub           
                //   510: istore_1       
                //   511: iload_1        
                //   512: ifle            636
                //   515: aload           8
                //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //   520: invokeinterface java/util/Set.isEmpty:()Z
                //   525: iconst_1       
                //   526: ixor           
                //   527: istore_2       
                //   528: aload           8
                //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   533: invokeinterface java/util/Set.isEmpty:()Z
                //   538: iconst_1       
                //   539: ixor           
                //   540: istore_3       
                //   541: iload_3        
                //   542: ifeq            608
                //   545: iload_2        
                //   546: ifeq            608
                //   549: aload           8
                //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                //   562: aload           8
                //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                //   578: ifle            598
                //   581: aload           8
                //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   586: astore          6
                //   588: aload           8
                //   590: aload           6
                //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                //   595: goto            725
                //   598: aload           8
                //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //   603: astore          6
                //   605: goto            588
                //   608: iload_3        
                //   609: ifeq            622
                //   612: aload           8
                //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                //   617: astore          6
                //   619: goto            588
                //   622: iload_2        
                //   623: ifeq            725
                //   626: aload           8
                //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                //   631: astore          6
                //   633: goto            588
                //   636: aload           7
                //   638: monitorexit    
                //   639: return         
                //   640: aload           7
                //   642: monitorexit    
                //   643: aload           6
                //   645: athrow         
                //   646: new             Ljava/lang/StringBuilder;
                //   649: dup            
                //   650: ldc             "QUEUE: tried to add already pending task: "
                //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   655: astore          6
                //   657: aload           6
                //   659: aload_0        
                //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   666: pop            
                //   667: aload           6
                //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                //   675: return         
                //   676: new             Ljava/lang/StringBuilder;
                //   679: dup            
                //   680: ldc             "QUEUE: tried to add already scheduled task: "
                //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   685: astore          7
                //   687: aload           7
                //   689: aload_0        
                //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   696: pop            
                //   697: aload           7
                //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                //   705: aload           6
                //   707: monitorexit    
                //   708: return         
                //   709: aload           6
                //   711: monitorexit    
                //   712: aload           7
                //   714: athrow         
                //   715: astore          7
                //   717: goto            709
                //   720: astore          6
                //   722: goto            640
                //   725: iload_1        
                //   726: iconst_1       
                //   727: isub           
                //   728: istore_1       
                //   729: goto            511
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type
                //  -----  -----  -----  -----  ----
                //  12     63     715    720    Any
                //  64     102    715    720    Any
                //  105    129    715    720    Any
                //  129    179    715    720    Any
                //  182    214    715    720    Any
                //  217    235    715    720    Any
                //  244    280    715    720    Any
                //  289    323    715    720    Any
                //  326    355    715    720    Any
                //  355    358    715    720    Any
                //  486    511    720    646    Any
                //  515    541    720    646    Any
                //  549    588    720    646    Any
                //  588    595    720    646    Any
                //  598    605    720    646    Any
                //  612    619    720    646    Any
                //  626    633    720    646    Any
                //  636    639    720    646    Any
                //  676    708    715    720    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    public static boolean values(final Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            final String action_DIRECT_BOOT_REMOTE_INTENT = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            if (AFa1fSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", (Uri)null, context, (Class)FirebaseMessagingServiceListener.class))) {
                return true;
            }
            goto Label_0046;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
        finally {
            final Throwable t;
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", t);
        }
    }
    
    public final AFb1uSDK AFInAppEventParameterName() {
        final String values = this.values.values("afUninstallToken", null);
        final long value = this.values.valueOf("afUninstallToken_received_time", 0L);
        final boolean value2 = this.values.valueOf("afUninstallToken_queued");
        this.values.values("afUninstallToken_queued", false);
        String s = values;
        if (values == null) {
            final String string = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            s = values;
            if (string != null) {
                final String[] split = string.split(",");
                s = split[split.length - 1];
            }
        }
        long long1 = value;
        while (true) {
            if (value != 0L) {
                break Label_0154;
            }
            final String string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            long1 = value;
            if (string2 == null) {
                break Label_0154;
            }
            final String[] split2 = string2.split(",");
            long1 = value;
            if (split2.length < 2) {
                break Label_0154;
            }
            try {
                long1 = Long.parseLong(split2[split2.length - 2]);
                if (s != null) {
                    return new AFb1uSDK(s, long1, value2);
                }
                return null;
            }
            catch (NumberFormatException ex) {
                long1 = value;
                continue;
            }
            break;
        }
    }
}
