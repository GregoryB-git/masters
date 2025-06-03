package com.google.android.datatransport;

public abstract interface Transport<T>
{
  public abstract void schedule(Event<T> paramEvent, TransportScheduleCallback paramTransportScheduleCallback);
  
  public abstract void send(Event<T> paramEvent);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.Transport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */