package a4;

import android.net.Uri;
import g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.UUID;
import o7.r;
import o7.x;
import r7.a;
import t5.s.a;
import v3.o0;
import v3.o0.d;
import v3.o0.f;
import v5.e0;

public final class c
  implements i
{
  public final Object a = new Object();
  public o0.d b;
  public b c;
  
  public static b b(o0.d paramd)
  {
    Object localObject1 = new s.a();
    b = null;
    ??? = b;
    if (??? == null) {
      ??? = null;
    } else {
      ??? = ((Uri)???).toString();
    }
    t localt = new t((String)???, f, (s.a)localObject1);
    Object localObject3 = c;
    localObject1 = a;
    ??? = localObject1;
    if (localObject1 == null)
    {
      ??? = ((o7.u)localObject3).c();
      a = ((x)???);
    }
    localObject1 = ((r)???).n();
    while (((Iterator)localObject1).hasNext())
    {
      ??? = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)???).getKey();
      localObject4 = (String)((Map.Entry)???).getValue();
      localObject3.getClass();
      localObject4.getClass();
      synchronized (d)
      {
        d.put(localObject3, localObject4);
      }
    }
    ??? = new HashMap();
    localObject1 = v3.h.a;
    localObject3 = new t5.u();
    Object localObject4 = a;
    g localg = s.d;
    localObject4.getClass();
    boolean bool1 = d;
    boolean bool2 = e;
    for (int k : a.F(g))
    {
      boolean bool3 = true;
      boolean bool4 = bool3;
      if (k != 2) {
        if (k == 1) {
          bool4 = bool3;
        } else {
          bool4 = false;
        }
      }
      x6.b.q(bool4);
    }
    ??? = new b((UUID)localObject4, localg, localt, (HashMap)???, bool1, (int[])((int[])localObject1).clone(), bool2, (t5.u)localObject3, 300000L);
    paramd = h;
    if (paramd != null) {
      paramd = Arrays.copyOf(paramd, paramd.length);
    } else {
      paramd = null;
    }
    x6.b.H(m.isEmpty());
    v = 0;
    w = paramd;
    return (b)???;
  }
  
  public final h a(o0 arg1)
  {
    b.getClass();
    Object localObject1 = b.c;
    if ((localObject1 != null) && (e0.a >= 18)) {
      synchronized (a)
      {
        if (!e0.a(localObject1, b))
        {
          b = ((o0.d)localObject1);
          c = b((o0.d)localObject1);
        }
        localObject1 = c;
        localObject1.getClass();
        return (h)localObject1;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     a4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */