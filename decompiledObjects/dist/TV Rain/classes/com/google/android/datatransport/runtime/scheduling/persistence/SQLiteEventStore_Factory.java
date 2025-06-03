package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SQLiteEventStore_Factory
  implements Factory<SQLiteEventStore>
{
  private final Provider<Clock> clockProvider;
  private final Provider<EventStoreConfig> configProvider;
  private final Provider<String> packageNameProvider;
  private final Provider<SchemaManager> schemaManagerProvider;
  private final Provider<Clock> wallClockProvider;
  
  public SQLiteEventStore_Factory(Provider<Clock> paramProvider1, Provider<Clock> paramProvider2, Provider<EventStoreConfig> paramProvider, Provider<SchemaManager> paramProvider3, Provider<String> paramProvider4)
  {
    wallClockProvider = paramProvider1;
    clockProvider = paramProvider2;
    configProvider = paramProvider;
    schemaManagerProvider = paramProvider3;
    packageNameProvider = paramProvider4;
  }
  
  public static SQLiteEventStore_Factory create(Provider<Clock> paramProvider1, Provider<Clock> paramProvider2, Provider<EventStoreConfig> paramProvider, Provider<SchemaManager> paramProvider3, Provider<String> paramProvider4)
  {
    return new SQLiteEventStore_Factory(paramProvider1, paramProvider2, paramProvider, paramProvider3, paramProvider4);
  }
  
  public static SQLiteEventStore newInstance(Clock paramClock1, Clock paramClock2, Object paramObject1, Object paramObject2, Provider<String> paramProvider)
  {
    return new SQLiteEventStore(paramClock1, paramClock2, (EventStoreConfig)paramObject1, (SchemaManager)paramObject2, paramProvider);
  }
  
  public SQLiteEventStore get()
  {
    return newInstance((Clock)wallClockProvider.get(), (Clock)clockProvider.get(), configProvider.get(), schemaManagerProvider.get(), packageNameProvider);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */