package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;

@Module
public abstract class BackendRegistryModule
{
  @Binds
  public abstract BackendRegistry backendRegistry(MetadataBackendRegistry paramMetadataBackendRegistry);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.BackendRegistryModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */