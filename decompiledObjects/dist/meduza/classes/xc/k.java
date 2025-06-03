package xc;

import ec.i;

public abstract class k
  implements y
{
  public final y a;
  
  public k(y paramy)
  {
    a = paramy;
  }
  
  public final z c()
  {
    return a.c();
  }
  
  public void close()
  {
    a.close();
  }
  
  public long e0(f paramf, long paramLong)
  {
    i.e(paramf, "sink");
    return a.e0(paramf, paramLong);
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
 * Qualified Name:     xc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */