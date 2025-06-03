// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Set;
import kotlin.text.i;
import org.json.JSONObject;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import androidx.annotation.NonNull;

public class AFd1hSDK extends AFd1oSDK<String>
{
    private static final AFd1vSDK[] AppsFlyer2dXConversionCallback;
    private final AFc1dSDK AFLogger$LogLevel;
    private final AFb1wSDK AFVersionDeclaration;
    protected final AFb1dSDK afErrorLogForExcManagerOnly;
    public final AFa1qSDK afInfoLog;
    private final AFb1bSDK afWarnLog;
    @NonNull
    private final AFb1gSDK getLevel;
    
    static {
        AppsFlyer2dXConversionCallback = new AFd1vSDK[] { AFd1vSDK.afRDLog, AFd1vSDK.valueOf, AFd1vSDK.onInstallConversionFailureNative, AFd1vSDK.afErrorLog };
    }
    
    public AFd1hSDK(@NonNull final AFa1qSDK aFa1qSDK, @NonNull final AFc1xSDK aFc1xSDK) {
        this(aFa1qSDK, aFc1xSDK, null);
    }
    
    public AFd1hSDK(@NonNull final AFa1qSDK afInfoLog, @NonNull final AFc1xSDK aFc1xSDK, final String s) {
        final AFd1vSDK afInAppEventType = afInfoLog.AFInAppEventType();
        final AFd1vSDK values = AFd1vSDK.values;
        int i = 0;
        super(afInAppEventType, new AFd1vSDK[] { values }, aFc1xSDK, s);
        this.afInfoLog = afInfoLog;
        this.AFLogger$LogLevel = aFc1xSDK.onInstallConversionFailureNative();
        this.afErrorLogForExcManagerOnly = aFc1xSDK.values();
        this.AFVersionDeclaration = aFc1xSDK.afRDLog();
        this.afWarnLog = aFc1xSDK.init();
        this.getLevel = aFc1xSDK.AFInAppEventParameterName();
        for (AFd1vSDK[] appsFlyer2dXConversionCallback = AFd1hSDK.AppsFlyer2dXConversionCallback; i < appsFlyer2dXConversionCallback.length; ++i) {
            if (super.values == appsFlyer2dXConversionCallback[i]) {
                return;
            }
        }
        final int afLogger = this.afInfoLog.AFLogger;
        final AFd1vSDK values2 = super.values;
        if (afLogger > 0) {
            super.AFKeystoreWrapper.add(AFd1vSDK.AFInAppEventParameterName);
            return;
        }
        final AFd1vSDK afInAppEventParameterName = AFd1vSDK.AFInAppEventParameterName;
        if (values2 != afInAppEventParameterName) {
            super.AFInAppEventParameterName.add(afInAppEventParameterName);
        }
    }
    
    @NonNull
    private static Map<String, Object> AFKeystoreWrapper(final AFa1qSDK aFa1qSDK) {
        Map<String, Object> map;
        if ((map = aFa1qSDK.valueOf().get("meta")) == null) {
            map = new HashMap<String, Object>();
            aFa1qSDK.valueOf().put("meta", map);
        }
        return map;
    }
    
    @Override
    public boolean afInfoLog() {
        return true;
    }
    
    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return this.afInfoLog.AFInAppEventParameterName;
    }
    
    public void valueOf(final AFa1qSDK aFa1qSDK) {
        if (aFa1qSDK.afErrorLog()) {
            aFa1qSDK.values(new AFb1fSDK(aFa1qSDK.valueOf(), super.afDebugLog.AFKeystoreWrapper.AFInAppEventType));
            aFa1qSDK.values(super.afDebugLog.AFInAppEventParameterName(aFa1qSDK.valueOf()));
        }
        if (aFa1qSDK.afDebugLog()) {
            aFa1qSDK.values(super.afDebugLog.valueOf());
        }
        final Set<AFd1vSDK> afInAppEventParameterName = (Set<AFd1vSDK>)super.AFInAppEventParameterName;
        final boolean b = afInAppEventParameterName.contains(AFd1vSDK.afWarnLog) || afInAppEventParameterName.contains(AFd1vSDK.AFInAppEventParameterName);
        if (this.AFLogger() && b) {
            aFa1qSDK.AFInAppEventParameterName(this.afErrorLogForExcManagerOnly.values("appsFlyerCount", 0));
        }
        if (aFa1qSDK.afRDLog()) {
            final Map<String, Object> afKeystoreWrapper = AFKeystoreWrapper(aFa1qSDK);
            final AFc1dSDK afLogger$LogLevel = this.AFLogger$LogLevel;
            final String afInAppEventParameterName2 = afLogger$LogLevel.AFInAppEventParameterName();
            final String value = afLogger$LogLevel.valueOf();
            AFc1aSDK aFc1aSDK;
            if (AFc1dSDK.AFInAppEventType()) {
                aFc1aSDK = AFc1aSDK.AFKeystoreWrapper;
            }
            else {
                aFc1aSDK = AFc1aSDK.AFInAppEventType;
            }
            final AFc1eSDK aFc1eSDK = new AFc1eSDK(afInAppEventParameterName2, value, aFc1aSDK);
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", (Object)aFc1eSDK.AFInAppEventType);
            final AFc1aSDK valueOf = aFc1eSDK.valueOf;
            if (valueOf != AFc1aSDK.AFKeystoreWrapper) {
                jsonObject.put("method", (Object)valueOf.valueOf);
            }
            final String values = aFc1eSDK.values;
            if (values != null) {
                if (!i.F(values)) {
                    jsonObject.put("prefix", (Object)aFc1eSDK.values);
                }
            }
            afKeystoreWrapper.put("host", jsonObject);
        }
        if (this.getLevel.AFKeystoreWrapper("AF_PREINSTALL_DISABLED")) {
            AFKeystoreWrapper(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }
    
    @Override
    public final AFc1qSDK<String> values(@NonNull final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          7
        //     5: aload_0        
        //     6: aload_0        
        //     7: getfield        com/appsflyer/internal/AFd1hSDK.afInfoLog:Lcom/appsflyer/internal/AFa1qSDK;
        //    10: invokevirtual   com/appsflyer/internal/AFd1hSDK.valueOf:(Lcom/appsflyer/internal/AFa1qSDK;)V
        //    13: aload_0        
        //    14: getfield        com/appsflyer/internal/AFd1hSDK.afInfoLog:Lcom/appsflyer/internal/AFa1qSDK;
        //    17: invokevirtual   com/appsflyer/internal/AFa1qSDK.valueOf:()Ljava/util/Map;
        //    20: ldc             "meta"
        //    22: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    27: ifeq            77
        //    30: aload_0        
        //    31: getfield        com/appsflyer/internal/AFd1hSDK.AFVersionDeclaration:Lcom/appsflyer/internal/AFb1wSDK;
        //    34: getfield        com/appsflyer/internal/AFb1wSDK.AFInAppEventType:Lcom/appsflyer/internal/AFb1ySDK;
        //    37: getfield        com/appsflyer/internal/AFb1ySDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFe1qSDK;
        //    40: getfield        com/appsflyer/internal/AFe1qSDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1aSDK;
        //    43: getfield        com/appsflyer/internal/AFd1aSDK.AFInAppEventParameterName:Lcom/appsflyer/internal/AFe1sSDK;
        //    46: getfield        com/appsflyer/internal/AFe1sSDK.AFInAppEventType:D
        //    49: dstore_2       
        //    50: goto            55
        //    53: dconst_1       
        //    54: dstore_2       
        //    55: dload_2        
        //    56: invokestatic    com/appsflyer/internal/AFa1qSDK.AFInAppEventType:(D)Z
        //    59: ifeq            77
        //    62: aload_0        
        //    63: getfield        com/appsflyer/internal/AFd1hSDK.afInfoLog:Lcom/appsflyer/internal/AFa1qSDK;
        //    66: invokevirtual   com/appsflyer/internal/AFa1qSDK.valueOf:()Ljava/util/Map;
        //    69: ldc             "meta"
        //    71: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    76: pop            
        //    77: aload_0        
        //    78: getfield        com/appsflyer/internal/AFd1hSDK.afInfoLog:Lcom/appsflyer/internal/AFa1qSDK;
        //    81: astore          4
        //    83: aload           4
        //    85: getfield        com/appsflyer/internal/AFa1qSDK.afRDLog:Ljava/lang/String;
        //    88: astore          8
        //    90: aload           4
        //    92: invokevirtual   com/appsflyer/internal/AFa1qSDK.valueOf:()Ljava/util/Map;
        //    95: astore          9
        //    97: aconst_null    
        //    98: astore          4
        //   100: new             Lorg/json/JSONObject;
        //   103: dup            
        //   104: aload           9
        //   106: invokespecial   org/json/JSONObject.<init>:(Ljava/util/Map;)V
        //   109: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   112: astore          5
        //   114: aload           5
        //   116: ifnull          135
        //   119: aload           5
        //   121: ldc_w           "\\p{C}"
        //   124: ldc_w           "*Non-printing character*"
        //   127: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   130: astore          4
        //   132: goto            362
        //   135: new             Ljava/lang/NullPointerException;
        //   138: dup            
        //   139: ldc_w           "JSON toString of eventParams map returns null"
        //   142: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   145: athrow         
        //   146: astore          5
        //   148: goto            159
        //   151: astore          6
        //   153: aconst_null    
        //   154: astore          4
        //   156: goto            184
        //   159: ldc_w           "Unexpected error"
        //   162: aload           5
        //   164: iconst_1       
        //   165: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //   168: ldc_w           ""
        //   171: astore          6
        //   173: aload           4
        //   175: astore          5
        //   177: aload           6
        //   179: astore          4
        //   181: goto            362
        //   184: ldc_w           "JSONObject return null String object. Trying to create AFJsonObject."
        //   187: aload           6
        //   189: iconst_1       
        //   190: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //   193: sipush          12254
        //   196: invokestatic    android/view/ViewConfiguration.getFadingEdgeLength:()I
        //   199: bipush          16
        //   201: ishr           
        //   202: isub           
        //   203: i2c            
        //   204: bipush          38
        //   206: invokestatic    android/view/ViewConfiguration.getGlobalActionKeyTimeout:()J
        //   209: lconst_0       
        //   210: lcmp           
        //   211: isub           
        //   212: lconst_0       
        //   213: invokestatic    android/widget/ExpandableListView.getPackedPositionType:(J)I
        //   216: bipush          74
        //   218: iadd           
        //   219: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //   222: checkcast       Ljava/lang/Class;
        //   225: ldc_w           "AFInAppEventType"
        //   228: iconst_1       
        //   229: anewarray       Ljava/lang/Class;
        //   232: dup            
        //   233: iconst_0       
        //   234: ldc             Ljava/util/Map;.class
        //   236: aastore        
        //   237: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   240: aconst_null    
        //   241: iconst_1       
        //   242: anewarray       Ljava/lang/Object;
        //   245: dup            
        //   246: iconst_0       
        //   247: aload           9
        //   249: aastore        
        //   250: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   253: checkcast       Ljava/lang/String;
        //   256: astore          5
        //   258: aload           5
        //   260: ifnull          279
        //   263: aload           5
        //   265: ldc_w           "\\p{C}"
        //   268: ldc_w           "*Non-printing character*"
        //   271: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   274: astore          4
        //   276: goto            362
        //   279: new             Ljava/lang/NullPointerException;
        //   282: dup            
        //   283: ldc_w           "JSON toString of eventParams map returns null"
        //   286: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   289: athrow         
        //   290: astore          5
        //   292: aload           5
        //   294: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   297: astore          6
        //   299: aload           6
        //   301: ifnull          307
        //   304: aload           6
        //   306: athrow         
        //   307: aload           5
        //   309: athrow         
        //   310: ldc_w           "Unexpected error"
        //   313: aload           5
        //   315: iconst_1       
        //   316: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //   319: aload           4
        //   321: astore          5
        //   323: ldc_w           ""
        //   326: astore          4
        //   328: goto            362
        //   331: ldc_w           "AFFinalizer: reflection init failed"
        //   334: aload           5
        //   336: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   339: aload           4
        //   341: astore          5
        //   343: goto            323
        //   346: ldc_w           "AFJsonObject return null String object."
        //   349: aload           5
        //   351: iconst_1       
        //   352: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //   355: aload           4
        //   357: astore          5
        //   359: goto            323
        //   362: aload           5
        //   364: ifnonnull       374
        //   367: aload           7
        //   369: astore          5
        //   371: goto            374
        //   374: aload           4
        //   376: aload           5
        //   378: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   381: ifne            393
        //   384: ldc_w           "Payload contains non-printing characters"
        //   387: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
        //   390: goto            397
        //   393: aload           5
        //   395: astore          4
        //   397: new             Ljava/lang/StringBuilder;
        //   400: dup            
        //   401: invokespecial   java/lang/StringBuilder.<init>:()V
        //   404: astore          5
        //   406: aload           5
        //   408: aload_0        
        //   409: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   412: pop            
        //   413: aload           5
        //   415: ldc_w           ": preparing data: "
        //   418: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   421: pop            
        //   422: aload           5
        //   424: aload           4
        //   426: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   429: pop            
        //   430: aload           5
        //   432: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   435: invokestatic    com/appsflyer/internal/AFa1aSDK.values:(Ljava/lang/String;)V
        //   438: aload_0        
        //   439: getfield        com/appsflyer/internal/AFd1oSDK.afRDLog:Lcom/appsflyer/internal/AFb1tSDK;
        //   442: aload           8
        //   444: aload           4
        //   446: invokeinterface com/appsflyer/internal/AFb1tSDK.valueOf:(Ljava/lang/String;Ljava/lang/String;)V
        //   451: aload_0        
        //   452: getfield        com/appsflyer/internal/AFd1oSDK.AFLogger:Lcom/appsflyer/internal/AFc1oSDK;
        //   455: aload_0        
        //   456: getfield        com/appsflyer/internal/AFd1hSDK.afInfoLog:Lcom/appsflyer/internal/AFa1qSDK;
        //   459: aload_1        
        //   460: aload_0        
        //   461: getfield        com/appsflyer/internal/AFd1hSDK.afWarnLog:Lcom/appsflyer/internal/AFb1bSDK;
        //   464: invokevirtual   com/appsflyer/internal/AFc1oSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFa1qSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFb1bSDK;)Lcom/appsflyer/internal/AFc1qSDK;
        //   467: areturn        
        //   468: astore          4
        //   470: goto            53
        //   473: astore          6
        //   475: aload           5
        //   477: astore          4
        //   479: aload           6
        //   481: astore          5
        //   483: goto            159
        //   486: astore          6
        //   488: aload           5
        //   490: astore          4
        //   492: goto            184
        //   495: astore          6
        //   497: aload           5
        //   499: astore          4
        //   501: aload           6
        //   503: astore          5
        //   505: goto            310
        //   508: astore          6
        //   510: aload           5
        //   512: astore          4
        //   514: aload           6
        //   516: astore          5
        //   518: goto            331
        //   521: astore          6
        //   523: aload           5
        //   525: astore          4
        //   527: aload           6
        //   529: astore          5
        //   531: goto            346
        //   534: astore          5
        //   536: goto            310
        //   539: astore          5
        //   541: goto            331
        //   544: astore          5
        //   546: goto            346
        //    Signature:
        //  (Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  30     50     468    55     Ljava/lang/NullPointerException;
        //  100    114    151    159    Ljava/lang/NullPointerException;
        //  100    114    146    151    Any
        //  119    132    486    495    Ljava/lang/NullPointerException;
        //  119    132    473    486    Any
        //  135    146    486    495    Ljava/lang/NullPointerException;
        //  135    146    473    486    Any
        //  193    258    290    549    Any
        //  263    276    521    534    Ljava/lang/NullPointerException;
        //  263    276    508    521    Ljava/lang/Exception;
        //  263    276    495    508    Any
        //  279    290    521    534    Ljava/lang/NullPointerException;
        //  279    290    508    521    Ljava/lang/Exception;
        //  279    290    495    508    Any
        //  292    299    544    549    Ljava/lang/NullPointerException;
        //  292    299    539    544    Ljava/lang/Exception;
        //  292    299    534    539    Any
        //  304    307    544    549    Ljava/lang/NullPointerException;
        //  304    307    539    544    Ljava/lang/Exception;
        //  304    307    534    539    Any
        //  307    310    544    549    Ljava/lang/NullPointerException;
        //  307    310    539    544    Ljava/lang/Exception;
        //  307    310    534    539    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 246 out of bounds for length 246
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
