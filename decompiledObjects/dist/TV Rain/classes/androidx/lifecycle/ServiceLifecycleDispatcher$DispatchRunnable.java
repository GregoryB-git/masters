package androidx.lifecycle;

import androidx.annotation.NonNull;

class ServiceLifecycleDispatcher$DispatchRunnable
  implements Runnable
{
  public final Lifecycle.Event mEvent;
  private final LifecycleRegistry mRegistry;
  private boolean mWasExecuted = false;
  
  public ServiceLifecycleDispatcher$DispatchRunnable(@NonNull LifecycleRegistry paramLifecycleRegistry, Lifecycle.Event paramEvent)
  {
    mRegistry = paramLifecycleRegistry;
    mEvent = paramEvent;
  }
  
  public void run()
  {
    if (!mWasExecuted)
    {
      mRegistry.handleLifecycleEvent(mEvent);
      mWasExecuted = true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */