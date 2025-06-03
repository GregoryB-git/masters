package E2;

import android.os.SystemClock;

public class h
  implements e
{
  public static final h a = new h();
  
  public static e d()
  {
    return a;
  }
  
  public final long a()
  {
    return System.currentTimeMillis();
  }
  
  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public final long c()
  {
    return System.nanoTime();
  }
}

/* Location:
 * Qualified Name:     E2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */