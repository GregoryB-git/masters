package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class TimeModule_UptimeClockFactory
  implements Factory<Clock>
{
  public static TimeModule_UptimeClockFactory create()
  {
    return InstanceHolder.access$000();
  }
  
  public static Clock uptimeClock()
  {
    return (Clock)Preconditions.checkNotNull(TimeModule.uptimeClock(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public Clock get()
  {
    return uptimeClock();
  }
  
  public static final class InstanceHolder
  {
    private static final TimeModule_UptimeClockFactory INSTANCE = new TimeModule_UptimeClockFactory();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */