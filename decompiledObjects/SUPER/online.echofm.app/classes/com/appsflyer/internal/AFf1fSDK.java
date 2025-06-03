package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1fSDK
{
  @NotNull
  public static final String AFInAppEventParameterName;
  @NotNull
  public static final String AFKeystoreWrapper;
  @NotNull
  public static final String AFLogger;
  @NotNull
  public static final String AFLogger$LogLevel = "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=";
  @NotNull
  public static final String AFVersionDeclaration = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=";
  public static String AppsFlyer2dXConversionCallback;
  @NotNull
  public static final String afDebugLog;
  @NotNull
  public static final String afErrorLog;
  public static String afErrorLogForExcManagerOnly;
  @NotNull
  public static final String afInfoLog;
  @NotNull
  public static final String afRDLog;
  public static String afWarnLog;
  public static String getLevel;
  public static String init;
  public static String onAppOpenAttributionNative;
  public static String onAttributionFailureNative;
  public static String onInstallConversionDataLoadedNative;
  public static String onInstallConversionFailureNative;
  @NotNull
  private static final String onResponseErrorNative;
  public static String onResponseNative;
  @NotNull
  public static final String valueOf;
  @NotNull
  public final AFf1eSDK AFInAppEventType;
  @NotNull
  public final AFb1gSDK values;
  
  static
  {
    new AFa1ySDK((byte)0);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(AFa1eSDK.AFKeystoreWrapper);
    ((StringBuilder)localObject).append("/androidevent?app_id=");
    localObject = localObject.toString();
    onResponseErrorNative = (String)localObject;
    StringBuilder localStringBuilder = new StringBuilder("https://%sattr.%s/api/v");
    localStringBuilder.append((String)localObject);
    AFKeystoreWrapper = localStringBuilder.toString();
    AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.12.2/android?app_id=";
    valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.2/android?app_id=";
    localStringBuilder = new StringBuilder("https://%sconversions.%s/api/v");
    localStringBuilder.append((String)localObject);
    afRDLog = localStringBuilder.toString();
    localStringBuilder = new StringBuilder("https://%slaunches.%s/api/v");
    localStringBuilder.append((String)localObject);
    afErrorLog = localStringBuilder.toString();
    localStringBuilder = new StringBuilder("https://%sinapps.%s/api/v");
    localStringBuilder.append((String)localObject);
    AFLogger = localStringBuilder.toString();
    afDebugLog = "https://%sars.%s/api/v2/android/validate_subscription?app_id=";
    afInfoLog = "https://%sviap.%s/api/v1/android/validate_purchase?app_id=";
  }
  
  public AFf1fSDK(@NotNull AFb1gSDK paramAFb1gSDK)
  {
    this(paramAFb1gSDK, (byte)0);
  }
  
  private AFf1fSDK(@NotNull AFb1gSDK paramAFb1gSDK, @NotNull AFf1eSDK paramAFf1eSDK)
  {
    values = paramAFb1gSDK;
    AFInAppEventType = paramAFf1eSDK;
  }
  
  public static String AFInAppEventParameterName(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    if (!paramBoolean) {
      paramString = "&buildnumber=6.12.2";
    } else {
      paramString = "";
    }
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public final String AFInAppEventParameterName(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    paramString = values.values();
    if (paramString != null) {
      paramString = "&channel=".concat(paramString);
    } else {
      paramString = null;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  @Metadata
  public static final class AFa1ySDK {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1fSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */