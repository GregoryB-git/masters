package l3;

import c3.v;
import c3.v.c;
import c3.w;
import c3.x;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class h
  implements w
{
  public static final h a = new h();
  
  public static void d()
  {
    x.n(a);
  }
  
  public Class a()
  {
    return g.class;
  }
  
  public Class c()
  {
    return g.class;
  }
  
  public g e(v paramv)
  {
    if (paramv != null)
    {
      if (paramv.e() != null)
      {
        Iterator localIterator1 = paramv.c().iterator();
        while (localIterator1.hasNext())
        {
          Iterator localIterator2 = ((List)localIterator1.next()).iterator();
          while (localIterator2.hasNext()) {
            g localg = (g)((v.c)localIterator2.next()).a();
          }
        }
        return new b(paramv, null);
      }
      throw new GeneralSecurityException("no primary in primitive set");
    }
    throw new GeneralSecurityException("primitive set must be non-null");
  }
  
  public static class b
    implements g
  {
    public final v a;
    
    public b(v paramv)
    {
      a = paramv;
    }
  }
}

/* Location:
 * Qualified Name:     l3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */