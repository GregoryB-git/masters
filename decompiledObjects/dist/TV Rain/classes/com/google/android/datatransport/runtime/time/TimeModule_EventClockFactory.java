package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class TimeModule_EventClockFactory
  implements Factory<Clock>
{
  public static TimeModule_EventClockFactory create()
  {
    return InstanceHolder.access$000();
  }
  
  public static Clock eventClock()
  {
    return (Clock)Preconditions.checkNotNull(TimeModule.eventClock(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public Clock get()
  {
    return eventClock();
  }
  
  public static final class InstanceHolder
  {
    private static final TimeModule_EventClockFactory INSTANCE = new TimeModule_EventClockFactory();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */