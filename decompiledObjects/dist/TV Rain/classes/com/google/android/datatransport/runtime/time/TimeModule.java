package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
public abstract class TimeModule
{
  @Provides
  @WallTime
  public static Clock eventClock()
  {
    return new WallTimeClock();
  }
  
  @Provides
  @Monotonic
  public static Clock uptimeClock()
  {
    return new UptimeClock();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.time.TimeModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */