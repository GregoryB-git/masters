package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistryModule;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.dagger.Component.Builder;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import com.google.android.datatransport.runtime.time.TimeModule;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

@Component(modules={BackendRegistryModule.class, EventStoreModule.class, ExecutionModule.class, SchedulingModule.class, SchedulingConfigModule.class, TimeModule.class})
@Singleton
abstract class TransportRuntimeComponent
  implements Closeable
{
  public void close()
    throws IOException
  {
    getEventStore().close();
  }
  
  public abstract EventStore getEventStore();
  
  public abstract TransportRuntime getTransportRuntime();
  
  @Component.Builder
  public static abstract interface Builder
  {
    public abstract TransportRuntimeComponent build();
    
    @BindsInstance
    public abstract Builder setApplicationContext(Context paramContext);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportRuntimeComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */