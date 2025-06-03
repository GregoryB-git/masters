package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AFd1zSDK<Result>
  implements Comparable<AFd1zSDK<?>>, Callable<AFd1ySDK>
{
  private static final AtomicInteger afRDLog = new AtomicInteger();
  @NonNull
  public final Set<AFd1vSDK> AFInAppEventParameterName;
  public volatile int AFInAppEventType;
  @NonNull
  public final Set<AFd1vSDK> AFKeystoreWrapper;
  private long AFLogger;
  private boolean AFLogger$LogLevel;
  private final int afDebugLog;
  private Throwable afErrorLog;
  private final String afInfoLog;
  public AFd1ySDK valueOf;
  @NonNull
  public final AFd1vSDK values;
  
  public AFd1zSDK(@NonNull AFd1vSDK paramAFd1vSDK, @NonNull AFd1vSDK[] paramArrayOfAFd1vSDK, String paramString)
  {
    HashSet localHashSet = new HashSet();
    AFInAppEventParameterName = localHashSet;
    AFKeystoreWrapper = new HashSet();
    int i = afRDLog.incrementAndGet();
    afDebugLog = i;
    AFLogger$LogLevel = false;
    AFInAppEventType = 0;
    values = paramAFd1vSDK;
    Collections.addAll(localHashSet, paramArrayOfAFd1vSDK);
    if (paramString != null)
    {
      afInfoLog = paramString;
      return;
    }
    afInfoLog = String.valueOf(i);
  }
  
  public void AFInAppEventParameterName(Throwable paramThrowable) {}
  
  public abstract boolean AFInAppEventParameterName();
  
  public abstract long AFInAppEventType();
  
  public final int AFKeystoreWrapper(AFd1zSDK<?> paramAFd1zSDK)
  {
    int i = values.onDeepLinkingNative - values.onDeepLinkingNative;
    int j = i;
    if (i == 0)
    {
      if (afInfoLog.equals(afInfoLog)) {
        return 0;
      }
      j = afDebugLog - afDebugLog;
    }
    return j;
  }
  
  public void AFKeystoreWrapper()
  {
    AFLogger$LogLevel = true;
  }
  
  public final boolean AFLogger()
  {
    return AFLogger$LogLevel;
  }
  
  public final Throwable afDebugLog()
  {
    return afErrorLog;
  }
  
  public final AFd1ySDK afErrorLog()
  {
    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
    valueOf = null;
    afErrorLog = null;
    long l = System.currentTimeMillis();
    AFInAppEventType += 1;
    try
    {
      AFd1ySDK localAFd1ySDK = valueOf();
      valueOf = localAFd1ySDK;
      AFLogger = (System.currentTimeMillis() - l);
      values();
      return localAFd1ySDK;
    }
    finally
    {
      try
      {
        afErrorLog = localThrowable;
        valueOf = AFd1ySDK.valueOf;
        AFInAppEventParameterName(localThrowable);
        throw localThrowable;
      }
      finally
      {
        AFLogger = (System.currentTimeMillis() - l);
        values();
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (AFd1zSDK)paramObject;
      if (values != values) {
        return false;
      }
      return afInfoLog.equals(afInfoLog);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return values.hashCode() * 31 + afInfoLog.hashCode();
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(values);
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(afInfoLog);
    String str = localObject.toString();
    localObject = str;
    if (!String.valueOf(afDebugLog).equals(afInfoLog))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("-");
      ((StringBuilder)localObject).append(afDebugLog);
      localObject = localObject.toString();
    }
    return (String)localObject;
  }
  
  @NonNull
  public abstract AFd1ySDK valueOf();
  
  public void values() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */