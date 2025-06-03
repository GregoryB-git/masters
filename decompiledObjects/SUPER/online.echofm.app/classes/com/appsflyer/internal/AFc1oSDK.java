package com.appsflyer.internal;

import V5.h;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONObject;

public final class AFc1oSDK
{
  public static String AFInAppEventParameterName;
  private static int afDebugLog = 0;
  private static long afErrorLog = 0L;
  private static int afRDLog = (afDebugLog + 125) % 128;
  private static String valueOf;
  private static String values;
  private final AFc1nSDK AFInAppEventType;
  private final AFb1gSDK AFKeystoreWrapper;
  private final AppsFlyerProperties AFLogger;
  private final AFc1dSDK afInfoLog;
  
  static
  {
    AFKeystoreWrapper();
    values = "https://%smonitorsdk.%s/remote-debug?app_id=";
    AFInAppEventParameterName = "https://%sgcdsdk.%s/install_data/v5.0/";
    valueOf = "https://%sonelink.%s/shortlink-sdk/v2";
  }
  
  public AFc1oSDK(AFc1nSDK paramAFc1nSDK, AFb1gSDK paramAFb1gSDK, AppsFlyerProperties paramAppsFlyerProperties, AFc1dSDK paramAFc1dSDK)
  {
    AFInAppEventType = paramAFc1nSDK;
    AFKeystoreWrapper = paramAFb1gSDK;
    AFLogger = paramAppsFlyerProperties;
    afInfoLog = paramAFc1dSDK;
  }
  
  private Map<String, Object> AFInAppEventType()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("build_number", "6.12.2");
    localHashMap.put("counter", Integer.valueOf(AFKeystoreWrapper.AFInAppEventType.values("appsFlyerCount", 0)));
    localHashMap.put("model", Build.MODEL);
    int i = Color.red(0);
    Object localObject = new Object[1];
    values("슌싮㖽黩䓋᧺ྎ찌", i + 1, (Object[])localObject);
    localHashMap.put(((String)localObject[0]).intern(), Build.BRAND);
    localHashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
    localObject = AFKeystoreWrapper.valueOf.AFInAppEventType;
    localHashMap.put("app_version_name", AFa1fSDK.AFKeystoreWrapper((Context)localObject, ((Context)localObject).getPackageName()));
    localHashMap.put("app_id", AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
    localHashMap.put("platformextension", new AFb1xSDK().AFInAppEventParameterName());
    afDebugLog = (afRDLog + 17) % 128;
    return localHashMap;
  }
  
  private static String AFKeystoreWrapper(String paramString1, String paramString2, String... paramVarArgs)
  {
    paramVarArgs = new ArrayList(Arrays.asList(paramVarArgs));
    paramVarArgs.add(1, "v2");
    String str = TextUtils.join("⁣", (String[])paramVarArgs.toArray(new String[0]));
    paramVarArgs = new StringBuilder();
    paramVarArgs.append(paramString1);
    paramVarArgs.append(paramString2);
    paramVarArgs.append("v2");
    paramString1 = AFc1nSDK.valueOf(str, paramVarArgs.toString());
    afDebugLog = (afRDLog + 67) % 128;
    return paramString1;
  }
  
  public static void AFKeystoreWrapper()
  {
    afErrorLog = -7639686596028283975L;
  }
  
  private <T> AFc1qSDK<T> valueOf(AFa1aSDK paramAFa1aSDK, AFc1hSDK<T> paramAFc1hSDK)
  {
    int i = afDebugLog + 49;
    afRDLog = i % 128;
    if (i % 2 == 0)
    {
      paramAFa1aSDK = valueOf(paramAFa1aSDK, paramAFc1hSDK, valueOf());
      throw new ArithmeticException("divide by zero");
    }
    paramAFa1aSDK = valueOf(paramAFa1aSDK, paramAFc1hSDK, valueOf());
    afRDLog = (afDebugLog + 111) % 128;
    return paramAFa1aSDK;
  }
  
  private <T> AFc1qSDK<T> valueOf(AFa1aSDK paramAFa1aSDK, AFc1hSDK<T> paramAFc1hSDK, boolean paramBoolean)
  {
    values = paramBoolean;
    AFc1nSDK localAFc1nSDK = AFInAppEventType;
    paramAFa1aSDK = new AFc1qSDK(paramAFa1aSDK, valueOf, AFKeystoreWrapper, paramAFc1hSDK);
    afRDLog = (afDebugLog + 111) % 128;
    return paramAFa1aSDK;
  }
  
  private boolean valueOf()
  {
    afDebugLog = (afRDLog + 7) % 128;
    if ((AFLogger.getBoolean("http_cache", true) ^ true))
    {
      afRDLog = (afDebugLog + 37) % 128;
      return true;
    }
    return false;
  }
  
  private static void values(String arg0, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject = ???;
    if (??? != null) {
      localObject = ???.toCharArray();
    }
    localObject = (char[])localObject;
    String str;
    synchronized (AFg1rSDK.AFInAppEventParameterName)
    {
      localObject = AFg1rSDK.AFInAppEventType(afErrorLog, (char[])localObject, paramInt);
      AFg1rSDK.AFInAppEventType = 4;
      paramInt = AFg1rSDK.AFInAppEventType;
      if (paramInt < localObject.length)
      {
        AFg1rSDK.AFKeystoreWrapper = paramInt - 4;
        paramInt = AFg1rSDK.AFInAppEventType;
        localObject[paramInt] = ((char)(char)(int)(localObject[paramInt] ^ localObject[(paramInt % 4)] ^ AFg1rSDK.AFKeystoreWrapper * afErrorLog));
        AFg1rSDK.AFInAppEventType += 1;
      }
    }
  }
  
  public final AFc1qSDK<String> AFInAppEventParameterName(@NonNull String paramString)
  {
    paramString = new AFa1aSDK(paramString, null, "GET", Collections.emptyMap(), false);
    afDebugLog = 10000;
    AFInAppEventType = false;
    paramString = valueOf(paramString, new AFc1iSDK());
    afRDLog = (afDebugLog + 53) % 128;
    return paramString;
  }
  
  public final AFc1qSDK<String> AFInAppEventParameterName(Map<String, Object> paramMap, String paramString1, String paramString2)
  {
    int i = afRDLog + 109;
    afDebugLog = i % 128;
    if (i % 2 == 0) {
      try
      {
        byte[] arrayOfByte = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - View.resolveSizeAndState(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) < 0L) + true, (ViewConfiguration.getPressedStateDuration() >> 16) + 74)).getMethod("values", new Class[] { Map.class, String.class }).invoke(null, new Object[] { paramMap, paramString1 });
        AFf1fSDK localAFf1fSDK = new AFf1fSDK(AFKeystoreWrapper);
        if ((paramString2 != null) && (paramString2.length() != 0) && (!new Regex("4.?(\\d+)?.?(\\d+)").b(paramString2)) && (!new Regex("3.?(\\d+)?.?(\\d+)").b(paramString2)))
        {
          paramString1 = AFf1fSDK.onAttributionFailureNative;
          paramMap = paramString1;
          if (paramString1 != null) {
            break label285;
          }
          i = afRDLog + 31;
          afDebugLog = i % 128;
          if (i % 2 == 0) {
            paramMap = AFInAppEventType;
          }
        }
        for (paramString1 = AFf1fSDK.AFVersionDeclaration;; paramString1 = AFf1fSDK.afInfoLog)
        {
          paramMap = paramMap.valueOf(paramString1);
          break;
          AFInAppEventType.valueOf(AFf1fSDK.AFVersionDeclaration);
          throw null;
          i = afRDLog + 7;
          afDebugLog = i % 128;
          if (i % 2 != 0) {
            break label355;
          }
          paramString1 = AFf1fSDK.init;
          paramMap = paramString1;
          if (paramString1 != null) {
            break;
          }
          paramMap = AFInAppEventType;
        }
        label285:
        paramString1 = new StringBuilder();
        paramString1.append(paramMap);
        paramString1.append(values.valueOf.AFInAppEventType.getPackageName());
        return valueOf(new AFa1aSDK(localAFf1fSDK.AFInAppEventParameterName(paramString1.toString()), arrayOfByte, "POST", Collections.emptyMap(), true), new AFc1iSDK());
        label355:
        paramMap = AFf1fSDK.AFKeystoreWrapper;
        throw null;
      }
      finally
      {
        try
        {
          paramMap = paramString1.getCause();
          if (paramMap != null) {
            throw paramMap;
          }
        }
        catch (Exception paramMap) {}
      }
    }
    try
    {
      paramMap = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)((ViewConfiguration.getJumpTapTimeout() >> 16) + 12254), 37 - (ViewConfiguration.getTapTimeout() >> 16), 74 - TextUtils.indexOf("", ""))).getMethod("values", new Class[] { Map.class, String.class }).invoke(null, new Object[] { paramMap, paramString1 });
      try
      {
        throw null;
      }
      finally {}
      AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", paramMap);
    }
    finally
    {
      paramString1 = paramMap.getCause();
      if (paramString1 != null) {
        throw paramString1;
      }
    }
    return null;
  }
  
  public final AFc1qSDK<Map<String, String>> AFInAppEventType(@NonNull String paramString1, @NonNull String paramString2, @NonNull UUID paramUUID, @NonNull String paramString3)
  {
    String str1 = paramUUID.toString();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(String.format(valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }));
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append("?id=");
    ((StringBuilder)localObject).append(paramString2);
    String str2 = localObject.toString();
    Map localMap = AFInAppEventType();
    localObject = String.valueOf(localMap.get("build_number"));
    HashMap localHashMap = new HashMap();
    localHashMap.put("Af-UUID", paramUUID.toString());
    localHashMap.put("Af-Meta-Sdk-Ver", localObject);
    localHashMap.put("Af-Meta-Counter", String.valueOf(localMap.get("counter")));
    localHashMap.put("Af-Meta-Model", String.valueOf(localMap.get("model")));
    localHashMap.put("Af-Meta-Platform", String.valueOf(localMap.get("platformextension")));
    localHashMap.put("Af-Meta-System-Version", String.valueOf(localMap.get("sdk")));
    int i = ViewConfiguration.getTouchSlop();
    paramUUID = new Object[1];
    values("싊슋语䠲떙廷㋆ᖏ챇髈⎡ҙ?꧆ბ㙡", (i >> 8) + 1, paramUUID);
    localHashMap.put(((String)paramUUID[0]).intern(), AFKeystoreWrapper(paramString3, str1, new String[] { "GET", str1, paramString1, paramString2, localObject }));
    paramString1 = valueOf(new AFa1aSDK(str2, null, "GET", localHashMap, false), new AFc1mSDK());
    i = afRDLog + 75;
    afDebugLog = i % 128;
    if (i % 2 == 0) {
      return paramString1;
    }
    throw null;
  }
  
  public final AFc1qSDK<String> AFInAppEventType(@NonNull String paramString1, @NonNull Map<String, String> paramMap, String paramString2, @NonNull UUID paramUUID, @NonNull String paramString3)
  {
    paramUUID = paramUUID.toString();
    Object localObject = new HashMap();
    ((Map)localObject).put("ttl", "-1");
    ((Map)localObject).put("uuid", paramUUID);
    ((Map)localObject).put("data", paramMap);
    ((Map)localObject).put("meta", AFInAppEventType());
    if (paramString2 != null)
    {
      afDebugLog = (afRDLog + 89) % 128;
      ((Map)localObject).put("brand_domain", paramString2);
    }
    paramString2 = AFa1rSDK.AFInAppEventType((Map)localObject).toString();
    paramMap = new HashMap();
    int i = ViewConfiguration.getMaximumFlingVelocity();
    localObject = new Object[1];
    values("싊슋语䠲떙廷㋆ᖏ챇髈⎡ҙ?꧆ბ㙡", (i >> 16) + 1, (Object[])localObject);
    paramMap.put(((String)localObject[0]).intern(), AFKeystoreWrapper(paramString3, paramUUID, new String[] { "POST", paramString2 }));
    paramUUID = new StringBuilder();
    paramUUID.append(String.format(valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }));
    paramUUID.append("/");
    paramUUID.append(paramString1);
    paramString1 = valueOf(new AFa1aSDK(paramUUID.toString(), paramString2.getBytes(Charset.defaultCharset()), "POST", paramMap, false), new AFc1iSDK(), true);
    afRDLog = (afDebugLog + 7) % 128;
    return paramString1;
  }
  
  public final AFc1qSDK<String> AFKeystoreWrapper(AFa1qSDK paramAFa1qSDK, String paramString, AFb1bSDK paramAFb1bSDK)
  {
    afRDLog = (afDebugLog + 67) % 128;
    try
    {
      paramString = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(true - (AudioTrack.getMinVolume() < 0.0F)), 37 - (KeyEvent.getMaxKeyCode() >> 16), 74 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("AFKeystoreWrapper", new Class[] { AFa1qSDK.class, String.class, AFb1bSDK.class }).invoke(null, new Object[] { paramAFa1qSDK, paramString, paramAFb1bSDK });
      paramAFa1qSDK = valueOf(new AFa1aSDK(afRDLog, paramString, "POST", Collections.emptyMap(), paramAFa1qSDK.values()), new AFc1iSDK());
      afRDLog = (afDebugLog + 125) % 128;
      return paramAFa1qSDK;
    }
    finally
    {
      try
      {
        paramString = paramAFa1qSDK.getCause();
        if (paramString != null) {
          throw paramString;
        }
      }
      catch (Exception paramAFa1qSDK)
      {
        break label164;
        throw paramAFa1qSDK;
        label164:
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", paramAFa1qSDK);
      }
    }
    return null;
  }
  
  @NonNull
  public final AFc1qSDK<String> valueOf(Map<String, Object> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format(values, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }));
    localStringBuilder.append(AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
    paramMap = valueOf(new AFa1aSDK(localStringBuilder.toString(), new JSONObject(paramMap).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), false, false), new AFc1iSDK());
    afRDLog = (afDebugLog + 49) % 128;
    return paramMap;
  }
  
  public final AFc1qSDK<String> values(AFe1fSDK paramAFe1fSDK)
  {
    byte[] arrayOfByte = paramAFe1fSDK.AFKeystoreWrapper();
    paramAFe1fSDK = valueOf(new AFa1aSDK(afRDLog, arrayOfByte, "POST", Collections.emptyMap(), true), new AFc1iSDK());
    afRDLog = (afDebugLog + 83) % 128;
    return paramAFe1fSDK;
  }
  
  public final AFc1qSDK<Map<String, Object>> values(String paramString1, String paramString2)
  {
    String str = AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName();
    AFb1gSDK localAFb1gSDK = AFKeystoreWrapper;
    paramString1 = valueOf(AFc1pSDK.AFInAppEventParameterName(str, AFb1zSDK.valueOf(valueOf, AFInAppEventType), paramString1, paramString2), new AFc1rSDK());
    int i = afDebugLog + 55;
    afRDLog = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
    return paramString1;
  }
  
  public final AFc1qSDK<String> values(Map<String, Object> paramMap, String paramString1, String paramString2)
  {
    int i = afRDLog + 83;
    afDebugLog = i % 128;
    if (i % 2 == 0) {
      try
      {
        byte[] arrayOfByte = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - TextUtils.getOffsetBefore("", 0)), 37 - Color.blue(0), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("values", new Class[] { Map.class, String.class }).invoke(null, new Object[] { paramMap, paramString1 });
        AFf1fSDK localAFf1fSDK = new AFf1fSDK(AFKeystoreWrapper);
        if ((paramString2 != null) && (paramString2.length() != 0) && (!new Regex("4.?(\\d+)?.?(\\d+)").b(paramString2)) && (!new Regex("3.?(\\d+)?.?(\\d+)").b(paramString2)))
        {
          afRDLog = (afDebugLog + 85) % 128;
          paramString1 = AFf1fSDK.onResponseNative;
          paramMap = paramString1;
          if (paramString1 != null) {
            break label272;
          }
          i = afRDLog + 27;
          afDebugLog = i % 128;
          if (i % 2 == 0) {
            paramString1 = AFInAppEventType;
          }
        }
        for (paramMap = AFf1fSDK.AFLogger$LogLevel;; paramMap = AFf1fSDK.afDebugLog)
        {
          paramMap = paramString1.valueOf(paramMap);
          break;
          AFInAppEventType.valueOf(AFf1fSDK.AFLogger$LogLevel);
          throw null;
          paramString1 = AFf1fSDK.onInstallConversionFailureNative;
          paramMap = paramString1;
          if (paramString1 != null) {
            break;
          }
          paramString1 = AFInAppEventType;
        }
        label272:
        paramString1 = new StringBuilder();
        paramString1.append(paramMap);
        paramString1.append(values.valueOf.AFInAppEventType.getPackageName());
        return valueOf(new AFa1aSDK(localAFf1fSDK.AFInAppEventParameterName(paramString1.toString()), arrayOfByte, "POST", Collections.emptyMap(), true), new AFc1iSDK());
      }
      finally
      {
        try
        {
          paramMap = paramString1.getCause();
          if (paramMap != null) {
            throw paramMap;
          }
        }
        catch (Exception paramMap) {}
      }
    }
    try
    {
      paramMap = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, TextUtils.indexOf("", "", 0) + 74)).getMethod("values", new Class[] { Map.class, String.class }).invoke(null, new Object[] { paramMap, paramString1 });
      try
      {
        throw null;
      }
      finally {}
      AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", paramMap);
    }
    finally
    {
      paramMap = paramString1.getCause();
      if (paramMap != null) {
        throw paramMap;
      }
    }
    return null;
  }
  
  @NonNull
  public final AFc1qSDK<AFe1qSDK> values(boolean paramBoolean1, boolean paramBoolean2, @NonNull String paramString, int paramInt)
  {
    AFc1dSDK localAFc1dSDK = afInfoLog;
    Intrinsics.checkNotNullParameter(paramString, "");
    String str1;
    if (paramBoolean1)
    {
      str1 = AFc1dSDK.AFKeystoreWrapper;
      afDebugLog = (afRDLog + 81) % 128;
    }
    else
    {
      str1 = AFc1dSDK.AFInAppEventParameterName;
    }
    String str2;
    if ((paramBoolean2 ^ true)) {
      str2 = "";
    } else {
      str2 = "stg";
    }
    Object localObject = x.a;
    if (AFc1dSDK.AFInAppEventType())
    {
      localObject = (String)AFInAppEventType.getValue();
      afDebugLog = (afRDLog + 29) % 128;
    }
    else
    {
      localObject = "";
    }
    paramString = String.format(str1, Arrays.copyOf(new Object[] { localObject, str2, localAFc1dSDK.AFInAppEventParameterName(), paramString }, 4));
    Intrinsics.checkNotNullExpressionValue(paramString, "");
    paramString = new AFa1aSDK(paramString, "GET");
    afDebugLog = 1500;
    return valueOf(paramString, new AFc1jSDK());
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1oSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */