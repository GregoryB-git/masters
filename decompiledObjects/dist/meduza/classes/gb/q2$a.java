package gb;

import eb.k0.e;
import eb.k0.f;
import eb.k0.i;
import eb.k0.k;
import eb.n;
import eb.o;

public final class q2$a
  implements k0.k
{
  public q2$a(q2 paramq2, k0.i parami) {}
  
  public final void a(o paramo)
  {
    q2 localq2 = b;
    k0.i locali = a;
    localq2.getClass();
    n localn1 = n.d;
    n localn2 = a;
    if (localn2 != n.e)
    {
      n localn3 = n.c;
      if ((localn2 == localn3) || (localn2 == localn1)) {
        f.e();
      }
      if (h == localn3)
      {
        if (localn2 == n.a) {
          return;
        }
        if (localn2 == localn1)
        {
          localq2.e();
          return;
        }
      }
      int i = localn2.ordinal();
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              paramo = new q2.d(localq2, locali);
            }
            else
            {
              paramo = new StringBuilder();
              paramo.append("Unsupported state:");
              paramo.append(localn2);
              throw new IllegalArgumentException(paramo.toString());
            }
          }
          else {
            paramo = new q2.c(k0.f.a(b));
          }
        }
        else {
          paramo = new q2.c(k0.f.b(locali, null));
        }
      }
      else {
        paramo = new q2.c(k0.f.e);
      }
      h = localn2;
      f.f(localn2, paramo);
    }
  }
}

/* Location:
 * Qualified Name:     gb.q2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */