package w5;

import T5.a;
import android.os.Handler;
import android.os.Looper;

public class g
  implements c.d
{
  public final Handler a = a.a(Looper.getMainLooper());
  
  public void a(Runnable paramRunnable)
  {
    a.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     w5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */