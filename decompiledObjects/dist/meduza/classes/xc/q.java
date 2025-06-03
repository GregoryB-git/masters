package xc;

import ec.i;
import java.io.OutputStream;

public final class q
  implements w
{
  public final OutputStream a;
  public final z b;
  
  public q(OutputStream paramOutputStream, z paramz)
  {
    a = paramOutputStream;
    b = paramz;
  }
  
  public final z c()
  {
    return b;
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final void flush()
  {
    a.flush();
  }
  
  public final void g0(f paramf, long paramLong)
  {
    i.e(paramf, "source");
    b.b(b, 0L, paramLong);
    while (paramLong > 0L)
    {
      b.f();
      t localt = a;
      i.b(localt);
      int i = (int)Math.min(paramLong, c - b);
      a.write(a, b, i);
      int j = b + i;
      b = j;
      long l1 = i;
      long l2 = paramLong - l1;
      b -= l1;
      paramLong = l2;
      if (j == c)
      {
        a = localt.a();
        u.a(localt);
        paramLong = l2;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("sink(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     xc.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */