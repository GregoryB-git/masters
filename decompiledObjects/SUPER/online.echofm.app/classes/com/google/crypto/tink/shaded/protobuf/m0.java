package com.google.crypto.tink.shaded.protobuf;

public class m0
  extends k0
{
  public l0 A(Object paramObject)
  {
    return unknownFields;
  }
  
  public int B(l0 paraml0)
  {
    return paraml0.d();
  }
  
  public int C(l0 paraml0)
  {
    return paraml0.e();
  }
  
  public l0 D(l0 paraml01, l0 paraml02)
  {
    if (l0.c().equals(paraml02)) {
      return paraml01;
    }
    if (l0.c().equals(paraml01)) {
      return l0.j(paraml01, paraml02);
    }
    return paraml01.i(paraml02);
  }
  
  public l0 E()
  {
    return l0.k();
  }
  
  public void F(Object paramObject, l0 paraml0)
  {
    G(paramObject, paraml0);
  }
  
  public void G(Object paramObject, l0 paraml0)
  {
    unknownFields = paraml0;
  }
  
  public l0 H(l0 paraml0)
  {
    paraml0.h();
    return paraml0;
  }
  
  public void I(l0 paraml0, r0 paramr0)
  {
    paraml0.p(paramr0);
  }
  
  public void J(l0 paraml0, r0 paramr0)
  {
    paraml0.r(paramr0);
  }
  
  public void j(Object paramObject)
  {
    A(paramObject).h();
  }
  
  public boolean q(d0 paramd0)
  {
    return false;
  }
  
  public void u(l0 paraml0, int paramInt1, int paramInt2)
  {
    paraml0.n(q0.c(paramInt1, 5), Integer.valueOf(paramInt2));
  }
  
  public void v(l0 paraml0, int paramInt, long paramLong)
  {
    paraml0.n(q0.c(paramInt, 1), Long.valueOf(paramLong));
  }
  
  public void w(l0 paraml01, int paramInt, l0 paraml02)
  {
    paraml01.n(q0.c(paramInt, 3), paraml02);
  }
  
  public void x(l0 paraml0, int paramInt, h paramh)
  {
    paraml0.n(q0.c(paramInt, 2), paramh);
  }
  
  public void y(l0 paraml0, int paramInt, long paramLong)
  {
    paraml0.n(q0.c(paramInt, 0), Long.valueOf(paramLong));
  }
  
  public l0 z(Object paramObject)
  {
    l0 locall01 = A(paramObject);
    l0 locall02 = locall01;
    if (locall01 == l0.c())
    {
      locall02 = l0.k();
      G(paramObject, locall02);
    }
    return locall02;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */