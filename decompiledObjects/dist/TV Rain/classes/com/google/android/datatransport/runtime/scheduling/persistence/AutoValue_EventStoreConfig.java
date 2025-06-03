package com.google.android.datatransport.runtime.scheduling.persistence;

import z2;

final class AutoValue_EventStoreConfig
  extends EventStoreConfig
{
  private final int criticalSectionEnterTimeoutMs;
  private final long eventCleanUpAge;
  private final int loadBatchSize;
  private final int maxBlobByteSizePerRow;
  private final long maxStorageSizeInBytes;
  
  private AutoValue_EventStoreConfig(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3)
  {
    maxStorageSizeInBytes = paramLong1;
    loadBatchSize = paramInt1;
    criticalSectionEnterTimeoutMs = paramInt2;
    eventCleanUpAge = paramLong2;
    maxBlobByteSizePerRow = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof EventStoreConfig))
    {
      paramObject = (EventStoreConfig)paramObject;
      if ((maxStorageSizeInBytes != ((EventStoreConfig)paramObject).getMaxStorageSizeInBytes()) || (loadBatchSize != ((EventStoreConfig)paramObject).getLoadBatchSize()) || (criticalSectionEnterTimeoutMs != ((EventStoreConfig)paramObject).getCriticalSectionEnterTimeoutMs()) || (eventCleanUpAge != ((EventStoreConfig)paramObject).getEventCleanUpAge()) || (maxBlobByteSizePerRow != ((EventStoreConfig)paramObject).getMaxBlobByteSizePerRow())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getCriticalSectionEnterTimeoutMs()
  {
    return criticalSectionEnterTimeoutMs;
  }
  
  public long getEventCleanUpAge()
  {
    return eventCleanUpAge;
  }
  
  public int getLoadBatchSize()
  {
    return loadBatchSize;
  }
  
  public int getMaxBlobByteSizePerRow()
  {
    return maxBlobByteSizePerRow;
  }
  
  public long getMaxStorageSizeInBytes()
  {
    return maxStorageSizeInBytes;
  }
  
  public int hashCode()
  {
    long l = maxStorageSizeInBytes;
    int i = (int)(l ^ l >>> 32);
    int j = loadBatchSize;
    int k = criticalSectionEnterTimeoutMs;
    l = eventCleanUpAge;
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ maxBlobByteSizePerRow;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("EventStoreConfig{maxStorageSizeInBytes=");
    localStringBuilder.append(maxStorageSizeInBytes);
    localStringBuilder.append(", loadBatchSize=");
    localStringBuilder.append(loadBatchSize);
    localStringBuilder.append(", criticalSectionEnterTimeoutMs=");
    localStringBuilder.append(criticalSectionEnterTimeoutMs);
    localStringBuilder.append(", eventCleanUpAge=");
    localStringBuilder.append(eventCleanUpAge);
    localStringBuilder.append(", maxBlobByteSizePerRow=");
    return z2.q(localStringBuilder, maxBlobByteSizePerRow, "}");
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */