package V2;

import java.util.concurrent.ExecutionException;

public final class r
  implements q
{
  public final Object a = new Object();
  public final int b;
  public final K c;
  public int d;
  public int e;
  public int f;
  public Exception g;
  public boolean h;
  
  public r(int paramInt, K paramK)
  {
    b = paramInt;
    c = paramK;
  }
  
  private final void c()
  {
    if (d + e + f == b)
    {
      if (g != null)
      {
        K localK = c;
        int i = e;
        int j = b;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(i);
        localStringBuilder.append(" out of ");
        localStringBuilder.append(j);
        localStringBuilder.append(" underlying tasks failed");
        localK.q(new ExecutionException(localStringBuilder.toString(), g));
        return;
      }
      if (h)
      {
        c.s();
        return;
      }
      c.r(null);
    }
  }
  
  public final void a(Object arg1)
  {
    synchronized (a)
    {
      d += 1;
      c();
      return;
    }
  }
  
  public final void b()
  {
    synchronized (a)
    {
      f += 1;
      h = true;
      c();
      return;
    }
  }
  
  public final void d(Exception paramException)
  {
    synchronized (a)
    {
      e += 1;
      g = paramException;
      c();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     V2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */