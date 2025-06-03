package com.facebook.common.activitylistener;

import android.app.Activity;
import com.facebook.common.internal.Preconditions;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class ActivityListenerManager$Listener
  extends BaseActivityListener
{
  private final WeakReference<ActivityListener> mActivityListenerRef;
  
  public ActivityListenerManager$Listener(ActivityListener paramActivityListener)
  {
    mActivityListenerRef = new WeakReference(paramActivityListener);
  }
  
  private ActivityListener getListenerOrCleanUp(Activity paramActivity)
  {
    ActivityListener localActivityListener = (ActivityListener)mActivityListenerRef.get();
    if (localActivityListener == null)
    {
      Preconditions.checkArgument(paramActivity instanceof ListenableActivity);
      ((ListenableActivity)paramActivity).removeActivityListener(this);
    }
    return localActivityListener;
  }
  
  public void onActivityCreate(Activity paramActivity)
  {
    ActivityListener localActivityListener = getListenerOrCleanUp(paramActivity);
    if (localActivityListener != null) {
      localActivityListener.onActivityCreate(paramActivity);
    }
  }
  
  public void onDestroy(Activity paramActivity)
  {
    ActivityListener localActivityListener = getListenerOrCleanUp(paramActivity);
    if (localActivityListener != null) {
      localActivityListener.onDestroy(paramActivity);
    }
  }
  
  public void onPause(Activity paramActivity)
  {
    ActivityListener localActivityListener = getListenerOrCleanUp(paramActivity);
    if (localActivityListener != null) {
      localActivityListener.onPause(paramActivity);
    }
  }
  
  public void onResume(Activity paramActivity)
  {
    ActivityListener localActivityListener = getListenerOrCleanUp(paramActivity);
    if (localActivityListener != null) {
      localActivityListener.onResume(paramActivity);
    }
  }
  
  public void onStart(Activity paramActivity)
  {
    ActivityListener localActivityListener = getListenerOrCleanUp(paramActivity);
    if (localActivityListener != null) {
      localActivityListener.onStart(paramActivity);
    }
  }
  
  public void onStop(Activity paramActivity)
  {
    ActivityListener localActivityListener = getListenerOrCleanUp(paramActivity);
    if (localActivityListener != null) {
      localActivityListener.onStop(paramActivity);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.activitylistener.ActivityListenerManager.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */