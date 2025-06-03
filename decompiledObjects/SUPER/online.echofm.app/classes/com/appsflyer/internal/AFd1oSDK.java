package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

public abstract class AFd1oSDK<Result>
  extends AFd1zSDK<AFc1gSDK<Result>>
{
  protected final AFc1oSDK AFLogger;
  private String AFLogger$LogLevel;
  public final AFe1wSDK afDebugLog;
  public AFc1gSDK<Result> afErrorLog;
  private AFa1bSDK afInfoLog;
  protected final AFb1tSDK afRDLog;
  
  private AFd1oSDK(@NonNull AFd1vSDK paramAFd1vSDK, @NonNull AFd1vSDK[] paramArrayOfAFd1vSDK, @NonNull AFc1oSDK paramAFc1oSDK, @NonNull AFe1wSDK paramAFe1wSDK, @NonNull AFb1tSDK paramAFb1tSDK, @NonNull AFa1bSDK paramAFa1bSDK, String paramString)
  {
    super(paramAFd1vSDK, paramArrayOfAFd1vSDK, paramString);
    AFLogger = paramAFc1oSDK;
    afDebugLog = paramAFe1wSDK;
    afRDLog = paramAFb1tSDK;
    afInfoLog = paramAFa1bSDK;
  }
  
  public AFd1oSDK(@NonNull AFd1vSDK paramAFd1vSDK, @NonNull AFd1vSDK[] paramArrayOfAFd1vSDK, @NonNull AFc1xSDK paramAFc1xSDK, String paramString)
  {
    this(paramAFd1vSDK, paramArrayOfAFd1vSDK, paramAFc1xSDK.AFKeystoreWrapper(), paramAFc1xSDK.afWarnLog(), paramAFc1xSDK.afErrorLogForExcManagerOnly(), paramAFc1xSDK.onAppOpenAttributionNative(), paramString);
  }
  
  public AFd1oSDK(@NonNull AFd1vSDK paramAFd1vSDK, @NonNull AFd1vSDK[] paramArrayOfAFd1vSDK, @NonNull AFc1xSDK paramAFc1xSDK, String paramString1, String paramString2)
  {
    this(paramAFd1vSDK, paramArrayOfAFd1vSDK, paramAFc1xSDK.AFKeystoreWrapper(), paramAFc1xSDK.afWarnLog(), paramAFc1xSDK.afErrorLogForExcManagerOnly(), paramAFc1xSDK.onAppOpenAttributionNative(), paramString1);
    AFLogger$LogLevel = paramString2;
  }
  
  private void valueOf(AFa1aSDK paramAFa1aSDK)
  {
    String str = AFLogger$LogLevel;
    paramAFa1aSDK = new AFa1rSDK(valueOf, paramAFa1aSDK.valueOf(), "6.12.2", values);
    AFLogger$LogLevel = afInfoLog.valueOf(paramAFa1aSDK);
    if (str != null) {
      afInfoLog.values(str);
    }
  }
  
  public final void AFInAppEventParameterName(Throwable paramThrowable)
  {
    boolean bool = paramThrowable instanceof HttpException;
    AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(paramThrowable)), paramThrowable, true, bool ^ true);
    AppsFlyerRequestListener localAppsFlyerRequestListener = afRDLog();
    if (localAppsFlyerRequestListener != null)
    {
      paramThrowable = paramThrowable.getMessage();
      if (paramThrowable == null) {
        paramThrowable = "";
      }
      localAppsFlyerRequestListener.onError(40, paramThrowable);
    }
  }
  
  public boolean AFInAppEventParameterName()
  {
    if ((afDebugLog() instanceof AFd1xSDK)) {
      return false;
    }
    if (valueOf == AFd1ySDK.AFInAppEventType) {
      return true;
    }
    Throwable localThrowable = afDebugLog();
    return ((localThrowable instanceof IOException)) && (!(localThrowable instanceof ParsingException));
  }
  
  public long AFInAppEventType()
  {
    return 60000L;
  }
  
  public final void AFKeystoreWrapper()
  {
    super.AFKeystoreWrapper();
    if (afInfoLog())
    {
      Object localObject = afDebugLog.AFInAppEventParameterName;
      if ((localObject != null) && (!((String)localObject).trim().isEmpty()))
      {
        localObject = values((String)localObject);
        if (localObject != null)
        {
          valueOf(valueOf);
          return;
        }
        AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
      }
    }
  }
  
  public abstract boolean afInfoLog();
  
  public abstract AppsFlyerRequestListener afRDLog();
  
  public boolean getLevel()
  {
    return true;
  }
  
  @NonNull
  public AFd1ySDK valueOf()
  {
    if ((getLevel()) && (afDebugLog.AFKeystoreWrapper()))
    {
      localObject1 = afRDLog();
      if (localObject1 != null) {
        ((AppsFlyerRequestListener)localObject1).onError(11, "Skipping event because 'isStopped' is true");
      }
      throw new AFd1xSDK();
    }
    Object localObject1 = afDebugLog.AFInAppEventParameterName;
    if ((localObject1 != null) && (!((String)localObject1).trim().isEmpty()))
    {
      Object localObject2 = values((String)localObject1);
      if (localObject2 == null)
      {
        AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        return AFd1ySDK.valueOf;
      }
      if (afInfoLog()) {
        valueOf(valueOf);
      }
      localObject1 = ((AFc1qSDK)localObject2).AFInAppEventType();
      afErrorLog = ((AFc1gSDK)localObject1);
      Object localObject3 = ((AFc1gSDK)localObject1).getBody().toString();
      afRDLog.AFInAppEventParameterName(valueOf.valueOf, ((AFc1gSDK)localObject1).getStatusCode(), (String)localObject3);
      localObject3 = afRDLog();
      if (localObject3 != null) {
        if (((AFc1gSDK)localObject1).isSuccessful())
        {
          ((AppsFlyerRequestListener)localObject3).onSuccess();
        }
        else
        {
          localObject2 = new StringBuilder("Status code failure ");
          ((StringBuilder)localObject2).append(((AFc1gSDK)localObject1).getStatusCode());
          ((AppsFlyerRequestListener)localObject3).onError(50, localObject2.toString());
        }
      }
      if (((AFc1gSDK)localObject1).isSuccessful()) {
        return AFd1ySDK.AFInAppEventParameterName;
      }
      return AFd1ySDK.valueOf;
    }
    localObject1 = afRDLog();
    if (localObject1 != null) {
      ((AppsFlyerRequestListener)localObject1).onError(41, "No dev key");
    }
    throw new AFd1tSDK();
  }
  
  public abstract AFc1qSDK<Result> values(@NonNull String paramString);
  
  public void values()
  {
    String str;
    if (valueOf == AFd1ySDK.AFInAppEventParameterName)
    {
      str = AFLogger$LogLevel;
      if (str != null) {
        afInfoLog.values(str);
      }
      return;
    }
    if (!AFInAppEventParameterName())
    {
      str = AFLogger$LogLevel;
      if (str != null) {
        afInfoLog.values(str);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1oSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */