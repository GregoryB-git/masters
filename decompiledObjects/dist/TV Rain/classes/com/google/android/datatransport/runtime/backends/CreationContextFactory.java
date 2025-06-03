package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;

class CreationContextFactory
{
  private final Context applicationContext;
  private final Clock monotonicClock;
  private final Clock wallClock;
  
  @Inject
  public CreationContextFactory(Context paramContext, @WallTime Clock paramClock1, @Monotonic Clock paramClock2)
  {
    applicationContext = paramContext;
    wallClock = paramClock1;
    monotonicClock = paramClock2;
  }
  
  public CreationContext create(String paramString)
  {
    return CreationContext.create(applicationContext, wallClock, monotonicClock, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.CreationContextFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */