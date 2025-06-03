package g0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

public class B
  implements c
{
  public long a()
  {
    return System.currentTimeMillis();
  }
  
  public long b()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public long c()
  {
    return System.nanoTime();
  }
  
  public long d()
  {
    return SystemClock.uptimeMillis();
  }
  
  public k e(Looper paramLooper, Handler.Callback paramCallback)
  {
    return new C(new Handler(paramLooper, paramCallback));
  }
  
  public void f() {}
}

/* Location:
 * Qualified Name:     g0.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */