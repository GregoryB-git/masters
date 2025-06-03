package va;

import android.os.Handler;
import android.os.HandlerThread;

public final class k
  implements i
{
  public final String a = "Sqflite";
  public final int b;
  public HandlerThread c;
  public Handler d;
  
  public k(int paramInt)
  {
    b = paramInt;
  }
  
  public final void a(d paramd, Runnable paramRunnable)
  {
    d.post(paramRunnable);
  }
  
  public final void b()
  {
    HandlerThread localHandlerThread = c;
    if (localHandlerThread != null)
    {
      localHandlerThread.quit();
      c = null;
      d = null;
    }
  }
  
  public final void start()
  {
    HandlerThread localHandlerThread = new HandlerThread(a, b);
    c = localHandlerThread;
    localHandlerThread.start();
    d = new Handler(c.getLooper());
  }
}

/* Location:
 * Qualified Name:     va.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */