package V3;

import Y3.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class H
  implements i
{
  public static H b = new H();
  public final HashMap a = new HashMap();
  
  public static H b()
  {
    return b;
  }
  
  public void a(h paramh)
  {
    d(paramh);
  }
  
  public void c(h paramh)
  {
    List localList;
    Object localObject;
    synchronized (a)
    {
      localList = (List)a.get(paramh);
      localObject = localList;
      if (localList == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        a.put(paramh, localObject);
      }
    }
    ((List)localObject).add(paramh);
    if (!paramh.e().f())
    {
      h localh = paramh.a(a4.i.a(paramh.e().e()));
      localList = (List)a.get(localh);
      localObject = localList;
      if (localList == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        a.put(localh, localObject);
      }
      ((List)localObject).add(paramh);
    }
    paramh.j(true);
    paramh.k(this);
  }
  
  public final void d(h paramh)
  {
    List localList;
    boolean bool1;
    int i;
    for (;;)
    {
      synchronized (a)
      {
        localList = (List)a.get(paramh);
        bool1 = true;
        i = 0;
        if (localList == null) {
          break label110;
        }
        j = 0;
        if (j >= localList.size()) {
          break;
        }
        if (localList.get(j) == paramh)
        {
          localList.remove(j);
          j = 1;
        }
      }
      j++;
    }
    int j = 0;
    if (localList.isEmpty()) {
      a.remove(paramh);
    }
    boolean bool2 = bool1;
    if (j == 0) {
      label110:
      if (!paramh.g()) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    m.f(bool2);
    if (!paramh.e().f())
    {
      h localh = paramh.a(a4.i.a(paramh.e().e()));
      localList = (List)a.get(localh);
      if (localList != null)
      {
        for (j = i; j < localList.size(); j++) {
          if (localList.get(j) == paramh)
          {
            localList.remove(j);
            break;
          }
        }
        if (localList.isEmpty()) {
          a.remove(localh);
        }
      }
    }
  }
  
  public void e(h paramh)
  {
    List localList;
    for (;;)
    {
      int i;
      synchronized (a)
      {
        localList = (List)a.get(paramh);
        if ((localList == null) || (localList.isEmpty())) {
          break label131;
        }
        if (!paramh.e().f()) {
          break;
        }
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        i = localList.size() - 1;
        if (i < 0) {
          break label131;
        }
        paramh = (h)localList.get(i);
        if (!localHashSet.contains(paramh.e()))
        {
          localHashSet.add(paramh.e());
          paramh.l();
        }
      }
      i--;
    }
    ((h)localList.get(0)).l();
    label131:
  }
}

/* Location:
 * Qualified Name:     V3.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */