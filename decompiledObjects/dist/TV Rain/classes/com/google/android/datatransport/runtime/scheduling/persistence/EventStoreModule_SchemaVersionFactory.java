package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

public final class EventStoreModule_SchemaVersionFactory
  implements Factory<Integer>
{
  public static EventStoreModule_SchemaVersionFactory create()
  {
    return InstanceHolder.access$000();
  }
  
  public static int schemaVersion()
  {
    return EventStoreModule.schemaVersion();
  }
  
  public Integer get()
  {
    return Integer.valueOf(schemaVersion());
  }
  
  public static final class InstanceHolder
  {
    private static final EventStoreModule_SchemaVersionFactory INSTANCE = new EventStoreModule_SchemaVersionFactory();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */