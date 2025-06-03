package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import androidx.annotation.NonNull;

public class q$b
  implements Application.ActivityLifecycleCallbacks
{
  public static void registerIn(Activity paramActivity)
  {
    p.a(paramActivity, new b());
  }
  
  public void onActivityCreated(@NonNull Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(@NonNull Activity paramActivity) {}
  
  public void onActivityPaused(@NonNull Activity paramActivity) {}
  
  public void onActivityPostCreated(@NonNull Activity paramActivity, Bundle paramBundle)
  {
    q.a(paramActivity, d.b.ON_CREATE);
  }
  
  public void onActivityPostResumed(@NonNull Activity paramActivity)
  {
    q.a(paramActivity, d.b.ON_RESUME);
  }
  
  public void onActivityPostStarted(@NonNull Activity paramActivity)
  {
    q.a(paramActivity, d.b.ON_START);
  }
  
  public void onActivityPreDestroyed(@NonNull Activity paramActivity)
  {
    q.a(paramActivity, d.b.ON_DESTROY);
  }
  
  public void onActivityPrePaused(@NonNull Activity paramActivity)
  {
    q.a(paramActivity, d.b.ON_PAUSE);
  }
  
  public void onActivityPreStopped(@NonNull Activity paramActivity)
  {
    q.a(paramActivity, d.b.ON_STOP);
  }
  
  public void onActivityResumed(@NonNull Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(@NonNull Activity paramActivity, @NonNull Bundle paramBundle) {}
  
  public void onActivityStarted(@NonNull Activity paramActivity) {}
  
  public void onActivityStopped(@NonNull Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     androidx.lifecycle.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */