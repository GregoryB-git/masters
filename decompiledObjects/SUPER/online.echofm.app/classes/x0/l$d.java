package x0;

import android.os.Handler;

public final class l$d
{
  public final Handler a;
  public final Runnable b;
  
  public l$d(Handler paramHandler, Runnable paramRunnable)
  {
    a = paramHandler;
    b = paramRunnable;
  }
  
  public void a()
  {
    a.post(b);
  }
}

/* Location:
 * Qualified Name:     x0.l.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */