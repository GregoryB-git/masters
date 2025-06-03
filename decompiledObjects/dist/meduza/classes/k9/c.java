package k9;

import j9.q;
import java.util.List;
import x6.b;

public final class c
  extends f
{
  public c(j9.i parami, m paramm)
  {
    super(parami, paramm);
  }
  
  public final d a(j9.m paramm, d paramd, u7.m paramm1)
  {
    j(paramm);
    if (b.b(paramm))
    {
      paramm.l(d);
      g = 1;
      d = q.b;
      return null;
    }
    return paramd;
  }
  
  public final void b(j9.m paramm, i parami)
  {
    j(paramm);
    b.Z("Transform results received by DeleteMutation.", b.isEmpty(), new Object[0]);
    paramm.l(a);
    g = 2;
  }
  
  public final d d()
  {
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass())) {
      return e((c)paramObject);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return f();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DeleteMutation{");
    localStringBuilder.append(g());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */