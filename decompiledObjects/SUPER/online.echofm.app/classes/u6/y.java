package u6;

import p6.M;

public abstract class y
{
  public abstract Object a(Object paramObject);
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(M.a(this));
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(this));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u6.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */