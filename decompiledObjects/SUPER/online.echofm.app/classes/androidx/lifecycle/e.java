package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class e
{
  public static AtomicBoolean a = new AtomicBoolean(false);
  
  public static void a(Context paramContext)
  {
    if (a.getAndSet(true)) {
      return;
    }
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
  }
  
  public static class a
    extends b
  {
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      q.g(paramActivity);
    }
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityStopped(Activity paramActivity) {}
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */