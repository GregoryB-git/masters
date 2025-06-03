package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
class LifecycleDispatcher$DispatcherActivityCallback
  extends EmptyActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    ReportFragment.injectIfNeededIn(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleDispatcher.DispatcherActivityCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */