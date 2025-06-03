package ma;

import java.nio.charset.Charset;

public final class l
{
  public final k a;
  
  public l(k paramk)
  {
    Charset localCharset = a0.a;
    if (paramk != null)
    {
      a = paramk;
      b = this;
      return;
    }
    throw new NullPointerException("output");
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    a.U(paramInt, paramBoolean);
  }
  
  public final void b(int paramInt, h paramh)
  {
    a.W(paramInt, paramh);
  }
  
  public final void c(int paramInt, double paramDouble)
  {
    k localk = a;
    localk.getClass();
    localk.a0(paramInt, Double.doubleToRawLongBits(paramDouble));
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
    k localk = a;
    localk.getClass();
    localk.Y(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public final void h(int paramInt, i1 parami1, Object paramObject)
  {
    k localk = a;
    paramObject = (s0)paramObject;
    localk.k0(paramInt, 3);
    parami1.h(paramObject, b);
    localk.k0(paramInt, 4);
  }
  
  public final void i(int paramInt1, int paramInt2)
  {
    a.c0(paramInt1, paramInt2);
  }
  
  public final void j(int paramInt, long paramLong)
  {
    a.n0(paramInt, paramLong);
  }
  
  public final void k(int paramInt, i1 parami1, Object paramObject)
  {
    a.e0(paramInt, (s0)paramObject, parami1);
  }
  
  public final void l(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof h)) {
      a.h0(paramInt, (h)paramObject);
    } else {
      a.g0(paramInt, (s0)paramObject);
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
 * Qualified Name:     ma.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */