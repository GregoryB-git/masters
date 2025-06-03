package sc;

import nc.g0;

public abstract class p
{
  public abstract Object a(Object paramObject);
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('@');
    localStringBuilder.append(g0.b(this));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     sc.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */