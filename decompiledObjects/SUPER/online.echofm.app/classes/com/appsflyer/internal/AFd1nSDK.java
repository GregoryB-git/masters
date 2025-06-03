package com.appsflyer.internal;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

public final class AFd1nSDK
  extends AFd1oSDK<Map<String, String>>
{
  private final boolean AFLogger$LogLevel;
  private String AFVersionDeclaration;
  private final AFc1oSDK afErrorLogForExcManagerOnly;
  public AFa1xSDK afInfoLog;
  private String afWarnLog;
  private String getLevel;
  private final UUID onAppOpenAttributionNative;
  
  public AFd1nSDK(@NonNull AFc1xSDK paramAFc1xSDK, @NonNull UUID paramUUID, @NonNull Uri paramUri)
  {
    super(localAFd1vSDK1, new AFd1vSDK[] { localAFd1vSDK2 }, paramAFc1xSDK, str);
    afErrorLogForExcManagerOnly = paramAFc1xSDK.AFKeystoreWrapper();
    onAppOpenAttributionNative = paramUUID;
    boolean bool3 = bool2;
    boolean bool4 = bool1;
    try
    {
      if (!AFb1uSDK.values(paramUri.getHost()))
      {
        bool3 = bool2;
        bool4 = bool1;
        if (!AFb1uSDK.values(paramUri.getPath()))
        {
          bool3 = bool2;
          paramAFc1xSDK = paramAFc1xSDK.AppsFlyer2dXConversionCallback();
        }
      }
      boolean bool5;
      label406:
      label432:
      label490:
      AFLogger$LogLevel = bool4;
    }
    catch (Exception paramAFc1xSDK)
    {
      try
      {
        paramAFc1xSDK = ((Class)AFb1oSDK.values(37 - View.getDefaultSize(0, 0), true - (SystemClock.elapsedRealtime() < 0L), (char)(ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredConstructor(new Class[] { Uri.class, AFb1sSDK.class }).newInstance(new Object[] { paramUri, paramAFc1xSDK });
        try
        {
          paramAFc1xSDK = ((Class)AFb1oSDK.values(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (char)View.getDefaultSize(0, 0))).getMethod("AFInAppEventType", null).invoke(paramAFc1xSDK, null);
          try
          {
            bool5 = ((Boolean)((Class)AFb1oSDK.values(View.MeasureSpec.getSize(0) + 50, 37 - TextUtils.getOffsetBefore("", 0), (char)(62865 - KeyEvent.getDeadChar(0, 0)))).getMethod("AFInAppEventParameterName", null).invoke(paramAFc1xSDK, null)).booleanValue();
            try
            {
              bool1 = ((Boolean)((Class)AFb1oSDK.values(View.combineMeasuredStates(0, 0) + 50, 37 - TextUtils.getCapsMode("", 0, 0), (char)(62865 - TextUtils.getTrimmedLength("")))).getMethod("valueOf", null).invoke(paramAFc1xSDK, null)).booleanValue();
              bool3 = bool1;
              paramAFc1xSDK = paramUri.getPath().split("/");
              bool4 = bool1;
              if (!bool5) {
                break label500;
              }
              bool3 = bool1;
              bool4 = bool1;
              if (paramAFc1xSDK.length != 3) {
                break label500;
              }
              bool3 = bool1;
              afWarnLog = paramAFc1xSDK[1];
              bool3 = bool1;
              AFVersionDeclaration = paramAFc1xSDK[2];
              bool3 = bool1;
              getLevel = paramUri.toString();
              bool4 = bool1;
            }
            finally
            {
              bool3 = bool2;
              paramAFc1xSDK = paramUUID.getCause();
              if (paramAFc1xSDK == null) {
                break label406;
              }
              bool3 = bool2;
              throw paramAFc1xSDK;
              bool3 = bool2;
              throw paramUUID;
              paramAFc1xSDK = finally;
              bool3 = bool2;
              paramUUID = paramAFc1xSDK.getCause();
              if (paramUUID == null) {
                break label432;
              }
              bool3 = bool2;
            }
            paramAFc1xSDK = paramAFc1xSDK;
            break label490;
          }
          finally {}
          paramAFc1xSDK = finally;
        }
        finally
        {
          bool3 = bool2;
          paramUUID = paramAFc1xSDK.getCause();
          if (paramUUID != null)
          {
            bool3 = bool2;
            throw paramUUID;
          }
          bool3 = bool2;
        }
        AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", paramAFc1xSDK);
      }
      finally
      {
        paramUUID = paramAFc1xSDK.getCause();
        if (paramUUID != null)
        {
          bool3 = bool2;
          throw paramUUID;
        }
        bool3 = bool2;
      }
      bool4 = bool3;
    }
    label500:
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final long AFInAppEventType()
  {
    return 3000L;
  }
  
  public final boolean AFVersionDeclaration()
  {
    return (!TextUtils.isEmpty(afWarnLog)) && (!TextUtils.isEmpty(AFVersionDeclaration)) && (!afWarnLog.equals("app"));
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return null;
  }
  
  public final boolean afWarnLog()
  {
    return AFLogger$LogLevel;
  }
  
  public final boolean getLevel()
  {
    return false;
  }
  
  public final AFc1qSDK<Map<String, String>> values(@NonNull String paramString)
  {
    return afErrorLogForExcManagerOnly.AFInAppEventType(afWarnLog, AFVersionDeclaration, onAppOpenAttributionNative, paramString);
  }
  
  public final void values()
  {
    super.values();
    AFa1xSDK localAFa1xSDK = afInfoLog;
    if (localAFa1xSDK != null)
    {
      if (valueOf == AFd1ySDK.AFInAppEventParameterName)
      {
        localObject1 = afErrorLog;
        if (localObject1 != null)
        {
          localAFa1xSDK.values((Map)((AFc1gSDK)localObject1).getBody());
          return;
        }
      }
      Object localObject2 = afDebugLog();
      boolean bool = localObject2 instanceof ParsingException;
      Object localObject1 = "Can't get OneLink data";
      if (bool)
      {
        if (((ParsingException)localObject2).getRawResponse().isSuccessful())
        {
          localAFa1xSDK.AFKeystoreWrapper("Can't parse one link data");
          return;
        }
        localObject2 = getLevel;
        if (localObject2 != null) {
          localObject1 = localObject2;
        }
        localAFa1xSDK.AFKeystoreWrapper((String)localObject1);
        return;
      }
      localObject2 = getLevel;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
      localAFa1xSDK.AFKeystoreWrapper((String)localObject1);
    }
  }
  
  public static abstract interface AFa1xSDK
  {
    public abstract void AFKeystoreWrapper(String paramString);
    
    public abstract void values(Map<String, String> paramMap);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1nSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */