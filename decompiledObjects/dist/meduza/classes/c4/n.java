package c4;

import v5.e0;
import x6.b;

public final class n
  implements t
{
  public final o a;
  public final long b;
  
  public n(o paramo, long paramLong)
  {
    a = paramo;
    b = paramLong;
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    b.K(a.k);
    Object localObject1 = a;
    Object localObject2 = k;
    long[] arrayOfLong = a;
    localObject2 = b;
    int i = e0.f(arrayOfLong, e0.j(e * paramLong / 1000000L, 0L, j - 1L), false);
    long l1 = 0L;
    if (i == -1) {
      l2 = 0L;
    } else {
      l2 = arrayOfLong[i];
    }
    if (i != -1) {
      l1 = localObject2[i];
    }
    int j = a.e;
    long l3 = l2 * 1000000L / j;
    long l2 = b;
    localObject1 = new u(l3, l1 + l2);
    if ((l3 != paramLong) && (i != arrayOfLong.length - 1))
    {
      i++;
      l1 = arrayOfLong[i];
      paramLong = localObject2[i];
      return new t.a((u)localObject1, new u(l1 * 1000000L / j, l2 + paramLong));
    }
    return new t.a((u)localObject1, (u)localObject1);
  }
  
  public final long h()
  {
    return a.b();
  }
}

/* Location:
 * Qualified Name:     c4.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */