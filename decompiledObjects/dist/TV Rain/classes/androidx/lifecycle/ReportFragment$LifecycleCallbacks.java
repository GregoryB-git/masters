package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import o3;

@RequiresApi(29)
class ReportFragment$LifecycleCallbacks
  implements Application.ActivityLifecycleCallbacks
{
  public static void registerIn(Activity paramActivity)
  {
    o3.l(paramActivity, new LifecycleCallbacks());
  }
  
  public void onActivityCreated(@NonNull Activity paramActivity, @Nullable Bundle paramBundle) {}
  
  public void onActivityDestroyed(@NonNull Activity paramActivity) {}
  
  public void onActivityPaused(@NonNull Activity paramActivity) {}
  
  public void onActivityPostCreated(@NonNull Activity paramActivity, @Nullable Bundle paramBundle)
  {
    ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_CREATE);
  }
  
  public void onActivityPostResumed(@NonNull Activity paramActivity)
  {
    ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_RESUME);
  }
  
  public void onActivityPostStarted(@NonNull Activity paramActivity)
  {
    ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_START);
  }
  
  public void onActivityPreDestroyed(@NonNull Activity paramActivity)
  {
    ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_DESTROY);
  }
  
  public void onActivityPrePaused(@NonNull Activity paramActivity)
  {
    ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_PAUSE);
  }
  
  public void onActivityPreStopped(@NonNull Activity paramActivity)
  {
    ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_STOP);
  }
  
  public void onActivityResumed(@NonNull Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(@NonNull Activity paramActivity, @NonNull Bundle paramBundle) {}
  
  public void onActivityStarted(@NonNull Activity paramActivity) {}
  
  public void onActivityStopped(@NonNull Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ReportFragment.LifecycleCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */