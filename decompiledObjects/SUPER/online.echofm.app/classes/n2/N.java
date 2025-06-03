package n2;

import h2.b;

public final class N
  implements b
{
  public final U5.a a;
  public final U5.a b;
  public final U5.a c;
  public final U5.a d;
  public final U5.a e;
  
  public N(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4, U5.a parama5)
  {
    a = parama1;
    b = parama2;
    c = parama3;
    d = parama4;
    e = parama5;
  }
  
  public static N a(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4, U5.a parama5)
  {
    return new N(parama1, parama2, parama3, parama4, parama5);
  }
  
  public static M c(p2.a parama1, p2.a parama2, Object paramObject1, Object paramObject2, U5.a parama)
  {
    return new M(parama1, parama2, (e)paramObject1, (U)paramObject2, parama);
  }
  
  public M b()
  {
    return c((p2.a)a.get(), (p2.a)b.get(), c.get(), d.get(), e);
  }
}

/* Location:
 * Qualified Name:     n2.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */