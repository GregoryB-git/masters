package androidx.core.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import androidx.annotation.NonNull;

final class ActivityRecreator$LifecycleCheckCallbacks
  implements Application.ActivityLifecycleCallbacks
{
  public Object currentlyRecreatingToken;
  private Activity mActivity;
  private boolean mDestroyed = false;
  private final int mRecreatingHashCode;
  private boolean mStarted = false;
  private boolean mStopQueued = false;
  
  public ActivityRecreator$LifecycleCheckCallbacks(@NonNull Activity paramActivity)
  {
    mActivity = paramActivity;
    mRecreatingHashCode = paramActivity.hashCode();
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    if (mActivity == paramActivity)
    {
      mActivity = null;
      mDestroyed = true;
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    if ((mDestroyed) && (!mStopQueued) && (!mStarted) && (ActivityRecreator.queueOnStopIfNecessary(currentlyRecreatingToken, mRecreatingHashCode, paramActivity)))
    {
      mStopQueued = true;
      currentlyRecreatingToken = null;
    }
  }
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    if (mActivity == paramActivity) {
      mStarted = true;
    }
  }
  
  public void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */