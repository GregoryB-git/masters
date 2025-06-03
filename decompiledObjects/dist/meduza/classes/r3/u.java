package r3;

import t3.c;

public final class u
  implements m3.b<t>
{
  public final qb.a<t3.a> a;
  public final qb.a<t3.a> b;
  public final qb.a<e> c;
  public final qb.a<z> d;
  public final qb.a<String> e;
  
  public u(qb.a parama1, qb.a parama2)
  {
    a = localb;
    b = localc;
    c = localh;
    d = parama1;
    e = parama2;
  }
  
  public final Object get()
  {
    t3.a locala1 = (t3.a)a.get();
    t3.a locala2 = (t3.a)b.get();
    Object localObject1 = c.get();
    Object localObject2 = d.get();
    qb.a locala = e;
    return new t(locala1, locala2, (e)localObject1, (z)localObject2, locala);
  }
}

/* Location:
 * Qualified Name:     r3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */