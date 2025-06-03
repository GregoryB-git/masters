package com.google.protobuf;

public abstract class r$a
  extends a.a
{
  public final r o;
  public r p;
  
  public r$a(r paramr)
  {
    o = paramr;
    if (!paramr.I())
    {
      p = C();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  public static void B(Object paramObject1, Object paramObject2)
  {
    W.a().d(paramObject1).a(paramObject1, paramObject2);
  }
  
  private r C()
  {
    return o.P();
  }
  
  public r A()
  {
    return o;
  }
  
  public final r v()
  {
    r localr = w();
    if (localr.G()) {
      return localr;
    }
    throw a.a.u(localr);
  }
  
  public r w()
  {
    if (!p.I()) {
      return p;
    }
    p.J();
    return p;
  }
  
  public a x()
  {
    a locala = A().N();
    p = w();
    return locala;
  }
  
  public final void y()
  {
    if (!p.I()) {
      z();
    }
  }
  
  public void z()
  {
    r localr = C();
    B(localr, p);
    p = localr;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */