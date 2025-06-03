package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class TransportRuntime_Factory
  implements Factory<TransportRuntime>
{
  private final Provider<Clock> eventClockProvider;
  private final Provider<WorkInitializer> initializerProvider;
  private final Provider<Scheduler> schedulerProvider;
  private final Provider<Uploader> uploaderProvider;
  private final Provider<Clock> uptimeClockProvider;
  
  public TransportRuntime_Factory(Provider<Clock> paramProvider1, Provider<Clock> paramProvider2, Provider<Scheduler> paramProvider, Provider<Uploader> paramProvider3, Provider<WorkInitializer> paramProvider4)
  {
    eventClockProvider = paramProvider1;
    uptimeClockProvider = paramProvider2;
    schedulerProvider = paramProvider;
    uploaderProvider = paramProvider3;
    initializerProvider = paramProvider4;
  }
  
  public static TransportRuntime_Factory create(Provider<Clock> paramProvider1, Provider<Clock> paramProvider2, Provider<Scheduler> paramProvider, Provider<Uploader> paramProvider3, Provider<WorkInitializer> paramProvider4)
  {
    return new TransportRuntime_Factory(paramProvider1, paramProvider2, paramProvider, paramProvider3, paramProvider4);
  }
  
  public static TransportRuntime newInstance(Clock paramClock1, Clock paramClock2, Scheduler paramScheduler, Uploader paramUploader, WorkInitializer paramWorkInitializer)
  {
    return new TransportRuntime(paramClock1, paramClock2, paramScheduler, paramUploader, paramWorkInitializer);
  }
  
  public TransportRuntime get()
  {
    return newInstance((Clock)eventClockProvider.get(), (Clock)uptimeClockProvider.get(), (Scheduler)schedulerProvider.get(), (Uploader)uploaderProvider.get(), (WorkInitializer)initializerProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportRuntime_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */