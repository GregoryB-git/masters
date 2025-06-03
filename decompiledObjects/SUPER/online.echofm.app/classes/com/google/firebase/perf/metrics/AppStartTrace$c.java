package com.google.firebase.perf.metrics;

public class AppStartTrace$c
  implements Runnable
{
  public final AppStartTrace o;
  
  public AppStartTrace$c(AppStartTrace paramAppStartTrace)
  {
    o = paramAppStartTrace;
  }
  
  public void run()
  {
    if (AppStartTrace.g(o) == null) {
      AppStartTrace.h(o, true);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.metrics.AppStartTrace.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */