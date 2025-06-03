package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.view.Display;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFb1nSDK
  implements AFe1vSDK
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
  
  public AFb1nSDK() {}
  
  public AFb1nSDK(Context paramContext, AFf1tSDK paramAFf1tSDK, AFb1eSDK paramAFb1eSDK, AFf1iSDK paramAFf1iSDK, AFa1iSDK paramAFa1iSDK, AFe1mSDK paramAFe1mSDK, AFb1dSDK paramAFb1dSDK, AFb1gSDK paramAFb1gSDK, AFa1kSDK paramAFa1kSDK, AFe1wSDK paramAFe1wSDK, AFb1xSDK paramAFb1xSDK)
  {
    AFInAppEventType = paramContext;
    valueOf = paramAFf1tSDK;
    AFInAppEventParameterName = paramAFb1eSDK;
    values = paramAFf1iSDK;
    AFKeystoreWrapper = paramAFa1iSDK;
    afRDLog = paramAFe1mSDK;
    AFLogger = paramAFb1dSDK;
    afInfoLog = paramAFb1gSDK;
    afErrorLog = paramAFa1kSDK;
    afDebugLog = paramAFe1wSDK;
    getLevel = paramAFb1xSDK;
  }
  
  @SuppressLint({"PrivateApi"})
  private static String AFInAppEventParameterName(String paramString)
  {
    try
    {
      paramString = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class }).invoke(null, new Object[] { paramString });
      if (paramString != null) {
        return (String)paramString;
      }
    }
    finally
    {
      break label57;
      paramString = new java/lang/NullPointerException;
      paramString.<init>("null cannot be cast to non-null type kotlin.String");
      throw paramString;
      label57:
      AFLogger.afErrorLog(paramString.getMessage(), paramString);
    }
    return null;
  }
  
  public static Uri AFInAppEventType(Activity paramActivity)
  {
    if ((paramActivity != null) && (paramActivity.getIntent() != null)) {
      return paramActivity.getReferrer();
    }
    return null;
  }
  
  /* Error */
  private static String AFInAppEventType(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 127	java/util/Properties
    //   9: astore_2
    //   10: aload_2
    //   11: invokespecial 128	java/util/Properties:<init>	()V
    //   14: new 130	java/io/InputStreamReader
    //   17: astore_3
    //   18: new 132	java/io/FileInputStream
    //   21: astore 4
    //   23: aload 4
    //   25: aload_0
    //   26: invokespecial 135	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   29: aload_3
    //   30: aload 4
    //   32: invokestatic 141	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   35: invokespecial 144	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   38: aload_2
    //   39: aload_3
    //   40: invokevirtual 148	java/util/Properties:load	(Ljava/io/Reader;)V
    //   43: ldc -106
    //   45: invokestatic 152	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   48: aload_2
    //   49: aload_1
    //   50: invokevirtual 155	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   53: astore_1
    //   54: aload_3
    //   55: invokevirtual 160	java/io/Reader:close	()V
    //   58: goto +12 -> 70
    //   61: astore_0
    //   62: aload_0
    //   63: invokevirtual 105	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   66: aload_0
    //   67: invokestatic 110	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   70: aload_1
    //   71: areturn
    //   72: astore_1
    //   73: aload_3
    //   74: astore_0
    //   75: goto +6 -> 81
    //   78: astore_1
    //   79: aconst_null
    //   80: astore_0
    //   81: aload_0
    //   82: astore_3
    //   83: aload_1
    //   84: invokevirtual 105	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   87: aload_1
    //   88: invokestatic 110	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   91: aload_0
    //   92: ifnull +75 -> 167
    //   95: aload_0
    //   96: invokevirtual 160	java/io/Reader:close	()V
    //   99: goto +68 -> 167
    //   102: astore_0
    //   103: aload_0
    //   104: invokevirtual 105	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   107: aload_0
    //   108: invokestatic 110	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   111: goto +56 -> 167
    //   114: astore_0
    //   115: goto +54 -> 169
    //   118: astore_1
    //   119: aconst_null
    //   120: astore_1
    //   121: aload_1
    //   122: astore_3
    //   123: new 162	java/lang/StringBuilder
    //   126: astore 4
    //   128: aload_1
    //   129: astore_3
    //   130: aload 4
    //   132: ldc -92
    //   134: invokespecial 165	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   137: aload_1
    //   138: astore_3
    //   139: aload 4
    //   141: aload_0
    //   142: invokevirtual 170	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   145: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_1
    //   150: astore_3
    //   151: aload 4
    //   153: invokevirtual 177	java/lang/Object:toString	()Ljava/lang/String;
    //   156: invokestatic 179	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   159: aload_1
    //   160: ifnull +7 -> 167
    //   163: aload_1
    //   164: invokevirtual 160	java/io/Reader:close	()V
    //   167: aconst_null
    //   168: areturn
    //   169: aload_3
    //   170: ifnull +19 -> 189
    //   173: aload_3
    //   174: invokevirtual 160	java/io/Reader:close	()V
    //   177: goto +12 -> 189
    //   180: astore_1
    //   181: aload_1
    //   182: invokevirtual 105	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   185: aload_1
    //   186: invokestatic 110	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   189: aload_0
    //   190: athrow
    //   191: astore_1
    //   192: aload_3
    //   193: astore_1
    //   194: goto -73 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	paramFile	File
    //   0	197	1	paramString	String
    //   9	40	2	localProperties	java.util.Properties
    //   17	176	3	localObject1	Object
    //   21	131	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   54	58	61	finally
    //   38	54	72	finally
    //   6	38	78	finally
    //   95	99	102	finally
    //   163	167	102	finally
    //   83	91	114	finally
    //   123	128	114	finally
    //   130	137	114	finally
    //   139	149	114	finally
    //   151	159	114	finally
    //   6	38	118	java/io/FileNotFoundException
    //   173	177	180	finally
    //   38	54	191	java/io/FileNotFoundException
  }
  
  private boolean AFLogger$LogLevel()
  {
    AppsFlyerProperties localAppsFlyerProperties = AppsFlyerProperties.getInstance();
    if ((!localAppsFlyerProperties.getBoolean("collectAndroidIdForceByUser", false)) && (!localAppsFlyerProperties.getBoolean("collectIMEIForceByUser", false)))
    {
      AFa1eSDK.valueOf();
      if (AFa1eSDK.AFInAppEventParameterName(AFInAppEventType)) {
        return false;
      }
    }
    return true;
  }
  
  private static boolean valueOf(File paramFile)
  {
    return (paramFile == null) || (!paramFile.exists());
  }
  
  private static File values(String paramString)
  {
    if (paramString != null) {
      try
      {
        if (i.f0(paramString).toString().length() > 0)
        {
          paramString = new File(i.f0(paramString).toString());
          return paramString;
        }
      }
      finally
      {
        AFLogger.afErrorLog(paramString.getMessage(), paramString);
      }
    }
    return null;
  }
  
  @NotNull
  public final String AFInAppEventParameterName()
  {
    Object localObject = new StatFs(Environment.getDataDirectory().getAbsolutePath());
    long l1 = ((StatFs)localObject).getBlockSizeLong();
    long l2 = ((StatFs)localObject).getAvailableBlocksLong();
    long l3 = ((StatFs)localObject).getBlockCountLong();
    double d = Math.pow(2.0D, 20.0D);
    l2 = (l2 * l1 / d);
    l3 = (l3 * l1 / d);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(l2);
    ((StringBuilder)localObject).append('/');
    ((StringBuilder)localObject).append(l3);
    return localObject.toString();
  }
  
  public final void AFInAppEventParameterName(Map<String, Object> paramMap)
  {
    String str = "";
    Intrinsics.checkNotNullParameter(paramMap, "");
    Object localObject = AFInAppEventType.getSystemService("window");
    if ((localObject instanceof WindowManager)) {
      localObject = (WindowManager)localObject;
    } else {
      localObject = null;
    }
    if (localObject == null) {
      return;
    }
    int i = ((WindowManager)localObject).getDefaultDisplay().getRotation();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            localObject = str;
          } else {
            localObject = "lr";
          }
        }
        else {
          localObject = "pr";
        }
      }
      else {
        localObject = "l";
      }
    }
    else {
      localObject = "p";
    }
    paramMap.put("sc_o", localObject);
  }
  
  public final String AFInAppEventType()
  {
    boolean bool = AFLogger.values("INSTALL_STORE");
    Object localObject = null;
    if (bool) {
      return AFLogger.values("INSTALL_STORE", null);
    }
    if (afRDLog())
    {
      String str = AppsFlyerProperties.getInstance().getString("api_store_value");
      localObject = str;
      if (str == null) {
        localObject = afInfoLog.AFInAppEventType("AF_STORE");
      }
    }
    AFLogger.AFInAppEventParameterName("INSTALL_STORE", (String)localObject);
    return (String)localObject;
  }
  
  public final void AFInAppEventType(Map<String, Object> paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    boolean bool = AppsFlyerProperties.getInstance().getBoolean("disableCollectNetworkData", false);
    Object localObject = afErrorLog.AFInAppEventParameterName(AFInAppEventType);
    String str = AFInAppEventParameterName;
    Intrinsics.checkNotNullExpressionValue(str, "");
    paramMap.put("network", str);
    if (bool) {
      return;
    }
    str = valueOf;
    if (str != null) {
      paramMap.put("operator", str);
    }
    localObject = AFInAppEventType;
    if (localObject != null) {
      paramMap.put("carrier", localObject);
    }
  }
  
  public final void AFInAppEventType(boolean paramBoolean, Map<String, Object> paramMap, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    HashMap localHashMap = new HashMap();
    localHashMap.put("cpu_abi", AFInAppEventParameterName("ro.product.cpu.abi"));
    localHashMap.put("cpu_abi2", AFInAppEventParameterName("ro.product.cpu.abi2"));
    localHashMap.put("arch", AFInAppEventParameterName("os.arch"));
    localHashMap.put("build_display_id", AFInAppEventParameterName("ro.build.display.id"));
    if (paramBoolean)
    {
      Object localObject = AFInAppEventParameterName.AFInAppEventType(AFInAppEventType);
      float f = AFInAppEventParameterName;
      localObject = AFInAppEventType;
      localHashMap.put("btl", String.valueOf(f));
      if (localObject != null) {
        localHashMap.put("btch", localObject);
      }
      if (paramInt <= 2) {
        localHashMap.putAll(values.valueOf());
      }
    }
    localHashMap.put("dim", AFKeystoreWrapper.valueOf(AFInAppEventType));
    paramMap.put("deviceData", localHashMap);
  }
  
  public final String AFKeystoreWrapper()
  {
    return AFa1fSDK.values(AFInAppEventType.getApplicationContext().getPackageManager(), AFInAppEventType.getApplicationContext().getPackageName());
  }
  
  public final void AFKeystoreWrapper(Map<String, Object> paramMap, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    String str = getLevel.AFInAppEventParameterName();
    Intrinsics.checkNotNullExpressionValue(str, "");
    paramMap.put("platformextension", str);
    if (paramBoolean) {
      paramMap.put("platform_extension_v2", valueOf.AFKeystoreWrapper());
    }
  }
  
  public final String AFLogger()
  {
    AppsFlyerProperties localAppsFlyerProperties = AppsFlyerProperties.getInstance();
    Object localObject1 = localAppsFlyerProperties.getString("preInstallName");
    if (localObject1 != null) {
      return (String)localObject1;
    }
    boolean bool = AFLogger.values("preInstallName");
    Object localObject2 = null;
    Object localObject3;
    if (bool)
    {
      localObject3 = AFLogger.values("preInstallName", null);
    }
    else
    {
      if (afRDLog())
      {
        localObject1 = values(AFInAppEventParameterName("ro.appsflyer.preinstall.path"));
        localObject3 = localObject1;
        if (valueOf((File)localObject1)) {
          localObject3 = values(afInfoLog.AFInAppEventType("AF_PRE_INSTALL_PATH"));
        }
        localObject1 = localObject3;
        if (valueOf((File)localObject3)) {
          localObject1 = values("/data/local/tmp/pre_install.appsflyer");
        }
        localObject3 = localObject1;
        if (valueOf((File)localObject1)) {
          localObject3 = values("/etc/pre_install.appsflyer");
        }
        if (valueOf((File)localObject3))
        {
          localObject1 = localObject2;
        }
        else
        {
          localObject1 = AFInAppEventType.getPackageName();
          Intrinsics.checkNotNullExpressionValue(localObject1, "");
          localObject1 = AFInAppEventType((File)localObject3, (String)localObject1);
        }
        if (localObject1 == null) {
          localObject1 = afInfoLog.AFInAppEventType("AF_PRE_INSTALL_NAME");
        }
      }
      localObject3 = localObject1;
      if (localObject1 != null)
      {
        AFLogger.AFInAppEventParameterName("preInstallName", (String)localObject1);
        localObject3 = localObject1;
      }
    }
    if (localObject3 != null) {
      localAppsFlyerProperties.set("preInstallName", (String)localObject3);
    }
    return (String)localObject3;
  }
  
  public final boolean afDebugLog()
  {
    return Boolean.parseBoolean(AFLogger.values("sentSuccessfully", null));
  }
  
  public final boolean afErrorLog()
  {
    try
    {
      localObject = AFInAppEventType.getSystemService("connectivity");
      if (localObject == null) {
        break label90;
      }
      localConnectivityManager = (ConnectivityManager)localObject;
      arrayOfNetwork = localConnectivityManager.getAllNetworks();
      Intrinsics.checkNotNullExpressionValue(arrayOfNetwork, "");
      i = arrayOfNetwork.length;
      j = 0;
    }
    catch (Exception localException)
    {
      label90:
      NullPointerException localNullPointerException;
      for (;;)
      {
        Object localObject;
        ConnectivityManager localConnectivityManager;
        Network[] arrayOfNetwork;
        int i;
        int j;
        break;
        j++;
        continue;
        return false;
        localNullPointerException = new java/lang/NullPointerException;
        localNullPointerException.<init>("null cannot be cast to non-null type android.net.ConnectivityManager");
        throw localNullPointerException;
      }
      AFLogger.afErrorLog("Failed collecting ivc data", localNullPointerException);
    }
    if (j < i)
    {
      localObject = localConnectivityManager.getNetworkCapabilities(arrayOfNetwork[j]);
      if ((localObject != null) && (((NetworkCapabilities)localObject).hasTransport(4) == true) && (!((NetworkCapabilities)localObject).hasCapability(15))) {
        return true;
      }
    }
    return false;
  }
  
  public final String afInfoLog()
  {
    String str1 = AppsFlyerProperties.getInstance().getString("api_store_value");
    String str2 = str1;
    if (str1 == null) {
      str2 = afInfoLog.AFInAppEventType("AF_STORE");
    }
    return str2;
  }
  
  public final boolean afRDLog()
  {
    return !AFLogger.values("appsFlyerCount");
  }
  
  public final long valueOf()
  {
    return System.currentTimeMillis();
  }
  
  public final void valueOf(Map<String, ? extends Object> paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    AFe1mSDK localAFe1mSDK = afRDLog;
    HashMap localHashMap = new HashMap(AFKeystoreWrapper);
    AFKeystoreWrapper.clear();
    afRDLog.valueOf.AFInAppEventType("gcd");
    Intrinsics.checkNotNullExpressionValue(localHashMap, "");
    if ((localHashMap.isEmpty() ^ true))
    {
      paramMap = AFa1eSDK.values(paramMap);
      Intrinsics.checkNotNullExpressionValue(paramMap, "");
      paramMap.put("gcd", localHashMap);
    }
  }
  
  public final void valueOf(Map<String, Object> paramMap, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    Intrinsics.checkNotNullParameter(paramString, "");
    try
    {
      String str = AFLogger.values("prev_event_name", null);
      if (str != null)
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("prev_event_timestamp", AFLogger.valueOf("prev_event_timestamp", -1L));
        localJSONObject.put("prev_event_name", str);
        paramMap.put("prev_event", localJSONObject);
      }
    }
    catch (Exception paramMap)
    {
      break label122;
    }
    AFLogger.AFInAppEventParameterName("prev_event_name", paramString);
    AFLogger.AFInAppEventParameterName("prev_event_timestamp", System.currentTimeMillis());
    return;
    label122:
    AFLogger.afErrorLog("Error while processing previous event.", paramMap);
  }
  
  public final long values()
  {
    return System.currentTimeMillis() - SystemClock.elapsedRealtime();
  }
  
  public final String values(SimpleDateFormat paramSimpleDateFormat)
  {
    String str1 = "";
    Intrinsics.checkNotNullParameter(paramSimpleDateFormat, "");
    String str2 = AFLogger.values("appsFlyerFirstInstall", null);
    String str3 = str2;
    if (str2 == null)
    {
      str3 = str1;
      if (afRDLog())
      {
        AFLogger.afDebugLog("AppsFlyer: first launch detected");
        str3 = paramSimpleDateFormat.format(new Date());
      }
      AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", str3);
    }
    AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(str3)));
    return str3;
  }
  
  public final void values(Map<String, Object> paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    String str1 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
    String str2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
    if (str1 != null) {
      paramMap.put("onelink_id", str1);
    }
    if (str2 != null) {
      paramMap.put("onelink_ver", str2);
    }
  }
  
  @SuppressLint({"HardwareIds"})
  public final void values(Map<String, Object> paramMap, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramMap, "");
    Object localObject1 = AppsFlyerProperties.getInstance();
    if (((AppsFlyerProperties)localObject1).getBoolean("deviceTrackingDisabled", false))
    {
      paramMap.put("deviceTrackingDisabled", "true");
      return;
    }
    String str = afDebugLog.valueOf(AFLogger);
    if ((str != null) && (str.length() != 0)) {
      paramMap.put("imei", str);
    }
    boolean bool = ((AppsFlyerProperties)localObject1).getBoolean("collectAndroidId", false);
    localObject1 = AFLogger.values("androidIdCached", null);
    if ((bool) && ((paramString == null) || (paramString.length() == 0)))
    {
      if (AFLogger$LogLevel()) {
        try
        {
          paramString = Settings.Secure.getString(AFInAppEventType.getContentResolver(), "android_id");
          if (paramString != null) {
            break label212;
          }
          if (localObject1 == null) {
            break label210;
          }
          AFLogger.afDebugLog("use cached AndroidId: ".concat((String)localObject1));
          paramString = (String)localObject1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            if (localObject1 != null)
            {
              AFLogger.afDebugLog("use cached AndroidId: ".concat((String)localObject1));
              paramString = (String)localObject1;
            }
            else
            {
              paramString = null;
            }
            AFLogger.afErrorLog(localException.getMessage(), localException);
          }
        }
      }
    }
    else {
      if (paramString != null) {
        break label212;
      }
    }
    label210:
    paramString = null;
    label212:
    if (paramString != null)
    {
      AFLogger.AFInAppEventParameterName("androidIdCached", paramString);
      paramMap.put("android_id", paramString);
    }
    else
    {
      AFLogger.afInfoLog("Android ID was not collected.");
    }
    localObject1 = AFa1cSDK.values(AFInAppEventType);
    if (localObject1 != null)
    {
      paramString = new LinkedHashMap();
      Object localObject2 = values;
      Intrinsics.checkNotNullExpressionValue(localObject2, "");
      paramString.put("isManual", localObject2);
      localObject2 = valueOf;
      Intrinsics.checkNotNullExpressionValue(localObject2, "");
      paramString.put("val", localObject2);
      localObject1 = AFInAppEventType;
      if (localObject1 != null) {
        paramString.put("isLat", localObject1);
      }
      paramMap.put("oaid", paramString);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1nSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */