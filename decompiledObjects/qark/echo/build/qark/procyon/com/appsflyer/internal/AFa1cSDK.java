// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Map;
import android.content.Context;
import android.provider.Settings$Secure;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import android.content.ContentResolver;
import com.appsflyer.AFLogger;
import java.util.Locale;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class AFa1cSDK
{
    static Boolean valueOf;
    static String values;
    public final String[] AFInAppEventType;
    
    public AFa1cSDK() {
    }
    
    public AFa1cSDK(final String... array) {
        if (array == null || array.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        final Pattern compile = Pattern.compile("[\\w]{1,45}");
        final ArrayList<String> list = new ArrayList<String>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final String s = array[i];
            if (s != null && compile.matcher(s).matches()) {
                list.add(s.toLowerCase(Locale.getDefault()));
            }
            else {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(s)));
            }
        }
        if (list.contains("all")) {
            this.AFInAppEventType = new String[] { "all" };
            return;
        }
        if (!list.isEmpty()) {
            this.AFInAppEventType = list.toArray(new String[0]);
            return;
        }
        this.AFInAppEventType = null;
    }
    
    public static AFc1uSDK.AFa1wSDK AFInAppEventParameterName(final ContentResolver contentResolver) {
        final boolean afInAppEventType = AFInAppEventType();
        final AFc1uSDK.AFa1wSDK aFa1wSDK = null;
        if (!afInAppEventType) {
            return null;
        }
        if (contentResolver == null) {
            return null;
        }
        AFc1uSDK.AFa1wSDK aFa1wSDK2 = aFa1wSDK;
        if (AppsFlyerProperties.getInstance().getString("amazon_aid") == null) {
            aFa1wSDK2 = aFa1wSDK;
            if ("Amazon".equals(Build.MANUFACTURER)) {
                final int int1 = Settings$Secure.getInt(contentResolver, "limit_ad_tracking", 2);
                if (int1 == 0) {
                    return new AFc1uSDK.AFa1wSDK(Settings$Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
                }
                if (int1 == 2) {
                    return null;
                }
                String s = null;
                try {
                    Settings$Secure.getString(contentResolver, "advertising_id");
                }
                finally {
                    final Throwable t;
                    AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", t);
                    s = "";
                }
                aFa1wSDK2 = new AFc1uSDK.AFa1wSDK(s, Boolean.TRUE);
            }
        }
        return aFa1wSDK2;
    }
    
    private static boolean AFInAppEventType() {
        final Boolean valueOf = AFa1cSDK.valueOf;
        return valueOf == null || valueOf;
    }
    
    public static AFc1uSDK.AFa1wSDK values(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: getstatic       com/appsflyer/internal/AFa1cSDK.values:Ljava/lang/String;
        //     7: astore_2       
        //     8: aload_2        
        //     9: ifnull          17
        //    12: iconst_1       
        //    13: istore_1       
        //    14: goto            19
        //    17: iconst_0       
        //    18: istore_1       
        //    19: iload_1        
        //    20: ifeq            30
        //    23: aload_2        
        //    24: astore_0       
        //    25: aconst_null    
        //    26: astore_2       
        //    27: goto            117
        //    30: getstatic       com/appsflyer/internal/AFa1cSDK.valueOf:Ljava/lang/Boolean;
        //    33: astore_2       
        //    34: aload_2        
        //    35: ifnull          45
        //    38: aload_2        
        //    39: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    42: ifne            61
        //    45: getstatic       com/appsflyer/internal/AFa1cSDK.valueOf:Ljava/lang/Boolean;
        //    48: ifnonnull       113
        //    51: aload_3        
        //    52: ldc             "collectOAID"
        //    54: iconst_1       
        //    55: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //    58: ifeq            113
        //    61: new             Lcom/appsflyer/oaid/OaidClient;
        //    64: dup            
        //    65: aload_0        
        //    66: invokespecial   com/appsflyer/oaid/OaidClient.<init>:(Landroid/content/Context;)V
        //    69: astore_0       
        //    70: aload_0        
        //    71: aload_3        
        //    72: invokevirtual   com/appsflyer/AppsFlyerProperties.isEnableLog:()Z
        //    75: invokevirtual   com/appsflyer/oaid/OaidClient.setLogging:(Z)V
        //    78: aload_0        
        //    79: invokevirtual   com/appsflyer/oaid/OaidClient.fetch:()Lcom/appsflyer/oaid/OaidClient$Info;
        //    82: astore_2       
        //    83: aload_2        
        //    84: ifnull          113
        //    87: aload_2        
        //    88: invokevirtual   com/appsflyer/oaid/OaidClient$Info.getId:()Ljava/lang/String;
        //    91: astore_0       
        //    92: aload_2        
        //    93: invokevirtual   com/appsflyer/oaid/OaidClient$Info.getLat:()Ljava/lang/Boolean;
        //    96: astore_2       
        //    97: goto            117
        //   100: goto            105
        //   103: aconst_null    
        //   104: astore_0       
        //   105: ldc             "No OAID library"
        //   107: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //   110: goto            25
        //   113: aconst_null    
        //   114: astore_2       
        //   115: aload_2        
        //   116: astore_0       
        //   117: aload_0        
        //   118: ifnull          141
        //   121: new             Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
        //   124: dup            
        //   125: aload_0        
        //   126: aload_2        
        //   127: invokespecial   com/appsflyer/internal/AFc1uSDK$AFa1wSDK.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   130: astore_0       
        //   131: aload_0        
        //   132: iload_1        
        //   133: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   136: putfield        com/appsflyer/internal/AFc1uSDK$AFa1wSDK.values:Ljava/lang/Boolean;
        //   139: aload_0        
        //   140: areturn        
        //   141: aconst_null    
        //   142: areturn        
        //   143: astore_0       
        //   144: goto            103
        //   147: astore_2       
        //   148: goto            100
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  61     83     143    105    Any
        //  87     92     143    105    Any
        //  92     97     147    103    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    
    public static AFc1uSDK.AFa1wSDK values(final Context p0, final Map<String, Object> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aconst_null    
        //     5: astore          8
        //     7: aconst_null    
        //     8: astore          5
        //    10: iload_3        
        //    11: ifne            16
        //    14: aconst_null    
        //    15: areturn        
        //    16: ldc             "Trying to fetch GAID.."
        //    18: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //    21: new             Ljava/lang/StringBuilder;
        //    24: dup            
        //    25: invokespecial   java/lang/StringBuilder.<init>:()V
        //    28: astore          9
        //    30: invokestatic    x2/j.m:()Lx2/j;
        //    33: aload_0        
        //    34: invokevirtual   x2/j.g:(Landroid/content/Context;)I
        //    37: istore_2       
        //    38: goto            52
        //    41: astore          6
        //    43: ldc             "isGooglePlayServicesAvailable error"
        //    45: aload           6
        //    47: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    50: iconst_m1      
        //    51: istore_2       
        //    52: aload_0        
        //    53: invokestatic    s2/a.a:(Landroid/content/Context;)Ls2/a$a;
        //    56: astore          6
        //    58: aload           6
        //    60: ifnull          138
        //    63: aload           6
        //    65: invokevirtual   s2/a$a.a:()Ljava/lang/String;
        //    68: astore          7
        //    70: aload           6
        //    72: invokevirtual   s2/a$a.b:()Z
        //    75: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    78: astore          6
        //    80: aload           7
        //    82: ifnull          96
        //    85: aload           7
        //    87: invokevirtual   java/lang/String.length:()I
        //    90: ifne            104
        //    93: goto            96
        //    96: aload           9
        //    98: ldc             "emptyOrNull |"
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: iconst_1       
        //   105: istore_3       
        //   106: aload           6
        //   108: astore          5
        //   110: aload           7
        //   112: astore          6
        //   114: goto            399
        //   117: astore          5
        //   119: iconst_0       
        //   120: istore_3       
        //   121: aload           8
        //   123: astore          6
        //   125: goto            607
        //   128: astore          7
        //   130: iconst_0       
        //   131: istore_3       
        //   132: aconst_null    
        //   133: astore          6
        //   135: goto            156
        //   138: aload           9
        //   140: ldc             "gpsAdInfo-null |"
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: pop            
        //   146: new             Ljava/lang/IllegalStateException;
        //   149: dup            
        //   150: ldc             "GpsAdIndo is null"
        //   152: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   155: athrow         
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: ldc             "Google Play Services is missing "
        //   162: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   165: astore          8
        //   167: aload           8
        //   169: aload           7
        //   171: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: pop            
        //   178: aload           8
        //   180: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   183: aload           7
        //   185: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   188: aload           9
        //   190: aload           7
        //   192: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   195: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: pop            
        //   202: aload           9
        //   204: ldc_w           " |"
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   210: pop            
        //   211: ldc_w           "WARNING: Google Play Services is missing."
        //   214: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   217: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   220: ldc_w           "enableGpsFallback"
        //   223: iconst_1       
        //   224: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //   227: ifeq            387
        //   230: aload_0        
        //   231: invokestatic    com/appsflyer/internal/AFa1hSDK.AFInAppEventType:(Landroid/content/Context;)Lcom/appsflyer/internal/AFa1hSDK$AFa1ySDK;
        //   234: astore          5
        //   236: aload           5
        //   238: getfield        com/appsflyer/internal/AFa1hSDK$AFa1ySDK.valueOf:Ljava/lang/String;
        //   241: astore          6
        //   243: aload           5
        //   245: invokevirtual   com/appsflyer/internal/AFa1hSDK$AFa1ySDK.AFInAppEventType:()Z
        //   248: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   251: astore          5
        //   253: aload           6
        //   255: ifnull          269
        //   258: aload           6
        //   260: invokevirtual   java/lang/String.length:()I
        //   263: ifne            278
        //   266: goto            269
        //   269: aload           9
        //   271: ldc_w           "emptyOrNull (bypass) |"
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: pop            
        //   278: goto            399
        //   281: aload           5
        //   283: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   286: aload           5
        //   288: iconst_1       
        //   289: iconst_0       
        //   290: iconst_0       
        //   291: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
        //   294: aload           9
        //   296: aload           5
        //   298: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   301: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: pop            
        //   308: aload           9
        //   310: ldc_w           " |"
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: pop            
        //   317: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   320: ldc_w           "advertiserId"
        //   323: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   326: astore          6
        //   328: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   331: ldc_w           "advertiserIdEnabled"
        //   334: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   337: invokestatic    java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        //   340: istore          4
        //   342: aload           5
        //   344: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //   347: ifnull          365
        //   350: aload           5
        //   352: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //   355: astore          5
        //   357: aload           5
        //   359: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   362: goto            375
        //   365: aload           5
        //   367: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   370: astore          5
        //   372: goto            357
        //   375: iload           4
        //   377: iconst_1       
        //   378: ixor           
        //   379: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   382: astore          5
        //   384: goto            399
        //   387: aload           6
        //   389: astore          7
        //   391: aload           5
        //   393: astore          6
        //   395: aload           7
        //   397: astore          5
        //   399: aload_0        
        //   400: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   403: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   406: ldc_w           "android.app.ReceiverRestrictedContext"
        //   409: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   412: ifeq            454
        //   415: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   418: ldc_w           "advertiserId"
        //   421: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   424: astore          6
        //   426: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   429: ldc_w           "advertiserIdEnabled"
        //   432: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   435: invokestatic    java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        //   438: iconst_1       
        //   439: ixor           
        //   440: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   443: astore          5
        //   445: aload           9
        //   447: ldc_w           "context = android.app.ReceiverRestrictedContext |"
        //   450: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   453: pop            
        //   454: aload           9
        //   456: invokevirtual   java/lang/StringBuilder.length:()I
        //   459: ifle            505
        //   462: new             Ljava/lang/StringBuilder;
        //   465: dup            
        //   466: invokespecial   java/lang/StringBuilder.<init>:()V
        //   469: astore_0       
        //   470: aload_0        
        //   471: iload_2        
        //   472: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   475: pop            
        //   476: aload_0        
        //   477: ldc_w           ": "
        //   480: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   483: pop            
        //   484: aload_0        
        //   485: aload           9
        //   487: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   490: pop            
        //   491: aload_1        
        //   492: ldc_w           "gaidError"
        //   495: aload_0        
        //   496: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   499: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   504: pop            
        //   505: aload           6
        //   507: ifnull          591
        //   510: aload           5
        //   512: ifnull          591
        //   515: aload_1        
        //   516: ldc_w           "advertiserId"
        //   519: aload           6
        //   521: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   526: pop            
        //   527: aload_1        
        //   528: ldc_w           "advertiserIdEnabled"
        //   531: aload           5
        //   533: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   536: iconst_1       
        //   537: ixor           
        //   538: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //   541: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   546: pop            
        //   547: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   550: ldc_w           "advertiserId"
        //   553: aload           6
        //   555: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   558: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   561: ldc_w           "advertiserIdEnabled"
        //   564: aload           5
        //   566: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   569: iconst_1       
        //   570: ixor           
        //   571: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //   574: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   577: aload_1        
        //   578: ldc_w           "isGaidWithGps"
        //   581: iload_3        
        //   582: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //   585: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   590: pop            
        //   591: new             Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
        //   594: dup            
        //   595: aload           6
        //   597: aload           5
        //   599: invokespecial   com/appsflyer/internal/AFc1uSDK$AFa1wSDK.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   602: areturn        
        //   603: astore          5
        //   605: iconst_1       
        //   606: istore_3       
        //   607: aload           7
        //   609: astore          8
        //   611: aload           5
        //   613: astore          7
        //   615: aload           8
        //   617: astore          5
        //   619: goto            156
        //   622: astore          5
        //   624: goto            281
        //    Signature:
        //  (Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  30     38     41     52     Any
        //  52     58     128    138    Any
        //  63     70     128    138    Any
        //  70     80     117    128    Any
        //  85     93     603    607    Any
        //  96     104    603    607    Any
        //  138    156    128    138    Any
        //  230    253    622    387    Any
        //  258    266    622    387    Any
        //  269    278    622    387    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
