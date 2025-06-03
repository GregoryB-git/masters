package com.google.crypto.tink.shaded.protobuf;

public abstract class x$a
  extends a.a
{
  public final x o;
  public x p;
  
  public x$a(x paramx)
  {
    o = paramx;
    if (!paramx.D())
    {
      p = x();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  public static void w(Object paramObject1, Object paramObject2)
  {
    a0.a().d(paramObject1).a(paramObject1, paramObject2);
  }
  
  private x x()
  {
    return o.J();
  }
  
  public final x n()
  {
    x localx = o();
    if (localx.B()) {
      return localx;
    }
    throw a.a.l(localx);
  }
  
  public x o()
  {
    if (!p.D()) {
      return p;
    }
    p.E();
    return p;
  }
  
  public a p()
  {
    a locala = u().H();
    p = o();
    return locala;
  }
  
  public final void s()
  {
    if (!p.D()) {
      t();
    }
  }
  
  public void t()
  {
    x localx = x();
    w(localx, p);
    p = localx;
  }
  
  public x u()
  {
    return o;
  }
  
  public a v(x paramx)
  {
    if (u().equals(paramx)) {
      return this;
    }
    s();
    w(p, paramx);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */