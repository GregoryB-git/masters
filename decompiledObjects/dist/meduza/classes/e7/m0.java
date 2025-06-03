package e7;

import java.util.Iterator;
import java.util.List;
import nc.g0;

public final class m0<V>
{
  public static final Object f = new Object();
  public final String a;
  public final l0<V> b;
  public final V c;
  public final Object d = new Object();
  public volatile V e = null;
  
  public m0() {}
  
  public m0(String paramString, Object paramObject, l0 paraml0)
  {
    a = paramString;
    c = paramObject;
    b = paraml0;
  }
  
  public final V a(V paramV)
  {
    synchronized (d)
    {
      if (paramV == null) {}
    }
    return (V)c;
    synchronized (f)
    {
      if (g0.d())
      {
        if (e == null) {
          paramV = c;
        } else {
          paramV = e;
        }
        return paramV;
      }
      for (;;)
      {
        try
        {
          Iterator localIterator = h0.a.iterator();
          if (localIterator.hasNext())
          {
            localm0 = (m0)localIterator.next();
            boolean bool = g0.d();
            if (!bool) {
              ??? = null;
            }
          }
        }
        catch (SecurityException paramV)
        {
          m0 localm0;
          l0 locall0;
          continue;
        }
        try
        {
          locall0 = b;
          paramV = (V)???;
          if (locall0 != null) {
            paramV = locall0.zza();
          }
        }
        catch (IllegalStateException paramV)
        {
          paramV = (V)???;
          continue;
        }
        synchronized (f)
        {
          e = paramV;
        }
      }
      paramV = new java/lang/IllegalStateException;
      paramV.<init>("Refreshing flag cache must be done on a worker thread.");
      throw paramV;
      paramV = b;
      if (paramV == null) {
        return (V)c;
      }
      try
      {
        paramV = paramV.zza();
        return paramV;
      }
      catch (IllegalStateException paramV)
      {
        return (V)c;
      }
      catch (SecurityException paramV)
      {
        return (V)c;
      }
    }
    for (;;)
    {
      throw paramV;
      paramV = finally;
    }
  }
}

/* Location:
 * Qualified Name:     e7.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */