// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.os.Build;
import android.content.pm.PackageManager;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.List;

public final class AFb1rSDK implements AFb1tSDK
{
    private static char[] afDebugLog;
    private static int afErrorLog = 1;
    private static int afInfoLog;
    private List<String> AFInAppEventParameterName;
    @NonNull
    private final Map<String, Object> AFInAppEventType;
    private boolean AFKeystoreWrapper;
    private String AFLogger;
    private boolean afRDLog;
    private boolean valueOf;
    private int values;
    
    static {
        AFb1rSDK.afDebugLog = new char[] { '?', '\u0084', '\u0082', '\u0084', '\u0085' };
    }
    
    public AFb1rSDK() {
        this.AFInAppEventParameterName = new ArrayList<String>();
        this.valueOf = true;
        this.AFInAppEventType = new HashMap<String, Object>();
        this.AFLogger = "-1";
        this.afRDLog = (true ^ AppsFlyerProperties.getInstance().getBoolean("disableProxy", false));
        this.values = 0;
        this.AFKeystoreWrapper = false;
    }
    
    private void AFInAppEventType(final String p0, final String p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //     6: ldc             "sdk_version"
        //     8: aload_1        
        //     9: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    14: pop            
        //    15: aload_2        
        //    16: ifnull          55
        //    19: getstatic       com/appsflyer/internal/AFb1rSDK.afInfoLog:I
        //    22: bipush          19
        //    24: iadd           
        //    25: sipush          128
        //    28: irem           
        //    29: putstatic       com/appsflyer/internal/AFb1rSDK.afErrorLog:I
        //    32: aload_2        
        //    33: invokevirtual   java/lang/String.length:()I
        //    36: ifle            55
        //    39: aload_0        
        //    40: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //    43: ldc             "devkey"
        //    45: aload_2        
        //    46: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    51: pop            
        //    52: goto            55
        //    55: aload_3        
        //    56: ifnull          79
        //    59: aload_3        
        //    60: invokevirtual   java/lang/String.length:()I
        //    63: ifle            79
        //    66: aload_0        
        //    67: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //    70: ldc             "originalAppsFlyerId"
        //    72: aload_3        
        //    73: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    78: pop            
        //    79: aload           4
        //    81: ifnull          135
        //    84: getstatic       com/appsflyer/internal/AFb1rSDK.afInfoLog:I
        //    87: bipush          109
        //    89: iadd           
        //    90: istore          5
        //    92: iload           5
        //    94: sipush          128
        //    97: irem           
        //    98: putstatic       com/appsflyer/internal/AFb1rSDK.afErrorLog:I
        //   101: iload           5
        //   103: iconst_2       
        //   104: irem           
        //   105: ifeq            133
        //   108: aload           4
        //   110: invokevirtual   java/lang/String.length:()I
        //   113: ifle            135
        //   116: aload_0        
        //   117: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //   120: ldc             "uid"
        //   122: aload           4
        //   124: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   129: pop            
        //   130: goto            135
        //   133: aconst_null    
        //   134: athrow         
        //   135: getstatic       com/appsflyer/internal/AFb1rSDK.afErrorLog:I
        //   138: bipush          79
        //   140: iadd           
        //   141: sipush          128
        //   144: irem           
        //   145: putstatic       com/appsflyer/internal/AFb1rSDK.afInfoLog:I
        //   148: aload_0        
        //   149: monitorexit    
        //   150: return         
        //   151: aload_0        
        //   152: monitorexit    
        //   153: aload_1        
        //   154: athrow         
        //   155: aload_0        
        //   156: monitorexit    
        //   157: return         
        //   158: astore_1       
        //   159: goto            155
        //   162: astore_1       
        //   163: goto            151
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      15     158    162    Any
        //  19     32     162    155    Any
        //  32     52     158    162    Any
        //  59     79     158    162    Any
        //  84     101    162    155    Any
        //  108    130    158    162    Any
        //  133    135    158    162    Any
        //  135    148    162    155    Any
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
    
    private boolean afDebugLog() {
        if (this.afRDLog) {
            final int n = AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 29) % 128;
            if (!this.valueOf) {
                final int n2 = n + 13;
                AFb1rSDK.afErrorLog = n2 % 128;
                if (n2 % 2 == 0) {
                    if (!this.AFKeystoreWrapper) {
                        return false;
                    }
                }
                else if (!this.AFKeystoreWrapper) {
                    return false;
                }
            }
            final int n3 = AFb1rSDK.afErrorLog + 83;
            AFb1rSDK.afInfoLog = n3 % 128;
            if (n3 % 2 != 0) {}
            return true;
        }
        return false;
    }
    
    private void afErrorLog() {
        synchronized (this) {
            this.AFInAppEventParameterName = new ArrayList<String>();
            this.values = 0;
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 95) % 128;
        }
    }
    
    @NonNull
    private Map<String, Object> afRDLog() {
        synchronized (this) {
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 49) % 128;
            this.AFInAppEventType.put("data", this.AFInAppEventParameterName);
            this.afErrorLog();
            final Map<String, Object> afInAppEventType = this.AFInAppEventType;
            AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 15) % 128;
            return afInAppEventType;
        }
    }
    
    private void valueOf(final String p0, final PackageManager p1, final AFe1wSDK p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: getstatic       com/appsflyer/internal/AFb1rSDK.afErrorLog:I
        //     5: bipush          85
        //     7: iadd           
        //     8: istore          4
        //    10: iload           4
        //    12: sipush          128
        //    15: irem           
        //    16: putstatic       com/appsflyer/internal/AFb1rSDK.afInfoLog:I
        //    19: iload           4
        //    21: iconst_2       
        //    22: irem           
        //    23: ifeq            69
        //    26: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //    29: astore          5
        //    31: aload           5
        //    33: ldc             "remote_debug_static_data"
        //    35: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    38: astore          6
        //    40: aload_0        
        //    41: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //    44: invokeinterface java/util/Map.clear:()V
        //    49: bipush          94
        //    51: iconst_0       
        //    52: idiv           
        //    53: istore          4
        //    55: aload           6
        //    57: ifnull          123
        //    60: aload           6
        //    62: astore_1       
        //    63: goto            100
        //    66: astore_1       
        //    67: aload_1        
        //    68: athrow         
        //    69: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //    72: astore          5
        //    74: aload           5
        //    76: ldc             "remote_debug_static_data"
        //    78: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    81: astore          6
        //    83: aload_0        
        //    84: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //    87: invokeinterface java/util/Map.clear:()V
        //    92: aload           6
        //    94: ifnull          123
        //    97: aload           6
        //    99: astore_1       
        //   100: aload_0        
        //   101: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //   104: new             Lorg/json/JSONObject;
        //   107: dup            
        //   108: aload_1        
        //   109: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   112: invokestatic    com/appsflyer/internal/AFa1rSDK.valueOf:(Lorg/json/JSONObject;)Ljava/util/Map;
        //   115: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   120: goto            266
        //   123: invokestatic    com/appsflyer/internal/AFa1eSDK.valueOf:()Lcom/appsflyer/internal/AFa1eSDK;
        //   126: astore          6
        //   128: aload_0        
        //   129: aload           5
        //   131: ldc             "advertiserId"
        //   133: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   136: aload_3        
        //   137: getfield        com/appsflyer/internal/AFe1wSDK.values:Ljava/lang/String;
        //   140: aload           6
        //   142: getfield        com/appsflyer/internal/AFa1eSDK.AFLogger:Ljava/lang/String;
        //   145: invokespecial   com/appsflyer/internal/AFb1rSDK.values:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   148: new             Ljava/lang/StringBuilder;
        //   151: dup            
        //   152: ldc             "6.12.2."
        //   154: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   157: astore_3       
        //   158: aload_3        
        //   159: getstatic       com/appsflyer/internal/AFa1eSDK.values:Ljava/lang/String;
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: pop            
        //   166: aload_0        
        //   167: aload_3        
        //   168: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   171: aload           6
        //   173: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //   176: invokeinterface com/appsflyer/internal/AFc1xSDK.afWarnLog:()Lcom/appsflyer/internal/AFe1wSDK;
        //   181: getfield        com/appsflyer/internal/AFe1wSDK.AFInAppEventParameterName:Ljava/lang/String;
        //   184: aload           5
        //   186: ldc             "KSAppsFlyerId"
        //   188: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   191: aload           5
        //   193: ldc             "uid"
        //   195: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   198: invokespecial   com/appsflyer/internal/AFb1rSDK.AFInAppEventType:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   201: aload_0        
        //   202: aload_1        
        //   203: aload_2        
        //   204: aload_1        
        //   205: iconst_0       
        //   206: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   209: getfield        android/content/pm/PackageInfo.versionCode:I
        //   212: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   215: aload           5
        //   217: ldc             "channel"
        //   219: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   222: aload           5
        //   224: ldc             "preInstallName"
        //   226: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   229: invokespecial   com/appsflyer/internal/AFb1rSDK.values:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   232: aload           5
        //   234: ldc             "remote_debug_static_data"
        //   236: new             Lorg/json/JSONObject;
        //   239: dup            
        //   240: aload_0        
        //   241: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //   244: invokespecial   org/json/JSONObject.<init>:(Ljava/util/Map;)V
        //   247: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   250: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   253: getstatic       com/appsflyer/internal/AFb1rSDK.afInfoLog:I
        //   256: bipush          23
        //   258: iadd           
        //   259: sipush          128
        //   262: irem           
        //   263: putstatic       com/appsflyer/internal/AFb1rSDK.afErrorLog:I
        //   266: aload_0        
        //   267: getfield        com/appsflyer/internal/AFb1rSDK.AFInAppEventType:Ljava/util/Map;
        //   270: ldc             "launch_counter"
        //   272: aload_0        
        //   273: getfield        com/appsflyer/internal/AFb1rSDK.AFLogger:Ljava/lang/String;
        //   276: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   281: pop            
        //   282: aload_0        
        //   283: monitorexit    
        //   284: return         
        //   285: aload_0        
        //   286: monitorexit    
        //   287: aload_1        
        //   288: athrow         
        //   289: astore_1       
        //   290: goto            266
        //   293: astore_1       
        //   294: goto            232
        //   297: astore_1       
        //   298: goto            285
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      19     297    289    Any
        //  26     49     297    289    Any
        //  49     55     66     69     Any
        //  67     69     297    289    Any
        //  69     92     297    289    Any
        //  100    120    289    293    Any
        //  123    201    297    289    Any
        //  201    232    293    297    Any
        //  232    266    297    289    Any
        //  266    282    297    289    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0232:
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
    
    private static String[] valueOf(final String s, final StackTraceElement[] array) {
        if (array != null) {
            final int length = array.length;
            int i = 1;
            final String[] array2 = new String[length + 1];
            array2[0] = s;
            while (i < array.length) {
                final int n = AFb1rSDK.afInfoLog + 5;
                AFb1rSDK.afErrorLog = n % 128;
                if (n % 2 == 0) {
                    array2[i] = array[i].toString();
                    i += 85;
                }
                else {
                    array2[i] = array[i].toString();
                    ++i;
                }
            }
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 93) % 128;
            return array2;
        }
        final int n2 = AFb1rSDK.afInfoLog + 89;
        AFb1rSDK.afErrorLog = n2 % 128;
        if (n2 % 2 == 0) {
            final String[] array3 = new String[0];
            array3[0] = s;
            return array3;
        }
        return new String[] { s };
    }
    
    private Map<String, Object> values(final String s, final PackageManager packageManager, final AFc1xSDK aFc1xSDK) {
        final int n = AFb1rSDK.afInfoLog + 29;
        AFb1rSDK.afErrorLog = n % 128;
        this.valueOf(s, packageManager, aFc1xSDK.afWarnLog());
        if (n % 2 != 0) {
            return this.afRDLog();
        }
        this.afRDLog();
        throw null;
    }
    
    private void values(final String s, final String s2, final String s3) {
        // monitorenter(this)
        while (true) {
            try {
                final Map<String, Object> afInAppEventType = this.AFInAppEventType;
                final Object[] array = { null };
                values("\u0001\u0000\u0001\u0001\u0000", true, new int[] { 0, 5, 27, 0 }, array);
                afInAppEventType.put(((String)array[0]).intern(), Build.BRAND);
                this.AFInAppEventType.put("model", Build.MODEL);
                this.AFInAppEventType.put("platform", "Android");
                this.AFInAppEventType.put("platform_version", Build$VERSION.RELEASE);
                if (s != null && s.length() > 0) {
                    this.AFInAppEventType.put("advertiserId", s);
                }
                Label_0175: {
                    if (s2 != null) {
                        Label_0268: {
                            try {
                                AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 85) % 128;
                                if (s2.length() > 0) {
                                    this.AFInAppEventType.put("imei", s2);
                                }
                            }
                            finally {
                                break Label_0268;
                            }
                            break Label_0175;
                        }
                    }
                    // monitorexit(this)
                }
                if (s3 != null) {
                    AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 7) % 128;
                    if (s3.length() > 0) {
                        AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 9) % 128;
                        this.AFInAppEventType.put("android_id", s3);
                    }
                }
                final int n = AFb1rSDK.afInfoLog + 17;
                AFb1rSDK.afErrorLog = n % 128;
                if (n % 2 == 0) {
                    try {
                        // monitorexit(this)
                        return;
                    }
                    finally {}
                }
                // monitorexit(this)
                return;
            }
            // monitorexit(this)
            finally {
                continue;
            }
            break;
        }
    }
    
    private void values(final String s, final String s2, final String s3, final String s4) {
        // monitorenter(this)
        Label_0046: {
            if (s == null) {
                break Label_0046;
            }
            while (true) {
                while (true) {
                    try {
                        if (s.length() > 0) {
                            this.AFInAppEventType.put("app_id", s);
                            Label_0173: {
                                try {
                                    AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 81) % 128;
                                }
                                finally {
                                    break Label_0173;
                                }
                                break Label_0046;
                            }
                        }
                        // monitorexit(this)
                        if (s2 != null && s2.length() > 0) {
                            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 125) % 128;
                            this.AFInAppEventType.put("app_version", s2);
                        }
                        if (s3 != null && s3.length() > 0) {
                            this.AFInAppEventType.put("channel", s3);
                        }
                        if (s4 != null) {
                            AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 95) % 128;
                            if (s4.length() > 0) {
                                this.AFInAppEventType.put("preInstall", s4);
                            }
                        }
                        AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 99) % 128;
                        // monitorexit(this)
                        return;
                        // monitorexit(this)
                        return;
                    }
                    finally {}
                    continue;
                }
            }
        }
    }
    
    private void values(String str, final String s, final String... array) {
        // monitorenter(this)
        while (true) {
            try {
                Label_0298: {
                    if (!this.afDebugLog()) {
                        break Label_0298;
                    }
                    final int n = AFb1rSDK.afErrorLog + 75;
                    AFb1rSDK.afInfoLog = n % 128;
                    Label_0074: {
                        if (n % 2 != 0) {
                            final int values = this.values;
                            try {
                                if (values >= 98304) {
                                    break Label_0298;
                                }
                                break Label_0074;
                            }
                            finally {}
                        }
                        if (this.values >= 98304) {
                            break Label_0298;
                        }
                        while (true) {
                            while (true) {
                                try {
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    final String join = TextUtils.join((CharSequence)", ", (Object[])array);
                                    if (str != null) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(currentTimeMillis);
                                        sb.append(" ");
                                        sb.append(Thread.currentThread().getId());
                                        sb.append(" _/AppsFlyer_6.12.2 [");
                                        sb.append(str);
                                        sb.append("] ");
                                        sb.append(s);
                                        sb.append(" ");
                                        sb.append(join);
                                        str = sb.toString();
                                    }
                                    else {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append(currentTimeMillis);
                                        sb2.append(" ");
                                        sb2.append(Thread.currentThread().getId());
                                        sb2.append(" ");
                                        sb2.append(s);
                                        sb2.append("/AppsFlyer_6.12.2 ");
                                        sb2.append(join);
                                        str = sb2.toString();
                                        AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 103) % 128;
                                    }
                                    this.AFInAppEventParameterName.add(str);
                                    this.values += str.length() << 1;
                                    // monitorexit(this)
                                    return;
                                    // monitorexit(this)
                                    // monitorexit(this)
                                    return;
                                    // monitorexit(this)
                                    return;
                                }
                                finally {}
                                continue;
                            }
                        }
                    }
                }
            }
            finally {}
            continue;
        }
    }
    
    private static void values(final String s, final boolean b, final int[] array, final Object[] array2) {
        Object bytes = s;
        if (s != null) {
            bytes = s.getBytes("ISO-8859-1");
        }
        byte[] array3;
        Object afInAppEventType;
        int n;
        int n2;
        int n3;
        int n4;
        char[] afDebugLog;
        int[] array4 = null;
        int afInAppEventParameterName = 0;
        String s2;
        Label_0149_Outer:Label_0252_Outer:
        while (true) {
            array3 = (byte[])bytes;
            afInAppEventType = AFg1sSDK.AFInAppEventType;
            // monitorenter(afInAppEventType)
            n = array[0];
            n2 = array[1];
            n3 = array[2];
            n4 = array[3];
            while (true) {
            Label_0346:
                while (true) {
                    Label_0343: {
                        while (true) {
                            Label_0325: {
                                while (true) {
                                    try {
                                        afDebugLog = AFb1rSDK.afDebugLog;
                                        bytes = new char[n2];
                                        System.arraycopy(afDebugLog, n, bytes, 0, n2);
                                        array4 = (int[])bytes;
                                        if (array3 != null) {
                                            array4 = (int[])new char[n2];
                                            AFg1sSDK.AFInAppEventParameterName = 0;
                                            n = 0;
                                            while (true) {
                                                afInAppEventParameterName = AFg1sSDK.AFInAppEventParameterName;
                                                if (afInAppEventParameterName >= n2) {
                                                    break Label_0343;
                                                }
                                                if (array3[afInAppEventParameterName] != 1) {
                                                    break Label_0325;
                                                }
                                                array4[afInAppEventParameterName] = (char)((bytes[afInAppEventParameterName] << 1) + 1 - n);
                                                n = array4[afInAppEventParameterName];
                                                AFg1sSDK.AFInAppEventParameterName = afInAppEventParameterName + 1;
                                            }
                                        }
                                        else {
                                            if (n4 > 0) {
                                                bytes = new char[n2];
                                                System.arraycopy(array4, 0, bytes, 0, n2);
                                                n = n2 - n4;
                                                System.arraycopy(bytes, 0, array4, n, n4);
                                                System.arraycopy(bytes, n4, array4, 0, n);
                                            }
                                            bytes = array4;
                                            if (!b) {
                                                if (n3 > 0) {
                                                    AFg1sSDK.AFInAppEventParameterName = 0;
                                                    while (true) {
                                                        n = AFg1sSDK.AFInAppEventParameterName;
                                                        if (n >= n2) {
                                                            break;
                                                        }
                                                        bytes[n] = (char)(bytes[n] - array[2]);
                                                        AFg1sSDK.AFInAppEventParameterName = n + 1;
                                                    }
                                                }
                                                s2 = new String((char[])bytes);
                                                // monitorexit(afInAppEventType)
                                                array2[0] = s2;
                                                return;
                                            }
                                            bytes = new char[n2];
                                            AFg1sSDK.AFInAppEventParameterName = 0;
                                            while (true) {
                                                n = AFg1sSDK.AFInAppEventParameterName;
                                                if (n >= n2) {
                                                    break Label_0346;
                                                }
                                                bytes[n] = array4[n2 - n - 1];
                                                AFg1sSDK.AFInAppEventParameterName = n + 1;
                                            }
                                        }
                                        // monitorexit(afInAppEventType)
                                        throw array4;
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                            }
                            array4[afInAppEventParameterName] = (char)((bytes[afInAppEventParameterName] << 1) - n);
                            continue Label_0149_Outer;
                        }
                    }
                    continue Label_0252_Outer;
                }
                continue;
            }
        }
    }
    
    @Override
    public final void AFInAppEventParameterName() {
        final int n = AFb1rSDK.afErrorLog + 15;
        final int n2 = AFb1rSDK.afInfoLog = n % 128;
        if (n % 2 != 0) {
            this.afRDLog = true;
        }
        else {
            this.afRDLog = false;
        }
        final int n3 = n2 + 101;
        AFb1rSDK.afErrorLog = n3 % 128;
        if (n3 % 2 == 0) {}
    }
    
    @Override
    public final void AFInAppEventParameterName(final String afLogger) {
        // monitorenter(this)
        Label_0057: {
            try {
                final int afErrorLog = AFb1rSDK.afErrorLog;
                final int n = afErrorLog + 87;
                AFb1rSDK.afInfoLog = n % 128;
                if (n % 2 == 0) {
                    this.AFLogger = afLogger;
                    AFb1rSDK.afInfoLog = (afErrorLog + 1) % 128;
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0057;
            }
            final String afLogger2;
            this.AFLogger = afLogger2;
            try {
                throw null;
            }
            finally {}
        }
    }
    // monitorexit(this)
    
    @Override
    public final void AFInAppEventParameterName(final String s, int i, final String s2) {
        AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 85) % 128;
        this.values("server_response", s, new String[] { String.valueOf(i), s2 });
        i = AFb1rSDK.afErrorLog + 63;
        AFb1rSDK.afInfoLog = i % 128;
        if (i % 2 != 0) {
            i = 52 / 0;
        }
    }
    
    @Override
    public final void AFInAppEventParameterName(final String s, final String s2) {
        final int n = AFb1rSDK.afErrorLog + 69;
        AFb1rSDK.afInfoLog = n % 128;
        if (n % 2 != 0) {
            final String[] array = new String[0];
            array[0] = s2;
            this.values(null, s, array);
            return;
        }
        this.values(null, s, new String[] { s2 });
    }
    
    @Override
    public final void AFInAppEventParameterName(final String s, final String... array) {
        AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 115) % 128;
        this.values("public_api_call", s, array);
        final int n = AFb1rSDK.afInfoLog + 43;
        AFb1rSDK.afErrorLog = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void AFInAppEventType() {
        synchronized (this) {
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 41) % 128;
            this.valueOf = false;
            this.afErrorLog();
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 37) % 128;
        }
    }
    
    @Override
    public final void AFInAppEventType(final Throwable t) {
        final Throwable cause = t.getCause();
        final String simpleName = t.getClass().getSimpleName();
        String s;
        if (cause == null) {
            s = t.getMessage();
        }
        else {
            s = cause.getMessage();
            AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 71) % 128;
        }
        StackTraceElement[] array;
        if (cause == null) {
            AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 39) % 128;
            array = t.getStackTrace();
        }
        else {
            array = cause.getStackTrace();
        }
        this.values("exception", simpleName, valueOf(s, array));
    }
    
    @Override
    public final void AFKeystoreWrapper() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0079: {
            try {
                this.AFKeystoreWrapper = true;
                this.values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(System.currentTimeMillis()), new String[0]);
                final int n = AFb1rSDK.afInfoLog + 73;
                AFb1rSDK.afErrorLog = n % 128;
                if (n % 2 == 0) {
                    try {
                        // monitorexit(this)
                        return;
                    }
                    finally {}
                }
            }
            finally {
                break Label_0079;
            }
            return;
        }
    }
    // monitorexit(this)
    
    @Override
    public final boolean afInfoLog() {
        final int afErrorLog = AFb1rSDK.afErrorLog;
        final int n = afErrorLog + 59;
        AFb1rSDK.afInfoLog = n % 128;
        if (n % 2 != 0) {
            throw null;
        }
        final boolean afKeystoreWrapper = this.AFKeystoreWrapper;
        final int n2 = afErrorLog + 51;
        AFb1rSDK.afInfoLog = n2 % 128;
        if (n2 % 2 == 0) {
            return afKeystoreWrapper;
        }
        throw null;
    }
    
    @Override
    public final void valueOf() {
        // monitorenter(this)
        while (true) {
            try {
                final int n = AFb1rSDK.afInfoLog + 45;
                AFb1rSDK.afErrorLog = n % 128;
                if (n % 2 == 0) {
                    this.AFInAppEventType.clear();
                    this.AFInAppEventParameterName.clear();
                    this.values = 1;
                }
                else {
                    this.AFInAppEventType.clear();
                    this.AFInAppEventParameterName.clear();
                    this.values = 0;
                }
                final int n2 = AFb1rSDK.afInfoLog + 69;
                AFb1rSDK.afErrorLog = n2 % 128;
                if (n2 % 2 == 0) {
                    try {
                        // monitorexit(this)
                        return;
                    }
                    finally {}
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void valueOf(final String s, final PackageManager packageManager, final AFc1xSDK aFc1xSDK) {
        try {
            final AFd1iSDK aFd1iSDK = new AFd1iSDK(this.values(s, packageManager, aFc1xSDK), aFc1xSDK);
            final AFc1bSDK afVersionDeclaration = aFc1xSDK.AFVersionDeclaration();
            afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType = aFd1iSDK;
                
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
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:494)
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
            final int n = AFb1rSDK.afErrorLog + 7;
            AFb1rSDK.afInfoLog = n % 128;
            if (n % 2 == 0) {
                return;
            }
            throw null;
        }
        finally {
            final Throwable t;
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", t);
        }
    }
    
    @Override
    public final void valueOf(final String s, final String s2) {
        AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 87) % 128;
        this.values("server_request", s, new String[] { s2 });
        AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 113) % 128;
    }
    
    @Override
    public final void values() {
        synchronized (this) {
            this.values("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(System.currentTimeMillis()), new String[0]);
            this.AFKeystoreWrapper = false;
            this.valueOf = false;
            AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 49) % 128;
        }
    }
}
