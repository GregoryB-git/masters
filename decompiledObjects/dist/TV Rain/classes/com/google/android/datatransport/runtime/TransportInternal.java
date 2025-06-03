package com.google.android.datatransport.runtime;

import com.google.android.datatransport.TransportScheduleCallback;

abstract interface TransportInternal
{
  public abstract void send(SendRequest paramSendRequest, TransportScheduleCallback paramTransportScheduleCallback);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */