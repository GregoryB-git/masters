// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.jvm.internal.x;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import com.appsflyer.AFLogger;
import android.view.KeyEvent;
import android.media.AudioTrack;
import java.nio.charset.Charset;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerLib;
import java.util.UUID;
import java.util.Collections;
import androidx.annotation.NonNull;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Color;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import com.appsflyer.AppsFlyerProperties;

public final class AFc1oSDK
{
    public static String AFInAppEventParameterName;
    private static int afDebugLog = 0;
    private static long afErrorLog = 0L;
    private static int afRDLog = 1;
    private static String valueOf;
    private static String values;
    private final AFc1nSDK AFInAppEventType;
    private final AFb1gSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    private final AFc1dSDK afInfoLog;
    
    static {
        AFKeystoreWrapper();
        AFc1oSDK.values = "https://%smonitorsdk.%s/remote-debug?app_id=";
        AFc1oSDK.AFInAppEventParameterName = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFc1oSDK.valueOf = "https://%sonelink.%s/shortlink-sdk/v2";
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 125) % 128;
    }
    
    public AFc1oSDK(final AFc1nSDK afInAppEventType, final AFb1gSDK afKeystoreWrapper, final AppsFlyerProperties afLogger, final AFc1dSDK afInfoLog) {
        this.AFInAppEventType = afInAppEventType;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFLogger = afLogger;
        this.afInfoLog = afInfoLog;
    }
    
    private Map<String, Object> AFInAppEventType() {
        final HashMap<String, String> hashMap = (HashMap<String, String>)new HashMap<String, Integer>();
        hashMap.put("build_number", (Integer)"6.12.2");
        hashMap.put("counter", Integer.valueOf(this.AFKeystoreWrapper.AFInAppEventType.values("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        final int red = Color.red(0);
        final Object[] array = { null };
        values("\uc28c\uc2ee\u35bd\uf676\u9ee9\u44cb\u19fa\u0f8e\ucc0c", red + 1, array);
        hashMap.put(((String)array[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build$VERSION.SDK_INT));
        final Context afInAppEventType = this.AFKeystoreWrapper.valueOf.AFInAppEventType;
        hashMap.put("app_version_name", AFa1fSDK.AFKeystoreWrapper(afInAppEventType, afInAppEventType.getPackageName()));
        hashMap.put("app_id", this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
        hashMap.put("platformextension", new AFb1xSDK().AFInAppEventParameterName());
        AFc1oSDK.afDebugLog = (AFc1oSDK.afRDLog + 17) % 128;
        return (Map<String, Object>)hashMap;
    }
    
    private static String AFKeystoreWrapper(String value, final String str, final String... a) {
        final ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
        list.add(1, "v2");
        final String join = TextUtils.join((CharSequence)"\u2063", (Object[])list.toArray(new String[0]));
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(str);
        sb.append("v2");
        value = AFc1nSDK.valueOf(join, sb.toString());
        AFc1oSDK.afDebugLog = (AFc1oSDK.afRDLog + 67) % 128;
        return value;
    }
    
    public static void AFKeystoreWrapper() {
        AFc1oSDK.afErrorLog = -7639686596028283975L;
    }
    
    private <T> AFc1qSDK<T> valueOf(final AFa1aSDK aFa1aSDK, final AFc1hSDK<T> aFc1hSDK) {
        final int n = AFc1oSDK.afDebugLog + 49;
        AFc1oSDK.afRDLog = n % 128;
        AFc1qSDK<T> aFc1qSDK;
        if (n % 2 == 0) {
            aFc1qSDK = this.valueOf(aFa1aSDK, aFc1hSDK, this.valueOf());
        }
        else {
            aFc1qSDK = this.valueOf(aFa1aSDK, aFc1hSDK, this.valueOf());
        }
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 111) % 128;
        return aFc1qSDK;
    }
    
    private <T> AFc1qSDK<T> valueOf(final AFa1aSDK aFa1aSDK, final AFc1hSDK<T> aFc1hSDK, final boolean values) {
        aFa1aSDK.values = values;
        final AFc1nSDK afInAppEventType = this.AFInAppEventType;
        final AFc1qSDK aFc1qSDK = new AFc1qSDK<T>(aFa1aSDK, afInAppEventType.valueOf, afInAppEventType.AFKeystoreWrapper, aFc1hSDK);
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 111) % 128;
        return (AFc1qSDK<T>)aFc1qSDK;
    }
    
    private boolean valueOf() {
        AFc1oSDK.afDebugLog = (AFc1oSDK.afRDLog + 7) % 128;
        if (this.AFLogger.getBoolean("http_cache", true) ^ true) {
            AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 37) % 128;
            return true;
        }
        return false;
    }
    
    private static void values(String afInAppEventParameterName, int n, final Object[] array) {
        Object charArray = afInAppEventParameterName;
        if (afInAppEventParameterName != null) {
            charArray = afInAppEventParameterName.toCharArray();
        }
        final char[] array2 = (char[])charArray;
        afInAppEventParameterName = (String)AFg1rSDK.AFInAppEventParameterName;
        // monitorenter(afInAppEventParameterName)
        while (true) {
            try {
                final char[] afInAppEventType = AFg1rSDK.AFInAppEventType(AFc1oSDK.afErrorLog, array2, n);
                AFg1rSDK.AFInAppEventType = 4;
                while (true) {
                    n = AFg1rSDK.AFInAppEventType;
                    if (n >= afInAppEventType.length) {
                        break;
                    }
                    AFg1rSDK.AFKeystoreWrapper = n - 4;
                    n = AFg1rSDK.AFInAppEventType;
                    afInAppEventType[n] = (char)((long)(afInAppEventType[n] ^ afInAppEventType[n % 4]) ^ AFg1rSDK.AFKeystoreWrapper * AFc1oSDK.afErrorLog);
                    ++AFg1rSDK.AFInAppEventType;
                }
                final String s = new String(afInAppEventType, 4, afInAppEventType.length - 4);
                // monitorexit(afInAppEventParameterName)
                array[0] = s;
                return;
                // monitorexit(afInAppEventParameterName)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final AFc1qSDK<String> AFInAppEventParameterName(@NonNull final String s) {
        final AFa1aSDK aFa1aSDK = new AFa1aSDK(s, null, "GET", Collections.emptyMap(), false);
        aFa1aSDK.afDebugLog = 10000;
        aFa1aSDK.AFInAppEventType = false;
        final AFc1qSDK<String> value = this.valueOf(aFa1aSDK, (AFc1hSDK<String>)new AFc1iSDK());
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 53) % 128;
        return value;
    }
    
    public final AFc1qSDK<String> AFInAppEventParameterName(final Map<String, Object> p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          109
        //     5: iadd           
        //     6: istore          4
        //     8: iload           4
        //    10: sipush          128
        //    13: irem           
        //    14: putstatic       com/appsflyer/internal/AFc1oSDK.afDebugLog:I
        //    17: iload           4
        //    19: iconst_2       
        //    20: irem           
        //    21: ifne            375
        //    24: sipush          12254
        //    27: iconst_0       
        //    28: iconst_0       
        //    29: iconst_0       
        //    30: invokestatic    android/view/View.resolveSizeAndState:(III)I
        //    33: isub           
        //    34: i2c            
        //    35: iconst_0       
        //    36: iconst_0       
        //    37: invokestatic    android/widget/ExpandableListView.getPackedPositionForChild:(II)J
        //    40: lconst_0       
        //    41: lcmp           
        //    42: bipush          38
        //    44: iadd           
        //    45: invokestatic    android/view/ViewConfiguration.getPressedStateDuration:()I
        //    48: bipush          16
        //    50: ishr           
        //    51: bipush          74
        //    53: iadd           
        //    54: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //    57: checkcast       Ljava/lang/Class;
        //    60: ldc_w           "values"
        //    63: iconst_2       
        //    64: anewarray       Ljava/lang/Class;
        //    67: dup            
        //    68: iconst_0       
        //    69: ldc             Ljava/util/Map;.class
        //    71: aastore        
        //    72: dup            
        //    73: iconst_1       
        //    74: ldc             Ljava/lang/String;.class
        //    76: aastore        
        //    77: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    80: aconst_null    
        //    81: iconst_2       
        //    82: anewarray       Ljava/lang/Object;
        //    85: dup            
        //    86: iconst_0       
        //    87: aload_1        
        //    88: aastore        
        //    89: dup            
        //    90: iconst_1       
        //    91: aload_2        
        //    92: aastore        
        //    93: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    96: checkcast       [B
        //    99: astore          5
        //   101: new             Lcom/appsflyer/internal/AFf1fSDK;
        //   104: dup            
        //   105: aload_0        
        //   106: getfield        com/appsflyer/internal/AFc1oSDK.AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;
        //   109: invokespecial   com/appsflyer/internal/AFf1fSDK.<init>:(Lcom/appsflyer/internal/AFb1gSDK;)V
        //   112: astore          6
        //   114: aload_3        
        //   115: ifnull          238
        //   118: aload_3        
        //   119: invokeinterface java/lang/CharSequence.length:()I
        //   124: ifne            130
        //   127: goto            238
        //   130: new             Lkotlin/text/Regex;
        //   133: dup            
        //   134: ldc_w           "4.?(\\d+)?.?(\\d+)"
        //   137: invokespecial   kotlin/text/Regex.<init>:(Ljava/lang/String;)V
        //   140: aload_3        
        //   141: invokevirtual   kotlin/text/Regex.b:(Ljava/lang/CharSequence;)Z
        //   144: ifne            238
        //   147: new             Lkotlin/text/Regex;
        //   150: dup            
        //   151: ldc_w           "3.?(\\d+)?.?(\\d+)"
        //   154: invokespecial   kotlin/text/Regex.<init>:(Ljava/lang/String;)V
        //   157: aload_3        
        //   158: invokevirtual   kotlin/text/Regex.b:(Ljava/lang/CharSequence;)Z
        //   161: ifeq            167
        //   164: goto            238
        //   167: getstatic       com/appsflyer/internal/AFf1fSDK.onAttributionFailureNative:Ljava/lang/String;
        //   170: astore_2       
        //   171: aload_2        
        //   172: astore_1       
        //   173: aload_2        
        //   174: ifnonnull       285
        //   177: getstatic       com/appsflyer/internal/AFc1oSDK.afRDLog:I
        //   180: bipush          31
        //   182: iadd           
        //   183: istore          4
        //   185: iload           4
        //   187: sipush          128
        //   190: irem           
        //   191: putstatic       com/appsflyer/internal/AFc1oSDK.afDebugLog:I
        //   194: iload           4
        //   196: iconst_2       
        //   197: irem           
        //   198: ifne            222
        //   201: aload           6
        //   203: getfield        com/appsflyer/internal/AFf1fSDK.AFInAppEventType:Lcom/appsflyer/internal/AFf1eSDK;
        //   206: astore_1       
        //   207: getstatic       com/appsflyer/internal/AFf1fSDK.AFVersionDeclaration:Ljava/lang/String;
        //   210: astore_2       
        //   211: aload_1        
        //   212: aload_2        
        //   213: invokeinterface com/appsflyer/internal/AFf1eSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   218: astore_1       
        //   219: goto            285
        //   222: aload           6
        //   224: getfield        com/appsflyer/internal/AFf1fSDK.AFInAppEventType:Lcom/appsflyer/internal/AFf1eSDK;
        //   227: getstatic       com/appsflyer/internal/AFf1fSDK.AFVersionDeclaration:Ljava/lang/String;
        //   230: invokeinterface com/appsflyer/internal/AFf1eSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   235: pop            
        //   236: aconst_null    
        //   237: athrow         
        //   238: getstatic       com/appsflyer/internal/AFc1oSDK.afRDLog:I
        //   241: bipush          7
        //   243: iadd           
        //   244: istore          4
        //   246: iload           4
        //   248: sipush          128
        //   251: irem           
        //   252: putstatic       com/appsflyer/internal/AFc1oSDK.afDebugLog:I
        //   255: iload           4
        //   257: iconst_2       
        //   258: irem           
        //   259: ifne            355
        //   262: getstatic       com/appsflyer/internal/AFf1fSDK.init:Ljava/lang/String;
        //   265: astore_2       
        //   266: aload_2        
        //   267: astore_1       
        //   268: aload_2        
        //   269: ifnonnull       285
        //   272: aload           6
        //   274: getfield        com/appsflyer/internal/AFf1fSDK.AFInAppEventType:Lcom/appsflyer/internal/AFf1eSDK;
        //   277: astore_1       
        //   278: getstatic       com/appsflyer/internal/AFf1fSDK.afInfoLog:Ljava/lang/String;
        //   281: astore_2       
        //   282: goto            211
        //   285: new             Ljava/lang/StringBuilder;
        //   288: dup            
        //   289: invokespecial   java/lang/StringBuilder.<init>:()V
        //   292: astore_2       
        //   293: aload_2        
        //   294: aload_1        
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: pop            
        //   299: aload_2        
        //   300: aload           6
        //   302: getfield        com/appsflyer/internal/AFf1fSDK.values:Lcom/appsflyer/internal/AFb1gSDK;
        //   305: getfield        com/appsflyer/internal/AFb1gSDK.valueOf:Lcom/appsflyer/internal/AFb1bSDK;
        //   308: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //   311: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: pop            
        //   318: aload_0        
        //   319: new             Lcom/appsflyer/internal/AFa1aSDK;
        //   322: dup            
        //   323: aload           6
        //   325: aload_2        
        //   326: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   329: invokevirtual   com/appsflyer/internal/AFf1fSDK.AFInAppEventParameterName:(Ljava/lang/String;)Ljava/lang/String;
        //   332: aload           5
        //   334: ldc_w           "POST"
        //   337: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   340: iconst_1       
        //   341: invokespecial   com/appsflyer/internal/AFa1aSDK.<init>:(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V
        //   344: new             Lcom/appsflyer/internal/AFc1iSDK;
        //   347: dup            
        //   348: invokespecial   com/appsflyer/internal/AFc1iSDK.<init>:()V
        //   351: invokespecial   com/appsflyer/internal/AFc1oSDK.valueOf:(Lcom/appsflyer/internal/AFa1aSDK;Lcom/appsflyer/internal/AFc1hSDK;)Lcom/appsflyer/internal/AFc1qSDK;
        //   354: areturn        
        //   355: getstatic       com/appsflyer/internal/AFf1fSDK.AFKeystoreWrapper:Ljava/lang/String;
        //   358: astore_1       
        //   359: aconst_null    
        //   360: athrow         
        //   361: astore_1       
        //   362: aload_1        
        //   363: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   366: astore_2       
        //   367: aload_2        
        //   368: ifnull          373
        //   371: aload_2        
        //   372: athrow         
        //   373: aload_1        
        //   374: athrow         
        //   375: invokestatic    android/view/ViewConfiguration.getJumpTapTimeout:()I
        //   378: bipush          16
        //   380: ishr           
        //   381: sipush          12254
        //   384: iadd           
        //   385: i2c            
        //   386: bipush          37
        //   388: invokestatic    android/view/ViewConfiguration.getTapTimeout:()I
        //   391: bipush          16
        //   393: ishr           
        //   394: isub           
        //   395: bipush          74
        //   397: ldc_w           ""
        //   400: ldc_w           ""
        //   403: invokestatic    android/text/TextUtils.indexOf:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
        //   406: isub           
        //   407: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //   410: checkcast       Ljava/lang/Class;
        //   413: ldc_w           "values"
        //   416: iconst_2       
        //   417: anewarray       Ljava/lang/Class;
        //   420: dup            
        //   421: iconst_0       
        //   422: ldc             Ljava/util/Map;.class
        //   424: aastore        
        //   425: dup            
        //   426: iconst_1       
        //   427: ldc             Ljava/lang/String;.class
        //   429: aastore        
        //   430: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   433: aconst_null    
        //   434: iconst_2       
        //   435: anewarray       Ljava/lang/Object;
        //   438: dup            
        //   439: iconst_0       
        //   440: aload_1        
        //   441: aastore        
        //   442: dup            
        //   443: iconst_1       
        //   444: aload_2        
        //   445: aastore        
        //   446: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   449: checkcast       [B
        //   452: astore_1       
        //   453: aconst_null    
        //   454: athrow         
        //   455: astore_1       
        //   456: aload_1        
        //   457: athrow         
        //   458: astore_1       
        //   459: aload_1        
        //   460: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   463: astore_2       
        //   464: aload_2        
        //   465: ifnull          470
        //   468: aload_2        
        //   469: athrow         
        //   470: aload_1        
        //   471: athrow         
        //   472: ldc_w           "AFFinalizer: reflection init failed"
        //   475: aload_1        
        //   476: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   479: aconst_null    
        //   480: areturn        
        //   481: astore_1       
        //   482: goto            472
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  24     101    361    375    Any
        //  362    367    481    485    Ljava/lang/Exception;
        //  371    373    481    485    Ljava/lang/Exception;
        //  373    375    481    485    Ljava/lang/Exception;
        //  375    453    458    472    Any
        //  453    455    481    485    Ljava/lang/Exception;
        //  453    455    455    458    Any
        //  459    464    481    485    Ljava/lang/Exception;
        //  468    470    481    485    Ljava/lang/Exception;
        //  470    472    481    485    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0373:
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
    
    public final AFc1qSDK<Map<String, String>> AFInAppEventType(@NonNull final String str, @NonNull final String str2, @NonNull final UUID uuid, @NonNull final String s) {
        final String string = uuid.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFc1oSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        final String string2 = sb.toString();
        final Map<String, Object> afInAppEventType = this.AFInAppEventType();
        final String value = String.valueOf(afInAppEventType.get("build_number"));
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", value);
        hashMap.put("Af-Meta-Counter", String.valueOf(afInAppEventType.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(afInAppEventType.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(afInAppEventType.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(afInAppEventType.get("sdk")));
        final int touchSlop = ViewConfiguration.getTouchSlop();
        final Object[] array = { null };
        values("\uc2ca\uc28b\u8bed\u4832\ub599\u5ef7\u32c6\u158f\ucc47\u9ac8\u23a1\u0499\udf76\ua9c6\u10d1\u3661", (touchSlop >> 8) + 1, array);
        hashMap.put(((String)array[0]).intern(), AFKeystoreWrapper(s, string, "GET", string, str, str2, value));
        final AFc1qSDK<Map<String, String>> value2 = this.valueOf(new AFa1aSDK(string2, null, "GET", hashMap, false), (AFc1hSDK<Map<String, String>>)new AFc1mSDK());
        final int n = AFc1oSDK.afRDLog + 75;
        AFc1oSDK.afDebugLog = n % 128;
        if (n % 2 == 0) {
            return value2;
        }
        throw null;
    }
    
    public final AFc1qSDK<String> AFInAppEventType(@NonNull final String str, @NonNull final Map<String, String> map, final String s, @NonNull final UUID uuid, @NonNull final String s2) {
        final String string = uuid.toString();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", string);
        hashMap.put("data", (String)map);
        hashMap.put("meta", (String)this.AFInAppEventType());
        if (s != null) {
            AFc1oSDK.afDebugLog = (AFc1oSDK.afRDLog + 89) % 128;
            hashMap.put("brand_domain", s);
        }
        final String string2 = AFa1rSDK.AFInAppEventType(hashMap).toString();
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        final int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
        final Object[] array = { null };
        values("\uc2ca\uc28b\u8bed\u4832\ub599\u5ef7\u32c6\u158f\ucc47\u9ac8\u23a1\u0499\udf76\ua9c6\u10d1\u3661", (maximumFlingVelocity >> 16) + 1, array);
        hashMap2.put(((String)array[0]).intern(), AFKeystoreWrapper(s2, string, "POST", string2));
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFc1oSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append("/");
        sb.append(str);
        final AFc1qSDK<String> value = this.valueOf(new AFa1aSDK(sb.toString(), string2.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFc1hSDK<String>)new AFc1iSDK(), true);
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 7) % 128;
        return value;
    }
    
    public final AFc1qSDK<String> AFKeystoreWrapper(final AFa1qSDK aFa1qSDK, final String s, final AFb1bSDK aFb1bSDK) {
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 67) % 128;
        try {
            final AFc1qSDK<String> value = this.valueOf(new AFa1aSDK(aFa1qSDK.afRDLog, (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - fcmpl(AudioTrack.getMinVolume(), 0.0f)), 37 - (KeyEvent.getMaxKeyCode() >> 16), 74 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("AFKeystoreWrapper", AFa1qSDK.class, String.class, AFb1bSDK.class).invoke(null, aFa1qSDK, s, aFb1bSDK), "POST", Collections.emptyMap(), aFa1qSDK.values()), (AFc1hSDK<String>)new AFc1iSDK());
            AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 125) % 128;
            return value;
        }
        finally {
            EndFinally_0: {
                try {
                    final Throwable t;
                    final Throwable cause = t.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    break EndFinally_0;
                    final Exception ex;
                    com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", ex);
                    return null;
                }
                catch (Exception ex) {}
            }
        }
    }
    
    @NonNull
    public final AFc1qSDK<String> valueOf(final Map<String, Object> map) {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFc1oSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append(this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
        final AFc1qSDK<String> value = this.valueOf(new AFa1aSDK(sb.toString(), new JSONObject((Map)map).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), false, false), (AFc1hSDK<String>)new AFc1iSDK());
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 49) % 128;
        return value;
    }
    
    public final AFc1qSDK<String> values(final AFe1fSDK aFe1fSDK) {
        final AFc1qSDK<String> value = this.valueOf(new AFa1aSDK(aFe1fSDK.afRDLog, aFe1fSDK.AFKeystoreWrapper(), "POST", Collections.emptyMap(), true), (AFc1hSDK<String>)new AFc1iSDK());
        AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 83) % 128;
        return value;
    }
    
    public final AFc1qSDK<Map<String, Object>> values(final String s, final String s2) {
        final String packageName = this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName();
        final AFb1gSDK afKeystoreWrapper = this.AFKeystoreWrapper;
        final AFc1qSDK<Map<String, Object>> value = this.valueOf(AFc1pSDK.AFInAppEventParameterName(packageName, AFb1zSDK.valueOf(afKeystoreWrapper.valueOf, afKeystoreWrapper.AFInAppEventType), s, s2), (AFc1hSDK<Map<String, Object>>)new AFc1rSDK());
        final int n = AFc1oSDK.afDebugLog + 55;
        AFc1oSDK.afRDLog = n % 128;
        if (n % 2 == 0) {}
        return value;
    }
    
    public final AFc1qSDK<String> values(final Map<String, Object> p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          83
        //     5: iadd           
        //     6: istore          4
        //     8: iload           4
        //    10: sipush          128
        //    13: irem           
        //    14: putstatic       com/appsflyer/internal/AFc1oSDK.afDebugLog:I
        //    17: iload           4
        //    19: iconst_2       
        //    20: irem           
        //    21: ifne            356
        //    24: sipush          12254
        //    27: ldc_w           ""
        //    30: iconst_0       
        //    31: invokestatic    android/text/TextUtils.getOffsetBefore:(Ljava/lang/CharSequence;I)I
        //    34: isub           
        //    35: i2c            
        //    36: bipush          37
        //    38: iconst_0       
        //    39: invokestatic    android/graphics/Color.blue:(I)I
        //    42: isub           
        //    43: bipush          74
        //    45: invokestatic    android/view/ViewConfiguration.getKeyRepeatTimeout:()I
        //    48: bipush          16
        //    50: ishr           
        //    51: isub           
        //    52: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Class;
        //    58: ldc_w           "values"
        //    61: iconst_2       
        //    62: anewarray       Ljava/lang/Class;
        //    65: dup            
        //    66: iconst_0       
        //    67: ldc             Ljava/util/Map;.class
        //    69: aastore        
        //    70: dup            
        //    71: iconst_1       
        //    72: ldc             Ljava/lang/String;.class
        //    74: aastore        
        //    75: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    78: aconst_null    
        //    79: iconst_2       
        //    80: anewarray       Ljava/lang/Object;
        //    83: dup            
        //    84: iconst_0       
        //    85: aload_1        
        //    86: aastore        
        //    87: dup            
        //    88: iconst_1       
        //    89: aload_2        
        //    90: aastore        
        //    91: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    94: checkcast       [B
        //    97: astore          5
        //    99: new             Lcom/appsflyer/internal/AFf1fSDK;
        //   102: dup            
        //   103: aload_0        
        //   104: getfield        com/appsflyer/internal/AFc1oSDK.AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;
        //   107: invokespecial   com/appsflyer/internal/AFf1fSDK.<init>:(Lcom/appsflyer/internal/AFb1gSDK;)V
        //   110: astore          6
        //   112: aload_3        
        //   113: ifnull          249
        //   116: aload_3        
        //   117: invokeinterface java/lang/CharSequence.length:()I
        //   122: ifne            128
        //   125: goto            249
        //   128: new             Lkotlin/text/Regex;
        //   131: dup            
        //   132: ldc_w           "4.?(\\d+)?.?(\\d+)"
        //   135: invokespecial   kotlin/text/Regex.<init>:(Ljava/lang/String;)V
        //   138: aload_3        
        //   139: invokevirtual   kotlin/text/Regex.b:(Ljava/lang/CharSequence;)Z
        //   142: ifne            249
        //   145: new             Lkotlin/text/Regex;
        //   148: dup            
        //   149: ldc_w           "3.?(\\d+)?.?(\\d+)"
        //   152: invokespecial   kotlin/text/Regex.<init>:(Ljava/lang/String;)V
        //   155: aload_3        
        //   156: invokevirtual   kotlin/text/Regex.b:(Ljava/lang/CharSequence;)Z
        //   159: ifeq            165
        //   162: goto            249
        //   165: getstatic       com/appsflyer/internal/AFc1oSDK.afDebugLog:I
        //   168: bipush          85
        //   170: iadd           
        //   171: sipush          128
        //   174: irem           
        //   175: putstatic       com/appsflyer/internal/AFc1oSDK.afRDLog:I
        //   178: getstatic       com/appsflyer/internal/AFf1fSDK.onResponseNative:Ljava/lang/String;
        //   181: astore_2       
        //   182: aload_2        
        //   183: astore_1       
        //   184: aload_2        
        //   185: ifnonnull       272
        //   188: getstatic       com/appsflyer/internal/AFc1oSDK.afRDLog:I
        //   191: bipush          27
        //   193: iadd           
        //   194: istore          4
        //   196: iload           4
        //   198: sipush          128
        //   201: irem           
        //   202: putstatic       com/appsflyer/internal/AFc1oSDK.afDebugLog:I
        //   205: iload           4
        //   207: iconst_2       
        //   208: irem           
        //   209: ifne            233
        //   212: aload           6
        //   214: getfield        com/appsflyer/internal/AFf1fSDK.AFInAppEventType:Lcom/appsflyer/internal/AFf1eSDK;
        //   217: astore_1       
        //   218: getstatic       com/appsflyer/internal/AFf1fSDK.AFLogger$LogLevel:Ljava/lang/String;
        //   221: astore_2       
        //   222: aload_1        
        //   223: aload_2        
        //   224: invokeinterface com/appsflyer/internal/AFf1eSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   229: astore_1       
        //   230: goto            272
        //   233: aload           6
        //   235: getfield        com/appsflyer/internal/AFf1fSDK.AFInAppEventType:Lcom/appsflyer/internal/AFf1eSDK;
        //   238: getstatic       com/appsflyer/internal/AFf1fSDK.AFLogger$LogLevel:Ljava/lang/String;
        //   241: invokeinterface com/appsflyer/internal/AFf1eSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   246: pop            
        //   247: aconst_null    
        //   248: athrow         
        //   249: getstatic       com/appsflyer/internal/AFf1fSDK.onInstallConversionFailureNative:Ljava/lang/String;
        //   252: astore_2       
        //   253: aload_2        
        //   254: astore_1       
        //   255: aload_2        
        //   256: ifnonnull       272
        //   259: aload           6
        //   261: getfield        com/appsflyer/internal/AFf1fSDK.AFInAppEventType:Lcom/appsflyer/internal/AFf1eSDK;
        //   264: astore_1       
        //   265: getstatic       com/appsflyer/internal/AFf1fSDK.afDebugLog:Ljava/lang/String;
        //   268: astore_2       
        //   269: goto            222
        //   272: new             Ljava/lang/StringBuilder;
        //   275: dup            
        //   276: invokespecial   java/lang/StringBuilder.<init>:()V
        //   279: astore_2       
        //   280: aload_2        
        //   281: aload_1        
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: pop            
        //   286: aload_2        
        //   287: aload           6
        //   289: getfield        com/appsflyer/internal/AFf1fSDK.values:Lcom/appsflyer/internal/AFb1gSDK;
        //   292: getfield        com/appsflyer/internal/AFb1gSDK.valueOf:Lcom/appsflyer/internal/AFb1bSDK;
        //   295: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //   298: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: pop            
        //   305: aload_0        
        //   306: new             Lcom/appsflyer/internal/AFa1aSDK;
        //   309: dup            
        //   310: aload           6
        //   312: aload_2        
        //   313: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   316: invokevirtual   com/appsflyer/internal/AFf1fSDK.AFInAppEventParameterName:(Ljava/lang/String;)Ljava/lang/String;
        //   319: aload           5
        //   321: ldc_w           "POST"
        //   324: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   327: iconst_1       
        //   328: invokespecial   com/appsflyer/internal/AFa1aSDK.<init>:(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V
        //   331: new             Lcom/appsflyer/internal/AFc1iSDK;
        //   334: dup            
        //   335: invokespecial   com/appsflyer/internal/AFc1iSDK.<init>:()V
        //   338: invokespecial   com/appsflyer/internal/AFc1oSDK.valueOf:(Lcom/appsflyer/internal/AFa1aSDK;Lcom/appsflyer/internal/AFc1hSDK;)Lcom/appsflyer/internal/AFc1qSDK;
        //   341: areturn        
        //   342: astore_1       
        //   343: aload_1        
        //   344: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   347: astore_2       
        //   348: aload_2        
        //   349: ifnull          354
        //   352: aload_2        
        //   353: athrow         
        //   354: aload_1        
        //   355: athrow         
        //   356: sipush          12254
        //   359: ldc_w           ""
        //   362: invokestatic    android/text/TextUtils.getTrimmedLength:(Ljava/lang/CharSequence;)I
        //   365: isub           
        //   366: i2c            
        //   367: invokestatic    android/view/ViewConfiguration.getPressedStateDuration:()I
        //   370: bipush          16
        //   372: ishr           
        //   373: bipush          37
        //   375: iadd           
        //   376: ldc_w           ""
        //   379: ldc_w           ""
        //   382: iconst_0       
        //   383: invokestatic    android/text/TextUtils.indexOf:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
        //   386: bipush          74
        //   388: iadd           
        //   389: invokestatic    com/appsflyer/internal/AFa1vSDK.AFInAppEventParameterName:(CII)Ljava/lang/Object;
        //   392: checkcast       Ljava/lang/Class;
        //   395: ldc_w           "values"
        //   398: iconst_2       
        //   399: anewarray       Ljava/lang/Class;
        //   402: dup            
        //   403: iconst_0       
        //   404: ldc             Ljava/util/Map;.class
        //   406: aastore        
        //   407: dup            
        //   408: iconst_1       
        //   409: ldc             Ljava/lang/String;.class
        //   411: aastore        
        //   412: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   415: aconst_null    
        //   416: iconst_2       
        //   417: anewarray       Ljava/lang/Object;
        //   420: dup            
        //   421: iconst_0       
        //   422: aload_1        
        //   423: aastore        
        //   424: dup            
        //   425: iconst_1       
        //   426: aload_2        
        //   427: aastore        
        //   428: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   431: checkcast       [B
        //   434: astore_1       
        //   435: aconst_null    
        //   436: athrow         
        //   437: astore_1       
        //   438: aload_1        
        //   439: athrow         
        //   440: astore_1       
        //   441: aload_1        
        //   442: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   445: astore_2       
        //   446: aload_2        
        //   447: ifnull          452
        //   450: aload_2        
        //   451: athrow         
        //   452: aload_1        
        //   453: athrow         
        //   454: ldc_w           "AFFinalizer: reflection init failed"
        //   457: aload_1        
        //   458: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   461: aconst_null    
        //   462: areturn        
        //   463: astore_1       
        //   464: goto            454
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  24     99     342    356    Any
        //  343    348    463    467    Ljava/lang/Exception;
        //  352    354    463    467    Ljava/lang/Exception;
        //  354    356    463    467    Ljava/lang/Exception;
        //  356    435    440    454    Any
        //  435    437    463    467    Ljava/lang/Exception;
        //  435    437    437    440    Any
        //  441    446    463    467    Ljava/lang/Exception;
        //  450    452    463    467    Ljava/lang/Exception;
        //  452    454    463    467    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0354:
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
    
    @NonNull
    public final AFc1qSDK<AFe1qSDK> values(final boolean b, final boolean b2, @NonNull String format, final int n) {
        final AFc1dSDK afInfoLog = this.afInfoLog;
        Intrinsics.checkNotNullParameter(format, "");
        String format2;
        if (b) {
            format2 = AFc1dSDK.AFKeystoreWrapper;
            AFc1oSDK.afDebugLog = (AFc1oSDK.afRDLog + 81) % 128;
        }
        else {
            format2 = AFc1dSDK.AFInAppEventParameterName;
        }
        String s;
        if (b2 ^ true) {
            s = "";
        }
        else {
            s = "stg";
        }
        final x a = x.a;
        String s2;
        if (AFc1dSDK.AFInAppEventType()) {
            s2 = (String)afInfoLog.AFInAppEventType.getValue();
            AFc1oSDK.afDebugLog = (AFc1oSDK.afRDLog + 29) % 128;
        }
        else {
            s2 = "";
        }
        format = String.format(format2, Arrays.copyOf(new Object[] { s2, s, afInfoLog.AFInAppEventParameterName(), format }, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        final AFa1aSDK aFa1aSDK = new AFa1aSDK(format, "GET");
        aFa1aSDK.afDebugLog = 1500;
        return this.valueOf(aFa1aSDK, (AFc1hSDK<AFe1qSDK>)new AFc1jSDK());
    }
}
