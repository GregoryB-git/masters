package h4;

import c4.j;
import c4.t;
import c4.t.a;
import c4.u;
import c4.v;

public final class d
  implements j
{
  public final long a;
  public final j b;
  
  public d(long paramLong, j paramj)
  {
    a = paramLong;
    b = paramj;
  }
  
  public final void m()
  {
    b.m();
  }
  
  public final v r(int paramInt1, int paramInt2)
  {
    return b.r(paramInt1, paramInt2);
  }
  
  public final void t(final t paramt)
  {
    b.t(new a(paramt));
  }
  
  public final class a
    implements t
  {
    public a(t paramt) {}
    
    public final boolean e()
    {
      return paramt.e();
    }
    
    public final t.a g(long paramLong)
    {
      Object localObject = paramt.g(paramLong);
      u localu = a;
      long l1 = a;
      long l2 = b;
      paramLong = a;
      localu = new u(l1, l2 + paramLong);
      localObject = b;
      return new t.a(localu, new u(a, b + paramLong));
    }
    
    public final long h()
    {
      return paramt.h();
    }
  }
}

/* Location:
 * Qualified Name:     h4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */