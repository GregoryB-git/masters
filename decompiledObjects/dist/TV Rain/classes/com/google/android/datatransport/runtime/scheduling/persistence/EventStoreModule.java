package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
public abstract class EventStoreModule
{
  @Provides
  @Named("SQLITE_DB_NAME")
  public static String dbName()
  {
    return "com.google.android.datatransport.events";
  }
  
  @Provides
  @Named("PACKAGE_NAME")
  @Singleton
  public static String packageName(Context paramContext)
  {
    return paramContext.getPackageName();
  }
  
  @Provides
  @Named("SCHEMA_VERSION")
  public static int schemaVersion()
  {
    return SchemaManager.SCHEMA_VERSION;
  }
  
  @Provides
  public static EventStoreConfig storeConfig()
  {
    return EventStoreConfig.DEFAULT;
  }
  
  @Binds
  public abstract ClientHealthMetricsStore clientHealthMetricsStore(SQLiteEventStore paramSQLiteEventStore);
  
  @Binds
  public abstract EventStore eventStore(SQLiteEventStore paramSQLiteEventStore);
  
  @Binds
  public abstract SynchronizationGuard synchronizationGuard(SQLiteEventStore paramSQLiteEventStore);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */