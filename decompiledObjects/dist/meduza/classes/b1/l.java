package b1;

import android.app.Activity;
import android.os.Bundle;
import ec.i;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l
{
  public static final AtomicBoolean a = new AtomicBoolean(false);
  
  public static final class a
    extends f
  {
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      i.e(paramActivity, "activity");
      int i = c0.b;
      c0.b.b(paramActivity);
    }
  }
}

/* Location:
 * Qualified Name:     b1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */