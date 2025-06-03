package gb;

import eb.n;
import x6.b;

public final class d1$e$a
  implements Runnable
{
  public d1$e$a(d1.e parame) {}
  
  public final void run()
  {
    Object localObject1 = a;
    d1 locald1 = c;
    o = null;
    Object localObject2;
    if (y != null)
    {
      boolean bool;
      if (w == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "Unexpected non-null activeTransport");
      localObject2 = a;
      a.c(c.y);
    }
    else
    {
      localObject2 = v;
      localObject1 = a;
      if (localObject2 == localObject1)
      {
        w = ((h2)localObject1);
        localObject2 = a.c;
        v = null;
        d1.b((d1)localObject2, n.b);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d1.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */