package X2;

import W2.g;
import W2.k;
import W2.m;
import java.io.Serializable;

public final class h
  extends P
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final g o;
  public final P p;
  
  public h(g paramg, P paramP)
  {
    o = ((g)m.j(paramg));
    p = ((P)m.j(paramP));
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    return p.compare(o.apply(paramObject1), o.apply(paramObject2));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof h))
    {
      paramObject = (h)paramObject;
      if ((!o.equals(o)) || (!p.equals(p))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return k.b(new Object[] { o, p });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(p);
    localStringBuilder.append(".onResultOf(");
    localStringBuilder.append(o);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     X2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */