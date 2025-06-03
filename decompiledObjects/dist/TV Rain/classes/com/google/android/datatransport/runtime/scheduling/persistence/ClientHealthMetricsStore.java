package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;

public abstract interface ClientHealthMetricsStore
{
  public abstract ClientMetrics loadClientMetrics();
  
  public abstract void recordLogEventDropped(long paramLong, LogEventDropped.Reason paramReason, String paramString);
  
  public abstract void resetClientMetrics();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */