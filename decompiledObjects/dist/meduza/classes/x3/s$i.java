package x3;

import android.os.SystemClock;

public final class s$i<T extends Exception>
{
  public T a;
  public long b;
  
  public final void a(T paramT)
  {
    long l = SystemClock.elapsedRealtime();
    if (a == null)
    {
      a = paramT;
      b = (100L + l);
    }
    if (l >= b)
    {
      Exception localException = a;
      if (localException != paramT) {
        localException.addSuppressed(paramT);
      }
      paramT = a;
      a = null;
      throw paramT;
    }
  }
}

/* Location:
 * Qualified Name:     x3.s.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */