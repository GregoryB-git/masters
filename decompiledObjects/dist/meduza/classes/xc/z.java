package xc;

import a0.j;
import ec.i;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class z
{
  public static final a d = new a();
  public boolean a;
  public long b;
  public long c;
  
  public z a()
  {
    a = false;
    return this;
  }
  
  public z b()
  {
    c = 0L;
    return this;
  }
  
  public long c()
  {
    if (a) {
      return b;
    }
    throw new IllegalStateException("No deadline".toString());
  }
  
  public z d(long paramLong)
  {
    a = true;
    b = paramLong;
    return this;
  }
  
  public boolean e()
  {
    return a;
  }
  
  public void f()
  {
    if (!Thread.currentThread().isInterrupted())
    {
      if ((a) && (b - System.nanoTime() <= 0L)) {
        throw new InterruptedIOException("deadline reached");
      }
      return;
    }
    throw new InterruptedIOException("interrupted");
  }
  
  public z g(long paramLong, TimeUnit paramTimeUnit)
  {
    i.e(paramTimeUnit, "unit");
    int i;
    if (paramLong >= 0L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      c = paramTimeUnit.toNanos(paramLong);
      return this;
    }
    throw new IllegalArgumentException(j.i("timeout < 0: ", paramLong).toString());
  }
  
  public static final class a
    extends z
  {
    public final z d(long paramLong)
    {
      return this;
    }
    
    public final void f() {}
    
    public final z g(long paramLong, TimeUnit paramTimeUnit)
    {
      i.e(paramTimeUnit, "unit");
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     xc.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */