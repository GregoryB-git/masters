package y2;

import a3.b;
import a3.c.a;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.WorkerParameters;
import java.util.UUID;
import o2.j;
import x0.f;
import x2.s;
import z2.a;
import z2.a.b;
import z2.c;

public final class x
  implements Runnable
{
  public static final String o = j.f("WorkForegroundRunnable");
  public final c<Void> a = new c();
  public final Context b;
  public final s c;
  public final androidx.work.d d;
  public final o2.e e;
  public final b f;
  
  public x(Context paramContext, s params, androidx.work.d paramd, o2.e parame, b paramb)
  {
    b = paramContext;
    c = params;
    d = paramd;
    e = parame;
    f = paramb;
  }
  
  public final void run()
  {
    if ((c.q) && (Build.VERSION.SDK_INT < 31))
    {
      final c localc = new c();
      f.b().execute(new f(3, this, localc));
      localc.f(new a(localc), f.b());
      return;
    }
    a.i(null);
  }
  
  public final class a
    implements Runnable
  {
    public final void run()
    {
      if ((localca instanceof a.b)) {
        return;
      }
      try
      {
        Object localObject1 = (o2.d)localc.get();
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
          localObject2 = localc;
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
          ((c)localObject2).k((s7.e)localObject5);
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
        localc.j(localThrowable);
      }
    }
  }
}

/* Location:
 * Qualified Name:     y2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */