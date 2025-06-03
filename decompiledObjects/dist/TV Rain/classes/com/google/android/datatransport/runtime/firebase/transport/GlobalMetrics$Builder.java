package com.google.android.datatransport.runtime.firebase.transport;

public final class GlobalMetrics$Builder
{
  private StorageMetrics storage_metrics_ = null;
  
  public GlobalMetrics build()
  {
    return new GlobalMetrics(storage_metrics_);
  }
  
  public Builder setStorageMetrics(StorageMetrics paramStorageMetrics)
  {
    storage_metrics_ = paramStorageMetrics;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */