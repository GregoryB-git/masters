package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class CreationContext
{
  private static final String DEFAULT_BACKEND_NAME = "cct";
  
  public static CreationContext create(Context paramContext, Clock paramClock1, Clock paramClock2)
  {
    return new AutoValue_CreationContext(paramContext, paramClock1, paramClock2, "cct");
  }
  
  public static CreationContext create(Context paramContext, Clock paramClock1, Clock paramClock2, String paramString)
  {
    return new AutoValue_CreationContext(paramContext, paramClock1, paramClock2, paramString);
  }
  
  public abstract Context getApplicationContext();
  
  @NonNull
  public abstract String getBackendName();
  
  public abstract Clock getMonotonicClock();
  
  public abstract Clock getWallClock();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.CreationContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */