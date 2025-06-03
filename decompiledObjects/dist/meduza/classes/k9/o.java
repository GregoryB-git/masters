package k9;

import j9.n;
import j9.q;
import java.util.List;

public final class o
  extends f
{
  public final n d;
  
  public o(j9.i parami, n paramn, m paramm, List<e> paramList)
  {
    super(parami, paramm, paramList);
    d = paramn;
  }
  
  public final d a(j9.m paramm, d paramd, u7.m paramm1)
  {
    j(paramm);
    if (!b.b(paramm)) {
      return paramd;
    }
    paramd = h(paramm1, paramm);
    paramm1 = new n(d.b());
    paramm1.g(paramd);
    paramm.k(d, paramm1);
    g = 1;
    d = q.b;
    return null;
  }
  
  public final void b(j9.m paramm, i parami)
  {
    j(paramm);
    n localn = new n(d.b());
    localn.g(i(paramm, b));
    paramm.k(a, localn);
    g = 2;
  }
  
  public final d d()
  {
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (o.class == paramObject.getClass()))
    {
      paramObject = (o)paramObject;
      if ((!e((f)paramObject)) || (!d.equals(d)) || (!c.equals(c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = f();
    return d.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SetMutation{");
    localStringBuilder.append(g());
    localStringBuilder.append(", value=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k9.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */