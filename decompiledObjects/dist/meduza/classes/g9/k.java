package g9;

import d9.a0;
import d9.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class k
  implements j0.b
{
  public final j0 a;
  public final HashMap b;
  public final HashSet c = new HashSet();
  public d0 d = d0.a;
  
  public k(j0 paramj0)
  {
    a = paramj0;
    b = new HashMap();
    n = this;
  }
  
  public final void a(List<s0> paramList)
  {
    Iterator localIterator1 = paramList.iterator();
    int i = 0;
    while (localIterator1.hasNext())
    {
      paramList = (s0)localIterator1.next();
      Object localObject = a;
      localObject = (b)b.get(localObject);
      if (localObject != null)
      {
        Iterator localIterator2 = a.iterator();
        while (localIterator2.hasNext()) {
          if (((g0)localIterator2.next()).b(paramList)) {
            i = 1;
          }
        }
        b = paramList;
      }
    }
    if (i != 0) {
      b();
    }
  }
  
  public final void b()
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext()) {
      ((l)localIterator.next()).a(null, null);
    }
  }
  
  public static final class a
  {
    public boolean a;
    public boolean b;
    public boolean c;
    public a0 d = a0.a;
  }
  
  public static final class b
  {
    public final ArrayList a = new ArrayList();
    public s0 b;
    
    public final boolean a()
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        if (((g0)localIterator.next()).a()) {
          return true;
        }
      }
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     g9.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */