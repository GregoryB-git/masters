package X2;

import W2.m;
import java.io.Serializable;

public final class X
  extends P
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final P o;
  
  public X(P paramP)
  {
    o = ((P)m.j(paramP));
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    return o.compare(paramObject2, paramObject1);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof X))
    {
      paramObject = (X)paramObject;
      return o.equals(o);
    }
    return false;
  }
  
  public P g()
  {
    return o;
  }
  
  public int hashCode()
  {
    return -o.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(".reverse()");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     X2.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */