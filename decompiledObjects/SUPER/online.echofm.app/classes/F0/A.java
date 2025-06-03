package F0;

import g0.a;

public final class A
  implements M
{
  public final B a;
  public final long b;
  
  public A(B paramB, long paramLong)
  {
    a = paramB;
    b = paramLong;
  }
  
  public final N a(long paramLong1, long paramLong2)
  {
    return new N(paramLong1 * 1000000L / a.e, b + paramLong2);
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    a.h(a.k);
    Object localObject1 = a;
    Object localObject2 = k;
    long[] arrayOfLong = a;
    localObject2 = b;
    int i = g0.M.h(arrayOfLong, ((B)localObject1).i(paramLong), true, false);
    long l1 = 0L;
    long l2;
    if (i == -1) {
      l2 = 0L;
    } else {
      l2 = arrayOfLong[i];
    }
    if (i != -1) {
      l1 = localObject2[i];
    }
    localObject1 = a(l2, l1);
    if ((a != paramLong) && (i != arrayOfLong.length - 1))
    {
      i++;
      return new M.a((N)localObject1, a(arrayOfLong[i], localObject2[i]));
    }
    return new M.a((N)localObject1);
  }
  
  public long l()
  {
    return a.f();
  }
}

/* Location:
 * Qualified Name:     F0.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */