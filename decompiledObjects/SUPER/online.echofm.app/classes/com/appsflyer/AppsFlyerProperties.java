package com.appsflyer;

import com.appsflyer.internal.AFb1dSDK;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

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
  private static final AppsFlyerProperties valueOf = new AppsFlyerProperties();
  public boolean AFInAppEventParameterName;
  private final Map<String, Object> AFInAppEventType = new HashMap();
  public String AFKeystoreWrapper;
  private boolean values = false;
  
  private boolean AFKeystoreWrapper()
  {
    return values;
  }
  
  public static AppsFlyerProperties getInstance()
  {
    return valueOf;
  }
  
  public final boolean AFInAppEventType()
  {
    return AFInAppEventParameterName;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    paramString = getString(paramString);
    if (paramString == null) {
      return paramBoolean;
    }
    return Boolean.parseBoolean(paramString);
  }
  
  public int getInt(String paramString, int paramInt)
  {
    paramString = getString(paramString);
    if (paramString == null) {
      return paramInt;
    }
    return Integer.parseInt(paramString);
  }
  
  public long getLong(String paramString, long paramLong)
  {
    paramString = getString(paramString);
    if (paramString == null) {
      return paramLong;
    }
    return Long.parseLong(paramString);
  }
  
  public Object getObject(String paramString)
  {
    try
    {
      paramString = AFInAppEventType.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public String getReferrer(AFb1dSDK paramAFb1dSDK)
  {
    String str = AFKeystoreWrapper;
    if (str != null) {
      return str;
    }
    if (getString("AF_REFERRER") != null) {
      return getString("AF_REFERRER");
    }
    return paramAFb1dSDK.values("referrer", null);
  }
  
  public String getString(String paramString)
  {
    try
    {
      paramString = (String)AFInAppEventType.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public boolean isEnableLog()
  {
    AFLogger.LogLevel localLogLevel = AFLogger.LogLevel.NONE;
    return getInt("logLevel", localLogLevel.getLevel()) > localLogLevel.getLevel();
  }
  
  public boolean isLogsDisabledCompletely()
  {
    return getBoolean("disableLogs", false);
  }
  
  public boolean isOtherSdkStringDisabled()
  {
    return getBoolean("disableOtherSdk", false);
  }
  
  /* Error */
  public void loadProperties(AFb1dSDK paramAFb1dSDK)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 209	com/appsflyer/AppsFlyerProperties:AFKeystoreWrapper	()Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_1
    //   15: ldc -45
    //   17: aconst_null
    //   18: invokeinterface 182 3 0
    //   23: astore_3
    //   24: aload_3
    //   25: ifnull +186 -> 211
    //   28: ldc -43
    //   30: invokestatic 219	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   33: new 221	org/json/JSONObject
    //   36: astore 4
    //   38: aload 4
    //   40: aload_3
    //   41: invokespecial 223	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   44: aload 4
    //   46: invokevirtual 227	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   49: astore_3
    //   50: aload_3
    //   51: invokeinterface 232 1 0
    //   56: ifeq +58 -> 114
    //   59: aload_3
    //   60: invokeinterface 236 1 0
    //   65: checkcast 184	java/lang/String
    //   68: astore 5
    //   70: aload_0
    //   71: getfield 126	com/appsflyer/AppsFlyerProperties:AFInAppEventType	Ljava/util/Map;
    //   74: aload 5
    //   76: invokeinterface 169 2 0
    //   81: ifnonnull -31 -> 50
    //   84: aload_0
    //   85: getfield 126	com/appsflyer/AppsFlyerProperties:AFInAppEventType	Ljava/util/Map;
    //   88: aload 5
    //   90: aload 4
    //   92: aload 5
    //   94: invokevirtual 237	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   97: invokeinterface 241 3 0
    //   102: pop
    //   103: goto -53 -> 50
    //   106: astore_1
    //   107: goto +107 -> 214
    //   110: astore_1
    //   111: goto +67 -> 178
    //   114: iconst_0
    //   115: istore 6
    //   117: iload 6
    //   119: iconst_3
    //   120: if_icmpge +45 -> 165
    //   123: iconst_3
    //   124: anewarray 184	java/lang/String
    //   127: dup
    //   128: iconst_0
    //   129: ldc -13
    //   131: aastore
    //   132: dup
    //   133: iconst_1
    //   134: ldc -11
    //   136: aastore
    //   137: dup
    //   138: iconst_2
    //   139: ldc -9
    //   141: aastore
    //   142: iload 6
    //   144: aaload
    //   145: astore 4
    //   147: aload_0
    //   148: getfield 126	com/appsflyer/AppsFlyerProperties:AFInAppEventType	Ljava/util/Map;
    //   151: aload 4
    //   153: invokeinterface 250 2 0
    //   158: pop
    //   159: iinc 6 1
    //   162: goto -45 -> 117
    //   165: aload_0
    //   166: aload_1
    //   167: invokevirtual 253	com/appsflyer/AppsFlyerProperties:saveProperties	(Lcom/appsflyer/internal/AFb1dSDK;)V
    //   170: aload_0
    //   171: iconst_1
    //   172: putfield 128	com/appsflyer/AppsFlyerProperties:values	Z
    //   175: goto +9 -> 184
    //   178: ldc -1
    //   180: aload_1
    //   181: invokestatic 259	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: new 261	java/lang/StringBuilder
    //   187: astore_1
    //   188: aload_1
    //   189: ldc_w 263
    //   192: invokespecial 264	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   195: aload_1
    //   196: aload_0
    //   197: getfield 128	com/appsflyer/AppsFlyerProperties:values	Z
    //   200: invokevirtual 268	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload_1
    //   205: invokevirtual 272	java/lang/Object:toString	()Ljava/lang/String;
    //   208: invokestatic 219	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   211: aload_0
    //   212: monitorexit
    //   213: return
    //   214: aload_0
    //   215: monitorexit
    //   216: aload_1
    //   217: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	AppsFlyerProperties
    //   0	218	1	paramAFb1dSDK	AFb1dSDK
    //   6	2	2	bool	boolean
    //   23	37	3	localObject1	Object
    //   36	116	4	localObject2	Object
    //   68	25	5	str	String
    //   115	45	6	i	int
    // Exception table:
    //   from	to	target	type
    //   2	7	106	finally
    //   14	24	106	finally
    //   28	33	106	finally
    //   33	50	106	finally
    //   50	103	106	finally
    //   123	159	106	finally
    //   165	175	106	finally
    //   178	184	106	finally
    //   184	211	106	finally
    //   33	50	110	org/json/JSONException
    //   50	103	110	org/json/JSONException
    //   123	159	110	org/json/JSONException
    //   165	175	110	org/json/JSONException
  }
  
  public void remove(String paramString)
  {
    try
    {
      AFInAppEventType.remove(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void saveProperties(AFb1dSDK paramAFb1dSDK)
  {
    try
    {
      AFInAppEventType.remove("AppsFlyerKey");
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(AFInAppEventType);
      paramAFb1dSDK.AFInAppEventParameterName("savedProperties", localJSONObject.toString());
      return;
    }
    finally
    {
      paramAFb1dSDK = finally;
      throw paramAFb1dSDK;
    }
  }
  
  public void set(String paramString, int paramInt)
  {
    try
    {
      AFInAppEventType.put(paramString, Integer.toString(paramInt));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void set(String paramString, long paramLong)
  {
    try
    {
      AFInAppEventType.put(paramString, Long.toString(paramLong));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void set(String paramString1, String paramString2)
  {
    try
    {
      AFInAppEventType.put(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void set(String paramString, boolean paramBoolean)
  {
    try
    {
      AFInAppEventType.put(paramString, Boolean.toString(paramBoolean));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void set(String paramString, String[] paramArrayOfString)
  {
    try
    {
      AFInAppEventType.put(paramString, paramArrayOfString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setCustomData(String paramString)
  {
    try
    {
      AFInAppEventType.put("additionalCustomData", paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setUserEmails(String paramString)
  {
    try
    {
      AFInAppEventType.put("userEmails", paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static enum EmailsCryptType
  {
    private final int AFInAppEventType;
    
    static
    {
      EmailsCryptType localEmailsCryptType1 = new EmailsCryptType("NONE", 0, 0);
      NONE = localEmailsCryptType1;
      EmailsCryptType localEmailsCryptType2 = new EmailsCryptType("SHA256", 1, 3);
      SHA256 = localEmailsCryptType2;
      valueOf = new EmailsCryptType[] { localEmailsCryptType1, localEmailsCryptType2 };
    }
    
    private EmailsCryptType(int paramInt)
    {
      AFInAppEventType = paramInt;
    }
    
    public final int getValue()
    {
      return AFInAppEventType;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.AppsFlyerProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */