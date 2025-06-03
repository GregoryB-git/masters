package nb;

import eb.d;
import gb.o3;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import o7.a;
import o7.t;
import o7.t.a;

public final class i$d
  implements Runnable
{
  public i.f a;
  public d b;
  
  public i$d(i parami, i.f paramf, d paramd)
  {
    a = paramf;
    b = paramd;
  }
  
  public final void run()
  {
    Object localObject1 = c;
    l = Long.valueOf(i.a());
    localObject1 = c.f.a.values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (i.a)((Iterator)localObject1).next();
      localObject3 = c;
      a.set(0L);
      b.set(0L);
      localObject3 = b;
      b = c;
      c = ((i.a.a)localObject3);
    }
    Object localObject2 = a;
    localObject1 = b;
    Object localObject3 = t.b;
    localObject3 = new t.a();
    if (e != null) {
      ((t.a)localObject3).c(new i.j((i.f)localObject2, (d)localObject1));
    }
    if (f != null) {
      ((t.a)localObject3).c(new i.e((i.f)localObject2, (d)localObject1));
    }
    localObject2 = ((t.a)localObject3).e().r(0);
    while (((a)localObject2).hasNext())
    {
      localObject1 = (i.i)((a)localObject2).next();
      localObject3 = c;
      ((i.i)localObject1).a(f, l.longValue());
    }
    localObject1 = c;
    localObject2 = f;
    localObject1 = l;
    localObject3 = a.values().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (i.a)((Iterator)localObject3).next();
      int i;
      if (!((i.a)localObject2).d())
      {
        i = e;
        if (i == 0) {
          i = 0;
        } else {
          i--;
        }
        e = i;
      }
      if (((i.a)localObject2).d())
      {
        long l1 = ((Long)localObject1).longValue();
        long l2 = Math.max(a.b.longValue(), a.c.longValue());
        long l3 = d.longValue();
        if (l1 > Math.min(a.b.longValue() * e, l2) + l3) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          ((i.a)localObject2).e();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */