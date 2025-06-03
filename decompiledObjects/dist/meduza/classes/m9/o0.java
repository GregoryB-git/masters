package m9;

import g9.i.a;
import i9.m1;
import j9.f;
import j9.i;
import j9.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import t8.e;
import t8.e.a;
import x6.b;

public final class o0
{
  public final a a;
  public final HashMap b = new HashMap();
  public HashMap c = new HashMap();
  public HashMap d = new HashMap();
  public HashMap e = new HashMap();
  public final f f;
  
  public o0(f paramf, a parama)
  {
    f = paramf;
    a = parama;
  }
  
  public final l0 a(int paramInt)
  {
    l0 locall01 = (l0)b.get(Integer.valueOf(paramInt));
    l0 locall02 = locall01;
    if (locall01 == null)
    {
      locall02 = new l0();
      b.put(Integer.valueOf(paramInt), locall02);
    }
    return locall02;
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool;
    if (c(paramInt) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final m1 c(int paramInt)
  {
    Object localObject = (l0)b.get(Integer.valueOf(paramInt));
    if (localObject != null)
    {
      int i;
      if (a != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return null;
      }
    }
    localObject = (m1)a).f.get(Integer.valueOf(paramInt));
    return (m1)localObject;
  }
  
  public final void d(int paramInt, i parami, m paramm)
  {
    if (!b(paramInt)) {
      return;
    }
    Object localObject1 = a(paramInt);
    if (a).b.d(paramInt).contains(parami))
    {
      localObject2 = i.a.a;
      c = true;
      b.put(parami, localObject2);
    }
    else
    {
      c = true;
      b.remove(parami);
    }
    localObject1 = (Set)d.get(parami);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new HashSet();
      d.put(parami, localObject2);
    }
    ((Set)localObject2).add(Integer.valueOf(paramInt));
    if (paramm != null) {
      c.put(parami, paramm);
    }
  }
  
  public final void e(int paramInt)
  {
    Object localObject = b.get(Integer.valueOf(paramInt));
    boolean bool = true;
    if (localObject != null)
    {
      int i;
      if (b.get(Integer.valueOf(paramInt))).a != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {}
    }
    else
    {
      bool = false;
    }
    b.Z("Should only reset active targets", bool, new Object[0]);
    b.put(Integer.valueOf(paramInt), new l0());
    localObject = a).b.d(paramInt).iterator();
    for (;;)
    {
      e.a locala = (e.a)localObject;
      if (!locala.hasNext()) {
        break;
      }
      d(paramInt, (i)locala.next(), null);
    }
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     m9.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */