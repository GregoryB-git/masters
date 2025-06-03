package v3;

import v5.c;
import v5.o;
import v5.y;

public final class k
  implements o
{
  public final y a;
  public final a b;
  public j1 c;
  public o d;
  public boolean e;
  public boolean f;
  
  public k(a parama, c paramc)
  {
    b = parama;
    a = new y(paramc);
    e = true;
  }
  
  public final void c(e1 parame1)
  {
    o localo = d;
    e1 locale1 = parame1;
    if (localo != null)
    {
      localo.c(parame1);
      locale1 = d.f();
    }
    a.c(locale1);
  }
  
  public final e1 f()
  {
    Object localObject = d;
    if (localObject != null) {
      localObject = ((o)localObject).f();
    } else {
      localObject = a.e;
    }
    return (e1)localObject;
  }
  
  public final long l()
  {
    long l;
    if (e)
    {
      l = a.l();
    }
    else
    {
      o localo = d;
      localo.getClass();
      l = localo.l();
    }
    return l;
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     v3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */