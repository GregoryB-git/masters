package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class acd
  extends yn<yd>
{
  private final yd a(ada paramada)
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
                return yf.a;
              }
              throw new IllegalArgumentException();
            }
            return new yk(Boolean.valueOf(paramada.i()));
          }
          return new yk(new zr(paramada.h()));
        }
        return new yk(paramada.h());
      }
      localObject = new yi();
      paramada.c();
      while (paramada.e()) {
        ((yi)localObject).a(paramada.g(), a(paramada));
      }
      paramada.d();
      return (yd)localObject;
    }
    Object localObject = new yb();
    paramada.a();
    while (paramada.e()) {
      ((yb)localObject).a(a(paramada));
    }
    paramada.b();
    return (yd)localObject;
  }
  
  private final void a(adb paramadb, yd paramyd)
    throws IOException
  {
    if ((paramyd != null) && (!(paramyd instanceof yf)))
    {
      if ((paramyd instanceof yk))
      {
        paramyd = paramyd.g();
        if (paramyd.i())
        {
          paramadb.a(paramyd.a());
        }
        else
        {
          if (!paramyd.h()) {
            break label62;
          }
          paramadb.a(paramyd.f());
        }
        return;
        label62:
        paramadb.b(paramyd.b());
        return;
      }
      boolean bool = paramyd instanceof yb;
      if (bool)
      {
        paramadb.b();
        if (bool)
        {
          paramyd = ((yb)paramyd).iterator();
          while (paramyd.hasNext()) {
            a(paramadb, (yd)paramyd.next());
          }
          paramadb.c();
          return;
        }
        paramadb = new StringBuilder("Not a JSON Array: ");
        paramadb.append(paramyd);
        throw new IllegalStateException(paramadb.toString());
      }
      bool = paramyd instanceof yi;
      if (bool)
      {
        paramadb.d();
        if (bool)
        {
          Iterator localIterator = ((yi)paramyd).h().iterator();
          while (localIterator.hasNext())
          {
            paramyd = (Map.Entry)localIterator.next();
            paramadb.a((String)paramyd.getKey());
            a(paramadb, (yd)paramyd.getValue());
          }
          paramadb.e();
          return;
        }
        paramadb = new StringBuilder("Not a JSON Object: ");
        paramadb.append(paramyd);
        throw new IllegalStateException(paramadb.toString());
      }
      paramadb = new StringBuilder("Couldn't write ");
      paramadb.append(paramyd.getClass());
      throw new IllegalArgumentException(paramadb.toString());
    }
    paramadb.f();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */