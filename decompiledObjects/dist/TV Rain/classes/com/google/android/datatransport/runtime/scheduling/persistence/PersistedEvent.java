package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class PersistedEvent
{
  public static PersistedEvent create(long paramLong, TransportContext paramTransportContext, EventInternal paramEventInternal)
  {
    return new AutoValue_PersistedEvent(paramLong, paramTransportContext, paramEventInternal);
  }
  
  public abstract EventInternal getEvent();
  
  public abstract long getId();
  
  public abstract TransportContext getTransportContext();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */