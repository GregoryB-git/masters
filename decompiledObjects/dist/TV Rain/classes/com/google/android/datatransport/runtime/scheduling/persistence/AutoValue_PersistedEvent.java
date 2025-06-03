package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import z2;

final class AutoValue_PersistedEvent
  extends PersistedEvent
{
  private final EventInternal event;
  private final long id;
  private final TransportContext transportContext;
  
  public AutoValue_PersistedEvent(long paramLong, TransportContext paramTransportContext, EventInternal paramEventInternal)
  {
    id = paramLong;
    if (paramTransportContext != null)
    {
      transportContext = paramTransportContext;
      if (paramEventInternal != null)
      {
        event = paramEventInternal;
        return;
      }
      throw new NullPointerException("Null event");
    }
    throw new NullPointerException("Null transportContext");
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof PersistedEvent))
    {
      paramObject = (PersistedEvent)paramObject;
      if ((id != ((PersistedEvent)paramObject).getId()) || (!transportContext.equals(((PersistedEvent)paramObject).getTransportContext())) || (!event.equals(((PersistedEvent)paramObject).getEvent()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public EventInternal getEvent()
  {
    return event;
  }
  
  public long getId()
  {
    return id;
  }
  
  public TransportContext getTransportContext()
  {
    return transportContext;
  }
  
  public int hashCode()
  {
    long l = id;
    return (((int)(l ^ l >>> 32) ^ 0xF4243) * 1000003 ^ transportContext.hashCode()) * 1000003 ^ event.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("PersistedEvent{id=");
    localStringBuilder.append(id);
    localStringBuilder.append(", transportContext=");
    localStringBuilder.append(transportContext);
    localStringBuilder.append(", event=");
    localStringBuilder.append(event);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */