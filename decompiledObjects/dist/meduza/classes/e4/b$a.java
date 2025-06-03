package e4;

import c4.t;
import c4.t.a;
import c4.u;

public final class b$a
  implements t
{
  public final long a;
  
  public b$a(b paramb, long paramLong)
  {
    a = paramLong;
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    Object localObject1 = b.g[0].b(paramLong);
    int i = 1;
    for (;;)
    {
      Object localObject2 = b.g;
      if (i >= localObject2.length) {
        break;
      }
      t.a locala = localObject2[i].b(paramLong);
      localObject2 = localObject1;
      if (a.b < a.b) {
        localObject2 = locala;
      }
      i++;
      localObject1 = localObject2;
    }
    return (t.a)localObject1;
  }
  
  public final long h()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     e4.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */