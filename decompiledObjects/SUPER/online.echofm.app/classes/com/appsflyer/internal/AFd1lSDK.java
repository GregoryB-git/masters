package com.appsflyer.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class AFd1lSDK
  extends AFd1zSDK<Boolean>
{
  private static volatile boolean afInfoLog = false;
  private Boolean AFLogger;
  private final AFc1xSDK afDebugLog;
  private final AFc1bSDK afErrorLog;
  private final AFa1bSDK afRDLog;
  
  public AFd1lSDK(@NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(AFd1vSDK.AFInAppEventType, new AFd1vSDK[0], "LoadCachedRequests");
    afRDLog = paramAFc1xSDK.onAppOpenAttributionNative();
    afErrorLog = paramAFc1xSDK.AFVersionDeclaration();
    afDebugLog = paramAFc1xSDK;
  }
  
  public static boolean afInfoLog()
  {
    return afInfoLog;
  }
  
  private static String valueOf(AFa1rSDK paramAFa1rSDK)
  {
    long l1 = System.currentTimeMillis();
    long l2 = Long.parseLong(AFInAppEventParameterName, 10);
    paramAFa1rSDK = valueOf;
    try
    {
      String str = Uri.parse(paramAFa1rSDK).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((l1 - l2) / 1000L)).toString();
      paramAFa1rSDK = str;
    }
    catch (Exception localException)
    {
      AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", localException);
    }
    return paramAFa1rSDK;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final long AFInAppEventType()
  {
    return 30000L;
  }
  
  @NonNull
  public final AFd1ySDK valueOf()
  {
    Iterator localIterator = afRDLog.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (AFa1rSDK)localIterator.next();
      Object localObject2 = new StringBuilder("CACHE: resending request: ");
      ((StringBuilder)localObject2).append(valueOf);
      AFLogger.afInfoLog(localObject2.toString());
      try
      {
        localObject2 = valueOf((AFa1rSDK)localObject1);
        Object localObject3 = new com/appsflyer/internal/AFe1fSDK;
        ((AFe1fSDK)localObject3).<init>((String)localObject2, ((AFa1rSDK)localObject1).AFInAppEventType(), AFInAppEventParameterName, AFInAppEventType);
        localObject2 = afErrorLog;
        localObject1 = new com/appsflyer/internal/AFd1jSDK;
        ((AFd1jSDK)localObject1).<init>((AFe1fSDK)localObject3, afDebugLog);
        localObject3 = AFKeystoreWrapper;
        AFc1bSDK.4 local4 = new com/appsflyer/internal/AFc1bSDK$4;
        local4.<init>((AFc1bSDK)localObject2, (AFd1zSDK)localObject1);
        ((Executor)localObject3).execute(local4);
      }
      catch (Exception localException)
      {
        AFLogger.afErrorLog("QUEUE: Failed to resend cached request", localException);
      }
    }
    AFLogger = Boolean.TRUE;
    afInfoLog = true;
    return AFd1ySDK.AFInAppEventParameterName;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1lSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */