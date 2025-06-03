package d4;

import V3.k;

public final class p
  extends h
{
  public final k o;
  
  public p(k paramk)
  {
    if ((paramk.size() == 1) && (paramk.Z().s())) {
      throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
    }
    o = paramk;
  }
  
  public String c()
  {
    return o.d0();
  }
  
  public boolean e(n paramn)
  {
    return paramn.A(o).isEmpty() ^ true;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (p.class == paramObject.getClass()))
    {
      paramObject = (p)paramObject;
      return o.equals(o);
    }
    return false;
  }
  
  public m f(b paramb, n paramn)
  {
    return new m(paramb, g.W().y(o, paramn));
  }
  
  public m g()
  {
    n localn = g.W().y(o, n.l);
    return new m(b.m(), localn);
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public int i(m paramm1, m paramm2)
  {
    int i = paramm1.d().A(o).compareTo(paramm2.d().A(o));
    if (i == 0) {
      return paramm1.c().h(paramm2.c());
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     d4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */