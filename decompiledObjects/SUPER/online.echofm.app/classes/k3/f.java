package k3;

import c3.k;
import c3.v;
import c3.v.c;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n3.b.a;
import n3.c;
import n3.c.b;
import p3.z;

public abstract class f
{
  public static final b.a a = new b(null);
  
  public static c a(v paramv)
  {
    c.b localb = c.a();
    localb.d(paramv.d());
    Iterator localIterator1 = paramv.c().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((List)localIterator1.next()).iterator();
      while (localIterator2.hasNext())
      {
        v.c localc = (v.c)localIterator2.next();
        localb.a(c(localc.h()), localc.d(), b(localc.e()), localc.f().name());
      }
    }
    if (paramv.e() != null) {
      localb.e(paramv.e().d());
    }
    try
    {
      paramv = localb.b();
      return paramv;
    }
    catch (GeneralSecurityException paramv)
    {
      throw new IllegalStateException(paramv);
    }
  }
  
  public static String b(String paramString)
  {
    if (!paramString.startsWith("type.googleapis.com/google.crypto.")) {
      return paramString;
    }
    return paramString.substring(34);
  }
  
  public static k c(z paramz)
  {
    int i = a.a[paramz.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return k.d;
        }
        throw new IllegalStateException("Unknown key status");
      }
      return k.c;
    }
    return k.b;
  }
  
  public static class b
    implements b.a
  {
    public void a() {}
    
    public void b(int paramInt, long paramLong) {}
  }
}

/* Location:
 * Qualified Name:     k3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */