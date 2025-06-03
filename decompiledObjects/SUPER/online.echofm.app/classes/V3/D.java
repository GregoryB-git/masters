package V3;

import Q3.k;
import Q3.s;
import a4.d;
import a4.e.a;
import a4.i;

public class D
  extends h
{
  public final m d;
  public final s e;
  public final i f;
  
  public D(m paramm, s params, i parami)
  {
    d = paramm;
    e = params;
    f = parami;
  }
  
  public h a(i parami)
  {
    return new D(d, e, parami);
  }
  
  public d b(a4.c paramc, i parami)
  {
    paramc = k.a(k.c(d, parami.e()), paramc.k());
    return new d(e.a.s, this, paramc, null);
  }
  
  public void c(Q3.c paramc)
  {
    e.a(paramc);
  }
  
  public void d(d paramd)
  {
    if (h()) {
      return;
    }
    e.b(paramd.e());
  }
  
  public i e()
  {
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof D))
    {
      paramObject = (D)paramObject;
      if ((e.equals(e)) && (d.equals(d)) && (f.equals(f))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public boolean f(h paramh)
  {
    boolean bool;
    if (((paramh instanceof D)) && (e.equals(e))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return (e.hashCode() * 31 + d.hashCode()) * 31 + f.hashCode();
  }
  
  public boolean i(e.a parama)
  {
    boolean bool;
    if (parama == e.a.s) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    return "ValueEventRegistration";
  }
}

/* Location:
 * Qualified Name:     V3.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */