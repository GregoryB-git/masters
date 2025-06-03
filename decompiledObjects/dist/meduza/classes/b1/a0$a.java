package b1;

import android.app.Activity;
import ec.i;

public final class a0$a
  extends f
{
  public a0$a(z paramz) {}
  
  public void onActivityPostResumed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    this$0.a();
  }
  
  public void onActivityPostStarted(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    paramActivity = this$0;
    int i = a + 1;
    a = i;
    if ((i == 1) && (d))
    {
      f.f(k.a.ON_START);
      d = false;
    }
  }
}

/* Location:
 * Qualified Name:     b1.a0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */