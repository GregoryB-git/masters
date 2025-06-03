package k3;

import c3.g;
import c3.v;
import c3.w;
import java.util.concurrent.atomic.AtomicReference;

public final class h
{
  public static h b = new h();
  public final AtomicReference a = new AtomicReference(new n.b().c());
  
  public static h c()
  {
    return b;
  }
  
  public Class a(Class paramClass)
  {
    return ((n)a.get()).c(paramClass);
  }
  
  public Object b(g paramg, Class paramClass)
  {
    return ((n)a.get()).d(paramg, paramClass);
  }
  
  public void d(l paraml)
  {
    try
    {
      n.b localb = new k3/n$b;
      localb.<init>((n)a.get());
      paraml = localb.d(paraml).c();
      a.set(paraml);
      return;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  public void e(w paramw)
  {
    try
    {
      n.b localb = new k3/n$b;
      localb.<init>((n)a.get());
      paramw = localb.e(paramw).c();
      a.set(paramw);
      return;
    }
    finally
    {
      paramw = finally;
      throw paramw;
    }
  }
  
  public Object f(v paramv, Class paramClass)
  {
    return ((n)a.get()).e(paramv, paramClass);
  }
}

/* Location:
 * Qualified Name:     k3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */