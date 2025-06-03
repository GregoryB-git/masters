package H0;

import X2.g0;
import X2.v;
import X2.v.a;
import g0.z;
import java.util.Iterator;

public final class f
  implements a
{
  public final v a;
  public final int b;
  
  public f(int paramInt, v paramv)
  {
    b = paramInt;
    a = paramv;
  }
  
  public static a b(int paramInt1, int paramInt2, z paramz)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 1852994675: 
      return h.b(paramz);
    case 1752331379: 
      return d.d(paramz);
    case 1751742049: 
      return c.c(paramz);
    }
    return g.e(paramInt2, paramz);
  }
  
  public static f d(int paramInt, z paramz)
  {
    v.a locala = new v.a();
    int i = paramz.g();
    int k;
    for (int j = -2; paramz.a() > 8; j = k)
    {
      k = paramz.t();
      int m = paramz.t();
      m = paramz.f() + m;
      paramz.S(m);
      Object localObject;
      if (k == 1414744396) {
        localObject = d(paramz.t(), paramz);
      } else {
        localObject = b(k, j, paramz);
      }
      k = j;
      if (localObject != null)
      {
        if (((a)localObject).a() == 1752331379) {
          j = ((d)localObject).c();
        }
        locala.h(localObject);
        k = j;
      }
      paramz.T(m);
      paramz.S(i);
    }
    return new f(paramInt, locala.k());
  }
  
  public int a()
  {
    return b;
  }
  
  public a c(Class paramClass)
  {
    g0 localg0 = a.q();
    while (localg0.hasNext())
    {
      a locala = (a)localg0.next();
      if (locala.getClass() == paramClass) {
        return locala;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     H0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */