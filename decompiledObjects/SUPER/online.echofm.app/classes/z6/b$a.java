package z6;

import V2.e;
import V2.j;
import V5.n;
import V5.o;
import X5.d;
import p6.l;
import p6.l.a;

public final class b$a
  implements e
{
  public b$a(l paraml) {}
  
  public final void a(j paramj)
  {
    Object localObject1 = paramj.i();
    Object localObject2;
    if (localObject1 == null)
    {
      if (paramj.l())
      {
        l.a.a(a, null, 1, null);
      }
      else
      {
        localObject2 = a;
        localObject1 = n.o;
        ((d)localObject2).resumeWith(n.a(paramj.j()));
      }
    }
    else
    {
      paramj = a;
      localObject2 = n.o;
      paramj.resumeWith(n.a(o.a((Throwable)localObject1)));
    }
  }
}

/* Location:
 * Qualified Name:     z6.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */