package s0;

import java.nio.charset.Charset;

public final class k
{
  public final j a;
  
  public k(j paramj)
  {
    Charset localCharset = x.a;
    if (paramj != null)
    {
      a = paramj;
      b = this;
      return;
    }
    throw new NullPointerException("output");
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    a.U(paramInt, paramBoolean);
  }
  
  public final void b(int paramInt, g paramg)
  {
    a.W(paramInt, paramg);
  }
  
  public final void c(int paramInt, double paramDouble)
  {
    j localj = a;
    localj.getClass();
    localj.a0(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    a.c0(paramInt1, paramInt2);
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    a.Y(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt, long paramLong)
  {
    a.a0(paramInt, paramLong);
  }
  
  public final void g(float paramFloat, int paramInt)
  {
    j localj = a;
    localj.getClass();
    localj.Y(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public final void h(int paramInt, c1 paramc1, Object paramObject)
  {
    j localj = a;
    paramObject = (o0)paramObject;
    localj.k0(paramInt, 3);
    paramc1.h(paramObject, b);
    localj.k0(paramInt, 4);
  }
  
  public final void i(int paramInt1, int paramInt2)
  {
    a.c0(paramInt1, paramInt2);
  }
  
  public final void j(int paramInt, long paramLong)
  {
    a.n0(paramInt, paramLong);
  }
  
  public final void k(int paramInt, c1 paramc1, Object paramObject)
  {
    a.e0(paramInt, (o0)paramObject, paramc1);
  }
  
  public final void l(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof g)) {
      a.h0(paramInt, (g)paramObject);
    } else {
      a.g0(paramInt, (o0)paramObject);
    }
  }
  
  public final void m(int paramInt1, int paramInt2)
  {
    a.Y(paramInt1, paramInt2);
  }
  
  public final void n(int paramInt, long paramLong)
  {
    a.a0(paramInt, paramLong);
  }
  
  public final void o(int paramInt1, int paramInt2)
  {
    a.l0(paramInt1, paramInt2 >> 31 ^ paramInt2 << 1);
  }
  
  public final void p(int paramInt, long paramLong)
  {
    a.n0(paramInt, paramLong >> 63 ^ paramLong << 1);
  }
  
  public final void q(int paramInt1, int paramInt2)
  {
    a.l0(paramInt1, paramInt2);
  }
  
  public final void r(int paramInt, long paramLong)
  {
    a.n0(paramInt, paramLong);
  }
}

/* Location:
 * Qualified Name:     s0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */