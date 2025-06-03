package androidx.lifecycle;

import android.app.Activity;
import androidx.annotation.NonNull;

class ProcessLifecycleOwner$3$1
  extends EmptyActivityLifecycleCallbacks
{
  public ProcessLifecycleOwner$3$1(ProcessLifecycleOwner.3 param3) {}
  
  public void onActivityPostResumed(@NonNull Activity paramActivity)
  {
    this$1.this$0.activityResumed();
  }
  
  public void onActivityPostStarted(@NonNull Activity paramActivity)
  {
    this$1.this$0.activityStarted();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner.3.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */