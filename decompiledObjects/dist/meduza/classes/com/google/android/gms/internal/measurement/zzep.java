package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class zzep
  implements ThreadFactory
{
  private ThreadFactory zza = Executors.defaultThreadFactory();
  
  public zzep(zzed paramzzed) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = zza.newThread(paramRunnable);
    paramRunnable.setName("ScionFrontendApi");
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzep
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */