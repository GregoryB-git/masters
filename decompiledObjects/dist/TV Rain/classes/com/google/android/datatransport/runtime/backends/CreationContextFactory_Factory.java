package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class CreationContextFactory_Factory
  implements Factory<CreationContextFactory>
{
  private final Provider<Context> applicationContextProvider;
  private final Provider<Clock> monotonicClockProvider;
  private final Provider<Clock> wallClockProvider;
  
  public CreationContextFactory_Factory(Provider<Context> paramProvider, Provider<Clock> paramProvider1, Provider<Clock> paramProvider2)
  {
    applicationContextProvider = paramProvider;
    wallClockProvider = paramProvider1;
    monotonicClockProvider = paramProvider2;
  }
  
  public static CreationContextFactory_Factory create(Provider<Context> paramProvider, Provider<Clock> paramProvider1, Provider<Clock> paramProvider2)
  {
    return new CreationContextFactory_Factory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static CreationContextFactory newInstance(Context paramContext, Clock paramClock1, Clock paramClock2)
  {
    return new CreationContextFactory(paramContext, paramClock1, paramClock2);
  }
  
  public CreationContextFactory get()
  {
    return newInstance((Context)applicationContextProvider.get(), (Clock)wallClockProvider.get(), (Clock)monotonicClockProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */