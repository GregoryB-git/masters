package i9;

import g9.f0;
import g9.k0;
import j9.i;
import j9.k.a;
import j9.q;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import t8.c;
import t8.e;
import t8.e.a;
import u7.m;

public final class d0
{
  public h a;
  public f b;
  public boolean c;
  public boolean d = false;
  
  public static e b(f0 paramf0, c paramc)
  {
    Object localObject = new e(Collections.emptyList(), paramf0.a());
    Iterator localIterator = paramc.iterator();
    paramc = (c)localObject;
    while (localIterator.hasNext())
    {
      localObject = (j9.g)((Map.Entry)localIterator.next()).getValue();
      if (paramf0.g((j9.g)localObject)) {
        paramc = paramc.a(localObject);
      }
    }
    return paramc;
  }
  
  public static boolean c(f0 paramf0, int paramInt, e parame, q paramq)
  {
    long l = h;
    boolean bool = false;
    int i;
    if (l != -1L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return false;
    }
    if (paramInt != parame.size()) {
      return true;
    }
    if (paramf0.i == 1) {
      paramf0 = a.k();
    } else {
      paramf0 = a.l();
    }
    paramf0 = (j9.g)paramf0;
    if (paramf0 == null) {
      return false;
    }
    if ((paramf0.e()) || (ja.f(a) > 0)) {
      bool = true;
    }
    return bool;
  }
  
  public final c a(e parame, f0 paramf0, k.a parama)
  {
    paramf0 = a.d(paramf0, parama, null);
    parama = parame.iterator();
    for (parame = paramf0;; parame = parame.n(paramf0.getKey(), paramf0))
    {
      paramf0 = (e.a)parama;
      if (!paramf0.hasNext()) {
        break;
      }
      paramf0 = (j9.g)paramf0.next();
    }
    return parame;
  }
  
  public final c<i, j9.g> d(f0 paramf0)
  {
    if (paramf0.h()) {
      return null;
    }
    Object localObject1 = paramf0.i();
    int i = b.k((k0)localObject1);
    boolean bool = true;
    if (q0.g.b(i, 1)) {
      return null;
    }
    int j;
    if (h != -1L) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) && (q0.g.b(i, 2))) {}
    List localList;
    Object localObject2;
    do
    {
      return d(paramf0.f(-1L));
      localList = b.l((k0)localObject1);
      if (localList == null) {
        bool = false;
      }
      x6.b.Z("index manager must return results for partial and full indexes.", bool, new Object[0]);
      localObject2 = a.b(localList);
      localObject1 = b.b((k0)localObject1);
      localObject2 = b(paramf0, (c)localObject2);
    } while (c(paramf0, localList.size(), (e)localObject2, c));
    return a((e)localObject2, paramf0, (k.a)localObject1);
  }
}

/* Location:
 * Qualified Name:     i9.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */