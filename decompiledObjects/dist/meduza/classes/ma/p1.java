package ma;

public abstract class p1<T, B>
{
  public abstract void a(B paramB, int paramInt1, int paramInt2);
  
  public abstract void b(B paramB, int paramInt, long paramLong);
  
  public abstract void c(int paramInt, Object paramObject1, Object paramObject2);
  
  public abstract void d(B paramB, int paramInt, h paramh);
  
  public abstract void e(B paramB, int paramInt, long paramLong);
  
  public abstract q1 f(Object paramObject);
  
  public abstract q1 g(Object paramObject);
  
  public abstract int h(T paramT);
  
  public abstract int i(T paramT);
  
  public abstract void j(Object paramObject);
  
  public abstract q1 k(Object paramObject1, Object paramObject2);
  
  public final boolean l(B paramB, g1 paramg1)
  {
    paramg1 = (j)paramg1;
    int i = b;
    int j = i >>> 3;
    i &= 0x7;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                paramg1.w(5);
                a(paramB, j, a.m());
                return true;
              }
              j = b0.c;
              throw new b0.a();
            }
            return false;
          }
          q1 localq1 = m();
          while ((paramg1.a() != Integer.MAX_VALUE) && (l(localq1, paramg1))) {}
          if ((j << 3 | 0x4) == b)
          {
            c(j, paramB, q(localq1));
            return true;
          }
          throw b0.a();
        }
        d(paramB, j, paramg1.e());
        return true;
      }
      paramg1.w(1);
      b(paramB, j, a.n());
      return true;
    }
    paramg1.w(0);
    e(paramB, j, a.q());
    return true;
  }
  
  public abstract q1 m();
  
  public abstract void n(Object paramObject, B paramB);
  
  public abstract void o(Object paramObject, T paramT);
  
  public abstract void p();
  
  public abstract q1 q(Object paramObject);
  
  public abstract void r(Object paramObject, l paraml);
  
  public abstract void s(Object paramObject, l paraml);
}

/* Location:
 * Qualified Name:     ma.p1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */