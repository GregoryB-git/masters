package n9;

import g9.l;
import g9.l.a;
import g9.m;
import g9.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.d0;

public final class k
{
  public static m a(m paramm)
  {
    d(paramm);
    if ((paramm instanceof l)) {
      return paramm;
    }
    g9.g localg = (g9.g)paramm;
    Object localObject = localg.b();
    if (((List)localObject).size() == 1) {
      return a((m)((List)localObject).get(0));
    }
    paramm = a.iterator();
    while (paramm.hasNext()) {
      if (((m)paramm.next() instanceof g9.g))
      {
        i = 0;
        break label86;
      }
    }
    int i = 1;
    label86:
    if (i != 0) {
      return localg;
    }
    paramm = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramm.add(a((m)((Iterator)localObject).next()));
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramm.iterator();
    while (localIterator.hasNext())
    {
      paramm = (m)localIterator.next();
      if ((paramm instanceof l)) {}
      do
      {
        localArrayList.add(paramm);
        break;
        if (!(paramm instanceof g9.g)) {
          break;
        }
        localObject = (g9.g)paramm;
        paramm = (m)localObject;
      } while (!q0.g.b(b, b));
      localArrayList.addAll(((g9.g)localObject).b());
    }
    if (localArrayList.size() == 1) {
      return (m)localArrayList.get(0);
    }
    return new g9.g(localArrayList, b);
  }
  
  public static g9.g b(l paraml, g9.g paramg)
  {
    if (paramg.e())
    {
      localObject = Collections.singletonList(paraml);
      paraml = new ArrayList(a);
      paraml.addAll((Collection)localObject);
      return new g9.g(paraml, b);
    }
    Object localObject = new ArrayList();
    paramg = paramg.b().iterator();
    while (paramg.hasNext()) {
      ((ArrayList)localObject).add(c(paraml, (m)paramg.next()));
    }
    return new g9.g((List)localObject, 2);
  }
  
  public static m c(m paramm1, m paramm2)
  {
    d(paramm1);
    d(paramm2);
    boolean bool = paramm1 instanceof l;
    int i = 0;
    if ((bool) && ((paramm2 instanceof l)))
    {
      paramm1 = new g9.g(Arrays.asList(new m[] { (l)paramm1, (l)paramm2 }), 1);
    }
    else if ((bool) && ((paramm2 instanceof g9.g)))
    {
      paramm1 = b((l)paramm1, (g9.g)paramm2);
    }
    else if (((paramm1 instanceof g9.g)) && ((paramm2 instanceof l)))
    {
      paramm1 = b((l)paramm2, (g9.g)paramm1);
    }
    else
    {
      paramm1 = (g9.g)paramm1;
      Object localObject = (g9.g)paramm2;
      if ((!paramm1.b().isEmpty()) && (!((g9.g)localObject).b().isEmpty())) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Found an empty composite filter", bool, new Object[0]);
      if ((paramm1.e()) && (((g9.g)localObject).e()))
      {
        paramm2 = ((g9.g)localObject).b();
        localObject = new ArrayList(a);
        ((ArrayList)localObject).addAll(paramm2);
        paramm1 = new g9.g((List)localObject, b);
      }
      else
      {
        int j = b;
        if (j == 2) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0) {
          paramm2 = paramm1;
        } else {
          paramm2 = (m)localObject;
        }
        int k = i;
        if (j == 2) {
          k = 1;
        }
        if (k != 0) {
          paramm1 = (m)localObject;
        }
        localObject = new ArrayList();
        paramm2 = paramm2.b().iterator();
        while (paramm2.hasNext()) {
          ((ArrayList)localObject).add(c((m)paramm2.next(), paramm1));
        }
        paramm1 = new g9.g((List)localObject, 2);
      }
    }
    return a(paramm1);
  }
  
  public static void d(m paramm)
  {
    boolean bool;
    if ((!(paramm instanceof l)) && (!(paramm instanceof g9.g))) {
      bool = false;
    } else {
      bool = true;
    }
    x6.b.Z("Only field filters and composite filters are accepted.", bool, new Object[0]);
  }
  
  public static m e(m paramm)
  {
    d(paramm);
    if ((paramm instanceof l)) {
      return paramm;
    }
    g9.g localg = (g9.g)paramm;
    int i = localg.b().size();
    int j = 1;
    if (i == 1) {
      return e((m)paramm.b().get(0));
    }
    paramm = new ArrayList();
    Iterator localIterator = localg.b().iterator();
    while (localIterator.hasNext()) {
      paramm.add(e((m)localIterator.next()));
    }
    paramm = a(new g9.g(paramm, b));
    if (g(paramm)) {
      return paramm;
    }
    x6.b.Z("field filters are already in DNF form.", paramm instanceof g9.g, new Object[0]);
    localg = (g9.g)paramm;
    x6.b.Z("Disjunction of filters all of which are already in DNF form is itself in DNF form.", localg.e(), new Object[0]);
    boolean bool;
    if (localg.b().size() > 1) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Single-filter composite filters are already in DNF form.", bool, new Object[0]);
    paramm = (m)localg.b().get(0);
    while (j < localg.b().size())
    {
      paramm = c(paramm, (m)localg.b().get(j));
      j++;
    }
    return paramm;
  }
  
  public static m f(m paramm)
  {
    d(paramm);
    ArrayList localArrayList = new ArrayList();
    if ((paramm instanceof l))
    {
      localObject = paramm;
      if ((paramm instanceof v))
      {
        paramm = (v)paramm;
        localObject = b.R().h().iterator();
        while (((Iterator)localObject).hasNext())
        {
          d0 locald0 = (d0)((Iterator)localObject).next();
          localArrayList.add(l.e(c, l.a.d, locald0));
        }
        localObject = new g9.g(localArrayList, 2);
      }
      return (m)localObject;
    }
    paramm = (g9.g)paramm;
    Object localObject = paramm.b().iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(f((m)((Iterator)localObject).next()));
    }
    return new g9.g(localArrayList, b);
  }
  
  public static boolean g(m paramm)
  {
    boolean bool1 = paramm instanceof l;
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (!bool1)
    {
      bool1 = paramm instanceof g9.g;
      g9.g localg;
      Object localObject;
      if (bool1)
      {
        localg = (g9.g)paramm;
        localObject = a.iterator();
        while (((Iterator)localObject).hasNext()) {
          if (((m)((Iterator)localObject).next() instanceof g9.g))
          {
            i = 0;
            break label73;
          }
        }
        i = 1;
        label73:
        if ((i != 0) && (localg.e())) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          i = 1;
          break label109;
        }
      }
      int i = 0;
      label109:
      bool3 = bool2;
      if (i == 0)
      {
        if (bool1)
        {
          paramm = (g9.g)paramm;
          if (b == 2) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            paramm = paramm.b().iterator();
            while (paramm.hasNext())
            {
              localObject = (m)paramm.next();
              if (!(localObject instanceof l))
              {
                if ((localObject instanceof g9.g))
                {
                  localg = (g9.g)localObject;
                  localObject = a.iterator();
                  while (((Iterator)localObject).hasNext()) {
                    if (((m)((Iterator)localObject).next() instanceof g9.g))
                    {
                      i = 0;
                      break label245;
                    }
                  }
                  i = 1;
                  label245:
                  if ((i != 0) && (localg.e())) {
                    i = 1;
                  } else {
                    i = 0;
                  }
                  if (i != 0)
                  {
                    i = 1;
                    break label281;
                  }
                }
                i = 0;
                label281:
                if (i == 0) {
                  break label295;
                }
              }
            }
            i = 1;
            break label298;
          }
        }
        label295:
        i = 0;
        label298:
        if (i != 0) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
    }
    return bool3;
  }
}

/* Location:
 * Qualified Name:     n9.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */