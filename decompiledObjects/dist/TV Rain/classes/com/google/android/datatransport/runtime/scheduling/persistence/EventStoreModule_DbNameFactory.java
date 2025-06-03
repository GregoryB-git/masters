package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_DbNameFactory
  implements Factory<String>
{
  public static EventStoreModule_DbNameFactory create()
  {
    return InstanceHolder.access$000();
  }
  
  public static String dbName()
  {
    return (String)Preconditions.checkNotNull(EventStoreModule.dbName(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public String get()
  {
    return dbName();
  }
  
  public static final class InstanceHolder
  {
    private static final EventStoreModule_DbNameFactory INSTANCE = new EventStoreModule_DbNameFactory();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */