package n5;

import android.os.Handler;
import android.os.HandlerThread;

public class u
  implements q
{
  public final String a;
  public final int b;
  public HandlerThread c;
  public Handler d;
  
  public u(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public void a()
  {
    HandlerThread localHandlerThread = c;
    if (localHandlerThread != null)
    {
      localHandlerThread.quit();
      c = null;
      d = null;
    }
  }
  
  public void c(m paramm)
  {
    d.post(b);
  }
  
  public void start()
  {
    HandlerThread localHandlerThread = new HandlerThread(a, b);
    c = localHandlerThread;
    localHandlerThread.start();
    d = new Handler(c.getLooper());
  }
}

/* Location:
 * Qualified Name:     n5.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */