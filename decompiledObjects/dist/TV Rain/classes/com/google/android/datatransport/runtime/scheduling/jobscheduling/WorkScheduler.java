package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;

public abstract interface WorkScheduler
{
  public abstract void schedule(TransportContext paramTransportContext, int paramInt);
  
  public abstract void schedule(TransportContext paramTransportContext, int paramInt, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */