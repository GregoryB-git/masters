package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import o3;

public class ProcessLifecycleOwner
  implements LifecycleOwner
{
  @VisibleForTesting
  public static final long TIMEOUT_MS = 700L;
  private static final ProcessLifecycleOwner sInstance = new ProcessLifecycleOwner();
  private Runnable mDelayedPauseRunnable = new Runnable()
  {
    public void run()
    {
      dispatchPauseIfNeeded();
      dispatchStopIfNeeded();
    }
  };
  private Handler mHandler;
  public ReportFragment.ActivityInitializationListener mInitializationListener = new ReportFragment.ActivityInitializationListener()
  {
    public void onCreate() {}
    
    public void onResume()
    {
      activityResumed();
    }
    
    public void onStart()
    {
      activityStarted();
    }
  };
  private boolean mPauseSent = true;
  private final LifecycleRegistry mRegistry = new LifecycleRegistry(this);
  private int mResumedCounter = 0;
  private int mStartedCounter = 0;
  private boolean mStopSent = true;
  
  @NonNull
  public static LifecycleOwner get()
  {
    return sInstance;
  }
  
  public static void init(Context paramContext)
  {
    sInstance.attach(paramContext);
  }
  
  public void activityPaused()
  {
    int i = mResumedCounter - 1;
    mResumedCounter = i;
    if (i == 0) {
      mHandler.postDelayed(mDelayedPauseRunnable, 700L);
    }
  }
  
  public void activityResumed()
  {
    int i = mResumedCounter + 1;
    mResumedCounter = i;
    if (i == 1) {
      if (mPauseSent)
      {
        mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        mPauseSent = false;
      }
      else
      {
        mHandler.removeCallbacks(mDelayedPauseRunnable);
      }
    }
  }
  
  public void activityStarted()
  {
    int i = mStartedCounter + 1;
    mStartedCounter = i;
    if ((i == 1) && (mStopSent))
    {
      mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
      mStopSent = false;
    }
  }
  
  public void activityStopped()
  {
    mStartedCounter -= 1;
    dispatchStopIfNeeded();
  }
  
  public void attach(Context paramContext)
  {
    mHandler = new Handler();
    mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks()
    {
      public void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
      {
        if (Build.VERSION.SDK_INT < 29) {
          ReportFragment.get(paramAnonymousActivity).setProcessListener(mInitializationListener);
        }
      }
      
      public void onActivityPaused(Activity paramAnonymousActivity)
      {
        activityPaused();
      }
      
      @RequiresApi(29)
      public void onActivityPreCreated(@NonNull Activity paramAnonymousActivity, @Nullable Bundle paramAnonymousBundle)
      {
        o3.l(paramAnonymousActivity, new EmptyActivityLifecycleCallbacks()
        {
          public void onActivityPostResumed(@NonNull Activity paramAnonymous2Activity)
          {
            activityResumed();
          }
          
          public void onActivityPostStarted(@NonNull Activity paramAnonymous2Activity)
          {
            activityStarted();
          }
        });
      }
      
      public void onActivityStopped(Activity paramAnonymousActivity)
      {
        activityStopped();
      }
    });
  }
  
  public void dispatchPauseIfNeeded()
  {
    if (mResumedCounter == 0)
    {
      mPauseSent = true;
      mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }
  }
  
  public void dispatchStopIfNeeded()
  {
    if ((mStartedCounter == 0) && (mPauseSent))
    {
      mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
      mStopSent = true;
    }
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return mRegistry;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */