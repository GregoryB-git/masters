package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class aay<T>
  extends yn<T>
{
  private final zy<T> a;
  private final Map<String, aax> b;
  
  public aay(zy<T> paramzy, Map<String, aax> paramMap)
  {
    a = paramzy;
    b = paramMap;
  }
  
  public final T read(ada paramada)
    throws IOException
  {
    if (paramada.f() == adc.i)
    {
      paramada.j();
      return null;
    }
    Object localObject1 = a.a();
    try
    {
      paramada.c();
      while (paramada.e())
      {
        Object localObject2 = paramada.g();
        localObject2 = (aax)b.get(localObject2);
        if ((localObject2 != null) && (c)) {
          ((aax)localObject2).a(paramada, localObject1);
        } else {
          paramada.n();
        }
      }
      paramada.d();
      return (T)localObject1;
    }
    catch (IllegalAccessException paramada)
    {
      throw new AssertionError(paramada);
    }
    catch (IllegalStateException paramada)
    {
      throw new yl(paramada);
    }
  }
  
  public final void write(adb paramadb, T paramT)
    throws IOException
  {
    if (paramT == null)
    {
      paramadb.f();
      return;
    }
    paramadb.d();
    try
    {
      Iterator localIterator = b.values().iterator();
      while (localIterator.hasNext())
      {
        aax localaax = (aax)localIterator.next();
        if (localaax.a(paramT))
        {
          paramadb.a(a);
          localaax.a(paramadb, paramT);
        }
      }
      paramadb.e();
      return;
    }
    catch (IllegalAccessException paramadb)
    {
      throw new AssertionError(paramadb);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */