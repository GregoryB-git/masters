package androidx.lifecycle;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;

public class o$c
  extends b
{
  public o$c(o paramo) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 29) {
      q.f(paramActivity).h(this$0.v);
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    this$0.a();
  }
  
  public void onActivityPreCreated(@NonNull Activity paramActivity, Bundle paramBundle)
  {
    p.a(paramActivity, new a());
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    this$0.d();
  }
  
  public class a
    extends b
  {
    public a() {}
    
    public void onActivityPostResumed(@NonNull Activity paramActivity)
    {
      this$0.b();
    }
    
    public void onActivityPostStarted(@NonNull Activity paramActivity)
    {
      this$0.c();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.o.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */