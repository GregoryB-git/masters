package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import javax.inject.Provider;

final class DaggerTransportRuntimeComponent
  extends TransportRuntimeComponent
{
  private Provider<SchedulerConfig> configProvider;
  private Provider creationContextFactoryProvider;
  private Provider<DefaultScheduler> defaultSchedulerProvider;
  private Provider<Executor> executorProvider;
  private Provider metadataBackendRegistryProvider;
  private Provider<String> packageNameProvider;
  private Provider<SQLiteEventStore> sQLiteEventStoreProvider;
  private Provider schemaManagerProvider;
  private Provider<Context> setApplicationContextProvider;
  private Provider<TransportRuntime> transportRuntimeProvider;
  private Provider<Uploader> uploaderProvider;
  private Provider<WorkInitializer> workInitializerProvider;
  private Provider<WorkScheduler> workSchedulerProvider;
  
  private DaggerTransportRuntimeComponent(Context paramContext)
  {
    initialize(paramContext);
  }
  
  public static TransportRuntimeComponent.Builder builder()
  {
    return new Builder(null);
  }
  
  private void initialize(Context paramContext)
  {
    executorProvider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
    paramContext = InstanceFactory.create(paramContext);
    setApplicationContextProvider = paramContext;
    paramContext = CreationContextFactory_Factory.create(paramContext, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
    creationContextFactoryProvider = paramContext;
    metadataBackendRegistryProvider = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(setApplicationContextProvider, paramContext));
    schemaManagerProvider = SchemaManager_Factory.create(setApplicationContextProvider, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
    packageNameProvider = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(setApplicationContextProvider));
    sQLiteEventStoreProvider = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), schemaManagerProvider, packageNameProvider));
    paramContext = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
    configProvider = paramContext;
    SchedulingModule_WorkSchedulerFactory localSchedulingModule_WorkSchedulerFactory = SchedulingModule_WorkSchedulerFactory.create(setApplicationContextProvider, sQLiteEventStoreProvider, paramContext, TimeModule_UptimeClockFactory.create());
    workSchedulerProvider = localSchedulingModule_WorkSchedulerFactory;
    Provider localProvider1 = executorProvider;
    paramContext = metadataBackendRegistryProvider;
    Provider localProvider2 = sQLiteEventStoreProvider;
    defaultSchedulerProvider = DefaultScheduler_Factory.create(localProvider1, paramContext, localSchedulingModule_WorkSchedulerFactory, localProvider2, localProvider2);
    localProvider1 = setApplicationContextProvider;
    localProvider2 = metadataBackendRegistryProvider;
    paramContext = sQLiteEventStoreProvider;
    uploaderProvider = Uploader_Factory.create(localProvider1, localProvider2, paramContext, workSchedulerProvider, executorProvider, paramContext, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), sQLiteEventStoreProvider);
    localProvider2 = executorProvider;
    paramContext = sQLiteEventStoreProvider;
    workInitializerProvider = WorkInitializer_Factory.create(localProvider2, paramContext, workSchedulerProvider, paramContext);
    transportRuntimeProvider = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), defaultSchedulerProvider, uploaderProvider, workInitializerProvider));
  }
  
  public EventStore getEventStore()
  {
    return (EventStore)sQLiteEventStoreProvider.get();
  }
  
  public TransportRuntime getTransportRuntime()
  {
    return (TransportRuntime)transportRuntimeProvider.get();
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */