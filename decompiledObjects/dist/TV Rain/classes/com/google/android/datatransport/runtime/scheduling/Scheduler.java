package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

public abstract interface Scheduler
{
  public abstract void schedule(TransportContext paramTransportContext, EventInternal paramEventInternal, TransportScheduleCallback paramTransportScheduleCallback);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.Scheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */