package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import javax.inject.Provider;

public final class EventStoreModule_PackageNameFactory
  implements Factory<String>
{
  private final Provider<Context> contextProvider;
  
  public EventStoreModule_PackageNameFactory(Provider<Context> paramProvider)
  {
    contextProvider = paramProvider;
  }
  
  public static EventStoreModule_PackageNameFactory create(Provider<Context> paramProvider)
  {
    return new EventStoreModule_PackageNameFactory(paramProvider);
  }
  
  public static String packageName(Context paramContext)
  {
    return (String)Preconditions.checkNotNull(EventStoreModule.packageName(paramContext), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public String get()
  {
    return packageName((Context)contextProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */