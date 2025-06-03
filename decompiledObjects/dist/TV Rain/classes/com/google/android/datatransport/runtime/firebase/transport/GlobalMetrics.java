package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable.Ignore;
import com.google.firebase.encoders.proto.Protobuf;

public final class GlobalMetrics
{
  private static final GlobalMetrics DEFAULT_INSTANCE = new Builder().build();
  private final StorageMetrics storage_metrics_;
  
  public GlobalMetrics(StorageMetrics paramStorageMetrics)
  {
    storage_metrics_ = paramStorageMetrics;
  }
  
  public static GlobalMetrics getDefaultInstance()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Encodable.Ignore
  public StorageMetrics getStorageMetrics()
  {
    StorageMetrics localStorageMetrics1 = storage_metrics_;
    StorageMetrics localStorageMetrics2 = localStorageMetrics1;
    if (localStorageMetrics1 == null) {
      localStorageMetrics2 = StorageMetrics.getDefaultInstance();
    }
    return localStorageMetrics2;
  }
  
  @Encodable.Field(name="storageMetrics")
  @Protobuf(tag=1)
  public StorageMetrics getStorageMetricsInternal()
  {
    return storage_metrics_;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */