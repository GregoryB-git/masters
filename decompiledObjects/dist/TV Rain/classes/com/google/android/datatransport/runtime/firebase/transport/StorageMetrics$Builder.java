package com.google.android.datatransport.runtime.firebase.transport;

public final class StorageMetrics$Builder
{
  private long current_cache_size_bytes_ = 0L;
  private long max_cache_size_bytes_ = 0L;
  
  public StorageMetrics build()
  {
    return new StorageMetrics(current_cache_size_bytes_, max_cache_size_bytes_);
  }
  
  public Builder setCurrentCacheSizeBytes(long paramLong)
  {
    current_cache_size_bytes_ = paramLong;
    return this;
  }
  
  public Builder setMaxCacheSizeBytes(long paramLong)
  {
    max_cache_size_bytes_ = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */