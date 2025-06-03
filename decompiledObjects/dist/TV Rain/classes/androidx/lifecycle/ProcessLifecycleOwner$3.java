package androidx.lifecycle;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import o3;

class ProcessLifecycleOwner$3
  extends EmptyActivityLifecycleCallbacks
{
  public ProcessLifecycleOwner$3(ProcessLifecycleOwner paramProcessLifecycleOwner) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 29) {
      ReportFragment.get(paramActivity).setProcessListener(this$0.mInitializationListener);
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    this$0.activityPaused();
  }
  
  @RequiresApi(29)
  public void onActivityPreCreated(@NonNull Activity paramActivity, @Nullable Bundle paramBundle)
  {
    o3.l(paramActivity, new EmptyActivityLifecycleCallbacks()
    {
      public void onActivityPostResumed(@NonNull Activity paramAnonymousActivity)
      {
        this$0.activityResumed();
      }
      
      public void onActivityPostStarted(@NonNull Activity paramAnonymousActivity)
      {
        this$0.activityStarted();
      }
    });
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    this$0.activityStopped();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */