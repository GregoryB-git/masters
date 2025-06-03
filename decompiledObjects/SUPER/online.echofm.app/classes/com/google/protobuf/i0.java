package com.google.protobuf;

public class i0
  extends g0
{
  public void d(Object paramObject)
  {
    i(paramObject).h();
  }
  
  public h0 i(Object paramObject)
  {
    return unknownFields;
  }
  
  public int j(h0 paramh0)
  {
    return paramh0.d();
  }
  
  public int k(h0 paramh0)
  {
    return paramh0.e();
  }
  
  public h0 l(h0 paramh01, h0 paramh02)
  {
    if (h0.c().equals(paramh02)) {
      return paramh01;
    }
    if (h0.c().equals(paramh01)) {
      return h0.j(paramh01, paramh02);
    }
    return paramh01.i(paramh02);
  }
  
  public void m(Object paramObject, h0 paramh0)
  {
    unknownFields = paramh0;
  }
  
  public void n(h0 paramh0, n0 paramn0)
  {
    paramh0.n(paramn0);
  }
  
  public void o(h0 paramh0, n0 paramn0)
  {
    paramh0.p(paramn0);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */