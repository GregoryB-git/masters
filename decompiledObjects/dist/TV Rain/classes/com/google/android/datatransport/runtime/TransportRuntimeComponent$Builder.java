package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component.Builder;

@Component.Builder
abstract interface TransportRuntimeComponent$Builder
{
  public abstract TransportRuntimeComponent build();
  
  @BindsInstance
  public abstract Builder setApplicationContext(Context paramContext);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */