package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import z2;

final class AutoValue_CreationContext
  extends CreationContext
{
  private final Context applicationContext;
  private final String backendName;
  private final Clock monotonicClock;
  private final Clock wallClock;
  
  public AutoValue_CreationContext(Context paramContext, Clock paramClock1, Clock paramClock2, String paramString)
  {
    if (paramContext != null)
    {
      applicationContext = paramContext;
      if (paramClock1 != null)
      {
        wallClock = paramClock1;
        if (paramClock2 != null)
        {
          monotonicClock = paramClock2;
          if (paramString != null)
          {
            backendName = paramString;
            return;
          }
          throw new NullPointerException("Null backendName");
        }
        throw new NullPointerException("Null monotonicClock");
      }
      throw new NullPointerException("Null wallClock");
    }
    throw new NullPointerException("Null applicationContext");
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof CreationContext))
    {
      paramObject = (CreationContext)paramObject;
      if ((!applicationContext.equals(((CreationContext)paramObject).getApplicationContext())) || (!wallClock.equals(((CreationContext)paramObject).getWallClock())) || (!monotonicClock.equals(((CreationContext)paramObject).getMonotonicClock())) || (!backendName.equals(((CreationContext)paramObject).getBackendName()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Context getApplicationContext()
  {
    return applicationContext;
  }
  
  @NonNull
  public String getBackendName()
  {
    return backendName;
  }
  
  public Clock getMonotonicClock()
  {
    return monotonicClock;
  }
  
  public Clock getWallClock()
  {
    return wallClock;
  }
  
  public int hashCode()
  {
    return (((applicationContext.hashCode() ^ 0xF4243) * 1000003 ^ wallClock.hashCode()) * 1000003 ^ monotonicClock.hashCode()) * 1000003 ^ backendName.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("CreationContext{applicationContext=");
    localStringBuilder.append(applicationContext);
    localStringBuilder.append(", wallClock=");
    localStringBuilder.append(wallClock);
    localStringBuilder.append(", monotonicClock=");
    localStringBuilder.append(monotonicClock);
    localStringBuilder.append(", backendName=");
    return z2.s(localStringBuilder, backendName, "}");
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.AutoValue_CreationContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */