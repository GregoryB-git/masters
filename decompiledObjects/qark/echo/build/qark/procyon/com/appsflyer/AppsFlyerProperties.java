// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import org.json.JSONObject;
import com.appsflyer.internal.AFb1dSDK;
import java.util.HashMap;
import java.util.Map;

public class AppsFlyerProperties
{
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static final AppsFlyerProperties valueOf;
    public boolean AFInAppEventParameterName;
    private final Map<String, Object> AFInAppEventType;
    public String AFKeystoreWrapper;
    private boolean values;
    
    static {
        valueOf = new AppsFlyerProperties();
    }
    
    private AppsFlyerProperties() {
        this.AFInAppEventType = new HashMap<String, Object>();
        this.values = false;
    }
    
    private boolean AFKeystoreWrapper() {
        return this.values;
    }
    
    public static AppsFlyerProperties getInstance() {
        return AppsFlyerProperties.valueOf;
    }
    
    public final boolean AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }
    
    public boolean getBoolean(String string, final boolean b) {
        string = this.getString(string);
        if (string == null) {
            return b;
        }
        return Boolean.parseBoolean(string);
    }
    
    public int getInt(String string, final int n) {
        string = this.getString(string);
        if (string == null) {
            return n;
        }
        return Integer.parseInt(string);
    }
    
    public long getLong(String string, final long n) {
        string = this.getString(string);
        if (string == null) {
            return n;
        }
        return Long.parseLong(string);
    }
    
    public Object getObject(final String s) {
        synchronized (this) {
            return this.AFInAppEventType.get(s);
        }
    }
    
    public String getReferrer(final AFb1dSDK aFb1dSDK) {
        final String afKeystoreWrapper = this.AFKeystoreWrapper;
        if (afKeystoreWrapper != null) {
            return afKeystoreWrapper;
        }
        if (this.getString("AF_REFERRER") != null) {
            return this.getString("AF_REFERRER");
        }
        return aFb1dSDK.values("referrer", null);
    }
    
    public String getString(String s) {
        synchronized (this) {
            s = this.AFInAppEventType.get(s);
            return s;
        }
    }
    
    public boolean isEnableLog() {
        final AFLogger.LogLevel none = AFLogger.LogLevel.NONE;
        return this.getInt("logLevel", none.getLevel()) > none.getLevel();
    }
    
    public boolean isLogsDisabledCompletely() {
        return this.getBoolean("disableLogs", false);
    }
    
    public boolean isOtherSdkStringDisabled() {
        return this.getBoolean("disableOtherSdk", false);
    }
    
    public void loadProperties(final AFb1dSDK p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokespecial   com/appsflyer/AppsFlyerProperties.AFKeystoreWrapper:()Z
        //     6: istore_3       
        //     7: iload_3        
        //     8: ifeq            14
        //    11: aload_0        
        //    12: monitorexit    
        //    13: return         
        //    14: aload_1        
        //    15: ldc             "savedProperties"
        //    17: aconst_null    
        //    18: invokeinterface com/appsflyer/internal/AFb1dSDK.values:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    23: astore          4
        //    25: aload           4
        //    27: ifnull          206
        //    30: ldc             "Loading properties.."
        //    32: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //    35: new             Lorg/json/JSONObject;
        //    38: dup            
        //    39: aload           4
        //    41: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    44: astore          4
        //    46: aload           4
        //    48: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    51: astore          5
        //    53: aload           5
        //    55: invokeinterface java/util/Iterator.hasNext:()Z
        //    60: ifeq            111
        //    63: aload           5
        //    65: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    70: checkcast       Ljava/lang/String;
        //    73: astore          6
        //    75: aload_0        
        //    76: getfield        com/appsflyer/AppsFlyerProperties.AFInAppEventType:Ljava/util/Map;
        //    79: aload           6
        //    81: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    86: ifnonnull       53
        //    89: aload_0        
        //    90: getfield        com/appsflyer/AppsFlyerProperties.AFInAppEventType:Ljava/util/Map;
        //    93: aload           6
        //    95: aload           4
        //    97: aload           6
        //    99: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   102: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   107: pop            
        //   108: goto            53
        //   111: iconst_0       
        //   112: istore_2       
        //   113: iload_2        
        //   114: iconst_3       
        //   115: if_icmpge       160
        //   118: iconst_3       
        //   119: anewarray       Ljava/lang/String;
        //   122: dup            
        //   123: iconst_0       
        //   124: ldc             "AppsFlyerKey"
        //   126: aastore        
        //   127: dup            
        //   128: iconst_1       
        //   129: ldc             "custom_host"
        //   131: aastore        
        //   132: dup            
        //   133: iconst_2       
        //   134: ldc             "custom_host_prefix"
        //   136: aastore        
        //   137: iload_2        
        //   138: aaload         
        //   139: astore          4
        //   141: aload_0        
        //   142: getfield        com/appsflyer/AppsFlyerProperties.AFInAppEventType:Ljava/util/Map;
        //   145: aload           4
        //   147: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   152: pop            
        //   153: iload_2        
        //   154: iconst_1       
        //   155: iadd           
        //   156: istore_2       
        //   157: goto            113
        //   160: aload_0        
        //   161: aload_1        
        //   162: invokevirtual   com/appsflyer/AppsFlyerProperties.saveProperties:(Lcom/appsflyer/internal/AFb1dSDK;)V
        //   165: aload_0        
        //   166: iconst_1       
        //   167: putfield        com/appsflyer/AppsFlyerProperties.values:Z
        //   170: goto            179
        //   173: ldc             "Failed loading properties"
        //   175: aload_1        
        //   176: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   179: new             Ljava/lang/StringBuilder;
        //   182: dup            
        //   183: ldc_w           "Done loading properties: "
        //   186: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   189: astore_1       
        //   190: aload_1        
        //   191: aload_0        
        //   192: getfield        com/appsflyer/AppsFlyerProperties.values:Z
        //   195: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   198: pop            
        //   199: aload_1        
        //   200: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   203: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //   206: aload_0        
        //   207: monitorexit    
        //   208: return         
        //   209: aload_0        
        //   210: monitorexit    
        //   211: aload_1        
        //   212: athrow         
        //   213: astore_1       
        //   214: goto            209
        //   217: astore_1       
        //   218: goto            173
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  2      7      213    217    Any
        //  14     25     213    217    Any
        //  30     35     213    217    Any
        //  35     53     217    179    Lorg/json/JSONException;
        //  35     53     213    217    Any
        //  53     108    217    179    Lorg/json/JSONException;
        //  53     108    213    217    Any
        //  118    153    217    179    Lorg/json/JSONException;
        //  118    153    213    217    Any
        //  160    170    217    179    Lorg/json/JSONException;
        //  160    170    213    217    Any
        //  173    179    213    217    Any
        //  179    206    213    217    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    public void remove(final String s) {
        synchronized (this) {
            this.AFInAppEventType.remove(s);
        }
    }
    
    public void saveProperties(final AFb1dSDK aFb1dSDK) {
        synchronized (this) {
            this.AFInAppEventType.remove("AppsFlyerKey");
            aFb1dSDK.AFInAppEventParameterName("savedProperties", new JSONObject((Map)this.AFInAppEventType).toString());
        }
    }
    
    public void set(final String s, final int i) {
        synchronized (this) {
            this.AFInAppEventType.put(s, Integer.toString(i));
        }
    }
    
    public void set(final String s, final long i) {
        synchronized (this) {
            this.AFInAppEventType.put(s, Long.toString(i));
        }
    }
    
    public void set(final String s, final String s2) {
        synchronized (this) {
            this.AFInAppEventType.put(s, s2);
        }
    }
    
    public void set(final String s, final boolean b) {
        synchronized (this) {
            this.AFInAppEventType.put(s, Boolean.toString(b));
        }
    }
    
    public void set(final String s, final String[] array) {
        synchronized (this) {
            this.AFInAppEventType.put(s, array);
        }
    }
    
    public void setCustomData(final String s) {
        synchronized (this) {
            this.AFInAppEventType.put("additionalCustomData", s);
        }
    }
    
    public void setUserEmails(final String s) {
        synchronized (this) {
            this.AFInAppEventType.put("userEmails", s);
        }
    }
    
    public enum EmailsCryptType
    {
        NONE(0), 
        SHA256(3);
        
        private final int AFInAppEventType;
        
        private EmailsCryptType(final int afInAppEventType) {
            this.AFInAppEventType = afInAppEventType;
        }
        
        public final int getValue() {
            return this.AFInAppEventType;
        }
    }
}
