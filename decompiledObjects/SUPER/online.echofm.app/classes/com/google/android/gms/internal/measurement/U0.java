package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class U0
  implements ThreadFactory
{
  public ThreadFactory a = Executors.defaultThreadFactory();
  
  public U0(J0 paramJ0) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = a.newThread(paramRunnable);
    paramRunnable.setName("ScionFrontendApi");
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.U0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */