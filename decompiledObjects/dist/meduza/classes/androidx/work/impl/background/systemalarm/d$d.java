package androidx.work.impl.background.systemalarm;

import a3.b;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import o2.j;
import y2.r;

public final class d$d
  implements Runnable
{
  public final d a;
  
  public d$d(d paramd)
  {
    a = paramd;
  }
  
  public final void run()
  {
    d locald = a;
    locald.getClass();
    ??? = j.d();
    Object localObject2 = d.t;
    ((j)???).a((String)localObject2, "Checking if commands are complete.");
    d.c();
    synchronized (o)
    {
      if (p != null)
      {
        localObject6 = j.d();
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>();
        ((StringBuilder)???).append("Removing command ");
        ((StringBuilder)???).append(p);
        ((j)localObject6).a((String)localObject2, ((StringBuilder)???).toString());
        if (((Intent)o.remove(0)).equals(p))
        {
          p = null;
        }
        else
        {
          localObject2 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject2).<init>("Dequeue-d command is not the first.");
          throw ((Throwable)localObject2);
        }
      }
      Object localObject6 = b.c();
      a locala = f;
      synchronized (c)
      {
        boolean bool = b.isEmpty();
        if ((!(bool ^ true)) && (o.isEmpty())) {
          synchronized (d)
          {
            bool = a.isEmpty();
            if (!(bool ^ true))
            {
              j.d().a((String)localObject2, "No more commands & intents.");
              localObject2 = q;
              if (localObject2 == null) {
                break label262;
              }
              ((SystemAlarmService)localObject2).a();
            }
          }
        }
        if (!o.isEmpty()) {
          locald.d();
        }
        label262:
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */