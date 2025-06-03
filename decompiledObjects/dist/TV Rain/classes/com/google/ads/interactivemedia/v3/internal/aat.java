package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public final class aat
  extends yn<Object>
{
  public static final yp a = new aaw();
  private final xu b;
  
  public aat(xu paramxu)
  {
    b = paramxu;
  }
  
  public final Object read(ada paramada)
    throws IOException
  {
    int i = paramada.f().ordinal();
    if (i != 0)
    {
      if (i != 2)
      {
        if (i != 5)
        {
          if (i != 6)
          {
            if (i != 7)
            {
              if (i == 8)
              {
                paramada.j();
                return null;
              }
              throw new IllegalStateException();
            }
            return Boolean.valueOf(paramada.i());
          }
          return Double.valueOf(paramada.k());
        }
        return paramada.h();
      }
      localObject = new zu();
      paramada.c();
      while (paramada.e()) {
        ((Map)localObject).put(paramada.g(), read(paramada));
      }
      paramada.d();
      return localObject;
    }
    Object localObject = new ArrayList();
    paramada.a();
    while (paramada.e()) {
      ((ArrayList)localObject).add(read(paramada));
    }
    paramada.b();
    return localObject;
  }
  
  public final void write(adb paramadb, Object paramObject)
    throws IOException
  {
    if (paramObject == null)
    {
      paramadb.f();
      return;
    }
    yn localyn = b.a(paramObject.getClass());
    if ((localyn instanceof aat))
    {
      paramadb.d();
      paramadb.e();
      return;
    }
    localyn.write(paramadb, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */