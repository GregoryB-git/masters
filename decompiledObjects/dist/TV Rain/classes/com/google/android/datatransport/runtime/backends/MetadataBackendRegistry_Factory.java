package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

public final class MetadataBackendRegistry_Factory
  implements Factory<MetadataBackendRegistry>
{
  private final Provider<Context> applicationContextProvider;
  private final Provider<CreationContextFactory> creationContextFactoryProvider;
  
  public MetadataBackendRegistry_Factory(Provider<Context> paramProvider, Provider<CreationContextFactory> paramProvider1)
  {
    applicationContextProvider = paramProvider;
    creationContextFactoryProvider = paramProvider1;
  }
  
  public static MetadataBackendRegistry_Factory create(Provider<Context> paramProvider, Provider<CreationContextFactory> paramProvider1)
  {
    return new MetadataBackendRegistry_Factory(paramProvider, paramProvider1);
  }
  
  public static MetadataBackendRegistry newInstance(Context paramContext, Object paramObject)
  {
    return new MetadataBackendRegistry(paramContext, (CreationContextFactory)paramObject);
  }
  
  public MetadataBackendRegistry get()
  {
    return newInstance((Context)applicationContextProvider.get(), creationContextFactoryProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */