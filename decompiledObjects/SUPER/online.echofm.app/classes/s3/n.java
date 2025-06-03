package s3;

import android.os.SystemClock;

public abstract class n
{
  public static n a(long paramLong1, long paramLong2, long paramLong3)
  {
    return new a(paramLong1, paramLong2, paramLong3);
  }
  
  public static n e()
  {
    return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
  }
  
  public abstract long b();
  
  public abstract long c();
  
  public abstract long d();
}

/* Location:
 * Qualified Name:     s3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */