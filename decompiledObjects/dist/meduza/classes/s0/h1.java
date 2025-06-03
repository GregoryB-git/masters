package s0;

public abstract class h1<T, B>
{
  public abstract void a(B paramB, int paramInt1, int paramInt2);
  
  public abstract void b(B paramB, int paramInt, long paramLong);
  
  public abstract void c(int paramInt, Object paramObject1, Object paramObject2);
  
  public abstract void d(B paramB, int paramInt, g paramg);
  
  public abstract void e(B paramB, int paramInt, long paramLong);
  
  public abstract i1 f(Object paramObject);
  
  public abstract i1 g(Object paramObject);
  
  public abstract int h(T paramT);
  
  public abstract int i(T paramT);
  
  public abstract void j(Object paramObject);
  
  public abstract i1 k(Object paramObject1, Object paramObject2);
  
  public final boolean l(B paramB, b1 paramb1)
  {
    int i = paramb1.p();
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
                a(paramB, j, paramb1.j());
                return true;
              }
              j = y.a;
              throw new y.a();
            }
            return false;
          }
          i1 locali1 = m();
          while ((paramb1.A() != Integer.MAX_VALUE) && (l(locali1, paramb1))) {}
          if ((0x4 | j << 3) == paramb1.p())
          {
            c(j, paramB, q(locali1));
            return true;
          }
          throw new y("Protocol message end-group tag did not match expected tag.");
        }
        d(paramB, j, paramb1.E());
        return true;
      }
      b(paramB, j, paramb1.d());
      return true;
    }
    e(paramB, j, paramb1.L());
    return true;
  }
  
  public abstract i1 m();
  
  public abstract void n(Object paramObject, B paramB);
  
  public abstract void o(Object paramObject, T paramT);
  
  public abstract void p();
  
  public abstract i1 q(Object paramObject);
  
  public abstract void r(Object paramObject, k paramk);
  
  public abstract void s(Object paramObject, k paramk);
}

/* Location:
 * Qualified Name:     s0.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */