package k3;

import c3.g;
import c3.y;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

public final class i
{
  public static final i b = new i();
  public final AtomicReference a = new AtomicReference(new r.b().e());
  
  public static i a()
  {
    return b;
  }
  
  public boolean b(q paramq)
  {
    return ((r)a.get()).e(paramq);
  }
  
  public g c(q paramq, y paramy)
  {
    return ((r)a.get()).f(paramq, paramy);
  }
  
  public g d(o paramo, y paramy)
  {
    if (paramy != null)
    {
      if (!b(paramo)) {
        try
        {
          paramo = new e(paramo, paramy);
          return paramo;
        }
        catch (GeneralSecurityException paramo)
        {
          throw new s("Creating a LegacyProtoKey failed", paramo);
        }
      }
      return c(paramo, paramy);
    }
    throw new NullPointerException("access cannot be null");
  }
  
  public void e(b paramb)
  {
    try
    {
      r.b localb = new k3/r$b;
      localb.<init>((r)a.get());
      paramb = localb.f(paramb).e();
      a.set(paramb);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public void f(c paramc)
  {
    try
    {
      r.b localb = new k3/r$b;
      localb.<init>((r)a.get());
      paramc = localb.g(paramc).e();
      a.set(paramc);
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  public void g(j paramj)
  {
    try
    {
      r.b localb = new k3/r$b;
      localb.<init>((r)a.get());
      paramj = localb.h(paramj).e();
      a.set(paramj);
      return;
    }
    finally
    {
      paramj = finally;
      throw paramj;
    }
  }
  
  public void h(k paramk)
  {
    try
    {
      r.b localb = new k3/r$b;
      localb.<init>((r)a.get());
      paramk = localb.i(paramk).e();
      a.set(paramk);
      return;
    }
    finally
    {
      paramk = finally;
      throw paramk;
    }
  }
}

/* Location:
 * Qualified Name:     k3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */