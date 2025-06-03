package j9;

import a0.j;
import f;
import ka.d0;

public final class m
  implements g
{
  public final i b;
  public int c;
  public q d;
  public q e;
  public n f;
  public int g;
  
  public m(i parami)
  {
    b = parami;
    e = q.b;
  }
  
  public m(i parami, int paramInt1, q paramq1, q paramq2, n paramn, int paramInt2)
  {
    b = parami;
    d = paramq1;
    e = paramq2;
    c = paramInt1;
    g = paramInt2;
    f = paramn;
  }
  
  public static m m(i parami)
  {
    q localq = q.b;
    return new m(parami, 1, localq, localq, new n(), 3);
  }
  
  public static m n(i parami, q paramq)
  {
    parami = new m(parami);
    parami.l(paramq);
    return parami;
  }
  
  public final m a()
  {
    return new m(b, c, d, e, new n(f.b()), g);
  }
  
  public final boolean b()
  {
    return q0.g.b(c, 2);
  }
  
  public final boolean c()
  {
    return q0.g.b(g, 2);
  }
  
  public final boolean d()
  {
    return q0.g.b(g, 1);
  }
  
  public final boolean e()
  {
    boolean bool;
    if ((!d()) && (!c())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m.class == paramObject.getClass()))
    {
      paramObject = (m)paramObject;
      if (!b.equals(b)) {
        return false;
      }
      if (!d.equals(d)) {
        return false;
      }
      if (!q0.g.b(c, c)) {
        return false;
      }
      if (!q0.g.b(g, g)) {
        return false;
      }
      return f.equals(f);
    }
    return false;
  }
  
  public final q f()
  {
    return e;
  }
  
  public final d0 g(l paraml)
  {
    return n.d(paraml, f.b());
  }
  
  public final n getData()
  {
    return f;
  }
  
  public final i getKey()
  {
    return b;
  }
  
  public final boolean h()
  {
    return q0.g.b(c, 3);
  }
  
  public final int hashCode()
  {
    return b.hashCode();
  }
  
  public final boolean i()
  {
    return q0.g.b(c, 4);
  }
  
  public final q j()
  {
    return d;
  }
  
  public final void k(q paramq, n paramn)
  {
    d = paramq;
    c = 2;
    f = paramn;
    g = 3;
  }
  
  public final void l(q paramq)
  {
    d = paramq;
    c = 3;
    f = new n();
    g = 3;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Document{key=");
    localStringBuilder.append(b);
    localStringBuilder.append(", version=");
    localStringBuilder.append(d);
    localStringBuilder.append(", readTime=");
    localStringBuilder.append(e);
    localStringBuilder.append(", type=");
    localStringBuilder.append(j.v(c));
    localStringBuilder.append(", documentState=");
    localStringBuilder.append(g.q(g));
    localStringBuilder.append(", value=");
    localStringBuilder.append(f);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j9.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */