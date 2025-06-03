package E1;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class a$b
  implements Application.ActivityLifecycleCallbacks
{
  public static final void c()
  {
    Context localContext = B.l();
    Object localObject = i.a;
    localObject = i.i(localContext, a.b());
    a locala = a.a;
    a.c(locala, localContext, (ArrayList)localObject, false);
    a.c(locala, localContext, i.j(localContext, a.b()), true);
  }
  
  public static final void d()
  {
    Context localContext = B.l();
    Object localObject = i.a;
    ArrayList localArrayList = i.i(localContext, a.b());
    localObject = localArrayList;
    if (localArrayList.isEmpty()) {
      localObject = i.g(localContext, a.b());
    }
    a.c(a.a, localContext, (ArrayList)localObject, false);
  }
  
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
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    try
    {
      Executor localExecutor = B.t();
      paramActivity = new E1/c;
      paramActivity.<init>();
      localExecutor.execute(paramActivity);
      return;
    }
    catch (Exception paramActivity)
    {
      for (;;) {}
    }
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
    try
    {
      if ((Intrinsics.a(a.a(), Boolean.TRUE)) && (Intrinsics.a(paramActivity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")))
      {
        Executor localExecutor = B.t();
        paramActivity = new E1/b;
        paramActivity.<init>();
        localExecutor.execute(paramActivity);
      }
      return;
    }
    catch (Exception paramActivity)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     E1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */