package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_StoreConfigFactory
  implements Factory<EventStoreConfig>
{
  public static EventStoreModule_StoreConfigFactory create()
  {
    return InstanceHolder.access$000();
  }
  
  public static EventStoreConfig storeConfig()
  {
    return (EventStoreConfig)Preconditions.checkNotNull(EventStoreModule.storeConfig(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public EventStoreConfig get()
  {
    return storeConfig();
  }
  
  public static final class InstanceHolder
  {
    private static final EventStoreModule_StoreConfigFactory INSTANCE = new EventStoreModule_StoreConfigFactory();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */