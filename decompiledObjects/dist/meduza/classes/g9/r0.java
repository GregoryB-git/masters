package g9;

import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import m9.k0;
import o4.o;
import t8.c;
import t8.e;
import t8.e.a;
import x6.b;

public final class r0
{
  public final f0 a;
  public int b;
  public boolean c;
  public j9.j d;
  public e<j9.i> e;
  public e<j9.i> f;
  public e<j9.i> g;
  
  public r0(f0 paramf0, e<j9.i> parame)
  {
    a = paramf0;
    b = 1;
    paramf0 = new o(paramf0.a(), 1);
    d = new j9.j(j9.h.a, new e(Collections.emptyList(), paramf0));
    e = parame;
    paramf0 = j9.i.c;
    f = paramf0;
    g = paramf0;
  }
  
  public static int b(i parami)
  {
    int i = a.ordinal();
    if (i != 0)
    {
      int j = 1;
      if (i != 1)
      {
        j = 2;
        if (i != 2)
        {
          if (i == 3) {
            return 2;
          }
          StringBuilder localStringBuilder = f.l("Unknown change type: ");
          localStringBuilder.append(a);
          throw new IllegalArgumentException(localStringBuilder.toString());
        }
      }
      return j;
    }
    return 0;
  }
  
  public final d5.n a(a parama, k0 paramk0, boolean paramBoolean)
  {
    b.Z("Cannot apply changes that need a refill", c ^ true, new Object[0]);
    j9.j localj = d;
    d = a;
    g = d;
    Object localObject1 = b;
    localObject1.getClass();
    ArrayList localArrayList = new ArrayList(a.values());
    Collections.sort(localArrayList, new q0(this));
    if (paramk0 != null)
    {
      localObject1 = c.iterator();
      for (;;)
      {
        localObject2 = (e.a)localObject1;
        if (!((e.a)localObject2).hasNext()) {
          break;
        }
        localObject2 = (j9.i)((e.a)localObject2).next();
        e = e.a(localObject2);
      }
      localObject1 = d.iterator();
      for (;;)
      {
        localObject2 = (e.a)localObject1;
        if (!((e.a)localObject2).hasNext()) {
          break;
        }
        localObject2 = (j9.i)((e.a)localObject2).next();
        b.Z("Modified document %s not found in view.", e.contains(localObject2), new Object[] { localObject2 });
      }
      localObject1 = e.iterator();
      for (;;)
      {
        localObject2 = (e.a)localObject1;
        if (!((e.a)localObject2).hasNext()) {
          break;
        }
        localObject2 = (j9.i)((e.a)localObject2).next();
        e = e.i(localObject2);
      }
      c = b;
    }
    int i;
    if (paramBoolean)
    {
      localObject1 = Collections.emptyList();
    }
    else if (!c)
    {
      localObject1 = Collections.emptyList();
    }
    else
    {
      localObject2 = f;
      f = j9.i.c;
      localObject1 = d.iterator();
      Object localObject4;
      for (;;)
      {
        localObject3 = (e.a)localObject1;
        if (!((e.a)localObject3).hasNext()) {
          break;
        }
        localObject3 = (j9.g)((e.a)localObject3).next();
        localObject4 = ((j9.g)localObject3).getKey();
        if (!e.contains(localObject4))
        {
          localObject4 = (j9.g)d.a.h(localObject4);
          if ((localObject4 != null) && (!((j9.g)localObject4).d())) {}
        }
        else
        {
          i = 0;
          break label393;
        }
        i = 1;
        label393:
        if (i != 0) {
          f = f.a(((j9.g)localObject3).getKey());
        }
      }
      i = ((e)localObject2).size();
      localObject1 = new ArrayList(f.size() + i);
      Object localObject3 = ((e)localObject2).iterator();
      for (;;)
      {
        localObject4 = (e.a)localObject3;
        if (!((e.a)localObject4).hasNext()) {
          break;
        }
        localObject4 = (j9.i)((e.a)localObject4).next();
        if (!f.contains(localObject4)) {
          ((ArrayList)localObject1).add(new z(z.a.b, (j9.i)localObject4));
        }
      }
      localObject3 = f.iterator();
      for (;;)
      {
        localObject4 = (e.a)localObject3;
        if (!((e.a)localObject4).hasNext()) {
          break;
        }
        localObject4 = (j9.i)((e.a)localObject4).next();
        if (!((e)localObject2).contains(localObject4)) {
          ((ArrayList)localObject1).add(new z(z.a.a, (j9.i)localObject4));
        }
      }
    }
    if ((f.size() == 0) && (c) && (!paramBoolean)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      i = 3;
    } else {
      i = 2;
    }
    if (i != b) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    b = i;
    Object localObject2 = null;
    if ((localArrayList.size() != 0) || (paramBoolean))
    {
      boolean bool1;
      if (i == 2) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      boolean bool2;
      if ((paramk0 != null) && (!a.isEmpty())) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localObject2 = new s0(a, a, localj, localArrayList, bool1, d, paramBoolean, false, bool2);
    }
    return new d5.n(2, localObject2, localObject1);
  }
  
  public final a c(c<j9.i, j9.g> paramc, a parama)
  {
    i.a locala = i.a.a;
    j localj;
    if (parama != null) {
      localj = b;
    } else {
      localj = new j();
    }
    if (parama != null) {
      localObject1 = a;
    } else {
      localObject1 = d;
    }
    if (parama != null) {
      localObject2 = d;
    } else {
      localObject2 = g;
    }
    j9.g localg1;
    if ((q0.g.b(a.i, 1)) && (((j9.j)localObject1).size() == a.h)) {
      localg1 = (j9.g)b.a.k();
    } else {
      localg1 = null;
    }
    j9.g localg2;
    if ((q0.g.b(a.i, 2)) && (((j9.j)localObject1).size() == a.h)) {
      localg2 = (j9.g)b.a.l();
    } else {
      localg2 = null;
    }
    Iterator localIterator = paramc.iterator();
    Object localObject3 = localObject1;
    boolean bool1 = false;
    paramc = (c<j9.i, j9.g>)localObject2;
    int i;
    while (localIterator.hasNext())
    {
      localObject2 = (Map.Entry)localIterator.next();
      j9.i locali = (j9.i)((Map.Entry)localObject2).getKey();
      Object localObject4 = (j9.g)a.h(locali);
      if (a.g((j9.g)((Map.Entry)localObject2).getValue())) {
        localObject2 = (j9.g)((Map.Entry)localObject2).getValue();
      } else {
        localObject2 = null;
      }
      if ((localObject4 != null) && (g.contains(((j9.g)localObject4).getKey()))) {
        i = 1;
      } else {
        i = 0;
      }
      if (localObject2 != null)
      {
        if (!((j9.g)localObject2).d()) {
          if ((!g.contains(((j9.g)localObject2).getKey())) || (!((j9.g)localObject2).c())) {
            break label355;
          }
        }
        j = 1;
        break label358;
      }
      label355:
      int j = 0;
      label358:
      if ((localObject4 != null) && (localObject2 != null))
      {
        if (!((j9.g)localObject4).getData().equals(((j9.g)localObject2).getData()))
        {
          if ((((j9.g)localObject4).d()) && (((j9.g)localObject2).c()) && (!((j9.g)localObject2).d())) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label601;
          }
          localj.a(new i(i.a.c, (j9.g)localObject2));
          if ((localg1 != null) && (a.a().compare(localObject2, localg1) > 0)) {
            break label592;
          }
          if ((localg2 == null) || (a.a().compare(localObject2, localg2) >= 0)) {
            break label551;
          }
          break label592;
        }
        if (i == j) {
          break label601;
        }
        localObject4 = new i(i.a.d, (j9.g)localObject2);
      }
      else
      {
        if ((localObject4 != null) || (localObject2 == null)) {
          break label557;
        }
        localObject4 = new i(i.a.b, (j9.g)localObject2);
      }
      localj.a((i)localObject4);
      label551:
      label557:
      do
      {
        i = 1;
        break label604;
        if ((localObject4 == null) || (localObject2 != null)) {
          break;
        }
        localj.a(new i(locala, (j9.g)localObject4));
      } while ((localg1 == null) && (localg2 == null));
      label592:
      i = 1;
      bool1 = true;
      break label604;
      label601:
      i = 0;
      label604:
      c<j9.i, j9.g> localc = paramc;
      localObject4 = localObject3;
      if (i != 0)
      {
        if (localObject2 != null)
        {
          localObject3 = ((j9.j)localObject3).a((j9.g)localObject2);
          if (((j9.g)localObject2).d()) {
            paramc = paramc.a(((j9.g)localObject2).getKey());
          } else {
            paramc = paramc.i(((j9.g)localObject2).getKey());
          }
        }
        else
        {
          localObject3 = ((j9.j)localObject3).h(locali);
          paramc = paramc.i(locali);
        }
        localObject4 = localObject3;
        localc = paramc;
      }
      paramc = localc;
      localObject3 = localObject4;
    }
    if (a.h != -1L) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1 = paramc;
    Object localObject2 = localObject3;
    if (i != 0) {
      for (long l = ((j9.j)localObject3).size() - a.h;; l -= 1L)
      {
        localObject1 = paramc;
        localObject2 = localObject3;
        if (l <= 0L) {
          break;
        }
        if (q0.g.b(a.i, 1)) {
          localObject1 = (j9.g)b.a.k();
        } else {
          localObject1 = (j9.g)b.a.l();
        }
        localObject3 = ((j9.j)localObject3).h(((j9.g)localObject1).getKey());
        paramc = paramc.i(((j9.g)localObject1).getKey());
        localj.a(new i(locala, (j9.g)localObject1));
      }
    }
    boolean bool2;
    if ((bool1) && (parama != null)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    b.Z("View was refilled using docs that themselves needed refilling.", bool2, new Object[0]);
    return new a((j9.j)localObject2, localj, (e)localObject1, bool1);
  }
  
  public static final class a
  {
    public final j9.j a;
    public final j b;
    public final boolean c;
    public final e<j9.i> d;
    
    public a(j9.j paramj, j paramj1, e parame, boolean paramBoolean)
    {
      a = paramj;
      b = paramj1;
      d = parame;
      c = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     g9.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */