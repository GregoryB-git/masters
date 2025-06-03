package e7;

import d2.q;
import m6.j;
import r.h;

public final class u
  implements Runnable
{
  public final void run()
  {
    Object localObject4;
    switch (a)
    {
    default: 
      break;
    case 0: 
      localObject1 = d;
      localObject2 = b;
      l1 = c;
      ((o0)localObject1).l();
      j.e((String)localObject2);
      localObject3 = (Integer)d.getOrDefault(localObject2, null);
      if (localObject3 != null)
      {
        localObject4 = ((o0)localObject1).p().v(false);
        int i = ((Integer)localObject3).intValue() - 1;
        if (i == 0)
        {
          d.remove(localObject2);
          localObject3 = (Long)c.getOrDefault(localObject2, null);
          long l2;
          if (localObject3 == null)
          {
            zzjo.b("First ad unit exposure time was never set");
          }
          else
          {
            l2 = ((Long)localObject3).longValue();
            c.remove(localObject2);
            ((a)localObject1).v((String)localObject2, l1 - l2, (q4)localObject4);
          }
          if (d.isEmpty())
          {
            l2 = e;
            if (l2 == 0L)
            {
              zzjo.b("First ad exposure time was never set");
            }
            else
            {
              ((a)localObject1).t(l1 - l2, (q4)localObject4);
              e = 0L;
            }
          }
        }
        else
        {
          d.put(localObject2, Integer.valueOf(i));
        }
      }
      else
      {
        zzjo.c("Call to endAdUnitExposure for unknown ad unit id", localObject2);
      }
      return;
    }
    Object localObject2 = d;
    Object localObject1 = b;
    long l1 = c;
    ((o0)localObject2).l();
    j.e((String)localObject1);
    if (d.isEmpty()) {
      e = l1;
    }
    Object localObject3 = (Integer)d.getOrDefault(localObject1, null);
    if (localObject3 != null)
    {
      localObject4 = d;
      localObject2 = Integer.valueOf(((Integer)localObject3).intValue() + 1);
    }
    else
    {
      localObject4 = d;
      if (c >= 100)
      {
        zzjr.b("Too many ads visible");
        return;
      }
      ((h)localObject4).put(localObject1, Integer.valueOf(1));
      localObject4 = c;
      localObject2 = Long.valueOf(l1);
    }
    ((h)localObject4).put(localObject1, localObject2);
  }
}

/* Location:
 * Qualified Name:     e7.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */