package s3;

import E2.l;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;
import z2.c;
import z2.c.a;

public class e$b
  implements c.a
{
  public static AtomicReference a = new AtomicReference();
  
  public static void c(Context paramContext)
  {
    if ((l.a()) && ((paramContext.getApplicationContext() instanceof Application)))
    {
      paramContext = (Application)paramContext.getApplicationContext();
      if (a.get() == null)
      {
        b localb = new b();
        if (f.a(a, null, localb))
        {
          c.c(paramContext);
          c.b().a(localb);
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized ()
    {
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(e.l.values());
      Iterator localIterator = ((ArrayList)localObject2).iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject2 = (e)localIterator.next();
      } while (!e.e((e)localObject2).get());
      e.f((e)localObject2, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     s3.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */