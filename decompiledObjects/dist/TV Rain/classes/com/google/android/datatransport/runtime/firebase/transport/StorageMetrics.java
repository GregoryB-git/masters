package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

public final class StorageMetrics
{
  private static final StorageMetrics DEFAULT_INSTANCE = new Builder().build();
  private final long current_cache_size_bytes_;
  private final long max_cache_size_bytes_;
  
  public StorageMetrics(long paramLong1, long paramLong2)
  {
    current_cache_size_bytes_ = paramLong1;
    max_cache_size_bytes_ = paramLong2;
  }
  
  public static StorageMetrics getDefaultInstance()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Protobuf(tag=1)
  public long getCurrentCacheSizeBytes()
  {
    return current_cache_size_bytes_;
  }
  
  @Protobuf(tag=2)
  public long getMaxCacheSizeBytes()
  {
    return max_cache_size_bytes_;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.StorageMetrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */