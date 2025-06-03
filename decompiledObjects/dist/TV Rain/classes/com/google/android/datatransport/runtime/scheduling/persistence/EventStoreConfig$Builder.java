package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
abstract class EventStoreConfig$Builder
{
  public abstract EventStoreConfig build();
  
  public abstract Builder setCriticalSectionEnterTimeoutMs(int paramInt);
  
  public abstract Builder setEventCleanUpAge(long paramLong);
  
  public abstract Builder setLoadBatchSize(int paramInt);
  
  public abstract Builder setMaxBlobByteSizePerRow(int paramInt);
  
  public abstract Builder setMaxStorageSizeInBytes(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */