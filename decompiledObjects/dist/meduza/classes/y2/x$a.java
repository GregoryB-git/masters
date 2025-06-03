package y2;

import a3.b;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import o2.j;
import s7.e;
import x2.s;
import z2.a;
import z2.a.b;
import z2.c;

public final class x$a
  implements Runnable
{
  public final void run()
  {
    if ((b.a.a instanceof a.b)) {
      return;
    }
    try
    {
      Object localObject1 = (o2.d)a.get();
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = j.d();
        Object localObject3 = x.o;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append("Updating notification for ");
        ((StringBuilder)localObject4).append(b.c.c);
        ((j)localObject2).a((String)localObject3, ((StringBuilder)localObject4).toString());
        localObject4 = b;
        localObject2 = a;
        Object localObject5 = e;
        localObject3 = b;
        localObject4 = d.b.a;
        z localz = (z)localObject5;
        localz.getClass();
        localObject5 = new z2/c;
        ((c)localObject5).<init>();
        b localb = a;
        y localy = new y2/y;
        localy.<init>(localz, (c)localObject5, (UUID)localObject4, (o2.d)localObject1, (Context)localObject3);
        localb.d(localy);
        ((c)localObject2).k((e)localObject5);
      }
      else
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Worker was marked important (");
        ((StringBuilder)localObject1).append(b.c.c);
        ((StringBuilder)localObject1).append(") but did not provide ForegroundInfo");
        localObject2 = ((StringBuilder)localObject1).toString();
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      b.a.j(localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     y2.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */