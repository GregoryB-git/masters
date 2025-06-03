package androidx.datastore.preferences.protobuf;

public class n0
  extends l0
{
  public m0 A(Object paramObject)
  {
    return unknownFields;
  }
  
  public int B(m0 paramm0)
  {
    return paramm0.f();
  }
  
  public int C(m0 paramm0)
  {
    return paramm0.g();
  }
  
  public m0 D(m0 paramm01, m0 paramm02)
  {
    if (!paramm02.equals(m0.e())) {
      paramm01 = m0.k(paramm01, paramm02);
    }
    return paramm01;
  }
  
  public m0 E()
  {
    return m0.l();
  }
  
  public void F(Object paramObject, m0 paramm0)
  {
    G(paramObject, paramm0);
  }
  
  public void G(Object paramObject, m0 paramm0)
  {
    unknownFields = paramm0;
  }
  
  public m0 H(m0 paramm0)
  {
    paramm0.j();
    return paramm0;
  }
  
  public void I(m0 paramm0, s0 params0)
  {
    paramm0.o(params0);
  }
  
  public void J(m0 paramm0, s0 params0)
  {
    paramm0.q(params0);
  }
  
  public void j(Object paramObject)
  {
    A(paramObject).j();
  }
  
  public boolean q(d0 paramd0)
  {
    return false;
  }
  
  public void u(m0 paramm0, int paramInt1, int paramInt2)
  {
    paramm0.n(r0.c(paramInt1, 5), Integer.valueOf(paramInt2));
  }
  
  public void v(m0 paramm0, int paramInt, long paramLong)
  {
    paramm0.n(r0.c(paramInt, 1), Long.valueOf(paramLong));
  }
  
  public void w(m0 paramm01, int paramInt, m0 paramm02)
  {
    paramm01.n(r0.c(paramInt, 3), paramm02);
  }
  
  public void x(m0 paramm0, int paramInt, g paramg)
  {
    paramm0.n(r0.c(paramInt, 2), paramg);
  }
  
  public void y(m0 paramm0, int paramInt, long paramLong)
  {
    paramm0.n(r0.c(paramInt, 0), Long.valueOf(paramLong));
  }
  
  public m0 z(Object paramObject)
  {
    m0 localm01 = A(paramObject);
    m0 localm02 = localm01;
    if (localm01 == m0.e())
    {
      localm02 = m0.l();
      G(paramObject, localm02);
    }
    return localm02;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */