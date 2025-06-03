package xc;

import ec.i;

public abstract class j
  implements w
{
  public final w a;
  
  public j(w paramw)
  {
    a = paramw;
  }
  
  public final z c()
  {
    return a.c();
  }
  
  public void close()
  {
    a.close();
  }
  
  public void flush()
  {
    a.flush();
  }
  
  public void g0(f paramf, long paramLong)
  {
    i.e(paramf, "source");
    a.g0(paramf, paramLong);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('(');
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     xc.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */