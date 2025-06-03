package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

final class DaggerTransportRuntimeComponent$Builder
  implements TransportRuntimeComponent.Builder
{
  private Context setApplicationContext;
  
  public TransportRuntimeComponent build()
  {
    Preconditions.checkBuilderRequirement(setApplicationContext, Context.class);
    return new DaggerTransportRuntimeComponent(setApplicationContext, null);
  }
  
  public Builder setApplicationContext(Context paramContext)
  {
    setApplicationContext = ((Context)Preconditions.checkNotNull(paramContext));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */