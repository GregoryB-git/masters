package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class AFe1wSDK
{
  public volatile String AFInAppEventParameterName;
  public volatile boolean AFInAppEventType = false;
  @NonNull
  public final AFb1bSDK AFKeystoreWrapper;
  private boolean afErrorLog = false;
  @NonNull
  private final AFe1xSDK afInfoLog;
  Map<String, Object> valueOf;
  public volatile String values;
  
  public AFe1wSDK(@NonNull AFb1bSDK paramAFb1bSDK, @NonNull AFe1xSDK paramAFe1xSDK)
  {
    AFKeystoreWrapper = paramAFb1bSDK;
    afInfoLog = paramAFe1xSDK;
  }
  
  private static boolean AFInAppEventParameterName(Context paramContext)
  {
    if ((!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false)) && (!AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)))
    {
      AFa1eSDK.valueOf();
      if (AFa1eSDK.AFInAppEventParameterName(paramContext)) {
        return false;
      }
    }
    return true;
  }
  
  private boolean values()
  {
    Map localMap = valueOf;
    return (localMap != null) && (!localMap.isEmpty());
  }
  
  public final Map<String, Object> AFInAppEventParameterName(Map<String, Object> paramMap)
  {
    try
    {
      Context localContext = AFKeystoreWrapper.AFInAppEventType;
      try
      {
        paramMap = (Map)((Class)AFb1oSDK.values((ViewConfiguration.getLongPressTimeout() >> 16) + 37, View.getDefaultSize(0, 0) + 87, (char)(TextUtils.indexOf("", '0', 0, 0) + 1))).getDeclaredConstructor(new Class[] { Map.class, Context.class }).newInstance(new Object[] { paramMap, localContext });
        return paramMap;
      }
      finally
      {
        paramMap = ((Throwable)localObject).getCause();
        if (paramMap == null) {
          break label97;
        }
      }
      throw paramMap;
    }
    catch (Exception paramMap)
    {
      break label99;
      label97:
      throw ((Throwable)localObject);
      label99:
      AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", paramMap);
    }
    return new HashMap();
  }
  
  public final boolean AFInAppEventParameterName()
  {
    try
    {
      Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
      long l = System.currentTimeMillis();
      AFe1xSDK localAFe1xSDK = afInfoLog;
      Object localObject1 = AFKeystoreWrapper.AFInAppEventType;
      AFe1xSDK.AFa1vSDK local4 = new com/appsflyer/internal/AFe1wSDK$4;
      local4.<init>(this, l);
      try
      {
        Object localObject2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
        Class localClass = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
        Method localMethod = ((Class)localObject2).getMethod("checkLicense", new Class[] { Long.TYPE, Context.class, localClass });
        localObject2 = new com/appsflyer/internal/AFe1xSDK$4;
        ((AFe1xSDK.4)localObject2).<init>(localAFe1xSDK, local4);
        localMethod.invoke(null, new Object[] { Long.valueOf(l), localObject1, Proxy.newProxyInstance(localClass.getClassLoader(), new Class[] { localClass }, (InvocationHandler)localObject2) });
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException)
      {
        break label178;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label187;
      }
      catch (ClassNotFoundException localClassNotFoundException1)
      {
        break label196;
      }
      localObject1 = localClassNotFoundException1.getClass();
      for (;;)
      {
        local4.AFInAppEventParameterName(((Class)localObject1).getSimpleName(), localClassNotFoundException1);
        break;
        label178:
        localObject1 = localClassNotFoundException1.getClass();
        continue;
        label187:
        localObject1 = localClassNotFoundException1.getClass();
        continue;
        label196:
        localObject1 = localClassNotFoundException1.getClass();
      }
      afErrorLog = true;
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      afErrorLog = false;
    }
    return afErrorLog;
  }
  
  public final boolean AFInAppEventType()
  {
    return (afErrorLog) && (!values());
  }
  
  public final boolean AFKeystoreWrapper()
  {
    return AFInAppEventType;
  }
  
  public final String valueOf(AFb1dSDK paramAFb1dSDK)
  {
    boolean bool = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", false);
    Object localObject1 = paramAFb1dSDK.values("imeiCached", null);
    if ((bool) && (AFb1uSDK.values(values)))
    {
      Object localObject2 = AFKeystoreWrapper.AFInAppEventType;
      if ((localObject2 == null) || (!AFInAppEventParameterName((Context)localObject2))) {
        break label238;
      }
      try
      {
        localObject2 = (TelephonyManager)((Context)localObject2).getSystemService("phone");
        localObject2 = (String)localObject2.getClass().getMethod("getDeviceId", new Class[0]).invoke(localObject2, new Object[0]);
        if (localObject2 != null) {
          localObject1 = localObject2;
        } else if (localObject1 != null) {
          AFLogger.afDebugLog("use cached IMEI: ".concat((String)localObject1));
        }
      }
      catch (Exception localException)
      {
        break label138;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label170;
      }
      localObject1 = null;
    }
    for (;;)
    {
      break;
      label138:
      if (localObject1 != null) {
        AFLogger.afDebugLog("use cached IMEI: ".concat((String)localObject1));
      } else {
        localObject1 = null;
      }
      StringBuilder localStringBuilder = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
      break label199;
      label170:
      if (localObject1 != null) {
        AFLogger.afDebugLog("use cached IMEI: ".concat((String)localObject1));
      } else {
        localObject1 = null;
      }
      localStringBuilder = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
      label199:
      localStringBuilder.append(localInvocationTargetException.getMessage());
      AFLogger.afErrorLog(localStringBuilder.toString(), localInvocationTargetException);
      continue;
      if (values != null) {
        localObject1 = values;
      } else {
        label238:
        localObject1 = null;
      }
    }
    if (!AFb1uSDK.values((String)localObject1))
    {
      paramAFb1dSDK.AFInAppEventParameterName("imeiCached", (String)localObject1);
      return (String)localObject1;
    }
    AFLogger.afInfoLog("IMEI was not collected.");
    return null;
  }
  
  @NonNull
  public final Map<String, Object> valueOf()
  {
    HashMap localHashMap1 = new HashMap();
    if (values()) {}
    for (;;)
    {
      localHashMap1.put("lvl", valueOf);
      break;
      if (!afErrorLog) {
        break;
      }
      HashMap localHashMap2 = new HashMap();
      valueOf = localHashMap2;
      localHashMap2.put("error", "operation timed out.");
    }
    return localHashMap1;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */