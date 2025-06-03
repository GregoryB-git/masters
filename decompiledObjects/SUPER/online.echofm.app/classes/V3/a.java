package V3;

import a4.d;
import a4.e.a;
import a4.i;

public class a
  extends h
{
  public final m d;
  public final Q3.a e;
  public final i f;
  
  public a(m paramm, Q3.a parama, i parami)
  {
    d = paramm;
    e = parama;
    f = parami;
  }
  
  public h a(i parami)
  {
    return new a(d, e, parami);
  }
  
  public d b(a4.c paramc, i parami)
  {
    Q3.b localb = Q3.k.a(Q3.k.c(d, parami.e().U(paramc.i())), paramc.k());
    if (paramc.m() != null) {
      parami = paramc.m().e();
    } else {
      parami = null;
    }
    return new d(paramc.j(), this, localb, parami);
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
    int i = a.a[paramd.b().ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            e.c(paramd.e());
          }
        }
        else {
          e.d(paramd.e(), paramd.d());
        }
      }
      else {
        e.e(paramd.e(), paramd.d());
      }
    }
    else {
      e.f(paramd.e(), paramd.d());
    }
  }
  
  public i e()
  {
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
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
    if (((paramh instanceof a)) && (e.equals(e))) {
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
    if (parama != e.a.s) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    return "ChildEventRegistration";
  }
}

/* Location:
 * Qualified Name:     V3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */