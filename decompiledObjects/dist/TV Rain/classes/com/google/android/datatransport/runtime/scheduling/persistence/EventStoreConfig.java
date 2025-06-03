package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
abstract class EventStoreConfig
{
  public static final EventStoreConfig DEFAULT = builder().setMaxStorageSizeInBytes(10485760L).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(604800000L).setMaxBlobByteSizePerRow(81920).build();
  private static final long DURATION_ONE_WEEK_MS = 604800000L;
  private static final int LOAD_BATCH_SIZE = 200;
  private static final int LOCK_TIME_OUT_MS = 10000;
  private static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
  private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760L;
  
  public static Builder builder()
  {
    return new AutoValue_EventStoreConfig.Builder();
  }
  
  public abstract int getCriticalSectionEnterTimeoutMs();
  
  public abstract long getEventCleanUpAge();
  
  public abstract int getLoadBatchSize();
  
  public abstract int getMaxBlobByteSizePerRow();
  
  public abstract long getMaxStorageSizeInBytes();
  
  public Builder toBuilder()
  {
    return builder().setMaxStorageSizeInBytes(getMaxStorageSizeInBytes()).setLoadBatchSize(getLoadBatchSize()).setCriticalSectionEnterTimeoutMs(getCriticalSectionEnterTimeoutMs()).setEventCleanUpAge(getEventCleanUpAge()).setMaxBlobByteSizePerRow(getMaxBlobByteSizePerRow());
  }
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    public abstract EventStoreConfig build();
    
    public abstract Builder setCriticalSectionEnterTimeoutMs(int paramInt);
    
    public abstract Builder setEventCleanUpAge(long paramLong);
    
    public abstract Builder setLoadBatchSize(int paramInt);
    
    public abstract Builder setMaxBlobByteSizePerRow(int paramInt);
    
    public abstract Builder setMaxStorageSizeInBytes(long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */