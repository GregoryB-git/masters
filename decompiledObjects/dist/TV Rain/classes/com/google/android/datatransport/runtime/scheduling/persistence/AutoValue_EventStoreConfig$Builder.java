package com.google.android.datatransport.runtime.scheduling.persistence;

import z2;

final class AutoValue_EventStoreConfig$Builder
  extends EventStoreConfig.Builder
{
  private Integer criticalSectionEnterTimeoutMs;
  private Long eventCleanUpAge;
  private Integer loadBatchSize;
  private Integer maxBlobByteSizePerRow;
  private Long maxStorageSizeInBytes;
  
  public EventStoreConfig build()
  {
    if (maxStorageSizeInBytes == null) {
      localObject1 = " maxStorageSizeInBytes";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (loadBatchSize == null) {
      localObject2 = z2.o((String)localObject1, " loadBatchSize");
    }
    Object localObject1 = localObject2;
    if (criticalSectionEnterTimeoutMs == null) {
      localObject1 = z2.o((String)localObject2, " criticalSectionEnterTimeoutMs");
    }
    localObject2 = localObject1;
    if (eventCleanUpAge == null) {
      localObject2 = z2.o((String)localObject1, " eventCleanUpAge");
    }
    localObject1 = localObject2;
    if (maxBlobByteSizePerRow == null) {
      localObject1 = z2.o((String)localObject2, " maxBlobByteSizePerRow");
    }
    if (((String)localObject1).isEmpty()) {
      return new AutoValue_EventStoreConfig(maxStorageSizeInBytes.longValue(), loadBatchSize.intValue(), criticalSectionEnterTimeoutMs.intValue(), eventCleanUpAge.longValue(), maxBlobByteSizePerRow.intValue(), null);
    }
    throw new IllegalStateException(z2.o("Missing required properties:", (String)localObject1));
  }
  
  public EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int paramInt)
  {
    criticalSectionEnterTimeoutMs = Integer.valueOf(paramInt);
    return this;
  }
  
  public EventStoreConfig.Builder setEventCleanUpAge(long paramLong)
  {
    eventCleanUpAge = Long.valueOf(paramLong);
    return this;
  }
  
  public EventStoreConfig.Builder setLoadBatchSize(int paramInt)
  {
    loadBatchSize = Integer.valueOf(paramInt);
    return this;
  }
  
  public EventStoreConfig.Builder setMaxBlobByteSizePerRow(int paramInt)
  {
    maxBlobByteSizePerRow = Integer.valueOf(paramInt);
    return this;
  }
  
  public EventStoreConfig.Builder setMaxStorageSizeInBytes(long paramLong)
  {
    maxStorageSizeInBytes = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */