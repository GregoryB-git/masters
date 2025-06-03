package l4;

import c4.t;
import c4.t.a;
import c4.u;
import v5.e0;

public final class a$a
  implements t
{
  public a$a(a parama) {}
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    Object localObject = a;
    long l1 = d.i * paramLong / 1000000L;
    long l2 = b;
    long l3 = c;
    localObject = new u(paramLong, e0.j((l3 - l2) * l1 / f + l2 - 30000L, l2, l3 - 1L));
    return new t.a((u)localObject, (u)localObject);
  }
  
  public final long h()
  {
    a locala = a;
    h localh = d;
    return f * 1000000L / i;
  }
}

/* Location:
 * Qualified Name:     l4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */