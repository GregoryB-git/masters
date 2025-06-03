package R4;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class v$a
  implements Application.ActivityLifecycleCallbacks
{
  public v$a(v paramv) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    o.b();
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    o.c();
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramBundle, "outState");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
  }
}

/* Location:
 * Qualified Name:     R4.v.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */