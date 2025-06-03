package v5;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

public final class z
  implements c
{
  public final long a()
  {
    return SystemClock.uptimeMillis();
  }
  
  public final a0 b(Looper paramLooper, Handler.Callback paramCallback)
  {
    return new a0(new Handler(paramLooper, paramCallback));
  }
  
  public final void c() {}
  
  public final long d()
  {
    return SystemClock.elapsedRealtime();
  }
}

/* Location:
 * Qualified Name:     v5.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */