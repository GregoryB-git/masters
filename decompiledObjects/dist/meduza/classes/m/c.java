package m;

import android.os.Handler;
import android.os.Looper;

public final class c
  extends e
{
  public static volatile c c;
  public static final b d = new b(0);
  public d b = new d();
  
  public c()
  {
    super(0);
  }
  
  public static c v()
  {
    if (c != null) {
      return c;
    }
    try
    {
      if (c == null)
      {
        c localc = new m/c;
        localc.<init>();
        c = localc;
      }
      return c;
    }
    finally {}
  }
  
  public final boolean w()
  {
    b.getClass();
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void x(Runnable paramRunnable)
  {
    d locald = b;
    if (d == null) {
      synchronized (b)
      {
        if (d == null) {
          d = d.v(Looper.getMainLooper());
        }
      }
    }
    d.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     m.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */