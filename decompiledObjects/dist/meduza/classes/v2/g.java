package v2;

import a3.b;
import a3.c.a;
import android.content.Context;
import ec.i;
import java.util.LinkedHashSet;
import rb.h;
import sb.q;
import t2.a;
import x0.f;

public abstract class g<T>
{
  public final b a;
  public final Context b;
  public final Object c;
  public final LinkedHashSet<a<T>> d;
  public T e;
  
  public g(Context paramContext, b paramb)
  {
    a = paramb;
    paramContext = paramContext.getApplicationContext();
    i.d(paramContext, "context.applicationContext");
    b = paramContext;
    c = new Object();
    d = new LinkedHashSet();
  }
  
  public abstract T a();
  
  public final void b(T paramT)
  {
    synchronized (c)
    {
      Object localObject2 = e;
      if (localObject2 != null)
      {
        boolean bool = i.a(localObject2, paramT);
        if (bool) {
          return;
        }
      }
      e = paramT;
      localObject2 = q.u(d);
      paramT = a.b();
      f localf = new x0/f;
      localf.<init>(2, localObject2, this);
      paramT.execute(localf);
      paramT = h.a;
      return;
    }
  }
  
  public abstract void c();
  
  public abstract void d();
}

/* Location:
 * Qualified Name:     v2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */