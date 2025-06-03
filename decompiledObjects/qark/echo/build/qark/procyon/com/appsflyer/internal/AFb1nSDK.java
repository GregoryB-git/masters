// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.LinkedHashMap;
import android.provider.Settings$Secure;
import java.util.Date;
import java.text.SimpleDateFormat;
import android.os.SystemClock;
import org.json.JSONObject;
import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager;
import java.util.HashMap;
import android.view.WindowManager;
import java.util.Map;
import android.os.StatFs;
import android.os.Environment;
import kotlin.text.i;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import android.net.Uri;
import android.app.Activity;
import android.annotation.SuppressLint;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFb1nSDK implements AFe1vSDK
{
    @NotNull
    private final AFb1eSDK AFInAppEventParameterName;
    @NotNull
    private final Context AFInAppEventType;
    @NotNull
    private final AFa1iSDK AFKeystoreWrapper;
    @NotNull
    private final AFb1dSDK AFLogger;
    @NotNull
    private final AFe1wSDK afDebugLog;
    @NotNull
    private final AFa1kSDK afErrorLog;
    @NotNull
    private final AFb1gSDK afInfoLog;
    @NotNull
    private final AFe1mSDK afRDLog;
    @NotNull
    private final AFb1xSDK getLevel;
    @NotNull
    private final AFf1tSDK valueOf;
    @NotNull
    private final AFf1iSDK values;
    
    public AFb1nSDK() {
    }
    
    public AFb1nSDK(final Context afInAppEventType, final AFf1tSDK valueOf, final AFb1eSDK afInAppEventParameterName, final AFf1iSDK values, final AFa1iSDK afKeystoreWrapper, final AFe1mSDK afRDLog, final AFb1dSDK afLogger, final AFb1gSDK afInfoLog, final AFa1kSDK afErrorLog, final AFe1wSDK afDebugLog, final AFb1xSDK getLevel) {
        Intrinsics.checkNotNullParameter(afInAppEventType, "");
        Intrinsics.checkNotNullParameter(valueOf, "");
        Intrinsics.checkNotNullParameter(afInAppEventParameterName, "");
        Intrinsics.checkNotNullParameter(values, "");
        Intrinsics.checkNotNullParameter(afKeystoreWrapper, "");
        Intrinsics.checkNotNullParameter(afRDLog, "");
        Intrinsics.checkNotNullParameter(afLogger, "");
        Intrinsics.checkNotNullParameter(afInfoLog, "");
        Intrinsics.checkNotNullParameter(afErrorLog, "");
        Intrinsics.checkNotNullParameter(afDebugLog, "");
        Intrinsics.checkNotNullParameter(getLevel, "");
        this.AFInAppEventType = afInAppEventType;
        this.valueOf = valueOf;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.values = values;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.afRDLog = afRDLog;
        this.AFLogger = afLogger;
        this.afInfoLog = afInfoLog;
        this.afErrorLog = afErrorLog;
        this.afDebugLog = afDebugLog;
        this.getLevel = getLevel;
    }
    
    @SuppressLint({ "PrivateApi" })
    private static String AFInAppEventParameterName(final String s) {
        while (true) {
            try {
                final Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, s);
                if (invoke != null) {
                    return (String)invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                final Throwable t;
                AFLogger.afErrorLog(t.getMessage(), t);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static Uri AFInAppEventType(final Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            return activity.getReferrer();
        }
        return null;
    }
    
    private static String AFInAppEventType(final File p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: new             Ljava/util/Properties;
        //     9: dup            
        //    10: invokespecial   java/util/Properties.<init>:()V
        //    13: astore_3       
        //    14: new             Ljava/io/InputStreamReader;
        //    17: dup            
        //    18: new             Ljava/io/FileInputStream;
        //    21: dup            
        //    22: aload_0        
        //    23: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    26: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //    29: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    32: astore_2       
        //    33: aload_3        
        //    34: aload_2        
        //    35: invokevirtual   java/util/Properties.load:(Ljava/io/Reader;)V
        //    38: ldc             "Found PreInstall property!"
        //    40: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //    43: aload_3        
        //    44: aload_1        
        //    45: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    48: astore_1       
        //    49: aload_2        
        //    50: invokevirtual   java/io/Reader.close:()V
        //    53: aload_1        
        //    54: areturn        
        //    55: astore_0       
        //    56: aload_0        
        //    57: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //    60: aload_0        
        //    61: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    64: aload_1        
        //    65: areturn        
        //    66: astore_1       
        //    67: aload_2        
        //    68: astore_0       
        //    69: goto            75
        //    72: astore_1       
        //    73: aconst_null    
        //    74: astore_0       
        //    75: aload_0        
        //    76: astore_2       
        //    77: aload_1        
        //    78: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //    81: aload_1        
        //    82: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    85: aload_0        
        //    86: ifnull          152
        //    89: aload_0        
        //    90: invokevirtual   java/io/Reader.close:()V
        //    93: aconst_null    
        //    94: areturn        
        //    95: astore_0       
        //    96: aload_0        
        //    97: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   100: aload_0        
        //   101: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   104: aconst_null    
        //   105: areturn        
        //   106: astore_0       
        //   107: goto            154
        //   110: aconst_null    
        //   111: astore_1       
        //   112: aload_1        
        //   113: astore_2       
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: ldc             "PreInstall file wasn't found: "
        //   120: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   123: astore_3       
        //   124: aload_1        
        //   125: astore_2       
        //   126: aload_3        
        //   127: aload_0        
        //   128: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: aload_1        
        //   136: astore_2       
        //   137: aload_3        
        //   138: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   141: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //   144: aload_1        
        //   145: ifnull          152
        //   148: aload_1        
        //   149: invokevirtual   java/io/Reader.close:()V
        //   152: aconst_null    
        //   153: areturn        
        //   154: aload_2        
        //   155: ifnull          174
        //   158: aload_2        
        //   159: invokevirtual   java/io/Reader.close:()V
        //   162: goto            174
        //   165: astore_1       
        //   166: aload_1        
        //   167: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   170: aload_1        
        //   171: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   174: aload_0        
        //   175: athrow         
        //   176: astore_1       
        //   177: goto            110
        //   180: astore_1       
        //   181: aload_2        
        //   182: astore_1       
        //   183: goto            112
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  6      33     176    112    Ljava/io/FileNotFoundException;
        //  6      33     72     75     Any
        //  33     49     180    186    Ljava/io/FileNotFoundException;
        //  33     49     66     72     Any
        //  49     53     55     66     Any
        //  77     85     106    176    Any
        //  89     93     95     106    Any
        //  114    124    106    176    Any
        //  126    135    106    176    Any
        //  137    144    106    176    Any
        //  148    152    95     106    Any
        //  158    162    165    174    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 110 out of bounds for length 110
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    private boolean AFLogger$LogLevel() {
        final AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
        if (!instance.getBoolean("collectAndroidIdForceByUser", false)) {
            if (!instance.getBoolean("collectIMEIForceByUser", false)) {
                AFa1eSDK.valueOf();
                if (AFa1eSDK.AFInAppEventParameterName(this.AFInAppEventType)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean valueOf(final File file) {
        return file == null || !file.exists();
    }
    
    private static File values(final String s) {
        if (s != null) {
            try {
                if (i.f0(s).toString().length() > 0) {
                    return new File(i.f0(s).toString());
                }
            }
            finally {
                final Throwable t;
                AFLogger.afErrorLog(t.getMessage(), t);
            }
        }
        return null;
    }
    
    @NotNull
    @Override
    public final String AFInAppEventParameterName() {
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        final long blockSizeLong = statFs.getBlockSizeLong();
        final long availableBlocksLong = statFs.getAvailableBlocksLong();
        final long blockCountLong = statFs.getBlockCountLong();
        final double pow = Math.pow(2.0, 20.0);
        final long lng = (long)(availableBlocksLong * blockSizeLong / pow);
        final long lng2 = (long)(blockCountLong * blockSizeLong / pow);
        final StringBuilder sb = new StringBuilder();
        sb.append(lng);
        sb.append('/');
        sb.append(lng2);
        return sb.toString();
    }
    
    @Override
    public final void AFInAppEventParameterName(final Map<String, Object> map) {
        final String s = "";
        Intrinsics.checkNotNullParameter(map, "");
        final Object systemService = this.AFInAppEventType.getSystemService("window");
        WindowManager windowManager;
        if (systemService instanceof WindowManager) {
            windowManager = (WindowManager)systemService;
        }
        else {
            windowManager = null;
        }
        if (windowManager == null) {
            return;
        }
        final int rotation = windowManager.getDefaultDisplay().getRotation();
        String s2;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        s2 = s;
                    }
                    else {
                        s2 = "lr";
                    }
                }
                else {
                    s2 = "pr";
                }
            }
            else {
                s2 = "l";
            }
        }
        else {
            s2 = "p";
        }
        map.put("sc_o", s2);
    }
    
    @Override
    public final String AFInAppEventType() {
        final boolean values = this.AFLogger.values("INSTALL_STORE");
        String s = null;
        if (values) {
            return this.AFLogger.values("INSTALL_STORE", null);
        }
        if (this.afRDLog() && (s = AppsFlyerProperties.getInstance().getString("api_store_value")) == null) {
            s = this.afInfoLog.AFInAppEventType("AF_STORE");
        }
        this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", s);
        return s;
    }
    
    @Override
    public final void AFInAppEventType(final Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        final boolean boolean1 = AppsFlyerProperties.getInstance().getBoolean("disableCollectNetworkData", false);
        final AFa1kSDK.AFa1zSDK afInAppEventParameterName = this.afErrorLog.AFInAppEventParameterName(this.AFInAppEventType);
        final String afInAppEventParameterName2 = afInAppEventParameterName.AFInAppEventParameterName;
        Intrinsics.checkNotNullExpressionValue(afInAppEventParameterName2, "");
        map.put("network", afInAppEventParameterName2);
        if (boolean1) {
            return;
        }
        final String valueOf = afInAppEventParameterName.valueOf;
        if (valueOf != null) {
            map.put("operator", valueOf);
        }
        final String afInAppEventType = afInAppEventParameterName.AFInAppEventType;
        if (afInAppEventType != null) {
            map.put("carrier", afInAppEventType);
        }
    }
    
    @Override
    public final void AFInAppEventType(final boolean b, final Map<String, Object> map, final int n) {
        Intrinsics.checkNotNullParameter(map, "");
        final HashMap<String, Map<String, String>> hashMap = new HashMap<String, Map<String, String>>();
        hashMap.put("cpu_abi", AFInAppEventParameterName("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", (Map<String, String>)AFInAppEventParameterName("ro.product.cpu.abi2"));
        hashMap.put("arch", (Map<String, String>)AFInAppEventParameterName("os.arch"));
        hashMap.put("build_display_id", (Map<String, String>)AFInAppEventParameterName("ro.build.display.id"));
        if (b) {
            final AFb1eSDK.AFa1ySDK afInAppEventType = this.AFInAppEventParameterName.AFInAppEventType(this.AFInAppEventType);
            final float afInAppEventParameterName = afInAppEventType.AFInAppEventParameterName;
            final String afInAppEventType2 = afInAppEventType.AFInAppEventType;
            hashMap.put("btl", (Map<String, String>)String.valueOf(afInAppEventParameterName));
            if (afInAppEventType2 != null) {
                hashMap.put("btch", (Map<String, String>)afInAppEventType2);
            }
            if (n <= 2) {
                hashMap.putAll((Map<?, ?>)this.values.valueOf());
            }
        }
        hashMap.put("dim", this.AFKeystoreWrapper.valueOf(this.AFInAppEventType));
        map.put("deviceData", hashMap);
    }
    
    @Override
    public final String AFKeystoreWrapper() {
        return AFa1fSDK.values(this.AFInAppEventType.getApplicationContext().getPackageManager(), this.AFInAppEventType.getApplicationContext().getPackageName());
    }
    
    @Override
    public final void AFKeystoreWrapper(final Map<String, Object> map, final boolean b) {
        Intrinsics.checkNotNullParameter(map, "");
        final String afInAppEventParameterName = this.getLevel.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(afInAppEventParameterName, "");
        map.put("platformextension", afInAppEventParameterName);
        if (b) {
            map.put("platform_extension_v2", this.valueOf.AFKeystoreWrapper());
        }
    }
    
    @Override
    public final String AFLogger() {
        final AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
        String s = instance.getString("preInstallName");
        if (s != null) {
            return s;
        }
        final boolean values = this.AFLogger.values("preInstallName");
        final String s2 = null;
        String values2;
        if (values) {
            values2 = this.AFLogger.values("preInstallName", null);
        }
        else {
            if (this.afRDLog()) {
                File file;
                if (valueOf(file = values(AFInAppEventParameterName("ro.appsflyer.preinstall.path")))) {
                    file = values(this.afInfoLog.AFInAppEventType("AF_PRE_INSTALL_PATH"));
                }
                File values3 = file;
                if (valueOf(file)) {
                    values3 = values("/data/local/tmp/pre_install.appsflyer");
                }
                File values4 = values3;
                if (valueOf(values3)) {
                    values4 = values("/etc/pre_install.appsflyer");
                }
                if (valueOf(values4)) {
                    s = s2;
                }
                else {
                    final String packageName = this.AFInAppEventType.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    s = AFInAppEventType(values4, packageName);
                }
                if (s == null) {
                    s = this.afInfoLog.AFInAppEventType("AF_PRE_INSTALL_NAME");
                }
            }
            if ((values2 = s) != null) {
                this.AFLogger.AFInAppEventParameterName("preInstallName", s);
                values2 = s;
            }
        }
        if (values2 != null) {
            instance.set("preInstallName", values2);
        }
        return values2;
    }
    
    @Override
    public final boolean afDebugLog() {
        return Boolean.parseBoolean(this.AFLogger.values("sentSuccessfully", null));
    }
    
    @Override
    public final boolean afErrorLog() {
        while (true) {
            while (true) {
                int n = 0;
                Label_0105: {
                    while (true) {
                        try {
                            final Object systemService = this.AFInAppEventType.getSystemService("connectivity");
                            if (systemService == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
                            }
                            final ConnectivityManager connectivityManager = (ConnectivityManager)systemService;
                            final Network[] allNetworks = connectivityManager.getAllNetworks();
                            Intrinsics.checkNotNullExpressionValue(allNetworks, "");
                            final int length = allNetworks.length;
                            n = 0;
                            if (n >= length) {
                                break;
                            }
                            final NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[n]);
                            if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                                return true;
                            }
                            break Label_0105;
                            final Exception ex;
                            com.appsflyer.AFLogger.afErrorLog("Failed collecting ivc data", ex);
                            return false;
                        }
                        catch (Exception ex) {
                            continue;
                        }
                        break;
                    }
                }
                ++n;
                continue;
            }
        }
        return false;
    }
    
    @Override
    public final String afInfoLog() {
        String s;
        if ((s = AppsFlyerProperties.getInstance().getString("api_store_value")) == null) {
            s = this.afInfoLog.AFInAppEventType("AF_STORE");
        }
        return s;
    }
    
    @Override
    public final boolean afRDLog() {
        return !this.AFLogger.values("appsFlyerCount");
    }
    
    @Override
    public final long valueOf() {
        return System.currentTimeMillis();
    }
    
    @Override
    public final void valueOf(final Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "");
        final AFe1mSDK afRDLog = this.afRDLog;
        final HashMap hashMap = new HashMap(afRDLog.AFKeystoreWrapper);
        afRDLog.AFKeystoreWrapper.clear();
        this.afRDLog.valueOf.AFInAppEventType("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty() ^ true) {
            final Map<String, Object> values = AFa1eSDK.values((Map<String, Object>)map);
            Intrinsics.checkNotNullExpressionValue(values, "");
            values.put("gcd", hashMap);
        }
    }
    
    @Override
    public final void valueOf(final Map<String, Object> map, final String s) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(s, "");
        while (true) {
            try {
                final String values = this.AFLogger.values("prev_event_name", null);
                if (values != null) {
                    final JSONObject jsonObject = new JSONObject();
                    jsonObject.put("prev_event_timestamp", this.AFLogger.valueOf("prev_event_timestamp", -1L));
                    jsonObject.put("prev_event_name", (Object)values);
                    map.put("prev_event", jsonObject);
                }
                this.AFLogger.AFInAppEventParameterName("prev_event_name", s);
                this.AFLogger.AFInAppEventParameterName("prev_event_timestamp", System.currentTimeMillis());
                return;
                final Exception ex;
                com.appsflyer.AFLogger.afErrorLog("Error while processing previous event.", ex);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final long values() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }
    
    @Override
    public final String values(final SimpleDateFormat simpleDateFormat) {
        final String s = "";
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String obj;
        if ((obj = this.AFLogger.values("appsFlyerFirstInstall", null)) == null) {
            obj = s;
            if (this.afRDLog()) {
                com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
                obj = simpleDateFormat.format(new Date());
            }
            this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", obj);
        }
        com.appsflyer.AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(obj)));
        return obj;
    }
    
    @Override
    public final void values(final Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        final String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        final String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }
    
    @SuppressLint({ "HardwareIds" })
    @Override
    public final void values(final Map<String, Object> map, String string) {
        Intrinsics.checkNotNullParameter(map, "");
        final AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
        if (instance.getBoolean("deviceTrackingDisabled", false)) {
            map.put("deviceTrackingDisabled", "true");
            return;
        }
        final String value = this.afDebugLog.valueOf(this.AFLogger);
        if (value != null) {
            if (value.length() != 0) {
                map.put("imei", value);
            }
        }
        final boolean boolean1 = instance.getBoolean("collectAndroidId", false);
        final String values = this.AFLogger.values("androidIdCached", null);
        Label_0220: {
            Label_0218: {
                if (boolean1 && (string == null || string.length() == 0)) {
                    if (!this.AFLogger$LogLevel()) {
                        break Label_0218;
                    }
                    while (true) {
                        try {
                            string = Settings$Secure.getString(this.AFInAppEventType.getContentResolver(), "android_id");
                            if (string != null) {
                                break Label_0220;
                            }
                            if (values != null) {
                                com.appsflyer.AFLogger.afDebugLog("use cached AndroidId: ".concat(values));
                                string = values;
                                break Label_0220;
                            }
                            break Label_0218;
                        }
                        catch (Exception ex) {
                            if (values != null) {
                                com.appsflyer.AFLogger.afDebugLog("use cached AndroidId: ".concat(values));
                                string = values;
                            }
                            else {
                                string = null;
                            }
                            com.appsflyer.AFLogger.afErrorLog(ex.getMessage(), ex);
                            continue;
                        }
                        break;
                    }
                }
                if (string != null) {
                    break Label_0220;
                }
            }
            string = null;
        }
        if (string != null) {
            this.AFLogger.AFInAppEventParameterName("androidIdCached", string);
            map.put("android_id", string);
        }
        else {
            com.appsflyer.AFLogger.afInfoLog("Android ID was not collected.");
        }
        final AFc1uSDK.AFa1wSDK values2 = AFa1cSDK.values(this.AFInAppEventType);
        if (values2 != null) {
            final LinkedHashMap<String, Boolean> linkedHashMap = new LinkedHashMap<String, Boolean>();
            final Boolean values3 = values2.values;
            Intrinsics.checkNotNullExpressionValue(values3, "");
            linkedHashMap.put("isManual", values3);
            final String valueOf = values2.valueOf;
            Intrinsics.checkNotNullExpressionValue(valueOf, "");
            linkedHashMap.put("val", (Boolean)valueOf);
            final Boolean afInAppEventType = values2.AFInAppEventType;
            if (afInAppEventType != null) {
                linkedHashMap.put("isLat", afInAppEventType);
            }
            map.put("oaid", linkedHashMap);
        }
    }
}
