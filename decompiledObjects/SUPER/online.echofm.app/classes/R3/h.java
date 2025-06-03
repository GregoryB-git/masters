package R3;

import V3.j;
import android.os.Handler;
import android.os.Looper;

public class h
  implements j
{
  public final Handler a = new Handler(Looper.getMainLooper());
  
  public void a() {}
  
  public void b(Runnable paramRunnable)
  {
    a.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     R3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */