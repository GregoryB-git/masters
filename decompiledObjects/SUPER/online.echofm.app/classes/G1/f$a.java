package G1;

import O1.C;
import O1.C.a;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.N;
import y1.p;
import y1.p.a;

public final class f$a
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    C.e.b(N.s, f.g(), "onActivityCreated");
    g.a();
    f.p(paramActivity);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    C.e.b(N.s, f.g(), "onActivityDestroyed");
    f.h(f.a, paramActivity);
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    C.e.b(N.s, f.g(), "onActivityPaused");
    g.a();
    f.i(f.a, paramActivity);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    C.e.b(N.s, f.g(), "onActivityResumed");
    g.a();
    f.v(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramBundle, "outState");
    C.e.b(N.s, f.g(), "onActivitySaveInstanceState");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    f.j(f.f() + 1);
    C.e.b(N.s, f.g(), "onActivityStarted");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    C.e.b(N.s, f.g(), "onActivityStopped");
    p.b.i();
    f.j(f.f() - 1);
  }
}

/* Location:
 * Qualified Name:     G1.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */