// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;
import com.appsflyer.AFLogger;
import java.util.Map;

public final class AFe1pSDK extends AFd1zSDK<Void>
{
    private final AFc1gSDK<String> afDebugLog;
    private final AFb1dSDK afErrorLog;
    private final Throwable afInfoLog;
    
    public AFe1pSDK(final AFd1fSDK aFd1fSDK, final AFb1dSDK afErrorLog) {
        super(AFd1vSDK.afDebugLog, new AFd1vSDK[] { AFd1vSDK.values }, "GCD-CHECK");
        this.afInfoLog = aFd1fSDK.afDebugLog();
        this.afDebugLog = (AFc1gSDK<String>)aFd1fSDK.afErrorLog;
        this.afErrorLog = afErrorLog;
    }
    
    private Map<String, Object> afRDLog() {
        final String values = this.afErrorLog.values("attributionId", null);
        if (values == null) {
            return null;
        }
        try {
            new AFc1rSDK();
            return AFc1rSDK.AFKeystoreWrapper(values);
        }
        catch (JSONException ex) {
            final StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(((Throwable)ex).getMessage());
            com.appsflyer.AFLogger.afErrorLog(sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }
    
    @Override
    public final long AFInAppEventType() {
        return 1000L;
    }
    
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_0        
        //     3: getfield        com/appsflyer/internal/AFe1pSDK.afErrorLog:Lcom/appsflyer/internal/AFb1dSDK;
        //     6: ldc             "appsFlyerCount"
        //     8: iconst_0       
        //     9: invokeinterface com/appsflyer/internal/AFb1dSDK.values:(Ljava/lang/String;I)I
        //    14: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    17: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    20: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //    23: aload_0        
        //    24: getfield        com/appsflyer/internal/AFe1pSDK.afErrorLog:Lcom/appsflyer/internal/AFb1dSDK;
        //    27: ldc             "appsflyerConversionDataCacheExpiration"
        //    29: lconst_0       
        //    30: invokeinterface com/appsflyer/internal/AFb1dSDK.valueOf:(Ljava/lang/String;J)J
        //    35: lstore_1       
        //    36: lload_1        
        //    37: lconst_0       
        //    38: lcmp           
        //    39: ifeq            95
        //    42: invokestatic    java/lang/System.currentTimeMillis:()J
        //    45: lload_1        
        //    46: lsub           
        //    47: ldc2_w          5184000000
        //    50: lcmp           
        //    51: ifle            95
        //    54: ldc             "[GCD-E02] Cached conversion data expired"
        //    56: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //    59: aload_0        
        //    60: getfield        com/appsflyer/internal/AFe1pSDK.afErrorLog:Lcom/appsflyer/internal/AFb1dSDK;
        //    63: ldc             "sixtyDayConversionData"
        //    65: iconst_1       
        //    66: invokeinterface com/appsflyer/internal/AFb1dSDK.values:(Ljava/lang/String;Z)V
        //    71: aload_0        
        //    72: getfield        com/appsflyer/internal/AFe1pSDK.afErrorLog:Lcom/appsflyer/internal/AFb1dSDK;
        //    75: ldc             "attributionId"
        //    77: aconst_null    
        //    78: invokeinterface com/appsflyer/internal/AFb1dSDK.AFInAppEventParameterName:(Ljava/lang/String;Ljava/lang/String;)V
        //    83: aload_0        
        //    84: getfield        com/appsflyer/internal/AFe1pSDK.afErrorLog:Lcom/appsflyer/internal/AFb1dSDK;
        //    87: ldc             "appsflyerConversionDataCacheExpiration"
        //    89: lconst_0       
        //    90: invokeinterface com/appsflyer/internal/AFb1dSDK.AFInAppEventParameterName:(Ljava/lang/String;J)V
        //    95: aload_0        
        //    96: invokespecial   com/appsflyer/internal/AFe1pSDK.afRDLog:()Ljava/util/Map;
        //    99: astore_3       
        //   100: aload_3        
        //   101: ifnull          170
        //   104: aload_3        
        //   105: ldc             "is_first_launch"
        //   107: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   112: ifne            130
        //   115: aload_3        
        //   116: ldc             "is_first_launch"
        //   118: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   121: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   126: pop            
        //   127: goto            130
        //   130: aload_3        
        //   131: invokestatic    com/appsflyer/internal/AFe1sSDK.values:(Ljava/util/Map;)V
        //   134: goto            166
        //   137: new             Ljava/lang/StringBuilder;
        //   140: dup            
        //   141: ldc             "[GCD] Error executing conversion data callback: "
        //   143: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   146: astore_3       
        //   147: aload_3        
        //   148: aload           4
        //   150: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: pop            
        //   157: aload_3        
        //   158: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   161: aload           4
        //   163: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   166: getstatic       com/appsflyer/internal/AFd1ySDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;
        //   169: areturn        
        //   170: aload_0        
        //   171: getfield        com/appsflyer/internal/AFe1pSDK.afInfoLog:Ljava/lang/Throwable;
        //   174: ifnull          210
        //   177: new             Ljava/lang/StringBuilder;
        //   180: dup            
        //   181: ldc             "Launch exception: "
        //   183: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   186: astore_3       
        //   187: aload_3        
        //   188: aload_0        
        //   189: getfield        com/appsflyer/internal/AFe1pSDK.afInfoLog:Ljava/lang/Throwable;
        //   192: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: pop            
        //   199: aload_3        
        //   200: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   203: invokestatic    com/appsflyer/internal/AFe1sSDK.AFInAppEventType:(Ljava/lang/String;)V
        //   206: getstatic       com/appsflyer/internal/AFd1ySDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;
        //   209: areturn        
        //   210: aload_0        
        //   211: getfield        com/appsflyer/internal/AFe1pSDK.afDebugLog:Lcom/appsflyer/internal/AFc1gSDK;
        //   214: astore_3       
        //   215: aload_3        
        //   216: ifnull          290
        //   219: aload_3        
        //   220: invokevirtual   com/appsflyer/internal/AFc1gSDK.isSuccessful:()Z
        //   223: ifne            290
        //   226: new             Ljava/lang/StringBuilder;
        //   229: dup            
        //   230: ldc             "Launch status code: "
        //   232: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   235: astore_3       
        //   236: aload_3        
        //   237: aload_0        
        //   238: getfield        com/appsflyer/internal/AFe1pSDK.afDebugLog:Lcom/appsflyer/internal/AFc1gSDK;
        //   241: invokevirtual   com/appsflyer/internal/AFc1gSDK.getStatusCode:()I
        //   244: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   247: pop            
        //   248: aload_3        
        //   249: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   252: invokestatic    com/appsflyer/internal/AFe1sSDK.AFInAppEventType:(Ljava/lang/String;)V
        //   255: getstatic       com/appsflyer/internal/AFd1ySDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;
        //   258: astore_3       
        //   259: aload_3        
        //   260: areturn        
        //   261: new             Ljava/lang/StringBuilder;
        //   264: dup            
        //   265: ldc             "[GCD] Error executing conversion data callback: "
        //   267: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   270: astore_3       
        //   271: aload_3        
        //   272: aload           4
        //   274: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: pop            
        //   281: aload_3        
        //   282: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   285: aload           4
        //   287: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   290: getstatic       com/appsflyer/internal/AFd1ySDK.valueOf:Lcom/appsflyer/internal/AFd1ySDK;
        //   293: areturn        
        //   294: astore          4
        //   296: goto            137
        //   299: astore          4
        //   301: goto            261
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  104    127    294    166    Ljava/lang/Exception;
        //  130    134    294    166    Ljava/lang/Exception;
        //  170    210    299    290    Ljava/lang/Exception;
        //  210    215    299    290    Ljava/lang/Exception;
        //  219    259    299    290    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0170:
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
