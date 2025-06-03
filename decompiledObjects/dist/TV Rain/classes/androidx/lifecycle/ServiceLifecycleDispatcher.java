package androidx.lifecycle;

import android.os.Handler;
import androidx.annotation.NonNull;

public class ServiceLifecycleDispatcher
{
  private final Handler mHandler;
  private DispatchRunnable mLastDispatchRunnable;
  private final LifecycleRegistry mRegistry;
  
  public ServiceLifecycleDispatcher(@NonNull LifecycleOwner paramLifecycleOwner)
  {
    mRegistry = new LifecycleRegistry(paramLifecycleOwner);
    mHandler = new Handler();
  }
  
  private void postDispatchRunnable(Lifecycle.Event paramEvent)
  {
    DispatchRunnable localDispatchRunnable = mLastDispatchRunnable;
    if (localDispatchRunnable != null) {
      localDispatchRunnable.run();
    }
    paramEvent = new DispatchRunnable(mRegistry, paramEvent);
    mLastDispatchRunnable = paramEvent;
    mHandler.postAtFrontOfQueue(paramEvent);
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return mRegistry;
  }
  
  public void onServicePreSuperOnBind()
  {
    postDispatchRunnable(Lifecycle.Event.ON_START);
  }
  
  public void onServicePreSuperOnCreate()
  {
    postDispatchRunnable(Lifecycle.Event.ON_CREATE);
  }
  
  public void onServicePreSuperOnDestroy()
  {
    postDispatchRunnable(Lifecycle.Event.ON_STOP);
    postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
  }
  
  public void onServicePreSuperOnStart()
  {
    postDispatchRunnable(Lifecycle.Event.ON_START);
  }
  
  public static class DispatchRunnable
    implements Runnable
  {
    public final Lifecycle.Event mEvent;
    private final LifecycleRegistry mRegistry;
    private boolean mWasExecuted = false;
    
    public DispatchRunnable(@NonNull LifecycleRegistry paramLifecycleRegistry, Lifecycle.Event paramEvent)
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
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ServiceLifecycleDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */