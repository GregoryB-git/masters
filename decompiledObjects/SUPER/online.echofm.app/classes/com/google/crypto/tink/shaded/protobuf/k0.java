package com.google.crypto.tink.shaded.protobuf;

public abstract class k0
{
  public abstract void a(Object paramObject, int paramInt1, int paramInt2);
  
  public abstract void b(Object paramObject, int paramInt, long paramLong);
  
  public abstract void c(Object paramObject1, int paramInt, Object paramObject2);
  
  public abstract void d(Object paramObject, int paramInt, h paramh);
  
  public abstract void e(Object paramObject, int paramInt, long paramLong);
  
  public abstract Object f(Object paramObject);
  
  public abstract Object g(Object paramObject);
  
  public abstract int h(Object paramObject);
  
  public abstract int i(Object paramObject);
  
  public abstract void j(Object paramObject);
  
  public abstract Object k(Object paramObject1, Object paramObject2);
  
  public final void l(Object paramObject, d0 paramd0)
  {
    while ((paramd0.p() != Integer.MAX_VALUE) && (m(paramObject, paramd0))) {}
  }
  
  public final boolean m(Object paramObject, d0 paramd0)
  {
    int i = paramd0.e();
    int j = q0.a(i);
    i = q0.b(i);
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
                a(paramObject, j, paramd0.n());
                return true;
              }
              throw A.e();
            }
            return false;
          }
          Object localObject = n();
          i = q0.c(j, 4);
          l(localObject, paramd0);
          if (i == paramd0.e())
          {
            c(paramObject, j, r(localObject));
            return true;
          }
          throw A.b();
        }
        d(paramObject, j, paramd0.u());
        return true;
      }
      b(paramObject, j, paramd0.f());
      return true;
    }
    e(paramObject, j, paramd0.E());
    return true;
  }
  
  public abstract Object n();
  
  public abstract void o(Object paramObject1, Object paramObject2);
  
  public abstract void p(Object paramObject1, Object paramObject2);
  
  public abstract boolean q(d0 paramd0);
  
  public abstract Object r(Object paramObject);
  
  public abstract void s(Object paramObject, r0 paramr0);
  
  public abstract void t(Object paramObject, r0 paramr0);
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */