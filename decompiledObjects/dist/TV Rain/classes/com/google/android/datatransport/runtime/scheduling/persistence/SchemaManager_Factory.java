package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

public final class SchemaManager_Factory
  implements Factory<SchemaManager>
{
  private final Provider<Context> contextProvider;
  private final Provider<String> dbNameProvider;
  private final Provider<Integer> schemaVersionProvider;
  
  public SchemaManager_Factory(Provider<Context> paramProvider, Provider<String> paramProvider1, Provider<Integer> paramProvider2)
  {
    contextProvider = paramProvider;
    dbNameProvider = paramProvider1;
    schemaVersionProvider = paramProvider2;
  }
  
  public static SchemaManager_Factory create(Provider<Context> paramProvider, Provider<String> paramProvider1, Provider<Integer> paramProvider2)
  {
    return new SchemaManager_Factory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static SchemaManager newInstance(Context paramContext, String paramString, int paramInt)
  {
    return new SchemaManager(paramContext, paramString, paramInt);
  }
  
  public SchemaManager get()
  {
    return newInstance((Context)contextProvider.get(), (String)dbNameProvider.get(), ((Integer)schemaVersionProvider.get()).intValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */