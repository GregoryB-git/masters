package m0;

import android.os.SystemClock;

public final class N$l
{
  public final long a;
  public Exception b;
  public long c;
  
  public N$l(long paramLong)
  {
    a = paramLong;
  }
  
  public void a()
  {
    b = null;
  }
  
  public void b(Exception paramException)
  {
    long l = SystemClock.elapsedRealtime();
    if (b == null)
    {
      b = paramException;
      c = (a + l);
    }
    if (l >= c)
    {
      Exception localException = b;
      if (localException != paramException) {
        localException.addSuppressed(paramException);
      }
      paramException = b;
      a();
      throw paramException;
    }
  }
}

/* Location:
 * Qualified Name:     m0.N.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */